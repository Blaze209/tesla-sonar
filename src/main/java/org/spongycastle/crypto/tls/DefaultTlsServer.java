package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.agreement.DHStandardGroups;
import org.spongycastle.crypto.params.DHParameters;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DefaultTlsServer extends AbstractTlsServer {
    public DefaultTlsServer() {
    }

    protected TlsKeyExchange createDHEKeyExchange(int i11) {
        return new TlsDHEKeyExchange(i11, this.supportedSignatureAlgorithms, getDHParameters());
    }

    protected TlsKeyExchange createDHKeyExchange(int i11) {
        return new TlsDHKeyExchange(i11, this.supportedSignatureAlgorithms, getDHParameters());
    }

    protected TlsKeyExchange createECDHEKeyExchange(int i11) {
        return new TlsECDHEKeyExchange(i11, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }

    protected TlsKeyExchange createECDHKeyExchange(int i11) {
        return new TlsECDHKeyExchange(i11, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }

    protected TlsKeyExchange createRSAKeyExchange() {
        return new TlsRSAKeyExchange(this.supportedSignatureAlgorithms);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsServer
    protected int[] getCipherSuites() {
        return new int[]{CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, 159, 158, 107, 103, 57, 51, 157, 156, 61, 60, 53, 47};
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsCredentials getCredentials() throws TlsFatalAlert {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        if (keyExchangeAlgorithm == 1) {
            return getRSAEncryptionCredentials();
        }
        if (keyExchangeAlgorithm == 3) {
            return getDSASignerCredentials();
        }
        if (keyExchangeAlgorithm != 5) {
            if (keyExchangeAlgorithm == 17) {
                return getECDSASignerCredentials();
            }
            if (keyExchangeAlgorithm != 19) {
                if (keyExchangeAlgorithm == 20) {
                    return null;
                }
                throw new TlsFatalAlert((short) 80);
            }
        }
        return getRSASignerCredentials();
    }

    protected DHParameters getDHParameters() {
        return DHStandardGroups.rfc3526_2048;
    }

    protected TlsSignerCredentials getDSASignerCredentials() throws TlsFatalAlert {
        throw new TlsFatalAlert((short) 80);
    }

    protected TlsSignerCredentials getECDSASignerCredentials() throws TlsFatalAlert {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsKeyExchange getKeyExchange() throws TlsFatalAlert {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        if (keyExchangeAlgorithm == 1) {
            return createRSAKeyExchange();
        }
        if (keyExchangeAlgorithm == 3 || keyExchangeAlgorithm == 5) {
            return createDHEKeyExchange(keyExchangeAlgorithm);
        }
        if (keyExchangeAlgorithm == 7 || keyExchangeAlgorithm == 9) {
            return createDHKeyExchange(keyExchangeAlgorithm);
        }
        switch (keyExchangeAlgorithm) {
            case 16:
            case 18:
            case 20:
                return createECDHKeyExchange(keyExchangeAlgorithm);
            case 17:
            case 19:
                return createECDHEKeyExchange(keyExchangeAlgorithm);
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    protected TlsEncryptionCredentials getRSAEncryptionCredentials() throws TlsFatalAlert {
        throw new TlsFatalAlert((short) 80);
    }

    protected TlsSignerCredentials getRSASignerCredentials() throws TlsFatalAlert {
        throw new TlsFatalAlert((short) 80);
    }

    public DefaultTlsServer(TlsCipherFactory tlsCipherFactory) {
        super(tlsCipherFactory);
    }
}
