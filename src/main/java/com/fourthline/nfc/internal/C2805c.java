package com.fourthline.nfc.internal;

import java.security.PublicKey;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2805c implements InterfaceC2803b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PublicKey f24629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24631c;

    public C2805c(PublicKey publicKey, String digestAlgorithm, String signatureAlgorithm) {
        p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
        p013kotlin.jvm.internal.s.k(digestAlgorithm, "digestAlgorithm");
        p013kotlin.jvm.internal.s.k(signatureAlgorithm, "signatureAlgorithm");
        this.f24629a = publicKey;
        this.f24630b = digestAlgorithm;
        this.f24631c = signatureAlgorithm;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2803b
    public PublicKey a() {
        return this.f24629a;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2803b
    public String b() {
        return this.f24631c;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2803b
    public String c() {
        return this.f24630b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2805c)) {
            return false;
        }
        C2805c c2805c = (C2805c) obj;
        return p013kotlin.jvm.internal.s.f(this.f24629a, c2805c.f24629a) && p013kotlin.jvm.internal.s.f(this.f24630b, c2805c.f24630b) && p013kotlin.jvm.internal.s.f(this.f24631c, c2805c.f24631c);
    }

    public int hashCode() {
        return (((this.f24629a.hashCode() * 31) + this.f24630b.hashCode()) * 31) + this.f24631c.hashCode();
    }

    public String toString() {
        return "ActiveAuthInfoBundle(publicKey=" + this.f24629a + ", digestAlgorithm=" + this.f24630b + ", signatureAlgorithm=" + this.f24631c + ")";
    }
}
