package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f6976i = {0, 4, 8};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static SparseIntArray f6977j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static SparseIntArray f6978k = new SparseIntArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6981c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f6982d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6983e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f6984f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6985g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap<Integer, a> f6986h = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f6988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0149d f6989c = new C0149d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f6990d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f6991e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f6992f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f6993g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C0148a f6994h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        static class C0148a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int[] f6995a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int[] f6996b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f6997c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f6998d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float[] f6999e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f7000f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int[] f7001g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            String[] f7002h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f7003i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int[] f7004j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean[] f7005k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f7006l = 0;

            C0148a() {
            }

            void a(int i11, float f11) {
                int i12 = this.f7000f;
                int[] iArr = this.f6998d;
                if (i12 >= iArr.length) {
                    this.f6998d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f6999e;
                    this.f6999e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f6998d;
                int i13 = this.f7000f;
                iArr2[i13] = i11;
                float[] fArr2 = this.f6999e;
                this.f7000f = i13 + 1;
                fArr2[i13] = f11;
            }

            void b(int i11, int i12) {
                int i13 = this.f6997c;
                int[] iArr = this.f6995a;
                if (i13 >= iArr.length) {
                    this.f6995a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f6996b;
                    this.f6996b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f6995a;
                int i14 = this.f6997c;
                iArr3[i14] = i11;
                int[] iArr4 = this.f6996b;
                this.f6997c = i14 + 1;
                iArr4[i14] = i12;
            }

            void c(int i11, String str) {
                int i12 = this.f7003i;
                int[] iArr = this.f7001g;
                if (i12 >= iArr.length) {
                    this.f7001g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f7002h;
                    this.f7002h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f7001g;
                int i13 = this.f7003i;
                iArr2[i13] = i11;
                String[] strArr2 = this.f7002h;
                this.f7003i = i13 + 1;
                strArr2[i13] = str;
            }

            void d(int i11, boolean z11) {
                int i12 = this.f7006l;
                int[] iArr = this.f7004j;
                if (i12 >= iArr.length) {
                    this.f7004j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f7005k;
                    this.f7005k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f7004j;
                int i13 = this.f7006l;
                iArr2[i13] = i11;
                boolean[] zArr2 = this.f7005k;
                this.f7006l = i13 + 1;
                zArr2[i13] = z11;
            }

            void e(a aVar) {
                for (int i11 = 0; i11 < this.f6997c; i11++) {
                    d.V(aVar, this.f6995a[i11], this.f6996b[i11]);
                }
                for (int i12 = 0; i12 < this.f7000f; i12++) {
                    d.U(aVar, this.f6998d[i12], this.f6999e[i12]);
                }
                for (int i13 = 0; i13 < this.f7003i; i13++) {
                    d.W(aVar, this.f7001g[i13], this.f7002h[i13]);
                }
                for (int i14 = 0; i14 < this.f7006l; i14++) {
                    d.X(aVar, this.f7004j[i14], this.f7005k[i14]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i11, ConstraintLayout.b bVar) {
            this.f6987a = i11;
            b bVar2 = this.f6991e;
            bVar2.f7026j = bVar.f6892e;
            bVar2.f7028k = bVar.f6894f;
            bVar2.f7030l = bVar.f6896g;
            bVar2.f7032m = bVar.f6898h;
            bVar2.f7034n = bVar.f6900i;
            bVar2.f7036o = bVar.f6902j;
            bVar2.f7038p = bVar.f6904k;
            bVar2.f7040q = bVar.f6906l;
            bVar2.f7042r = bVar.f6908m;
            bVar2.f7043s = bVar.f6910n;
            bVar2.f7044t = bVar.f6912o;
            bVar2.f7045u = bVar.f6920s;
            bVar2.f7046v = bVar.f6922t;
            bVar2.f7047w = bVar.f6924u;
            bVar2.f7048x = bVar.f6926v;
            bVar2.f7049y = bVar.G;
            bVar2.f7050z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f6914p;
            bVar2.C = bVar.f6916q;
            bVar2.D = bVar.f6918r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f7022h = bVar.f6888c;
            bVar2.f7018f = bVar.f6884a;
            bVar2.f7020g = bVar.f6886b;
            bVar2.f7014d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f7016e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f7035n0 = bVar.f6885a0;
            bVar2.f7037o0 = bVar.f6887b0;
            bVar2.Z = bVar.P;
            bVar2.f7009a0 = bVar.Q;
            bVar2.f7011b0 = bVar.T;
            bVar2.f7013c0 = bVar.U;
            bVar2.f7015d0 = bVar.R;
            bVar2.f7017e0 = bVar.S;
            bVar2.f7019f0 = bVar.V;
            bVar2.f7021g0 = bVar.W;
            bVar2.f7033m0 = bVar.f6889c0;
            bVar2.P = bVar.f6930x;
            bVar2.R = bVar.f6932z;
            bVar2.O = bVar.f6928w;
            bVar2.Q = bVar.f6931y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f7041q0 = bVar.f6891d0;
            bVar2.L = bVar.getMarginEnd();
            this.f6991e.M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(int i11, androidx.constraintlayout.widget.e.a aVar) {
            g(i11, aVar);
            this.f6989c.f7069d = aVar.f7087x0;
            e eVar = this.f6992f;
            eVar.f7073b = aVar.A0;
            eVar.f7074c = aVar.B0;
            eVar.f7075d = aVar.C0;
            eVar.f7076e = aVar.D0;
            eVar.f7077f = aVar.E0;
            eVar.f7078g = aVar.F0;
            eVar.f7079h = aVar.G0;
            eVar.f7081j = aVar.H0;
            eVar.f7082k = aVar.I0;
            eVar.f7083l = aVar.J0;
            eVar.f7085n = aVar.f7089z0;
            eVar.f7084m = aVar.f7088y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(androidx.constraintlayout.widget.b bVar, int i11, androidx.constraintlayout.widget.e.a aVar) {
            h(i11, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f6991e;
                bVar2.f7027j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f7023h0 = barrier.getType();
                this.f6991e.f7029k0 = barrier.getReferencedIds();
                this.f6991e.f7025i0 = barrier.getMargin();
            }
        }

        public void d(a aVar) {
            C0148a c0148a = this.f6994h;
            if (c0148a != null) {
                c0148a.e(aVar);
            }
        }

        public void e(ConstraintLayout.b bVar) {
            b bVar2 = this.f6991e;
            bVar.f6892e = bVar2.f7026j;
            bVar.f6894f = bVar2.f7028k;
            bVar.f6896g = bVar2.f7030l;
            bVar.f6898h = bVar2.f7032m;
            bVar.f6900i = bVar2.f7034n;
            bVar.f6902j = bVar2.f7036o;
            bVar.f6904k = bVar2.f7038p;
            bVar.f6906l = bVar2.f7040q;
            bVar.f6908m = bVar2.f7042r;
            bVar.f6910n = bVar2.f7043s;
            bVar.f6912o = bVar2.f7044t;
            bVar.f6920s = bVar2.f7045u;
            bVar.f6922t = bVar2.f7046v;
            bVar.f6924u = bVar2.f7047w;
            bVar.f6926v = bVar2.f7048x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f6930x = bVar2.P;
            bVar.f6932z = bVar2.R;
            bVar.G = bVar2.f7049y;
            bVar.H = bVar2.f7050z;
            bVar.f6914p = bVar2.B;
            bVar.f6916q = bVar2.C;
            bVar.f6918r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f6885a0 = bVar2.f7035n0;
            bVar.f6887b0 = bVar2.f7037o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f7009a0;
            bVar.T = bVar2.f7011b0;
            bVar.U = bVar2.f7013c0;
            bVar.R = bVar2.f7015d0;
            bVar.S = bVar2.f7017e0;
            bVar.V = bVar2.f7019f0;
            bVar.W = bVar2.f7021g0;
            bVar.Z = bVar2.G;
            bVar.f6888c = bVar2.f7022h;
            bVar.f6884a = bVar2.f7018f;
            bVar.f6886b = bVar2.f7020g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f7014d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f7016e;
            String str = bVar2.f7033m0;
            if (str != null) {
                bVar.f6889c0 = str;
            }
            bVar.f6891d0 = bVar2.f7041q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f6991e.L);
            bVar.b();
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f6991e.a(this.f6991e);
            aVar.f6990d.a(this.f6990d);
            aVar.f6989c.a(this.f6989c);
            aVar.f6992f.a(this.f6992f);
            aVar.f6987a = this.f6987a;
            aVar.f6994h = this.f6994h;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f7007r0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7016e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f7029k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f7031l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f7033m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7008a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7010b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7012c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7018f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7020g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f7022h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f7024i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f7026j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7028k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7030l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7032m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7034n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7036o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7038p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7040q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f7042r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7043s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7044t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f7045u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f7046v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f7047w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f7048x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f7049y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f7050z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = BitmapDescriptorFactory.HUE_RED;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f7009a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f7011b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f7013c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f7015d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f7017e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f7019f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f7021g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f7023h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f7025i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f7027j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f7035n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f7037o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f7039p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f7041q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7007r0 = sparseIntArray;
            sparseIntArray.append(i.f7336v7, 24);
            f7007r0.append(i.f7347w7, 25);
            f7007r0.append(i.f7369y7, 28);
            f7007r0.append(i.f7380z7, 29);
            f7007r0.append(i.E7, 35);
            f7007r0.append(i.D7, 34);
            f7007r0.append(i.f7149e7, 4);
            f7007r0.append(i.f7138d7, 3);
            f7007r0.append(i.f7115b7, 1);
            f7007r0.append(i.M7, 6);
            f7007r0.append(i.N7, 7);
            f7007r0.append(i.f7226l7, 17);
            f7007r0.append(i.f7237m7, 18);
            f7007r0.append(i.f7248n7, 19);
            f7007r0.append(i.X6, 90);
            f7007r0.append(i.J6, 26);
            f7007r0.append(i.A7, 31);
            f7007r0.append(i.B7, 32);
            f7007r0.append(i.f7215k7, 10);
            f7007r0.append(i.f7204j7, 9);
            f7007r0.append(i.Q7, 13);
            f7007r0.append(i.T7, 16);
            f7007r0.append(i.R7, 14);
            f7007r0.append(i.O7, 11);
            f7007r0.append(i.S7, 15);
            f7007r0.append(i.P7, 12);
            f7007r0.append(i.H7, 38);
            f7007r0.append(i.f7314t7, 37);
            f7007r0.append(i.f7303s7, 39);
            f7007r0.append(i.G7, 40);
            f7007r0.append(i.f7292r7, 20);
            f7007r0.append(i.F7, 36);
            f7007r0.append(i.f7193i7, 5);
            f7007r0.append(i.f7325u7, 91);
            f7007r0.append(i.C7, 91);
            f7007r0.append(i.f7358x7, 91);
            f7007r0.append(i.f7127c7, 91);
            f7007r0.append(i.f7103a7, 91);
            f7007r0.append(i.M6, 23);
            f7007r0.append(i.O6, 27);
            f7007r0.append(i.Q6, 30);
            f7007r0.append(i.R6, 8);
            f7007r0.append(i.N6, 33);
            f7007r0.append(i.P6, 2);
            f7007r0.append(i.K6, 22);
            f7007r0.append(i.L6, 21);
            f7007r0.append(i.I7, 41);
            f7007r0.append(i.f7259o7, 42);
            f7007r0.append(i.Z6, 87);
            f7007r0.append(i.Y6, 88);
            f7007r0.append(i.U7, 76);
            f7007r0.append(i.f7160f7, 61);
            f7007r0.append(i.f7182h7, 62);
            f7007r0.append(i.f7171g7, 63);
            f7007r0.append(i.L7, 69);
            f7007r0.append(i.f7281q7, 70);
            f7007r0.append(i.V6, 71);
            f7007r0.append(i.T6, 72);
            f7007r0.append(i.U6, 73);
            f7007r0.append(i.W6, 74);
            f7007r0.append(i.S6, 75);
            f7007r0.append(i.J7, 84);
            f7007r0.append(i.K7, 86);
            f7007r0.append(i.J7, 83);
            f7007r0.append(i.f7270p7, 85);
            f7007r0.append(i.I7, 87);
            f7007r0.append(i.f7259o7, 88);
            f7007r0.append(i.f7298s2, 89);
            f7007r0.append(i.X6, 90);
        }

        public void a(b bVar) {
            this.f7008a = bVar.f7008a;
            this.f7014d = bVar.f7014d;
            this.f7010b = bVar.f7010b;
            this.f7016e = bVar.f7016e;
            this.f7018f = bVar.f7018f;
            this.f7020g = bVar.f7020g;
            this.f7022h = bVar.f7022h;
            this.f7024i = bVar.f7024i;
            this.f7026j = bVar.f7026j;
            this.f7028k = bVar.f7028k;
            this.f7030l = bVar.f7030l;
            this.f7032m = bVar.f7032m;
            this.f7034n = bVar.f7034n;
            this.f7036o = bVar.f7036o;
            this.f7038p = bVar.f7038p;
            this.f7040q = bVar.f7040q;
            this.f7042r = bVar.f7042r;
            this.f7043s = bVar.f7043s;
            this.f7044t = bVar.f7044t;
            this.f7045u = bVar.f7045u;
            this.f7046v = bVar.f7046v;
            this.f7047w = bVar.f7047w;
            this.f7048x = bVar.f7048x;
            this.f7049y = bVar.f7049y;
            this.f7050z = bVar.f7050z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f7009a0 = bVar.f7009a0;
            this.f7011b0 = bVar.f7011b0;
            this.f7013c0 = bVar.f7013c0;
            this.f7015d0 = bVar.f7015d0;
            this.f7017e0 = bVar.f7017e0;
            this.f7019f0 = bVar.f7019f0;
            this.f7021g0 = bVar.f7021g0;
            this.f7023h0 = bVar.f7023h0;
            this.f7025i0 = bVar.f7025i0;
            this.f7027j0 = bVar.f7027j0;
            this.f7033m0 = bVar.f7033m0;
            int[] iArr = bVar.f7029k0;
            if (iArr == null || bVar.f7031l0 != null) {
                this.f7029k0 = null;
            } else {
                this.f7029k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f7031l0 = bVar.f7031l0;
            this.f7035n0 = bVar.f7035n0;
            this.f7037o0 = bVar.f7037o0;
            this.f7039p0 = bVar.f7039p0;
            this.f7041q0 = bVar.f7041q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.I6);
            this.f7010b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = f7007r0.get(index);
                switch (i12) {
                    case 1:
                        this.f7042r = d.M(typedArrayObtainStyledAttributes, index, this.f7042r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f7040q = d.M(typedArrayObtainStyledAttributes, index, this.f7040q);
                        break;
                    case 4:
                        this.f7038p = d.M(typedArrayObtainStyledAttributes, index, this.f7038p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f7048x = d.M(typedArrayObtainStyledAttributes, index, this.f7048x);
                        break;
                    case 10:
                        this.f7047w = d.M(typedArrayObtainStyledAttributes, index, this.f7047w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f7018f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7018f);
                        break;
                    case 18:
                        this.f7020g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7020g);
                        break;
                    case 19:
                        this.f7022h = typedArrayObtainStyledAttributes.getFloat(index, this.f7022h);
                        break;
                    case 20:
                        this.f7049y = typedArrayObtainStyledAttributes.getFloat(index, this.f7049y);
                        break;
                    case 21:
                        this.f7016e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f7016e);
                        break;
                    case 22:
                        this.f7014d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f7014d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f7026j = d.M(typedArrayObtainStyledAttributes, index, this.f7026j);
                        break;
                    case 25:
                        this.f7028k = d.M(typedArrayObtainStyledAttributes, index, this.f7028k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f7030l = d.M(typedArrayObtainStyledAttributes, index, this.f7030l);
                        break;
                    case 29:
                        this.f7032m = d.M(typedArrayObtainStyledAttributes, index, this.f7032m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f7045u = d.M(typedArrayObtainStyledAttributes, index, this.f7045u);
                        break;
                    case 32:
                        this.f7046v = d.M(typedArrayObtainStyledAttributes, index, this.f7046v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f7036o = d.M(typedArrayObtainStyledAttributes, index, this.f7036o);
                        break;
                    case 35:
                        this.f7034n = d.M(typedArrayObtainStyledAttributes, index, this.f7034n);
                        break;
                    case 36:
                        this.f7050z = typedArrayObtainStyledAttributes.getFloat(index, this.f7050z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        d.N(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.N(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i12) {
                            case 61:
                                this.B = d.M(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i12) {
                                    case 69:
                                        this.f7019f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f7021g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f7023h0 = typedArrayObtainStyledAttributes.getInt(index, this.f7023h0);
                                        break;
                                    case 73:
                                        this.f7025i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7025i0);
                                        break;
                                    case 74:
                                        this.f7031l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f7039p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7039p0);
                                        break;
                                    case 76:
                                        this.f7041q0 = typedArrayObtainStyledAttributes.getInt(index, this.f7041q0);
                                        break;
                                    case 77:
                                        this.f7043s = d.M(typedArrayObtainStyledAttributes, index, this.f7043s);
                                        break;
                                    case 78:
                                        this.f7044t = d.M(typedArrayObtainStyledAttributes, index, this.f7044t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f7009a0 = typedArrayObtainStyledAttributes.getInt(index, this.f7009a0);
                                        break;
                                    case 83:
                                        this.f7013c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7013c0);
                                        break;
                                    case 84:
                                        this.f7011b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7011b0);
                                        break;
                                    case 85:
                                        this.f7017e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7017e0);
                                        break;
                                    case 86:
                                        this.f7015d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7015d0);
                                        break;
                                    case 87:
                                        this.f7035n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7035n0);
                                        break;
                                    case 88:
                                        this.f7037o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7037o0);
                                        break;
                                    case 89:
                                        this.f7033m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f7024i = typedArrayObtainStyledAttributes.getBoolean(index, this.f7024i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7007r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f7007r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f7051o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7052a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7053b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7054c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f7055d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7056e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7057f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f7058g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7059h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f7060i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f7061j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7062k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f7063l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7064m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7065n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7051o = sparseIntArray;
            sparseIntArray.append(i.f7104a8, 1);
            f7051o.append(i.f7128c8, 2);
            f7051o.append(i.f7172g8, 3);
            f7051o.append(i.Z7, 4);
            f7051o.append(i.Y7, 5);
            f7051o.append(i.X7, 6);
            f7051o.append(i.f7116b8, 7);
            f7051o.append(i.f7161f8, 8);
            f7051o.append(i.f7150e8, 9);
            f7051o.append(i.f7139d8, 10);
        }

        public void a(c cVar) {
            this.f7052a = cVar.f7052a;
            this.f7053b = cVar.f7053b;
            this.f7055d = cVar.f7055d;
            this.f7056e = cVar.f7056e;
            this.f7057f = cVar.f7057f;
            this.f7060i = cVar.f7060i;
            this.f7058g = cVar.f7058g;
            this.f7059h = cVar.f7059h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.W7);
            this.f7052a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                switch (f7051o.get(index)) {
                    case 1:
                        this.f7060i = typedArrayObtainStyledAttributes.getFloat(index, this.f7060i);
                        break;
                    case 2:
                        this.f7056e = typedArrayObtainStyledAttributes.getInt(index, this.f7056e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f7055d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f7055d = b5.c.f16443c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f7057f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f7053b = d.M(typedArrayObtainStyledAttributes, index, this.f7053b);
                        break;
                    case 6:
                        this.f7054c = typedArrayObtainStyledAttributes.getInteger(index, this.f7054c);
                        break;
                    case 7:
                        this.f7058g = typedArrayObtainStyledAttributes.getFloat(index, this.f7058g);
                        break;
                    case 8:
                        this.f7062k = typedArrayObtainStyledAttributes.getInteger(index, this.f7062k);
                        break;
                    case 9:
                        this.f7061j = typedArrayObtainStyledAttributes.getFloat(index, this.f7061j);
                        break;
                    case 10:
                        int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f7065n = resourceId;
                            if (resourceId != -1) {
                                this.f7064m = -2;
                            }
                        } else if (i12 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f7063l = string;
                            if (string.indexOf("/") > 0) {
                                this.f7065n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f7064m = -2;
                            } else {
                                this.f7064m = -1;
                            }
                        } else {
                            this.f7064m = typedArrayObtainStyledAttributes.getInteger(index, this.f7065n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0149d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7066a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7067b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7068c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f7069d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f7070e = Float.NaN;

        public void a(C0149d c0149d) {
            this.f7066a = c0149d.f7066a;
            this.f7067b = c0149d.f7067b;
            this.f7069d = c0149d.f7069d;
            this.f7070e = c0149d.f7070e;
            this.f7068c = c0149d.f7068c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.U8);
            this.f7066a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.W8) {
                    this.f7069d = typedArrayObtainStyledAttributes.getFloat(index, this.f7069d);
                } else if (index == i.V8) {
                    this.f7067b = typedArrayObtainStyledAttributes.getInt(index, this.f7067b);
                    this.f7067b = d.f6976i[this.f7067b];
                } else if (index == i.Y8) {
                    this.f7068c = typedArrayObtainStyledAttributes.getInt(index, this.f7068c);
                } else if (index == i.X8) {
                    this.f7070e = typedArrayObtainStyledAttributes.getFloat(index, this.f7070e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f7071o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7072a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f7073b = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f7074c = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f7075d = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f7076e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f7077f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f7078g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f7079h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7080i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f7081j = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f7082k = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f7083l = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f7084m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f7085n = BitmapDescriptorFactory.HUE_RED;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7071o = sparseIntArray;
            sparseIntArray.append(i.f7239m9, 1);
            f7071o.append(i.f7250n9, 2);
            f7071o.append(i.f7261o9, 3);
            f7071o.append(i.f7217k9, 4);
            f7071o.append(i.f7228l9, 5);
            f7071o.append(i.f7173g9, 6);
            f7071o.append(i.f7184h9, 7);
            f7071o.append(i.f7195i9, 8);
            f7071o.append(i.f7206j9, 9);
            f7071o.append(i.f7272p9, 10);
            f7071o.append(i.f7283q9, 11);
            f7071o.append(i.f7294r9, 12);
        }

        public void a(e eVar) {
            this.f7072a = eVar.f7072a;
            this.f7073b = eVar.f7073b;
            this.f7074c = eVar.f7074c;
            this.f7075d = eVar.f7075d;
            this.f7076e = eVar.f7076e;
            this.f7077f = eVar.f7077f;
            this.f7078g = eVar.f7078g;
            this.f7079h = eVar.f7079h;
            this.f7080i = eVar.f7080i;
            this.f7081j = eVar.f7081j;
            this.f7082k = eVar.f7082k;
            this.f7083l = eVar.f7083l;
            this.f7084m = eVar.f7084m;
            this.f7085n = eVar.f7085n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f7162f9);
            this.f7072a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                switch (f7071o.get(index)) {
                    case 1:
                        this.f7073b = typedArrayObtainStyledAttributes.getFloat(index, this.f7073b);
                        break;
                    case 2:
                        this.f7074c = typedArrayObtainStyledAttributes.getFloat(index, this.f7074c);
                        break;
                    case 3:
                        this.f7075d = typedArrayObtainStyledAttributes.getFloat(index, this.f7075d);
                        break;
                    case 4:
                        this.f7076e = typedArrayObtainStyledAttributes.getFloat(index, this.f7076e);
                        break;
                    case 5:
                        this.f7077f = typedArrayObtainStyledAttributes.getFloat(index, this.f7077f);
                        break;
                    case 6:
                        this.f7078g = typedArrayObtainStyledAttributes.getDimension(index, this.f7078g);
                        break;
                    case 7:
                        this.f7079h = typedArrayObtainStyledAttributes.getDimension(index, this.f7079h);
                        break;
                    case 8:
                        this.f7081j = typedArrayObtainStyledAttributes.getDimension(index, this.f7081j);
                        break;
                    case 9:
                        this.f7082k = typedArrayObtainStyledAttributes.getDimension(index, this.f7082k);
                        break;
                    case 10:
                        this.f7083l = typedArrayObtainStyledAttributes.getDimension(index, this.f7083l);
                        break;
                    case 11:
                        this.f7084m = true;
                        this.f7085n = typedArrayObtainStyledAttributes.getDimension(index, this.f7085n);
                        break;
                    case 12:
                        this.f7080i = d.M(typedArrayObtainStyledAttributes, index, this.f7080i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f6977j.append(i.f7186i0, 25);
        f6977j.append(i.f7197j0, 26);
        f6977j.append(i.f7219l0, 29);
        f6977j.append(i.f7230m0, 30);
        f6977j.append(i.f7296s0, 36);
        f6977j.append(i.f7285r0, 35);
        f6977j.append(i.P, 4);
        f6977j.append(i.O, 3);
        f6977j.append(i.K, 1);
        f6977j.append(i.M, 91);
        f6977j.append(i.L, 92);
        f6977j.append(i.B0, 6);
        f6977j.append(i.C0, 7);
        f6977j.append(i.W, 17);
        f6977j.append(i.X, 18);
        f6977j.append(i.Y, 19);
        f6977j.append(i.G, 99);
        f6977j.append(i.f7119c, 27);
        f6977j.append(i.f7241n0, 32);
        f6977j.append(i.f7252o0, 33);
        f6977j.append(i.V, 10);
        f6977j.append(i.U, 9);
        f6977j.append(i.F0, 13);
        f6977j.append(i.I0, 16);
        f6977j.append(i.G0, 14);
        f6977j.append(i.D0, 11);
        f6977j.append(i.H0, 15);
        f6977j.append(i.E0, 12);
        f6977j.append(i.f7329v0, 40);
        f6977j.append(i.f7164g0, 39);
        f6977j.append(i.f7153f0, 41);
        f6977j.append(i.f7318u0, 42);
        f6977j.append(i.f7142e0, 20);
        f6977j.append(i.f7307t0, 37);
        f6977j.append(i.T, 5);
        f6977j.append(i.f7175h0, 87);
        f6977j.append(i.f7274q0, 87);
        f6977j.append(i.f7208k0, 87);
        f6977j.append(i.N, 87);
        f6977j.append(i.J, 87);
        f6977j.append(i.f7174h, 24);
        f6977j.append(i.f7196j, 28);
        f6977j.append(i.f7328v, 31);
        f6977j.append(i.f7339w, 8);
        f6977j.append(i.f7185i, 34);
        f6977j.append(i.f7207k, 2);
        f6977j.append(i.f7152f, 23);
        f6977j.append(i.f7163g, 21);
        f6977j.append(i.f7340w0, 95);
        f6977j.append(i.Z, 96);
        f6977j.append(i.f7141e, 22);
        f6977j.append(i.f7218l, 43);
        f6977j.append(i.f7361y, 44);
        f6977j.append(i.f7306t, 45);
        f6977j.append(i.f7317u, 46);
        f6977j.append(i.f7295s, 60);
        f6977j.append(i.f7273q, 47);
        f6977j.append(i.f7284r, 48);
        f6977j.append(i.f7229m, 49);
        f6977j.append(i.f7240n, 50);
        f6977j.append(i.f7251o, 51);
        f6977j.append(i.f7262p, 52);
        f6977j.append(i.f7350x, 53);
        f6977j.append(i.f7351x0, 54);
        f6977j.append(i.f7096a0, 55);
        f6977j.append(i.f7362y0, 56);
        f6977j.append(i.f7108b0, 57);
        f6977j.append(i.f7373z0, 58);
        f6977j.append(i.f7120c0, 59);
        f6977j.append(i.Q, 61);
        f6977j.append(i.S, 62);
        f6977j.append(i.R, 63);
        f6977j.append(i.f7372z, 64);
        f6977j.append(i.S0, 65);
        f6977j.append(i.F, 66);
        f6977j.append(i.T0, 67);
        f6977j.append(i.L0, 79);
        f6977j.append(i.f7130d, 38);
        f6977j.append(i.K0, 68);
        f6977j.append(i.A0, 69);
        f6977j.append(i.f7131d0, 70);
        f6977j.append(i.J0, 97);
        f6977j.append(i.D, 71);
        f6977j.append(i.B, 72);
        f6977j.append(i.C, 73);
        f6977j.append(i.E, 74);
        f6977j.append(i.A, 75);
        f6977j.append(i.M0, 76);
        f6977j.append(i.f7263p0, 77);
        f6977j.append(i.U0, 78);
        f6977j.append(i.I, 80);
        f6977j.append(i.H, 81);
        f6977j.append(i.N0, 82);
        f6977j.append(i.R0, 83);
        f6977j.append(i.Q0, 84);
        f6977j.append(i.P0, 85);
        f6977j.append(i.O0, 86);
        f6978k.append(i.f7100a4, 6);
        f6978k.append(i.f7100a4, 7);
        f6978k.append(i.V2, 27);
        f6978k.append(i.f7135d4, 13);
        f6978k.append(i.f7168g4, 16);
        f6978k.append(i.f7146e4, 14);
        f6978k.append(i.f7112b4, 11);
        f6978k.append(i.f7157f4, 15);
        f6978k.append(i.f7124c4, 12);
        f6978k.append(i.U3, 40);
        f6978k.append(i.N3, 39);
        f6978k.append(i.M3, 41);
        f6978k.append(i.T3, 42);
        f6978k.append(i.L3, 20);
        f6978k.append(i.S3, 37);
        f6978k.append(i.F3, 5);
        f6978k.append(i.O3, 87);
        f6978k.append(i.R3, 87);
        f6978k.append(i.P3, 87);
        f6978k.append(i.C3, 87);
        f6978k.append(i.B3, 87);
        f6978k.append(i.f7099a3, 24);
        f6978k.append(i.f7123c3, 28);
        f6978k.append(i.f7255o3, 31);
        f6978k.append(i.f7266p3, 8);
        f6978k.append(i.f7111b3, 34);
        f6978k.append(i.f7134d3, 2);
        f6978k.append(i.Y2, 23);
        f6978k.append(i.Z2, 21);
        f6978k.append(i.V3, 95);
        f6978k.append(i.G3, 96);
        f6978k.append(i.X2, 22);
        f6978k.append(i.f7145e3, 43);
        f6978k.append(i.f7288r3, 44);
        f6978k.append(i.f7233m3, 45);
        f6978k.append(i.f7244n3, 46);
        f6978k.append(i.f7222l3, 60);
        f6978k.append(i.f7200j3, 47);
        f6978k.append(i.f7211k3, 48);
        f6978k.append(i.f7156f3, 49);
        f6978k.append(i.f7167g3, 50);
        f6978k.append(i.f7178h3, 51);
        f6978k.append(i.f7189i3, 52);
        f6978k.append(i.f7277q3, 53);
        f6978k.append(i.W3, 54);
        f6978k.append(i.H3, 55);
        f6978k.append(i.X3, 56);
        f6978k.append(i.I3, 57);
        f6978k.append(i.Y3, 58);
        f6978k.append(i.J3, 59);
        f6978k.append(i.E3, 62);
        f6978k.append(i.D3, 63);
        f6978k.append(i.f7299s3, 64);
        f6978k.append(i.f7289r4, 65);
        f6978k.append(i.f7365y3, 66);
        f6978k.append(i.f7300s4, 67);
        f6978k.append(i.f7201j4, 79);
        f6978k.append(i.W2, 38);
        f6978k.append(i.f7212k4, 98);
        f6978k.append(i.f7190i4, 68);
        f6978k.append(i.Z3, 69);
        f6978k.append(i.K3, 70);
        f6978k.append(i.f7343w3, 71);
        f6978k.append(i.f7321u3, 72);
        f6978k.append(i.f7332v3, 73);
        f6978k.append(i.f7354x3, 74);
        f6978k.append(i.f7310t3, 75);
        f6978k.append(i.f7223l4, 76);
        f6978k.append(i.Q3, 77);
        f6978k.append(i.f7311t4, 78);
        f6978k.append(i.A3, 80);
        f6978k.append(i.f7376z3, 81);
        f6978k.append(i.f7234m4, 82);
        f6978k.append(i.f7278q4, 83);
        f6978k.append(i.f7267p4, 84);
        f6978k.append(i.f7256o4, 85);
        f6978k.append(i.f7245n4, 86);
        f6978k.append(i.f7179h4, 97);
    }

    private a B(Context context, AttributeSet attributeSet, boolean z11) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z11 ? i.U2 : i.f7107b);
        Q(aVar, typedArrayObtainStyledAttributes, z11);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a C(int i11) {
        if (!this.f6986h.containsKey(Integer.valueOf(i11))) {
            this.f6986h.put(Integer.valueOf(i11), new a());
        }
        return this.f6986h.get(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(TypedArray typedArray, int i11, int i12) {
        int resourceId = typedArray.getResourceId(i11, i12);
        return resourceId == -1 ? typedArray.getInt(i11, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    static void N(Object obj, TypedArray typedArray, int i11, int i12) {
        int dimensionPixelSize;
        boolean z11;
        a.C0148a c0148a;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i13 = typedArray.peekValue(i11).type;
        if (i13 == 3) {
            O(obj, typedArray.getString(i11), i12);
            return;
        }
        int i14 = 0;
        if (i13 != 5) {
            dimensionPixelSize = typedArray.getInt(i11, 0);
            if (dimensionPixelSize == -4) {
                z11 = true;
                i14 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z11 = false;
            }
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i12 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i14;
                    bVar2.f6885a0 = z11;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i14;
                    bVar2.f6887b0 = z11;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i12 == 0) {
                    bVar.f7014d = i14;
                    bVar.f7035n0 = z11;
                    return;
                } else {
                    bVar.f7016e = i14;
                    bVar.f7037o0 = z11;
                    return;
                }
            }
            if (obj instanceof a.C0148a) {
                c0148a = (a.C0148a) obj;
                if (i12 == 0) {
                    c0148a.b(23, i14);
                    c0148a.d(80, z11);
                } else {
                    c0148a.b(21, i14);
                    c0148a.d(81, z11);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i11, 0);
        i14 = dimensionPixelSize;
        z11 = false;
        if (obj instanceof ConstraintLayout.b) {
            bVar2 = (ConstraintLayout.b) obj;
            if (i12 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar2).width = i14;
                bVar2.f6885a0 = z11;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i14;
                bVar2.f6887b0 = z11;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i12 == 0) {
                bVar.f7014d = i14;
                bVar.f7035n0 = z11;
                return;
            } else {
                bVar.f7016e = i14;
                bVar.f7037o0 = z11;
                return;
            }
        }
        if (obj instanceof a.C0148a) {
            c0148a = (a.C0148a) obj;
            if (i12 == 0) {
                c0148a.b(23, i14);
                c0148a.d(80, z11);
            } else {
                c0148a.b(21, i14);
                c0148a.d(81, z11);
            }
        }
    }

    static void O(Object obj, String str, int i11) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    P(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0148a) {
                        ((a.C0148a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f11 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f11;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f11;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i11 == 0) {
                            bVar3.f7014d = 0;
                            bVar3.W = f11;
                            return;
                        } else {
                            bVar3.f7016e = 0;
                            bVar3.V = f11;
                            return;
                        }
                    }
                    if (obj instanceof a.C0148a) {
                        a.C0148a c0148a = (a.C0148a) obj;
                        if (i11 == 0) {
                            c0148a.b(23, 0);
                            c0148a.a(39, f11);
                            return;
                        } else {
                            c0148a.b(21, 0);
                            c0148a.a(40, f11);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i11 == 0) {
                            bVar5.f7014d = 0;
                            bVar5.f7019f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f7016e = 0;
                            bVar5.f7021g0 = fMax;
                            bVar5.f7009a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0148a) {
                        a.C0148a c0148a2 = (a.C0148a) obj;
                        if (i11 == 0) {
                            c0148a2.b(23, 0);
                            c0148a2.b(54, 2);
                        } else {
                            c0148a2.b(21, 0);
                            c0148a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void P(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i11 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i12 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i11 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i11 = 1;
                }
                i12 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i12);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i12, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f11 = Float.parseFloat(strSubstring3);
                        float f12 = Float.parseFloat(strSubstring4);
                        if (f11 > BitmapDescriptorFactory.HUE_RED && f12 > BitmapDescriptorFactory.HUE_RED) {
                            fAbs = i11 == 1 ? Math.abs(f12 / f11) : Math.abs(f11 / f12);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i11;
    }

    private void Q(a aVar, TypedArray typedArray, boolean z11) {
        if (z11) {
            R(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (index != i.f7130d && i.f7328v != index && i.f7339w != index) {
                aVar.f6990d.f7052a = true;
                aVar.f6991e.f7010b = true;
                aVar.f6989c.f7066a = true;
                aVar.f6992f.f7072a = true;
            }
            switch (f6977j.get(index)) {
                case 1:
                    b bVar = aVar.f6991e;
                    bVar.f7042r = M(typedArray, index, bVar.f7042r);
                    break;
                case 2:
                    b bVar2 = aVar.f6991e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f6991e;
                    bVar3.f7040q = M(typedArray, index, bVar3.f7040q);
                    break;
                case 4:
                    b bVar4 = aVar.f6991e;
                    bVar4.f7038p = M(typedArray, index, bVar4.f7038p);
                    break;
                case 5:
                    aVar.f6991e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f6991e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f6991e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f6991e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f6991e;
                    bVar8.f7048x = M(typedArray, index, bVar8.f7048x);
                    break;
                case 10:
                    b bVar9 = aVar.f6991e;
                    bVar9.f7047w = M(typedArray, index, bVar9.f7047w);
                    break;
                case 11:
                    b bVar10 = aVar.f6991e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f6991e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f6991e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f6991e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f6991e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f6991e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f6991e;
                    bVar16.f7018f = typedArray.getDimensionPixelOffset(index, bVar16.f7018f);
                    break;
                case 18:
                    b bVar17 = aVar.f6991e;
                    bVar17.f7020g = typedArray.getDimensionPixelOffset(index, bVar17.f7020g);
                    break;
                case 19:
                    b bVar18 = aVar.f6991e;
                    bVar18.f7022h = typedArray.getFloat(index, bVar18.f7022h);
                    break;
                case 20:
                    b bVar19 = aVar.f6991e;
                    bVar19.f7049y = typedArray.getFloat(index, bVar19.f7049y);
                    break;
                case 21:
                    b bVar20 = aVar.f6991e;
                    bVar20.f7016e = typedArray.getLayoutDimension(index, bVar20.f7016e);
                    break;
                case 22:
                    C0149d c0149d = aVar.f6989c;
                    c0149d.f7067b = typedArray.getInt(index, c0149d.f7067b);
                    C0149d c0149d2 = aVar.f6989c;
                    c0149d2.f7067b = f6976i[c0149d2.f7067b];
                    break;
                case 23:
                    b bVar21 = aVar.f6991e;
                    bVar21.f7014d = typedArray.getLayoutDimension(index, bVar21.f7014d);
                    break;
                case 24:
                    b bVar22 = aVar.f6991e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f6991e;
                    bVar23.f7026j = M(typedArray, index, bVar23.f7026j);
                    break;
                case 26:
                    b bVar24 = aVar.f6991e;
                    bVar24.f7028k = M(typedArray, index, bVar24.f7028k);
                    break;
                case 27:
                    b bVar25 = aVar.f6991e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f6991e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f6991e;
                    bVar27.f7030l = M(typedArray, index, bVar27.f7030l);
                    break;
                case 30:
                    b bVar28 = aVar.f6991e;
                    bVar28.f7032m = M(typedArray, index, bVar28.f7032m);
                    break;
                case 31:
                    b bVar29 = aVar.f6991e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f6991e;
                    bVar30.f7045u = M(typedArray, index, bVar30.f7045u);
                    break;
                case 33:
                    b bVar31 = aVar.f6991e;
                    bVar31.f7046v = M(typedArray, index, bVar31.f7046v);
                    break;
                case 34:
                    b bVar32 = aVar.f6991e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f6991e;
                    bVar33.f7036o = M(typedArray, index, bVar33.f7036o);
                    break;
                case 36:
                    b bVar34 = aVar.f6991e;
                    bVar34.f7034n = M(typedArray, index, bVar34.f7034n);
                    break;
                case 37:
                    b bVar35 = aVar.f6991e;
                    bVar35.f7050z = typedArray.getFloat(index, bVar35.f7050z);
                    break;
                case 38:
                    aVar.f6987a = typedArray.getResourceId(index, aVar.f6987a);
                    break;
                case 39:
                    b bVar36 = aVar.f6991e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f6991e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f6991e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f6991e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    C0149d c0149d3 = aVar.f6989c;
                    c0149d3.f7069d = typedArray.getFloat(index, c0149d3.f7069d);
                    break;
                case 44:
                    e eVar = aVar.f6992f;
                    eVar.f7084m = true;
                    eVar.f7085n = typedArray.getDimension(index, eVar.f7085n);
                    break;
                case 45:
                    e eVar2 = aVar.f6992f;
                    eVar2.f7074c = typedArray.getFloat(index, eVar2.f7074c);
                    break;
                case 46:
                    e eVar3 = aVar.f6992f;
                    eVar3.f7075d = typedArray.getFloat(index, eVar3.f7075d);
                    break;
                case 47:
                    e eVar4 = aVar.f6992f;
                    eVar4.f7076e = typedArray.getFloat(index, eVar4.f7076e);
                    break;
                case 48:
                    e eVar5 = aVar.f6992f;
                    eVar5.f7077f = typedArray.getFloat(index, eVar5.f7077f);
                    break;
                case 49:
                    e eVar6 = aVar.f6992f;
                    eVar6.f7078g = typedArray.getDimension(index, eVar6.f7078g);
                    break;
                case 50:
                    e eVar7 = aVar.f6992f;
                    eVar7.f7079h = typedArray.getDimension(index, eVar7.f7079h);
                    break;
                case 51:
                    e eVar8 = aVar.f6992f;
                    eVar8.f7081j = typedArray.getDimension(index, eVar8.f7081j);
                    break;
                case 52:
                    e eVar9 = aVar.f6992f;
                    eVar9.f7082k = typedArray.getDimension(index, eVar9.f7082k);
                    break;
                case 53:
                    e eVar10 = aVar.f6992f;
                    eVar10.f7083l = typedArray.getDimension(index, eVar10.f7083l);
                    break;
                case 54:
                    b bVar40 = aVar.f6991e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f6991e;
                    bVar41.f7009a0 = typedArray.getInt(index, bVar41.f7009a0);
                    break;
                case 56:
                    b bVar42 = aVar.f6991e;
                    bVar42.f7011b0 = typedArray.getDimensionPixelSize(index, bVar42.f7011b0);
                    break;
                case 57:
                    b bVar43 = aVar.f6991e;
                    bVar43.f7013c0 = typedArray.getDimensionPixelSize(index, bVar43.f7013c0);
                    break;
                case 58:
                    b bVar44 = aVar.f6991e;
                    bVar44.f7015d0 = typedArray.getDimensionPixelSize(index, bVar44.f7015d0);
                    break;
                case 59:
                    b bVar45 = aVar.f6991e;
                    bVar45.f7017e0 = typedArray.getDimensionPixelSize(index, bVar45.f7017e0);
                    break;
                case 60:
                    e eVar11 = aVar.f6992f;
                    eVar11.f7073b = typedArray.getFloat(index, eVar11.f7073b);
                    break;
                case 61:
                    b bVar46 = aVar.f6991e;
                    bVar46.B = M(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f6991e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f6991e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.f6990d;
                    cVar.f7053b = M(typedArray, index, cVar.f7053b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f6990d.f7055d = typedArray.getString(index);
                    } else {
                        aVar.f6990d.f7055d = b5.c.f16443c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f6990d.f7057f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f6990d;
                    cVar2.f7060i = typedArray.getFloat(index, cVar2.f7060i);
                    break;
                case 68:
                    C0149d c0149d4 = aVar.f6989c;
                    c0149d4.f7070e = typedArray.getFloat(index, c0149d4.f7070e);
                    break;
                case 69:
                    aVar.f6991e.f7019f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f6991e.f7021g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f6991e;
                    bVar49.f7023h0 = typedArray.getInt(index, bVar49.f7023h0);
                    break;
                case 73:
                    b bVar50 = aVar.f6991e;
                    bVar50.f7025i0 = typedArray.getDimensionPixelSize(index, bVar50.f7025i0);
                    break;
                case 74:
                    aVar.f6991e.f7031l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f6991e;
                    bVar51.f7039p0 = typedArray.getBoolean(index, bVar51.f7039p0);
                    break;
                case 76:
                    c cVar3 = aVar.f6990d;
                    cVar3.f7056e = typedArray.getInt(index, cVar3.f7056e);
                    break;
                case 77:
                    aVar.f6991e.f7033m0 = typedArray.getString(index);
                    break;
                case 78:
                    C0149d c0149d5 = aVar.f6989c;
                    c0149d5.f7068c = typedArray.getInt(index, c0149d5.f7068c);
                    break;
                case 79:
                    c cVar4 = aVar.f6990d;
                    cVar4.f7058g = typedArray.getFloat(index, cVar4.f7058g);
                    break;
                case 80:
                    b bVar52 = aVar.f6991e;
                    bVar52.f7035n0 = typedArray.getBoolean(index, bVar52.f7035n0);
                    break;
                case 81:
                    b bVar53 = aVar.f6991e;
                    bVar53.f7037o0 = typedArray.getBoolean(index, bVar53.f7037o0);
                    break;
                case 82:
                    c cVar5 = aVar.f6990d;
                    cVar5.f7054c = typedArray.getInteger(index, cVar5.f7054c);
                    break;
                case 83:
                    e eVar12 = aVar.f6992f;
                    eVar12.f7080i = M(typedArray, index, eVar12.f7080i);
                    break;
                case 84:
                    c cVar6 = aVar.f6990d;
                    cVar6.f7062k = typedArray.getInteger(index, cVar6.f7062k);
                    break;
                case 85:
                    c cVar7 = aVar.f6990d;
                    cVar7.f7061j = typedArray.getFloat(index, cVar7.f7061j);
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        aVar.f6990d.f7065n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f6990d;
                        if (cVar8.f7065n != -1) {
                            cVar8.f7064m = -2;
                        }
                    } else if (i12 == 3) {
                        aVar.f6990d.f7063l = typedArray.getString(index);
                        if (aVar.f6990d.f7063l.indexOf("/") > 0) {
                            aVar.f6990d.f7065n = typedArray.getResourceId(index, -1);
                            aVar.f6990d.f7064m = -2;
                        } else {
                            aVar.f6990d.f7064m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f6990d;
                        cVar9.f7064m = typedArray.getInteger(index, cVar9.f7065n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f6977j.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f6977j.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f6991e;
                    bVar54.f7043s = M(typedArray, index, bVar54.f7043s);
                    break;
                case 92:
                    b bVar55 = aVar.f6991e;
                    bVar55.f7044t = M(typedArray, index, bVar55.f7044t);
                    break;
                case 93:
                    b bVar56 = aVar.f6991e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f6991e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    N(aVar.f6991e, typedArray, index, 0);
                    break;
                case 96:
                    N(aVar.f6991e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f6991e;
                    bVar58.f7041q0 = typedArray.getInt(index, bVar58.f7041q0);
                    break;
            }
        }
        b bVar59 = aVar.f6991e;
        if (bVar59.f7031l0 != null) {
            bVar59.f7029k0 = null;
        }
    }

    private static void R(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0148a c0148a = new a.C0148a();
        aVar.f6994h = c0148a;
        aVar.f6990d.f7052a = false;
        aVar.f6991e.f7010b = false;
        aVar.f6989c.f7066a = false;
        aVar.f6992f.f7072a = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            switch (f6978k.get(index)) {
                case 2:
                    c0148a.b(2, typedArray.getDimensionPixelSize(index, aVar.f6991e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f6977j.get(index));
                    break;
                case 5:
                    c0148a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0148a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f6991e.E));
                    break;
                case 7:
                    c0148a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f6991e.F));
                    break;
                case 8:
                    c0148a.b(8, typedArray.getDimensionPixelSize(index, aVar.f6991e.L));
                    break;
                case 11:
                    c0148a.b(11, typedArray.getDimensionPixelSize(index, aVar.f6991e.R));
                    break;
                case 12:
                    c0148a.b(12, typedArray.getDimensionPixelSize(index, aVar.f6991e.S));
                    break;
                case 13:
                    c0148a.b(13, typedArray.getDimensionPixelSize(index, aVar.f6991e.O));
                    break;
                case 14:
                    c0148a.b(14, typedArray.getDimensionPixelSize(index, aVar.f6991e.Q));
                    break;
                case 15:
                    c0148a.b(15, typedArray.getDimensionPixelSize(index, aVar.f6991e.T));
                    break;
                case 16:
                    c0148a.b(16, typedArray.getDimensionPixelSize(index, aVar.f6991e.P));
                    break;
                case 17:
                    c0148a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f6991e.f7018f));
                    break;
                case 18:
                    c0148a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f6991e.f7020g));
                    break;
                case 19:
                    c0148a.a(19, typedArray.getFloat(index, aVar.f6991e.f7022h));
                    break;
                case 20:
                    c0148a.a(20, typedArray.getFloat(index, aVar.f6991e.f7049y));
                    break;
                case 21:
                    c0148a.b(21, typedArray.getLayoutDimension(index, aVar.f6991e.f7016e));
                    break;
                case 22:
                    c0148a.b(22, f6976i[typedArray.getInt(index, aVar.f6989c.f7067b)]);
                    break;
                case 23:
                    c0148a.b(23, typedArray.getLayoutDimension(index, aVar.f6991e.f7014d));
                    break;
                case 24:
                    c0148a.b(24, typedArray.getDimensionPixelSize(index, aVar.f6991e.H));
                    break;
                case 27:
                    c0148a.b(27, typedArray.getInt(index, aVar.f6991e.G));
                    break;
                case 28:
                    c0148a.b(28, typedArray.getDimensionPixelSize(index, aVar.f6991e.I));
                    break;
                case 31:
                    c0148a.b(31, typedArray.getDimensionPixelSize(index, aVar.f6991e.M));
                    break;
                case 34:
                    c0148a.b(34, typedArray.getDimensionPixelSize(index, aVar.f6991e.J));
                    break;
                case 37:
                    c0148a.a(37, typedArray.getFloat(index, aVar.f6991e.f7050z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f6987a);
                    aVar.f6987a = resourceId;
                    c0148a.b(38, resourceId);
                    break;
                case 39:
                    c0148a.a(39, typedArray.getFloat(index, aVar.f6991e.W));
                    break;
                case 40:
                    c0148a.a(40, typedArray.getFloat(index, aVar.f6991e.V));
                    break;
                case 41:
                    c0148a.b(41, typedArray.getInt(index, aVar.f6991e.X));
                    break;
                case 42:
                    c0148a.b(42, typedArray.getInt(index, aVar.f6991e.Y));
                    break;
                case 43:
                    c0148a.a(43, typedArray.getFloat(index, aVar.f6989c.f7069d));
                    break;
                case 44:
                    c0148a.d(44, true);
                    c0148a.a(44, typedArray.getDimension(index, aVar.f6992f.f7085n));
                    break;
                case 45:
                    c0148a.a(45, typedArray.getFloat(index, aVar.f6992f.f7074c));
                    break;
                case 46:
                    c0148a.a(46, typedArray.getFloat(index, aVar.f6992f.f7075d));
                    break;
                case 47:
                    c0148a.a(47, typedArray.getFloat(index, aVar.f6992f.f7076e));
                    break;
                case 48:
                    c0148a.a(48, typedArray.getFloat(index, aVar.f6992f.f7077f));
                    break;
                case 49:
                    c0148a.a(49, typedArray.getDimension(index, aVar.f6992f.f7078g));
                    break;
                case 50:
                    c0148a.a(50, typedArray.getDimension(index, aVar.f6992f.f7079h));
                    break;
                case 51:
                    c0148a.a(51, typedArray.getDimension(index, aVar.f6992f.f7081j));
                    break;
                case 52:
                    c0148a.a(52, typedArray.getDimension(index, aVar.f6992f.f7082k));
                    break;
                case 53:
                    c0148a.a(53, typedArray.getDimension(index, aVar.f6992f.f7083l));
                    break;
                case 54:
                    c0148a.b(54, typedArray.getInt(index, aVar.f6991e.Z));
                    break;
                case 55:
                    c0148a.b(55, typedArray.getInt(index, aVar.f6991e.f7009a0));
                    break;
                case 56:
                    c0148a.b(56, typedArray.getDimensionPixelSize(index, aVar.f6991e.f7011b0));
                    break;
                case 57:
                    c0148a.b(57, typedArray.getDimensionPixelSize(index, aVar.f6991e.f7013c0));
                    break;
                case 58:
                    c0148a.b(58, typedArray.getDimensionPixelSize(index, aVar.f6991e.f7015d0));
                    break;
                case 59:
                    c0148a.b(59, typedArray.getDimensionPixelSize(index, aVar.f6991e.f7017e0));
                    break;
                case 60:
                    c0148a.a(60, typedArray.getFloat(index, aVar.f6992f.f7073b));
                    break;
                case 62:
                    c0148a.b(62, typedArray.getDimensionPixelSize(index, aVar.f6991e.C));
                    break;
                case 63:
                    c0148a.a(63, typedArray.getFloat(index, aVar.f6991e.D));
                    break;
                case 64:
                    c0148a.b(64, M(typedArray, index, aVar.f6990d.f7053b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0148a.c(65, typedArray.getString(index));
                    } else {
                        c0148a.c(65, b5.c.f16443c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0148a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0148a.a(67, typedArray.getFloat(index, aVar.f6990d.f7060i));
                    break;
                case 68:
                    c0148a.a(68, typedArray.getFloat(index, aVar.f6989c.f7070e));
                    break;
                case 69:
                    c0148a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0148a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0148a.b(72, typedArray.getInt(index, aVar.f6991e.f7023h0));
                    break;
                case 73:
                    c0148a.b(73, typedArray.getDimensionPixelSize(index, aVar.f6991e.f7025i0));
                    break;
                case 74:
                    c0148a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0148a.d(75, typedArray.getBoolean(index, aVar.f6991e.f7039p0));
                    break;
                case 76:
                    c0148a.b(76, typedArray.getInt(index, aVar.f6990d.f7056e));
                    break;
                case 77:
                    c0148a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0148a.b(78, typedArray.getInt(index, aVar.f6989c.f7068c));
                    break;
                case 79:
                    c0148a.a(79, typedArray.getFloat(index, aVar.f6990d.f7058g));
                    break;
                case 80:
                    c0148a.d(80, typedArray.getBoolean(index, aVar.f6991e.f7035n0));
                    break;
                case 81:
                    c0148a.d(81, typedArray.getBoolean(index, aVar.f6991e.f7037o0));
                    break;
                case 82:
                    c0148a.b(82, typedArray.getInteger(index, aVar.f6990d.f7054c));
                    break;
                case 83:
                    c0148a.b(83, M(typedArray, index, aVar.f6992f.f7080i));
                    break;
                case 84:
                    c0148a.b(84, typedArray.getInteger(index, aVar.f6990d.f7062k));
                    break;
                case 85:
                    c0148a.a(85, typedArray.getFloat(index, aVar.f6990d.f7061j));
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        aVar.f6990d.f7065n = typedArray.getResourceId(index, -1);
                        c0148a.b(89, aVar.f6990d.f7065n);
                        c cVar = aVar.f6990d;
                        if (cVar.f7065n != -1) {
                            cVar.f7064m = -2;
                            c0148a.b(88, -2);
                        }
                    } else if (i12 == 3) {
                        aVar.f6990d.f7063l = typedArray.getString(index);
                        c0148a.c(90, aVar.f6990d.f7063l);
                        if (aVar.f6990d.f7063l.indexOf("/") > 0) {
                            aVar.f6990d.f7065n = typedArray.getResourceId(index, -1);
                            c0148a.b(89, aVar.f6990d.f7065n);
                            aVar.f6990d.f7064m = -2;
                            c0148a.b(88, -2);
                        } else {
                            aVar.f6990d.f7064m = -1;
                            c0148a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f6990d;
                        cVar2.f7064m = typedArray.getInteger(index, cVar2.f7065n);
                        c0148a.b(88, aVar.f6990d.f7064m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f6977j.get(index));
                    break;
                case 93:
                    c0148a.b(93, typedArray.getDimensionPixelSize(index, aVar.f6991e.N));
                    break;
                case 94:
                    c0148a.b(94, typedArray.getDimensionPixelSize(index, aVar.f6991e.U));
                    break;
                case 95:
                    N(c0148a, typedArray, index, 0);
                    break;
                case 96:
                    N(c0148a, typedArray, index, 1);
                    break;
                case 97:
                    c0148a.b(97, typedArray.getInt(index, aVar.f6991e.f7041q0));
                    break;
                case 98:
                    if (p.f6635d1) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f6987a);
                        aVar.f6987a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f6988b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f6988b = typedArray.getString(index);
                    } else {
                        aVar.f6987a = typedArray.getResourceId(index, aVar.f6987a);
                    }
                    break;
                case 99:
                    c0148a.d(99, typedArray.getBoolean(index, aVar.f6991e.f7024i));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U(a aVar, int i11, float f11) {
        if (i11 == 19) {
            aVar.f6991e.f7022h = f11;
            return;
        }
        if (i11 == 20) {
            aVar.f6991e.f7049y = f11;
            return;
        }
        if (i11 == 37) {
            aVar.f6991e.f7050z = f11;
            return;
        }
        if (i11 == 60) {
            aVar.f6992f.f7073b = f11;
            return;
        }
        if (i11 == 63) {
            aVar.f6991e.D = f11;
            return;
        }
        if (i11 == 79) {
            aVar.f6990d.f7058g = f11;
            return;
        }
        if (i11 == 85) {
            aVar.f6990d.f7061j = f11;
            return;
        }
        if (i11 != 87) {
            if (i11 == 39) {
                aVar.f6991e.W = f11;
                return;
            }
            if (i11 == 40) {
                aVar.f6991e.V = f11;
                return;
            }
            switch (i11) {
                case 43:
                    aVar.f6989c.f7069d = f11;
                    break;
                case 44:
                    e eVar = aVar.f6992f;
                    eVar.f7085n = f11;
                    eVar.f7084m = true;
                    break;
                case 45:
                    aVar.f6992f.f7074c = f11;
                    break;
                case 46:
                    aVar.f6992f.f7075d = f11;
                    break;
                case 47:
                    aVar.f6992f.f7076e = f11;
                    break;
                case 48:
                    aVar.f6992f.f7077f = f11;
                    break;
                case 49:
                    aVar.f6992f.f7078g = f11;
                    break;
                case 50:
                    aVar.f6992f.f7079h = f11;
                    break;
                case 51:
                    aVar.f6992f.f7081j = f11;
                    break;
                case 52:
                    aVar.f6992f.f7082k = f11;
                    break;
                case 53:
                    aVar.f6992f.f7083l = f11;
                    break;
                default:
                    switch (i11) {
                        case 67:
                            aVar.f6990d.f7060i = f11;
                            break;
                        case 68:
                            aVar.f6989c.f7070e = f11;
                            break;
                        case 69:
                            aVar.f6991e.f7019f0 = f11;
                            break;
                        case 70:
                            aVar.f6991e.f7021g0 = f11;
                            break;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(a aVar, int i11, int i12) {
        if (i11 == 6) {
            aVar.f6991e.E = i12;
            return;
        }
        if (i11 == 7) {
            aVar.f6991e.F = i12;
            return;
        }
        if (i11 == 8) {
            aVar.f6991e.L = i12;
            return;
        }
        if (i11 == 27) {
            aVar.f6991e.G = i12;
            return;
        }
        if (i11 == 28) {
            aVar.f6991e.I = i12;
            return;
        }
        if (i11 == 41) {
            aVar.f6991e.X = i12;
            return;
        }
        if (i11 == 42) {
            aVar.f6991e.Y = i12;
            return;
        }
        if (i11 == 61) {
            aVar.f6991e.B = i12;
            return;
        }
        if (i11 == 62) {
            aVar.f6991e.C = i12;
            return;
        }
        if (i11 == 72) {
            aVar.f6991e.f7023h0 = i12;
            return;
        }
        if (i11 == 73) {
            aVar.f6991e.f7025i0 = i12;
            return;
        }
        switch (i11) {
            case 2:
                aVar.f6991e.K = i12;
                break;
            case 11:
                aVar.f6991e.R = i12;
                break;
            case 12:
                aVar.f6991e.S = i12;
                break;
            case 13:
                aVar.f6991e.O = i12;
                break;
            case 14:
                aVar.f6991e.Q = i12;
                break;
            case 15:
                aVar.f6991e.T = i12;
                break;
            case 16:
                aVar.f6991e.P = i12;
                break;
            case 17:
                aVar.f6991e.f7018f = i12;
                break;
            case 18:
                aVar.f6991e.f7020g = i12;
                break;
            case 31:
                aVar.f6991e.M = i12;
                break;
            case 34:
                aVar.f6991e.J = i12;
                break;
            case 38:
                aVar.f6987a = i12;
                break;
            case 64:
                aVar.f6990d.f7053b = i12;
                break;
            case 66:
                aVar.f6990d.f7057f = i12;
                break;
            case 76:
                aVar.f6990d.f7056e = i12;
                break;
            case 78:
                aVar.f6989c.f7068c = i12;
                break;
            case 93:
                aVar.f6991e.N = i12;
                break;
            case 94:
                aVar.f6991e.U = i12;
                break;
            case 97:
                aVar.f6991e.f7041q0 = i12;
                break;
            default:
                switch (i11) {
                    case 21:
                        aVar.f6991e.f7016e = i12;
                        break;
                    case 22:
                        aVar.f6989c.f7067b = i12;
                        break;
                    case 23:
                        aVar.f6991e.f7014d = i12;
                        break;
                    case 24:
                        aVar.f6991e.H = i12;
                        break;
                    default:
                        switch (i11) {
                            case 54:
                                aVar.f6991e.Z = i12;
                                break;
                            case 55:
                                aVar.f6991e.f7009a0 = i12;
                                break;
                            case 56:
                                aVar.f6991e.f7011b0 = i12;
                                break;
                            case 57:
                                aVar.f6991e.f7013c0 = i12;
                                break;
                            case 58:
                                aVar.f6991e.f7015d0 = i12;
                                break;
                            case 59:
                                aVar.f6991e.f7017e0 = i12;
                                break;
                            default:
                                switch (i11) {
                                    case 82:
                                        aVar.f6990d.f7054c = i12;
                                        break;
                                    case 83:
                                        aVar.f6992f.f7080i = i12;
                                        break;
                                    case 84:
                                        aVar.f6990d.f7062k = i12;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 87:
                                                break;
                                            case 88:
                                                aVar.f6990d.f7064m = i12;
                                                break;
                                            case 89:
                                                aVar.f6990d.f7065n = i12;
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W(a aVar, int i11, String str) {
        if (i11 == 5) {
            aVar.f6991e.A = str;
            return;
        }
        if (i11 == 65) {
            aVar.f6990d.f7055d = str;
            return;
        }
        if (i11 == 74) {
            b bVar = aVar.f6991e;
            bVar.f7031l0 = str;
            bVar.f7029k0 = null;
        } else if (i11 == 77) {
            aVar.f6991e.f7033m0 = str;
        } else if (i11 != 87) {
            if (i11 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f6990d.f7063l = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void X(a aVar, int i11, boolean z11) {
        if (i11 == 44) {
            aVar.f6992f.f7084m = z11;
            return;
        }
        if (i11 == 75) {
            aVar.f6991e.f7039p0 = z11;
            return;
        }
        if (i11 != 87) {
            if (i11 == 80) {
                aVar.f6991e.f7035n0 = z11;
            } else if (i11 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f6991e.f7037o0 = z11;
            }
        }
    }

    private String f0(int i11) {
        switch (i11) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public static a m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, i.U2);
        R(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private int[] z(View view, String str) {
        int iIntValue;
        Object objK;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < strArrSplit.length) {
            String strTrim = strArrSplit[i11].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objK = ((ConstraintLayout) view.getParent()).k(0, strTrim)) != null && (objK instanceof Integer)) {
                iIntValue = ((Integer) objK).intValue();
            }
            iArr[i12] = iIntValue;
            i11++;
            i12++;
        }
        return i12 != strArrSplit.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    public void A(int i11, int i12, int i13, int i14, int[] iArr, float[] fArr, int i15) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            C(iArr[0]).f6991e.V = fArr[0];
        }
        C(iArr[0]).f6991e.Y = i15;
        s(iArr[0], 3, i11, i12, 0);
        for (int i16 = 1; i16 < iArr.length; i16++) {
            int i17 = i16 - 1;
            s(iArr[i16], 3, iArr[i17], 4, 0);
            s(iArr[i17], 4, iArr[i16], 3, 0);
            if (fArr != null) {
                C(iArr[i16]).f6991e.V = fArr[i16];
            }
        }
        s(iArr[iArr.length - 1], 4, i13, i14, 0);
    }

    public a D(int i11) {
        if (this.f6986h.containsKey(Integer.valueOf(i11))) {
            return this.f6986h.get(Integer.valueOf(i11));
        }
        return null;
    }

    public int E(int i11) {
        return C(i11).f6991e.f7016e;
    }

    public int[] F() {
        Integer[] numArr = (Integer[]) this.f6986h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
        return iArr;
    }

    public a G(int i11) {
        return C(i11);
    }

    public int H(int i11) {
        return C(i11).f6989c.f7067b;
    }

    public int I(int i11) {
        return C(i11).f6989c.f7068c;
    }

    public int J(int i11) {
        return C(i11).f6991e.f7014d;
    }

    public void K(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarB = B(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarB.f6991e.f7008a = true;
                    }
                    this.f6986h.put(Integer.valueOf(aVarB.f6987a), aVarB);
                }
            }
        } catch (IOException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i11, e11);
        } catch (XmlPullParserException e12) {
            Log.e("ConstraintSet", "Error parsing resource: " + i11, e12);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void L(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarB = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarB == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarB.f6991e.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarB == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarB.f6990d.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarB = B(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarB == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarB.f6989c.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarB == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarB.f6992f.b(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarB = B(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarB.f6991e;
                                bVar.f7008a = true;
                                bVar.f7010b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarB = B(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarB.f6991e.f7027j0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarB = B(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarB == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.a.i(context, xmlPullParser, aVarB.f6993g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f6986h.put(Integer.valueOf(aVarB.f6987a), aVarB);
                    aVarB = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            Log.e("ConstraintSet", "Error parsing XML resource", e11);
        } catch (XmlPullParserException e12) {
            Log.e("ConstraintSet", "Error parsing XML resource", e12);
        }
    }

    public void S(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f6985g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f6986h.containsKey(Integer.valueOf(id2))) {
                this.f6986h.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f6986h.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f6991e.f7010b) {
                    aVar.g(id2, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.b) {
                        aVar.f6991e.f7029k0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f6991e.f7039p0 = barrier.getAllowsGoneWidget();
                            aVar.f6991e.f7023h0 = barrier.getType();
                            aVar.f6991e.f7025i0 = barrier.getMargin();
                        }
                    }
                    aVar.f6991e.f7010b = true;
                }
                C0149d c0149d = aVar.f6989c;
                if (!c0149d.f7066a) {
                    c0149d.f7067b = childAt.getVisibility();
                    aVar.f6989c.f7069d = childAt.getAlpha();
                    aVar.f6989c.f7066a = true;
                }
                e eVar = aVar.f6992f;
                if (!eVar.f7072a) {
                    eVar.f7072a = true;
                    eVar.f7073b = childAt.getRotation();
                    aVar.f6992f.f7074c = childAt.getRotationX();
                    aVar.f6992f.f7075d = childAt.getRotationY();
                    aVar.f6992f.f7076e = childAt.getScaleX();
                    aVar.f6992f.f7077f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f6992f;
                        eVar2.f7078g = pivotX;
                        eVar2.f7079h = pivotY;
                    }
                    aVar.f6992f.f7081j = childAt.getTranslationX();
                    aVar.f6992f.f7082k = childAt.getTranslationY();
                    aVar.f6992f.f7083l = childAt.getTranslationZ();
                    e eVar3 = aVar.f6992f;
                    if (eVar3.f7084m) {
                        eVar3.f7085n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void T(d dVar) {
        for (Integer num : dVar.f6986h.keySet()) {
            num.intValue();
            a aVar = dVar.f6986h.get(num);
            if (!this.f6986h.containsKey(num)) {
                this.f6986h.put(num, new a());
            }
            a aVar2 = this.f6986h.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f6991e;
                if (!bVar.f7010b) {
                    bVar.a(aVar.f6991e);
                }
                C0149d c0149d = aVar2.f6989c;
                if (!c0149d.f7066a) {
                    c0149d.a(aVar.f6989c);
                }
                e eVar = aVar2.f6992f;
                if (!eVar.f7072a) {
                    eVar.a(aVar.f6992f);
                }
                c cVar = aVar2.f6990d;
                if (!cVar.f7052a) {
                    cVar.a(aVar.f6990d);
                }
                for (String str : aVar.f6993g.keySet()) {
                    if (!aVar2.f6993g.containsKey(str)) {
                        aVar2.f6993g.put(str, aVar.f6993g.get(str));
                    }
                }
            }
        }
    }

    public void Y(boolean z11) {
        this.f6985g = z11;
    }

    public void Z(int i11, float f11) {
        C(i11).f6991e.f7049y = f11;
    }

    public void a0(int i11, float f11) {
        C(i11).f6991e.W = f11;
    }

    public void b0(int i11, int i12, int i13) {
        a aVarC = C(i11);
        switch (i12) {
            case 1:
                aVarC.f6991e.H = i13;
                return;
            case 2:
                aVarC.f6991e.I = i13;
                return;
            case 3:
                aVarC.f6991e.J = i13;
                return;
            case 4:
                aVarC.f6991e.K = i13;
                return;
            case 5:
                aVarC.f6991e.N = i13;
                return;
            case 6:
                aVarC.f6991e.M = i13;
                return;
            case 7:
                aVarC.f6991e.L = i13;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void c0(String str) {
        this.f6982d = str.split(",");
        int i11 = 0;
        while (true) {
            String[] strArr = this.f6982d;
            if (i11 >= strArr.length) {
                return;
            }
            strArr[i11] = strArr[i11].trim();
            i11++;
        }
    }

    public void d0(boolean z11) {
        this.f6979a = z11;
    }

    public void e0(int i11, float f11) {
        C(i11).f6991e.f7050z = f11;
    }

    public void g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.f6986h.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.d(childAt));
            } else {
                if (this.f6985g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f6986h.containsKey(Integer.valueOf(id2)) && (aVar = this.f6986h.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.a.j(childAt, aVar.f6993g);
                }
            }
        }
    }

    public void h(d dVar) {
        for (a aVar : dVar.f6986h.values()) {
            if (aVar.f6994h != null) {
                if (aVar.f6988b == null) {
                    aVar.f6994h.e(D(aVar.f6987a));
                } else {
                    Iterator<Integer> it = this.f6986h.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarD = D(it.next().intValue());
                        String str = aVarD.f6991e.f7033m0;
                        if (str != null && aVar.f6988b.matches(str)) {
                            aVar.f6994h.e(aVarD);
                            aVarD.f6993g.putAll((HashMap) aVar.f6993g.clone());
                        }
                    }
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void j(androidx.constraintlayout.widget.b bVar, d5.e eVar, ConstraintLayout.b bVar2, SparseArray<d5.e> sparseArray) {
        a aVar;
        int id2 = bVar.getId();
        if (this.f6986h.containsKey(Integer.valueOf(id2)) && (aVar = this.f6986h.get(Integer.valueOf(id2))) != null && (eVar instanceof d5.j)) {
            bVar.p(aVar, (d5.j) eVar, bVar2, sparseArray);
        }
    }

    void k(ConstraintLayout constraintLayout, boolean z11) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f6986h.keySet());
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.f6986h.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.d(childAt));
            } else {
                if (this.f6985g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f6986h.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f6986h.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f6991e.f7027j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f6991e.f7023h0);
                                barrier.setMargin(aVar.f6991e.f7025i0);
                                barrier.setAllowsGoneWidget(aVar.f6991e.f7039p0);
                                b bVar = aVar.f6991e;
                                int[] iArr = bVar.f7029k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f7031l0;
                                    if (str != null) {
                                        bVar.f7029k0 = z(barrier, str);
                                        barrier.setReferencedIds(aVar.f6991e.f7029k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.b();
                            aVar.e(bVar2);
                            if (z11) {
                                androidx.constraintlayout.widget.a.j(childAt, aVar.f6993g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0149d c0149d = aVar.f6989c;
                            if (c0149d.f7068c == 0) {
                                childAt.setVisibility(c0149d.f7067b);
                            }
                            childAt.setAlpha(aVar.f6989c.f7069d);
                            childAt.setRotation(aVar.f6992f.f7073b);
                            childAt.setRotationX(aVar.f6992f.f7074c);
                            childAt.setRotationY(aVar.f6992f.f7075d);
                            childAt.setScaleX(aVar.f6992f.f7076e);
                            childAt.setScaleY(aVar.f6992f.f7077f);
                            e eVar = aVar.f6992f;
                            if (eVar.f7080i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f6992f.f7080i);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f7078g)) {
                                    childAt.setPivotX(aVar.f6992f.f7078g);
                                }
                                if (!Float.isNaN(aVar.f6992f.f7079h)) {
                                    childAt.setPivotY(aVar.f6992f.f7079h);
                                }
                            }
                            childAt.setTranslationX(aVar.f6992f.f7081j);
                            childAt.setTranslationY(aVar.f6992f.f7082k);
                            childAt.setTranslationZ(aVar.f6992f.f7083l);
                            e eVar2 = aVar.f6992f;
                            if (eVar2.f7084m) {
                                childAt.setElevation(eVar2.f7085n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f6986h.get(num);
            if (aVar2 != null) {
                if (aVar2.f6991e.f7027j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f6991e;
                    int[] iArr2 = bVar3.f7029k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f7031l0;
                        if (str2 != null) {
                            bVar3.f7029k0 = z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f6991e.f7029k0);
                        }
                    }
                    barrier2.setType(aVar2.f6991e.f7023h0);
                    barrier2.setMargin(aVar2.f6991e.f7025i0);
                    ConstraintLayout.b bVarI = constraintLayout.generateDefaultLayoutParams();
                    barrier2.w();
                    aVar2.e(bVarI);
                    constraintLayout.addView(barrier2, bVarI);
                }
                if (aVar2.f6991e.f7008a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarI2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.e(bVarI2);
                    constraintLayout.addView(guideline, bVarI2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).j(constraintLayout);
            }
        }
    }

    public void l(int i11, ConstraintLayout.b bVar) {
        a aVar;
        if (!this.f6986h.containsKey(Integer.valueOf(i11)) || (aVar = this.f6986h.get(Integer.valueOf(i11))) == null) {
            return;
        }
        aVar.e(bVar);
    }

    public void n(Context context, int i11) {
        o((ConstraintLayout) LayoutInflater.from(context).inflate(i11, (ViewGroup) null));
    }

    public void o(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f6986h.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f6985g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f6986h.containsKey(Integer.valueOf(id2))) {
                this.f6986h.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f6986h.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f6993g = androidx.constraintlayout.widget.a.b(this.f6984f, childAt);
                aVar.g(id2, bVar);
                aVar.f6989c.f7067b = childAt.getVisibility();
                aVar.f6989c.f7069d = childAt.getAlpha();
                aVar.f6992f.f7073b = childAt.getRotation();
                aVar.f6992f.f7074c = childAt.getRotationX();
                aVar.f6992f.f7075d = childAt.getRotationY();
                aVar.f6992f.f7076e = childAt.getScaleX();
                aVar.f6992f.f7077f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f6992f;
                    eVar.f7078g = pivotX;
                    eVar.f7079h = pivotY;
                }
                aVar.f6992f.f7081j = childAt.getTranslationX();
                aVar.f6992f.f7082k = childAt.getTranslationY();
                aVar.f6992f.f7083l = childAt.getTranslationZ();
                e eVar2 = aVar.f6992f;
                if (eVar2.f7084m) {
                    eVar2.f7085n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f6991e.f7039p0 = barrier.getAllowsGoneWidget();
                    aVar.f6991e.f7029k0 = barrier.getReferencedIds();
                    aVar.f6991e.f7023h0 = barrier.getType();
                    aVar.f6991e.f7025i0 = barrier.getMargin();
                }
            }
        }
    }

    public void p(d dVar) {
        this.f6986h.clear();
        for (Integer num : dVar.f6986h.keySet()) {
            a aVar = dVar.f6986h.get(num);
            if (aVar != null) {
                this.f6986h.put(num, aVar.clone());
            }
        }
    }

    public void q(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f6986h.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = eVar.getChildAt(i11);
            androidx.constraintlayout.widget.e.a aVar = (androidx.constraintlayout.widget.e.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f6985g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f6986h.containsKey(Integer.valueOf(id2))) {
                this.f6986h.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f6986h.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.i((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.h(id2, aVar);
            }
        }
    }

    public void r(int i11, int i12, int i13, int i14) {
        if (!this.f6986h.containsKey(Integer.valueOf(i11))) {
            this.f6986h.put(Integer.valueOf(i11), new a());
        }
        a aVar = this.f6986h.get(Integer.valueOf(i11));
        if (aVar == null) {
            return;
        }
        switch (i12) {
            case 1:
                if (i14 == 1) {
                    b bVar = aVar.f6991e;
                    bVar.f7026j = i13;
                    bVar.f7028k = -1;
                    return;
                } else if (i14 == 2) {
                    b bVar2 = aVar.f6991e;
                    bVar2.f7028k = i13;
                    bVar2.f7026j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + f0(i14) + " undefined");
                }
            case 2:
                if (i14 == 1) {
                    b bVar3 = aVar.f6991e;
                    bVar3.f7030l = i13;
                    bVar3.f7032m = -1;
                    return;
                } else if (i14 == 2) {
                    b bVar4 = aVar.f6991e;
                    bVar4.f7032m = i13;
                    bVar4.f7030l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                }
            case 3:
                if (i14 == 3) {
                    b bVar5 = aVar.f6991e;
                    bVar5.f7034n = i13;
                    bVar5.f7036o = -1;
                    bVar5.f7042r = -1;
                    bVar5.f7043s = -1;
                    bVar5.f7044t = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                }
                b bVar6 = aVar.f6991e;
                bVar6.f7036o = i13;
                bVar6.f7034n = -1;
                bVar6.f7042r = -1;
                bVar6.f7043s = -1;
                bVar6.f7044t = -1;
                return;
            case 4:
                if (i14 == 4) {
                    b bVar7 = aVar.f6991e;
                    bVar7.f7040q = i13;
                    bVar7.f7038p = -1;
                    bVar7.f7042r = -1;
                    bVar7.f7043s = -1;
                    bVar7.f7044t = -1;
                    return;
                }
                if (i14 != 3) {
                    throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                }
                b bVar8 = aVar.f6991e;
                bVar8.f7038p = i13;
                bVar8.f7040q = -1;
                bVar8.f7042r = -1;
                bVar8.f7043s = -1;
                bVar8.f7044t = -1;
                return;
            case 5:
                if (i14 == 5) {
                    b bVar9 = aVar.f6991e;
                    bVar9.f7042r = i13;
                    bVar9.f7040q = -1;
                    bVar9.f7038p = -1;
                    bVar9.f7034n = -1;
                    bVar9.f7036o = -1;
                    return;
                }
                if (i14 == 3) {
                    b bVar10 = aVar.f6991e;
                    bVar10.f7043s = i13;
                    bVar10.f7040q = -1;
                    bVar10.f7038p = -1;
                    bVar10.f7034n = -1;
                    bVar10.f7036o = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                }
                b bVar11 = aVar.f6991e;
                bVar11.f7044t = i13;
                bVar11.f7040q = -1;
                bVar11.f7038p = -1;
                bVar11.f7034n = -1;
                bVar11.f7036o = -1;
                return;
            case 6:
                if (i14 == 6) {
                    b bVar12 = aVar.f6991e;
                    bVar12.f7046v = i13;
                    bVar12.f7045u = -1;
                    return;
                } else if (i14 == 7) {
                    b bVar13 = aVar.f6991e;
                    bVar13.f7045u = i13;
                    bVar13.f7046v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                }
            case 7:
                if (i14 == 7) {
                    b bVar14 = aVar.f6991e;
                    bVar14.f7048x = i13;
                    bVar14.f7047w = -1;
                    return;
                } else if (i14 == 6) {
                    b bVar15 = aVar.f6991e;
                    bVar15.f7047w = i13;
                    bVar15.f7048x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                }
            default:
                throw new IllegalArgumentException(f0(i12) + " to " + f0(i14) + " unknown");
        }
    }

    public void s(int i11, int i12, int i13, int i14, int i15) {
        if (!this.f6986h.containsKey(Integer.valueOf(i11))) {
            this.f6986h.put(Integer.valueOf(i11), new a());
        }
        a aVar = this.f6986h.get(Integer.valueOf(i11));
        if (aVar == null) {
            return;
        }
        switch (i12) {
            case 1:
                if (i14 == 1) {
                    b bVar = aVar.f6991e;
                    bVar.f7026j = i13;
                    bVar.f7028k = -1;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException("Left to " + f0(i14) + " undefined");
                    }
                    b bVar2 = aVar.f6991e;
                    bVar2.f7028k = i13;
                    bVar2.f7026j = -1;
                }
                aVar.f6991e.H = i15;
                return;
            case 2:
                if (i14 == 1) {
                    b bVar3 = aVar.f6991e;
                    bVar3.f7030l = i13;
                    bVar3.f7032m = -1;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                    }
                    b bVar4 = aVar.f6991e;
                    bVar4.f7032m = i13;
                    bVar4.f7030l = -1;
                }
                aVar.f6991e.I = i15;
                return;
            case 3:
                if (i14 == 3) {
                    b bVar5 = aVar.f6991e;
                    bVar5.f7034n = i13;
                    bVar5.f7036o = -1;
                    bVar5.f7042r = -1;
                    bVar5.f7043s = -1;
                    bVar5.f7044t = -1;
                } else {
                    if (i14 != 4) {
                        throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                    }
                    b bVar6 = aVar.f6991e;
                    bVar6.f7036o = i13;
                    bVar6.f7034n = -1;
                    bVar6.f7042r = -1;
                    bVar6.f7043s = -1;
                    bVar6.f7044t = -1;
                }
                aVar.f6991e.J = i15;
                return;
            case 4:
                if (i14 == 4) {
                    b bVar7 = aVar.f6991e;
                    bVar7.f7040q = i13;
                    bVar7.f7038p = -1;
                    bVar7.f7042r = -1;
                    bVar7.f7043s = -1;
                    bVar7.f7044t = -1;
                } else {
                    if (i14 != 3) {
                        throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                    }
                    b bVar8 = aVar.f6991e;
                    bVar8.f7038p = i13;
                    bVar8.f7040q = -1;
                    bVar8.f7042r = -1;
                    bVar8.f7043s = -1;
                    bVar8.f7044t = -1;
                }
                aVar.f6991e.K = i15;
                return;
            case 5:
                if (i14 == 5) {
                    b bVar9 = aVar.f6991e;
                    bVar9.f7042r = i13;
                    bVar9.f7040q = -1;
                    bVar9.f7038p = -1;
                    bVar9.f7034n = -1;
                    bVar9.f7036o = -1;
                    return;
                }
                if (i14 == 3) {
                    b bVar10 = aVar.f6991e;
                    bVar10.f7043s = i13;
                    bVar10.f7040q = -1;
                    bVar10.f7038p = -1;
                    bVar10.f7034n = -1;
                    bVar10.f7036o = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                }
                b bVar11 = aVar.f6991e;
                bVar11.f7044t = i13;
                bVar11.f7040q = -1;
                bVar11.f7038p = -1;
                bVar11.f7034n = -1;
                bVar11.f7036o = -1;
                return;
            case 6:
                if (i14 == 6) {
                    b bVar12 = aVar.f6991e;
                    bVar12.f7046v = i13;
                    bVar12.f7045u = -1;
                } else {
                    if (i14 != 7) {
                        throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                    }
                    b bVar13 = aVar.f6991e;
                    bVar13.f7045u = i13;
                    bVar13.f7046v = -1;
                }
                aVar.f6991e.M = i15;
                return;
            case 7:
                if (i14 == 7) {
                    b bVar14 = aVar.f6991e;
                    bVar14.f7048x = i13;
                    bVar14.f7047w = -1;
                } else {
                    if (i14 != 6) {
                        throw new IllegalArgumentException("right to " + f0(i14) + " undefined");
                    }
                    b bVar15 = aVar.f6991e;
                    bVar15.f7047w = i13;
                    bVar15.f7048x = -1;
                }
                aVar.f6991e.L = i15;
                return;
            default:
                throw new IllegalArgumentException(f0(i12) + " to " + f0(i14) + " unknown");
        }
    }

    public void t(int i11, int i12, int i13, float f11) {
        b bVar = C(i11).f6991e;
        bVar.B = i12;
        bVar.C = i13;
        bVar.D = f11;
    }

    public void u(int i11, int i12) {
        C(i11).f6991e.Z = i12;
    }

    public void v(int i11, int i12) {
        C(i11).f6991e.f7016e = i12;
    }

    public void w(int i11, int i12) {
        C(i11).f6991e.f7014d = i12;
    }

    public void x(int i11, boolean z11) {
        C(i11).f6991e.f7037o0 = z11;
    }

    public void y(int i11, boolean z11) {
        C(i11).f6991e.f7035n0 = z11;
    }
}
