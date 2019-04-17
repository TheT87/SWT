package test;


import einwohner.Leibeigener;
import junit.framework.TestCase;

public class TestLeibeigener extends TestCase {
    private Leibeigener leibeigener;
    public void setup(){
        leibeigener  = new Leibeigener();
    }

    public void testL1(){
        leibeigener.setEinkommen(32);
        assertEquals(2,leibeigener.steuer());
    }

    public void teardown(){

    }
}
