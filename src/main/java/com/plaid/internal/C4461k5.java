package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C4461k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f47800a;

    static {
        int[] iArr = new int[EnumC4452j5.values().length];
        try {
            iArr[EnumC4452j5.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC4452j5.DEVELOPMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC4452j5.SANDBOX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f47800a = iArr;
    }
}
