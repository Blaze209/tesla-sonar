package dr0;

import java.io.Serializable;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PublicKey f60923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f60926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f60927e;

    public c(PublicKey publicKey, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.f60923a = publicKey;
        this.f60924b = str;
        this.f60925c = str2;
        this.f60926d = bArr;
        this.f60927e = bArr2;
    }

    public byte[] a() {
        return this.f60927e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (!Arrays.equals(this.f60926d, cVar.f60926d)) {
            return false;
        }
        String str = this.f60924b;
        if (str == null) {
            if (cVar.f60924b != null) {
                return false;
            }
        } else if (!str.equals(cVar.f60924b)) {
            return false;
        }
        PublicKey publicKey = this.f60923a;
        if (publicKey == null) {
            if (cVar.f60923a != null) {
                return false;
            }
        } else if (!publicKey.equals(cVar.f60923a)) {
            return false;
        }
        if (!Arrays.equals(this.f60927e, cVar.f60927e)) {
            return false;
        }
        String str2 = this.f60925c;
        if (str2 == null) {
            if (cVar.f60925c != null) {
                return false;
            }
        } else if (!str2.equals(cVar.f60925c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (1303377669 + Arrays.hashCode(this.f60926d)) * 1991;
        String str = this.f60924b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 1991;
        PublicKey publicKey = this.f60923a;
        int iHashCode3 = (((iHashCode2 + (publicKey == null ? 0 : publicKey.hashCode())) * 1991) + Arrays.hashCode(this.f60927e)) * 1991;
        String str2 = this.f60925c;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AAResult [publicKey: " + yq0.o.t(this.f60923a) + ", digestAlgorithm: " + this.f60924b + ", signatureAlgorithm: " + this.f60925c + ", challenge: " + bp0.a.b(this.f60926d) + ", response: " + bp0.a.b(this.f60927e);
    }
}
