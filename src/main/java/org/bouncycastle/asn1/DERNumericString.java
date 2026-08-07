package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes9.dex */
public class DERNumericString extends ASN1NumericString {
    public DERNumericString(String str) {
        this(str, false);
    }

    public DERNumericString(String str, boolean z11) {
        super(str, z11);
    }

    DERNumericString(byte[] bArr, boolean z11) {
        super(bArr, z11);
    }
}
