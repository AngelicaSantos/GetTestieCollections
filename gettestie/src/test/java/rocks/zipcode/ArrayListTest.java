package gettestie.src.test.java.rocks.zipcode;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest {

    @Test
    public void addTest() {
        //Given:
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 12; i++) {
            linkedList.add(i);
        }

        //When:
        arrayList.addAll(linkedList);


        //Then:

        for (int i = 0; i < linkedList.size(); i++) {

            Assert.assertTrue(arrayList.contains(i));
        }
    }


    @Test
    public void removeTest() {
        //Given:
        ArrayList<Integer> arraylist = new ArrayList<>();
        LinkedList<Integer> linkedlist = new LinkedList<>();

        //When:
        for (int i =0; i<12; i++) {
            linkedlist.remove(i);
        }
       linkedlist.remove(7);

        //Then:
        Assert.assertFalse(linkedlist.contains(7));
    }









}
