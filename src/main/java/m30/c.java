package m30;

import a2.RoundedCornerShape;
import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import e4.f;
import f90.PrimaryButtonStyle;
import f90.n;
import i4.TextStyle;
import jn0.h0;
import k3.p1;
import k3.r1;
import n70.t;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4672l;
import p009i2.e1;
import p009i2.j1;
import p009i2.v2;
import p009i2.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.g2;
import p020r2.h2;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import p020r2.y2;
import q1.BorderStroke;
import v1.e;
import v1.g0;
import w4.h;
import w80.k;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aB\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", AnnotatedPrivateKey.LABEL, "", "isEnabled", "Lkotlin/Function0;", "Ljn0/h0;", "onButtonClick", "Landroidx/compose/ui/d;", "modifier", "isLoading", "displayLockIcon", "a", "(Ljava/lang/String;ZLwn0/a;Landroidx/compose/ui/d;ZZLr2/l;II)V", "text", "Lk3/p1;", "color", "Li4/r0;", "style", "b", "(Ljava/lang/String;JLi4/r0;ZZZLr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f90996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f90997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f90998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ RoundedCornerShape f90999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BorderStroke f91000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f91001h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f91002i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f91003j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextStyle f91004k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f91005l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f91006m;

        /* JADX INFO: renamed from: m30.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C1937a extends u implements q<g0, l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f91007c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f91008d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ TextStyle f91009e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f91010f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f91011g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f91012h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1937a(String str, long j11, TextStyle textStyle, boolean z11, boolean z12, boolean z13) {
                super(3);
                this.f91007c = str;
                this.f91008d = j11;
                this.f91009e = textStyle;
                this.f91010f = z11;
                this.f91011g = z12;
                this.f91012h = z13;
            }

            public final void a(g0 TextButton, l lVar, int i11) {
                s.k(TextButton, "$this$TextButton");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-154386641, i11, -1, "com.stripe.android.common.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButton.kt:80)");
                }
                c.b(this.f91007c, p1.p(this.f91008d, ((Number) lVar.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), this.f91009e, this.f91010f, this.f91011g, this.f91012h, lVar, 0);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, l lVar, Integer num) {
                a(g0Var, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, wn0.a<h0> aVar, boolean z11, RoundedCornerShape roundedCornerShape, BorderStroke borderStroke, long j11, String str, long j12, TextStyle textStyle, boolean z12, boolean z13) {
            super(2);
            this.f90996c = dVar;
            this.f90997d = aVar;
            this.f90998e = z11;
            this.f90999f = roundedCornerShape;
            this.f91000g = borderStroke;
            this.f91001h = j11;
            this.f91002i = str;
            this.f91003j = j12;
            this.f91004k = textStyle;
            this.f91005l = z12;
            this.f91006m = z13;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1403289044, i11, -1, "com.stripe.android.common.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:61)");
            }
            androidx.compose.ui.d dVarH = x.h(this.f90996c, BitmapDescriptorFactory.HUE_RED, 1, null);
            d3.c cVarE = d3.c.INSTANCE.e();
            wn0.a<h0> aVar = this.f90997d;
            boolean z11 = this.f90998e;
            RoundedCornerShape roundedCornerShape = this.f90999f;
            BorderStroke borderStroke = this.f91000g;
            long j11 = this.f91001h;
            String str = this.f91002i;
            long j12 = this.f91003j;
            TextStyle textStyle = this.f91004k;
            boolean z12 = this.f91005l;
            boolean z13 = this.f91006m;
            lVar.H(733328855);
            i0 i0VarJ = g.j(cVarE, false, lVar, 6);
            lVar.H(-1323940314);
            int iA = j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
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
            d4.b(lVarA, i0VarJ, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            i iVar = i.f4585a;
            C4672l.c(aVar, x.b(x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, f.a(t.f93467g, lVar, 0), 1, null), z11, null, null, roundedCornerShape, borderStroke, p009i2.j.f74513a.a(j11, 0L, j11, 0L, lVar, p009i2.j.f74524l << 12, 10), null, z2.c.b(lVar, -154386641, true, new C1937a(str, j12, textStyle, z11, z12, z13)), lVar, 805306368, EnumC4419g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
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
        final /* synthetic */ String f91013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f91014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f91015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f91016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f91017g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f91018h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f91019i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f91020j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z11, wn0.a<h0> aVar, androidx.compose.ui.d dVar, boolean z12, boolean z13, int i11, int i12) {
            super(2);
            this.f91013c = str;
            this.f91014d = z11;
            this.f91015e = aVar;
            this.f91016f = dVar;
            this.f91017g = z12;
            this.f91018h = z13;
            this.f91019i = i11;
            this.f91020j = i12;
        }

        public final void a(l lVar, int i11) {
            c.a(this.f91013c, this.f91014d, this.f91015e, this.f91016f, this.f91017g, this.f91018h, lVar, k2.a(this.f91019i | 1), this.f91020j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: m30.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C1938c extends u implements q<e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f91021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f91022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f91023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f91024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f91025g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f91026h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f91027i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1938c(String str, long j11, TextStyle textStyle, boolean z11, boolean z12, long j12, boolean z13) {
            super(3);
            this.f91021c = str;
            this.f91022d = j11;
            this.f91023e = textStyle;
            this.f91024f = z11;
            this.f91025g = z12;
            this.f91026h = j12;
            this.f91027i = z13;
        }

        public final void a(e BoxWithConstraints, l lVar, int i11) {
            int i12;
            s.k(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i11 & 14) == 0) {
                i12 = i11 | (lVar.n(BoxWithConstraints) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1456958795, i12, -1, "com.stripe.android.common.ui.PrimaryButtonContent.<anonymous> (PrimaryButton.kt:106)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            d3.c.Companion companion2 = d3.c.INSTANCE;
            v2.b(this.f91021c, BoxWithConstraints.a(companion, companion2.e()), this.f91022d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.f91023e, lVar, 0, 0, 65528);
            if (this.f91024f) {
                lVar.H(290615605);
                androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.t.m(x.v(companion, BoxWithConstraints.c()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, h.g(8), BitmapDescriptorFactory.HUE_RED, 11, null);
                lVar.H(733328855);
                i0 i0VarJ = g.j(companion2.o(), false, lVar, 0);
                lVar.H(-1323940314);
                int iA = j.a(lVar, 0);
                p020r2.x xVarC = lVar.c();
                b4.g.Companion companion3 = b4.g.INSTANCE;
                wn0.a<b4.g> aVarA = companion3.a();
                q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarM);
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
                d4.b(lVarA, i0VarJ, companion3.c());
                d4.b(lVarA, xVarC, companion3.e());
                p<b4.g, Integer, h0> pVarB = companion3.b();
                if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
                lVar.H(2058660585);
                m30.b.b(i.f4585a.a(companion, companion2.f()), j1.f74525a.a(lVar, j1.f74526b).g(), lVar, 0, 0);
                lVar.T();
                lVar.g();
                lVar.T();
                lVar.T();
                lVar.T();
            } else if (this.f91025g) {
                lVar.H(291002144);
                androidx.compose.ui.d dVarM2 = androidx.compose.foundation.layout.t.m(x.v(companion, BoxWithConstraints.c()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, h.g(8), BitmapDescriptorFactory.HUE_RED, 11, null);
                long j11 = this.f91026h;
                boolean z11 = this.f91027i;
                lVar.H(733328855);
                i0 i0VarJ2 = g.j(companion2.o(), false, lVar, 0);
                lVar.H(-1323940314);
                int iA2 = j.a(lVar, 0);
                p020r2.x xVarC2 = lVar.c();
                b4.g.Companion companion4 = b4.g.INSTANCE;
                wn0.a<b4.g> aVarA2 = companion4.a();
                q<y2<b4.g>, l, Integer, h0> qVarA2 = a0.a(dVarM2);
                if (lVar.w() == null) {
                    j.c();
                }
                lVar.h();
                if (lVar.getInserting()) {
                    lVar.z(aVarA2);
                } else {
                    lVar.d();
                }
                l lVarA2 = d4.a(lVar);
                d4.b(lVarA2, i0VarJ2, companion4.c());
                d4.b(lVarA2, xVarC2, companion4.e());
                p<b4.g, Integer, h0> pVarB2 = companion4.b();
                if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA2.invoke(y2.a(y2.b(lVar)), lVar, 0);
                lVar.H(2058660585);
                i iVar = i.f4585a;
                androidx.compose.ui.graphics.painter.b bVarC = e4.e.c(k.f121473d, lVar, 0);
                lVar.H(747079535);
                float fFloatValue = z11 ? ((Number) lVar.U(y.a())).floatValue() : 0.5f;
                lVar.T();
                e1.a(bVarC, "lock", iVar.a(companion, companion2.f()), p1.p(j11, fFloatValue, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), lVar, 56, 0);
                lVar.T();
                lVar.g();
                lVar.T();
                lVar.T();
                lVar.T();
            } else {
                lVar.H(291697908);
                lVar.T();
            }
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f91028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f91029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f91030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f91031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f91032g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f91033h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f91034i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j11, TextStyle textStyle, boolean z11, boolean z12, boolean z13, int i11) {
            super(2);
            this.f91028c = str;
            this.f91029d = j11;
            this.f91030e = textStyle;
            this.f91031f = z11;
            this.f91032g = z12;
            this.f91033h = z13;
            this.f91034i = i11;
        }

        public final void a(l lVar, int i11) {
            c.b(this.f91028c, this.f91029d, this.f91030e, this.f91031f, this.f91032g, this.f91033h, lVar, k2.a(this.f91034i | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0168  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01af  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void a(String label, boolean z11, wn0.a<h0> onButtonClick, androidx.compose.ui.d dVar, boolean z12, boolean z13, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        int i17;
        androidx.compose.ui.d dVar3;
        boolean z16;
        boolean z17;
        float fB;
        androidx.compose.ui.d dVar4;
        boolean z18;
        boolean z19;
        w2 w2VarX;
        s.k(label, "label");
        s.k(onButtonClick, "onButtonClick");
        l lVarV = lVar.v(369433964);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(label) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            i13 |= lVarV.K(onButtonClick) ? 256 : 128;
        }
        int i18 = i12 & 8;
        if (i18 == 0) {
            if ((i11 & 7168) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    z14 = z12;
                    if (lVarV.p(z14)) {
                        i15 = 16384;
                    } else {
                        i15 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((458752 & i11) == 0) {
                        z15 = z13;
                        if (lVarV.p(z15)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((374491 & i13) == 74898 || !lVarV.b()) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z15;
                        }
                        if (o.J()) {
                            o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                        }
                        Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                        f90.l lVar2 = f90.l.f64654a;
                        long jB = r1.b(n.d(lVar2.b(), context));
                        long jB2 = r1.b(n.k(lVar2.b(), context));
                        BorderStroke borderStrokeA = q1.h.a(h.g(lVar2.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar2.b(), context)));
                        RoundedCornerShape roundedCornerShapeC = a2.g.c(h.g(lVar2.b().getShape().getCornerRadius()));
                        TextStyle textStyleI = n.i(lVar2.b(), lVarV, PrimaryButtonStyle.f64601e);
                        g2<Float> g2VarA = y.a();
                        if (z11) {
                            lVarV.H(-987720370);
                            fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                        } else {
                            lVarV.H(-987719630);
                            fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                        }
                        lVarV.T();
                        h2[] h2VarArr = {g2VarA.d(Float.valueOf(fB))};
                        androidx.compose.ui.d dVar5 = dVar3;
                        w.b(h2VarArr, z2.c.b(lVarV, -1403289044, true, new a(dVar5, onButtonClick, z11, roundedCornerShapeC, borderStrokeA, jB, label, jB2, textStyleI, z16, z17)), lVarV, 56);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar5;
                        z18 = z16;
                        z19 = z17;
                    } else {
                        lVarV.j();
                        dVar4 = dVar2;
                        z18 = z14;
                        z19 = z15;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(label, z11, onButtonClick, dVar4, z18, z19, i11, i12));
                    }
                }
                i13 |= 196608;
                z15 = z13;
                if ((374491 & i13) == 74898) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z15;
                    }
                    if (o.J()) {
                        o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                    }
                    Context context2 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    f90.l lVar3 = f90.l.f64654a;
                    long jB3 = r1.b(n.d(lVar3.b(), context2));
                    long jB4 = r1.b(n.k(lVar3.b(), context2));
                    BorderStroke borderStrokeA2 = q1.h.a(h.g(lVar3.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar3.b(), context2)));
                    RoundedCornerShape roundedCornerShapeC2 = a2.g.c(h.g(lVar3.b().getShape().getCornerRadius()));
                    TextStyle textStyleI2 = n.i(lVar3.b(), lVarV, PrimaryButtonStyle.f64601e);
                    g2<Float> g2VarA2 = y.a();
                    if (z11) {
                        lVarV.H(-987720370);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-987719630);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    h2[] h2VarArr2 = {g2VarA2.d(Float.valueOf(fB))};
                    androidx.compose.ui.d dVar6 = dVar3;
                    w.b(h2VarArr2, z2.c.b(lVarV, -1403289044, true, new a(dVar6, onButtonClick, z11, roundedCornerShapeC2, borderStrokeA2, jB3, label, jB4, textStyleI2, z16, z17)), lVarV, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar6;
                    z18 = z16;
                    z19 = z17;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z15;
                    }
                    if (o.J()) {
                        o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                    }
                    Context context3 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    f90.l lVar4 = f90.l.f64654a;
                    long jB5 = r1.b(n.d(lVar4.b(), context3));
                    long jB6 = r1.b(n.k(lVar4.b(), context3));
                    BorderStroke borderStrokeA3 = q1.h.a(h.g(lVar4.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar4.b(), context3)));
                    RoundedCornerShape roundedCornerShapeC3 = a2.g.c(h.g(lVar4.b().getShape().getCornerRadius()));
                    TextStyle textStyleI3 = n.i(lVar4.b(), lVarV, PrimaryButtonStyle.f64601e);
                    g2<Float> g2VarA3 = y.a();
                    if (z11) {
                        lVarV.H(-987720370);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-987719630);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    h2[] h2VarArr3 = {g2VarA3.d(Float.valueOf(fB))};
                    androidx.compose.ui.d dVar7 = dVar3;
                    w.b(h2VarArr3, z2.c.b(lVarV, -1403289044, true, new a(dVar7, onButtonClick, z11, roundedCornerShapeC3, borderStrokeA3, jB5, label, jB6, textStyleI3, z16, z17)), lVarV, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar7;
                    z18 = z16;
                    z19 = z17;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(label, z11, onButtonClick, dVar4, z18, z19, i11, i12));
                }
            }
            i13 |= 24576;
            z14 = z12;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    z15 = z13;
                    if (lVarV.p(z15)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((374491 & i13) == 74898) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z15;
                    }
                    if (o.J()) {
                        o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                    }
                    Context context4 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    f90.l lVar5 = f90.l.f64654a;
                    long jB7 = r1.b(n.d(lVar5.b(), context4));
                    long jB8 = r1.b(n.k(lVar5.b(), context4));
                    BorderStroke borderStrokeA4 = q1.h.a(h.g(lVar5.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar5.b(), context4)));
                    RoundedCornerShape roundedCornerShapeC4 = a2.g.c(h.g(lVar5.b().getShape().getCornerRadius()));
                    TextStyle textStyleI4 = n.i(lVar5.b(), lVarV, PrimaryButtonStyle.f64601e);
                    g2<Float> g2VarA4 = y.a();
                    if (z11) {
                        lVarV.H(-987720370);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-987719630);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    h2[] h2VarArr4 = {g2VarA4.d(Float.valueOf(fB))};
                    androidx.compose.ui.d dVar8 = dVar3;
                    w.b(h2VarArr4, z2.c.b(lVarV, -1403289044, true, new a(dVar8, onButtonClick, z11, roundedCornerShapeC4, borderStrokeA4, jB7, label, jB8, textStyleI4, z16, z17)), lVarV, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar8;
                    z18 = z16;
                    z19 = z17;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z15;
                    }
                    if (o.J()) {
                        o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                    }
                    Context context5 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    f90.l lVar6 = f90.l.f64654a;
                    long jB9 = r1.b(n.d(lVar6.b(), context5));
                    long jB10 = r1.b(n.k(lVar6.b(), context5));
                    BorderStroke borderStrokeA5 = q1.h.a(h.g(lVar6.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar6.b(), context5)));
                    RoundedCornerShape roundedCornerShapeC5 = a2.g.c(h.g(lVar6.b().getShape().getCornerRadius()));
                    TextStyle textStyleI5 = n.i(lVar6.b(), lVarV, PrimaryButtonStyle.f64601e);
                    g2<Float> g2VarA5 = y.a();
                    if (z11) {
                        lVarV.H(-987720370);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-987719630);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    h2[] h2VarArr5 = {g2VarA5.d(Float.valueOf(fB))};
                    androidx.compose.ui.d dVar9 = dVar3;
                    w.b(h2VarArr5, z2.c.b(lVarV, -1403289044, true, new a(dVar9, onButtonClick, z11, roundedCornerShapeC5, borderStrokeA5, jB9, label, jB10, textStyleI5, z16, z17)), lVarV, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar9;
                    z18 = z16;
                    z19 = z17;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(label, z11, onButtonClick, dVar4, z18, z19, i11, i12));
                }
            }
            i13 |= 196608;
            z15 = z13;
            if ((374491 & i13) == 74898) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (o.J()) {
                    o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                }
                Context context6 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                f90.l lVar7 = f90.l.f64654a;
                long jB11 = r1.b(n.d(lVar7.b(), context6));
                long jB12 = r1.b(n.k(lVar7.b(), context6));
                BorderStroke borderStrokeA6 = q1.h.a(h.g(lVar7.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar7.b(), context6)));
                RoundedCornerShape roundedCornerShapeC6 = a2.g.c(h.g(lVar7.b().getShape().getCornerRadius()));
                TextStyle textStyleI6 = n.i(lVar7.b(), lVarV, PrimaryButtonStyle.f64601e);
                g2<Float> g2VarA6 = y.a();
                if (z11) {
                    lVarV.H(-987720370);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-987719630);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                h2[] h2VarArr6 = {g2VarA6.d(Float.valueOf(fB))};
                androidx.compose.ui.d dVar10 = dVar3;
                w.b(h2VarArr6, z2.c.b(lVarV, -1403289044, true, new a(dVar10, onButtonClick, z11, roundedCornerShapeC6, borderStrokeA6, jB11, label, jB12, textStyleI6, z16, z17)), lVarV, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar10;
                z18 = z16;
                z19 = z17;
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (o.J()) {
                    o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                }
                Context context7 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                f90.l lVar8 = f90.l.f64654a;
                long jB13 = r1.b(n.d(lVar8.b(), context7));
                long jB14 = r1.b(n.k(lVar8.b(), context7));
                BorderStroke borderStrokeA7 = q1.h.a(h.g(lVar8.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar8.b(), context7)));
                RoundedCornerShape roundedCornerShapeC7 = a2.g.c(h.g(lVar8.b().getShape().getCornerRadius()));
                TextStyle textStyleI7 = n.i(lVar8.b(), lVarV, PrimaryButtonStyle.f64601e);
                g2<Float> g2VarA7 = y.a();
                if (z11) {
                    lVarV.H(-987720370);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-987719630);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                h2[] h2VarArr7 = {g2VarA7.d(Float.valueOf(fB))};
                androidx.compose.ui.d dVar11 = dVar3;
                w.b(h2VarArr7, z2.c.b(lVarV, -1403289044, true, new a(dVar11, onButtonClick, z11, roundedCornerShapeC7, borderStrokeA7, jB13, label, jB14, textStyleI7, z16, z17)), lVarV, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar11;
                z18 = z16;
                z19 = z17;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(label, z11, onButtonClick, dVar4, z18, z19, i11, i12));
            }
        }
        i13 |= 3072;
        dVar2 = dVar;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                z14 = z12;
                if (lVarV.p(z14)) {
                    i15 = 16384;
                } else {
                    i15 = PKIFailureInfo.certRevoked;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    z15 = z13;
                    if (lVarV.p(z15)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((374491 & i13) == 74898) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z15;
                    }
                    if (o.J()) {
                        o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                    }
                    Context context8 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    f90.l lVar9 = f90.l.f64654a;
                    long jB15 = r1.b(n.d(lVar9.b(), context8));
                    long jB16 = r1.b(n.k(lVar9.b(), context8));
                    BorderStroke borderStrokeA8 = q1.h.a(h.g(lVar9.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar9.b(), context8)));
                    RoundedCornerShape roundedCornerShapeC8 = a2.g.c(h.g(lVar9.b().getShape().getCornerRadius()));
                    TextStyle textStyleI8 = n.i(lVar9.b(), lVarV, PrimaryButtonStyle.f64601e);
                    g2<Float> g2VarA8 = y.a();
                    if (z11) {
                        lVarV.H(-987720370);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-987719630);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    h2[] h2VarArr8 = {g2VarA8.d(Float.valueOf(fB))};
                    androidx.compose.ui.d dVar12 = dVar3;
                    w.b(h2VarArr8, z2.c.b(lVarV, -1403289044, true, new a(dVar12, onButtonClick, z11, roundedCornerShapeC8, borderStrokeA8, jB15, label, jB16, textStyleI8, z16, z17)), lVarV, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar12;
                    z18 = z16;
                    z19 = z17;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z15;
                    }
                    if (o.J()) {
                        o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                    }
                    Context context9 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                    f90.l lVar10 = f90.l.f64654a;
                    long jB17 = r1.b(n.d(lVar10.b(), context9));
                    long jB18 = r1.b(n.k(lVar10.b(), context9));
                    BorderStroke borderStrokeA9 = q1.h.a(h.g(lVar10.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar10.b(), context9)));
                    RoundedCornerShape roundedCornerShapeC9 = a2.g.c(h.g(lVar10.b().getShape().getCornerRadius()));
                    TextStyle textStyleI9 = n.i(lVar10.b(), lVarV, PrimaryButtonStyle.f64601e);
                    g2<Float> g2VarA9 = y.a();
                    if (z11) {
                        lVarV.H(-987720370);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-987719630);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    h2[] h2VarArr9 = {g2VarA9.d(Float.valueOf(fB))};
                    androidx.compose.ui.d dVar13 = dVar3;
                    w.b(h2VarArr9, z2.c.b(lVarV, -1403289044, true, new a(dVar13, onButtonClick, z11, roundedCornerShapeC9, borderStrokeA9, jB17, label, jB18, textStyleI9, z16, z17)), lVarV, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar13;
                    z18 = z16;
                    z19 = z17;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(label, z11, onButtonClick, dVar4, z18, z19, i11, i12));
                }
            }
            i13 |= 196608;
            z15 = z13;
            if ((374491 & i13) == 74898) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (o.J()) {
                    o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                }
                Context context10 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                f90.l lVar11 = f90.l.f64654a;
                long jB19 = r1.b(n.d(lVar11.b(), context10));
                long jB110 = r1.b(n.k(lVar11.b(), context10));
                BorderStroke borderStrokeA10 = q1.h.a(h.g(lVar11.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar11.b(), context10)));
                RoundedCornerShape roundedCornerShapeC10 = a2.g.c(h.g(lVar11.b().getShape().getCornerRadius()));
                TextStyle textStyleI10 = n.i(lVar11.b(), lVarV, PrimaryButtonStyle.f64601e);
                g2<Float> g2VarA10 = y.a();
                if (z11) {
                    lVarV.H(-987720370);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-987719630);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                h2[] h2VarArr10 = {g2VarA10.d(Float.valueOf(fB))};
                androidx.compose.ui.d dVar14 = dVar3;
                w.b(h2VarArr10, z2.c.b(lVarV, -1403289044, true, new a(dVar14, onButtonClick, z11, roundedCornerShapeC10, borderStrokeA10, jB19, label, jB110, textStyleI10, z16, z17)), lVarV, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar14;
                z18 = z16;
                z19 = z17;
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (o.J()) {
                    o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                }
                Context context11 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                f90.l lVar12 = f90.l.f64654a;
                long jB111 = r1.b(n.d(lVar12.b(), context11));
                long jB112 = r1.b(n.k(lVar12.b(), context11));
                BorderStroke borderStrokeA11 = q1.h.a(h.g(lVar12.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar12.b(), context11)));
                RoundedCornerShape roundedCornerShapeC11 = a2.g.c(h.g(lVar12.b().getShape().getCornerRadius()));
                TextStyle textStyleI11 = n.i(lVar12.b(), lVarV, PrimaryButtonStyle.f64601e);
                g2<Float> g2VarA11 = y.a();
                if (z11) {
                    lVarV.H(-987720370);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-987719630);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                h2[] h2VarArr11 = {g2VarA11.d(Float.valueOf(fB))};
                androidx.compose.ui.d dVar15 = dVar3;
                w.b(h2VarArr11, z2.c.b(lVarV, -1403289044, true, new a(dVar15, onButtonClick, z11, roundedCornerShapeC11, borderStrokeA11, jB111, label, jB112, textStyleI11, z16, z17)), lVarV, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar15;
                z18 = z16;
                z19 = z17;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(label, z11, onButtonClick, dVar4, z18, z19, i11, i12));
            }
        }
        i13 |= 24576;
        z14 = z12;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                z15 = z13;
                if (lVarV.p(z15)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((374491 & i13) == 74898) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (o.J()) {
                    o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                }
                Context context12 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                f90.l lVar13 = f90.l.f64654a;
                long jB113 = r1.b(n.d(lVar13.b(), context12));
                long jB114 = r1.b(n.k(lVar13.b(), context12));
                BorderStroke borderStrokeA12 = q1.h.a(h.g(lVar13.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar13.b(), context12)));
                RoundedCornerShape roundedCornerShapeC12 = a2.g.c(h.g(lVar13.b().getShape().getCornerRadius()));
                TextStyle textStyleI12 = n.i(lVar13.b(), lVarV, PrimaryButtonStyle.f64601e);
                g2<Float> g2VarA12 = y.a();
                if (z11) {
                    lVarV.H(-987720370);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-987719630);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                h2[] h2VarArr12 = {g2VarA12.d(Float.valueOf(fB))};
                androidx.compose.ui.d dVar16 = dVar3;
                w.b(h2VarArr12, z2.c.b(lVarV, -1403289044, true, new a(dVar16, onButtonClick, z11, roundedCornerShapeC12, borderStrokeA12, jB113, label, jB114, textStyleI12, z16, z17)), lVarV, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar16;
                z18 = z16;
                z19 = z17;
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (o.J()) {
                    o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
                }
                Context context13 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                f90.l lVar14 = f90.l.f64654a;
                long jB115 = r1.b(n.d(lVar14.b(), context13));
                long jB116 = r1.b(n.k(lVar14.b(), context13));
                BorderStroke borderStrokeA13 = q1.h.a(h.g(lVar14.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar14.b(), context13)));
                RoundedCornerShape roundedCornerShapeC13 = a2.g.c(h.g(lVar14.b().getShape().getCornerRadius()));
                TextStyle textStyleI13 = n.i(lVar14.b(), lVarV, PrimaryButtonStyle.f64601e);
                g2<Float> g2VarA13 = y.a();
                if (z11) {
                    lVarV.H(-987720370);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-987719630);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                h2[] h2VarArr13 = {g2VarA13.d(Float.valueOf(fB))};
                androidx.compose.ui.d dVar17 = dVar3;
                w.b(h2VarArr13, z2.c.b(lVarV, -1403289044, true, new a(dVar17, onButtonClick, z11, roundedCornerShapeC13, borderStrokeA13, jB115, label, jB116, textStyleI13, z16, z17)), lVarV, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar17;
                z18 = z16;
                z19 = z17;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(label, z11, onButtonClick, dVar4, z18, z19, i11, i12));
            }
        }
        i13 |= 196608;
        z15 = z13;
        if ((374491 & i13) == 74898) {
            if (i18 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (i16 != 0) {
                z17 = false;
            } else {
                z17 = z15;
            }
            if (o.J()) {
                o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
            }
            Context context14 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            f90.l lVar15 = f90.l.f64654a;
            long jB117 = r1.b(n.d(lVar15.b(), context14));
            long jB118 = r1.b(n.k(lVar15.b(), context14));
            BorderStroke borderStrokeA14 = q1.h.a(h.g(lVar15.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar15.b(), context14)));
            RoundedCornerShape roundedCornerShapeC14 = a2.g.c(h.g(lVar15.b().getShape().getCornerRadius()));
            TextStyle textStyleI14 = n.i(lVar15.b(), lVarV, PrimaryButtonStyle.f64601e);
            g2<Float> g2VarA14 = y.a();
            if (z11) {
                lVarV.H(-987720370);
                fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
            } else {
                lVarV.H(-987719630);
                fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
            }
            lVarV.T();
            h2[] h2VarArr14 = {g2VarA14.d(Float.valueOf(fB))};
            androidx.compose.ui.d dVar18 = dVar3;
            w.b(h2VarArr14, z2.c.b(lVarV, -1403289044, true, new a(dVar18, onButtonClick, z11, roundedCornerShapeC14, borderStrokeA14, jB117, label, jB118, textStyleI14, z16, z17)), lVarV, 56);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar18;
            z18 = z16;
            z19 = z17;
        } else {
            if (i18 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (i16 != 0) {
                z17 = false;
            } else {
                z17 = z15;
            }
            if (o.J()) {
                o.S(369433964, i13, -1, "com.stripe.android.common.ui.PrimaryButton (PrimaryButton.kt:43)");
            }
            Context context15 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            f90.l lVar16 = f90.l.f64654a;
            long jB119 = r1.b(n.d(lVar16.b(), context15));
            long jB1110 = r1.b(n.k(lVar16.b(), context15));
            BorderStroke borderStrokeA15 = q1.h.a(h.g(lVar16.b().getShape().getBorderStrokeWidth()), r1.b(n.f(lVar16.b(), context15)));
            RoundedCornerShape roundedCornerShapeC15 = a2.g.c(h.g(lVar16.b().getShape().getCornerRadius()));
            TextStyle textStyleI15 = n.i(lVar16.b(), lVarV, PrimaryButtonStyle.f64601e);
            g2<Float> g2VarA15 = y.a();
            if (z11) {
                lVarV.H(-987720370);
                fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
            } else {
                lVarV.H(-987719630);
                fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
            }
            lVarV.T();
            h2[] h2VarArr15 = {g2VarA15.d(Float.valueOf(fB))};
            androidx.compose.ui.d dVar19 = dVar3;
            w.b(h2VarArr15, z2.c.b(lVarV, -1403289044, true, new a(dVar19, onButtonClick, z11, roundedCornerShapeC15, borderStrokeA15, jB119, label, jB1110, textStyleI15, z16, z17)), lVarV, 56);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar19;
            z18 = z16;
            z19 = z17;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(label, z11, onButtonClick, dVar4, z18, z19, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, long j11, TextStyle textStyle, boolean z11, boolean z12, boolean z13, l lVar, int i11) {
        int i12;
        boolean z14;
        l lVarV = lVar.v(81045877);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.s(j11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.n(textStyle) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            z14 = z11;
            i12 |= lVarV.p(z14) ? 2048 : 1024;
        } else {
            z14 = z11;
        }
        if ((57344 & i11) == 0) {
            i12 |= lVarV.p(z12) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= lVarV.p(z13) ? 131072 : 65536;
        }
        if ((374491 & i12) == 74898 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(81045877, i12, -1, "com.stripe.android.common.ui.PrimaryButtonContent (PrimaryButton.kt:101)");
            }
            v1.d.a(null, d3.c.INSTANCE.h(), false, z2.c.b(lVarV, 1456958795, true, new C1938c(str, j11, textStyle, z12, z13, r1.b(n.k(f90.l.f64654a.b(), (Context) lVarV.U(AndroidCompositionLocals_androidKt.g()))), z14)), lVarV, 3120, 5);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(str, j11, textStyle, z11, z12, z13, i11));
        }
    }
}
