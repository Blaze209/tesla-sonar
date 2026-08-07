package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public interface TlsPSKIdentity {
    byte[] getPSK();

    byte[] getPSKIdentity();

    void notifyIdentityHint(byte[] bArr);

    void skipIdentityHint();
}
