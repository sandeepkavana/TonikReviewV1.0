package com.tonik.regression;

import org.testng.annotations.Test;

import static com.utility.Utilities.propertyFileReader;
import static com.utility.Utilities.softAssert;

public class ContactUsScripts extends BaseTest{

    @Test(priority = 1)
    public void contactUsPageUIValidation_TDB_CU_001() throws Exception {
        try {
            contactUsModule.contactUsPageUIValidation_TDB_CU_001();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 2)
//    public void contactUsContactUsingChatWithUsOption_TDB_CU_002() throws Exception {
//        try {
//            contactUsModule.contactUsContactUsingChatWithUsOption_TDB_CU_002();
//        } catch (AssertionError e) {
//            throw e;
//        } finally {
//            softAssert.assertAll();
//        }
//    }
//
//    @Test(priority = 3)
//    public void contactUsContactUsingContactNumberDisplayed_TDB_CU_003() throws Exception {
//        try {
//            contactUsModule.contactUsContactUsingContactNumberDisplayed_TDB_CU_003();
//        } catch (AssertionError e) {
//            throw e;
//        } finally {
//            softAssert.assertAll();
//        }
//    }
//
//    @Test(priority = 4)
//    public void contactUsFrequentlyAskedQuestionsOptionValidation_TDB_CU_011() throws Exception {
//        try {
//            contactUsModule.contactUsFrequentlyAskedQuestionsOptionValidation_TDB_CU_011();
//        } catch (AssertionError e) {
//            throw e;
//        } finally {
//            softAssert.assertAll();
//        }
//    }
//
//    @Test(priority = 5)
//    public void contactUsUserCanAccessCustomerEmailIdValidation_TDB_CU_012() throws Exception {
//        try {
//            contactUsModule.contactUsUserCanAccessCustomerEmailIdValidation_TDB_CU_012();
//        } catch (AssertionError e) {
//            throw e;
//        } finally {
//            softAssert.assertAll();
//        }
//    }
//
//    @Test(priority = 6)
//    public void contactUsPageNavigationFromLogInPageValidation_TDB_CU_013() throws Exception {
//        try {
//            contactUsModule.contactUsPageNavigationFromLogInPageValidation_TDB_CU_013();
//        } catch (AssertionError e) {
//            throw e;
//        } finally {
//            softAssert.assertAll();
//        }
//    }



}
