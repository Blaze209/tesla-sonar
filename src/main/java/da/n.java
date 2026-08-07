package da;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double[] f60118r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w8.o0 f60120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f60121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f60122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s7.c0 f60123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f60124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f60125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f60126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f60127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f60128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f60130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f60131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f60132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f60133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f60134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f60135q;

    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f60136e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f60137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f60138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f60140d;

        public a(int i11) {
            this.f60140d = new byte[i11];
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f60137a) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.f60140d;
                int length = bArr2.length;
                int i14 = this.f60138b;
                if (length < i14 + i13) {
                    this.f60140d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
                }
                System.arraycopy(bArr, i11, this.f60140d, this.f60138b, i13);
                this.f60138b += i13;
            }
        }

        public boolean b(int i11, int i12) {
            if (this.f60137a) {
                int i13 = this.f60138b - i12;
                this.f60138b = i13;
                if (this.f60139c != 0 || i11 != 181) {
                    this.f60137a = false;
                    return true;
                }
                this.f60139c = i13;
            } else if (i11 == 179) {
                this.f60137a = true;
            }
            byte[] bArr = f60136e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f60137a = false;
            this.f60138b = 0;
            this.f60139c = 0;
        }
    }

    public n(String str) {
        this(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    private static Pair<p7.u, Long> f(a aVar, String str, String str2) {
        float f11;
        int i11;
        float f12;
        int i12;
        long j11;
        double[] dArr;
        double d11;
        int i13;
        int i14;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f60140d, aVar.f60138b);
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
                p7.u uVarP = new p7.u.b().j0(str).W(str2).y0("video/mpeg2").F0(i16).h0(i17).u0(f12).k0(Collections.singletonList(bArrCopyOf)).P();
                i12 = (bArrCopyOf[7] & 15) - 1;
                if (i12 >= 0) {
                    dArr = f60118r;
                    if (i12 < dArr.length) {
                        d11 = dArr[i12];
                        byte b12 = bArrCopyOf[aVar.f60139c + 9];
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
                return Pair.create(uVarP, Long.valueOf(j11));
            }
            f11 = i17 * 16;
            i11 = i16 * 9;
        }
        f12 = f11 / i11;
        p7.u uVarP2 = new p7.u.b().j0(str).W(str2).y0("video/mpeg2").F0(i16).h0(i17).u0(f12).k0(Collections.singletonList(bArrCopyOf)).P();
        i12 = (bArrCopyOf[7] & 15) - 1;
        if (i12 >= 0) {
            dArr = f60118r;
            if (i12 < dArr.length) {
                d11 = dArr[i12];
                byte b13 = bArrCopyOf[aVar.f60139c + 9];
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
        return Pair.create(uVarP2, Long.valueOf(j11));
    }

    @Override // da.m
    public void a() {
        t7.h.c(this.f60125g);
        this.f60126h.c();
        w wVar = this.f60124f;
        if (wVar != null) {
            wVar.d();
        }
        this.f60127i = 0L;
        this.f60128j = false;
        this.f60131m = -9223372036854775807L;
        this.f60133o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
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
    @Override // da.m
    public void b(s7.c0 c0Var) {
        boolean z11;
        int i11;
        s7.a.j(this.f60120b);
        int iG = c0Var.g();
        int iJ = c0Var.j();
        byte[] bArrF = c0Var.f();
        this.f60127i += (long) c0Var.a();
        this.f60120b.f(c0Var, c0Var.a());
        while (true) {
            int iE = t7.h.e(bArrF, iG, iJ, this.f60125g);
            if (iE == iJ) {
                break;
            }
            int i12 = iE + 3;
            int i13 = c0Var.f()[i12] & 255;
            int i14 = iE - iG;
            if (!this.f60129k) {
                if (i14 > 0) {
                    this.f60126h.a(bArrF, iG, iE);
                }
                if (this.f60126h.b(i13, i14 < 0 ? -i14 : 0)) {
                    Pair<p7.u, Long> pairF = f(this.f60126h, (String) s7.a.f(this.f60119a), this.f60122d);
                    this.f60120b.g((p7.u) pairF.first);
                    this.f60130l = ((Long) pairF.second).longValue();
                    this.f60129k = true;
                }
            }
            w wVar = this.f60124f;
            if (wVar != null) {
                if (i14 > 0) {
                    wVar.a(bArrF, iG, iE);
                    i11 = 0;
                } else {
                    i11 = -i14;
                }
                if (this.f60124f.b(i11)) {
                    w wVar2 = this.f60124f;
                    ((s7.c0) q0.l(this.f60123e)).Z(this.f60124f.f60328d, t7.h.L(wVar2.f60328d, wVar2.f60329e));
                    ((o0) q0.l(this.f60121c)).b(this.f60133o, this.f60123e);
                }
                if (i13 == 178 && c0Var.f()[iE + 2] == 1) {
                    this.f60124f.e(i13);
                }
            }
            if (i13 == 0 || i13 == 179) {
                int i15 = iJ - iE;
                if (this.f60135q && this.f60129k) {
                    long j11 = this.f60133o;
                    if (j11 != -9223372036854775807L) {
                        this.f60120b.b(j11, this.f60134p ? 1 : 0, ((int) (this.f60127i - this.f60132n)) - i15, i15, null);
                    }
                }
                if (!this.f60128j || this.f60135q) {
                    this.f60132n = this.f60127i - ((long) i15);
                    long j12 = this.f60131m;
                    if (j12 == -9223372036854775807L) {
                        long j13 = this.f60133o;
                        j12 = j13 != -9223372036854775807L ? j13 + this.f60130l : -9223372036854775807L;
                    }
                    this.f60133o = j12;
                    this.f60134p = false;
                    this.f60131m = -9223372036854775807L;
                    z11 = true;
                    this.f60128j = true;
                } else {
                    z11 = true;
                }
                this.f60135q = i13 == 0 ? z11 : false;
            } else {
                if (i13 == 184) {
                    this.f60134p = true;
                }
                iJ = iJ;
            }
            iJ = iJ;
            iG = i12;
        }
        if (!this.f60129k) {
            this.f60126h.a(bArrF, iG, iJ);
        }
        w wVar3 = this.f60124f;
        if (wVar3 != null) {
            wVar3.a(bArrF, iG, iJ);
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        this.f60131m = j11;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        this.f60119a = dVar.b();
        this.f60120b = rVar.b(dVar.c(), 2);
        o0 o0Var = this.f60121c;
        if (o0Var != null) {
            o0Var.c(rVar, dVar);
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
    @Override // da.m
    public void e(boolean z11) {
        s7.a.j(this.f60120b);
        if (z11) {
            boolean z12 = this.f60134p;
            this.f60120b.b(this.f60133o, z12 ? 1 : 0, (int) (this.f60127i - this.f60132n), 0, null);
        }
    }

    n(o0 o0Var, String str) {
        this.f60121c = o0Var;
        this.f60122d = str;
        this.f60125g = new boolean[4];
        this.f60126h = new a(128);
        if (o0Var != null) {
            this.f60124f = new w(178, 128);
            this.f60123e = new s7.c0();
        } else {
            this.f60124f = null;
            this.f60123e = null;
        }
        this.f60131m = -9223372036854775807L;
        this.f60133o = -9223372036854775807L;
    }
}
