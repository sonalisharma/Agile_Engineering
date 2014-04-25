package edu.berkeley.ischool.aep;

import java.util.*;

/**
 * Created by sonali on 4/11/14.
 */
public class Node {
    List<Node> children = new ArrayList<Node>();

    private static int NO_PATH = Integer.MAX_VALUE;
    public boolean canReach(Node to)
    {
        return canReach(to, new HashSet<Node>());
    }

    private boolean canReach(Node n, HashSet<Node> visitedNodes) {

        if(this ==n)
        {
            return true;
        }
        if(!visitedNodes.add(this)) return false;

        for (Node node: children)
        {
            if(node.canReach(n, visitedNodes))
            {
                return true;
            }
        }
        return false;

    }

    public int hopsTo(Node to) {

        int hops = hopsTo(to, new HashSet<Node>());
        if(hops == NO_PATH) throw new unReachableException();
        return hops;

    }

    private int hopsTo(Node node, Set<Node> visited)
    {
        if (!visited.add(this)) return NO_PATH;
        if (node.equals(this)) return 0;
        int minChildHops = Integer.MAX_VALUE;
        for (Node child : children) {
            int childHops = child.hopsTo(node, new HashSet<Node>(visited));
            if (childHops < minChildHops) {
                minChildHops = 1 + childHops;
            }
        }
        return minChildHops;
    }


    /*private boolean canReach(Node node, Set<Node>) {
        if (node==this)
            return true;

        if(child.contains(node)) return true;
        for(Node n: child)
        {
                if(n.canReach(node))
                {
                    return true;
                }
        }
        return false;
    }*/

    public void addChild(Node nodeB) {
        children.add(nodeB);
    }

}
