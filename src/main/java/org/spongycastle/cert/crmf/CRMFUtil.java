package org.spongycastle.cert.crmf;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROutputStream;
import org.spongycastle.asn1.x509.ExtensionsGenerator;
import org.spongycastle.cert.CertIOException;

/* JADX INFO: loaded from: classes10.dex */
class CRMFUtil {
    CRMFUtil() {
    }

    static void addExtension(ExtensionsGenerator extensionsGenerator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, ASN1Encodable aSN1Encodable) throws CertIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z11, aSN1Encodable);
        } catch (IOException e11) {
            throw new CertIOException("cannot encode extension: " + e11.getMessage(), e11);
        }
    }

    static void derEncodeToStream(ASN1Encodable aSN1Encodable, OutputStream outputStream) {
        DEROutputStream dEROutputStream = new DEROutputStream(outputStream);
        try {
            dEROutputStream.writeObject(aSN1Encodable);
            dEROutputStream.close();
        } catch (IOException e11) {
            throw new CRMFRuntimeException("unable to DER encode object: " + e11.getMessage(), e11);
        }
    }
}
