package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public enum W3 {
    DISABLED(0),
    ERROR(1),
    WARN(2),
    INFO(3),
    DEBUG(4),
    TRACE(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46792a;

    W3(int i11) {
        this.f46792a = i11;
    }

    public int getValue() {
        return this.f46792a;
    }
}
