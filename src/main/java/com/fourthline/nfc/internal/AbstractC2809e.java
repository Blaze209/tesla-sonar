package com.fourthline.nfc.internal;

import java.security.PublicKey;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2809e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC2807d f24642a = new InterfaceC2807d() { // from class: com.fourthline.nfc.internal.k1
        @Override // com.fourthline.nfc.internal.InterfaceC2807d
        public final boolean a(PublicKey publicKey, String str, String str2, byte[] bArr, byte[] bArr2) {
            return AbstractC2809e.a(publicKey, str, str2, bArr, bArr2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0 f24643b = new C0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2832w f24644c = new C2832w();

    public static final InterfaceC2807d a() {
        return f24642a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r0.equals("ECDSA") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r0.equals("EC") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        r0 = com.fourthline.nfc.internal.AbstractC2809e.f24644c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(java.security.PublicKey r7, java.lang.String r8, java.lang.String r9, byte[] r10, byte[] r11) throws com.fourthline.nfc.internal.NfcException.b {
        /*
            java.lang.String r0 = "publicKey"
            p013kotlin.jvm.internal.s.k(r7, r0)
            java.lang.String r0 = "signatureAlgorithm"
            p013kotlin.jvm.internal.s.k(r8, r0)
            java.lang.String r0 = "algorithmDigest"
            p013kotlin.jvm.internal.s.k(r9, r0)
            java.lang.String r0 = "challenge"
            p013kotlin.jvm.internal.s.k(r10, r0)
            java.lang.String r0 = "response"
            p013kotlin.jvm.internal.s.k(r11, r0)
            java.lang.String r0 = r7.getAlgorithm()
            if (r0 == 0) goto L3a
            int r1 = r0.hashCode()
            r2 = 2206(0x89e, float:3.091E-42)
            if (r1 == r2) goto L4d
            r2 = 81440(0x13e20, float:1.14122E-40)
            if (r1 == r2) goto L3c
            r2 = 65786932(0x3ebd434, float:1.3860778E-36)
            if (r1 != r2) goto L3a
            java.lang.String r1 = "ECDSA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
            goto L55
        L3a:
            r2 = r7
            goto L5d
        L3c:
            java.lang.String r1 = "RSA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
            com.fourthline.nfc.internal.C0 r0 = com.fourthline.nfc.internal.AbstractC2809e.f24643b
        L46:
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1 = r0
            goto L58
        L4d:
            java.lang.String r1 = "EC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
        L55:
            com.fourthline.nfc.internal.w r0 = com.fourthline.nfc.internal.AbstractC2809e.f24644c
            goto L46
        L58:
            boolean r7 = r1.a(r2, r3, r4, r5, r6)
            return r7
        L5d:
            com.fourthline.nfc.internal.NfcException$b r7 = new com.fourthline.nfc.internal.NfcException$b
            java.lang.String r8 = r2.getAlgorithm()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unexpected public key algorithm: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.nfc.internal.AbstractC2809e.a(java.security.PublicKey, java.lang.String, java.lang.String, byte[], byte[]):boolean");
    }
}
