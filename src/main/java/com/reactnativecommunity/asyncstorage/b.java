package com.reactnativecommunity.asyncstorage;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    static WritableMap a(String str) {
        return b(str, "Database Error");
    }

    static WritableMap b(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str2);
        if (str != null) {
            writableMapCreateMap.putString(Action.KEY_ATTRIBUTE, str);
        }
        return writableMapCreateMap;
    }

    static WritableMap c(String str) {
        return b(str, "Invalid key");
    }

    static WritableMap d(String str) {
        return b(str, "Invalid Value");
    }
}
