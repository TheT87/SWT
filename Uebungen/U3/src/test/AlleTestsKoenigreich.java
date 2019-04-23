package test;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

;

public class AlleTestsKoenigreich {
    public static void main(String[] args) {
    }
        public static Test suite(){
            Test suite = new TestSuite("AlleTestsKoenigreich");
            ((TestSuite) suite).addTestSuite(TestEinwohner.class);
            ((TestSuite) suite).addTestSuite(TestAdel.class);
            ((TestSuite) suite).addTestSuite(TestLeibeigener.class);
            return suite;
    }
}


