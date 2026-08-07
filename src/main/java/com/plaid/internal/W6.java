package com.plaid.internal;

import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes6.dex */
public final class W6 {
    public static final String a(SharedPreferences sharedPreferences, String str) {
        p013kotlin.jvm.internal.s.k(sharedPreferences, "<this>");
        p013kotlin.jvm.internal.s.k("plaid_environment", Action.KEY_ATTRIBUTE);
        p013kotlin.jvm.internal.s.k(str, "default");
        String string = sharedPreferences.getString("plaid_environment", str);
        return string == null ? str : string;
    }
}
