package edu.berkeley.ischool.aep;

import java.util.HashSet;

/**
 * Created by sonali on 4/25/14.
 */
public class Link {
    private Node to;
    int cost;

    public Link(Node to, int cost)
    {
        this.to = to;
        this.cost = cost;
    }


    public int hopsTo(Node node, HashSet<Node> visited) {
        int hops =  to.hopsTo(node,visited);
        return hops == Node.NO_PATH ? Node.NO_PATH : 1 + hops;
    }

    public int costTo(Node node, HashSet<Node> visited) {
        int cost =  to.costTo(node,visited);
        return cost == Node.NO_PATH ? Node.NO_PATH : this.cost + cost;
    }

}
