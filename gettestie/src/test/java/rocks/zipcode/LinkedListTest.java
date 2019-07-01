package gettestie.src.test.java.rocks.zipcode;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {
    @Test
    public void pollTest() {
        Queue<String> queue = new LinkedList<>();

        Assert.assertNull(queue.poll());
    }

    @Test
    public void addAndPollTest() {
        Queue<String> queue = new LinkedList<>();

        queue.add("angie");
        queue.add("steph");
        queue.add("kevin");

        Assert.assertEquals("angie",queue.poll());
        Assert.assertEquals("steph",queue.poll());
        Assert.assertEquals("kevin",queue.poll());

        Assert.assertNull(queue.poll());
    }
}
