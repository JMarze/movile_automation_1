package activity.files;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

    public class CreateFileForm {
        public TextBox titleTxtBox = new TextBox(By.id("android:id/text1"));
        public Button okButton = new Button(By.id("android:id/button1"));

    }
