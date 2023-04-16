package StepsForSelenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    //HOOKS
    @Before ("@addition_test")
    public void beforeHook(){
        System.out.println("This hook runs before all");
    }

    @After
    public void afterHook(){
        System.out.println("hook runs after all");
    }
}
