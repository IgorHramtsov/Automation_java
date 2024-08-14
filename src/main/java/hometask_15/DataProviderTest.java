package hometask_15;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() {
        return new Object[][]{
                {"user1", "password1"},
                {"user2", "password2"},
                {"user3", "password3"}
        };
    }

    @Test(dataProvider = "loginData", groups = {"groupName4"})
    public void testLogin(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
