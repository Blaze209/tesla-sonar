package com.fourthline.core.mrz.internal.validation;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f24303a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f24304b = {7, 3, 1};

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final boolean a(String data, String expectedChecksum) {
        s.k(data, "data");
        s.k(expectedChecksum, "expectedChecksum");
        return s.f(expectedChecksum, a(data));
    }

    private final int a(char c11) {
        if (c11 == '<') {
            return 0;
        }
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('A' <= c11 && c11 < '[') {
            return c11 - '7';
        }
        throw new IllegalArgumentException("MRZ contains invalid character: " + c11);
    }

    private final String a(String str) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < str.length()) {
            int iA = a(str.charAt(i11));
            int[] iArr = f24304b;
            i12 += iA * iArr[i13 % iArr.length];
            i11++;
            i13++;
        }
        return String.valueOf(i12 % 10);
    }
}
