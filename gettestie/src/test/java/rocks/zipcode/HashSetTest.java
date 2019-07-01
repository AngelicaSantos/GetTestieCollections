package gettestie.src.test.java.rocks.zipcode;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.HashSet;
import java.util.List;


public class HashSetTest {



    @Test
public void isSetTest(List<String> hashset) {
    //Given:
    HashSet<String> string = new HashSet<>();

    //When:
    hashset.add("cat");
    hashset.add("dog");
    hashset.add("bird");
    Integer expected = 2;
    Integer actual = hashset.size();

    //Then:
        Assert.assertEquals(expected, actual);

}

@Test
    public void removeFromSet(List<Integer> hashset) {
    //Given:
    HashSet<Integer> num = new HashSet<>();

    //When:
    for(int i=0; i<12; i++) {
        hashset.add(i);
    }
    hashset.remove(7);

    //Then:
        Assert.assertFalse(hashset.contains(7));
    }












}
