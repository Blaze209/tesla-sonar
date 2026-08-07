package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public interface TlsEncryptionCredentials extends TlsCredentials {
    byte[] decryptPreMasterSecret(byte[] bArr);
}
