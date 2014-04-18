package edu.berkeley.ischool.aep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sonali on 4/11/14.
 */
public class Node {
    List<Node> child = new ArrayList<Node>();

    public boolean canReach(Node node) {
        if (node==this)
            return true;

        for(Node n: child)
        {
            if(n.canReach(node))
            {
                return true;
            }
        }
        return false;
    }

    public void addChild(Node nodeB) {
        child.add(nodeB);
    }
}
