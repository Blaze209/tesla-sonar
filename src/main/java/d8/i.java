package d8;

import android.net.Uri;
import s7.k0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f59827d;

    public i(String str, long j11, long j12) {
        this.f59826c = str == null ? "" : str;
        this.f59824a = j11;
        this.f59825b = j12;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j11 = this.f59825b;
            if (j11 != -1) {
                long j12 = this.f59824a;
                if (j12 + j11 == iVar.f59824a) {
                    long j13 = iVar.f59825b;
                    return new i(strC, j12, j13 != -1 ? j11 + j13 : -1L);
                }
            }
            long j14 = iVar.f59825b;
            if (j14 != -1) {
                long j15 = iVar.f59824a;
                if (j15 + j14 == this.f59824a) {
                    iVar2 = new i(strC, j15, j11 != -1 ? j14 + j11 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return k0.g(str, this.f59826c);
    }

    public String c(String str) {
        return k0.f(str, this.f59826c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f59824a == iVar.f59824a && this.f59825b == iVar.f59825b && this.f59826c.equals(iVar.f59826c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f59827d == 0) {
            this.f59827d = ((((527 + ((int) this.f59824a)) * 31) + ((int) this.f59825b)) * 31) + this.f59826c.hashCode();
        }
        return this.f59827d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f59826c + ", start=" + this.f59824a + ", length=" + this.f59825b + ")";
    }
}
