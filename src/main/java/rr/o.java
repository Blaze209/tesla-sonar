package rr;

import com.google.android.exoplayer2.u0;
import com.plaid.internal.EnumC4419g;
import java.util.Arrays;
import java.util.Collections;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f108896l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f108897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.d0 f108898b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f108901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f108902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f108903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f108904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private hr.b0 f108905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f108906j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f108899c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f108900d = new a(128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f108907k = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f108908f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f108909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f108910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f108911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f108912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f108913e;

        public a(int i11) {
            this.f108913e = new byte[i11];
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f108909a) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.f108913e;
                int length = bArr2.length;
                int i14 = this.f108911c;
                if (length < i14 + i13) {
                    this.f108913e = Arrays.copyOf(bArr2, (i14 + i13) * 2);
                }
                System.arraycopy(bArr, i11, this.f108913e, this.f108911c, i13);
                this.f108911c += i13;
            }
        }

        public boolean b(int i11, int i12) {
            int i13 = this.f108910b;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i11 == 179 || i11 == 181) {
                                this.f108911c -= i12;
                                this.f108909a = false;
                                return true;
                            }
                        } else if ((i11 & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) != 32) {
                            ts.u.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f108912d = this.f108911c;
                            this.f108910b = 4;
                        }
                    } else if (i11 > 31) {
                        ts.u.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f108910b = 3;
                    }
                } else if (i11 != 181) {
                    ts.u.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f108910b = 2;
                }
            } else if (i11 == 176) {
                this.f108910b = 1;
                this.f108909a = true;
            }
            byte[] bArr = f108908f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f108909a = false;
            this.f108911c = 0;
            this.f108910b = 0;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hr.b0 f108914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f108915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f108916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f108917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f108918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f108919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f108920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f108921h;

        public b(hr.b0 b0Var) {
            this.f108914a = b0Var;
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f108916c) {
                int i13 = this.f108919f;
                int i14 = (i11 + 1) - i13;
                if (i14 >= i12) {
                    this.f108919f = i13 + (i12 - i11);
                } else {
                    this.f108917d = ((bArr[i14] & 192) >> 6) == 0;
                    this.f108916c = false;
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
            if (this.f108918e == 182 && z11 && this.f108915b) {
                long j12 = this.f108921h;
                if (j12 != -9223372036854775807L) {
                    this.f108914a.e(j12, this.f108917d ? 1 : 0, (int) (j11 - this.f108920g), i11, null);
                }
            }
            if (this.f108918e != 179) {
                this.f108920g = j11;
            }
        }

        public void c(int i11, long j11) {
            this.f108918e = i11;
            this.f108917d = false;
            this.f108915b = i11 == 182 || i11 == 179;
            this.f108916c = i11 == 182;
            this.f108919f = 0;
            this.f108921h = j11;
        }

        public void d() {
            this.f108915b = false;
            this.f108916c = false;
            this.f108917d = false;
            this.f108918e = -1;
        }
    }

    o(k0 k0Var) {
        this.f108897a = k0Var;
        if (k0Var != null) {
            this.f108901e = new u(178, 128);
            this.f108898b = new ts.d0();
        } else {
            this.f108901e = null;
            this.f108898b = null;
        }
    }

    private static u0 f(a aVar, int i11, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f108913e, aVar.f108911c);
        ts.c0 c0Var = new ts.c0(bArrCopyOf);
        c0Var.s(i11);
        c0Var.s(4);
        c0Var.q();
        c0Var.r(8);
        if (c0Var.g()) {
            c0Var.r(4);
            c0Var.r(3);
        }
        int iH = c0Var.h(4);
        float f11 = 1.0f;
        if (iH == 15) {
            int iH2 = c0Var.h(8);
            int iH3 = c0Var.h(8);
            if (iH3 == 0) {
                ts.u.i("H263Reader", "Invalid aspect ratio");
            } else {
                f11 = iH2 / iH3;
            }
        } else {
            float[] fArr = f108896l;
            if (iH < fArr.length) {
                f11 = fArr[iH];
            } else {
                ts.u.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c0Var.g()) {
            c0Var.r(2);
            c0Var.r(1);
            if (c0Var.g()) {
                c0Var.r(15);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
                c0Var.r(3);
                c0Var.r(11);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
            }
        }
        if (c0Var.h(2) != 0) {
            ts.u.i("H263Reader", "Unhandled video object layer shape");
        }
        c0Var.q();
        int iH4 = c0Var.h(16);
        c0Var.q();
        if (c0Var.g()) {
            if (iH4 == 0) {
                ts.u.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i12 = 0;
                for (int i13 = iH4 - 1; i13 > 0; i13 >>= 1) {
                    i12++;
                }
                c0Var.r(i12);
            }
        }
        c0Var.q();
        int iH5 = c0Var.h(13);
        c0Var.q();
        int iH6 = c0Var.h(13);
        c0Var.q();
        c0Var.q();
        return new u0.b().U(str).g0("video/mp4v-es").n0(iH5).S(iH6).c0(f11).V(Collections.singletonList(bArrCopyOf)).G();
    }

    @Override // rr.m
    public void a() {
        ts.z.a(this.f108899c);
        this.f108900d.c();
        b bVar = this.f108902f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f108901e;
        if (uVar != null) {
            uVar.d();
        }
        this.f108903g = 0L;
        this.f108907k = -9223372036854775807L;
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        ts.a.i(this.f108902f);
        ts.a.i(this.f108905i);
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        this.f108903g += (long) d0Var.a();
        this.f108905i.d(d0Var, d0Var.a());
        while (true) {
            int iC = ts.z.c(bArrE, iF, iG, this.f108899c);
            if (iC == iG) {
                break;
            }
            int i11 = iC + 3;
            int i12 = d0Var.e()[i11] & 255;
            int i13 = iC - iF;
            int i14 = 0;
            if (!this.f108906j) {
                if (i13 > 0) {
                    this.f108900d.a(bArrE, iF, iC);
                }
                if (this.f108900d.b(i12, i13 < 0 ? -i13 : 0)) {
                    hr.b0 b0Var = this.f108905i;
                    a aVar = this.f108900d;
                    b0Var.b(f(aVar, aVar.f108912d, (String) ts.a.e(this.f108904h)));
                    this.f108906j = true;
                }
            }
            this.f108902f.a(bArrE, iF, iC);
            u uVar = this.f108901e;
            if (uVar != null) {
                if (i13 > 0) {
                    uVar.a(bArrE, iF, iC);
                } else {
                    i14 = -i13;
                }
                if (this.f108901e.b(i14)) {
                    u uVar2 = this.f108901e;
                    ((ts.d0) p0.j(this.f108898b)).S(this.f108901e.f109040d, ts.z.q(uVar2.f109040d, uVar2.f109041e));
                    ((k0) p0.j(this.f108897a)).a(this.f108907k, this.f108898b);
                }
                if (i12 == 178 && d0Var.e()[iC + 2] == 1) {
                    this.f108901e.e(i12);
                }
            }
            int i15 = iG - iC;
            this.f108902f.b(this.f108903g - ((long) i15), i15, this.f108906j);
            this.f108902f.c(i12, this.f108907k);
            iF = i11;
        }
        if (!this.f108906j) {
            this.f108900d.a(bArrE, iF, iG);
        }
        this.f108902f.a(bArrE, iF, iG);
        u uVar3 = this.f108901e;
        if (uVar3 != null) {
            uVar3.a(bArrE, iF, iG);
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f108907k = j11;
        }
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f108904h = dVar.b();
        hr.b0 b0VarB = mVar.b(dVar.c(), 2);
        this.f108905i = b0VarB;
        this.f108902f = new b(b0VarB);
        k0 k0Var = this.f108897a;
        if (k0Var != null) {
            k0Var.b(mVar, dVar);
        }
    }

    @Override // rr.m
    public void e() {
    }
}
