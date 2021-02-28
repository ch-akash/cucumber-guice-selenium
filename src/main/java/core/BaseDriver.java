package main.java.core;

import org.openqa.selenium.WebDriver;

import java.util.Optional;


public interface BaseDriver {
    WebDriver driver();

    void get(String url);

    void quit();

    void close();
}
