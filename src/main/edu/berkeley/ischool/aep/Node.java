package edu.berkeley.ischool.aep;

import java.util.*;

/**
 * Created by sonali on 4/11/14.
 */
public class Node {
    List<Link> children = new ArrayList<Link>();

    private static int NO_PATH = Integer.MAX_VALUE;

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
                minChildHops = 1 + childHops;
            }
        }
        return minChildHops;
    }


    public void addChild(Link child) {
        children.add(child);
    }


}
