package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f46318a;

    static {
        int[] iArr = new int[E6.values().length];
        try {
            iArr[E6.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[E6.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[E6.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[E6.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f46318a = iArr;
    }
}
