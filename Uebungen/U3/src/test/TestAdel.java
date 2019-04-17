package test;

import einwohner.Adel;
import junit.framework.TestCase;

public class TestAdel extends TestCase {
    private Adel adel;


    @Override
    protected void setUp(){
        adel = new Adel();
    }

    public void A1(){
        adel.setEinkommen(19);
        assertEquals(20,adel.steuer());
    }

    @Override
    protected void tearDown() throws Exception {
        adel = null;
    }
}
