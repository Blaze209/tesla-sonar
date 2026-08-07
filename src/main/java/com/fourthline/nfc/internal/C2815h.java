package com.fourthline.nfc.internal;

import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2815h implements yq0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24649a;

    public C2815h(String mrzDerivedKey) {
        p013kotlin.jvm.internal.s.k(mrzDerivedKey, "mrzDerivedKey");
        this.f24649a = mrzDerivedKey;
    }

    public final String a() {
        return this.f24649a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2815h) && p013kotlin.jvm.internal.s.f(this.f24649a, ((C2815h) obj).f24649a);
    }

    public String getAlgorithm() {
        return "BAP";
    }

    @Override // yq0.g
    public byte[] getKey() throws NoSuchAlgorithmException {
        byte[] bArrD = yq0.o.d(this.f24649a, "SHA-1", true);
        p013kotlin.jvm.internal.s.j(bArrD, "computeKeySeed(...)");
        return bArrD;
    }

    public int hashCode() {
        return this.f24649a.hashCode();
    }

    public String toString() {
        return "BAPKey(mrzDerivedKey=" + this.f24649a + ")";
    }
}
