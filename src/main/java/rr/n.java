package rr;

import android.util.Pair;
import com.google.android.exoplayer2.u0;
import java.util.Arrays;
import java.util.Collections;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final double[] f108874q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f108875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hr.b0 f108876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0 f108877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts.d0 f108878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f108879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f108880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f108881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f108882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f108883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f108884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f108885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f108886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f108887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f108888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f108889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f108890p;

    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f108891e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f108892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f108893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f108894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f108895d;

        public a(int i11) {
            this.f108895d = new byte[i11];
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f108892a) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.f108895d;
                int length = bArr2.length;
                int i14 = this.f108893b;
                if (length < i14 + i13) {
                    this.f108895d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
                }
                System.arraycopy(bArr, i11, this.f108895d, this.f108893b, i13);
                this.f108893b += i13;
            }
        }

        public boolean b(int i11, int i12) {
            if (this.f108892a) {
                int i13 = this.f108893b - i12;
                this.f108893b = i13;
                if (this.f108894c != 0 || i11 != 181) {
                    this.f108892a = false;
                    return true;
                }
                this.f108894c = i13;
            } else if (i11 == 179) {
                this.f108892a = true;
            }
            byte[] bArr = f108891e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f108892a = false;
            this.f108893b = 0;
            this.f108894c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    private static Pair<u0, Long> f(a aVar, String str) {
        float f11;
        int i11;
        float f12;
        int i12;
        long j11;
        double[] dArr;
        double d11;
        int i13;
        int i14;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f108895d, aVar.f108893b);
        int i15 = bArrCopyOf[4] & 255;
        byte b11 = bArrCopyOf[5];
        int i16 = (i15 << 4) | ((b11 & 255) >> 4);
        int i17 = ((b11 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i18 = (bArrCopyOf[7] & 240) >> 4;
        if (i18 == 2) {
            f11 = i17 * 4;
            i11 = i16 * 3;
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    f12 = 1.0f;
                } else {
                    f11 = i17 * 121;
                    i11 = i16 * 100;
                }
                u0 u0VarG = new u0.b().U(str).g0("video/mpeg2").n0(i16).S(i17).c0(f12).V(Collections.singletonList(bArrCopyOf)).G();
                i12 = (bArrCopyOf[7] & 15) - 1;
                if (i12 >= 0) {
                    dArr = f108874q;
                    if (i12 < dArr.length) {
                        d11 = dArr[i12];
                        byte b12 = bArrCopyOf[aVar.f108894c + 9];
                        i13 = (b12 & 96) >> 5;
                        i14 = b12 & 31;
                        if (i13 != i14) {
                            d11 *= (((double) i13) + 1.0d) / ((double) (i14 + 1));
                        }
                        j11 = (long) (1000000.0d / d11);
                    } else {
                        j11 = 0;
                    }
                } else {
                    j11 = 0;
                }
                return Pair.create(u0VarG, Long.valueOf(j11));
            }
            f11 = i17 * 16;
            i11 = i16 * 9;
        }
        f12 = f11 / i11;
        u0 u0VarG2 = new u0.b().U(str).g0("video/mpeg2").n0(i16).S(i17).c0(f12).V(Collections.singletonList(bArrCopyOf)).G();
        i12 = (bArrCopyOf[7] & 15) - 1;
        if (i12 >= 0) {
            dArr = f108874q;
            if (i12 < dArr.length) {
                d11 = dArr[i12];
                byte b13 = bArrCopyOf[aVar.f108894c + 9];
                i13 = (b13 & 96) >> 5;
                i14 = b13 & 31;
                if (i13 != i14) {
                    d11 *= (((double) i13) + 1.0d) / ((double) (i14 + 1));
                }
                j11 = (long) (1000000.0d / d11);
            } else {
                j11 = 0;
            }
        } else {
            j11 = 0;
        }
        return Pair.create(u0VarG2, Long.valueOf(j11));
    }

    @Override // rr.m
    public void a() {
        ts.z.a(this.f108880f);
        this.f108881g.c();
        u uVar = this.f108879e;
        if (uVar != null) {
            uVar.d();
        }
        this.f108882h = 0L;
        this.f108883i = false;
        this.f108886l = -9223372036854775807L;
        this.f108888n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
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
    @Override // rr.m
    public void b(ts.d0 d0Var) {
        boolean z11;
        int i11;
        ts.a.i(this.f108876b);
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        this.f108882h += (long) d0Var.a();
        this.f108876b.d(d0Var, d0Var.a());
        while (true) {
            int iC = ts.z.c(bArrE, iF, iG, this.f108880f);
            if (iC == iG) {
                break;
            }
            int i12 = iC + 3;
            int i13 = d0Var.e()[i12] & 255;
            int i14 = iC - iF;
            if (!this.f108884j) {
                if (i14 > 0) {
                    this.f108881g.a(bArrE, iF, iC);
                }
                if (this.f108881g.b(i13, i14 < 0 ? -i14 : 0)) {
                    Pair<u0, Long> pairF = f(this.f108881g, (String) ts.a.e(this.f108875a));
                    this.f108876b.b((u0) pairF.first);
                    this.f108885k = ((Long) pairF.second).longValue();
                    this.f108884j = true;
                }
            }
            u uVar = this.f108879e;
            if (uVar != null) {
                if (i14 > 0) {
                    uVar.a(bArrE, iF, iC);
                    i11 = 0;
                } else {
                    i11 = -i14;
                }
                if (this.f108879e.b(i11)) {
                    u uVar2 = this.f108879e;
                    ((ts.d0) p0.j(this.f108878d)).S(this.f108879e.f109040d, ts.z.q(uVar2.f109040d, uVar2.f109041e));
                    ((k0) p0.j(this.f108877c)).a(this.f108888n, this.f108878d);
                }
                if (i13 == 178 && d0Var.e()[iC + 2] == 1) {
                    this.f108879e.e(i13);
                }
            }
            if (i13 == 0 || i13 == 179) {
                int i15 = iG - iC;
                if (this.f108890p && this.f108884j) {
                    long j11 = this.f108888n;
                    if (j11 != -9223372036854775807L) {
                        this.f108876b.e(j11, this.f108889o ? 1 : 0, ((int) (this.f108882h - this.f108887m)) - i15, i15, null);
                    }
                }
                if (!this.f108883i || this.f108890p) {
                    this.f108887m = this.f108882h - ((long) i15);
                    long j12 = this.f108886l;
                    if (j12 == -9223372036854775807L) {
                        long j13 = this.f108888n;
                        j12 = j13 != -9223372036854775807L ? j13 + this.f108885k : -9223372036854775807L;
                    }
                    this.f108888n = j12;
                    this.f108889o = false;
                    this.f108886l = -9223372036854775807L;
                    z11 = true;
                    this.f108883i = true;
                } else {
                    z11 = true;
                }
                this.f108890p = i13 == 0 ? z11 : false;
            } else {
                if (i13 == 184) {
                    this.f108889o = true;
                }
                iG = iG;
            }
            iG = iG;
            iF = i12;
        }
        if (!this.f108884j) {
            this.f108881g.a(bArrE, iF, iG);
        }
        u uVar3 = this.f108879e;
        if (uVar3 != null) {
            uVar3.a(bArrE, iF, iG);
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        this.f108886l = j11;
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f108875a = dVar.b();
        this.f108876b = mVar.b(dVar.c(), 2);
        k0 k0Var = this.f108877c;
        if (k0Var != null) {
            k0Var.b(mVar, dVar);
        }
    }

    n(k0 k0Var) {
        this.f108877c = k0Var;
        this.f108880f = new boolean[4];
        this.f108881g = new a(128);
        if (k0Var != null) {
            this.f108879e = new u(178, 128);
            this.f108878d = new ts.d0();
        } else {
            this.f108879e = null;
            this.f108878d = null;
        }
        this.f108886l = -9223372036854775807L;
        this.f108888n = -9223372036854775807L;
    }

    @Override // rr.m
    public void e() {
    }
}
