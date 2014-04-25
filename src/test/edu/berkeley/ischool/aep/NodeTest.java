package edu.berkeley.ischool.aep;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by sonali on 4/11/14.
 */
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
        h.addChild(new Link(b,0));
        b.addChild(new Link(a,0));
        a.addChild(new Link(f,0));
        b.addChild(new Link(c,0));
        c.addChild(new Link(e,0));
        c.addChild(new Link(e,0));
        c.addChild(new Link(d,0));
        d.addChild(new Link(e,0));
        e.addChild(new Link(b,0));


    }

    @Test
    public void nodeShouldReachSelf () {
        Node node = new Node();
        assertTrue(node.canReach(node));
    }

    @Test
    public void nodeShouldBeAbleToReachChild () {
        assertTrue(h.canReach(b));
    }

    @Test
    public void nodeShouldNotBeAbleToReachUnreachableNode() {
        assertFalse(b.canReach(g));
    }

    @Test
    public void nodeShouldBeAbleToReachFurthestNode() {
        assertTrue(h.canReach(e));
    }

    @Test
    public void nodeHShouldBeAbleToReachNodeF() {
        assertTrue(h.canReach(f));
    }

    @Test
    public void hToCShouldBeTwoHops() {
        assertEquals(2, h.hopsTo(c));
    }

    @Test
    public void hToHShouldBeZeroHops() {
        assertEquals(0, h.hopsTo(h));
    }


    @Test
    public void bToEshouldBeTwoHopsNotThree()
    {
        assertEquals(2,b.hopsTo(e));
    }


    @Test
    public void cToEshouldBeOneHopsNotTwo()
    {
        assertEquals(1,c.hopsTo(e));
    }

    @Test
    public void hToEshouldBeThreeHopsNotTwo()
    {
        assertEquals(3, h.hopsTo(e));
    }

    @Test(expected = RuntimeException.class)
    public void hToGshouldBeImpossible()
    {
        assertEquals(3,h.hopsTo(g));
    }



}
