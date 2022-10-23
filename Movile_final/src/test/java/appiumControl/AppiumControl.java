package appiumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

public class AppiumControl {
    protected By locator;
    protected WebElement control;

    public AppiumControl(By locator){
        this.locator=locator;
    }


    public void findControl(){
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click(){
        this.findControl();
        this.control.click();
    }

    public String getText(){
        this.findControl();
        return this.control.getText();
    }

    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
