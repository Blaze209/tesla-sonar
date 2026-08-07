package org.spongycastle.cert.ocsp;

import java.io.OutputStream;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.ocsp.ResponderID;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.operator.DigestCalculator;

/* JADX INFO: loaded from: classes10.dex */
public class RespID {
    public static final AlgorithmIdentifier HASH_SHA1 = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    ResponderID f99412id;

    public RespID(ResponderID responderID) {
        this.f99412id = responderID;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RespID) {
            return this.f99412id.equals(((RespID) obj).f99412id);
        }
        return false;
    }

    public int hashCode() {
        return this.f99412id.hashCode();
    }

    public ResponderID toASN1Primitive() {
        return this.f99412id;
    }

    public RespID(X500Name x500Name) {
        this.f99412id = new ResponderID(x500Name);
    }

    public RespID(SubjectPublicKeyInfo subjectPublicKeyInfo, DigestCalculator digestCalculator) throws OCSPException {
        try {
            if (digestCalculator.getAlgorithmIdentifier().equals(HASH_SHA1)) {
                OutputStream outputStream = digestCalculator.getOutputStream();
                outputStream.write(subjectPublicKeyInfo.getPublicKeyData().getBytes());
                outputStream.close();
                this.f99412id = new ResponderID(new DEROctetString(digestCalculator.getDigest()));
                return;
            }
            throw new IllegalArgumentException("only SHA-1 can be used with RespID - found: " + digestCalculator.getAlgorithmIdentifier().getAlgorithm());
        } catch (Exception e11) {
            throw new OCSPException("problem creating ID: " + e11, e11);
        }
    }
}
