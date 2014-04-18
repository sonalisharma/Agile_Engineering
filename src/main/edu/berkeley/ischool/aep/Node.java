package edu.berkeley.ischool.aep;

import java.util.*;

/**
 * Created by sonali on 4/11/14.
 */
public class Node {
    List<Node> child = new ArrayList<Node>();


    public boolean canReach(Node to)
    {
        return canReach(to, new HashSet<Node>());
    }

    private boolean canReach(Node n, HashSet<Node> visitedNodes) {
        if(this ==n) return true;
        if(!visitedNodes.add(this)) return false;
        for (Node node: child)
        {
            if(node.canReach(n, visitedNodes)) return true;
        }
        return false;

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
        child.add(nodeB);
    }
}
