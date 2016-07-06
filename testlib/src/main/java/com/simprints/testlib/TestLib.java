package com.simprints.testlib;

public class TestLib {

    public TestLib() {

    }

    public static String getLibraryName() {
        return "TestLib";
    }

    public static int getVersionCode() {
        return BuildConfig.VERSION_CODE;
    }

    public static String getVersionName() {
        return BuildConfig.VERSION_NAME;
    }
}
