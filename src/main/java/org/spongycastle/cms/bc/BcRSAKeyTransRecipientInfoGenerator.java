package org.spongycastle.cms.bc;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.operator.bc.BcRSAAsymmetricKeyWrapper;

/* JADX INFO: loaded from: classes10.dex */
public class BcRSAKeyTransRecipientInfoGenerator extends BcKeyTransRecipientInfoGenerator {
    public BcRSAKeyTransRecipientInfoGenerator(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, AsymmetricKeyParameter asymmetricKeyParameter) {
        super(bArr, new BcRSAAsymmetricKeyWrapper(algorithmIdentifier, asymmetricKeyParameter));
    }

    public BcRSAKeyTransRecipientInfoGenerator(X509CertificateHolder x509CertificateHolder) {
        super(x509CertificateHolder, new BcRSAAsymmetricKeyWrapper(x509CertificateHolder.getSubjectPublicKeyInfo().getAlgorithmId(), x509CertificateHolder.getSubjectPublicKeyInfo()));
    }
}
