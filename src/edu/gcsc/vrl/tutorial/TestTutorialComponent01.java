package edu.gcsc.vrl.tutorial;
	
	import eu.mihosoft.vrl.annotation.ComponentInfo;
	import java.io.Serializable;
	
	@ComponentInfo(name="TestTutorialComponent01", 
	        category="TestTutorialPlugin/01", 
	        description="My Component")
			
	public class TestTutorialComponent01 implements Serializable{
    
    
	    private static final long serialVersionUID = 1L;
    
    
	    public String doSomething() {
	        return "Congratulation! "
	                + "Your new project work!";
	    }
	}
