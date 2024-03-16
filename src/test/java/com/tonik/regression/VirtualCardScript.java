package com.tonik.regression;

import org.testng.annotations.Test;

import static com.utility.Utilities.softAssert;

public class VirtualCardScript extends BaseTest{


//    @Test(priority = 1)
    public void VerifyTheUserCanAccessVirtualCardTileIfTSAIsNotCreated_TBD_VC_001() throws Exception {
        try {
            virtualCardModule.VerifyTheUserCanAccessVirtualCardTileIfTSAIsNotCreated_TBD_VC_001();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }


//    @Test(priority = 2)
    public void VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated_TBD_VC_002() throws Exception {
        try {
            virtualCardModule.VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated_TBD_VC_002();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 3)
    public void VerifyIfUserCanHideUnHideTheDetailsOfTheVirtualCard_TBD_VC_003() throws Exception {
        try {
            virtualCardModule.VerifyIfUserCanHideUnHideTheDetailsOfTheVirtualCard_TBD_VC_003();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }
//        @Test(priority = 4)
    public void VerifyIfUserCanLockUnlockTheVirtualCard_TBD_VC_004() throws Exception {
        try {
            virtualCardModule.VerifyIfUserCanLockUnlockTheVirtualCard_TBD_VC_004();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 5)
    public void VerifyIfUserCanBlockTheVirtualCardFromOnlinePayments_TBD_VC_005() throws Exception {
        try {
            virtualCardModule.VerifyIfUserCanBlockTheVirtualCardFromOnlinePayments_TBD_VC_005();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

    @Test(priority = 6)
    public void VerifyIfUserCanChangeTheVirtualCardsDailyOnlineAndPhysicalPaymentLimit_TBD_VC_006() throws Exception {
        try {
            virtualCardModule.VerifyIfUserCanChangeTheVirtualCardsDailyOnlineAndPhysicalPaymentLimit_TBD_VC_006();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }


    @Test(priority = 7)
    public void VerifyIfUsersMaximumCardLimitIsUntil₱250_000IfUserIsSKYC_TBD_VC_011() throws Exception {
        try {
            virtualCardModule.VerifyIfUsersMaximumCardLimitIsUntil₱250_000IfUserIsSKYC_TBD_VC_011();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }

//    @Test(priority = 8)
    public void VerifyIfUsersMaximumCardLimitIsOnlyUntil₱40000IfUserIsBKYC_TBD_VC_010() throws Exception {
        try {
            virtualCardModule.VerifyIfUsersMaximumCardLimitIsOnlyUntil₱40000IfUserIsBKYC_TBD_VC_010();
        } catch (AssertionError e) {
            throw e;
        } finally {
            softAssert.assertAll();
        }
    }
}
