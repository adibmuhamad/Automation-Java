package objectRepository;

import org.openqa.selenium.By;

public class HomeObject {
    public static By productByName(String name) {
        return By.xpath("//android.widget.ImageView[@content-desc='" + name + "']");
    }
}
