package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public class AbstractTlsCipherFactory implements TlsCipherFactory {
    @Override // org.spongycastle.crypto.tls.TlsCipherFactory
    public TlsCipher createCipher(TlsContext tlsContext, int i11, int i12) throws TlsFatalAlert {
        throw new TlsFatalAlert((short) 80);
    }
}
