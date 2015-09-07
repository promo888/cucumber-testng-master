package tests;

import com.infra.AbstractCucumberTest;
import com.infra.annotation.Feature;
import com.infra.annotation.Scenario;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 9/6/15
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Feature("login")
public class LoginTest extends AbstractCucumberTest {

    @Test//(threadPoolSize = 5,invocationCount = 3)
    @Scenario("Login with guest account")
    public void loginWithGuestAccount() {
        run();
    }
}