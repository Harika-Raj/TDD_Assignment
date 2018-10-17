package Assignment3;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class RunLengthEncodingTest {
    @Test
    public void encode_b(){
        assertEquals("b1", new RunLength("b").encode());
    }
    @Test
    public void encode_aaa(){
        assertEquals("a3", new RunLength("aaa").encode());
    }
    @Test
    public void encode_empty(){
        assertEquals("", new RunLength("").encode());
    }
    @Test
    public void encode_givendata(){
        assertEquals("a3s3e3d3", new RunLength("aaasssEEEddd").encode());
    }
}
