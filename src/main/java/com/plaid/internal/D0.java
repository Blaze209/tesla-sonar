package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f46259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46260c;

    public D0(String str, Exception exc, String str2) {
        this.f46258a = str;
        this.f46259b = exc;
        this.f46260c = str2;
    }

    public final String a() {
        return this.f46258a;
    }

    public final String toString() {
        return "DeviceDescriptor{ip='" + this.f46258a + "', mno='null', phoneNumber='null', preCheckError=" + this.f46259b + ", desc='" + this.f46260c + "'}";
    }
}
