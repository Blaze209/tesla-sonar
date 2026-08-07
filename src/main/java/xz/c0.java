package xz;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f124124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f124125b;

    c0(byte[] bArr, int i11) {
        this.f124124a = bArr;
        this.f124125b = i11;
    }

    static void d(c0 c0Var, d dVar) {
        if (c0Var == null) {
            dVar.g(0);
            return;
        }
        byte[] bArr = c0Var.f124124a;
        int i11 = c0Var.f124125b;
        dVar.h(bArr, i11, (bArr[i11] * 2) + 1);
    }

    public int a() {
        return this.f124124a[this.f124125b];
    }

    public int b(int i11) {
        return this.f124124a[this.f124125b + (i11 * 2) + 1];
    }

    public int c(int i11) {
        return this.f124124a[this.f124125b + (i11 * 2) + 2];
    }

    public String toString() {
        int iA = a();
        StringBuilder sb2 = new StringBuilder(iA * 2);
        for (int i11 = 0; i11 < iA; i11++) {
            int iB = b(i11);
            if (iB == 0) {
                sb2.append('[');
            } else if (iB == 1) {
                sb2.append(CoreConstants.DOT);
            } else if (iB == 2) {
                sb2.append('*');
            } else {
                if (iB != 3) {
                    throw new AssertionError();
                }
                sb2.append(c(i11));
                sb2.append(';');
            }
        }
        return sb2.toString();
    }
}
