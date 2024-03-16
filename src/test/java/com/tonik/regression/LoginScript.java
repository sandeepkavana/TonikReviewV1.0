package com.tonik.regression;

import org.testng.annotations.Test;

import static com.utility.Utilities.softAssert;

public class LoginScript extends BaseTest {


    @Test(priority = 1)
    public void verifyUserCanLoginWhenTSAisNotYetCreated_TBD_LG_001() throws Exception {
        try {
            loginModule.verifyUserCanLoginWhenTSAisNotYetCreated_TBD_LG_001();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

    @Test(priority = 2)
    public void verifyUserCanLoginWhenTSAisCreated_TBD_LG_002() throws Exception {
        try {
            loginModule.verifyUserCanLoginWhenTSAisCreated_TBD_LG_002();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

    @Test(priority = 3)
    public void verifyIfUserCanKillTheAppAndRelaunchTheApp_TBD_LG_008() throws Exception {
        try {
            loginModule.verifyIfUserCanKillTheAppAndRelaunchTheApp_TBD_LG_008();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

    @Test(priority = 4)
    public void verifyIfUserCanLogoutFromProfileScreenAndLoginAgain_TBD_LG_009() throws Exception {
        try {
            loginModule.verifyIfUserCanLogoutFromProfileScreenAndLoginAgain_TBD_LG_009();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 5)
    public void verifyIfUserCanAttemptMaximumInvalidPasswordsInLogin_TBD_LG_006() throws Exception {
        try {
            loginModule.verifyIfUserCanAttemptMaximumInvalidPasswordsInLogin_TBD_LG_006();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }




}
