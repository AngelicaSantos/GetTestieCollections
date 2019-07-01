package gettestie.src.test.java.rocks.zipcode;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void replaceTest() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(26,"Angie");

        String expected = "Angelica";
        hashMap.replace(26,"Angelica");

        Assert.assertEquals(expected,hashMap.get(26));
    }





}
