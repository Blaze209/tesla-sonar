package l90;

import androidx.compose.ui.d;
import f90.n;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.j1;
import p009i2.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "checked", "Lkotlin/Function1;", "Ljn0/h0;", "onCheckedChange", "Landroidx/compose/ui/d;", "modifier", "enabled", "a", "(ZLwn0/l;Landroidx/compose/ui/d;ZLr2/l;II)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: l90.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C1892a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f89722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Boolean, h0> f89723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f89724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f89725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f89726g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f89727h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1892a(boolean z11, wn0.l<? super Boolean, h0> lVar, d dVar, boolean z12, int i11, int i12) {
            super(2);
            this.f89722c = z11;
            this.f89723d = lVar;
            this.f89724e = dVar;
            this.f89725f = z12;
            this.f89726g = i11;
            this.f89727h = i12;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f89722c, this.f89723d, this.f89724e, this.f89725f, lVar, k2.a(this.f89726g | 1), this.f89727h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z11, wn0.l<? super Boolean, h0> lVar, d dVar, boolean z12, l lVar2, int i11, int i12) {
        boolean z13;
        int i13;
        wn0.l<? super Boolean, h0> lVar3;
        int i14;
        d dVar2;
        int i15;
        int i16;
        boolean z14;
        int i17;
        d dVar3;
        boolean z15;
        l lVar4;
        d dVar4;
        boolean z16;
        w2 w2VarX;
        l lVarV = lVar2.v(-340640888);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            z13 = z11;
        } else if ((i11 & 14) == 0) {
            z13 = z11;
            i13 = (lVarV.p(z13) ? 4 : 2) | i11;
        } else {
            z13 = z11;
            i13 = i11;
        }
        if ((i12 & 2) == 0) {
            if ((i11 & 112) == 0) {
                lVar3 = lVar;
                i13 |= lVarV.K(lVar3) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 7168) == 0) {
                        z14 = z12;
                        if (lVarV.p(z14)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i13 & 5851) == 1170 || !lVarV.b()) {
                        if (i14 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i16 != 0) {
                            z15 = true;
                        } else {
                            z15 = z14;
                        }
                        if (o.J()) {
                            o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                        }
                        p009i2.p pVar = p009i2.p.f74863a;
                        j1 j1Var = j1.f74525a;
                        int i18 = j1.f74526b;
                        lVar4 = lVarV;
                        d dVar5 = dVar3;
                        boolean z17 = z15;
                        q.a(z13, lVar3, dVar5, z17, null, pVar.a(j1Var.a(lVarV, i18).j(), n.n(j1Var, lVarV, i18).getSubtitle(), j1Var.a(lVarV, i18).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar5;
                        z16 = z17;
                    } else {
                        lVarV.j();
                        dVar4 = dVar2;
                        z16 = z14;
                        lVar4 = lVarV;
                    }
                    w2VarX = lVar4.x();
                    if (w2VarX != null) {
                        w2VarX.a(new C1892a(z11, lVar, dVar4, z16, i11, i12));
                    }
                }
                i13 |= 3072;
                z14 = z12;
                if ((i13 & 5851) == 1170) {
                    if (i14 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    if (o.J()) {
                        o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                    }
                    p009i2.p pVar2 = p009i2.p.f74863a;
                    j1 j1Var2 = j1.f74525a;
                    int i19 = j1.f74526b;
                    lVar4 = lVarV;
                    d dVar6 = dVar3;
                    boolean z18 = z15;
                    q.a(z13, lVar3, dVar6, z18, null, pVar2.a(j1Var2.a(lVarV, i19).j(), n.n(j1Var2, lVarV, i19).getSubtitle(), j1Var2.a(lVarV, i19).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar6;
                    z16 = z18;
                } else {
                    if (i14 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    if (o.J()) {
                        o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                    }
                    p009i2.p pVar3 = p009i2.p.f74863a;
                    j1 j1Var3 = j1.f74525a;
                    int i110 = j1.f74526b;
                    lVar4 = lVarV;
                    d dVar7 = dVar3;
                    boolean z19 = z15;
                    q.a(z13, lVar3, dVar7, z19, null, pVar3.a(j1Var3.a(lVarV, i110).j(), n.n(j1Var3, lVarV, i110).getSubtitle(), j1Var3.a(lVarV, i110).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar7;
                    z16 = z19;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new C1892a(z11, lVar, dVar4, z16, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            dVar2 = dVar;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 7168) == 0) {
                    z14 = z12;
                    if (lVarV.p(z14)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i13 & 5851) == 1170) {
                    if (i14 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    if (o.J()) {
                        o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                    }
                    p009i2.p pVar4 = p009i2.p.f74863a;
                    j1 j1Var4 = j1.f74525a;
                    int i111 = j1.f74526b;
                    lVar4 = lVarV;
                    d dVar8 = dVar3;
                    boolean z110 = z15;
                    q.a(z13, lVar3, dVar8, z110, null, pVar4.a(j1Var4.a(lVarV, i111).j(), n.n(j1Var4, lVarV, i111).getSubtitle(), j1Var4.a(lVarV, i111).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar8;
                    z16 = z110;
                } else {
                    if (i14 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    if (o.J()) {
                        o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                    }
                    p009i2.p pVar5 = p009i2.p.f74863a;
                    j1 j1Var5 = j1.f74525a;
                    int i112 = j1.f74526b;
                    lVar4 = lVarV;
                    d dVar9 = dVar3;
                    boolean z111 = z15;
                    q.a(z13, lVar3, dVar9, z111, null, pVar5.a(j1Var5.a(lVarV, i112).j(), n.n(j1Var5, lVarV, i112).getSubtitle(), j1Var5.a(lVarV, i112).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar9;
                    z16 = z111;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new C1892a(z11, lVar, dVar4, z16, i11, i12));
                }
            }
            i13 |= 3072;
            z14 = z12;
            if ((i13 & 5851) == 1170) {
                if (i14 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (o.J()) {
                    o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                }
                p009i2.p pVar6 = p009i2.p.f74863a;
                j1 j1Var6 = j1.f74525a;
                int i113 = j1.f74526b;
                lVar4 = lVarV;
                d dVar10 = dVar3;
                boolean z112 = z15;
                q.a(z13, lVar3, dVar10, z112, null, pVar6.a(j1Var6.a(lVarV, i113).j(), n.n(j1Var6, lVarV, i113).getSubtitle(), j1Var6.a(lVarV, i113).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar10;
                z16 = z112;
            } else {
                if (i14 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (o.J()) {
                    o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                }
                p009i2.p pVar7 = p009i2.p.f74863a;
                j1 j1Var7 = j1.f74525a;
                int i114 = j1.f74526b;
                lVar4 = lVarV;
                d dVar11 = dVar3;
                boolean z113 = z15;
                q.a(z13, lVar3, dVar11, z113, null, pVar7.a(j1Var7.a(lVarV, i114).j(), n.n(j1Var7, lVarV, i114).getSubtitle(), j1Var7.a(lVarV, i114).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar11;
                z16 = z113;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new C1892a(z11, lVar, dVar4, z16, i11, i12));
            }
        }
        i13 |= 48;
        lVar3 = lVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                dVar2 = dVar;
                if (lVarV.n(dVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 7168) == 0) {
                    z14 = z12;
                    if (lVarV.p(z14)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i13 & 5851) == 1170) {
                    if (i14 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    if (o.J()) {
                        o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                    }
                    p009i2.p pVar8 = p009i2.p.f74863a;
                    j1 j1Var8 = j1.f74525a;
                    int i115 = j1.f74526b;
                    lVar4 = lVarV;
                    d dVar12 = dVar3;
                    boolean z114 = z15;
                    q.a(z13, lVar3, dVar12, z114, null, pVar8.a(j1Var8.a(lVarV, i115).j(), n.n(j1Var8, lVarV, i115).getSubtitle(), j1Var8.a(lVarV, i115).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar12;
                    z16 = z114;
                } else {
                    if (i14 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    if (o.J()) {
                        o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                    }
                    p009i2.p pVar9 = p009i2.p.f74863a;
                    j1 j1Var9 = j1.f74525a;
                    int i116 = j1.f74526b;
                    lVar4 = lVarV;
                    d dVar13 = dVar3;
                    boolean z115 = z15;
                    q.a(z13, lVar3, dVar13, z115, null, pVar9.a(j1Var9.a(lVarV, i116).j(), n.n(j1Var9, lVarV, i116).getSubtitle(), j1Var9.a(lVarV, i116).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar13;
                    z16 = z115;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new C1892a(z11, lVar, dVar4, z16, i11, i12));
                }
            }
            i13 |= 3072;
            z14 = z12;
            if ((i13 & 5851) == 1170) {
                if (i14 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (o.J()) {
                    o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                }
                p009i2.p pVar10 = p009i2.p.f74863a;
                j1 j1Var10 = j1.f74525a;
                int i117 = j1.f74526b;
                lVar4 = lVarV;
                d dVar14 = dVar3;
                boolean z116 = z15;
                q.a(z13, lVar3, dVar14, z116, null, pVar10.a(j1Var10.a(lVarV, i117).j(), n.n(j1Var10, lVarV, i117).getSubtitle(), j1Var10.a(lVarV, i117).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar14;
                z16 = z116;
            } else {
                if (i14 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (o.J()) {
                    o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                }
                p009i2.p pVar11 = p009i2.p.f74863a;
                j1 j1Var11 = j1.f74525a;
                int i118 = j1.f74526b;
                lVar4 = lVarV;
                d dVar15 = dVar3;
                boolean z117 = z15;
                q.a(z13, lVar3, dVar15, z117, null, pVar11.a(j1Var11.a(lVarV, i118).j(), n.n(j1Var11, lVarV, i118).getSubtitle(), j1Var11.a(lVarV, i118).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar15;
                z16 = z117;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new C1892a(z11, lVar, dVar4, z16, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 7168) == 0) {
                z14 = z12;
                if (lVarV.p(z14)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i13 & 5851) == 1170) {
                if (i14 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (o.J()) {
                    o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                }
                p009i2.p pVar12 = p009i2.p.f74863a;
                j1 j1Var12 = j1.f74525a;
                int i119 = j1.f74526b;
                lVar4 = lVarV;
                d dVar16 = dVar3;
                boolean z118 = z15;
                q.a(z13, lVar3, dVar16, z118, null, pVar12.a(j1Var12.a(lVarV, i119).j(), n.n(j1Var12, lVarV, i119).getSubtitle(), j1Var12.a(lVarV, i119).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar16;
                z16 = z118;
            } else {
                if (i14 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (o.J()) {
                    o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
                }
                p009i2.p pVar13 = p009i2.p.f74863a;
                j1 j1Var13 = j1.f74525a;
                int i1110 = j1.f74526b;
                lVar4 = lVarV;
                d dVar17 = dVar3;
                boolean z119 = z15;
                q.a(z13, lVar3, dVar17, z119, null, pVar13.a(j1Var13.a(lVarV, i1110).j(), n.n(j1Var13, lVarV, i1110).getSubtitle(), j1Var13.a(lVarV, i1110).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar17;
                z16 = z119;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new C1892a(z11, lVar, dVar4, z16, i11, i12));
            }
        }
        i13 |= 3072;
        z14 = z12;
        if ((i13 & 5851) == 1170) {
            if (i14 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i16 != 0) {
                z15 = true;
            } else {
                z15 = z14;
            }
            if (o.J()) {
                o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
            }
            p009i2.p pVar14 = p009i2.p.f74863a;
            j1 j1Var14 = j1.f74525a;
            int i1111 = j1.f74526b;
            lVar4 = lVarV;
            d dVar18 = dVar3;
            boolean z1110 = z15;
            q.a(z13, lVar3, dVar18, z1110, null, pVar14.a(j1Var14.a(lVarV, i1111).j(), n.n(j1Var14, lVarV, i1111).getSubtitle(), j1Var14.a(lVarV, i1111).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar18;
            z16 = z1110;
        } else {
            if (i14 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i16 != 0) {
                z15 = true;
            } else {
                z15 = z14;
            }
            if (o.J()) {
                o.S(-340640888, i13, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:16)");
            }
            p009i2.p pVar15 = p009i2.p.f74863a;
            j1 j1Var15 = j1.f74525a;
            int i1112 = j1.f74526b;
            lVar4 = lVarV;
            d dVar19 = dVar3;
            boolean z1111 = z15;
            q.a(z13, lVar3, dVar19, z1111, null, pVar15.a(j1Var15.a(lVarV, i1112).j(), n.n(j1Var15, lVarV, i1112).getSubtitle(), j1Var15.a(lVarV, i1112).n(), 0L, 0L, lVar4, p009i2.p.f74864b << 15, 24), lVar4, i13 & 8190, 16);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar19;
            z16 = z1111;
        }
        w2VarX = lVar4.x();
        if (w2VarX != null) {
            w2VarX.a(new C1892a(z11, lVar, dVar4, z16, i11, i12));
        }
    }
}
