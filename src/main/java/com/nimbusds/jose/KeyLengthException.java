package com.nimbusds.jose;

import jz.a;

/* JADX INFO: loaded from: classes6.dex */
public class KeyLengthException extends KeyException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f45796b;

    public KeyLengthException(String str) {
        super(str);
        this.f45795a = 0;
        this.f45796b = null;
    }

    public KeyLengthException(int i11, a aVar) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            str = "The expected key length is " + i11 + " bits";
        } else {
            str = "Unexpected key length";
        }
        sb2.append(str);
        if (aVar != null) {
            str2 = " (for " + aVar + " algorithm)";
        } else {
            str2 = "";
        }
        sb2.append(str2);
        super(sb2.toString());
        this.f45795a = i11;
        this.f45796b = aVar;
    }
}
