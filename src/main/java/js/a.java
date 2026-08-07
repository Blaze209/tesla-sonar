package js;

import android.graphics.Bitmap;
import com.google.android.gms.nearby.uwb.RangingPosition;
import gs.h;
import gs.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f84320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d0 f84321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1787a f84322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Inflater f84323r;

    /* JADX INFO: renamed from: js.a$a, reason: collision with other inner class name */
    private static final class C1787a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f84324a = new d0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f84325b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f84326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f84327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f84328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f84329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f84330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f84331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f84332i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(d0 d0Var, int i11) {
            int iK;
            if (i11 < 4) {
                return;
            }
            d0Var.V(3);
            int i12 = i11 - 4;
            if ((d0Var.H() & 128) != 0) {
                if (i12 < 7 || (iK = d0Var.K()) < 4) {
                    return;
                }
                this.f84331h = d0Var.N();
                this.f84332i = d0Var.N();
                this.f84324a.Q(iK - 4);
                i12 = i11 - 11;
            }
            int iF = this.f84324a.f();
            int iG = this.f84324a.g();
            if (iF >= iG || i12 <= 0) {
                return;
            }
            int iMin = Math.min(i12, iG - iF);
            d0Var.l(this.f84324a.e(), iF, iMin);
            this.f84324a.U(iF + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(d0 d0Var, int i11) {
            if (i11 < 19) {
                return;
            }
            this.f84327d = d0Var.N();
            this.f84328e = d0Var.N();
            d0Var.V(11);
            this.f84329f = d0Var.N();
            this.f84330g = d0Var.N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(d0 d0Var, int i11) {
            if (i11 % 5 != 2) {
                return;
            }
            d0Var.V(2);
            Arrays.fill(this.f84325b, 0);
            int i12 = i11 / 5;
            for (int i13 = 0; i13 < i12; i13++) {
                int iH = d0Var.H();
                int iH2 = d0Var.H();
                int iH3 = d0Var.H();
                int iH4 = d0Var.H();
                int iH5 = d0Var.H();
                double d11 = iH2;
                double d12 = iH3 + RangingPosition.RSSI_UNKNOWN;
                double d13 = iH4 + RangingPosition.RSSI_UNKNOWN;
                this.f84325b[iH] = (p0.q((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255) << 8) | (iH5 << 24) | (p0.q((int) ((1.402d * d12) + d11), 0, 255) << 16) | p0.q((int) (d11 + (d13 * 1.772d)), 0, 255);
            }
            this.f84326c = true;
        }

        public gs.b d() {
            int iH;
            if (this.f84327d == 0 || this.f84328e == 0 || this.f84331h == 0 || this.f84332i == 0 || this.f84324a.g() == 0 || this.f84324a.f() != this.f84324a.g() || !this.f84326c) {
                return null;
            }
            this.f84324a.U(0);
            int i11 = this.f84331h * this.f84332i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int iH2 = this.f84324a.H();
                if (iH2 != 0) {
                    iH = i12 + 1;
                    iArr[i12] = this.f84325b[iH2];
                } else {
                    int iH3 = this.f84324a.H();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f84324a.H()) + i12;
                        Arrays.fill(iArr, i12, iH, (iH3 & 128) == 0 ? 0 : this.f84325b[this.f84324a.H()]);
                    }
                }
                i12 = iH;
            }
            return new gs.b.C1421b().f(Bitmap.createBitmap(iArr, this.f84331h, this.f84332i, Bitmap.Config.ARGB_8888)).k(this.f84329f / this.f84327d).l(0).h(this.f84330g / this.f84328e, 0).i(0).n(this.f84331h / this.f84327d).g(this.f84332i / this.f84328e).a();
        }

        public void h() {
            this.f84327d = 0;
            this.f84328e = 0;
            this.f84329f = 0;
            this.f84330g = 0;
            this.f84331h = 0;
            this.f84332i = 0;
            this.f84324a.Q(0);
            this.f84326c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f84320o = new d0();
        this.f84321p = new d0();
        this.f84322q = new C1787a();
    }

    private void B(d0 d0Var) {
        if (d0Var.a() <= 0 || d0Var.j() != 120) {
            return;
        }
        if (this.f84323r == null) {
            this.f84323r = new Inflater();
        }
        if (p0.s0(d0Var, this.f84321p, this.f84323r)) {
            d0Var.S(this.f84321p.e(), this.f84321p.g());
        }
    }

    private static gs.b C(d0 d0Var, C1787a c1787a) {
        int iG = d0Var.g();
        int iH = d0Var.H();
        int iN = d0Var.N();
        int iF = d0Var.f() + iN;
        gs.b bVarD = null;
        if (iF > iG) {
            d0Var.U(iG);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c1787a.g(d0Var, iN);
                    break;
                case 21:
                    c1787a.e(d0Var, iN);
                    break;
                case 22:
                    c1787a.f(d0Var, iN);
                    break;
            }
        } else {
            bVarD = c1787a.d();
            c1787a.h();
        }
        d0Var.U(iF);
        return bVarD;
    }

    @Override // gs.h
    protected i A(byte[] bArr, int i11, boolean z11) {
        this.f84320o.S(bArr, i11);
        B(this.f84320o);
        this.f84322q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f84320o.a() >= 3) {
            gs.b bVarC = C(this.f84320o, this.f84322q);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
