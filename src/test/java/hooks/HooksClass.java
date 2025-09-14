package hooks;

import io.cucumber.java.Before;

public class HooksClass {
@Before("@smoke")
public void beforeHook() {
	
}
@Before("@sanity")
public void beforeHookTwo() {
	
}
}
