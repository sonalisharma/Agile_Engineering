package edu.berkeley.ischool.aep;

import java.util.*;

/**
 * Created by sonali on 4/11/14.
 */
public class Node {
    List<Link> children = new ArrayList<Link>();

    static int NO_PATH = Integer.MAX_VALUE;

    public boolean canReach(Node to)
    {
        return hopsTo(to) != NO_PATH;
    }

    public int hopsTo(Node to) {

        int hops = hopsTo(to, new HashSet<Node>());
        if(hops == NO_PATH) throw new unReachableException();
        return hops;

    }

    protected int hopsTo(Node node, Set<Node> visited)
    {
        if (!visited.add(this)) return NO_PATH;
        if (node.equals(this)) return 0;
        int minChildHops = Integer.MAX_VALUE;
        for (Link link : children) {
            int childHops = link.hopsTo(node, new HashSet<Node>(visited));
            if (childHops < minChildHops) {
                minChildHops = childHops;
            }
        }
        return minChildHops;
    }


    public void addChild(Link child) {
        children.add(child);
    }


    public int costTo(Node to) {
        int cost = costTo(to, new HashSet<Node>());
        if(cost == NO_PATH) throw new unReachableException();
        return cost;
    }

    int costTo(Node node, Set<Node> visited)
    {
        if (!visited.add(this)) return NO_PATH;
        if (node.equals(this)) return 0;
        int champion = Integer.MAX_VALUE;
        for (Link link : children) {
            int challenger = link.costTo(node, new HashSet<Node>(visited));
            if (challenger < champion) {
                champion = challenger;
            }
        }
        return champion;
    }
}
