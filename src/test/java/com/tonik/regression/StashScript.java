package com.tonik.regression;

import org.testng.annotations.Test;

import static com.utility.Utilities.softAssert;

public class StashScript extends BaseTest {

//    @Test(priority = 1)
    public void TBD_ST_003() throws Exception {
        try {
            stashModule.verifyIfUserCanCreateSoloStash_TBD_PST_003();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }


//    @Test(priority = 2)
    public void TBD_ST_004() throws Exception {
        try {
            stashModule.verifyIfUserCanSetInitialSavingWhileCreatingTheStash_TBD_PST_004();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 5)
    public void TBD_ST_005() throws Exception {
        try {
            stashModule.verifyIfUserCanAddFundsToSoloStashFromTheListDetailsScreen_TBD_PST_005();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 6)
    public void TBD_ST_006() throws Exception {
        try {
            stashModule.verifyIfUserCanManageTheSoloStashFromTheListDetailsScreen_TBD_PST_006();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 7)
    public void TBD_ST_007() throws Exception {
        try {
            stashModule.verifyIfUserCanAddFundsToSoloStashFromTheSummaryDetailsScreen_TBD_PST_007();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 9)
    public void TBD_ST_009() throws Exception {
        try {
            stashModule.verifyIfUserCanAddMoneyAboveTheTargetAmount_TBD_PST_009();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 10)
    public void TBD_ST_010() throws Exception {
        try {
            stashModule.verifyIfUserCanManageTheSoloStashFromTheSummaryDetailsScreen_TBD_PST_010();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 11)
    public void TBD_ST_011() throws Exception {
        try {
            stashModule.verifyIfUserCanViewTheSoloStashDetails_TBD_PST_011();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 12)
    public void TBD_ST_012() throws Exception {
        try {
            stashModule.verifyIfUserCanChangeTheNameModifyThePictureOfTheSoloStash_TBD_PST_012();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 13)
    public void TBD_ST_013() throws Exception {
        try {
            stashModule.verifyTheCharactersLimitForSoloStashName_TBD_PST_013();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }


//    @Test(priority = 14)
    public void TBD_ST_014() throws Exception {
        try {
            stashModule.verifyIfUserCanModifyTheTargetAmountOfTheSoloStash_TBD_PST_014();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 15)
    public void TBD_ST_015() throws Exception {
        try {
            stashModule.verifyIfUserCanModifyTheTargetAmountInSoloStashValidation_TBD_PST_015();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }


//    @Test(priority = 16)
    public void TBD_ST_016() throws Exception {
        try {
            stashModule.verifyIfUserCanWithdrawTheAmountFromSoloStash_TBD_PST_016();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 17)
    public void TBD_ST_017() throws Exception {
        try {
            stashModule.verifyIfTSABalanceIsCreditedTwiceIfConfirmButtonClickedTwice_TBD_PST_017();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 18)
    public void TBD_ST_018() throws Exception {
        try {
            stashModule.verifyIfUserCanWithdrawAmountFromSoloStashInsufficientBalance_TBD_PST_018();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

    @Test(priority = 19)
    public void TBD_ST_019() throws Exception {
        try {
            stashModule.verifyIfUserCanCloseTheSoloStash_TBD_PST_019();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

}
