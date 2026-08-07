package xz;

import com.nimbusds.jose.shaded.ow2asm.MethodTooLargeException;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes6.dex */
final class t extends s {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int[] f124237c0 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    private final int A;
    private b B;
    private b C;
    private int D;
    private b[] E;
    private int F;
    private b[] G;
    private b H;
    private b I;
    private d J;
    private int K;
    private d L;
    private c M;
    private final int N;
    private r O;
    private r P;
    private r Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int[] V;
    private int[] W;
    private boolean X;
    private boolean Y;
    private int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f124238a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f124239b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f124240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f124241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f124242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f124243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f124244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f124245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f124246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f124247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f124248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f124249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q f124250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f124251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f124252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f124253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d f124254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f124255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f124256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f124257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f124258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b f124259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b f124260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f124261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f124262y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int[] f124263z;

    t(a0 a0Var, int i11, String str, String str2, String str3, String[] strArr, int i12) {
        super(589824);
        this.f124248k = new d();
        this.f124240c = a0Var;
        this.f124241d = "<init>".equals(str) ? 262144 | i11 : i11;
        this.f124242e = a0Var.D(str);
        this.f124243f = str;
        this.f124244g = a0Var.D(str2);
        this.f124245h = str2;
        this.A = str3 == null ? 0 : a0Var.D(str3);
        if (strArr == null || strArr.length <= 0) {
            this.f124262y = 0;
            this.f124263z = null;
        } else {
            int length = strArr.length;
            this.f124262y = length;
            this.f124263z = new int[length];
            for (int i13 = 0; i13 < this.f124262y; i13++) {
                this.f124263z[i13] = a0Var.e(strArr[i13]).f124301a;
            }
        }
        this.N = i12;
        if (i12 != 0) {
            int iC = b0.c(str2) >> 2;
            iC = (i11 & 8) != 0 ? iC - 1 : iC;
            this.f124247j = iC;
            this.T = iC;
            r rVar = new r();
            this.O = rVar;
            o(rVar);
        }
    }

    private void F(int i11, r rVar) {
        r rVar2 = this.Q;
        rVar2.f124233l = new l(i11, rVar, rVar2.f124233l);
    }

    private void I() {
        q qVar = this.f124249l;
        while (true) {
            if (qVar == null) {
                break;
            }
            String str = qVar.f124219e;
            int iG = o.g(this.f124240c, str != null ? str : "java/lang/Throwable");
            r rVarE = qVar.f124217c.e();
            rVarE.f124222a = (short) (rVarE.f124222a | 2);
            r rVarE2 = qVar.f124216b.e();
            for (r rVarE3 = qVar.f124215a.e(); rVarE3 != rVarE2; rVarE3 = rVarE3.f124232k) {
                rVarE3.f124233l = new l(iG, rVarE, rVarE3.f124233l);
            }
            qVar = qVar.f124220f;
        }
        o oVar = this.O.f124231j;
        oVar.u(this.f124240c, this.f124241d, this.f124245h, this.f124247j);
        oVar.a(this);
        r rVar = this.O;
        rVar.f124234m = r.f124221n;
        int iMax = 0;
        while (rVar != r.f124221n) {
            r rVar2 = rVar.f124234m;
            rVar.f124234m = null;
            rVar.f124222a = (short) (rVar.f124222a | 8);
            int iJ = rVar.f124231j.j() + rVar.f124229h;
            if (iJ > iMax) {
                iMax = iJ;
            }
            for (l lVar = rVar.f124233l; lVar != null; lVar = lVar.f124187c) {
                r rVarE4 = lVar.f124186b.e();
                if (rVar.f124231j.m(this.f124240c, rVarE4.f124231j, lVar.f124185a) && rVarE4.f124234m == null) {
                    rVarE4.f124234m = rVar2;
                    rVar2 = rVarE4;
                }
            }
            rVar = rVar2;
        }
        for (r rVar3 = this.O; rVar3 != null; rVar3 = rVar3.f124232k) {
            if ((rVar3.f124222a & 10) == 10) {
                rVar3.f124231j.a(this);
            }
            if ((rVar3.f124222a & 8) == 0) {
                r rVar4 = rVar3.f124232k;
                int i11 = rVar3.f124225d;
                int i12 = (rVar4 == null ? this.f124248k.f124127b : rVar4.f124225d) - 1;
                if (i12 >= i11) {
                    for (int i13 = i11; i13 < i12; i13++) {
                        this.f124248k.f124126a[i13] = 0;
                    }
                    this.f124248k.f124126a[i12] = -65;
                    this.W[V(i11, 0, 1)] = o.g(this.f124240c, "java/lang/Throwable");
                    U();
                    this.f124249l = q.d(this.f124249l, rVar3, rVar4);
                    iMax = Math.max(iMax, 1);
                }
            }
        }
        this.f124246i = iMax;
    }

    private void J() {
        for (q qVar = this.f124249l; qVar != null; qVar = qVar.f124220f) {
            r rVar = qVar.f124217c;
            r rVar2 = qVar.f124216b;
            for (r rVar3 = qVar.f124215a; rVar3 != rVar2; rVar3 = rVar3.f124232k) {
                if ((rVar3.f124222a & 16) == 0) {
                    rVar3.f124233l = new l(Integer.MAX_VALUE, rVar, rVar3.f124233l);
                } else {
                    l lVar = rVar3.f124233l.f124187c;
                    lVar.f124187c = new l(Integer.MAX_VALUE, rVar, lVar.f124187c);
                }
            }
        }
        if (this.X) {
            this.O.f((short) 1);
            short s11 = 1;
            for (short s12 = 1; s12 <= s11; s12 = (short) (s12 + 1)) {
                for (r rVar4 = this.O; rVar4 != null; rVar4 = rVar4.f124232k) {
                    if ((rVar4.f124222a & 16) != 0 && rVar4.f124230i == s12) {
                        r rVar5 = rVar4.f124233l.f124187c.f124186b;
                        if (rVar5.f124230i == 0) {
                            s11 = (short) (s11 + 1);
                            rVar5.f(s11);
                        }
                    }
                }
            }
            for (r rVar6 = this.O; rVar6 != null; rVar6 = rVar6.f124232k) {
                if ((rVar6.f124222a & 16) != 0) {
                    rVar6.f124233l.f124187c.f124186b.d(rVar6);
                }
            }
        }
        r rVar7 = this.O;
        rVar7.f124234m = r.f124221n;
        int i11 = this.f124246i;
        while (rVar7 != r.f124221n) {
            r rVar8 = rVar7.f124234m;
            short s13 = rVar7.f124227f;
            int i12 = rVar7.f124229h + s13;
            if (i12 > i11) {
                i11 = i12;
            }
            l lVar2 = rVar7.f124233l;
            if ((rVar7.f124222a & 16) != 0) {
                lVar2 = lVar2.f124187c;
            }
            rVar7 = rVar8;
            while (lVar2 != null) {
                r rVar9 = lVar2.f124186b;
                if (rVar9.f124234m == null) {
                    int i13 = lVar2.f124185a;
                    rVar9.f124227f = (short) (i13 == Integer.MAX_VALUE ? 1 : i13 + s13);
                    rVar9.f124234m = rVar7;
                    rVar7 = rVar9;
                }
                lVar2 = lVar2.f124187c;
            }
        }
        this.f124246i = i11;
    }

    private void L() {
        int i11 = this.N;
        if (i11 != 4) {
            if (i11 == 1) {
                this.Q.f124229h = (short) this.S;
                this.Q = null;
                return;
            }
            return;
        }
        r rVar = new r();
        rVar.f124231j = new o(rVar);
        d dVar = this.f124248k;
        rVar.i(dVar.f124126a, dVar.f124127b);
        this.P.f124232k = rVar;
        this.P = rVar;
        this.Q = null;
    }

    private void O(int i11, int i12) {
        while (i11 < i12) {
            o.s(this.f124240c, this.W[i11], this.f124258u);
            i11++;
        }
    }

    private void P() {
        char c11;
        int i11;
        int[] iArr = this.W;
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = 0;
        int i15 = 3;
        if (this.f124240c.R() < 50) {
            this.f124258u.k(this.W[0]).k(i12);
            int i16 = i12 + 3;
            O(3, i16);
            this.f124258u.k(i13);
            O(i16, i13 + i16);
            return;
        }
        int i17 = this.f124257t == 0 ? this.W[0] : (this.W[0] - this.V[0]) - 1;
        int i18 = this.V[1];
        int i19 = i12 - i18;
        if (i13 == 0) {
            switch (i19) {
                case -3:
                case -2:
                case -1:
                    c11 = 248;
                    break;
                case 0:
                    c11 = i17 >= 64 ? (char) 251 : (char) 0;
                    break;
                case 1:
                case 2:
                case 3:
                    c11 = 252;
                    break;
                default:
                    c11 = 255;
                    break;
            }
        } else if (i19 == 0 && i13 == 1) {
            c11 = i17 < 63 ? '@' : (char) 247;
        } else {
            c11 = 255;
        }
        if (c11 != 255) {
            int i21 = 3;
            while (true) {
                if (i14 >= i18 || i14 >= i12) {
                    i11 = i15;
                } else {
                    i11 = i15;
                    if (this.W[i21] != this.V[i21]) {
                        c11 = 255;
                    } else {
                        i21++;
                        i14++;
                        i15 = i11;
                    }
                }
            }
        } else {
            i11 = i15;
        }
        if (c11 == 0) {
            this.f124258u.g(i17);
            return;
        }
        if (c11 == '@') {
            this.f124258u.g(i17 + 64);
            O(i12 + 3, i12 + 4);
            return;
        }
        if (c11 == 247) {
            this.f124258u.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE).k(i17);
            O(i12 + 3, i12 + 4);
            return;
        }
        if (c11 == 248) {
            this.f124258u.g(i19 + EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE).k(i17);
            return;
        }
        if (c11 == 251) {
            this.f124258u.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE).k(i17);
            return;
        }
        if (c11 == 252) {
            int i22 = i11;
            this.f124258u.g(i19 + EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE).k(i17);
            O(i18 + i22, i12 + i22);
        } else {
            this.f124258u.g(255).k(i17).k(i12);
            int i23 = i12 + 3;
            O(i11, i23);
            this.f124258u.k(i13);
            O(i23, i13 + i23);
        }
    }

    private void Q(Object obj) {
        if (obj instanceof Integer) {
            this.f124258u.g(((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.f124258u.g(7).k(this.f124240c.e((String) obj).f124301a);
        } else {
            this.f124258u.g(8).k(((r) obj).f124225d);
        }
    }

    private void W(r rVar, r[] rVarArr) {
        r rVar2 = this.Q;
        if (rVar2 != null) {
            int i11 = this.N;
            if (i11 == 4) {
                rVar2.f124231j.d(171, 0, null, null);
                F(0, rVar);
                r rVarE = rVar.e();
                rVarE.f124222a = (short) (rVarE.f124222a | 2);
                for (r rVar3 : rVarArr) {
                    F(0, rVar3);
                    r rVarE2 = rVar3.e();
                    rVarE2.f124222a = (short) (rVarE2.f124222a | 2);
                }
            } else if (i11 == 1) {
                int i12 = this.R - 1;
                this.R = i12;
                F(i12, rVar);
                for (r rVar4 : rVarArr) {
                    F(this.R, rVar4);
                }
            }
            L();
        }
    }

    @Override // xz.s
    public a A(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b bVarI = b.i(this.f124240c, i11, c0Var, str, this.f124259v);
            this.f124259v = bVarI;
            return bVarI;
        }
        b bVarI2 = b.i(this.f124240c, i11, c0Var, str, this.f124260w);
        this.f124260w = bVarI2;
        return bVarI2;
    }

    @Override // xz.s
    public void B(r rVar, r rVar2, r rVar3, String str) {
        q qVar = new q(rVar, rVar2, rVar3, str != null ? this.f124240c.e(str).f124301a : 0, str);
        if (this.f124249l == null) {
            this.f124249l = qVar;
        } else {
            this.f124250m.f124220f = qVar;
        }
        this.f124250m = qVar;
    }

    @Override // xz.s
    public a C(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b bVarI = b.i(this.f124240c, i11, c0Var, str, this.H);
            this.H = bVarI;
            return bVarI;
        }
        b bVarI2 = b.i(this.f124240c, i11, c0Var, str, this.I);
        this.I = bVarI2;
        return bVarI2;
    }

    @Override // xz.s
    public void D(int i11, String str) {
        this.Z = this.f124248k.f124127b;
        z zVarE = this.f124240c.e(str);
        this.f124248k.e(i11, zVarE.f124301a);
        r rVar = this.Q;
        if (rVar != null) {
            int i12 = this.N;
            if (i12 == 4 || i12 == 3) {
                rVar.f124231j.d(i11, this.Z, zVarE, this.f124240c);
            } else if (i11 == 187) {
                int i13 = this.R + 1;
                if (i13 > this.S) {
                    this.S = i13;
                }
                this.R = i13;
            }
        }
    }

    @Override // xz.s
    public void E(int i11, int i12) {
        d dVar = this.f124248k;
        this.Z = dVar.f124127b;
        if (i12 < 4 && i11 != 169) {
            dVar.g((i11 < 54 ? ((i11 - 21) << 2) + 26 : ((i11 - 54) << 2) + 59) + i12);
        } else if (i12 >= 256) {
            dVar.g(196).e(i11, i12);
        } else {
            dVar.c(i11, i12);
        }
        r rVar = this.Q;
        if (rVar != null) {
            int i13 = this.N;
            if (i13 == 4 || i13 == 3) {
                rVar.f124231j.d(i11, i12, null, null);
            } else if (i11 == 169) {
                rVar.f124222a = (short) (rVar.f124222a | 64);
                rVar.f124228g = (short) this.R;
                L();
            } else {
                int i14 = this.R + f124237c0[i11];
                if (i14 > this.S) {
                    this.S = i14;
                }
                this.R = i14;
            }
        }
        int i15 = this.N;
        if (i15 != 0) {
            int i16 = (i11 == 22 || i11 == 24 || i11 == 55 || i11 == 57) ? i12 + 2 : i12 + 1;
            if (i16 > this.f124247j) {
                this.f124247j = i16;
            }
        }
        if (i11 < 54 || i15 != 4 || this.f124249l == null) {
            return;
        }
        o(new r());
    }

    boolean G(e eVar, boolean z11, boolean z12, int i11, int i12, int i13) {
        if (eVar == this.f124240c.S() && i11 == this.f124244g && i12 == this.A) {
            if (z12 == ((this.f124241d & 131072) != 0)) {
                if (z11 != (this.f124240c.R() < 49 && (this.f124241d & 4096) != 0)) {
                    return false;
                }
                if (i13 == 0) {
                    if (this.f124262y != 0) {
                        return false;
                    }
                } else if (eVar.I(i13) == this.f124262y) {
                    int i14 = i13 + 2;
                    for (int i15 = 0; i15 < this.f124262y; i15++) {
                        if (eVar.I(i14) != this.f124263z[i15]) {
                            return false;
                        }
                        i14 += 2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    final void H(c.a aVar) {
        aVar.b(this.M);
        aVar.b(this.f124261x);
    }

    int K() {
        int iB;
        if (this.f124238a0 != 0) {
            return this.f124239b0 + 6;
        }
        int i11 = this.f124248k.f124127b;
        if (i11 <= 0) {
            iB = 8;
        } else {
            if (i11 > 65535) {
                throw new MethodTooLargeException(this.f124240c.O(), this.f124243f, this.f124245h, this.f124248k.f124127b);
            }
            this.f124240c.D("Code");
            iB = this.f124248k.f124127b + 16 + q.b(this.f124249l) + 8;
            if (this.f124258u != null) {
                this.f124240c.D(this.f124240c.R() >= 50 ? "StackMapTable" : "StackMap");
                iB += this.f124258u.f124127b + 8;
            }
            if (this.f124252o != null) {
                this.f124240c.D("LineNumberTable");
                iB += this.f124252o.f124127b + 8;
            }
            if (this.f124254q != null) {
                this.f124240c.D("LocalVariableTable");
                iB += this.f124254q.f124127b + 8;
            }
            if (this.f124256s != null) {
                this.f124240c.D("LocalVariableTypeTable");
                iB += this.f124256s.f124127b + 8;
            }
            b bVar = this.f124259v;
            if (bVar != null) {
                iB += bVar.f("RuntimeVisibleTypeAnnotations");
            }
            b bVar2 = this.f124260w;
            if (bVar2 != null) {
                iB += bVar2.f("RuntimeInvisibleTypeAnnotations");
            }
            c cVar = this.f124261x;
            if (cVar != null) {
                a0 a0Var = this.f124240c;
                d dVar = this.f124248k;
                iB += cVar.c(a0Var, dVar.f124126a, dVar.f124127b, this.f124246i, this.f124247j);
            }
        }
        if (this.f124262y > 0) {
            this.f124240c.D("Exceptions");
            iB += (this.f124262y * 2) + 8;
        }
        int iB2 = iB + c.b(this.f124240c, this.f124241d, this.A) + b.g(this.B, this.C, this.H, this.I);
        b[] bVarArr = this.E;
        if (bVarArr != null) {
            int length = this.D;
            if (length == 0) {
                length = bVarArr.length;
            }
            iB2 += b.h("RuntimeVisibleParameterAnnotations", bVarArr, length);
        }
        b[] bVarArr2 = this.G;
        if (bVarArr2 != null) {
            int length2 = this.F;
            if (length2 == 0) {
                length2 = bVarArr2.length;
            }
            iB2 += b.h("RuntimeInvisibleParameterAnnotations", bVarArr2, length2);
        }
        if (this.J != null) {
            this.f124240c.D("AnnotationDefault");
            iB2 += this.J.f124127b + 6;
        }
        if (this.L != null) {
            this.f124240c.D("MethodParameters");
            iB2 += this.L.f124127b + 7;
        }
        c cVar2 = this.M;
        return cVar2 != null ? iB2 + cVar2.a(this.f124240c) : iB2;
    }

    boolean M() {
        return this.Y;
    }

    boolean N() {
        return this.f124257t > 0;
    }

    void R(d dVar) {
        int iD;
        d dVar2 = dVar;
        boolean z11 = this.f124240c.R() < 49;
        dVar2.k((~(z11 ? 4096 : 0)) & this.f124241d).k(this.f124242e).k(this.f124244g);
        if (this.f124238a0 != 0) {
            dVar2.h(this.f124240c.S().f124130c, this.f124238a0, this.f124239b0);
            return;
        }
        int iD2 = this.f124248k.f124127b > 0 ? 1 : 0;
        if (this.f124262y > 0) {
            iD2++;
        }
        int i11 = this.f124241d;
        if ((i11 & 4096) != 0 && z11) {
            iD2++;
        }
        if (this.A != 0) {
            iD2++;
        }
        if ((131072 & i11) != 0) {
            iD2++;
        }
        if (this.B != null) {
            iD2++;
        }
        if (this.C != null) {
            iD2++;
        }
        if (this.E != null) {
            iD2++;
        }
        if (this.G != null) {
            iD2++;
        }
        if (this.H != null) {
            iD2++;
        }
        if (this.I != null) {
            iD2++;
        }
        if (this.J != null) {
            iD2++;
        }
        if (this.L != null) {
            iD2++;
        }
        c cVar = this.M;
        if (cVar != null) {
            iD2 += cVar.d();
        }
        dVar2.k(iD2);
        int i12 = this.f124248k.f124127b;
        if (i12 > 0) {
            int iB = i12 + 10 + q.b(this.f124249l);
            d dVar3 = this.f124258u;
            if (dVar3 != null) {
                iB += dVar3.f124127b + 8;
                iD = 1;
            } else {
                iD = 0;
            }
            d dVar4 = this.f124252o;
            if (dVar4 != null) {
                iB += dVar4.f124127b + 8;
                iD++;
            }
            d dVar5 = this.f124254q;
            if (dVar5 != null) {
                iB += dVar5.f124127b + 8;
                iD++;
            }
            d dVar6 = this.f124256s;
            if (dVar6 != null) {
                iB += dVar6.f124127b + 8;
                iD++;
            }
            b bVar = this.f124259v;
            if (bVar != null) {
                iB += bVar.f("RuntimeVisibleTypeAnnotations");
                iD++;
            }
            b bVar2 = this.f124260w;
            if (bVar2 != null) {
                iB += bVar2.f("RuntimeInvisibleTypeAnnotations");
                iD++;
            }
            c cVar2 = this.f124261x;
            if (cVar2 != null) {
                a0 a0Var = this.f124240c;
                d dVar7 = this.f124248k;
                iB += cVar2.c(a0Var, dVar7.f124126a, dVar7.f124127b, this.f124246i, this.f124247j);
                iD += this.f124261x.d();
            }
            d dVarI = dVar2.k(this.f124240c.D("Code")).i(iB).k(this.f124246i).k(this.f124247j).i(this.f124248k.f124127b);
            d dVar8 = this.f124248k;
            dVarI.h(dVar8.f124126a, 0, dVar8.f124127b);
            q.c(this.f124249l, dVar2);
            dVar2.k(iD);
            if (this.f124258u != null) {
                d dVarK = dVar2.k(this.f124240c.D(this.f124240c.R() >= 50 ? "StackMapTable" : "StackMap")).i(this.f124258u.f124127b + 2).k(this.f124257t);
                d dVar9 = this.f124258u;
                dVarK.h(dVar9.f124126a, 0, dVar9.f124127b);
            }
            if (this.f124252o != null) {
                d dVarK2 = dVar2.k(this.f124240c.D("LineNumberTable")).i(this.f124252o.f124127b + 2).k(this.f124251n);
                d dVar10 = this.f124252o;
                dVarK2.h(dVar10.f124126a, 0, dVar10.f124127b);
            }
            if (this.f124254q != null) {
                d dVarK3 = dVar2.k(this.f124240c.D("LocalVariableTable")).i(this.f124254q.f124127b + 2).k(this.f124253p);
                d dVar11 = this.f124254q;
                dVarK3.h(dVar11.f124126a, 0, dVar11.f124127b);
            }
            if (this.f124256s != null) {
                d dVarK4 = dVar2.k(this.f124240c.D("LocalVariableTypeTable")).i(this.f124256s.f124127b + 2).k(this.f124255r);
                d dVar12 = this.f124256s;
                dVarK4.h(dVar12.f124126a, 0, dVar12.f124127b);
            }
            b bVar3 = this.f124259v;
            if (bVar3 != null) {
                bVar3.k(this.f124240c.D("RuntimeVisibleTypeAnnotations"), dVar2);
            }
            b bVar4 = this.f124260w;
            if (bVar4 != null) {
                bVar4.k(this.f124240c.D("RuntimeInvisibleTypeAnnotations"), dVar2);
            }
            c cVar3 = this.f124261x;
            if (cVar3 != null) {
                a0 a0Var2 = this.f124240c;
                d dVar13 = this.f124248k;
                cVar3.h(a0Var2, dVar13.f124126a, dVar13.f124127b, this.f124246i, this.f124247j, dVar);
                dVar2 = dVar;
            }
        }
        if (this.f124262y > 0) {
            dVar2.k(this.f124240c.D("Exceptions")).i((this.f124262y * 2) + 2).k(this.f124262y);
            for (int i13 : this.f124263z) {
                dVar2.k(i13);
            }
        }
        c.f(this.f124240c, this.f124241d, this.A, dVar2);
        b.l(this.f124240c, this.B, this.C, this.H, this.I, dVar2);
        if (this.E != null) {
            int iD3 = this.f124240c.D("RuntimeVisibleParameterAnnotations");
            b[] bVarArr = this.E;
            int length = this.D;
            if (length == 0) {
                length = bVarArr.length;
            }
            b.m(iD3, bVarArr, length, dVar2);
        }
        if (this.G != null) {
            int iD4 = this.f124240c.D("RuntimeInvisibleParameterAnnotations");
            b[] bVarArr2 = this.G;
            int length2 = this.F;
            if (length2 == 0) {
                length2 = bVarArr2.length;
            }
            b.m(iD4, bVarArr2, length2, dVar2);
        }
        if (this.J != null) {
            d dVarI2 = dVar2.k(this.f124240c.D("AnnotationDefault")).i(this.J.f124127b);
            d dVar14 = this.J;
            dVarI2.h(dVar14.f124126a, 0, dVar14.f124127b);
        }
        if (this.L != null) {
            d dVarG = dVar2.k(this.f124240c.D("MethodParameters")).i(this.L.f124127b + 1).g(this.K);
            d dVar15 = this.L;
            dVarG.h(dVar15.f124126a, 0, dVar15.f124127b);
        }
        c cVar4 = this.M;
        if (cVar4 != null) {
            cVar4.g(this.f124240c, dVar2);
        }
    }

    void S(int i11, int i12) {
        this.f124238a0 = i11 + 6;
        this.f124239b0 = i12 - 6;
    }

    void T(int i11, int i12) {
        this.W[i11] = i12;
    }

    void U() {
        if (this.V != null) {
            if (this.f124258u == null) {
                this.f124258u = new d();
            }
            P();
            this.f124257t++;
        }
        this.V = this.W;
        this.W = null;
    }

    int V(int i11, int i12, int i13) {
        int i14 = i12 + 3 + i13;
        int[] iArr = this.W;
        if (iArr == null || iArr.length < i14) {
            this.W = new int[i14];
        }
        int[] iArr2 = this.W;
        iArr2[0] = i11;
        iArr2[1] = i12;
        iArr2[2] = i13;
        return 3;
    }

    @Override // xz.s
    public void a(int i11, boolean z11) {
        if (z11) {
            this.D = i11;
        } else {
            this.F = i11;
        }
    }

    @Override // xz.s
    public a b(String str, boolean z11) {
        if (z11) {
            b bVarJ = b.j(this.f124240c, str, this.B);
            this.B = bVarJ;
            return bVarJ;
        }
        b bVarJ2 = b.j(this.f124240c, str, this.C);
        this.C = bVarJ2;
        return bVarJ2;
    }

    @Override // xz.s
    public a c() {
        d dVar = new d();
        this.J = dVar;
        return new b(this.f124240c, false, dVar, null);
    }

    @Override // xz.s
    public void d(c cVar) {
        if (cVar.e()) {
            cVar.f124121c = this.f124261x;
            this.f124261x = cVar;
        } else {
            cVar.f124121c = this.M;
            this.M = cVar;
        }
    }

    @Override // xz.s
    public void g(int i11, String str, String str2, String str3) {
        int i12;
        int i13;
        this.Z = this.f124248k.f124127b;
        z zVarJ = this.f124240c.j(str, str2, str3);
        this.f124248k.e(i11, zVarJ.f124301a);
        r rVar = this.Q;
        if (rVar != null) {
            int i14 = this.N;
            if (i14 == 4 || i14 == 3) {
                rVar.f124231j.d(i11, 0, zVarJ, this.f124240c);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i15 = -2;
            switch (i11) {
                case 178:
                    i12 = this.R + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case 179:
                    i13 = this.R;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i15 = -1;
                    }
                    i12 = i13 + i15;
                    break;
                case 180:
                    i12 = this.R + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i13 = this.R;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i15 = -3;
                    }
                    i12 = i13 + i15;
                    break;
            }
            if (i12 > this.S) {
                this.S = i12;
            }
            this.R = i12;
        }
    }

    @Override // xz.s
    public void h(int i11, int i12, Object[] objArr, int i13, Object[] objArr2) {
        int i14;
        int i15;
        int i16 = this.N;
        if (i16 == 4) {
            return;
        }
        if (i16 == 3) {
            r rVar = this.Q;
            o oVar = rVar.f124231j;
            if (oVar == null) {
                rVar.f124231j = new k(rVar);
                this.Q.f124231j.u(this.f124240c, this.f124241d, this.f124245h, i12);
                this.Q.f124231j.a(this);
                i14 = i13;
            } else {
                if (i11 == -1) {
                    oVar.t(this.f124240c, i12, objArr, i13, objArr2);
                    i14 = i13;
                } else {
                    i14 = i13;
                }
                this.Q.f124231j.a(this);
            }
        } else {
            i14 = i13;
            if (i11 == -1) {
                if (this.V == null) {
                    int iC = b0.c(this.f124245h) >> 2;
                    o oVar2 = new o(new r());
                    oVar2.u(this.f124240c, this.f124241d, this.f124245h, iC);
                    oVar2.a(this);
                }
                this.T = i12;
                int iV = V(this.f124248k.f124127b, i12, i13);
                int i17 = 0;
                while (i17 < i12) {
                    this.W[iV] = o.e(this.f124240c, objArr[i17]);
                    i17++;
                    iV++;
                }
                int i18 = 0;
                while (i18 < i14) {
                    this.W[iV] = o.e(this.f124240c, objArr2[i18]);
                    i18++;
                    iV++;
                }
                U();
            } else {
                if (this.f124240c.R() < 50) {
                    throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
                }
                if (this.f124258u == null) {
                    this.f124258u = new d();
                    i15 = this.f124248k.f124127b;
                } else {
                    i15 = (this.f124248k.f124127b - this.U) - 1;
                    if (i15 < 0) {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        return;
                    }
                }
                if (i11 == 0) {
                    this.T = i12;
                    this.f124258u.g(255).k(i15).k(i12);
                    for (int i19 = 0; i19 < i12; i19++) {
                        Q(objArr[i19]);
                    }
                    this.f124258u.k(i13);
                    for (int i21 = 0; i21 < i14; i21++) {
                        Q(objArr2[i21]);
                    }
                } else if (i11 == 1) {
                    this.T += i12;
                    this.f124258u.g(i12 + EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE).k(i15);
                    for (int i22 = 0; i22 < i12; i22++) {
                        Q(objArr[i22]);
                    }
                } else if (i11 == 2) {
                    this.T -= i12;
                    this.f124258u.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE - i12).k(i15);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalArgumentException();
                    }
                    if (i15 < 64) {
                        this.f124258u.g(i15 + 64);
                    } else {
                        this.f124258u.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE).k(i15);
                    }
                    Q(objArr2[0]);
                } else if (i15 < 64) {
                    this.f124258u.g(i15);
                } else {
                    this.f124258u.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE).k(i15);
                }
                this.U = this.f124248k.f124127b;
                this.f124257t++;
            }
        }
        if (this.N == 2) {
            this.R = i14;
            for (int i23 = 0; i23 < i14; i23++) {
                Object obj = objArr2[i23];
                if (obj == w.f124287e || obj == w.f124286d) {
                    this.R++;
                }
            }
            int i24 = this.R;
            if (i24 > this.S) {
                this.S = i24;
            }
        }
        this.f124246i = Math.max(this.f124246i, i13);
        this.f124247j = Math.max(this.f124247j, this.T);
    }

    @Override // xz.s
    public void i(int i11, int i12) {
        int i13;
        int i14;
        d dVar = this.f124248k;
        this.Z = dVar.f124127b;
        if (i11 > 255 || i12 > 127 || i12 < -128) {
            dVar.g(196).e(132, i11).k(i12);
        } else {
            dVar.g(132).c(i11, i12);
        }
        r rVar = this.Q;
        if (rVar != null && ((i14 = this.N) == 4 || i14 == 3)) {
            rVar.f124231j.d(132, i11, null, null);
        }
        if (this.N == 0 || (i13 = i11 + 1) <= this.f124247j) {
            return;
        }
        this.f124247j = i13;
    }

    @Override // xz.s
    public void j(int i11) {
        d dVar = this.f124248k;
        this.Z = dVar.f124127b;
        dVar.g(i11);
        r rVar = this.Q;
        if (rVar != null) {
            int i12 = this.N;
            if (i12 == 4 || i12 == 3) {
                rVar.f124231j.d(i11, 0, null, null);
            } else {
                int i13 = this.R + f124237c0[i11];
                if (i13 > this.S) {
                    this.S = i13;
                }
                this.R = i13;
            }
            if ((i11 < 172 || i11 > 177) && i11 != 191) {
                return;
            }
            L();
        }
    }

    @Override // xz.s
    public a k(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b bVarI = b.i(this.f124240c, (i11 & (-16776961)) | (this.Z << 8), c0Var, str, this.f124259v);
            this.f124259v = bVarI;
            return bVarI;
        }
        b bVarI2 = b.i(this.f124240c, (i11 & (-16776961)) | (this.Z << 8), c0Var, str, this.f124260w);
        this.f124260w = bVarI2;
        return bVarI2;
    }

    @Override // xz.s
    public void l(int i11, int i12) {
        d dVar = this.f124248k;
        this.Z = dVar.f124127b;
        if (i11 == 17) {
            dVar.e(i11, i12);
        } else {
            dVar.c(i11, i12);
        }
        r rVar = this.Q;
        if (rVar != null) {
            int i13 = this.N;
            if (i13 == 4 || i13 == 3) {
                rVar.f124231j.d(i11, i12, null, null);
            } else if (i11 != 188) {
                int i14 = this.R + 1;
                if (i14 > this.S) {
                    this.S = i14;
                }
                this.R = i14;
            }
        }
    }

    @Override // xz.s
    public void m(String str, String str2, p pVar, Object... objArr) {
        this.Z = this.f124248k.f124127b;
        z zVarO = this.f124240c.o(str, str2, pVar, objArr);
        this.f124248k.e(186, zVarO.f124301a);
        this.f124248k.k(0);
        r rVar = this.Q;
        if (rVar != null) {
            int i11 = this.N;
            if (i11 == 4 || i11 == 3) {
                rVar.f124231j.d(186, 0, zVarO, this.f124240c);
                return;
            }
            int iA = zVarO.a();
            int i12 = this.R + ((iA & 3) - (iA >> 2)) + 1;
            if (i12 > this.S) {
                this.S = i12;
            }
            this.R = i12;
        }
    }

    @Override // xz.s
    public void n(int i11, r rVar) {
        boolean z11;
        d dVar = this.f124248k;
        int i12 = dVar.f124127b;
        this.Z = i12;
        int i13 = i11 >= 200 ? i11 - 33 : i11;
        if ((rVar.f124222a & 4) == 0 || rVar.f124225d - i12 >= -32768) {
            if (i13 != i11) {
                dVar.g(i11);
                d dVar2 = this.f124248k;
                rVar.h(dVar2, dVar2.f124127b - 1, true);
            } else {
                dVar.g(i13);
                d dVar3 = this.f124248k;
                rVar.h(dVar3, dVar3.f124127b - 1, false);
            }
            z11 = false;
        } else {
            if (i13 == 167) {
                dVar.g(200);
            } else {
                if (i13 == 168) {
                    dVar.g(EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE);
                } else {
                    dVar.g(i13 >= 198 ? i13 ^ 1 : ((i13 + 1) ^ 1) - 1);
                    this.f124248k.k(8);
                    this.f124248k.g(EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                    this.Y = true;
                    z11 = true;
                }
                d dVar4 = this.f124248k;
                rVar.h(dVar4, dVar4.f124127b - 1, true);
            }
            z11 = false;
            d dVar5 = this.f124248k;
            rVar.h(dVar5, dVar5.f124127b - 1, true);
        }
        r rVar2 = this.Q;
        if (rVar2 != null) {
            int i14 = this.N;
            r rVar3 = null;
            if (i14 == 4) {
                rVar2.f124231j.d(i13, 0, null, null);
                r rVarE = rVar.e();
                rVarE.f124222a = (short) (rVarE.f124222a | 2);
                F(0, rVar);
                if (i13 != 167) {
                    rVar3 = new r();
                }
            } else if (i14 == 3) {
                rVar2.f124231j.d(i13, 0, null, null);
            } else if (i14 == 2) {
                this.R += f124237c0[i13];
            } else if (i13 == 168) {
                short s11 = rVar.f124222a;
                if ((s11 & 32) == 0) {
                    rVar.f124222a = (short) (s11 | 32);
                    this.X = true;
                }
                rVar2.f124222a = (short) (rVar2.f124222a | 16);
                F(this.R + 1, rVar);
                rVar3 = new r();
            } else {
                int i15 = this.R + f124237c0[i13];
                this.R = i15;
                F(i15, rVar);
            }
            if (rVar3 != null) {
                if (z11) {
                    rVar3.f124222a = (short) (rVar3.f124222a | 2);
                }
                o(rVar3);
            }
            if (i13 == 167) {
                L();
            }
        }
    }

    @Override // xz.s
    public void o(r rVar) {
        boolean z11 = this.Y;
        d dVar = this.f124248k;
        this.Y = z11 | rVar.i(dVar.f124126a, dVar.f124127b);
        short s11 = rVar.f124222a;
        if ((s11 & 1) != 0) {
            return;
        }
        int i11 = this.N;
        if (i11 == 4) {
            r rVar2 = this.Q;
            if (rVar2 != null) {
                if (rVar.f124225d == rVar2.f124225d) {
                    rVar2.f124222a = (short) ((s11 & 2) | rVar2.f124222a);
                    rVar.f124231j = rVar2.f124231j;
                    return;
                }
                F(0, rVar);
            }
            r rVar3 = this.P;
            if (rVar3 != null) {
                if (rVar.f124225d == rVar3.f124225d) {
                    rVar3.f124222a = (short) (rVar3.f124222a | (rVar.f124222a & 2));
                    rVar.f124231j = rVar3.f124231j;
                    this.Q = rVar3;
                    return;
                }
                rVar3.f124232k = rVar;
            }
            this.P = rVar;
            this.Q = rVar;
            rVar.f124231j = new o(rVar);
            return;
        }
        if (i11 == 3) {
            r rVar4 = this.Q;
            if (rVar4 == null) {
                this.Q = rVar;
                return;
            } else {
                rVar4.f124231j.f124201a = rVar;
                return;
            }
        }
        if (i11 != 1) {
            if (i11 == 2 && this.Q == null) {
                this.Q = rVar;
                return;
            }
            return;
        }
        r rVar5 = this.Q;
        if (rVar5 != null) {
            rVar5.f124229h = (short) this.S;
            F(this.R, rVar);
        }
        this.Q = rVar;
        this.R = 0;
        this.S = 0;
        r rVar6 = this.P;
        if (rVar6 != null) {
            rVar6.f124232k = rVar;
        }
        this.P = rVar;
    }

    @Override // xz.s
    public void p(Object obj) {
        char cCharAt;
        this.Z = this.f124248k.f124127b;
        z zVarD = this.f124240c.d(obj);
        int i11 = zVarD.f124301a;
        int i12 = zVarD.f124302b;
        boolean z11 = i12 == 5 || i12 == 6 || (i12 == 17 && ((cCharAt = zVarD.f124305e.charAt(0)) == 'J' || cCharAt == 'D'));
        if (z11) {
            this.f124248k.e(20, i11);
        } else if (i11 >= 256) {
            this.f124248k.e(19, i11);
        } else {
            this.f124248k.c(18, i11);
        }
        r rVar = this.Q;
        if (rVar != null) {
            int i13 = this.N;
            if (i13 == 4 || i13 == 3) {
                rVar.f124231j.d(18, 0, zVarD, this.f124240c);
                return;
            }
            int i14 = this.R + (z11 ? 2 : 1);
            if (i14 > this.S) {
                this.S = i14;
            }
            this.R = i14;
        }
    }

    @Override // xz.s
    public void q(int i11, r rVar) {
        if (this.f124252o == null) {
            this.f124252o = new d();
        }
        this.f124251n++;
        this.f124252o.k(rVar.f124225d);
        this.f124252o.k(i11);
    }

    @Override // xz.s
    public void r(String str, String str2, String str3, r rVar, r rVar2, int i11) {
        if (str3 != null) {
            if (this.f124256s == null) {
                this.f124256s = new d();
            }
            this.f124255r++;
            this.f124256s.k(rVar.f124225d).k(rVar2.f124225d - rVar.f124225d).k(this.f124240c.D(str)).k(this.f124240c.D(str3)).k(i11);
        }
        if (this.f124254q == null) {
            this.f124254q = new d();
        }
        this.f124253p++;
        this.f124254q.k(rVar.f124225d).k(rVar2.f124225d - rVar.f124225d).k(this.f124240c.D(str)).k(this.f124240c.D(str2)).k(i11);
        if (this.N != 0) {
            char cCharAt = str2.charAt(0);
            int i12 = i11 + ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1);
            if (i12 > this.f124247j) {
                this.f124247j = i12;
            }
        }
    }

    @Override // xz.s
    public a s(int i11, c0 c0Var, r[] rVarArr, r[] rVarArr2, int[] iArr, String str, boolean z11) {
        d dVar = new d();
        dVar.g(i11 >>> 24).k(rVarArr.length);
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            dVar.k(rVarArr[i12].f124225d).k(rVarArr2[i12].f124225d - rVarArr[i12].f124225d).k(iArr[i12]);
        }
        c0.d(c0Var, dVar);
        dVar.k(this.f124240c.D(str)).k(0);
        if (z11) {
            b bVar = new b(this.f124240c, true, dVar, this.f124259v);
            this.f124259v = bVar;
            return bVar;
        }
        b bVar2 = new b(this.f124240c, true, dVar, this.f124260w);
        this.f124260w = bVar2;
        return bVar2;
    }

    @Override // xz.s
    public void t(r rVar, int[] iArr, r[] rVarArr) {
        d dVar = this.f124248k;
        this.Z = dVar.f124127b;
        dVar.g(171).h(null, 0, (4 - (this.f124248k.f124127b % 4)) % 4);
        rVar.h(this.f124248k, this.Z, true);
        this.f124248k.i(rVarArr.length);
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            this.f124248k.i(iArr[i11]);
            rVarArr[i11].h(this.f124248k, this.Z, true);
        }
        W(rVar, rVarArr);
    }

    @Override // xz.s
    public void u(int i11, int i12) {
        int i13 = this.N;
        if (i13 == 4) {
            I();
            return;
        }
        if (i13 == 1) {
            J();
        } else if (i13 == 2) {
            this.f124246i = this.S;
        } else {
            this.f124246i = i11;
            this.f124247j = i12;
        }
    }

    @Override // xz.s
    public void v(int i11, String str, String str2, String str3, boolean z11) {
        this.Z = this.f124248k.f124127b;
        z zVarX = this.f124240c.x(str, str2, str3, z11);
        if (i11 == 185) {
            this.f124248k.e(185, zVarX.f124301a).c(zVarX.a() >> 2, 0);
        } else {
            this.f124248k.e(i11, zVarX.f124301a);
        }
        r rVar = this.Q;
        if (rVar != null) {
            int i12 = this.N;
            if (i12 == 4 || i12 == 3) {
                rVar.f124231j.d(i11, 0, zVarX, this.f124240c);
                return;
            }
            int iA = zVarX.a();
            int i13 = (iA & 3) - (iA >> 2);
            int i14 = i11 == 184 ? this.R + i13 + 1 : this.R + i13;
            if (i14 > this.S) {
                this.S = i14;
            }
            this.R = i14;
        }
    }

    @Override // xz.s
    public void w(String str, int i11) {
        this.Z = this.f124248k.f124127b;
        z zVarE = this.f124240c.e(str);
        this.f124248k.e(197, zVarE.f124301a).g(i11);
        r rVar = this.Q;
        if (rVar != null) {
            int i12 = this.N;
            if (i12 == 4 || i12 == 3) {
                rVar.f124231j.d(197, i11, zVarE, this.f124240c);
            } else {
                this.R += 1 - i11;
            }
        }
    }

    @Override // xz.s
    public void x(String str, int i11) {
        if (this.L == null) {
            this.L = new d();
        }
        this.K++;
        this.L.k(str == null ? 0 : this.f124240c.D(str)).k(i11);
    }

    @Override // xz.s
    public a y(int i11, String str, boolean z11) {
        if (z11) {
            if (this.E == null) {
                this.E = new b[b0.b(this.f124245h).length];
            }
            b[] bVarArr = this.E;
            b bVarJ = b.j(this.f124240c, str, bVarArr[i11]);
            bVarArr[i11] = bVarJ;
            return bVarJ;
        }
        if (this.G == null) {
            this.G = new b[b0.b(this.f124245h).length];
        }
        b[] bVarArr2 = this.G;
        b bVarJ2 = b.j(this.f124240c, str, bVarArr2[i11]);
        bVarArr2[i11] = bVarJ2;
        return bVarJ2;
    }

    @Override // xz.s
    public void z(int i11, int i12, r rVar, r... rVarArr) {
        d dVar = this.f124248k;
        this.Z = dVar.f124127b;
        dVar.g(170).h(null, 0, (4 - (this.f124248k.f124127b % 4)) % 4);
        rVar.h(this.f124248k, this.Z, true);
        this.f124248k.i(i11).i(i12);
        for (r rVar2 : rVarArr) {
            rVar2.h(this.f124248k, this.Z, true);
        }
        W(rVar, rVarArr);
    }

    @Override // xz.s
    public void e() {
    }

    @Override // xz.s
    public void f() {
    }
}
