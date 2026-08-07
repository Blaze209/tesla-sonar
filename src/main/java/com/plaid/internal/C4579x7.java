package com.plaid.internal;

import android.webkit.WebResourceResponse;

/* JADX INFO: renamed from: com.plaid.internal.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4579x7 {
    public static final String a(WebResourceResponse webResourceResponse) {
        p013kotlin.jvm.internal.s.k(webResourceResponse, "<this>");
        return "WebResourceResponse{, MimeType='" + webResourceResponse.getMimeType() + "', Encoding='" + webResourceResponse.getEncoding() + "', StatusCode=" + webResourceResponse.getStatusCode() + ", ReasonPhrase='" + webResourceResponse.getReasonPhrase() + "', ResponseHeaders=" + webResourceResponse.getResponseHeaders() + ", data=" + webResourceResponse.getData() + "}";
    }
}
