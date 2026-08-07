package br0;

import com.adyen.checkout.components.core.Address;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.jce.ECNamedCurveTable;

/* JADX INFO: loaded from: classes10.dex */
public class n extends p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f17986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private BigInteger f17988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Logger f17981v = Logger.getLogger("org.jmrtd.lds");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final DHParameterSpec f17982w = yq0.o.T(yq0.o.f125775c);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final DHParameterSpec f17983x = yq0.o.T(yq0.o.f125776d);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final DHParameterSpec f17984y = yq0.o.T(yq0.o.f125777e);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final ECParameterSpec f17985z = yq0.o.V(ECNamedCurveTable.getParameterSpec("secp192r1"));
    private static final ECParameterSpec A = yq0.o.V(ECNamedCurveTable.getParameterSpec("secp224r1"));
    private static final ECParameterSpec B = yq0.o.V(ECNamedCurveTable.getParameterSpec("secp256r1"));
    private static final ECParameterSpec C = yq0.o.V(ECNamedCurveTable.getParameterSpec("secp384r1"));
    private static final ECParameterSpec D = yq0.o.V(ECNamedCurveTable.getParameterSpec("secp521r1"));
    private static final ECParameterSpec E = yq0.o.V(ECNamedCurveTable.getParameterSpec("brainpoolp192r1"));
    private static final ECParameterSpec F = yq0.o.V(ECNamedCurveTable.getParameterSpec("brainpoolp224r1"));
    private static final ECParameterSpec G = yq0.o.V(ECNamedCurveTable.getParameterSpec("brainpoolp256r1"));
    private static final ECParameterSpec H = yq0.o.V(ECNamedCurveTable.getParameterSpec("brainpoolp320r1"));
    private static final ECParameterSpec I = yq0.o.V(ECNamedCurveTable.getParameterSpec("brainpoolp384r1"));
    private static final ECParameterSpec J = yq0.o.V(ECNamedCurveTable.getParameterSpec("brainpoolp512r1"));
    private static final Set<String> K = new TreeSet(Arrays.asList("0.4.0.127.0.7.2.2.4.1.1", "0.4.0.127.0.7.2.2.4.1.2", "0.4.0.127.0.7.2.2.4.1.3", "0.4.0.127.0.7.2.2.4.1.4", "0.4.0.127.0.7.2.2.4.3.1", "0.4.0.127.0.7.2.2.4.3.2", "0.4.0.127.0.7.2.2.4.3.3", "0.4.0.127.0.7.2.2.4.3.4", "0.4.0.127.0.7.2.2.4.2.1", "0.4.0.127.0.7.2.2.4.2.2", "0.4.0.127.0.7.2.2.4.2.3", "0.4.0.127.0.7.2.2.4.2.4", "0.4.0.127.0.7.2.2.4.4.1", "0.4.0.127.0.7.2.2.4.4.2", "0.4.0.127.0.7.2.2.4.4.3", "0.4.0.127.0.7.2.2.4.4.4", "0.4.0.127.0.7.2.2.4.6.2", "0.4.0.127.0.7.2.2.4.6.3", "0.4.0.127.0.7.2.2.4.6.4"));

    public static class a extends DHParameterSpec {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BigInteger f17989a;

        public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            super(bigInteger, bigInteger2);
            this.f17989a = bigInteger3;
        }

        public BigInteger a() {
            return this.f17989a;
        }
    }

    public enum b {
        GM,
        IM,
        CAM
    }

    public n(String str, int i11, int i12) {
        this(str, i11, BigInteger.valueOf(i12));
    }

    public static boolean d(String str) {
        return K.contains(str);
    }

    public static String h(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str)) {
            return "DESede";
        }
        if ("0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return "AES";
        }
        throw new NumberFormatException("Unknown OID: \"" + str + "\"");
    }

    public static String i(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.2".equals(str)) {
            return "SHA-1";
        }
        if ("0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str) || "0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return "SHA-256";
        }
        throw new NumberFormatException("Unknown OID: \"" + str + "\"");
    }

    public static String j(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str)) {
            return "DH";
        }
        if ("0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return "ECDH";
        }
        throw new NumberFormatException("Unknown OID: \"" + str + "\"");
    }

    public static int k(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.2".equals(str)) {
            return 128;
        }
        if ("0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str)) {
            return 192;
        }
        if ("0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return 256;
        }
        throw new NumberFormatException("Unknown OID: \"" + str + "\"");
    }

    public static b l(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str) || "0.4.0.127.0.7.2.2.4.1.2".equals(str) || "0.4.0.127.0.7.2.2.4.1.3".equals(str) || "0.4.0.127.0.7.2.2.4.1.4".equals(str) || "0.4.0.127.0.7.2.2.4.2.1".equals(str) || "0.4.0.127.0.7.2.2.4.2.2".equals(str) || "0.4.0.127.0.7.2.2.4.2.3".equals(str) || "0.4.0.127.0.7.2.2.4.2.4".equals(str)) {
            return b.GM;
        }
        if ("0.4.0.127.0.7.2.2.4.3.1".equals(str) || "0.4.0.127.0.7.2.2.4.3.2".equals(str) || "0.4.0.127.0.7.2.2.4.3.3".equals(str) || "0.4.0.127.0.7.2.2.4.3.4".equals(str) || "0.4.0.127.0.7.2.2.4.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4.4".equals(str)) {
            return b.IM;
        }
        if ("0.4.0.127.0.7.2.2.4.6.2".equals(str) || "0.4.0.127.0.7.2.2.4.6.3".equals(str) || "0.4.0.127.0.7.2.2.4.6.4".equals(str)) {
            return b.CAM;
        }
        throw new NumberFormatException("Unknown OID: \"" + str + "\"");
    }

    public static AlgorithmParameterSpec m(int i11) {
        if (i11 == 0) {
            return f17982w;
        }
        if (i11 == 1) {
            return f17983x;
        }
        if (i11 == 2) {
            return f17984y;
        }
        switch (i11) {
            case 8:
                return f17985z;
            case 9:
                return E;
            case 10:
                return A;
            case 11:
                return F;
            case 12:
                return B;
            case 13:
                return G;
            case 14:
                return H;
            case 15:
                return C;
            case 16:
                return I;
            case 17:
                return J;
            case 18:
                return D;
            default:
                throw new NumberFormatException("Unknown standardized domain parameters " + i11);
        }
    }

    public static AlgorithmParameterSpec n(BigInteger bigInteger) {
        return m(bigInteger.intValue());
    }

    private String o(String str) {
        if ("0.4.0.127.0.7.2.2.4.1.1".equals(str)) {
            return "id-PACE-DH-GM-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.4.1.2".equals(str)) {
            return "id-PACE-DH-GM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.1.3".equals(str)) {
            return "id-PACE-DH-GM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.1.4".equals(str)) {
            return "id-PACE-DH-GM-AES-CBC-CMAC-256";
        }
        if ("0.4.0.127.0.7.2.2.4.3.1".equals(str)) {
            return "id-PACE-DH-IM-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.4.3.2".equals(str)) {
            return "id-PACE-DH-IM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.3.3".equals(str)) {
            return "id-PACE-DH-IM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.3.4".equals(str)) {
            return "id-PACE-DH-IM-AES-CBC-CMAC-256";
        }
        if ("0.4.0.127.0.7.2.2.4.2.1".equals(str)) {
            return "id-PACE-ECDH-GM-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.4.2.2".equals(str)) {
            return "id-PACE-ECDH-GM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.2.3".equals(str)) {
            return "id-PACE-ECDH-GM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.2.4".equals(str)) {
            return "id-PACE-ECDH-GM-AES-CBC-CMAC-256";
        }
        if ("0.4.0.127.0.7.2.2.4.4.1".equals(str)) {
            return "id-PACE-ECDH-IM-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.4.4.2".equals(str)) {
            return "id-PACE-ECDH-IM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.4.3".equals(str)) {
            return "id-PACE-ECDH-IM-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.4.4.4".equals(str)) {
            return "id-PACE-ECDH-IM-AES-CBC-CMAC-256";
        }
        if ("0.4.0.127.0.7.2.2.4.6.2".equals(str)) {
            return "id-PACE-ECDH-CAM-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.4.6.3".equals(str)) {
            return "id-PACE-ECDH-CAM-AES-CBC-CMAC-192";
        }
        return "0.4.0.127.0.7.2.2.4.6.4".equals(str) ? "id-PACE-ECDH-CAM-AES-CBC-CMAC-256" : str;
    }

    public static String p(BigInteger bigInteger) {
        if (bigInteger == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        int iIntValue = bigInteger.intValue();
        if (iIntValue == 0) {
            return "1024-bit MODP Group with 160-bit Prime Order Subgroup";
        }
        if (iIntValue == 1) {
            return "2048-bit MODP Group with 224-bit Prime Order Subgroup";
        }
        if (iIntValue == 2) {
            return "2048-bit MODP Group with 256-bit Prime Order Subgroup";
        }
        switch (iIntValue) {
            case 8:
                return "NIST P-192 (secp192r1)";
            case 9:
                return "BrainpoolP192r1";
            case 10:
                return "NIST P-224 (secp224r1)";
            case 11:
                return "BrainpoolP224r1";
            case 12:
                return "NIST P-256 (secp256r1)";
            case 13:
                return "BrainpoolP256r1";
            case 14:
                return "BrainpoolP320r1";
            case 15:
                return "NIST P-384 (secp384r1)";
            case 16:
                return "BrainpoolP384r1";
            case 17:
                return "BrainpoolP512r1";
            case 18:
                return "NIST P-521 (secp521r1)";
            default:
                return bigInteger.toString();
        }
    }

    @Override // br0.p
    @Deprecated
    public ASN1Primitive b() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f17986s));
        aSN1EncodableVector.add(new ASN1Integer(this.f17987t));
        if (this.f17988u != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.f17988u));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String e() {
        return this.f17986s;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!n.class.equals(obj.getClass())) {
            return false;
        }
        n nVar = (n) obj;
        String str = this.f17986s;
        if (str == null && nVar.f17986s != null) {
            return false;
        }
        if ((str != null && !str.equals(nVar.f17986s)) || this.f17987t != nVar.f17987t) {
            return false;
        }
        BigInteger bigInteger = this.f17988u;
        if (bigInteger != null || nVar.f17988u == null) {
            return bigInteger == null || bigInteger.equals(nVar.f17988u);
        }
        return false;
    }

    public BigInteger f() {
        return this.f17988u;
    }

    public String g() {
        return o(this.f17986s);
    }

    public int hashCode() {
        int iHashCode = (this.f17986s.hashCode() * 7) + 1234567891 + (this.f17987t * 5);
        BigInteger bigInteger = this.f17988u;
        return iHashCode + ((bigInteger == null ? 1991 : bigInteger.hashCode()) * 3);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PACEInfo [");
        sb2.append("protocol: ");
        sb2.append(o(this.f17986s));
        sb2.append(", version: ");
        sb2.append(this.f17987t);
        if (this.f17988u != null) {
            sb2.append(", parameterId: ");
            sb2.append(p(this.f17988u));
        }
        sb2.append("]");
        return sb2.toString();
    }

    public n(String str, int i11, BigInteger bigInteger) {
        if (!d(str)) {
            throw new IllegalArgumentException("Invalid OID");
        }
        if (i11 != 2) {
            f17981v.warning("Invalid version, must be 2");
        }
        this.f17986s = str;
        this.f17987t = i11;
        this.f17988u = bigInteger;
    }
}
