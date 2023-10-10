package org.example.config;

import org.example.driver.Driver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private  static Properties properties;

    static {
        try{
            String path = "C:\\SummerSDET2023\\UI\\src\\main\\resources\\config.properties";
            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key).trim();
    }
    public static void main(String[]args){
        System.out.println(getProperty("browser"));
    }


}
