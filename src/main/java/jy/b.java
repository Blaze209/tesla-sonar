package jy;

import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes6.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f84429b;

    b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f84428a = aVar;
        int length = iArr.length;
        int i11 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f84429b = iArr;
            return;
        }
        while (i11 < length && iArr[i11] == 0) {
            i11++;
        }
        if (i11 == length) {
            this.f84429b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i11];
        this.f84429b = iArr2;
        System.arraycopy(iArr, i11, iArr2, 0, iArr2.length);
    }

    b a(b bVar) {
        if (!this.f84428a.equals(bVar.f84428a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f()) {
            return bVar;
        }
        if (bVar.f()) {
            return this;
        }
        int[] iArr = this.f84429b;
        int[] iArr2 = bVar.f84429b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i11 = length; i11 < iArr.length; i11++) {
            iArr3[i11] = a.a(iArr2[i11 - length], iArr[i11]);
        }
        return new b(this.f84428a, iArr3);
    }

    b[] b(b bVar) {
        if (!this.f84428a.equals(bVar.f84428a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b bVarE = this.f84428a.e();
        int iF = this.f84428a.f(bVar.c(bVar.e()));
        b bVarA = this;
        while (bVarA.e() >= bVar.e() && !bVarA.f()) {
            int iE = bVarA.e() - bVar.e();
            int iH = this.f84428a.h(bVarA.c(bVarA.e()), iF);
            b bVarH = bVar.h(iE, iH);
            bVarE = bVarE.a(this.f84428a.b(iE, iH));
            bVarA = bVarA.a(bVarH);
        }
        return new b[]{bVarE, bVarA};
    }

    int c(int i11) {
        int[] iArr = this.f84429b;
        return iArr[(iArr.length - 1) - i11];
    }

    int[] d() {
        return this.f84429b;
    }

    int e() {
        return this.f84429b.length - 1;
    }

    boolean f() {
        return this.f84429b[0] == 0;
    }

    b g(b bVar) {
        if (!this.f84428a.equals(bVar.f84428a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f() || bVar.f()) {
            return this.f84428a.e();
        }
        int[] iArr = this.f84429b;
        int length = iArr.length;
        int[] iArr2 = bVar.f84429b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            for (int i13 = 0; i13 < length2; i13++) {
                int i14 = i11 + i13;
                iArr3[i14] = a.a(iArr3[i14], this.f84428a.h(i12, iArr2[i13]));
            }
        }
        return new b(this.f84428a, iArr3);
    }

    b h(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.f84428a.e();
        }
        int length = this.f84429b.length;
        int[] iArr = new int[i11 + length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = this.f84428a.h(this.f84429b[i13], i12);
        }
        return new b(this.f84428a, iArr);
    }

    public String toString() {
        if (f()) {
            return WebrtcBuildVersion.maint_version;
        }
        StringBuilder sb2 = new StringBuilder(e() * 8);
        for (int iE = e(); iE >= 0; iE--) {
            int iC = c(iE);
            if (iC != 0) {
                if (iC < 0) {
                    if (iE == e()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    iC = -iC;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iE == 0 || iC != 1) {
                    int iG = this.f84428a.g(iC);
                    if (iG == 0) {
                        sb2.append('1');
                    } else if (iG == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(iG);
                    }
                }
                if (iE != 0) {
                    if (iE == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iE);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
