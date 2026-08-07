package com.plaid.internal;

import android.webkit.WebResourceError;

/* JADX INFO: renamed from: com.plaid.internal.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4570w7 {
    public static final String a(WebResourceError webResourceError) {
        p013kotlin.jvm.internal.s.k(webResourceError, "<this>");
        return "WebResourceError { Error Code: " + webResourceError.getErrorCode() + " ; Description: " + ((Object) webResourceError.getDescription()) + " }";
    }
}
