package com.kyberservices.argumentation.cucumber;

import com.kyberservices.argumentation.AbstractCassandraTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/features")
public class CucumberIT extends AbstractCassandraTest {}
