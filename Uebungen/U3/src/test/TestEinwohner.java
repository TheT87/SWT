package test;

import einwohner.Einwohner;
import junit.framework.TestCase;
public class TestEinwohner extends TestCase {

    private Einwohner einwohner;


    protected void setup(){
        einwohner = new Einwohner();
    }

    public void testE1(){
        einwohner.setEinkommen(0);
        assertEquals(1,einwohner.steuer());
    }

    public void testE2(){
        try {
            einwohner.setEinkommen(-100);
        }
        catch (IllegalArgumentException e){
            assertEquals(1, einwohner.steuer());
        }
        catch (Exception e){
            fail("Nicht erwartete Eception");
        }
    }

    public void testE3(){
        einwohner.setEinkommen(20);
        assertEquals(2,einwohner.steuer());
    }

    public void testE4(){
        einwohner.setEinkommen(30);
        assertEquals(3,einwohner.steuer());
    }
    @Override
    protected void tearDown(){

    }



}
