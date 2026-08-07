package com.plaid.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;

/* JADX INFO: renamed from: com.plaid.internal.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4534s7 {
    public static String a(String str) {
        if (str == null || str.length() <= 32) {
            return str;
        }
        if (str.length() <= 30) {
            return str.substring(0, 32);
        }
        return str.substring(0, 30) + CallerDataConverter.DEFAULT_RANGE_DELIMITER;
    }
}
