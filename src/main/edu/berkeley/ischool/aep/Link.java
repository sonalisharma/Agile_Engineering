package edu.berkeley.ischool.aep;

import java.util.HashSet;

/**
 * Created by sonali on 4/25/14.
 */
public class Link {
    private Node to;
    private int cost;

    public Link(Node to, int cost)
    {
        this.to = to;
        this.cost = cost;
    }


    public int hopsTo(Node node, HashSet<Node> visited) {
        return to.hopsTo(node,visited);
    }
}
