package xz;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f124120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f124121c;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f124122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c[] f124123b = new c[6];

        a() {
        }

        private void a(c cVar) {
            int i11 = this.f124122a;
            c[] cVarArr = this.f124123b;
            if (i11 >= cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length + 6];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, i11);
                this.f124123b = cVarArr2;
            }
            c[] cVarArr3 = this.f124123b;
            int i12 = this.f124122a;
            this.f124122a = i12 + 1;
            cVarArr3[i12] = cVar;
        }

        private boolean c(c cVar) {
            for (int i11 = 0; i11 < this.f124122a; i11++) {
                if (this.f124123b[i11].f124119a.equals(cVar.f124119a)) {
                    return true;
                }
            }
            return false;
        }

        void b(c cVar) {
            while (cVar != null) {
                if (!c(cVar)) {
                    a(cVar);
                }
                cVar = cVar.f124121c;
            }
        }

        c[] d() {
            int i11 = this.f124122a;
            c[] cVarArr = new c[i11];
            System.arraycopy(this.f124123b, 0, cVarArr, 0, i11);
            return cVarArr;
        }
    }

    protected c(String str) {
        this.f124119a = str;
    }

    static int b(a0 a0Var, int i11, int i12) {
        int i13;
        if ((i11 & 4096) == 0 || a0Var.R() >= 49) {
            i13 = 0;
        } else {
            a0Var.D("Synthetic");
            i13 = 6;
        }
        if (i12 != 0) {
            a0Var.D("Signature");
            i13 += 8;
        }
        if ((i11 & 131072) == 0) {
            return i13;
        }
        a0Var.D("Deprecated");
        return i13 + 6;
    }

    static void f(a0 a0Var, int i11, int i12, d dVar) {
        if ((i11 & 4096) != 0 && a0Var.R() < 49) {
            dVar.k(a0Var.D("Synthetic")).i(0);
        }
        if (i12 != 0) {
            dVar.k(a0Var.D("Signature")).i(2).k(i12);
        }
        if ((i11 & 131072) != 0) {
            dVar.k(a0Var.D("Deprecated")).i(0);
        }
    }

    final int a(a0 a0Var) {
        return c(a0Var, null, 0, -1, -1);
    }

    final int c(a0 a0Var, byte[] bArr, int i11, int i12, int i13) {
        g gVar = a0Var.f124085a;
        int i14 = 0;
        c cVar = this;
        while (cVar != null) {
            a0Var.D(cVar.f124119a);
            byte[] bArr2 = bArr;
            i14 += cVar.j(gVar, bArr2, i11, i12, i13).f124127b + 6;
            cVar = cVar.f124121c;
            bArr = bArr2;
        }
        return i14;
    }

    final int d() {
        int i11 = 0;
        for (c cVar = this; cVar != null; cVar = cVar.f124121c) {
            i11++;
        }
        return i11;
    }

    public boolean e() {
        return false;
    }

    final void g(a0 a0Var, d dVar) {
        h(a0Var, null, 0, -1, -1, dVar);
    }

    final void h(a0 a0Var, byte[] bArr, int i11, int i12, int i13, d dVar) {
        g gVar = a0Var.f124085a;
        c cVar = this;
        while (cVar != null) {
            byte[] bArr2 = bArr;
            int i14 = i11;
            int i15 = i12;
            d dVarJ = cVar.j(gVar, bArr2, i14, i15, i13);
            dVar.k(a0Var.D(cVar.f124119a)).i(dVarJ.f124127b);
            dVar.h(dVarJ.f124126a, 0, dVarJ.f124127b);
            cVar = cVar.f124121c;
            bArr = bArr2;
            i11 = i14;
            i12 = i15;
        }
    }

    protected c i(e eVar, int i11, int i12, char[] cArr, int i13, r[] rVarArr) {
        c cVar = new c(this.f124119a);
        byte[] bArr = new byte[i12];
        cVar.f124120b = bArr;
        System.arraycopy(eVar.f124130c, i11, bArr, 0, i12);
        return cVar;
    }

    protected d j(g gVar, byte[] bArr, int i11, int i12, int i13) {
        return new d(this.f124120b);
    }
}
