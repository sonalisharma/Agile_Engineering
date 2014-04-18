package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 4/11/14.
 */
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;


public class NodeTest {

    Node a = new Node();
    Node b = new Node();
    Node c = new Node();
    Node d = new Node();
    Node e = new Node();
    Node f = new Node();
    Node g = new Node();
    Node h = new Node();
    Node i = new Node();

    public NodeTest()
    {
        a.addChild(f);
        b.addChild(c);
        b.addChild(a);
        c.addChild(e);
        c.addChild(e);
        c.addChild(d);
        d.addChild(e);
        e.addChild(b);
        h.addChild(b);

    }

    @Test
    public void nodeShouldReachSelf()
    {

        Node node = new Node();
        assertTrue(node.canReach(node));
    }

    @Test
    public void nodeAShouldbeConnectToB()
    {

        a.addChild(b);
        assertTrue(a.canReach(b));
    }

    @Test
    public void nodeAShouldReachNodeC()
    {
        a.addChild(b);
        b.addChild(c);
        assertTrue(a.canReach(c));

    }

    @Test
    public void nodeShouldNotBeAbleToReachUnreachableNode()
    {
        assertFalse(b.canReach(g));
    }


    @Test
    public void nodeShouldBeAbleToReachFurthestNode()
    {
        assertTrue(h.canReach(e));
    }






}
