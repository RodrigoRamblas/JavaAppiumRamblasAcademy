package org.example;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class Appium {
    public static void main(String[] args) {
        // Configurar as capacidades desejadas (Desired Capabilities)
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "RQ8N90DB22E"); // Substitua pelo nome do seu dispositivo Android
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

        // Inicializar o driver do Appium
        try {
            URL appiumServerURL = new URL("http://localhost:4723/wd/hub"); // Substitua pela URL correta do servidor do Appium
            AndroidDriver<?> driver = new AndroidDriver<>(appiumServerURL, capabilities);

            // Aguardar um tempo para visualização
            Thread.sleep(5000);
            driver.findElementById("com.amazon.mShop.android.shopping:id/sign_in_button").click();
            // Fechar o driver
            driver.quit();
        } catch (MalformedURLException e) {
            System.out.println("URL inválida: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Interrupção do thread: " + e.getMessage());
        }
    }
}