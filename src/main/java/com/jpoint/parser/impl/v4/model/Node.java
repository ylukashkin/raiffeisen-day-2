package com.jpoint.parser.impl.v4.model;

public class Node {
    private final Node left;
    private final Node right;
    private final Integer number;
    private final Value value;

    public Node(Node left, Node right, Value value) {
        this(left, right, value, null);
    }

    public Node(Integer number) {
        this(null, null, null, number);
    }

    private Node(Node left, Node right, Value value, Integer number) {
        this.left = left;
        this.right = right;
        this.number = number;
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Integer getNumber() {
        return number;
    }

    public Value getValue() {
        return value;
    }

    public Node getNext(int position, Node node) {
        if (node.getValue() == null) {
            return null;
        }
        return node.getValue().getLine().charAt(position * 3 - 3 + node.getValue().getX()) == node.getValue().getSymbol()
                ? node.getLeft()
                : node.getRight()
        ;
    }

    public static class Value {
        private final String line;
        private final int x;
        private final char symbol;

        public Value(int x, char symbol, String line) {
            this.x = x;
            this.line = line;
            this.symbol = symbol;
        }

        public int getX() {
            return x;
        }

        public String getLine() {
            return line;
        }

        public char getSymbol() {
            return symbol;
        }
    }
}
