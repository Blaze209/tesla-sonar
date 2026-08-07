package br0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.x509.Certificate;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f18009a = Logger.getLogger("org.jmrtd");

    public static X509Certificate a(Certificate certificate) {
        return (X509Certificate) CertificateFactory.getInstance("X.509", yq0.o.n()).generateCertificate(new ByteArrayInputStream(certificate.getEncoded("DER")));
    }

    public static List<X509Certificate> b(SignedData signedData) {
        ASN1Set certificates = signedData.getCertificates();
        int size = certificates == null ? 0 : certificates.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    arrayList.add(a(Certificate.getInstance(certificates.getObjectAt(i11))));
                } catch (Exception e11) {
                    f18009a.log(Level.WARNING, "Exception in decoding certificate", (Throwable) e11);
                }
            }
        }
        return arrayList;
    }

    public static ASN1Object c(ASN1Encodable aSN1Encodable) throws IOException {
        if (!(aSN1Encodable instanceof ASN1TaggedObject)) {
            throw new IOException("Was expecting an ASN1TaggedObject, found " + aSN1Encodable.getClass().getCanonicalName());
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
        int tagClass = aSN1TaggedObject.getTagClass();
        if (tagClass != 128) {
            throw new IOException("Was expecting CONTEXT_SPECIFIC tag class in ASN1 tagged object, found " + Integer.toHexString(tagClass));
        }
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        throw new IOException("Was expecting tag 0, found " + Integer.toHexString(tagNo));
    }

    public static SignerInfo d(SignedData signedData) {
        ASN1Set signerInfos = signedData.getSignerInfos();
        if (signerInfos == null || signerInfos.size() <= 0) {
            throw new IllegalArgumentException("No signer info in signed data");
        }
        if (signerInfos.size() > 1) {
            f18009a.warning("Found " + signerInfos.size() + " signerInfos");
        }
        return SignerInfo.getInstance(signerInfos.getObjectAt(0));
    }

    public static SignedData e(InputStream inputStream) throws IOException {
        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(inputStream).readObject();
        if (aSN1Sequence.size() != 2) {
            throw new IOException("Was expecting a DER sequence of length 2, found a DER sequence of length " + aSN1Sequence.size());
        }
        String id2 = ((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId();
        if ("1.2.840.113549.1.7.2".equals(id2)) {
            ASN1Object aSN1ObjectC = c(aSN1Sequence.getObjectAt(1));
            if (aSN1ObjectC instanceof ASN1Sequence) {
                return SignedData.getInstance(aSN1ObjectC);
            }
            throw new IOException("Was expecting an ASN.1 sequence as content");
        }
        throw new IOException("Was expecting signed-data content type OID (1.2.840.113549.1.7.2), found " + id2);
    }

    public static void f(SignedData signedData, OutputStream outputStream) throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier("1.2.840.113549.1.7.2"));
        aSN1EncodableVector.add(new DERTaggedObject(0, signedData));
        outputStream.write(new DLSequence(aSN1EncodableVector).getEncoded("DER"));
    }
}
