package inheritance.constructor;

import org.junit.Test;

public class Runner {

    @Test
    public void initCarWithoutRegNumber() {
        new Car();
    }
    @Test
    public void test() {
        new Raven();
    }

    @Test
    public void initCarWithRegNumber() {
        new Car("123 ABC");
    }

}



