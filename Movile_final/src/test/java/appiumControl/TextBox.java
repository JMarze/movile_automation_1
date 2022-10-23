package appiumControl;

import org.openqa.selenium.By;

public class TextBox extends AppiumControl  {
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value){
        this.findControl();
        this.control.clear();
        this.control.sendKeys(value);
    }
}