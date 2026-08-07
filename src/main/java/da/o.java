package da;

import com.plaid.internal.EnumC4419g;
import java.util.Arrays;
import java.util.Collections;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f60142m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f60143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.c0 f60145c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f60148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f60149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f60150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f60151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private w8.o0 f60152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60153k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f60146d = new boolean[4];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f60147e = new a(128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f60154l = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f60155f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f60156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f60157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f60159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f60160e;

        public a(int i11) {
            this.f60160e = new byte[i11];
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f60156a) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.f60160e;
                int length = bArr2.length;
                int i14 = this.f60158c;
                if (length < i14 + i13) {
                    this.f60160e = Arrays.copyOf(bArr2, (i14 + i13) * 2);
                }
                System.arraycopy(bArr, i11, this.f60160e, this.f60158c, i13);
                this.f60158c += i13;
            }
        }

        public boolean b(int i11, int i12) {
            int i13 = this.f60157b;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i11 == 179 || i11 == 181) {
                                this.f60158c -= i12;
                                this.f60156a = false;
                                return true;
                            }
                        } else if ((i11 & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) != 32) {
                            s7.t.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f60159d = this.f60158c;
                            this.f60157b = 4;
                        }
                    } else if (i11 > 31) {
                        s7.t.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f60157b = 3;
                    }
                } else if (i11 != 181) {
                    s7.t.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f60157b = 2;
                }
            } else if (i11 == 176) {
                this.f60157b = 1;
                this.f60156a = true;
            }
            byte[] bArr = f60155f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f60156a = false;
            this.f60158c = 0;
            this.f60157b = 0;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w8.o0 f60161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f60162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f60163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f60164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f60165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f60166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f60167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f60168h;

        public b(w8.o0 o0Var) {
            this.f60161a = o0Var;
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f60163c) {
                int i13 = this.f60166f;
                int i14 = (i11 + 1) - i13;
                if (i14 >= i12) {
                    this.f60166f = i13 + (i12 - i11);
                } else {
                    this.f60164d = ((bArr[i14] & 192) >> 6) == 0;
                    this.f60163c = false;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void b(long j11, int i11, boolean z11) {
            s7.a.h(this.f60168h != -9223372036854775807L);
            if (this.f60165e == 182 && z11 && this.f60162b) {
                this.f60161a.b(this.f60168h, this.f60164d ? 1 : 0, (int) (j11 - this.f60167g), i11, null);
            }
            if (this.f60165e != 179) {
                this.f60167g = j11;
            }
        }

        public void c(int i11, long j11) {
            this.f60165e = i11;
            this.f60164d = false;
            this.f60162b = i11 == 182 || i11 == 179;
            this.f60163c = i11 == 182;
            this.f60166f = 0;
            this.f60168h = j11;
        }

        public void d() {
            this.f60162b = false;
            this.f60163c = false;
            this.f60164d = false;
            this.f60165e = -1;
        }
    }

    o(o0 o0Var, String str) {
        this.f60143a = o0Var;
        this.f60144b = str;
        if (o0Var != null) {
            this.f60148f = new w(178, 128);
            this.f60145c = new s7.c0();
        } else {
            this.f60148f = null;
            this.f60145c = null;
        }
    }

    private static p7.u f(a aVar, int i11, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f60160e, aVar.f60158c);
        s7.b0 b0Var = new s7.b0(bArrCopyOf);
        b0Var.s(i11);
        b0Var.s(4);
        b0Var.q();
        b0Var.r(8);
        if (b0Var.g()) {
            b0Var.r(4);
            b0Var.r(3);
        }
        int iH = b0Var.h(4);
        float f11 = 1.0f;
        if (iH == 15) {
            int iH2 = b0Var.h(8);
            int iH3 = b0Var.h(8);
            if (iH3 == 0) {
                s7.t.i("H263Reader", "Invalid aspect ratio");
            } else {
                f11 = iH2 / iH3;
            }
        } else {
            float[] fArr = f60142m;
            if (iH < fArr.length) {
                f11 = fArr[iH];
            } else {
                s7.t.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (b0Var.g()) {
            b0Var.r(2);
            b0Var.r(1);
            if (b0Var.g()) {
                b0Var.r(15);
                b0Var.q();
                b0Var.r(15);
                b0Var.q();
                b0Var.r(15);
                b0Var.q();
                b0Var.r(3);
                b0Var.r(11);
                b0Var.q();
                b0Var.r(15);
                b0Var.q();
            }
        }
        if (b0Var.h(2) != 0) {
            s7.t.i("H263Reader", "Unhandled video object layer shape");
        }
        b0Var.q();
        int iH4 = b0Var.h(16);
        b0Var.q();
        if (b0Var.g()) {
            if (iH4 == 0) {
                s7.t.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i12 = 0;
                for (int i13 = iH4 - 1; i13 > 0; i13 >>= 1) {
                    i12++;
                }
                b0Var.r(i12);
            }
        }
        b0Var.q();
        int iH5 = b0Var.h(13);
        b0Var.q();
        int iH6 = b0Var.h(13);
        b0Var.q();
        b0Var.q();
        return new p7.u.b().j0(str).W(str2).y0("video/mp4v-es").F0(iH5).h0(iH6).u0(f11).k0(Collections.singletonList(bArrCopyOf)).P();
    }

    @Override // da.m
    public void a() {
        t7.h.c(this.f60146d);
        this.f60147e.c();
        b bVar = this.f60149g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f60148f;
        if (wVar != null) {
            wVar.d();
        }
        this.f60150h = 0L;
        this.f60154l = -9223372036854775807L;
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        s7.a.j(this.f60149g);
        s7.a.j(this.f60152j);
        int iG = c0Var.g();
        int iJ = c0Var.j();
        byte[] bArrF = c0Var.f();
        this.f60150h += (long) c0Var.a();
        this.f60152j.f(c0Var, c0Var.a());
        while (true) {
            int iE = t7.h.e(bArrF, iG, iJ, this.f60146d);
            if (iE == iJ) {
                break;
            }
            int i11 = iE + 3;
            int i12 = c0Var.f()[i11] & 255;
            int i13 = iE - iG;
            int i14 = 0;
            if (!this.f60153k) {
                if (i13 > 0) {
                    this.f60147e.a(bArrF, iG, iE);
                }
                if (this.f60147e.b(i12, i13 < 0 ? -i13 : 0)) {
                    w8.o0 o0Var = this.f60152j;
                    a aVar = this.f60147e;
                    o0Var.g(f(aVar, aVar.f60159d, (String) s7.a.f(this.f60151i), this.f60144b));
                    this.f60153k = true;
                }
            }
            this.f60149g.a(bArrF, iG, iE);
            w wVar = this.f60148f;
            if (wVar != null) {
                if (i13 > 0) {
                    wVar.a(bArrF, iG, iE);
                } else {
                    i14 = -i13;
                }
                if (this.f60148f.b(i14)) {
                    w wVar2 = this.f60148f;
                    ((s7.c0) q0.l(this.f60145c)).Z(this.f60148f.f60328d, t7.h.L(wVar2.f60328d, wVar2.f60329e));
                    ((o0) q0.l(this.f60143a)).b(this.f60154l, this.f60145c);
                }
                if (i12 == 178 && c0Var.f()[iE + 2] == 1) {
                    this.f60148f.e(i12);
                }
            }
            int i15 = iJ - iE;
            this.f60149g.b(this.f60150h - ((long) i15), i15, this.f60153k);
            this.f60149g.c(i12, this.f60154l);
            iG = i11;
        }
        if (!this.f60153k) {
            this.f60147e.a(bArrF, iG, iJ);
        }
        this.f60149g.a(bArrF, iG, iJ);
        w wVar3 = this.f60148f;
        if (wVar3 != null) {
            wVar3.a(bArrF, iG, iJ);
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60154l = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60151i = dVar.b();
        w8.o0 o0VarB = rVar.b(dVar.c(), 2);
        this.f60152j = o0VarB;
        this.f60149g = new b(o0VarB);
        o0 o0Var = this.f60143a;
        if (o0Var != null) {
            o0Var.c(rVar, dVar);
        }
    }

    @Override // da.m
    public void e(boolean z11) {
        s7.a.j(this.f60149g);
        if (z11) {
            this.f60149g.b(this.f60150h, 0, this.f60153k);
            this.f60149g.d();
        }
    }
}
