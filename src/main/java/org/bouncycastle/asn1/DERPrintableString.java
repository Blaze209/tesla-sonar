package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes9.dex */
public class DERPrintableString extends ASN1PrintableString {
    public DERPrintableString(String str) {
        this(str, false);
    }

    public DERPrintableString(String str, boolean z11) {
        super(str, z11);
    }

    DERPrintableString(byte[] bArr, boolean z11) {
        super(bArr, z11);
    }
}
