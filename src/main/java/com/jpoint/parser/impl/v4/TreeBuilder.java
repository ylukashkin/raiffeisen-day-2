package com.jpoint.parser.impl.v4;

import com.jpoint.parser.common.model.InnData;
import com.jpoint.parser.impl.v4.model.Node;
import com.jpoint.parser.impl.v4.model.Tree;


public class TreeBuilder {
    public static Tree build(InnData inn) {
        Node head  = new Node(
                new Node(
                        new Node(
                                new Node(
                                        new Node(new Node(8), new Node(0), new Node.Value(1, '_', inn.getMiddle())),
                                        new Node(9),
                                        new Node.Value(0, '|', inn.getBottom())
                                ),
                                new Node(
                                        new Node(new Node(2), new Node(3), new Node.Value(0, '|', inn.getBottom())),
                                        new Node(7),
                                        new Node.Value(1, '_', inn.getMiddle())
                                ),
                                new Node.Value(0, '|', inn.getMiddle())
                        ),
                        new Node(new Node(6), new Node(5), new Node.Value(0, '|', inn.getBottom())),
                        new Node.Value(2, '|', inn.getMiddle())
                ),
                new Node(new Node(4), new Node(1), new Node.Value(0, '|', inn.getMiddle())),
                new Node.Value(1, '_', inn.getTop())
        );
        return new Tree(head);
    }
}
