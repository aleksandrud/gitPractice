package org.example.driver;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;


public class Driver {

    private Driver() {
        // Singleton patter показывает что этот класс в единственном экземпляре(одиночка)
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "firefox":
                    driver =FirefoxWebDriver.loadFireFoxWebDriver();
                    break;

                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;

                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;

                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.err.println("Error while closing the driver");
        }
    }
}
