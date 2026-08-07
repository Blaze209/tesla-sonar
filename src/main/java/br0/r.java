package br0;

import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes10.dex */
public class r extends p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Logger f18010v = Logger.getLogger("org.jmrtd.lds");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f18011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private transient ASN1Sequence f18013u;

    r(String str, int i11, ASN1Sequence aSN1Sequence) {
        this.f18011s = str;
        this.f18012t = i11;
        this.f18013u = aSN1Sequence;
        d();
    }

    private void d() {
        try {
            if (!e(this.f18011s)) {
                throw new IllegalArgumentException("Wrong identifier: " + this.f18011s);
            }
            int i11 = this.f18012t;
            if (i11 != 1 && i11 != 2) {
                f18010v.warning("Wrong version. Was expecting 1 or 2, found " + this.f18012t);
            }
            ASN1Sequence aSN1Sequence = this.f18013u;
            if (aSN1Sequence != null) {
                if (((ASN1OctetString) aSN1Sequence.getObjectAt(0)).getOctets().length != 2) {
                    throw new IllegalArgumentException("Malformed FID.");
                }
                if (this.f18013u.size() == 2 && ((ASN1OctetString) this.f18013u.getObjectAt(1)).getOctets().length != 1) {
                    throw new IllegalArgumentException("Malformed SFI.");
                }
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("Malformed TerminalAuthenticationInfo", e11);
        }
    }

    static boolean e(String str) {
        return p.f17997g.equals(str);
    }

    private static short f(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return (short) -1;
        }
        byte[] octets = ((ASN1OctetString) aSN1Sequence.getObjectAt(0)).getOctets();
        return (short) ((octets[1] & 255) | ((octets[0] & 255) << 8));
    }

    private static byte h(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence != null && aSN1Sequence.size() == 2) {
            return ((ASN1OctetString) aSN1Sequence.getObjectAt(1)).getOctets()[0];
        }
        return (byte) -1;
    }

    private String j(String str) {
        if (p.f17997g.equals(str)) {
            return "id-TA";
        }
        if (p.f17998h.equals(str)) {
            return "id-TA-RSA";
        }
        if (p.f17999i.equals(str)) {
            return "id-TA-RSA-v1-5-SHA-1";
        }
        if (p.f18000j.equals(str)) {
            return "id-TA-RSA-v1-5-SHA-256";
        }
        if (p.f18001k.equals(str)) {
            return "id-TA-RSA-PSS-SHA-1";
        }
        if (p.f18002l.equals(str)) {
            return "id-TA-RSA-PSS-SHA-256";
        }
        if (p.f18003m.equals(str)) {
            return "id-TA-ECDSA";
        }
        if (p.f18004n.equals(str)) {
            return "id-TA-ECDSA-SHA-1";
        }
        if (p.f18005o.equals(str)) {
            return "id-TA-ECDSA-SHA-224";
        }
        return p.f18006p.equals(str) ? "id-TA-ECDSA-SHA-256" : str;
    }

    @Override // br0.p
    @Deprecated
    public ASN1Primitive b() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f18011s));
        aSN1EncodableVector.add(new ASN1Integer(this.f18012t));
        ASN1Sequence aSN1Sequence = this.f18013u;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
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
        if (!r.class.equals(obj.getClass())) {
            return false;
        }
        r rVar = (r) obj;
        ASN1Sequence aSN1Sequence = this.f18013u;
        if (aSN1Sequence == null && rVar.f18013u != null) {
            return false;
        }
        if (aSN1Sequence == null || rVar.f18013u != null) {
            return b().equals(rVar.b());
        }
        return false;
    }

    public int g() {
        return f(this.f18013u);
    }

    public int hashCode() {
        String str = this.f18011s;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 7) + 123 + (this.f18012t * 5);
        ASN1Sequence aSN1Sequence = this.f18013u;
        return iHashCode + ((aSN1Sequence == null ? 1 : aSN1Sequence.hashCode()) * 3);
    }

    public byte i() {
        return h(this.f18013u);
    }

    public String toString() {
        return "TerminalAuthenticationInfo [protocol: " + j(this.f18011s) + ", version: " + this.f18012t + ", fileID: " + g() + ", shortFileID: " + ((int) i()) + "]";
    }

    r(String str, int i11) {
        this(str, i11, null);
    }

    public r() {
        this(p.f17997g, 1);
    }
}
