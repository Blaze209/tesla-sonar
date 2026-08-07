package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4430h1 implements InterfaceC4421g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47704c;

    public C4430h1(long j11, String str, String str2) {
        this.f47702a = str;
        this.f47703b = j11;
        this.f47704c = str2;
    }

    @Override // com.plaid.internal.InterfaceC4421g1
    public final String a(InterfaceC4519r1 interfaceC4519r1, C4500p c4500p) {
        c4500p.f48003d = "test";
        c4500p.f48004e = this.f47704c;
        long j11 = this.f47703b;
        if (j11 > 0) {
            try {
                Thread.sleep(j11);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f47702a;
    }
}
