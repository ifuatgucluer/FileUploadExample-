import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
    public static void main(String[] args) {
        // Start the WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Go to the website
            driver.get("https://example.com/file-upload");

            // Find the file upload element
            WebElement uploadElement = driver.findElement(By.id("file-upload"));

            // Specify the file path
            String filePath = "path/to/your/file.txt";

            // Upload the file
            uploadElement.sendKeys(filePath);

            // Submit the upload form (if necessary)
            driver.findElement(By.id("submit-button")).click();

            // Check for a success message (as an example)
            WebElement successMessage = driver.findElement(By.id("success-message"));
            if (successMessage.isDisplayed()) {
                System.out.println("File uploaded successfully!");
            } else {
                System.out.println("File upload failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
