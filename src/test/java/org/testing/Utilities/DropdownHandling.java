package org.testing.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
	
	public void selectByVisibleText(WebElement element,String VisibleText) {
		
		Select s=new Select(element);
		s.selectByVisibleText(VisibleText);
		
	}
    public void selectByIndex(WebElement element,String Index) {
		
		Select s=new Select(element);
		s.selectByVisibleText(Index);
		
	}
    public void selectByValue(WebElement element,String Value) {
		
		Select s=new Select(element);
		s.selectByVisibleText(Value);
		
	}

}
