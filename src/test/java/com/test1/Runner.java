package com.test1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="com.test",dryRun = false)
public class Runner {

}
