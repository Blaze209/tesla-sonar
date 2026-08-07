package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes5.dex */
final class zzht extends zzhs {
    zzht(char c11) {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = CoreConstants.ESCAPE_CHAR;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i11 = 46;
        for (int i12 = 0; i12 < 4; i12++) {
            cArr[5 - i12] = "0123456789ABCDEF".charAt(i11 & 15);
            i11 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
