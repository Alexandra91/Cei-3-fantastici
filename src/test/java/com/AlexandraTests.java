package com;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.annotations.Managed;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.EndUserSteps;

@RunWith(ThucydidesRunner.class)
public class AlexandraTests {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090")
    public Pages pages;

    @Steps
    public EndUserSteps evoportalLogIn;
    
    @Test
    public void logInEvozone(){ 	
    	evoportalLogIn.login_evoportal("alexandra.pandele1","evoportal");
    	evoportalLogIn.clickOnVacation(); 
        }   	
}
