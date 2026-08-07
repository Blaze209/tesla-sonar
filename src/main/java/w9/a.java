package w9;

import android.graphics.Bitmap;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import s7.c0;
import s7.n;
import s7.q0;
import t9.d;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f121557a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f121558b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2604a f121559c = new C2604a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f121560d;

    /* JADX INFO: renamed from: w9.a$a, reason: collision with other inner class name */
    private static final class C2604a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f121561a = new c0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f121562b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f121563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f121564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f121565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f121566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f121567g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f121568h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f121569i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(c0 c0Var, int i11) {
            int iP;
            if (i11 < 4) {
                return;
            }
            c0Var.c0(3);
            int i12 = i11 - 4;
            if ((c0Var.M() & 128) != 0) {
                if (i12 < 7 || (iP = c0Var.P()) < 4) {
                    return;
                }
                this.f121568h = c0Var.U();
                this.f121569i = c0Var.U();
                this.f121561a.X(iP - 4);
                i12 = i11 - 11;
            }
            int iG = this.f121561a.g();
            int iJ = this.f121561a.j();
            if (iG >= iJ || i12 <= 0) {
                return;
            }
            int iMin = Math.min(i12, iJ - iG);
            c0Var.q(this.f121561a.f(), iG, iMin);
            this.f121561a.b0(iG + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(c0 c0Var, int i11) {
            if (i11 < 19) {
                return;
            }
            this.f121564d = c0Var.U();
            this.f121565e = c0Var.U();
            c0Var.c0(11);
            this.f121566f = c0Var.U();
            this.f121567g = c0Var.U();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(c0 c0Var, int i11) {
            if (i11 % 5 != 2) {
                return;
            }
            c0Var.c0(2);
            Arrays.fill(this.f121562b, 0);
            int i12 = i11 / 5;
            for (int i13 = 0; i13 < i12; i13++) {
                int iM = c0Var.M();
                int iM2 = c0Var.M();
                int iM3 = c0Var.M();
                int iM4 = c0Var.M();
                int iM5 = c0Var.M();
                double d11 = iM2;
                double d12 = iM3 + RangingPosition.RSSI_UNKNOWN;
                double d13 = iM4 + RangingPosition.RSSI_UNKNOWN;
                this.f121562b[iM] = (q0.r((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255) << 8) | (iM5 << 24) | (q0.r((int) ((1.402d * d12) + d11), 0, 255) << 16) | q0.r((int) (d11 + (d13 * 1.772d)), 0, 255);
            }
            this.f121563c = true;
        }

        public r7.a d() {
            int iM;
            if (this.f121564d == 0 || this.f121565e == 0 || this.f121568h == 0 || this.f121569i == 0 || this.f121561a.j() == 0 || this.f121561a.g() != this.f121561a.j() || !this.f121563c) {
                return null;
            }
            this.f121561a.b0(0);
            int i11 = this.f121568h * this.f121569i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int iM2 = this.f121561a.M();
                if (iM2 != 0) {
                    iM = i12 + 1;
                    iArr[i12] = this.f121562b[iM2];
                } else {
                    int iM3 = this.f121561a.M();
                    if (iM3 != 0) {
                        iM = ((iM3 & 64) == 0 ? iM3 & 63 : ((iM3 & 63) << 8) | this.f121561a.M()) + i12;
                        Arrays.fill(iArr, i12, iM, (iM3 & 128) == 0 ? this.f121562b[0] : this.f121562b[this.f121561a.M()]);
                    }
                }
                i12 = iM;
            }
            return new r7.a.b().f(Bitmap.createBitmap(iArr, this.f121568h, this.f121569i, Bitmap.Config.ARGB_8888)).k(this.f121566f / this.f121564d).l(0).h(this.f121567g / this.f121565e, 0).i(0).n(this.f121568h / this.f121564d).g(this.f121569i / this.f121565e).a();
        }

        public void h() {
            this.f121564d = 0;
            this.f121565e = 0;
            this.f121566f = 0;
            this.f121567g = 0;
            this.f121568h = 0;
            this.f121569i = 0;
            this.f121561a.X(0);
            this.f121563c = false;
        }
    }

    private static r7.a d(c0 c0Var, C2604a c2604a) {
        int iJ = c0Var.j();
        int iM = c0Var.M();
        int iU = c0Var.U();
        int iG = c0Var.g() + iU;
        r7.a aVarD = null;
        if (iG > iJ) {
            c0Var.b0(iJ);
            return null;
        }
        if (iM != 128) {
            switch (iM) {
                case 20:
                    c2604a.g(c0Var, iU);
                    break;
                case 21:
                    c2604a.e(c0Var, iU);
                    break;
                case 22:
                    c2604a.f(c0Var, iU);
                    break;
            }
        } else {
            aVarD = c2604a.d();
            c2604a.h();
        }
        c0Var.b0(iG);
        return aVarD;
    }

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<d> nVar) {
        this.f121557a.Z(bArr, i12 + i11);
        this.f121557a.b0(i11);
        if (this.f121560d == null) {
            this.f121560d = new Inflater();
        }
        if (q0.Y0(this.f121557a, this.f121558b, this.f121560d)) {
            this.f121557a.Z(this.f121558b.f(), this.f121558b.j());
        }
        this.f121559c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f121557a.a() >= 3) {
            r7.a aVarD = d(this.f121557a, this.f121559c);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        nVar.accept(new d(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // t9.q
    public int b() {
        return 2;
    }
}
