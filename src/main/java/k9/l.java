package k9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f85434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f85435f;

    public l(int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f85431b = i11;
        this.f85432c = i12;
        this.f85433d = i13;
        this.f85434e = iArr;
        this.f85435f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f85431b == lVar.f85431b && this.f85432c == lVar.f85432c && this.f85433d == lVar.f85433d && Arrays.equals(this.f85434e, lVar.f85434e) && Arrays.equals(this.f85435f, lVar.f85435f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f85431b) * 31) + this.f85432c) * 31) + this.f85433d) * 31) + Arrays.hashCode(this.f85434e)) * 31) + Arrays.hashCode(this.f85435f);
    }
}
