package com.tonik.regression;

import org.testng.annotations.Test;

import static com.utility.Utilities.softAssert;

public class OnBoardingScripts extends BaseTest{

//    @Test(priority = 1)
    public void TDB_OB_001() throws Exception {
        try {
            onboardingModule.openTonikApp_TBD_OB_001();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 2)
    public void TDB_OB_002() throws Exception {
        try {
            onboardingModule.createTonikAccountUsingInvalidMobileNumber_TBD_OB_002();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 3)
    public void TDB_OB_003() throws Exception {
        try {
            onboardingModule.createTonikAccountUsingValidMobileNumber_TBD_OB_003();
        } catch (AssertionError | Exception e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

    @Test(priority = 4)
    public void TDB_OB_004() throws Exception {
        try {
            onboardingModule.termsAndConditionDataPrivacyStatementValidation_TBD_OB_004();
        } catch (AssertionError | Exception e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }
}
