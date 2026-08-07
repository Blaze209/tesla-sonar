package com.fourthline.orca.internal;

import android.net.Uri;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3843t6 {
    public static final String a(Uri uri, String productPathSegment) {
        p013kotlin.jvm.internal.s.k(uri, "<this>");
        p013kotlin.jvm.internal.s.k(productPathSegment, "productPathSegment");
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalStateException("FL Developer error. The Deep Link has no path!");
        }
        if (p013kotlin.text.t.h0(path, productPathSegment, false, 2, null)) {
            return path;
        }
        throw new IllegalStateException(("FL Developer error. \"" + productPathSegment + "\" segment is not found in the Deep Link path: " + uri.getPath() + "!").toString());
    }
}
