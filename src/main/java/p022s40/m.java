package p022s40;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.x;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import i40.i;
import jn0.h0;
import k3.g4;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.e1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y2;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;
import z3.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/painter/b;", PlaceTypes.PAINTER, "Landroidx/compose/ui/d;", "modifier", "Ls40/g;", "iconSize", "Lk3/g4;", "backgroundShape", "", "contentDescription", "Ljn0/h0;", "c", "(Landroidx/compose/ui/graphics/painter/b;Landroidx/compose/ui/d;Ls40/g;Lk3/g4;Ljava/lang/String;Lr2/l;II)V", ImagesContract.URL, "errorPainter", "", "flushed", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Landroidx/compose/ui/d;Ls40/g;Lk3/g4;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/b;ZLr2/l;II)V", "b", "(Ls40/g;Landroidx/compose/ui/graphics/painter/b;Ljava/lang/String;Lr2/l;I)V", "Lkotlin/Function0;", "content", "a", "(Landroidx/compose/ui/d;Ls40/g;Lk3/g4;Lwn0/p;Lr2/l;II)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f110016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f110017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g4 f110018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f110019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f110020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f110021h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.d dVar, g gVar, g4 g4Var, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f110016c = dVar;
            this.f110017d = gVar;
            this.f110018e = g4Var;
            this.f110019f = pVar;
            this.f110020g = i11;
            this.f110021h = i12;
        }

        public final void a(l lVar, int i11) {
            m.a(this.f110016c, this.f110017d, this.f110018e, this.f110019f, lVar, k2.a(this.f110020g | 1), this.f110021h);
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
        final /* synthetic */ g f110022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f110023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f110024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f110025f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, androidx.compose.ui.graphics.painter.b bVar, String str, int i11) {
            super(2);
            this.f110022c = gVar;
            this.f110023d = bVar;
            this.f110024e = str;
            this.f110025f = i11;
        }

        public final void a(l lVar, int i11) {
            m.b(this.f110022c, this.f110023d, this.f110024e, lVar, k2.a(this.f110025f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f110026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f110027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f110028e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g gVar, androidx.compose.ui.graphics.painter.b bVar, String str) {
            super(2);
            this.f110026c = gVar;
            this.f110027d = bVar;
            this.f110028e = str;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-982781912, i11, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous> (ShapedIcon.kt:40)");
            }
            m.b(this.f110026c, this.f110027d, this.f110028e, lVar, 64);
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
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f110029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f110030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f110031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4 f110032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f110033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f110034h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f110035i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.d dVar, g gVar, g4 g4Var, String str, int i11, int i12) {
            super(2);
            this.f110029c = bVar;
            this.f110030d = dVar;
            this.f110031e = gVar;
            this.f110032f = g4Var;
            this.f110033g = str;
            this.f110034h = i11;
            this.f110035i = i12;
        }

        public final void a(l lVar, int i11) {
            m.c(this.f110029c, this.f110030d, this.f110031e, this.f110032f, this.f110033g, lVar, k2.a(this.f110034h | 1), this.f110035i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f110037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f110038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f110039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f110040g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements q<v1.e, l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.painter.b f110041c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f110042d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f110043e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.graphics.painter.b bVar, g gVar, String str) {
                super(3);
                this.f110041c = bVar;
                this.f110042d = gVar;
                this.f110043e = str;
            }

            public final void a(v1.e StripeImage, l lVar, int i11) {
                s.k(StripeImage, "$this$StripeImage");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-1183890906, i11, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous>.<anonymous> (ShapedIcon.kt:84)");
                }
                androidx.compose.ui.graphics.painter.b bVar = this.f110041c;
                if (bVar != null) {
                    m.b(this.f110042d, bVar, this.f110043e, lVar, 64);
                }
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(v1.e eVar, l lVar, Integer num) {
                a(eVar, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z11, g gVar, String str, String str2, androidx.compose.ui.graphics.painter.b bVar) {
            super(2);
            this.f110036c = z11;
            this.f110037d = gVar;
            this.f110038e = str;
            this.f110039f = str2;
            this.f110040g = bVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1200239329, i11, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous> (ShapedIcon.kt:75)");
            }
            androidx.compose.ui.d dVarQ = x.q(androidx.compose.ui.d.INSTANCE, this.f110036c ? this.f110037d.getSize() : this.f110037d.getPaddedSize());
            o90.f fVar = (o90.f) lVar.U(v50.b.d());
            androidx.compose.ui.graphics.painter.b bVarC = e4.e.c(i.f75841g, lVar, 0);
            k kVarA = k.INSTANCE.a();
            String str = this.f110038e;
            String str2 = this.f110039f;
            com.stripe.android.uicore.image.a.a(str, fVar, str2, dVarQ, kVarA, null, bVarC, null, false, z2.c.b(lVar, -1183890906, true, new a(this.f110040g, this.f110037d, str2)), null, lVar, (o90.f.f96995g << 3) | 807428096, 0, 1440);
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
    static final class f extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f110044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f110045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f110046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4 f110047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f110048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f110049h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f110050i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f110051j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f110052k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, androidx.compose.ui.d dVar, g gVar, g4 g4Var, String str2, androidx.compose.ui.graphics.painter.b bVar, boolean z11, int i11, int i12) {
            super(2);
            this.f110044c = str;
            this.f110045d = dVar;
            this.f110046e = gVar;
            this.f110047f = g4Var;
            this.f110048g = str2;
            this.f110049h = bVar;
            this.f110050i = z11;
            this.f110051j = i11;
            this.f110052k = i12;
        }

        public final void a(l lVar, int i11) {
            m.d(this.f110044c, this.f110045d, this.f110046e, this.f110047f, this.f110048g, this.f110049h, this.f110050i, lVar, k2.a(this.f110051j | 1), this.f110052k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(androidx.compose.ui.d dVar, g gVar, g4 g4Var, p<? super l, ? super Integer, h0> pVar, l lVar, int i11, int i12) {
        int i13;
        l lVarV = lVar.v(1894956150);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(gVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            i13 |= lVarV.n(g4Var) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= lVarV.K(pVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (o.J()) {
                o.S(1894956150, i13, -1, "com.stripe.android.financialconnections.features.common.IconWrapperBox (ShapedIcon.kt:117)");
            }
            d3.c cVarE = d3.c.INSTANCE.e();
            androidx.compose.ui.d dVarA = h3.e.a(androidx.compose.foundation.b.c(x.q(dVar, gVar.getSize()), p026y50.d.f125064a.a(lVarV, 6).getIconBackground(), g4Var), g4Var);
            lVarV.H(733328855);
            i0 i0VarJ = g.j(cVarE, false, lVarV, 6);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarA);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVarV, Integer.valueOf((i13 >> 9) & 14));
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar2, gVar, g4Var, pVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(g gVar, androidx.compose.ui.graphics.painter.b bVar, String str, l lVar, int i11) {
        l lVarV = lVar.v(-202466975);
        if (o.J()) {
            o.S(-202466975, i11, -1, "com.stripe.android.financialconnections.features.common.LocalIcon (ShapedIcon.kt:102)");
        }
        e1.a(bVar, str, x.q(androidx.compose.ui.d.INSTANCE, gVar.getPaddedSize()), p026y50.d.f125064a.a(lVarV, 6).getIconBrand(), lVarV, ((i11 >> 3) & 112) | 8, 0);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(gVar, bVar, str, i11));
        }
    }

    public static final void c(androidx.compose.ui.graphics.painter.b painter, androidx.compose.ui.d dVar, g gVar, g4 g4Var, String str, l lVar, int i11, int i12) {
        int i13;
        g4 g4VarF;
        int i14;
        s.k(painter, "painter");
        l lVarV = lVar.v(716371143);
        androidx.compose.ui.d dVar2 = (i12 & 2) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        g gVar2 = (i12 & 4) != 0 ? g.Medium : gVar;
        if ((i12 & 8) != 0) {
            g4VarF = a2.g.f();
            i13 = i11;
            i14 = i13 & (-7169);
        } else {
            i13 = i11;
            g4VarF = g4Var;
            i14 = i13;
        }
        if (o.J()) {
            o.S(716371143, i14, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:34)");
        }
        int i15 = i14 >> 3;
        a(dVar2, gVar2, g4VarF, z2.c.b(lVarV, -982781912, true, new c(gVar2, painter, str)), lVarV, (i15 & 14) | 3072 | (i15 & 112) | (i15 & 896), 0);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(painter, dVar2, gVar2, g4VarF, str, i13, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    public static final void d(String url, androidx.compose.ui.d dVar, g gVar, g4 g4Var, String str, androidx.compose.ui.graphics.painter.b bVar, boolean z11, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        g gVar2;
        int i15;
        g4 g4VarF;
        String str2;
        int i16;
        int i17;
        int i18;
        boolean z12;
        int i19;
        androidx.compose.ui.d dVar3;
        androidx.compose.ui.graphics.painter.b bVar2;
        int i21;
        g gVar3;
        androidx.compose.ui.d dVar4;
        androidx.compose.ui.graphics.painter.b bVar3;
        boolean z13;
        l lVar2;
        androidx.compose.ui.graphics.painter.b bVar4;
        g4 g4Var2;
        g gVar4;
        androidx.compose.ui.d dVar5;
        boolean z14;
        w2 w2VarX;
        s.k(url, "url");
        l lVarV = lVar.v(-1654712672);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(url) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    gVar2 = gVar;
                    if (lVarV.n(gVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 7168) == 0) {
                    if ((i12 & 8) == 0) {
                        g4VarF = g4Var;
                        int i23 = lVarV.n(g4VarF) ? 2048 : 1024;
                        i13 |= i23;
                    } else {
                        g4VarF = g4Var;
                    }
                    i13 |= i23;
                } else {
                    g4VarF = g4Var;
                }
                if ((i12 & 16) != 0) {
                    if ((57344 & i11) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i16 = 16384;
                        } else {
                            i16 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i16;
                    }
                    i17 = i12 & 32;
                    if (i17 != 0) {
                        i13 |= 65536;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        if ((3670016 & i11) == 0) {
                            z12 = z11;
                            if (lVarV.p(z12)) {
                                i19 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i19 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i19;
                        }
                        if (i17 != 32 && (2995931 & i13) == 599186 && lVarV.b()) {
                            lVarV.j();
                            dVar5 = dVar2;
                            lVar2 = lVarV;
                            gVar4 = gVar2;
                            g4Var2 = g4VarF;
                            bVar4 = bVar;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0 || lVarV.k()) {
                                if (i22 != 0) {
                                    dVar3 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (i14 != 0) {
                                    gVar2 = g.Medium;
                                }
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                    g4VarF = a2.g.f();
                                }
                                if (i17 != 0) {
                                    bVar2 = null;
                                } else {
                                    bVar2 = bVar;
                                }
                                if (i18 != 0) {
                                    g gVar5 = gVar2;
                                    i21 = i13;
                                    gVar3 = gVar5;
                                    dVar4 = dVar3;
                                    z13 = false;
                                    bVar3 = bVar2;
                                } else {
                                    g gVar6 = gVar2;
                                    i21 = i13;
                                    gVar3 = gVar6;
                                    dVar4 = dVar3;
                                    bVar3 = bVar2;
                                    z13 = z12;
                                }
                            } else {
                                lVarV.j();
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                g gVar7 = gVar2;
                                i21 = i13;
                                gVar3 = gVar7;
                                dVar4 = dVar2;
                                z13 = z12;
                                bVar3 = bVar;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                            }
                            z12 = z13;
                            androidx.compose.ui.graphics.painter.b bVar5 = bVar3;
                            z2.a aVarB = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                            int i24 = i21 >> 3;
                            int i25 = (i24 & 896) | (i24 & 14) | 3072 | (i24 & 112);
                            lVar2 = lVarV;
                            androidx.compose.ui.d dVar6 = dVar4;
                            g4 g4Var3 = g4VarF;
                            a(dVar6, gVar3, g4Var3, aVarB, lVar2, i25, 0);
                            if (o.J()) {
                                o.R();
                            }
                            bVar4 = bVar5;
                            g4Var2 = g4Var3;
                            gVar4 = gVar3;
                            dVar5 = dVar6;
                        }
                        z14 = z12;
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                        }
                    }
                    i13 |= 1572864;
                    z12 = z11;
                    if (i17 != 32) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar8 = gVar2;
                                i21 = i13;
                                gVar3 = gVar8;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar9 = gVar2;
                                i21 = i13;
                                gVar3 = gVar9;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar10 = gVar2;
                                i21 = i13;
                                gVar3 = gVar10;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar11 = gVar2;
                                i21 = i13;
                                gVar3 = gVar11;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                        }
                        z12 = z13;
                        androidx.compose.ui.graphics.painter.b bVar6 = bVar3;
                        z2.a aVarB2 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                        int i26 = i21 >> 3;
                        int i27 = (i26 & 896) | (i26 & 14) | 3072 | (i26 & 112);
                        lVar2 = lVarV;
                        androidx.compose.ui.d dVar7 = dVar4;
                        g4 g4Var4 = g4VarF;
                        a(dVar7, gVar3, g4Var4, aVarB2, lVar2, i27, 0);
                        if (o.J()) {
                            o.R();
                        }
                        bVar4 = bVar6;
                        g4Var2 = g4Var4;
                        gVar4 = gVar3;
                        dVar5 = dVar7;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar12 = gVar2;
                                i21 = i13;
                                gVar3 = gVar12;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar13 = gVar2;
                                i21 = i13;
                                gVar3 = gVar13;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar14 = gVar2;
                                i21 = i13;
                                gVar3 = gVar14;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar15 = gVar2;
                                i21 = i13;
                                gVar3 = gVar15;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                        }
                        z12 = z13;
                        androidx.compose.ui.graphics.painter.b bVar7 = bVar3;
                        z2.a aVarB3 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                        int i28 = i21 >> 3;
                        int i29 = (i28 & 896) | (i28 & 14) | 3072 | (i28 & 112);
                        lVar2 = lVarV;
                        androidx.compose.ui.d dVar8 = dVar4;
                        g4 g4Var5 = g4VarF;
                        a(dVar8, gVar3, g4Var5, aVarB3, lVar2, i29, 0);
                        if (o.J()) {
                            o.R();
                        }
                        bVar4 = bVar7;
                        g4Var2 = g4Var5;
                        gVar4 = gVar3;
                        dVar5 = dVar8;
                    }
                    z14 = z12;
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                    }
                }
                i13 |= 24576;
                str2 = str;
                i17 = i12 & 32;
                if (i17 != 0) {
                    i13 |= 65536;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    if ((3670016 & i11) == 0) {
                        z12 = z11;
                        if (lVarV.p(z12)) {
                            i19 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i19 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i19;
                    }
                    if (i17 != 32) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar16 = gVar2;
                                i21 = i13;
                                gVar3 = gVar16;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar17 = gVar2;
                                i21 = i13;
                                gVar3 = gVar17;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar18 = gVar2;
                                i21 = i13;
                                gVar3 = gVar18;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar19 = gVar2;
                                i21 = i13;
                                gVar3 = gVar19;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                        }
                        z12 = z13;
                        androidx.compose.ui.graphics.painter.b bVar8 = bVar3;
                        z2.a aVarB4 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                        int i210 = i21 >> 3;
                        int i211 = (i210 & 896) | (i210 & 14) | 3072 | (i210 & 112);
                        lVar2 = lVarV;
                        androidx.compose.ui.d dVar9 = dVar4;
                        g4 g4Var6 = g4VarF;
                        a(dVar9, gVar3, g4Var6, aVarB4, lVar2, i211, 0);
                        if (o.J()) {
                            o.R();
                        }
                        bVar4 = bVar8;
                        g4Var2 = g4Var6;
                        gVar4 = gVar3;
                        dVar5 = dVar9;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar110 = gVar2;
                                i21 = i13;
                                gVar3 = gVar110;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar111 = gVar2;
                                i21 = i13;
                                gVar3 = gVar111;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar112 = gVar2;
                                i21 = i13;
                                gVar3 = gVar112;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar113 = gVar2;
                                i21 = i13;
                                gVar3 = gVar113;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                        }
                        z12 = z13;
                        androidx.compose.ui.graphics.painter.b bVar9 = bVar3;
                        z2.a aVarB5 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                        int i212 = i21 >> 3;
                        int i213 = (i212 & 896) | (i212 & 14) | 3072 | (i212 & 112);
                        lVar2 = lVarV;
                        androidx.compose.ui.d dVar10 = dVar4;
                        g4 g4Var7 = g4VarF;
                        a(dVar10, gVar3, g4Var7, aVarB5, lVar2, i213, 0);
                        if (o.J()) {
                            o.R();
                        }
                        bVar4 = bVar9;
                        g4Var2 = g4Var7;
                        gVar4 = gVar3;
                        dVar5 = dVar10;
                    }
                    z14 = z12;
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                    }
                }
                i13 |= 1572864;
                z12 = z11;
                if (i17 != 32) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar114 = gVar2;
                            i21 = i13;
                            gVar3 = gVar114;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar115 = gVar2;
                            i21 = i13;
                            gVar3 = gVar115;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar116 = gVar2;
                            i21 = i13;
                            gVar3 = gVar116;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar117 = gVar2;
                            i21 = i13;
                            gVar3 = gVar117;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar10 = bVar3;
                    z2.a aVarB6 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i214 = i21 >> 3;
                    int i215 = (i214 & 896) | (i214 & 14) | 3072 | (i214 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar11 = dVar4;
                    g4 g4Var8 = g4VarF;
                    a(dVar11, gVar3, g4Var8, aVarB6, lVar2, i215, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar10;
                    g4Var2 = g4Var8;
                    gVar4 = gVar3;
                    dVar5 = dVar11;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar118 = gVar2;
                            i21 = i13;
                            gVar3 = gVar118;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar119 = gVar2;
                            i21 = i13;
                            gVar3 = gVar119;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar1110 = gVar2;
                            i21 = i13;
                            gVar3 = gVar1110;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar1111 = gVar2;
                            i21 = i13;
                            gVar3 = gVar1111;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar11 = bVar3;
                    z2.a aVarB7 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i216 = i21 >> 3;
                    int i217 = (i216 & 896) | (i216 & 14) | 3072 | (i216 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar12 = dVar4;
                    g4 g4Var9 = g4VarF;
                    a(dVar12, gVar3, g4Var9, aVarB7, lVar2, i217, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar11;
                    g4Var2 = g4Var9;
                    gVar4 = gVar3;
                    dVar5 = dVar12;
                }
                z14 = z12;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            gVar2 = gVar;
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    g4VarF = g4Var;
                    if (lVarV.n(g4VarF)) {
                    }
                    i13 |= i23;
                } else {
                    g4VarF = g4Var;
                }
                i13 |= i23;
            } else {
                g4VarF = g4Var;
            }
            if ((i12 & 16) != 0) {
                if ((57344 & i11) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i16 = 16384;
                    } else {
                        i16 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 32;
                if (i17 != 0) {
                    i13 |= 65536;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    if ((3670016 & i11) == 0) {
                        z12 = z11;
                        if (lVarV.p(z12)) {
                            i19 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i19 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i19;
                    }
                    if (i17 != 32) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar1112 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1112;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar1113 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1113;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar1114 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1114;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar1115 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1115;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                        }
                        z12 = z13;
                        androidx.compose.ui.graphics.painter.b bVar12 = bVar3;
                        z2.a aVarB8 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                        int i218 = i21 >> 3;
                        int i219 = (i218 & 896) | (i218 & 14) | 3072 | (i218 & 112);
                        lVar2 = lVarV;
                        androidx.compose.ui.d dVar13 = dVar4;
                        g4 g4Var10 = g4VarF;
                        a(dVar13, gVar3, g4Var10, aVarB8, lVar2, i219, 0);
                        if (o.J()) {
                            o.R();
                        }
                        bVar4 = bVar12;
                        g4Var2 = g4Var10;
                        gVar4 = gVar3;
                        dVar5 = dVar13;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar1116 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1116;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar1117 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1117;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar1118 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1118;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar1119 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1119;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                        }
                        z12 = z13;
                        androidx.compose.ui.graphics.painter.b bVar13 = bVar3;
                        z2.a aVarB9 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                        int i2110 = i21 >> 3;
                        int i2111 = (i2110 & 896) | (i2110 & 14) | 3072 | (i2110 & 112);
                        lVar2 = lVarV;
                        androidx.compose.ui.d dVar14 = dVar4;
                        g4 g4Var11 = g4VarF;
                        a(dVar14, gVar3, g4Var11, aVarB9, lVar2, i2111, 0);
                        if (o.J()) {
                            o.R();
                        }
                        bVar4 = bVar13;
                        g4Var2 = g4Var11;
                        gVar4 = gVar3;
                        dVar5 = dVar14;
                    }
                    z14 = z12;
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                    }
                }
                i13 |= 1572864;
                z12 = z11;
                if (i17 != 32) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11110 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11110;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11111 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11112 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11112;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11113 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11113;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar14 = bVar3;
                    z2.a aVarB10 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i2112 = i21 >> 3;
                    int i2113 = (i2112 & 896) | (i2112 & 14) | 3072 | (i2112 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar15 = dVar4;
                    g4 g4Var12 = g4VarF;
                    a(dVar15, gVar3, g4Var12, aVarB10, lVar2, i2113, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar14;
                    g4Var2 = g4Var12;
                    gVar4 = gVar3;
                    dVar5 = dVar15;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11114 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11114;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11115 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11115;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11116 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11116;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11117 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11117;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar15 = bVar3;
                    z2.a aVarB11 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i2114 = i21 >> 3;
                    int i2115 = (i2114 & 896) | (i2114 & 14) | 3072 | (i2114 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar16 = dVar4;
                    g4 g4Var13 = g4VarF;
                    a(dVar16, gVar3, g4Var13, aVarB11, lVar2, i2115, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar15;
                    g4Var2 = g4Var13;
                    gVar4 = gVar3;
                    dVar5 = dVar16;
                }
                z14 = z12;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                }
            }
            i13 |= 24576;
            str2 = str;
            i17 = i12 & 32;
            if (i17 != 0) {
                i13 |= 65536;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                if ((3670016 & i11) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i19;
                }
                if (i17 != 32) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11118 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11118;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11119 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11119;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar111110 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111110;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar111111 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar16 = bVar3;
                    z2.a aVarB12 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i2116 = i21 >> 3;
                    int i2117 = (i2116 & 896) | (i2116 & 14) | 3072 | (i2116 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar17 = dVar4;
                    g4 g4Var14 = g4VarF;
                    a(dVar17, gVar3, g4Var14, aVarB12, lVar2, i2117, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar16;
                    g4Var2 = g4Var14;
                    gVar4 = gVar3;
                    dVar5 = dVar17;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar111112 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111112;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar111113 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111113;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar111114 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111114;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar111115 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111115;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar17 = bVar3;
                    z2.a aVarB13 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i2118 = i21 >> 3;
                    int i2119 = (i2118 & 896) | (i2118 & 14) | 3072 | (i2118 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar18 = dVar4;
                    g4 g4Var15 = g4VarF;
                    a(dVar18, gVar3, g4Var15, aVarB13, lVar2, i2119, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar17;
                    g4Var2 = g4Var15;
                    gVar4 = gVar3;
                    dVar5 = dVar18;
                }
                z14 = z12;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                }
            }
            i13 |= 1572864;
            z12 = z11;
            if (i17 != 32) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar111116 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111116;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar111117 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111117;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar111118 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111118;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar111119 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111119;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                }
                z12 = z13;
                androidx.compose.ui.graphics.painter.b bVar18 = bVar3;
                z2.a aVarB14 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                int i21110 = i21 >> 3;
                int i21111 = (i21110 & 896) | (i21110 & 14) | 3072 | (i21110 & 112);
                lVar2 = lVarV;
                androidx.compose.ui.d dVar19 = dVar4;
                g4 g4Var16 = g4VarF;
                a(dVar19, gVar3, g4Var16, aVarB14, lVar2, i21111, 0);
                if (o.J()) {
                    o.R();
                }
                bVar4 = bVar18;
                g4Var2 = g4Var16;
                gVar4 = gVar3;
                dVar5 = dVar19;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar1111110 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111110;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar1111111 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111111;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar1111112 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111112;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar1111113 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111113;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                }
                z12 = z13;
                androidx.compose.ui.graphics.painter.b bVar19 = bVar3;
                z2.a aVarB15 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                int i21112 = i21 >> 3;
                int i21113 = (i21112 & 896) | (i21112 & 14) | 3072 | (i21112 & 112);
                lVar2 = lVarV;
                androidx.compose.ui.d dVar110 = dVar4;
                g4 g4Var17 = g4VarF;
                a(dVar110, gVar3, g4Var17, aVarB15, lVar2, i21113, 0);
                if (o.J()) {
                    o.R();
                }
                bVar4 = bVar19;
                g4Var2 = g4Var17;
                gVar4 = gVar3;
                dVar5 = dVar110;
            }
            z14 = z12;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                gVar2 = gVar;
                if (lVarV.n(gVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    g4VarF = g4Var;
                    if (lVarV.n(g4VarF)) {
                    }
                    i13 |= i23;
                } else {
                    g4VarF = g4Var;
                }
                i13 |= i23;
            } else {
                g4VarF = g4Var;
            }
            if ((i12 & 16) != 0) {
                if ((57344 & i11) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i16 = 16384;
                    } else {
                        i16 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 32;
                if (i17 != 0) {
                    i13 |= 65536;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    if ((3670016 & i11) == 0) {
                        z12 = z11;
                        if (lVarV.p(z12)) {
                            i19 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i19 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i19;
                    }
                    if (i17 != 32) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar1111114 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1111114;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar1111115 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1111115;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar1111116 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1111116;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar1111117 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1111117;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                        }
                        z12 = z13;
                        androidx.compose.ui.graphics.painter.b bVar110 = bVar3;
                        z2.a aVarB16 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                        int i21114 = i21 >> 3;
                        int i21115 = (i21114 & 896) | (i21114 & 14) | 3072 | (i21114 & 112);
                        lVar2 = lVarV;
                        androidx.compose.ui.d dVar111 = dVar4;
                        g4 g4Var18 = g4VarF;
                        a(dVar111, gVar3, g4Var18, aVarB16, lVar2, i21115, 0);
                        if (o.J()) {
                            o.R();
                        }
                        bVar4 = bVar110;
                        g4Var2 = g4Var18;
                        gVar4 = gVar3;
                        dVar5 = dVar111;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar1111118 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1111118;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar1111119 = gVar2;
                                i21 = i13;
                                gVar3 = gVar1111119;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                gVar2 = g.Medium;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                                g4VarF = a2.g.f();
                            }
                            if (i17 != 0) {
                                bVar2 = null;
                            } else {
                                bVar2 = bVar;
                            }
                            if (i18 != 0) {
                                g gVar11111110 = gVar2;
                                i21 = i13;
                                gVar3 = gVar11111110;
                                dVar4 = dVar3;
                                z13 = false;
                                bVar3 = bVar2;
                            } else {
                                g gVar11111111 = gVar2;
                                i21 = i13;
                                gVar3 = gVar11111111;
                                dVar4 = dVar3;
                                bVar3 = bVar2;
                                z13 = z12;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                        }
                        z12 = z13;
                        androidx.compose.ui.graphics.painter.b bVar111 = bVar3;
                        z2.a aVarB17 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                        int i21116 = i21 >> 3;
                        int i21117 = (i21116 & 896) | (i21116 & 14) | 3072 | (i21116 & 112);
                        lVar2 = lVarV;
                        androidx.compose.ui.d dVar112 = dVar4;
                        g4 g4Var19 = g4VarF;
                        a(dVar112, gVar3, g4Var19, aVarB17, lVar2, i21117, 0);
                        if (o.J()) {
                            o.R();
                        }
                        bVar4 = bVar111;
                        g4Var2 = g4Var19;
                        gVar4 = gVar3;
                        dVar5 = dVar112;
                    }
                    z14 = z12;
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                    }
                }
                i13 |= 1572864;
                z12 = z11;
                if (i17 != 32) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11111112 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111112;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11111113 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111113;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11111114 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111114;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11111115 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111115;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar112 = bVar3;
                    z2.a aVarB18 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i21118 = i21 >> 3;
                    int i21119 = (i21118 & 896) | (i21118 & 14) | 3072 | (i21118 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar113 = dVar4;
                    g4 g4Var110 = g4VarF;
                    a(dVar113, gVar3, g4Var110, aVarB18, lVar2, i21119, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar112;
                    g4Var2 = g4Var110;
                    gVar4 = gVar3;
                    dVar5 = dVar113;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11111116 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111116;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11111117 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111117;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11111118 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111118;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11111119 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111119;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar113 = bVar3;
                    z2.a aVarB19 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i211110 = i21 >> 3;
                    int i211111 = (i211110 & 896) | (i211110 & 14) | 3072 | (i211110 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar114 = dVar4;
                    g4 g4Var111 = g4VarF;
                    a(dVar114, gVar3, g4Var111, aVarB19, lVar2, i211111, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar113;
                    g4Var2 = g4Var111;
                    gVar4 = gVar3;
                    dVar5 = dVar114;
                }
                z14 = z12;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                }
            }
            i13 |= 24576;
            str2 = str;
            i17 = i12 & 32;
            if (i17 != 0) {
                i13 |= 65536;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                if ((3670016 & i11) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i19;
                }
                if (i17 != 32) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar111111110 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111110;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar111111111 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111111;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar111111112 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111112;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar111111113 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111113;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar114 = bVar3;
                    z2.a aVarB110 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i211112 = i21 >> 3;
                    int i211113 = (i211112 & 896) | (i211112 & 14) | 3072 | (i211112 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar115 = dVar4;
                    g4 g4Var112 = g4VarF;
                    a(dVar115, gVar3, g4Var112, aVarB110, lVar2, i211113, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar114;
                    g4Var2 = g4Var112;
                    gVar4 = gVar3;
                    dVar5 = dVar115;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar111111114 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111114;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar111111115 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111115;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar111111116 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111116;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar111111117 = gVar2;
                            i21 = i13;
                            gVar3 = gVar111111117;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar115 = bVar3;
                    z2.a aVarB111 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i211114 = i21 >> 3;
                    int i211115 = (i211114 & 896) | (i211114 & 14) | 3072 | (i211114 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar116 = dVar4;
                    g4 g4Var113 = g4VarF;
                    a(dVar116, gVar3, g4Var113, aVarB111, lVar2, i211115, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar115;
                    g4Var2 = g4Var113;
                    gVar4 = gVar3;
                    dVar5 = dVar116;
                }
                z14 = z12;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                }
            }
            i13 |= 1572864;
            z12 = z11;
            if (i17 != 32) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar111111118 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111118;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar111111119 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111119;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar1111111110 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111111110;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar1111111111 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111111111;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                }
                z12 = z13;
                androidx.compose.ui.graphics.painter.b bVar116 = bVar3;
                z2.a aVarB112 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                int i211116 = i21 >> 3;
                int i211117 = (i211116 & 896) | (i211116 & 14) | 3072 | (i211116 & 112);
                lVar2 = lVarV;
                androidx.compose.ui.d dVar117 = dVar4;
                g4 g4Var114 = g4VarF;
                a(dVar117, gVar3, g4Var114, aVarB112, lVar2, i211117, 0);
                if (o.J()) {
                    o.R();
                }
                bVar4 = bVar116;
                g4Var2 = g4Var114;
                gVar4 = gVar3;
                dVar5 = dVar117;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar1111111112 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111111112;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar1111111113 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111111113;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar1111111114 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111111114;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar1111111115 = gVar2;
                        i21 = i13;
                        gVar3 = gVar1111111115;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                }
                z12 = z13;
                androidx.compose.ui.graphics.painter.b bVar117 = bVar3;
                z2.a aVarB113 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                int i211118 = i21 >> 3;
                int i211119 = (i211118 & 896) | (i211118 & 14) | 3072 | (i211118 & 112);
                lVar2 = lVarV;
                androidx.compose.ui.d dVar118 = dVar4;
                g4 g4Var115 = g4VarF;
                a(dVar118, gVar3, g4Var115, aVarB113, lVar2, i211119, 0);
                if (o.J()) {
                    o.R();
                }
                bVar4 = bVar117;
                g4Var2 = g4Var115;
                gVar4 = gVar3;
                dVar5 = dVar118;
            }
            z14 = z12;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        gVar2 = gVar;
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                g4VarF = g4Var;
                if (lVarV.n(g4VarF)) {
                }
                i13 |= i23;
            } else {
                g4VarF = g4Var;
            }
            i13 |= i23;
        } else {
            g4VarF = g4Var;
        }
        if ((i12 & 16) != 0) {
            if ((57344 & i11) == 0) {
                str2 = str;
                if (lVarV.n(str2)) {
                    i16 = 16384;
                } else {
                    i16 = PKIFailureInfo.certRevoked;
                }
                i13 |= i16;
            }
            i17 = i12 & 32;
            if (i17 != 0) {
                i13 |= 65536;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                if ((3670016 & i11) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i19;
                }
                if (i17 != 32) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar1111111116 = gVar2;
                            i21 = i13;
                            gVar3 = gVar1111111116;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar1111111117 = gVar2;
                            i21 = i13;
                            gVar3 = gVar1111111117;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar1111111118 = gVar2;
                            i21 = i13;
                            gVar3 = gVar1111111118;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar1111111119 = gVar2;
                            i21 = i13;
                            gVar3 = gVar1111111119;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar118 = bVar3;
                    z2.a aVarB114 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i2111110 = i21 >> 3;
                    int i2111111 = (i2111110 & 896) | (i2111110 & 14) | 3072 | (i2111110 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar119 = dVar4;
                    g4 g4Var116 = g4VarF;
                    a(dVar119, gVar3, g4Var116, aVarB114, lVar2, i2111111, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar118;
                    g4Var2 = g4Var116;
                    gVar4 = gVar3;
                    dVar5 = dVar119;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11111111110 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111111110;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11111111111 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111111111;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            gVar2 = g.Medium;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            g4VarF = a2.g.f();
                        }
                        if (i17 != 0) {
                            bVar2 = null;
                        } else {
                            bVar2 = bVar;
                        }
                        if (i18 != 0) {
                            g gVar11111111112 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111111112;
                            dVar4 = dVar3;
                            z13 = false;
                            bVar3 = bVar2;
                        } else {
                            g gVar11111111113 = gVar2;
                            i21 = i13;
                            gVar3 = gVar11111111113;
                            dVar4 = dVar3;
                            bVar3 = bVar2;
                            z13 = z12;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                    }
                    z12 = z13;
                    androidx.compose.ui.graphics.painter.b bVar119 = bVar3;
                    z2.a aVarB115 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                    int i2111112 = i21 >> 3;
                    int i2111113 = (i2111112 & 896) | (i2111112 & 14) | 3072 | (i2111112 & 112);
                    lVar2 = lVarV;
                    androidx.compose.ui.d dVar1110 = dVar4;
                    g4 g4Var117 = g4VarF;
                    a(dVar1110, gVar3, g4Var117, aVarB115, lVar2, i2111113, 0);
                    if (o.J()) {
                        o.R();
                    }
                    bVar4 = bVar119;
                    g4Var2 = g4Var117;
                    gVar4 = gVar3;
                    dVar5 = dVar1110;
                }
                z14 = z12;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
                }
            }
            i13 |= 1572864;
            z12 = z11;
            if (i17 != 32) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar11111111114 = gVar2;
                        i21 = i13;
                        gVar3 = gVar11111111114;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar11111111115 = gVar2;
                        i21 = i13;
                        gVar3 = gVar11111111115;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar11111111116 = gVar2;
                        i21 = i13;
                        gVar3 = gVar11111111116;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar11111111117 = gVar2;
                        i21 = i13;
                        gVar3 = gVar11111111117;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                }
                z12 = z13;
                androidx.compose.ui.graphics.painter.b bVar1110 = bVar3;
                z2.a aVarB116 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                int i2111114 = i21 >> 3;
                int i2111115 = (i2111114 & 896) | (i2111114 & 14) | 3072 | (i2111114 & 112);
                lVar2 = lVarV;
                androidx.compose.ui.d dVar1111 = dVar4;
                g4 g4Var118 = g4VarF;
                a(dVar1111, gVar3, g4Var118, aVarB116, lVar2, i2111115, 0);
                if (o.J()) {
                    o.R();
                }
                bVar4 = bVar1110;
                g4Var2 = g4Var118;
                gVar4 = gVar3;
                dVar5 = dVar1111;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar11111111118 = gVar2;
                        i21 = i13;
                        gVar3 = gVar11111111118;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar11111111119 = gVar2;
                        i21 = i13;
                        gVar3 = gVar11111111119;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar111111111110 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111110;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar111111111111 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111111;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                }
                z12 = z13;
                androidx.compose.ui.graphics.painter.b bVar1111 = bVar3;
                z2.a aVarB117 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                int i2111116 = i21 >> 3;
                int i2111117 = (i2111116 & 896) | (i2111116 & 14) | 3072 | (i2111116 & 112);
                lVar2 = lVarV;
                androidx.compose.ui.d dVar1112 = dVar4;
                g4 g4Var119 = g4VarF;
                a(dVar1112, gVar3, g4Var119, aVarB117, lVar2, i2111117, 0);
                if (o.J()) {
                    o.R();
                }
                bVar4 = bVar1111;
                g4Var2 = g4Var119;
                gVar4 = gVar3;
                dVar5 = dVar1112;
            }
            z14 = z12;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
            }
        }
        i13 |= 24576;
        str2 = str;
        i17 = i12 & 32;
        if (i17 != 0) {
            i13 |= 65536;
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            if ((3670016 & i11) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i19;
            }
            if (i17 != 32) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar111111111112 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111112;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar111111111113 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111113;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar111111111114 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111114;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar111111111115 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111115;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                }
                z12 = z13;
                androidx.compose.ui.graphics.painter.b bVar1112 = bVar3;
                z2.a aVarB118 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                int i2111118 = i21 >> 3;
                int i2111119 = (i2111118 & 896) | (i2111118 & 14) | 3072 | (i2111118 & 112);
                lVar2 = lVarV;
                androidx.compose.ui.d dVar1113 = dVar4;
                g4 g4Var1110 = g4VarF;
                a(dVar1113, gVar3, g4Var1110, aVarB118, lVar2, i2111119, 0);
                if (o.J()) {
                    o.R();
                }
                bVar4 = bVar1112;
                g4Var2 = g4Var1110;
                gVar4 = gVar3;
                dVar5 = dVar1113;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar111111111116 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111116;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar111111111117 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111117;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        gVar2 = g.Medium;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        g4VarF = a2.g.f();
                    }
                    if (i17 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        g gVar111111111118 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111118;
                        dVar4 = dVar3;
                        z13 = false;
                        bVar3 = bVar2;
                    } else {
                        g gVar111111111119 = gVar2;
                        i21 = i13;
                        gVar3 = gVar111111111119;
                        dVar4 = dVar3;
                        bVar3 = bVar2;
                        z13 = z12;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                }
                z12 = z13;
                androidx.compose.ui.graphics.painter.b bVar1113 = bVar3;
                z2.a aVarB119 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
                int i21111110 = i21 >> 3;
                int i21111111 = (i21111110 & 896) | (i21111110 & 14) | 3072 | (i21111110 & 112);
                lVar2 = lVarV;
                androidx.compose.ui.d dVar1114 = dVar4;
                g4 g4Var1111 = g4VarF;
                a(dVar1114, gVar3, g4Var1111, aVarB119, lVar2, i21111111, 0);
                if (o.J()) {
                    o.R();
                }
                bVar4 = bVar1113;
                g4Var2 = g4Var1111;
                gVar4 = gVar3;
                dVar5 = dVar1114;
            }
            z14 = z12;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
            }
        }
        i13 |= 1572864;
        z12 = z11;
        if (i17 != 32) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    gVar2 = g.Medium;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    g4VarF = a2.g.f();
                }
                if (i17 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i18 != 0) {
                    g gVar1111111111110 = gVar2;
                    i21 = i13;
                    gVar3 = gVar1111111111110;
                    dVar4 = dVar3;
                    z13 = false;
                    bVar3 = bVar2;
                } else {
                    g gVar1111111111111 = gVar2;
                    i21 = i13;
                    gVar3 = gVar1111111111111;
                    dVar4 = dVar3;
                    bVar3 = bVar2;
                    z13 = z12;
                }
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    gVar2 = g.Medium;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    g4VarF = a2.g.f();
                }
                if (i17 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i18 != 0) {
                    g gVar1111111111112 = gVar2;
                    i21 = i13;
                    gVar3 = gVar1111111111112;
                    dVar4 = dVar3;
                    z13 = false;
                    bVar3 = bVar2;
                } else {
                    g gVar1111111111113 = gVar2;
                    i21 = i13;
                    gVar3 = gVar1111111111113;
                    dVar4 = dVar3;
                    bVar3 = bVar2;
                    z13 = z12;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
            }
            z12 = z13;
            androidx.compose.ui.graphics.painter.b bVar1114 = bVar3;
            z2.a aVarB1110 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
            int i21111112 = i21 >> 3;
            int i21111113 = (i21111112 & 896) | (i21111112 & 14) | 3072 | (i21111112 & 112);
            lVar2 = lVarV;
            androidx.compose.ui.d dVar1115 = dVar4;
            g4 g4Var1112 = g4VarF;
            a(dVar1115, gVar3, g4Var1112, aVarB1110, lVar2, i21111113, 0);
            if (o.J()) {
                o.R();
            }
            bVar4 = bVar1114;
            g4Var2 = g4Var1112;
            gVar4 = gVar3;
            dVar5 = dVar1115;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    gVar2 = g.Medium;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    g4VarF = a2.g.f();
                }
                if (i17 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i18 != 0) {
                    g gVar1111111111114 = gVar2;
                    i21 = i13;
                    gVar3 = gVar1111111111114;
                    dVar4 = dVar3;
                    z13 = false;
                    bVar3 = bVar2;
                } else {
                    g gVar1111111111115 = gVar2;
                    i21 = i13;
                    gVar3 = gVar1111111111115;
                    dVar4 = dVar3;
                    bVar3 = bVar2;
                    z13 = z12;
                }
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    gVar2 = g.Medium;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    g4VarF = a2.g.f();
                }
                if (i17 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i18 != 0) {
                    g gVar1111111111116 = gVar2;
                    i21 = i13;
                    gVar3 = gVar1111111111116;
                    dVar4 = dVar3;
                    z13 = false;
                    bVar3 = bVar2;
                } else {
                    g gVar1111111111117 = gVar2;
                    i21 = i13;
                    gVar3 = gVar1111111111117;
                    dVar4 = dVar3;
                    bVar3 = bVar2;
                    z13 = z12;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1654712672, i21, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
            }
            z12 = z13;
            androidx.compose.ui.graphics.painter.b bVar1115 = bVar3;
            z2.a aVarB1111 = z2.c.b(lVarV, -1200239329, true, new e(z13, gVar3, url, str2, bVar3));
            int i21111114 = i21 >> 3;
            int i21111115 = (i21111114 & 896) | (i21111114 & 14) | 3072 | (i21111114 & 112);
            lVar2 = lVarV;
            androidx.compose.ui.d dVar1116 = dVar4;
            g4 g4Var1113 = g4VarF;
            a(dVar1116, gVar3, g4Var1113, aVarB1111, lVar2, i21111115, 0);
            if (o.J()) {
                o.R();
            }
            bVar4 = bVar1115;
            g4Var2 = g4Var1113;
            gVar4 = gVar3;
            dVar5 = dVar1116;
        }
        z14 = z12;
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new f(url, dVar5, gVar4, g4Var2, str, bVar4, z14, i11, i12));
        }
    }
}
