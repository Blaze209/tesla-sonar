package br0;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes10.dex */
public class i extends p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Logger f17967v = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f17968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private BigInteger f17970u;

    public i(String str, int i11) {
        this(str, i11, null);
    }

    static boolean e(String str) {
        return p.f17995e.equals(str) || p.f17996f.equals(str) || "0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.1.4".equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str);
    }

    public static String g(String str) {
        if (p.f17995e.equals(str) || p.f17996f.equals(str)) {
            return "DESede";
        }
        if ("0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.1.4".equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str)) {
            return "AES";
        }
        throw new NumberFormatException("Unknown OID: \"" + str + "\"");
    }

    public static String h(String str) {
        if (str == null) {
            throw new NumberFormatException("Unknown OID: null");
        }
        if (p.f17995e.equals(str) || "0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.1.4".equals(str)) {
            return "DH";
        }
        if (p.f17996f.equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str)) {
            return "ECDH";
        }
        throw new NumberFormatException("Unknown OID: \"" + str + "\"");
    }

    public static int i(String str) {
        if (p.f17995e.equals(str) || p.f17996f.equals(str) || "0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str)) {
            return 128;
        }
        if ("0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str)) {
            return 192;
        }
        if ("0.4.0.127.0.7.2.2.3.1.4".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str)) {
            return 256;
        }
        throw new NumberFormatException("Unknown OID: \"" + str + "\"");
    }

    private static String j(String str) {
        if (p.f17995e.equals(str)) {
            return "id-CA-DH-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.3.1.2".equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.3.1.3".equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-192";
        }
        if ("0.4.0.127.0.7.2.2.3.1.4".equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-256";
        }
        if (p.f17996f.equals(str)) {
            return "id-CA-ECDH-3DES-CBC-CBC";
        }
        if ("0.4.0.127.0.7.2.2.3.2.2".equals(str)) {
            return "id-CA-ECDH-AES-CBC-CMAC-128";
        }
        if ("0.4.0.127.0.7.2.2.3.2.3".equals(str)) {
            return "id-CA-ECDH-AES-CBC-CMAC-192";
        }
        return "0.4.0.127.0.7.2.2.3.2.4".equals(str) ? "id-CA-ECDH-AES-CBC-CMAC-256" : str;
    }

    @Override // br0.p
    @Deprecated
    public ASN1Primitive b() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f17968s));
        aSN1EncodableVector.add(new ASN1Integer(this.f17969t));
        if (this.f17970u != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.f17970u));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    protected void d() {
        try {
            if (!e(this.f17968s)) {
                throw new IllegalArgumentException("Wrong identifier: " + this.f17968s);
            }
            int i11 = this.f17969t;
            if (i11 == 1 || i11 == 2) {
                return;
            }
            f17967v.warning("Wrong version. Was expecting 1 or 2, found " + this.f17969t);
        } catch (Exception e11) {
            f17967v.log(Level.WARNING, "Unexpected exception", (Throwable) e11);
            throw new IllegalArgumentException("Malformed ChipAuthenticationInfo.");
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
        if (!i.class.equals(obj.getClass())) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17968s.equals(iVar.f17968s) && this.f17969t == iVar.f17969t && (((bigInteger = this.f17970u) == null && iVar.f17970u == null) || (bigInteger != null && bigInteger.equals(iVar.f17970u)));
    }

    public String f() {
        return this.f17968s;
    }

    public int hashCode() {
        String str = this.f17968s;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 11) + 3 + (this.f17969t * 61);
        BigInteger bigInteger = this.f17970u;
        return iHashCode + ((bigInteger == null ? 111 : bigInteger.hashCode()) * 1991);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChipAuthenticationInfo [protocol: ");
        sb2.append(j(this.f17968s));
        sb2.append(", version: ");
        sb2.append(this.f17969t);
        sb2.append(", keyId: ");
        Object obj = this.f17970u;
        if (obj == null) {
            obj = "-";
        }
        sb2.append(obj);
        sb2.append("]");
        return sb2.toString();
    }

    public i(String str, int i11, BigInteger bigInteger) {
        this.f17968s = str;
        this.f17969t = i11;
        this.f17970u = bigInteger;
        d();
    }
}
