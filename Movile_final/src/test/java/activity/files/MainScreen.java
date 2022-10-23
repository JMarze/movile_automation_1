package activity.files;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {

     public Button newButton = new Button(By.xpath("//android.widget.ImageButton[@index='2']"));
    public MainScreen(){}
    public boolean isFileDisplayed (String title){
        Label file = new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return file.isControlDisplayed();
    }
    public void newFile (){
        Label newfile = new Label(By.xpath("//android.widget.TextView[@text= 'New folder']"));
        newfile.click();
    }
    public void selectFile (){
        Label selectfile = new Label(By.xpath("//android.widget.TextView[@text= 'Select all']"));
        selectfile.click();
   }
}
