package br0;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f17992b = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17993c = EACObjectIdentifiers.id_PK_DH.getId();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17994d = EACObjectIdentifiers.id_PK_ECDH.getId();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17995e = EACObjectIdentifiers.id_CA_DH_3DES_CBC_CBC.getId();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f17996f = EACObjectIdentifiers.id_CA_ECDH_3DES_CBC_CBC.getId();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f17997g = EACObjectIdentifiers.id_TA.getId();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f17998h = EACObjectIdentifiers.id_TA_RSA.getId();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f17999i = EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1.getId();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f18000j = EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256.getId();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f18001k = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1.getId();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f18002l = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256.getId();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f18003m = EACObjectIdentifiers.id_TA_ECDSA.getId();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f18004n = EACObjectIdentifiers.id_TA_ECDSA_SHA_1.getId();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f18005o = EACObjectIdentifiers.id_TA_ECDSA_SHA_224.getId();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f18006p = EACObjectIdentifiers.id_TA_ECDSA_SHA_256.getId();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f18007q = X9ObjectIdentifiers.id_publicKeyType.getId();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f18008r = X9ObjectIdentifiers.id_ecPublicKey.getId();

    public static p c(ASN1Primitive aSN1Primitive) {
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String id2 = ((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId();
            ASN1Primitive aSN1Primitive2 = aSN1Sequence.getObjectAt(1).toASN1Primitive();
            ASN1Primitive aSN1Primitive3 = aSN1Sequence.size() == 3 ? aSN1Sequence.getObjectAt(2).toASN1Primitive() : null;
            if (f.e(id2)) {
                int iIntValue = ((ASN1Integer) aSN1Primitive2).getValue().intValue();
                return aSN1Primitive3 == null ? new f(id2, iIntValue, null) : new f(id2, iIntValue, ((ASN1ObjectIdentifier) aSN1Primitive3).getId());
            }
            if (j.e(id2)) {
                SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(aSN1Primitive2);
                if (aSN1Primitive3 == null) {
                    return new j(id2, yq0.o.Y(subjectPublicKeyInfo));
                }
                return new j(id2, yq0.o.Y(subjectPublicKeyInfo), ((ASN1Integer) aSN1Primitive3).getValue());
            }
            if (i.e(id2)) {
                int iIntValue2 = ((ASN1Integer) aSN1Primitive2).getValue().intValue();
                return aSN1Primitive3 == null ? new i(id2, iIntValue2) : new i(id2, iIntValue2, ((ASN1Integer) aSN1Primitive3).getValue());
            }
            if (r.e(id2)) {
                int iIntValue3 = ((ASN1Integer) aSN1Primitive2).getValue().intValue();
                return aSN1Primitive3 == null ? new r(id2, iIntValue3) : new r(id2, iIntValue3, (ASN1Sequence) aSN1Primitive3);
            }
            if (n.d(id2)) {
                return new n(id2, ((ASN1Integer) aSN1Primitive2).getValue().intValue(), aSN1Primitive3 != null ? ((ASN1Integer) aSN1Primitive3).getValue().intValue() : -1);
            }
            if (m.d(id2)) {
                AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1Primitive2);
                return aSN1Primitive3 != null ? new m(id2, algorithmIdentifier, ((ASN1Integer) aSN1Primitive3).getValue()) : new m(id2, algorithmIdentifier);
            }
            f17992b.warning("Unsupported SecurityInfo, oid = " + id2);
            return null;
        } catch (Exception e11) {
            f17992b.log(Level.WARNING, "Unexpected exception", (Throwable) e11);
            throw new IllegalArgumentException("Malformed input stream.");
        }
    }

    @Override // br0.c
    public void a(OutputStream outputStream) throws IOException {
        ASN1Primitive aSN1PrimitiveB = b();
        if (aSN1PrimitiveB == null) {
            throw new IOException("Could not decode from DER.");
        }
        byte[] encoded = aSN1PrimitiveB.getEncoded("DER");
        if (encoded == null) {
            throw new IOException("Could not decode from DER.");
        }
        outputStream.write(encoded);
    }

    @Deprecated
    public abstract ASN1Primitive b();
}
