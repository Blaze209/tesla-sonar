package com.fourthline.nfc.internal;

import java.security.SecureRandom;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2817i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yq0.b f24651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24653c;

    public C2817i(yq0.b service, int i11, boolean z11) {
        p013kotlin.jvm.internal.s.k(service, "service");
        this.f24651a = service;
        this.f24652b = i11;
        this.f24653c = z11;
    }

    public final dr0.y a(C2815h key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        byte[] key2 = new C2815h(key.a()).getKey();
        byte[] bArrA = this.f24651a.a();
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[8];
        secureRandom.nextBytes(bArr);
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = new byte[16];
        System.arraycopy(this.f24651a.b(bArr, bArrA, bArr2, yq0.o.f(key2, "AES", 128, 1), yq0.o.f(key2, "AES", 128, 2)), 16, bArr3, 0, 16);
        byte[] bArr4 = new byte[16];
        for (int i11 = 0; i11 < 16; i11++) {
            bArr4[i11] = (byte) (bArr2[i11] ^ bArr3[i11]);
        }
        return new dr0.h(yq0.o.f(bArr4, "AES", 128, 1), yq0.o.f(bArr4, "AES", 128, 2), this.f24652b, this.f24653c, dr0.f.a(bArrA, bArr));
    }
}
