package br0;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes10.dex */
public class f extends p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Logger f17958v = Logger.getLogger("org.jmrtd.lds");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f17959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f17961u;

    f(String str, int i11, String str2) {
        this.f17959s = str;
        this.f17960t = i11;
        this.f17961u = str2;
        d();
    }

    private void d() {
        try {
            if (!e(this.f17959s)) {
                throw new IllegalArgumentException("Wrong identifier: " + this.f17959s);
            }
            if (this.f17960t != 1) {
                f17958v.warning("Wrong version: " + this.f17960t);
            }
            if (!"0.4.0.127.0.7.1.1.4.1.1".equals(this.f17961u) && !"0.4.0.127.0.7.1.1.4.1.2".equals(this.f17961u) && !"0.4.0.127.0.7.1.1.4.1.3".equals(this.f17961u) && !"0.4.0.127.0.7.1.1.4.1.4".equals(this.f17961u) && !"0.4.0.127.0.7.1.1.4.1.5".equals(this.f17961u) && !"0.4.0.127.0.7.1.1.4.1.6".equals(this.f17961u)) {
                throw new IllegalArgumentException("Wrong signature algorithm OID: " + this.f17961u);
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("Malformed ActiveAuthenticationInfo", e11);
        }
    }

    static boolean e(String str) {
        return "2.23.136.1.1.5".equals(str);
    }

    public static String g(String str) throws NoSuchAlgorithmException {
        if ("0.4.0.127.0.7.1.1.4.1.1".equals(str)) {
            return "SHA1withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.2".equals(str)) {
            return "SHA224withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.3".equals(str)) {
            return "SHA256withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.4".equals(str)) {
            return "SHA384withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.5".equals(str)) {
            return "SHA512withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.6".equals(str)) {
            return "RIPEMD160withECDSA";
        }
        throw new NoSuchAlgorithmException("Unknown OID " + str);
    }

    private String h(String str) {
        return "2.23.136.1.1.5".equals(str) ? "id-AA" : str;
    }

    public static String i(String str) {
        if ("0.4.0.127.0.7.1.1.4.1.1".equals(str)) {
            return "ecdsa-plain-SHA1";
        }
        if ("0.4.0.127.0.7.1.1.4.1.2".equals(str)) {
            return "ecdsa-plain-SHA224";
        }
        if ("0.4.0.127.0.7.1.1.4.1.3".equals(str)) {
            return "ecdsa-plain-SHA256";
        }
        if ("0.4.0.127.0.7.1.1.4.1.4".equals(str)) {
            return "ecdsa-plain-SHA384";
        }
        if ("0.4.0.127.0.7.1.1.4.1.5".equals(str)) {
            return "ecdsa-plain-SHA512";
        }
        return "0.4.0.127.0.7.1.1.4.1.6".equals(str) ? "ecdsa-plain-RIPEMD160" : str;
    }

    @Override // br0.p
    @Deprecated
    public ASN1Primitive b() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f17959s));
        aSN1EncodableVector.add(new ASN1Integer(this.f17960t));
        if (this.f17961u != null) {
            aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f17961u));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (f.class.equals(obj.getClass())) {
            return b().equals(((f) obj).b());
        }
        return false;
    }

    public String f() {
        return this.f17961u;
    }

    public int hashCode() {
        String str = this.f17959s;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 3) + 12345 + (this.f17960t * 5);
        String str2 = this.f17961u;
        return iHashCode + ((str2 == null ? 1 : str2.hashCode()) * 11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActiveAuthenticationInfo");
        sb2.append(" [");
        sb2.append("protocol: " + h(this.f17959s));
        sb2.append(", ");
        sb2.append("version: " + this.f17960t);
        sb2.append(", ");
        sb2.append("signatureAlgorithmOID: " + i(f()));
        sb2.append("]");
        return sb2.toString();
    }
}
