package com.plaid.internal;

import android.app.Application;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class Q {
    public static final String a(Application application) {
        p013kotlin.jvm.internal.s.k(application, "<this>");
        String str = String.format("intent://redirect/#Intent;scheme=plaid;package=%s;end;", Arrays.copyOf(new Object[]{application.getApplicationContext().getPackageName()}, 1));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        return str;
    }
}
