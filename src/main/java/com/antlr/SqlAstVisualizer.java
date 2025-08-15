package com.antlr;

import com.antlr.oracle11.PlSqlLexer;
import com.antlr.oracle11.PlSqlParser;
import com.antlr.dm8.DmSqlLexer;
import com.antlr.dm8.DmSqlParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.io.*;
import java.nio.file.*;

import java.util.Map;
import java.util.HashMap;

public class SqlAstVisualizer extends JFrame {
    private JTextArea sqlTextArea;
    private JTree astTree;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode rootNode;
    private JButton parseButton;
    private JButton loadFileButton;
    private JComboBox<String> languageComboBox;

    private JButton compareButton;
    private JButton loadFileButton2;
    private JButton parseButton2; // 右侧的解析按钮
    private JTextArea sqlTextArea2;
    private JTree astTree2;
    private DefaultTreeModel treeModel2;
    private DefaultMutableTreeNode rootNode2;
    private JComboBox<String> languageComboBox2;
    private JLabel similarityLabel;

    // 在类的成员变量部分添加
    private Map<DefaultMutableTreeNode, PositionInfo> nodePositionMap1;
    private Map<DefaultMutableTreeNode, PositionInfo> nodePositionMap2;

    // 添加位置信息类
    private static class PositionInfo {
        int startLine;
        int startCharPositionInLine;
        int stopLine;
        int stopCharPositionInLine;

        PositionInfo(int startLine, int startCharPositionInLine, int stopLine, int stopCharPositionInLine) {
            this.startLine = startLine;
            this.startCharPositionInLine = startCharPositionInLine;
            this.stopLine = stopLine;
            this.stopCharPositionInLine = stopCharPositionInLine;
        }
    }



    public SqlAstVisualizer() {
        initializeComponents();
        setupLayout();
        setupEventHandlers();
    }

    // 修改 initializeComponents() 方法
    // 修改 initializeComponents() 方法
    private void initializeComponents() {
        setTitle("PL/SQL AST Visualizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);

        // 初始化位置映射
        nodePositionMap1 = new HashMap<>();
        nodePositionMap2 = new HashMap<>();

        // 第一个SQL输入区域
        sqlTextArea = new JTextArea(15, 60);
        sqlTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        sqlTextArea.setText("BEGIN\n  DBMS_OUTPUT.PUT_LINE('Hello, world!');\nEND;\n/");

        rootNode = new DefaultMutableTreeNode("AST Root");
        treeModel = new DefaultTreeModel(rootNode);
        astTree = new JTree(treeModel);
        astTree.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        // 第二个SQL输入区域
        sqlTextArea2 = new JTextArea(15, 60);
        sqlTextArea2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        sqlTextArea2.setText("BEGIN\n  DBMS_OUTPUT.PUT_LINE('Hello, world!');\nEND;\n/");

        rootNode2 = new DefaultMutableTreeNode("AST Root");
        treeModel2 = new DefaultTreeModel(rootNode2);
        astTree2 = new JTree(treeModel2);
        astTree2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        parseButton = new JButton("Parse SQL");
        parseButton2 = new JButton("Parse SQL"); // 右侧解析按钮
        loadFileButton = new JButton("Load SQL File");
        loadFileButton2 = new JButton("Load SQL File 2");
        compareButton = new JButton("Compare ASTs");

        languageComboBox = new JComboBox<>(new String[]{"Oracle 11", "DM8"});
        languageComboBox2 = new JComboBox<>(new String[]{"Oracle 11", "DM8"});

        similarityLabel = new JLabel("Similarity: N/A");
        similarityLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
    }



    // 修改 setupLayout() 方法
    private void setupLayout() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        // 顶部面板 - 包含两个SQL输入区域
        JPanel topPanel = new JPanel(new GridLayout(1, 2));

        // 第一个SQL输入面板
        JPanel sqlPanel1 = new JPanel(new BorderLayout());
        sqlPanel1.setBorder(BorderFactory.createTitledBorder("SQL Input 1"));
        sqlPanel1.add(new JScrollPane(sqlTextArea), BorderLayout.CENTER);

        JPanel toolbar1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        toolbar1.add(parseButton);
        toolbar1.add(loadFileButton);
        toolbar1.add(new JLabel("SQL Dialect:"));
        toolbar1.add(languageComboBox);
        sqlPanel1.add(toolbar1, BorderLayout.SOUTH);

        // 第二个SQL输入面板
        JPanel sqlPanel2 = new JPanel(new BorderLayout());
        sqlPanel2.setBorder(BorderFactory.createTitledBorder("SQL Input 2"));
        sqlPanel2.add(new JScrollPane(sqlTextArea2), BorderLayout.CENTER);

        JPanel toolbar2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        toolbar2.add(parseButton2); // 添加右侧解析按钮
        toolbar2.add(loadFileButton2);
        toolbar2.add(new JLabel("SQL Dialect:"));
        toolbar2.add(languageComboBox2);
        sqlPanel2.add(toolbar2, BorderLayout.SOUTH);

        topPanel.add(sqlPanel1);
        topPanel.add(sqlPanel2);

        // 中间面板 - 包含比较按钮和相似度显示
        JPanel middlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        middlePanel.add(compareButton);
        middlePanel.add(similarityLabel);

        // 底部面板 - 包含两个AST树
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));

        // 第一个AST树面板
        JPanel astPanel1 = new JPanel(new BorderLayout());
        astPanel1.setBorder(BorderFactory.createTitledBorder("AST Tree 1"));
        astPanel1.add(new JScrollPane(astTree), BorderLayout.CENTER);

        // 第二个AST树面板
        JPanel astPanel2 = new JPanel(new BorderLayout());
        astPanel2.setBorder(BorderFactory.createTitledBorder("AST Tree 2"));
        astPanel2.add(new JScrollPane(astTree2), BorderLayout.CENTER);

        bottomPanel.add(astPanel1);
        bottomPanel.add(astPanel2);

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topPanel, bottomPanel);
        splitPane.setDividerLocation(350);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(splitPane, BorderLayout.CENTER);
        contentPanel.add(middlePanel, BorderLayout.NORTH);

        mainPanel.add(contentPanel, BorderLayout.CENTER);

        add(mainPanel);
    }



    // 修改 setupEventHandlers() 方法
    private void setupEventHandlers() {
        parseButton.addActionListener(e -> parseSql());
        parseButton2.addActionListener(e -> parseSql2()); // 右侧解析按钮事件
        loadFileButton.addActionListener(e -> loadSqlFile());
        loadFileButton2.addActionListener(e -> loadSqlFile2());
        compareButton.addActionListener(e -> compareASTs());

        // 添加树节点选择监听器
        astTree.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) astTree.getLastSelectedPathComponent();
            if (selectedNode != null && nodePositionMap1.containsKey(selectedNode)) {
                PositionInfo pos = nodePositionMap1.get(selectedNode);
                scrollToPosition(sqlTextArea, pos);
            }
        });

        astTree2.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) astTree2.getLastSelectedPathComponent();
            if (selectedNode != null && nodePositionMap2.containsKey(selectedNode)) {
                PositionInfo pos = nodePositionMap2.get(selectedNode);
                scrollToPosition(sqlTextArea2, pos);
            }
        });
    }



    // 添加新方法
    private void loadSqlFile2() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("SQL Files", "sql"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                Path path = fileChooser.getSelectedFile().toPath();
                String content = new String(Files.readAllBytes(path));
                sqlTextArea2.setText(content);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "读取文件失败: " + ex.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // 添加新方法 - 右侧SQL解析
    private void parseSql2() {
        try {
            String sql = sqlTextArea2.getText();
            if (sql.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "请输入SQL语句", "提示", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String selectedLang = (String) languageComboBox2.getSelectedItem();
            ParseTree tree = parseSqlText(sql, selectedLang);
            Parser parser = createParser(sql, selectedLang);

            rootNode2.removeAllChildren();
            nodePositionMap2.clear(); // 清除旧的位置映射
            buildTree(rootNode2, tree, parser, nodePositionMap2); // 传递位置映射
            treeModel2.reload();
            expandAllNodes(astTree2, 0, astTree2.getRowCount());

            JOptionPane.showMessageDialog(this, "SQL解析完成！", "成功", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "解析错误: " + ex.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }


    // 添加新方法
    private void scrollToPosition(JTextArea textArea, PositionInfo pos) {
        try {
            int startLine = pos.startLine;
            int startChar = pos.startCharPositionInLine;
            int endLine = pos.stopLine;
            int endChar = pos.stopCharPositionInLine;

            // 获取行的起始偏移量
            int startOffset = getTextOffset(textArea, startLine, startChar);
            int endOffset = getTextOffset(textArea, endLine, endChar);

            // 选择文本并滚动到可见位置
            textArea.setSelectionStart(startOffset);
            textArea.setSelectionEnd(endOffset);
            textArea.requestFocusInWindow();

            // 确保选中文本可见
            textArea.scrollRectToVisible(textArea.modelToView(startOffset));
        } catch (Exception e) {
            // 忽略位置计算错误
        }
    }

    // 计算文本区域中指定行列位置的偏移量
    private int getTextOffset(JTextArea textArea, int line, int charPosition) {
        try {
            int offset = 0;
            String[] lines = textArea.getText().split("\n", -1);

            // 计算到指定行的偏移量
            for (int i = 0; i < Math.min(line - 1, lines.length); i++) {
                offset += lines[i].length() + 1; // +1 for newline character
            }

            // 加上行内字符位置
            if (line - 1 < lines.length) {
                offset += Math.min(charPosition, lines[line - 1].length());
            }

            return Math.max(0, Math.min(offset, textArea.getText().length()));
        } catch (Exception e) {
            return 0;
        }
    }


    private void compareASTs() {
        try {
            // 解析第一个SQL
            ParseTree tree1 = parseSqlText(sqlTextArea.getText(), (String) languageComboBox.getSelectedItem());
            Parser parser1 = createParser(sqlTextArea.getText(), (String) languageComboBox.getSelectedItem());

            // 解析第二个SQL
            ParseTree tree2 = parseSqlText(sqlTextArea2.getText(), (String) languageComboBox2.getSelectedItem());
            Parser parser2 = createParser(sqlTextArea2.getText(), (String) languageComboBox2.getSelectedItem());

            // 构建AST树
            rootNode.removeAllChildren();
            nodePositionMap1.clear();
            buildTree(rootNode, tree1, parser1, nodePositionMap1);
            treeModel.reload();
            expandAllNodes(astTree, 0, astTree.getRowCount());

            rootNode2.removeAllChildren();
            nodePositionMap2.clear();
            buildTree(rootNode2, tree2, parser2, nodePositionMap2);
            treeModel2.reload();
            expandAllNodes(astTree2, 0, astTree2.getRowCount());

            // 计算相似度
            double similarity = calculateSimilarity(tree1, tree2);
            similarityLabel.setText(String.format("Similarity: %.2f%%", similarity * 100));

            JOptionPane.showMessageDialog(this, "AST比较完成！", "成功", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "比较错误: " + ex.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }


    // 提取公共解析方法
    private ParseTree parseSqlText(String sql, String selectedLang) throws Exception {
        if (sql.trim().isEmpty()) {
            throw new IllegalArgumentException("SQL语句不能为空");
        }

        CharStream input = CharStreams.fromString(sql);

        if ("Oracle 11".equals(selectedLang)) {
            PlSqlLexer lexer = new PlSqlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PlSqlParser parser = new PlSqlParser(tokens);
            return parser.sql_script();
        } else if ("DM8".equals(selectedLang)) {
            DmSqlLexer lexer = new DmSqlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DmSqlParser parser = new DmSqlParser(tokens);
            return parser.dmprogram();
        } else {
            throw new UnsupportedOperationException("未知语言: " + selectedLang);
        }
    }

    // 提取公共创建解析器方法
    private Parser createParser(String sql, String selectedLang) throws Exception {
        CharStream input = CharStreams.fromString(sql);

        if ("Oracle 11".equals(selectedLang)) {
            PlSqlLexer lexer = new PlSqlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            return new PlSqlParser(tokens);
        } else if ("DM8".equals(selectedLang)) {
            DmSqlLexer lexer = new DmSqlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            return new DmSqlParser(tokens);
        } else {
            throw new UnsupportedOperationException("未知语言: " + selectedLang);
        }
    }


    // AST相似度计算方法
    private double calculateSimilarity(ParseTree tree1, ParseTree tree2) {
        // 先简化两棵树
        ParseTree simplifiedTree1 = simplifyTree(tree1);
        ParseTree simplifiedTree2 = simplifyTree(tree2);

        // 使用简化后的树计算编辑距离
        int distance = treeEditDistance(simplifiedTree1, simplifiedTree2);
        int maxNodes = Math.max(countNodes(simplifiedTree1), countNodes(simplifiedTree2));

        if (maxNodes == 0) return 1.0;

        return 1.0 - (double) distance / maxNodes;
    }

    // 计算树编辑距离
    private int treeEditDistance(ParseTree tree1, ParseTree tree2) {
        if (tree1 == null && tree2 == null) return 0;
        if (tree1 == null) return countNodes(tree2);
        if (tree2 == null) return countNodes(tree1);

        if (tree1.getText().equals(tree2.getText())) {
            // 节点标签相同，比较子节点
            int children1 = tree1.getChildCount();
            int children2 = tree2.getChildCount();

            if (children1 == 0 && children2 == 0) return 0;

            // 简化的编辑距离计算
            int cost = 0;
            for (int i = 0; i < Math.max(children1, children2); i++) {
                ParseTree child1 = i < children1 ? tree1.getChild(i) : null;
                ParseTree child2 = i < children2 ? tree2.getChild(i) : null;
                cost += treeEditDistance(child1, child2);
            }
            return cost;
        } else {
            // 节点标签不同，需要替换操作
            int children1 = tree1.getChildCount();
            int children2 = tree2.getChildCount();

            // 计算删除和插入的成本
            int deleteCost = countNodes(tree1);
            int insertCost = countNodes(tree2);

            // 计算替换成本
            int replaceCost = 1;
            for (int i = 0; i < Math.max(children1, children2); i++) {
                ParseTree child1 = i < children1 ? tree1.getChild(i) : null;
                ParseTree child2 = i < children2 ? tree2.getChild(i) : null;
                replaceCost += treeEditDistance(child1, child2);
            }

            return Math.min(Math.min(deleteCost, insertCost), replaceCost);
        }
    }

    // 计算树中节点数量
    private int countNodes(ParseTree tree) {
        if (tree == null) return 0;

        int count = 1;
        for (int i = 0; i < tree.getChildCount(); i++) {
            count += countNodes(tree.getChild(i));
        }
        return count;
    }


        // 重构 parseSql() 方法
    private void parseSql() {
        try {
            String sql = sqlTextArea.getText();
            if (sql.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "请输入SQL语句", "提示", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String selectedLang = (String) languageComboBox.getSelectedItem();
            ParseTree tree = parseSqlText(sql, selectedLang);
            Parser parser = createParser(sql, selectedLang);

            rootNode.removeAllChildren();
            nodePositionMap1.clear(); // 清除旧的位置映射
            buildTree(rootNode, tree, parser, nodePositionMap1); // 传递位置映射
            treeModel.reload();
            expandAllNodes(astTree, 0, astTree.getRowCount());

            JOptionPane.showMessageDialog(this, "SQL解析完成！", "成功", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "解析错误: " + ex.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }



    private void loadSqlFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("SQL Files", "sql"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                Path path = fileChooser.getSelectedFile().toPath();
                String content = new String(Files.readAllBytes(path));
                sqlTextArea.setText(content);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "读取文件失败: " + ex.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void buildTree(DefaultMutableTreeNode parent, ParseTree tree, Parser parser,
                           Map<DefaultMutableTreeNode, PositionInfo> positionMap) {
        if (tree instanceof ParserRuleContext) {
            ParserRuleContext ctx = (ParserRuleContext) tree;
            String ruleName = getRuleName(ctx, parser);
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(ruleName);
            parent.add(node);

            // 保存位置信息
            if (ctx.getStart() != null && ctx.getStop() != null) {
                PositionInfo pos = new PositionInfo(
                        ctx.getStart().getLine(),
                        ctx.getStart().getCharPositionInLine(),
                        ctx.getStop().getLine(),
                        ctx.getStop().getCharPositionInLine() + ctx.getStop().getText().length()
                );
                positionMap.put(node, pos);
            }

            for (int i = 0; i < ctx.getChildCount(); i++) {
                buildTree(node, ctx.getChild(i), parser, positionMap);
            }
        } else {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(tree.getText());
            parent.add(node);

            // 保存终端节点位置信息
            if (tree instanceof TerminalNode) {
                Token symbol = ((TerminalNode) tree).getSymbol();
                if (symbol != null) {
                    PositionInfo pos = new PositionInfo(
                            symbol.getLine(),
                            symbol.getCharPositionInLine(),
                            symbol.getLine(),
                            symbol.getCharPositionInLine() + symbol.getText().length()
                    );
                    positionMap.put(node, pos);
                }
            }
        }
    }



    private String getRuleName(ParserRuleContext ctx, Parser parser) {
        if (parser instanceof PlSqlParser) {
            return PlSqlParser.ruleNames[ctx.getRuleIndex()];
        } else if (parser instanceof DmSqlParser) {
            return DmSqlParser.ruleNames[ctx.getRuleIndex()];
        } else {
            return "UnknownRule";
        }
    }


    private void expandAllNodes(JTree tree, int startingIndex, int rowCount) {
        for (int i = startingIndex; i < rowCount; ++i) {
            tree.expandRow(i);
        }

        if (tree.getRowCount() != rowCount) {
            expandAllNodes(tree, rowCount, tree.getRowCount());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

            new SqlAstVisualizer().setVisible(true);
        });
    }

    /**
     * 简化AST树，移除连续的单子节点，只保留骨架结构
     * @param tree 原始AST树
     * @return 简化后的AST树
     */
    private ParseTree simplifyTree(ParseTree tree) {
        if (tree == null) {
            return null;
        }

        // 如果当前节点只有一个子节点，跳过它并继续简化子节点
        if (tree.getChildCount() == 1) {
            return simplifyTree(tree.getChild(0));
        }

        // 否则创建一个新的简化节点
        SimplifiedParseTree simplifiedNode = new SimplifiedParseTree(tree.getText());

        // 递归处理所有子节点
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree simplifiedChild = simplifyTree(tree.getChild(i));
            if (simplifiedChild != null) {
                simplifiedNode.addChild(simplifiedChild);
            }
        }

        return simplifiedNode;
    }
}

