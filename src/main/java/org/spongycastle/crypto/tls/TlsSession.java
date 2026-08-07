package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public interface TlsSession {
    SessionParameters exportSessionParameters();

    byte[] getSessionID();

    void invalidate();

    boolean isResumable();
}
