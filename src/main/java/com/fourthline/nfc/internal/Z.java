package com.fourthline.nfc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z {
    public static final W a(org.jmrtd.lds.iso19794.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        String strE = aVar.e();
        p013kotlin.jvm.internal.s.j(strE, "getMimeType(...)");
        InputStream inputStreamC = aVar.c();
        p013kotlin.jvm.internal.s.j(inputStreamC, "getImageInputStream(...)");
        return new Y(strE, inputStreamC);
    }
}
