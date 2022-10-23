package cleanTest;

import activity.files.DeleteFileForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;
import activity.files.MainScreen;
import activity.files.CreateFileForm;

public class FileTest {

    MainScreen mainScreen = new MainScreen();
    CreateFileForm createFileForm = new CreateFileForm();
    DeleteFileForm deleteFileForm = new DeleteFileForm();

    @Test
    public void verifyCreateNewFile() throws InterruptedException {

        for (int i=1;i<=5;i++) {
            String title = "TEMA_"+i;
            //String title2 = "hola";
            mainScreen.newButton.click();
            mainScreen.newFile();
            createFileForm.titleTxtBox.setText(title);
            createFileForm.okButton.click();
            //verificación
            Assertions.assertTrue(mainScreen.isFileDisplayed(title), "ERROR");
            //Assertions.assertTrue(mainScreen.isFileDisplayed(title2), "ERROR");
        }
        Thread.sleep(2500);

        mainScreen.newButton.click();
        mainScreen.selectFile();

        Thread.sleep(2500);
        deleteFileForm.deleteButton.click();
        Thread.sleep(2500);
        deleteFileForm.confirmButton.click();
        Thread.sleep(2500);
        closeApp();
    }
    public void closeApp(){
        Session.getInstance().closeApp();
    }
}
