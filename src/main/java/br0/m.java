package br0;

import java.math.BigInteger;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes10.dex */
public class m extends p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Logger f17977v = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f17978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient AlgorithmIdentifier f17979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private BigInteger f17980u;

    public m(String str, AlgorithmIdentifier algorithmIdentifier) {
        this(str, algorithmIdentifier, null);
    }

    public static boolean d(String str) {
        return "0.4.0.127.0.7.2.2.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6".equals(str);
    }

    private static String e(String str) {
        if ("0.4.0.127.0.7.2.2.4.1".equals(str)) {
            return "id-PACE-DH-GM";
        }
        if ("0.4.0.127.0.7.2.2.4.2".equals(str)) {
            return "id-PACE-ECDH-GM";
        }
        if ("0.4.0.127.0.7.2.2.4.3".equals(str)) {
            return "id-PACE-DH-IM";
        }
        if ("0.4.0.127.0.7.2.2.4.4".equals(str)) {
            return "id-PACE-ECDH-IM";
        }
        return "0.4.0.127.0.7.2.2.4.6".equals(str) ? "id-PACE-ECDH-CAM" : str;
    }

    @Override // br0.p
    @Deprecated
    public ASN1Primitive b() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f17978s));
        aSN1EncodableVector.add(this.f17979t);
        if (this.f17980u != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.f17980u));
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
        if (m.class.equals(obj.getClass())) {
            return b().equals(((m) obj).b());
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f17978s.hashCode() * 7) + 111111111 + (this.f17979t.hashCode() * 5);
        BigInteger bigInteger = this.f17980u;
        return iHashCode + ((bigInteger == null ? 333 : bigInteger.hashCode()) * 3);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PACEDomainParameterInfo");
        sb2.append("[");
        sb2.append("protocol: ");
        sb2.append(e(this.f17978s));
        sb2.append(", ");
        sb2.append("domainParameter: [");
        sb2.append("algorithm: ");
        sb2.append(this.f17979t.getAlgorithm().getId());
        sb2.append(", ");
        sb2.append("parameters: ");
        sb2.append(this.f17979t.getParameters());
        if (this.f17980u == null) {
            str = "";
        } else {
            str = ", parameterId: " + this.f17980u;
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    public m(String str, AlgorithmIdentifier algorithmIdentifier, BigInteger bigInteger) {
        if (d(str)) {
            this.f17978s = str;
            this.f17979t = algorithmIdentifier;
            this.f17980u = bigInteger;
        } else {
            throw new IllegalArgumentException("Invalid protocol id: " + str);
        }
    }
}
