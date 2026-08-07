package p008h80;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.d;
import d3.c;
import f90.n;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.j1;
import p009i2.m;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import q1.BorderStroke;
import v1.g;
import v1.i;
import v1.y;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "isEnabled", "isSelected", "isClickable", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "Lv1/y;", "contentPaddingValues", "Lv1/b$m;", "verticalArrangement", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lv1/i;", "content", "a", "(ZZZLwn0/a;Lv1/y;Lv1/b$m;Landroidx/compose/ui/d;Lwn0/q;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class r0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f71316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f71317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y f71319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v1.b.m f71320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<i, l, Integer, h0> f71321h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z11, boolean z12, wn0.a<h0> aVar, y yVar, v1.b.m mVar, q<? super i, ? super l, ? super Integer, h0> qVar) {
            super(2);
            this.f71316c = z11;
            this.f71317d = z12;
            this.f71318e = aVar;
            this.f71319f = yVar;
            this.f71320g = mVar;
            this.f71321h = qVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1029411776, i11, -1, "com.stripe.android.paymentsheet.ui.RowButton.<anonymous> (RowButton.kt:36)");
            }
            d dVarH = t.h(androidx.compose.foundation.selection.a.c(d.INSTANCE, this.f71316c, this.f71317d, null, this.f71318e, 4, null), this.f71319f);
            v1.b.m mVar = this.f71320g;
            q<i, l, Integer, h0> qVar = this.f71321h;
            lVar.H(-483455358);
            i0 i0VarA = g.a(mVar, c.INSTANCE.k(), lVar, 0);
            lVar.H(-1323940314);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarH);
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            qVar.invoke(v1.j.f117505a, lVar, 6);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f71322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f71323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f71324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y f71326g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ v1.b.m f71327h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ d f71328i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q<i, l, Integer, h0> f71329j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f71330k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f71331l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, boolean z12, boolean z13, wn0.a<h0> aVar, y yVar, v1.b.m mVar, d dVar, q<? super i, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f71322c = z11;
            this.f71323d = z12;
            this.f71324e = z13;
            this.f71325f = aVar;
            this.f71326g = yVar;
            this.f71327h = mVar;
            this.f71328i = dVar;
            this.f71329j = qVar;
            this.f71330k = i11;
            this.f71331l = i12;
        }

        public final void a(l lVar, int i11) {
            r0.a(this.f71322c, this.f71323d, this.f71324e, this.f71325f, this.f71326g, this.f71327h, this.f71328i, this.f71329j, lVar, k2.a(this.f71330k | 1), this.f71331l);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x013e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x016d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0177  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127 A[PHI: r4
      0x0127: PHI (r4v23 int) = (r4v19 int), (r4v19 int), (r4v25 int) binds: [B:100:0x012f, B:96:0x0123, B:97:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    public static final void a(boolean z11, boolean z12, boolean z13, wn0.a<h0> onClick, y contentPaddingValues, v1.b.m verticalArrangement, d modifier, q<? super i, ? super l, ? super Integer, h0> content, l lVar, int i11, int i12) {
        int i13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        float f11;
        float fG;
        l lVar2;
        boolean z16;
        w2 w2VarX;
        s.k(onClick, "onClick");
        s.k(contentPaddingValues, "contentPaddingValues");
        s.k(verticalArrangement, "verticalArrangement");
        s.k(modifier, "modifier");
        s.k(content, "content");
        l lVarV = lVar.v(1606041629);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.p(z12) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                z14 = z13;
                int i18 = lVarV.p(z14) ? 256 : 128;
                i13 |= i18;
            } else {
                z14 = z13;
            }
            i13 |= i18;
        } else {
            z14 = z13;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= lVarV.K(onClick) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            i13 |= lVarV.n(contentPaddingValues) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i12 & 32) == 0) {
            if ((458752 & i11) == 0) {
                i14 = lVarV.n(verticalArrangement) ? 131072 : 65536;
            }
            if ((i12 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (lVarV.n(modifier)) {
                        i15 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i15 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (lVarV.K(content)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                    }
                    if ((23967451 & i13) == 4793490 || !lVarV.b()) {
                        lVarV.L();
                        if ((i11 & 1) != 0 || lVarV.k()) {
                            if ((i12 & 4) != 0) {
                                i17 = i13 & (-897);
                                z15 = z11;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                            }
                            if (z11) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.6f;
                            }
                            d dVarA = h3.a.a(modifier, f11);
                            j1 j1Var = j1.f74525a;
                            int i19 = j1.f74526b;
                            a2.a medium = j1Var.b(lVarV, i19).getMedium();
                            long component = n.n(j1Var, lVarV, i19).getComponent();
                            BorderStroke borderStrokeE = n.e(j1Var, z12, lVarV, (i17 & 112) | i19);
                            if (z12) {
                                fG = h.g((float) 1.5d);
                            } else {
                                fG = h.g(0);
                            }
                            lVar2 = lVarV;
                            m.a(dVarA, medium, component, 0L, borderStrokeE, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                            if (o.J()) {
                                o.R();
                            }
                            z16 = z15;
                        } else {
                            lVarV.j();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                        }
                        boolean z17 = z14;
                        i17 = i13;
                        z15 = z17;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                        }
                        if (z11) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.6f;
                        }
                        d dVarA2 = h3.a.a(modifier, f11);
                        j1 j1Var2 = j1.f74525a;
                        int i110 = j1.f74526b;
                        a2.a medium2 = j1Var2.b(lVarV, i110).getMedium();
                        long component2 = n.n(j1Var2, lVarV, i110).getComponent();
                        BorderStroke borderStrokeE2 = n.e(j1Var2, z12, lVarV, (i17 & 112) | i110);
                        if (z12) {
                            fG = h.g((float) 1.5d);
                        } else {
                            fG = h.g(0);
                        }
                        lVar2 = lVarV;
                        m.a(dVarA2, medium2, component2, 0L, borderStrokeE2, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                        if (o.J()) {
                            o.R();
                        }
                        z16 = z15;
                    } else {
                        lVarV.j();
                        lVar2 = lVarV;
                        z16 = z14;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z11, z12, z16, onClick, contentPaddingValues, verticalArrangement, modifier, content, i11, i12));
                    }
                }
                i16 = 12582912;
                i13 |= i16;
                if ((23967451 & i13) == 4793490) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 4) != 0) {
                            i17 = i13 & (-897);
                            z15 = z11;
                        } else {
                            boolean z18 = z14;
                            i17 = i13;
                            z15 = z18;
                        }
                    } else if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z19 = z14;
                        i17 = i13;
                        z15 = z19;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                    }
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    d dVarA3 = h3.a.a(modifier, f11);
                    j1 j1Var3 = j1.f74525a;
                    int i111 = j1.f74526b;
                    a2.a medium3 = j1Var3.b(lVarV, i111).getMedium();
                    long component3 = n.n(j1Var3, lVarV, i111).getComponent();
                    BorderStroke borderStrokeE3 = n.e(j1Var3, z12, lVarV, (i17 & 112) | i111);
                    if (z12) {
                        fG = h.g((float) 1.5d);
                    } else {
                        fG = h.g(0);
                    }
                    lVar2 = lVarV;
                    m.a(dVarA3, medium3, component3, 0L, borderStrokeE3, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                    if (o.J()) {
                        o.R();
                    }
                    z16 = z15;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 4) != 0) {
                            i17 = i13 & (-897);
                            z15 = z11;
                        } else {
                            boolean z110 = z14;
                            i17 = i13;
                            z15 = z110;
                        }
                    } else if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z111 = z14;
                        i17 = i13;
                        z15 = z111;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                    }
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    d dVarA4 = h3.a.a(modifier, f11);
                    j1 j1Var4 = j1.f74525a;
                    int i112 = j1.f74526b;
                    a2.a medium4 = j1Var4.b(lVarV, i112).getMedium();
                    long component4 = n.n(j1Var4, lVarV, i112).getComponent();
                    BorderStroke borderStrokeE4 = n.e(j1Var4, z12, lVarV, (i17 & 112) | i112);
                    if (z12) {
                        fG = h.g((float) 1.5d);
                    } else {
                        fG = h.g(0);
                    }
                    lVar2 = lVarV;
                    m.a(dVarA4, medium4, component4, 0L, borderStrokeE4, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                    if (o.J()) {
                        o.R();
                    }
                    z16 = z15;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z11, z12, z16, onClick, contentPaddingValues, verticalArrangement, modifier, content, i11, i12));
                }
            }
            i15 = 1572864;
            i13 |= i15;
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (lVarV.K(content)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                }
                if ((23967451 & i13) == 4793490) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 4) != 0) {
                            i17 = i13 & (-897);
                            z15 = z11;
                        } else {
                            boolean z112 = z14;
                            i17 = i13;
                            z15 = z112;
                        }
                    } else if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z113 = z14;
                        i17 = i13;
                        z15 = z113;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                    }
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    d dVarA5 = h3.a.a(modifier, f11);
                    j1 j1Var5 = j1.f74525a;
                    int i113 = j1.f74526b;
                    a2.a medium5 = j1Var5.b(lVarV, i113).getMedium();
                    long component5 = n.n(j1Var5, lVarV, i113).getComponent();
                    BorderStroke borderStrokeE5 = n.e(j1Var5, z12, lVarV, (i17 & 112) | i113);
                    if (z12) {
                        fG = h.g((float) 1.5d);
                    } else {
                        fG = h.g(0);
                    }
                    lVar2 = lVarV;
                    m.a(dVarA5, medium5, component5, 0L, borderStrokeE5, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                    if (o.J()) {
                        o.R();
                    }
                    z16 = z15;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 4) != 0) {
                            i17 = i13 & (-897);
                            z15 = z11;
                        } else {
                            boolean z114 = z14;
                            i17 = i13;
                            z15 = z114;
                        }
                    } else if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z115 = z14;
                        i17 = i13;
                        z15 = z115;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                    }
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    d dVarA6 = h3.a.a(modifier, f11);
                    j1 j1Var6 = j1.f74525a;
                    int i114 = j1.f74526b;
                    a2.a medium6 = j1Var6.b(lVarV, i114).getMedium();
                    long component6 = n.n(j1Var6, lVarV, i114).getComponent();
                    BorderStroke borderStrokeE6 = n.e(j1Var6, z12, lVarV, (i17 & 112) | i114);
                    if (z12) {
                        fG = h.g((float) 1.5d);
                    } else {
                        fG = h.g(0);
                    }
                    lVar2 = lVarV;
                    m.a(dVarA6, medium6, component6, 0L, borderStrokeE6, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                    if (o.J()) {
                        o.R();
                    }
                    z16 = z15;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z11, z12, z16, onClick, contentPaddingValues, verticalArrangement, modifier, content, i11, i12));
                }
            }
            i16 = 12582912;
            i13 |= i16;
            if ((23967451 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z116 = z14;
                        i17 = i13;
                        z15 = z116;
                    }
                } else if ((i12 & 4) != 0) {
                    i17 = i13 & (-897);
                    z15 = z11;
                } else {
                    boolean z117 = z14;
                    i17 = i13;
                    z15 = z117;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                }
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                d dVarA7 = h3.a.a(modifier, f11);
                j1 j1Var7 = j1.f74525a;
                int i115 = j1.f74526b;
                a2.a medium7 = j1Var7.b(lVarV, i115).getMedium();
                long component7 = n.n(j1Var7, lVarV, i115).getComponent();
                BorderStroke borderStrokeE7 = n.e(j1Var7, z12, lVarV, (i17 & 112) | i115);
                if (z12) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                lVar2 = lVarV;
                m.a(dVarA7, medium7, component7, 0L, borderStrokeE7, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                if (o.J()) {
                    o.R();
                }
                z16 = z15;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z118 = z14;
                        i17 = i13;
                        z15 = z118;
                    }
                } else if ((i12 & 4) != 0) {
                    i17 = i13 & (-897);
                    z15 = z11;
                } else {
                    boolean z119 = z14;
                    i17 = i13;
                    z15 = z119;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                }
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                d dVarA8 = h3.a.a(modifier, f11);
                j1 j1Var8 = j1.f74525a;
                int i116 = j1.f74526b;
                a2.a medium8 = j1Var8.b(lVarV, i116).getMedium();
                long component8 = n.n(j1Var8, lVarV, i116).getComponent();
                BorderStroke borderStrokeE8 = n.e(j1Var8, z12, lVarV, (i17 & 112) | i116);
                if (z12) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                lVar2 = lVarV;
                m.a(dVarA8, medium8, component8, 0L, borderStrokeE8, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                if (o.J()) {
                    o.R();
                }
                z16 = z15;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z11, z12, z16, onClick, contentPaddingValues, verticalArrangement, modifier, content, i11, i12));
            }
        }
        i14 = 196608;
        i13 |= i14;
        if ((i12 & 64) != 0) {
            if ((3670016 & i11) == 0) {
                if (lVarV.n(modifier)) {
                    i15 = PKIFailureInfo.badCertTemplate;
                } else {
                    i15 = PKIFailureInfo.signerNotTrusted;
                }
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (lVarV.K(content)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                }
                if ((23967451 & i13) == 4793490) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 4) != 0) {
                            i17 = i13 & (-897);
                            z15 = z11;
                        } else {
                            boolean z1110 = z14;
                            i17 = i13;
                            z15 = z1110;
                        }
                    } else if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z1111 = z14;
                        i17 = i13;
                        z15 = z1111;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                    }
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    d dVarA9 = h3.a.a(modifier, f11);
                    j1 j1Var9 = j1.f74525a;
                    int i117 = j1.f74526b;
                    a2.a medium9 = j1Var9.b(lVarV, i117).getMedium();
                    long component9 = n.n(j1Var9, lVarV, i117).getComponent();
                    BorderStroke borderStrokeE9 = n.e(j1Var9, z12, lVarV, (i17 & 112) | i117);
                    if (z12) {
                        fG = h.g((float) 1.5d);
                    } else {
                        fG = h.g(0);
                    }
                    lVar2 = lVarV;
                    m.a(dVarA9, medium9, component9, 0L, borderStrokeE9, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                    if (o.J()) {
                        o.R();
                    }
                    z16 = z15;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 4) != 0) {
                            i17 = i13 & (-897);
                            z15 = z11;
                        } else {
                            boolean z1112 = z14;
                            i17 = i13;
                            z15 = z1112;
                        }
                    } else if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z1113 = z14;
                        i17 = i13;
                        z15 = z1113;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                    }
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    d dVarA10 = h3.a.a(modifier, f11);
                    j1 j1Var10 = j1.f74525a;
                    int i118 = j1.f74526b;
                    a2.a medium10 = j1Var10.b(lVarV, i118).getMedium();
                    long component10 = n.n(j1Var10, lVarV, i118).getComponent();
                    BorderStroke borderStrokeE10 = n.e(j1Var10, z12, lVarV, (i17 & 112) | i118);
                    if (z12) {
                        fG = h.g((float) 1.5d);
                    } else {
                        fG = h.g(0);
                    }
                    lVar2 = lVarV;
                    m.a(dVarA10, medium10, component10, 0L, borderStrokeE10, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                    if (o.J()) {
                        o.R();
                    }
                    z16 = z15;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z11, z12, z16, onClick, contentPaddingValues, verticalArrangement, modifier, content, i11, i12));
                }
            }
            i16 = 12582912;
            i13 |= i16;
            if ((23967451 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z1114 = z14;
                        i17 = i13;
                        z15 = z1114;
                    }
                } else if ((i12 & 4) != 0) {
                    i17 = i13 & (-897);
                    z15 = z11;
                } else {
                    boolean z1115 = z14;
                    i17 = i13;
                    z15 = z1115;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                }
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                d dVarA11 = h3.a.a(modifier, f11);
                j1 j1Var11 = j1.f74525a;
                int i119 = j1.f74526b;
                a2.a medium11 = j1Var11.b(lVarV, i119).getMedium();
                long component11 = n.n(j1Var11, lVarV, i119).getComponent();
                BorderStroke borderStrokeE11 = n.e(j1Var11, z12, lVarV, (i17 & 112) | i119);
                if (z12) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                lVar2 = lVarV;
                m.a(dVarA11, medium11, component11, 0L, borderStrokeE11, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                if (o.J()) {
                    o.R();
                }
                z16 = z15;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z1116 = z14;
                        i17 = i13;
                        z15 = z1116;
                    }
                } else if ((i12 & 4) != 0) {
                    i17 = i13 & (-897);
                    z15 = z11;
                } else {
                    boolean z1117 = z14;
                    i17 = i13;
                    z15 = z1117;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                }
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                d dVarA12 = h3.a.a(modifier, f11);
                j1 j1Var12 = j1.f74525a;
                int i1110 = j1.f74526b;
                a2.a medium12 = j1Var12.b(lVarV, i1110).getMedium();
                long component12 = n.n(j1Var12, lVarV, i1110).getComponent();
                BorderStroke borderStrokeE12 = n.e(j1Var12, z12, lVarV, (i17 & 112) | i1110);
                if (z12) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                lVar2 = lVarV;
                m.a(dVarA12, medium12, component12, 0L, borderStrokeE12, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                if (o.J()) {
                    o.R();
                }
                z16 = z15;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z11, z12, z16, onClick, contentPaddingValues, verticalArrangement, modifier, content, i11, i12));
            }
        }
        i15 = 1572864;
        i13 |= i15;
        if ((i12 & 128) != 0) {
            if ((29360128 & i11) == 0) {
                if (lVarV.K(content)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
            }
            if ((23967451 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z1118 = z14;
                        i17 = i13;
                        z15 = z1118;
                    }
                } else if ((i12 & 4) != 0) {
                    i17 = i13 & (-897);
                    z15 = z11;
                } else {
                    boolean z1119 = z14;
                    i17 = i13;
                    z15 = z1119;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                }
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                d dVarA13 = h3.a.a(modifier, f11);
                j1 j1Var13 = j1.f74525a;
                int i1111 = j1.f74526b;
                a2.a medium13 = j1Var13.b(lVarV, i1111).getMedium();
                long component13 = n.n(j1Var13, lVarV, i1111).getComponent();
                BorderStroke borderStrokeE13 = n.e(j1Var13, z12, lVarV, (i17 & 112) | i1111);
                if (z12) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                lVar2 = lVarV;
                m.a(dVarA13, medium13, component13, 0L, borderStrokeE13, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                if (o.J()) {
                    o.R();
                }
                z16 = z15;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if ((i12 & 4) != 0) {
                        i17 = i13 & (-897);
                        z15 = z11;
                    } else {
                        boolean z11110 = z14;
                        i17 = i13;
                        z15 = z11110;
                    }
                } else if ((i12 & 4) != 0) {
                    i17 = i13 & (-897);
                    z15 = z11;
                } else {
                    boolean z11111 = z14;
                    i17 = i13;
                    z15 = z11111;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
                }
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                d dVarA14 = h3.a.a(modifier, f11);
                j1 j1Var14 = j1.f74525a;
                int i1112 = j1.f74526b;
                a2.a medium14 = j1Var14.b(lVarV, i1112).getMedium();
                long component14 = n.n(j1Var14, lVarV, i1112).getComponent();
                BorderStroke borderStrokeE14 = n.e(j1Var14, z12, lVarV, (i17 & 112) | i1112);
                if (z12) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                lVar2 = lVarV;
                m.a(dVarA14, medium14, component14, 0L, borderStrokeE14, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
                if (o.J()) {
                    o.R();
                }
                z16 = z15;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z11, z12, z16, onClick, contentPaddingValues, verticalArrangement, modifier, content, i11, i12));
            }
        }
        i16 = 12582912;
        i13 |= i16;
        if ((23967451 & i13) == 4793490) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if ((i12 & 4) != 0) {
                    i17 = i13 & (-897);
                    z15 = z11;
                } else {
                    boolean z11112 = z14;
                    i17 = i13;
                    z15 = z11112;
                }
            } else if ((i12 & 4) != 0) {
                i17 = i13 & (-897);
                z15 = z11;
            } else {
                boolean z11113 = z14;
                i17 = i13;
                z15 = z11113;
            }
            lVarV.C();
            if (o.J()) {
                o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
            }
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            d dVarA15 = h3.a.a(modifier, f11);
            j1 j1Var15 = j1.f74525a;
            int i1113 = j1.f74526b;
            a2.a medium15 = j1Var15.b(lVarV, i1113).getMedium();
            long component15 = n.n(j1Var15, lVarV, i1113).getComponent();
            BorderStroke borderStrokeE15 = n.e(j1Var15, z12, lVarV, (i17 & 112) | i1113);
            if (z12) {
                fG = h.g((float) 1.5d);
            } else {
                fG = h.g(0);
            }
            lVar2 = lVarV;
            m.a(dVarA15, medium15, component15, 0L, borderStrokeE15, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
            if (o.J()) {
                o.R();
            }
            z16 = z15;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if ((i12 & 4) != 0) {
                    i17 = i13 & (-897);
                    z15 = z11;
                } else {
                    boolean z11114 = z14;
                    i17 = i13;
                    z15 = z11114;
                }
            } else if ((i12 & 4) != 0) {
                i17 = i13 & (-897);
                z15 = z11;
            } else {
                boolean z11115 = z14;
                i17 = i13;
                z15 = z11115;
            }
            lVarV.C();
            if (o.J()) {
                o.S(1606041629, i17, -1, "com.stripe.android.paymentsheet.ui.RowButton (RowButton.kt:27)");
            }
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            d dVarA16 = h3.a.a(modifier, f11);
            j1 j1Var16 = j1.f74525a;
            int i1114 = j1.f74526b;
            a2.a medium16 = j1Var16.b(lVarV, i1114).getMedium();
            long component16 = n.n(j1Var16, lVarV, i1114).getComponent();
            BorderStroke borderStrokeE16 = n.e(j1Var16, z12, lVarV, (i17 & 112) | i1114);
            if (z12) {
                fG = h.g((float) 1.5d);
            } else {
                fG = h.g(0);
            }
            lVar2 = lVarV;
            m.a(dVarA16, medium16, component16, 0L, borderStrokeE16, fG, z2.c.b(lVarV, -1029411776, true, new a(z12, z15, onClick, contentPaddingValues, verticalArrangement, content)), lVar2, 1572864, 8);
            if (o.J()) {
                o.R();
            }
            z16 = z15;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, z12, z16, onClick, contentPaddingValues, verticalArrangement, modifier, content, i11, i12));
        }
    }
}
