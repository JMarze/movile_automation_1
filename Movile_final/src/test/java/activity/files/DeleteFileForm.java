package activity.files;

import appiumControl.Button;
import org.openqa.selenium.By;

public class DeleteFileForm {
        public Button deleteButton = new Button(By.xpath("//android.widget.TextView[@content-desc='Delete']"));
        public Button confirmButton = new Button(By.xpath("//android.widget.Button[@text='OK']"));
    }



