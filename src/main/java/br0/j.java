package br0;

import java.math.BigInteger;
import java.security.PublicKey;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes10.dex */
public class j extends p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Logger f17971v = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f17972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private BigInteger f17973t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PublicKey f17974u;

    public j(String str, PublicKey publicKey) {
        this(str, publicKey, null);
    }

    public static boolean e(String str) {
        return p.f17993c.equals(str) || p.f17994d.equals(str);
    }

    private static String i(String str) {
        if (p.f17993c.equals(str)) {
            return "id-PK-DH";
        }
        return p.f17994d.equals(str) ? "id-PK-ECDH" : str;
    }

    @Override // br0.p
    @Deprecated
    public ASN1Primitive b() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        SubjectPublicKeyInfo subjectPublicKeyInfoZ = yq0.o.Z(this.f17974u);
        if (subjectPublicKeyInfoZ == null) {
            f17971v.log(Level.WARNING, "Could not convert public key to subject-public-key-info structure");
        } else {
            aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f17972s));
            aSN1EncodableVector.add(subjectPublicKeyInfoZ.toASN1Primitive());
            if (this.f17973t != null) {
                aSN1EncodableVector.add(new ASN1Integer(this.f17973t));
            }
        }
        return new DLSequence(aSN1EncodableVector);
    }

    protected void d() {
        try {
            if (e(this.f17972s)) {
                return;
            }
            throw new IllegalArgumentException("Wrong identifier: " + this.f17972s);
        } catch (Exception e11) {
            throw new IllegalArgumentException("Malformed ChipAuthenticationInfo", e11);
        }
    }

    public boolean equals(Object obj) {
        BigInteger bigInteger;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!j.class.equals(obj.getClass())) {
            return false;
        }
        j jVar = (j) obj;
        return this.f17972s.equals(jVar.f17972s) && (((bigInteger = this.f17973t) == null && jVar.f17973t == null) || (bigInteger != null && bigInteger.equals(jVar.f17973t))) && this.f17974u.equals(jVar.f17974u);
    }

    public BigInteger f() {
        return this.f17973t;
    }

    public String g() {
        return this.f17972s;
    }

    public PublicKey h() {
        return this.f17974u;
    }

    public int hashCode() {
        int iHashCode = this.f17972s.hashCode();
        BigInteger bigInteger = this.f17973t;
        int iHashCode2 = iHashCode + (bigInteger == null ? 111 : bigInteger.hashCode());
        PublicKey publicKey = this.f17974u;
        return ((iHashCode2 + (publicKey != null ? publicKey.hashCode() : 111)) * 1337) + 123;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChipAuthenticationPublicKeyInfo [protocol: ");
        sb2.append(i(this.f17972s));
        sb2.append(", chipAuthenticationPublicKey: ");
        sb2.append(yq0.o.t(h()));
        sb2.append(", keyId: ");
        BigInteger bigInteger = this.f17973t;
        sb2.append(bigInteger == null ? "-" : bigInteger.toString());
        sb2.append("]");
        return sb2.toString();
    }

    public j(String str, PublicKey publicKey, BigInteger bigInteger) {
        this.f17972s = str;
        this.f17974u = yq0.o.M(publicKey);
        this.f17973t = bigInteger;
        d();
    }
}
