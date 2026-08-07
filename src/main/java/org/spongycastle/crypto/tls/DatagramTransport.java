package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public interface DatagramTransport {
    void close();

    int getReceiveLimit();

    int getSendLimit();

    int receive(byte[] bArr, int i11, int i12, int i13);

    void send(byte[] bArr, int i11, int i12);
}
