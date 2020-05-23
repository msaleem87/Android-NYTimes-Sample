package com.nytimes.android.utils;

import android.util.Log;

import com.nytimes.android.BuildConfig;

/**
 * The generic log class for application wide logging
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
class Logs {
    private static final boolean ENABLE_LOGS = BuildConfig.DEBUG;

    private Logs() {
    }

    @SuppressWarnings("unused")
    public static void v(String tag, String msg) {
        if (ENABLE_LOGS) {
            Log.v(tag, msg);
        }
    }

    @SuppressWarnings("unused")
    public static void v(String tag, String msg, Exception e) {
        if (ENABLE_LOGS) {
            Log.v(tag, msg, e);
        }
    }

    @SuppressWarnings("unused")
    public static void v(String tag, String msg, OutOfMemoryError e) {
        if (ENABLE_LOGS) {
            Log.v(tag, msg, e);
        }
    }

    @SuppressWarnings("unused")
    public static boolean getIsLogsEnabled() {
        return ENABLE_LOGS;
    }

    @SuppressWarnings("unused")
    public static void reportException(Exception e) {
        if (ENABLE_LOGS) {
            Log.e("Exception", e.toString(), e);
        }
    }
}
