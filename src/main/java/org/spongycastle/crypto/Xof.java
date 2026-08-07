package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public interface Xof extends ExtendedDigest {
    int doFinal(byte[] bArr, int i11, int i12);

    int doOutput(byte[] bArr, int i11, int i12);
}
