package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 4/11/14.
 */
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;


public class NodeTest {

    @Test
    public void nodeShouldReachSelf()
    {

        Node node = new Node();
        assertTrue(node.canReach(node));
    }

    @Test
    public void nodeAShouldbeConnectToB()
    {
        Node nodeA = new Node();
        Node nodeB = new Node();
        nodeA.addChild(nodeB);
        assertTrue(nodeA.canReach(nodeB));
    }

    @Test
    public void nodeAShouldReachNodeC()
    {
        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        nodeA.addChild(nodeB);
        nodeB.addChild(nodeC);
        assertTrue(nodeA.canReach(nodeC));

    }

   /* @Test
    public void containsCycle()
    {
        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();
        Node nodeE = new Node();

        nodeB.addChild(nodeC);
        nodeB.addChild(nodeA);
        nodeA.addChild(nodeB);
        nodeC.addChild(nodeE);
        nodeB.addChild(nodeD);

    }*/


}
