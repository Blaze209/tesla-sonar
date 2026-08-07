package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class DTLSTransport implements DatagramTransport {
    private final DTLSRecordLayer recordLayer;

    DTLSTransport(DTLSRecordLayer dTLSRecordLayer) {
        this.recordLayer = dTLSRecordLayer;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void close() throws TlsFatalAlert {
        this.recordLayer.close();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getReceiveLimit() {
        return this.recordLayer.getReceiveLimit();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getSendLimit() {
        return this.recordLayer.getSendLimit();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int receive(byte[] bArr, int i11, int i12, int i13) throws IOException {
        try {
            return this.recordLayer.receive(bArr, i11, i12, i13);
        } catch (RuntimeException e11) {
            this.recordLayer.fail((short) 80);
            throw new TlsFatalAlert((short) 80, e11);
        } catch (TlsFatalAlert e12) {
            this.recordLayer.fail(e12.getAlertDescription());
            throw e12;
        } catch (IOException e13) {
            this.recordLayer.fail((short) 80);
            throw e13;
        }
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void send(byte[] bArr, int i11, int i12) throws IOException {
        try {
            this.recordLayer.send(bArr, i11, i12);
        } catch (TlsFatalAlert e11) {
            this.recordLayer.fail(e11.getAlertDescription());
            throw e11;
        } catch (IOException e12) {
            this.recordLayer.fail((short) 80);
            throw e12;
        } catch (RuntimeException e13) {
            this.recordLayer.fail((short) 80);
            throw new TlsFatalAlert((short) 80, e13);
        }
    }
}
