package dr0;

import java.io.Serializable;
import java.security.KeyPair;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes10.dex */
public class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private br0.n.b f60986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private yq0.g f60991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t f60992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PublicKey f60993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private KeyPair f60994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private y f60995j;

    public v(yq0.g gVar, br0.n.b bVar, String str, String str2, String str3, int i11, t tVar, KeyPair keyPair, PublicKey publicKey, y yVar) {
        this.f60991f = gVar;
        this.f60986a = bVar;
        this.f60987b = str;
        this.f60988c = str2;
        this.f60989d = str3;
        this.f60990e = i11;
        this.f60992g = tVar;
        this.f60994i = keyPair;
        this.f60993h = publicKey;
        this.f60995j = yVar;
    }

    public String a() {
        return this.f60987b;
    }

    public String b() {
        return this.f60988c;
    }

    public String c() {
        return this.f60989d;
    }

    public int d() {
        return this.f60990e;
    }

    public t e() {
        return this.f60992g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        yq0.g gVar = this.f60991f;
        if (gVar == null) {
            if (vVar.f60991f != null) {
                return false;
            }
        } else if (!gVar.equals(vVar.f60991f)) {
            return false;
        }
        String str = this.f60987b;
        if (str == null) {
            if (vVar.f60987b != null) {
                return false;
            }
        } else if (!str.equals(vVar.f60987b)) {
            return false;
        }
        String str2 = this.f60988c;
        if (str2 == null) {
            if (vVar.f60988c != null) {
                return false;
            }
        } else if (!str2.equals(vVar.f60988c)) {
            return false;
        }
        String str3 = this.f60989d;
        if (str3 == null) {
            if (vVar.f60989d != null) {
                return false;
            }
        } else if (!str3.equals(vVar.f60989d)) {
            return false;
        }
        t tVar = this.f60992g;
        if (tVar == null) {
            if (vVar.f60992g != null) {
                return false;
            }
        } else if (!tVar.equals(vVar.f60992g)) {
            return false;
        }
        if (this.f60990e != vVar.f60990e || this.f60986a != vVar.f60986a) {
            return false;
        }
        KeyPair keyPair = this.f60994i;
        if (keyPair == null) {
            if (vVar.f60994i != null) {
                return false;
            }
        } else if (!keyPair.equals(vVar.f60994i)) {
            return false;
        }
        PublicKey publicKey = this.f60993h;
        if (publicKey == null) {
            if (vVar.f60993h != null) {
                return false;
            }
        } else if (!publicKey.equals(vVar.f60993h)) {
            return false;
        }
        y yVar = this.f60995j;
        if (yVar == null) {
            if (vVar.f60995j != null) {
                return false;
            }
        } else if (!yVar.equals(vVar.f60995j)) {
            return false;
        }
        return true;
    }

    public br0.n.b f() {
        return this.f60986a;
    }

    public yq0.g g() {
        return this.f60991f;
    }

    public KeyPair h() {
        return this.f60994i;
    }

    public int hashCode() {
        yq0.g gVar = this.f60991f;
        int iHashCode = (21901 + (gVar == null ? 0 : gVar.hashCode())) * 1991;
        String str = this.f60987b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 1991;
        String str2 = this.f60988c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 1991;
        String str3 = this.f60989d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 1991;
        t tVar = this.f60992g;
        int iHashCode5 = (((iHashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 1991) + this.f60990e) * 1991;
        br0.n.b bVar = this.f60986a;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 1991;
        KeyPair keyPair = this.f60994i;
        int iHashCode7 = (iHashCode6 + (keyPair == null ? 0 : keyPair.hashCode())) * 1991;
        PublicKey publicKey = this.f60993h;
        int iHashCode8 = (iHashCode7 + (publicKey == null ? 0 : publicKey.hashCode())) * 1991;
        y yVar = this.f60995j;
        return iHashCode8 + (yVar != null ? yVar.hashCode() : 0);
    }

    public PublicKey i() {
        return this.f60993h;
    }

    public y j() {
        return this.f60995j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PACEResult [");
        sb2.append("paceKey: ");
        sb2.append(this.f60991f);
        sb2.append(", mappingType: ");
        sb2.append(this.f60986a);
        sb2.append(", agreementAlg: " + this.f60987b);
        sb2.append(", cipherAlg: " + this.f60988c);
        sb2.append(", digestAlg: " + this.f60989d);
        sb2.append(", keyLength: " + this.f60990e);
        sb2.append(", mappingResult: " + this.f60992g);
        sb2.append(", piccPublicKey: " + yq0.o.t(this.f60993h));
        sb2.append(", pcdPrivateKey: " + yq0.o.s(this.f60994i.getPrivate()));
        sb2.append(", pcdPublicKey: " + yq0.o.t(this.f60994i.getPublic()));
        return sb2.toString();
    }
}
