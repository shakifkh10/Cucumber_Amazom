package stepdefinitions;

import io.cucumber.java.en.Given;
import wrapper.GenericWrappers;


public class CommonSteps extends GenericWrappers{

GenericWrappers wrapper = new GenericWrappers();
	
@Given("Opening the browser")
public void opening_the_browser() {
	invokeApp("chrome","https://www.amazon.ca/");
	
	
	
	
	
}
	
	
}
