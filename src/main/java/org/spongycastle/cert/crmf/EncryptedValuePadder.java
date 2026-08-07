package org.spongycastle.cert.crmf;

/* JADX INFO: loaded from: classes10.dex */
public interface EncryptedValuePadder {
    byte[] getPaddedData(byte[] bArr);

    byte[] getUnpaddedData(byte[] bArr);
}
