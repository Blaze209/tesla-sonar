package com.fourthline.nfc.internal;

import java.math.BigInteger;
import java.security.PublicKey;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2823m implements InterfaceC2822l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigInteger f24660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PublicKey f24663d;

    public C2823m(BigInteger bigInteger, String oid, String publicKeyOID, PublicKey publicKey) {
        p013kotlin.jvm.internal.s.k(oid, "oid");
        p013kotlin.jvm.internal.s.k(publicKeyOID, "publicKeyOID");
        p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
        this.f24660a = bigInteger;
        this.f24661b = oid;
        this.f24662c = publicKeyOID;
        this.f24663d = publicKey;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2822l
    public PublicKey a() {
        return this.f24663d;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2822l
    public String b() {
        return this.f24662c;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2822l
    public String c() {
        return this.f24661b;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2822l
    public BigInteger d() {
        return this.f24660a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2823m)) {
            return false;
        }
        C2823m c2823m = (C2823m) obj;
        return p013kotlin.jvm.internal.s.f(this.f24660a, c2823m.f24660a) && p013kotlin.jvm.internal.s.f(this.f24661b, c2823m.f24661b) && p013kotlin.jvm.internal.s.f(this.f24662c, c2823m.f24662c) && p013kotlin.jvm.internal.s.f(this.f24663d, c2823m.f24663d);
    }

    public int hashCode() {
        BigInteger bigInteger = this.f24660a;
        return ((((((bigInteger == null ? 0 : bigInteger.hashCode()) * 31) + this.f24661b.hashCode()) * 31) + this.f24662c.hashCode()) * 31) + this.f24663d.hashCode();
    }

    public String toString() {
        return "ChipAuthInfoBundle(keyId=" + this.f24660a + ", oid=" + this.f24661b + ", publicKeyOID=" + this.f24662c + ", publicKey=" + this.f24663d + ")";
    }
}
