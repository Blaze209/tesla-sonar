package com.tradle.react;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes8.dex */
public class b {
    static WritableMap a(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(Action.KEY_ATTRIBUTE, str);
        writableMapCreateMap.putString("message", str2);
        return writableMapCreateMap;
    }
}
