package k60;

import a2.RoundedCornerShape;
import android.content.Context;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.s2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import f30.d0;
import g4.v;
import g4.y;
import java.util.Map;
import jn0.h0;
import k3.p1;
import kotlin.r;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.C4672l;
import p009i2.e1;
import p009i2.i0;
import p009i2.j1;
import p009i2.k;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.h2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import p020r2.y2;
import v1.e0;
import v1.g0;
import wn0.p;
import wn0.q;
import z3.a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015\"\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"", Scopes.EMAIL, "", "enabled", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "Landroidx/compose/ui/d;", "modifier", "a", "(Ljava/lang/String;ZLwn0/a;Landroidx/compose/ui/d;Lr2/l;II)V", "e", "(Ljava/lang/String;Lr2/l;I)V", "Lv1/g0;", "f", "(Lv1/g0;Lr2/l;I)V", DateTokenConverter.CONVERTER_KEY, "(Lr2/l;I)V", "c", "b", "Lw4/h;", Gender.FEMALE, "LinkButtonVerticalPadding", "LinkButtonHorizontalPadding", "La2/f;", "o", "()La2/f;", "LinkButtonShape", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f85143a = w4.h.g(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f85144b = w4.h.g(25);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f85145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f85146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f85147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f85148f;

        /* JADX INFO: renamed from: k60.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C1804a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f85149c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f85150d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f85151e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f85152f;

            /* JADX INFO: renamed from: k60.f$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class C1805a extends u implements q<g0, l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f85153c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1805a(String str) {
                    super(3);
                    this.f85153c = str;
                }

                public final void a(g0 Button, l lVar, int i11) {
                    s.k(Button, "$this$Button");
                    if ((i11 & 14) == 0) {
                        i11 |= lVar.n(Button) ? 4 : 2;
                    }
                    if ((i11 & 91) == 18 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(-1019595551, i11, -1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous>.<anonymous> (LinkButton.kt:134)");
                    }
                    if (this.f85153c == null) {
                        lVar.H(2066321056);
                        f.f(Button, lVar, i11 & 14);
                        lVar.T();
                    } else {
                        lVar.H(2066390868);
                        f.e(this.f85153c, lVar, 0);
                        lVar.T();
                    }
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
            C1804a(wn0.a<h0> aVar, androidx.compose.ui.d dVar, boolean z11, String str) {
                super(2);
                this.f85149c = aVar;
                this.f85150d = dVar;
                this.f85151e = z11;
                this.f85152f = str;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(123468017, i11, -1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous> (LinkButton.kt:113)");
                }
                wn0.a<h0> aVar = this.f85149c;
                androidx.compose.ui.d dVarA = s2.a(h3.e.a(x.b(x.h(this.f85150d, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(48), 1, null), f.o()), "LinkButtonTestTag");
                boolean z11 = this.f85151e;
                p009i2.j jVar = p009i2.j.f74513a;
                float f11 = 0;
                float fG = w4.h.g(f11);
                float fG2 = w4.h.g(f11);
                float fG3 = w4.h.g(f11);
                float fG4 = w4.h.g(f11);
                float fG5 = w4.h.g(f11);
                int i12 = p009i2.j.f74524l;
                k kVarB = jVar.b(fG, fG2, fG3, fG4, fG5, lVar, (i12 << 15) | 28086, 0);
                RoundedCornerShape roundedCornerShapeO = f.o();
                j1 j1Var = j1.f74525a;
                int i13 = j1.f74526b;
                C4672l.a(aVar, dVarA, z11, null, kVarB, roundedCornerShapeO, null, jVar.a(j1Var.a(lVar, i13).j(), 0L, j1Var.a(lVar, i13).j(), 0L, lVar, i12 << 12, 10), t.d(f.f85144b, f.f85143a, f.f85144b, f.f85143a), z2.c.b(lVar, -1019595551, true, new C1805a(this.f85152f)), lVar, 905969664, 72);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a<h0> aVar, androidx.compose.ui.d dVar, boolean z11, String str) {
            super(2);
            this.f85145c = aVar;
            this.f85146d = dVar;
            this.f85147e = z11;
            this.f85148f = str;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(173300341, i11, -1, "com.stripe.android.link.ui.LinkButton.<anonymous> (LinkButton.kt:112)");
            }
            j60.d.a(false, z2.c.b(lVar, 123468017, true, new C1804a(this.f85145c, this.f85146d, this.f85147e, this.f85148f)), lVar, 48, 1);
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
        final /* synthetic */ String f85154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f85155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f85156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f85157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f85158g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f85159h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z11, wn0.a<h0> aVar, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f85154c = str;
            this.f85155d = z11;
            this.f85156e = aVar;
            this.f85157f = dVar;
            this.f85158g = i11;
            this.f85159h = i12;
        }

        public final void a(l lVar, int i11) {
            f.a(this.f85154c, this.f85155d, this.f85156e, this.f85157f, lVar, k2.a(this.f85158g | 1), this.f85159h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f85160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(2);
            this.f85160c = i11;
        }

        public final void a(l lVar, int i11) {
            f.b(lVar, k2.a(this.f85160c | 1));
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
        final /* synthetic */ int f85161c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(2);
            this.f85161c = i11;
        }

        public final void a(l lVar, int i11) {
            f.c(lVar, k2.a(this.f85161c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f85162c = new e();

        e() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.z(semantics);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: k60.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C1806f extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f85163c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1806f(int i11) {
            super(2);
            this.f85163c = i11;
        }

        public final void a(l lVar, int i11) {
            f.d(lVar, k2.a(this.f85163c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(1);
            this.f85164c = str;
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.c0(semantics, this.f85164c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f85166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, int i11) {
            super(2);
            this.f85165c = str;
            this.f85166d = i11;
        }

        public final void a(l lVar, int i11) {
            f.e(this.f85165c, lVar, k2.a(this.f85166d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.f85167c = str;
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.c0(semantics, this.f85167c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f85168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f85169d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(g0 g0Var, int i11) {
            super(2);
            this.f85168c = g0Var;
            this.f85169d = i11;
        }

        public final void a(l lVar, int i11) {
            f.f(this.f85168c, lVar, k2.a(this.f85169d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(String str, boolean z11, wn0.a<h0> onClick, androidx.compose.ui.d dVar, l lVar, int i11, int i12) {
        int i13;
        s.k(onClick, "onClick");
        l lVarV = lVar.v(-1316244043);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(str) ? 4 : 2) | i11;
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
            i13 |= lVarV.K(onClick) ? 256 : 128;
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= lVarV.n(dVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (o.J()) {
                o.S(-1316244043, i13, -1, "com.stripe.android.link.ui.LinkButton (LinkButton.kt:103)");
            }
            lVarV.H(830349231);
            float fB = z11 ? 1.0f : p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
            lVarV.T();
            w.b(new h2[]{p009i2.y.a().d(Float.valueOf(fB))}, z2.c.b(lVarV, 173300341, true, new a(onClick, dVar, z11, str)), lVarV, 56);
            if (o.J()) {
                o.R();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(str, z11, onClick, dVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(l lVar, int i11) {
        l lVarV = lVar.v(414444570);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(414444570, i11, -1, "com.stripe.android.link.ui.LinkDivider (LinkButton.kt:258)");
            }
            i0.a(x.d(x.v(androidx.compose.ui.d.INSTANCE, w4.h.g(1)), BitmapDescriptorFactory.HUE_RED, 1, null), j60.d.b(j1.f74525a, lVarV, j1.f74526b).getActionLabelLight(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 6, 12);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(l lVar, int i11) {
        l lVarV = lVar.v(594106890);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(594106890, i11, -1, "com.stripe.android.link.ui.LinkIcon (LinkButton.kt:246)");
            }
            e1.a(e4.e.c(f90.g.f64612c, lVarV, 0), e4.i.c(d0.B0, lVarV, 0), h3.a.a(androidx.compose.foundation.layout.d.b(androidx.compose.ui.d.INSTANCE, 2.7692308f, false, 2, null), ((Number) lVarV.U(p009i2.y.a())).floatValue()), p1.INSTANCE.j(), lVarV, 3080, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(l lVar, int i11) {
        l lVar2;
        l lVarV = lVar.v(628395052);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(628395052, i11, -1, "com.stripe.android.link.ui.LinkIconAndDivider (LinkButton.kt:209)");
            }
            lVarV.H(-1036615455);
            Object objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                i4.d.a aVar = new i4.d.a(0, 1, null);
                r.a(aVar, "LinkIcon", "[icon]");
                r.a(aVar, "LinkDividerSpacer", "[divider_spacer]");
                r.a(aVar, "LinkDivider", "[divider]");
                r.a(aVar, "LinkDividerSpacer", "[divider_spacer]");
                objI = aVar.o();
                lVarV.B(objI);
            }
            lVarV.T();
            long jH = w4.w.h(16);
            int iB = t4.t.INSTANCE.b();
            r60.b bVar = new r60.b();
            long jE = w4.w.e(3);
            long jD = w4.w.d(1.1d);
            k60.a aVar2 = k60.a.f85124a;
            r60.b.b(bVar, "LinkIcon", jE, jD, 0, aVar2.b(), 8, null);
            r60.b.b(bVar, "LinkDivider", w4.w.d(0.1d), w4.w.d(1.3d), 0, aVar2.c(), 8, null);
            r60.b.d(bVar, "LinkDividerSpacer", w4.w.d(0.5d), 0, 4, null);
            lVar2 = lVarV;
            v2.c((i4.d) objI, g4.o.d(androidx.compose.ui.d.INSTANCE, false, e.f85162c, 1, null), 0L, jH, null, null, null, 0L, null, null, 0L, iB, false, 1, 0, bVar.e(), null, null, lVar2, 3078, 265264, 219124);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new C1806f(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String str, l lVar, int i11) {
        int i12;
        l lVar2;
        l lVarV = lVar.v(-61511536);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(-61511536, i12, -1, "com.stripe.android.link.ui.SignedInButtonContent (LinkButton.kt:145)");
            }
            lVarV.H(-196619929);
            boolean z11 = (i12 & 14) == 4;
            Object objI = lVarV.I();
            if (z11 || objI == l.INSTANCE.a()) {
                i4.d.a aVar = new i4.d.a(0, 1, null);
                aVar.i(str);
                objI = aVar.o();
                lVarV.B(objI);
            }
            i4.d dVar = (i4.d) objI;
            lVarV.T();
            long jP = p1.p(j60.d.b(j1.f74525a, lVarV, j1.f74526b).getButtonLabel(), ((Number) lVarV.U(p009i2.y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            String strB2 = x30.d.g(c60.i.f18824c, new Object[0], null, 4, null).B2((Context) lVarV.U(AndroidCompositionLocals_androidKt.g()));
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            lVarV.H(-196607666);
            boolean zN = lVarV.n(strB2);
            Object objI2 = lVarV.I();
            if (zN || objI2 == l.INSTANCE.a()) {
                objI2 = new g(strB2);
                lVarV.B(objI2);
            }
            lVarV.T();
            androidx.compose.ui.d dVarC = g4.o.c(companion, true, (wn0.l) objI2);
            lVarV.H(693286680);
            z3.i0 i0VarB = e0.b(v1.b.f117444a.f(), d3.c.INSTANCE.l(), lVarV, 0);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarC);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            d(lVarV, 0);
            lVar2 = lVarV;
            v2.c(dVar, h0Var.a(companion, 0.5f, false), jP, w4.w.h(16), null, null, null, 0L, null, null, 0L, t4.t.INSTANCE.b(), false, 1, 0, null, null, null, lVar2, 3072, 3120, 251888);
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new h(str, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g0 g0Var, l lVar, int i11) {
        l lVar2;
        l lVarV = lVar.v(-1138308412);
        if ((i11 & 1) == 0 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(-1138308412, i11, -1, "com.stripe.android.link.ui.SignedOutButtonContent (LinkButton.kt:176)");
            }
            String strC = e4.i.c(c60.i.f18824c, lVarV, 0);
            i4.d.a aVar = new i4.d.a(0, 1, null);
            aVar.i(p013kotlin.text.t.z1(strC, "Link", null, 2, null));
            r.a(aVar, "LinkIcon", "[icon]");
            aVar.i(p013kotlin.text.t.r1(strC, "Link", null, 2, null));
            i4.d dVarO = aVar.o();
            int iA = t4.j.INSTANCE.a();
            r60.b bVar = new r60.b();
            r60.b.b(bVar, "LinkIcon", w4.w.d(2.6d), w4.w.d(0.9d), 0, k60.a.f85124a.a(), 8, null);
            Map<String, kotlin.q> mapE = bVar.e();
            androidx.compose.ui.d dVarH = x.h(t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.H(-106866996);
            boolean zN = lVarV.n(strC);
            Object objI = lVarV.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = new i(strC);
                lVarV.B(objI);
            }
            lVarV.T();
            lVar2 = lVarV;
            v2.c(dVarO, g4.o.d(dVarH, false, (wn0.l) objI, 1, null), p1.p(j60.d.b(j1.f74525a, lVarV, j1.f74526b).getButtonLabel(), ((Number) lVarV.U(p009i2.y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), w4.w.h(21), null, null, null, 0L, null, t4.j.h(iA), 0L, t4.t.INSTANCE.b(), false, 1, 0, mapE, null, null, lVar2, 3072, 265264, 218608);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new j(g0Var, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundedCornerShape o() {
        return a2.g.c(w4.h.g(f90.l.f64654a.b().getShape().getCornerRadius()));
    }
}
