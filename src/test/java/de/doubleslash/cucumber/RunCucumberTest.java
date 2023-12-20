package de.doubleslash.cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "false")
@ConfigurationParameter(key = PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME, value = "false")
@ConfigurationParameter(
    key = PLUGIN_PROPERTY_NAME,
    value = "junit:target/junit.xml,summary,json:target/report.json,pretty:target/pretty")
public class RunCucumberTest {
  // This is a setup Class and supposed to be empty
}
