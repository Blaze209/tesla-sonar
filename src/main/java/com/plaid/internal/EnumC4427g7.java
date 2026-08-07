package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4427g7 {
    PRE_CHECK(16),
    DEVICE_DESCRIPTOR(32),
    START(48),
    AUTHENTICATION(64),
    FINISH(80);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47693a;

    EnumC4427g7(int i11) {
        this.f47693a = i11;
    }

    public int getCode() {
        return this.f47693a;
    }
}
