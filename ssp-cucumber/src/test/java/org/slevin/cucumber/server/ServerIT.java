package org.slevin.cucumber.server;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jacky on 18/09/15.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class ServerIT {
}
