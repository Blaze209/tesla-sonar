package f90;

import android.content.Context;
import androidx.compose.ui.platform.p1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.PlatformTextStyle;
import i4.TextStyle;
import jn0.h0;
import jn0.t;
import k3.r1;
import p009i2.Shapes;
import p009i2.Typography;
import p009i2.j1;
import p009i2.k1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.FontWeight;
import p014n4.q;
import p014n4.r;
import p014n4.v;
import p020r2.g2;
import p020r2.h2;
import p020r2.k2;
import p020r2.w;
import p020r2.w2;
import q1.BorderStroke;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u0012*\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010\"\u001a\u00020!*\u00020\u001d2\u0006\u0010 \u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0016\u0010$\u001a\u00020\u0012*\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010)\u001a\u00020(*\u00020&2\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010+\u001a\u00020(*\u00020&2\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b+\u0010*\u001a\u001b\u0010,\u001a\u00020(*\u00020&2\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b,\u0010*\u001a\u001b\u0010-\u001a\u00020(*\u00020&2\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b-\u0010*\u001a\u001b\u0010.\u001a\u00020(*\u00020&2\u0006\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b.\u0010*\u001a\u0013\u00100\u001a\u00020/*\u00020&H\u0007¢\u0006\u0004\b0\u00101\u001a\u0013\u00102\u001a\u00020/*\u00020/H\u0002¢\u0006\u0004\b2\u00103\"\u001a\u00107\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106\"\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\b088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0000088\u0006¢\u0006\f\n\u0004\b\"\u0010:\u001a\u0004\b>\u0010<\"\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0004088\u0006¢\u0006\f\n\u0004\b)\u0010:\u001a\u0004\b@\u0010<\" \u0010C\u001a\b\u0012\u0004\u0012\u00020\u0012088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010:\u001a\u0004\bB\u0010<\"\u001b\u0010H\u001a\u00020\b*\u00020\u00118G¢\u0006\f\u0012\u0004\bF\u0010G\u001a\u0004\bD\u0010E\"\u001b\u0010L\u001a\u00020\u0000*\u00020\u00118G¢\u0006\f\u0012\u0004\bK\u0010G\u001a\u0004\bI\u0010J\"\u001b\u0010P\u001a\u00020\u0004*\u00020\u00118G¢\u0006\f\u0012\u0004\bO\u0010G\u001a\u0004\bM\u0010N\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, d2 = {"Lf90/k;", "Lf90/j;", "u", "(Lf90/k;Lr2/l;I)Lf90/j;", "Lf90/o;", "Li2/w2;", "v", "(Lf90/o;Lr2/l;I)Li2/w2;", "Lf90/i;", "colors", "shapes", "typography", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Lf90/i;Lf90/k;Lf90/o;Lwn0/p;Lr2/l;II)V", "Li2/j1;", "", "isSelected", "Lw4/h;", "h", "(Li2/j1;ZLr2/l;I)F", "Lk3/p1;", "g", "(Li2/j1;ZLr2/l;I)J", "Lq1/g;", "e", "(Li2/j1;ZLr2/l;I)Lq1/g;", "Landroid/content/Context;", "r", "(Landroid/content/Context;)Z", "dp", "", "c", "(Landroid/content/Context;F)F", "s", "(J)Z", "Lf90/d;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "(Lf90/d;Landroid/content/Context;)I", "q", "k", "l", "f", "Li4/r0;", IntegerTokenConverter.CONVERTER_KEY, "(Lf90/d;Lr2/l;I)Li4/r0;", "t", "(Li4/r0;)Li4/r0;", "J", "m", "()J", "PRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR", "Lr2/g2;", "b", "Lr2/g2;", "getLocalColors", "()Lr2/g2;", "LocalColors", "getLocalShapes", "LocalShapes", "getLocalTypography", "LocalTypography", "j", "LocalInstrumentationTest", "n", "(Li2/j1;Lr2/l;I)Lf90/i;", "getStripeColors$annotations", "(Li2/j1;)V", "stripeColors", "o", "(Li2/j1;Lr2/l;I)Lf90/k;", "getStripeShapes$annotations", "stripeShapes", "p", "(Li2/j1;Lr2/l;I)Lf90/o;", "getStripeTypography$annotations", "stripeTypography", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f64667a = r1.d(4280595582L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2<StripeColors> f64668b = w.f(a.f64672c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g2<StripeShapes> f64669c = w.f(c.f64674c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g2<StripeTypography> f64670d = w.f(d.f64675c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g2<Boolean> f64671e = w.f(b.f64673c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf90/i;", "b", "()Lf90/i;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<StripeColors> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f64672c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StripeColors invoke() {
            return l.f64654a.a(false);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f64673c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf90/k;", "b", "()Lf90/k;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<StripeShapes> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f64674c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StripeShapes invoke() {
            return l.f64654a.c();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf90/o;", "b", "()Lf90/o;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<StripeTypography> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f64675c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StripeTypography invoke() {
            return l.f64654a.d();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StripeColors f64676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StripeTypography f64677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StripeShapes f64678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f64679f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<p020r2.l, Integer, h0> f64680c;

            /* JADX INFO: renamed from: f90.n$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class C1330a extends u implements p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p<p020r2.l, Integer, h0> f64681c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1330a(p<? super p020r2.l, ? super Integer, h0> pVar) {
                    super(2);
                    this.f64681c = pVar;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(734609044, i11, -1, "com.stripe.android.uicore.StripeTheme.<anonymous>.<anonymous>.<anonymous> (StripeTheme.kt:369)");
                    }
                    this.f64681c.invoke(lVar, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                    a(lVar, num.intValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super p020r2.l, ? super Integer, h0> pVar) {
                super(2);
                this.f64680c = pVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1485460652, i11, -1, "com.stripe.android.uicore.StripeTheme.<anonymous>.<anonymous> (StripeTheme.kt:366)");
                }
                w.b(new h2[]{v2.e().d(n.t((TextStyle) lVar.U(v2.e())))}, z2.c.b(lVar, 734609044, true, new C1330a(this.f64680c)), lVar, 56);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(StripeColors stripeColors, StripeTypography stripeTypography, StripeShapes stripeShapes, p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f64676c = stripeColors;
            this.f64677d = stripeTypography;
            this.f64678e = stripeShapes;
            this.f64679f = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-289952640, i11, -1, "com.stripe.android.uicore.StripeTheme.<anonymous> (StripeTheme.kt:361)");
            }
            k1.a(this.f64676c.getMaterialColors(), n.v(this.f64677d, lVar, 0), n.u(this.f64678e, lVar, 0).getMaterial(), z2.c.b(lVar, -1485460652, true, new a(this.f64679f)), lVar, 3072, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StripeColors f64682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StripeShapes f64683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StripeTypography f64684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f64685f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f64686g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f64687h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(StripeColors stripeColors, StripeShapes stripeShapes, StripeTypography stripeTypography, p<? super p020r2.l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f64682c = stripeColors;
            this.f64683d = stripeShapes;
            this.f64684e = stripeTypography;
            this.f64685f = pVar;
            this.f64686g = i11;
            this.f64687h = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.a(this.f64682c, this.f64683d, this.f64684e, this.f64685f, lVar, k2.a(this.f64686g | 1), this.f64687h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(StripeColors stripeColors, StripeShapes stripeShapes, StripeTypography stripeTypography, p<? super p020r2.l, ? super Integer, h0> content, p020r2.l lVar, int i11, int i12) {
        int i13;
        Object objB;
        Object objB2;
        s.k(content, "content");
        p020r2.l lVarV = lVar.v(1508960192);
        if ((i11 & 14) == 0) {
            i13 = (((i12 & 1) == 0 && lVarV.n(stripeColors)) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            i13 |= ((i12 & 2) == 0 && lVarV.n(stripeShapes)) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i13 |= ((i12 & 4) == 0 && lVarV.n(stripeTypography)) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= lVarV.K(content) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            lVarV.L();
            if ((i11 & 1) == 0 || lVarV.k()) {
                if ((i12 & 1) != 0) {
                    stripeColors = l.f64654a.a(q1.m.a(lVarV, 0));
                    i13 &= -15;
                }
                if ((i12 & 2) != 0) {
                    stripeShapes = l.f64654a.c();
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    stripeTypography = l.f64654a.d();
                    i13 &= -897;
                }
            } else {
                lVarV.j();
                if ((i12 & 1) != 0) {
                    i13 &= -15;
                }
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(1508960192, i13, -1, "com.stripe.android.uicore.StripeTheme (StripeTheme.kt:337)");
            }
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(Boolean.FALSE);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (jn0.s.g(objB)) {
                objB = bool;
            }
            boolean zBooleanValue = ((Boolean) objB).booleanValue();
            try {
                objB2 = jn0.s.b(bool);
            } catch (Throwable th3) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB2 = jn0.s.b(t.a(th3));
            }
            Boolean bool2 = Boolean.FALSE;
            if (jn0.s.g(objB2)) {
                objB2 = bool2;
            }
            Boolean bool3 = (Boolean) objB2;
            bool3.booleanValue();
            w.b(new h2[]{f64668b.d(stripeColors), f64669c.d(stripeShapes), f64670d.d(stripeTypography), p1.a().d(Boolean.valueOf(((Boolean) lVarV.U(p1.a())).booleanValue() || zBooleanValue)), f64671e.d(bool3)}, z2.c.b(lVarV, -289952640, true, new e(stripeColors, stripeTypography, stripeShapes, content)), lVarV, 56);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        StripeColors stripeColors2 = stripeColors;
        StripeShapes stripeShapes2 = stripeShapes;
        StripeTypography stripeTypography2 = stripeTypography;
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(stripeColors2, stripeShapes2, stripeTypography2, content, i11, i12));
        }
    }

    public static final float c(Context convertDpToPx, float f11) {
        s.k(convertDpToPx, "$this$convertDpToPx");
        return f11 * convertDpToPx.getResources().getDisplayMetrics().density;
    }

    public static final int d(PrimaryButtonStyle primaryButtonStyle, Context context) {
        s.k(primaryButtonStyle, "<this>");
        s.k(context, "context");
        return r1.k((r(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).getBackground());
    }

    public static final BorderStroke e(j1 j1Var, boolean z11, p020r2.l lVar, int i11) {
        s.k(j1Var, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(983266912, i11, -1, "com.stripe.android.uicore.getBorderStroke (StripeTheme.kt:437)");
        }
        int i12 = j1.f74526b;
        int i13 = i11 & 14;
        int i14 = i11 & 112;
        BorderStroke borderStrokeA = q1.h.a(h(j1Var, z11, lVar, i12 | i13 | i14), g(j1Var, z11, lVar, i14 | i12 | i13));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return borderStrokeA;
    }

    public static final int f(PrimaryButtonStyle primaryButtonStyle, Context context) {
        s.k(primaryButtonStyle, "<this>");
        s.k(context, "context");
        return r1.k((r(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).getBorder());
    }

    public static final long g(j1 j1Var, boolean z11, p020r2.l lVar, int i11) {
        long componentBorder;
        s.k(j1Var, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(-782836080, i11, -1, "com.stripe.android.uicore.getBorderStrokeColor (StripeTheme.kt:431)");
        }
        if (z11) {
            lVar.H(358095736);
            componentBorder = n(j1Var, lVar, j1.f74526b | (i11 & 14)).getMaterialColors().j();
        } else {
            lVar.H(358096576);
            componentBorder = n(j1Var, lVar, j1.f74526b | (i11 & 14)).getComponentBorder();
        }
        lVar.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return componentBorder;
    }

    public static final float h(j1 j1Var, boolean z11, p020r2.l lVar, int i11) {
        float borderStrokeWidth;
        s.k(j1Var, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(522405058, i11, -1, "com.stripe.android.uicore.getBorderStrokeWidth (StripeTheme.kt:425)");
        }
        if (z11) {
            lVar.H(749269110);
            borderStrokeWidth = Float.max(o(j1Var, lVar, j1.f74526b | (i11 & 14)).getBorderStrokeWidth(), 2.0f);
        } else {
            lVar.H(749270358);
            borderStrokeWidth = o(j1Var, lVar, j1.f74526b | (i11 & 14)).getBorderStrokeWidth();
        }
        float fG = w4.h.g(borderStrokeWidth);
        lVar.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return fG;
    }

    public static final TextStyle i(PrimaryButtonStyle primaryButtonStyle, p020r2.l lVar, int i11) {
        s.k(primaryButtonStyle, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(-2057860207, i11, -1, "com.stripe.android.uicore.getComposeTextStyle (StripeTheme.kt:566)");
        }
        TextStyle textStyleE = TextStyle.e(j1.f74525a.c(lVar, j1.f74526b).getH5(), (q1.m.a(lVar, 0) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).getOnBackground(), primaryButtonStyle.getTypography().getFontSize(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777212, null);
        if (primaryButtonStyle.getTypography().getFontFamily() != null) {
            textStyleE = TextStyle.e(textStyleE, 0L, 0L, null, null, null, r.b(v.b(primaryButtonStyle.getTypography().getFontFamily().intValue(), null, 0, 0, 14, null)), null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777183, null);
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return textStyleE;
    }

    public static final g2<Boolean> j() {
        return f64671e;
    }

    public static final int k(PrimaryButtonStyle primaryButtonStyle, Context context) {
        s.k(primaryButtonStyle, "<this>");
        s.k(context, "context");
        return r1.k((r(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).getOnBackground());
    }

    public static final int l(PrimaryButtonStyle primaryButtonStyle, Context context) {
        s.k(primaryButtonStyle, "<this>");
        s.k(context, "context");
        return r1.k((r(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).getOnSuccessBackground());
    }

    public static final long m() {
        return f64667a;
    }

    public static final StripeColors n(j1 j1Var, p020r2.l lVar, int i11) {
        s.k(j1Var, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(1304104896, i11, -1, "com.stripe.android.uicore.<get-stripeColors> (StripeTheme.kt:406)");
        }
        StripeColors stripeColors = (StripeColors) lVar.U(f64668b);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return stripeColors;
    }

    public static final StripeShapes o(j1 j1Var, p020r2.l lVar, int i11) {
        s.k(j1Var, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(1758187266, i11, -1, "com.stripe.android.uicore.<get-stripeShapes> (StripeTheme.kt:412)");
        }
        StripeShapes stripeShapes = (StripeShapes) lVar.U(f64669c);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return stripeShapes;
    }

    public static final StripeTypography p(j1 j1Var, p020r2.l lVar, int i11) {
        s.k(j1Var, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(-589352801, i11, -1, "com.stripe.android.uicore.<get-stripeTypography> (StripeTheme.kt:419)");
        }
        StripeTypography stripeTypography = (StripeTypography) lVar.U(f64670d);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return stripeTypography;
    }

    public static final int q(PrimaryButtonStyle primaryButtonStyle, Context context) {
        s.k(primaryButtonStyle, "<this>");
        s.k(context, "context");
        return r1.k((r(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).getSuccessBackground());
    }

    public static final boolean r(Context context) {
        s.k(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean s(long j11) {
        int iK = r1.k(j11);
        k3.p1.Companion companion = k3.p1.INSTANCE;
        double d11 = k5.d.d(iK, r1.k(companion.a()));
        double d12 = k5.d.d(r1.k(j11), r1.k(companion.k()));
        return d12 <= 2.2d && d11 > d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle t(TextStyle textStyle) {
        TextStyle.Companion companion = TextStyle.INSTANCE;
        return TextStyle.e(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, companion.a().u(), null, new PlatformTextStyle(true), companion.a().v(), null, null, null, 15073279, null);
    }

    public static final StripeComposeShapes u(StripeShapes stripeShapes, p020r2.l lVar, int i11) {
        s.k(stripeShapes, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(-530823679, i11, -1, "com.stripe.android.uicore.toComposeShapes (StripeTheme.kt:222)");
        }
        StripeComposeShapes stripeComposeShapes = new StripeComposeShapes(w4.h.g(stripeShapes.getBorderStrokeWidth()), Shapes.b(j1.f74525a.b(lVar, j1.f74526b), a2.g.c(w4.h.g(stripeShapes.getCornerRadius())), a2.g.c(w4.h.g(stripeShapes.getCornerRadius())), null, 4, null), null);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return stripeComposeShapes;
    }

    public static final Typography v(StripeTypography stripeTypography, p020r2.l lVar, int i11) {
        q qVar;
        q qVar2;
        q qVar3;
        q qVar4;
        q qVar5;
        q qVar6;
        s.k(stripeTypography, "<this>");
        if (p020r2.o.J()) {
            p020r2.o.S(1580579333, i11, -1, "com.stripe.android.uicore.toComposeTypography (StripeTheme.kt:235)");
        }
        Integer fontFamily = stripeTypography.getFontFamily();
        q qVarB = fontFamily != null ? r.b(v.b(fontFamily.intValue(), null, 0, 0, 14, null)) : null;
        TextStyle textStyleT = t(TextStyle.INSTANCE.a());
        if (qVarB == null) {
            q h4FontFamily = stripeTypography.getH4FontFamily();
            if (h4FontFamily == null) {
                h4FontFamily = q.INSTANCE.a();
            }
            qVar = h4FontFamily;
        } else {
            qVar = qVarB;
        }
        long xLargeFontSize = stripeTypography.getXLargeFontSize();
        float fontSizeMultiplier = stripeTypography.getFontSizeMultiplier();
        w4.w.b(xLargeFontSize);
        TextStyle textStyleE = TextStyle.e(textStyleT, 0L, w4.w.k(w4.v.f(xLargeFontSize), w4.v.h(xLargeFontSize) * fontSizeMultiplier), new FontWeight(stripeTypography.getFontWeightBold()), null, null, qVar, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777177, null);
        if (qVarB == null) {
            q h5FontFamily = stripeTypography.getH5FontFamily();
            if (h5FontFamily == null) {
                h5FontFamily = q.INSTANCE.a();
            }
            qVar2 = h5FontFamily;
        } else {
            qVar2 = qVarB;
        }
        long largeFontSize = stripeTypography.getLargeFontSize();
        float fontSizeMultiplier2 = stripeTypography.getFontSizeMultiplier();
        w4.w.b(largeFontSize);
        TextStyle textStyleE2 = TextStyle.e(textStyleT, 0L, w4.w.k(w4.v.f(largeFontSize), w4.v.h(largeFontSize) * fontSizeMultiplier2), new FontWeight(stripeTypography.getFontWeightMedium()), null, null, qVar2, null, w4.w.f(-0.32d), null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777049, null);
        if (qVarB == null) {
            q h6FontFamily = stripeTypography.getH6FontFamily();
            if (h6FontFamily == null) {
                h6FontFamily = q.INSTANCE.a();
            }
            qVar3 = h6FontFamily;
        } else {
            qVar3 = qVarB;
        }
        long smallFontSize = stripeTypography.getSmallFontSize();
        float fontSizeMultiplier3 = stripeTypography.getFontSizeMultiplier();
        w4.w.b(smallFontSize);
        TextStyle textStyleE3 = TextStyle.e(textStyleT, 0L, w4.w.k(w4.v.f(smallFontSize), w4.v.h(smallFontSize) * fontSizeMultiplier3), new FontWeight(stripeTypography.getFontWeightMedium()), null, null, qVar3, null, w4.w.f(-0.15d), null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777049, null);
        if (qVarB == null) {
            q body1FontFamily = stripeTypography.getBody1FontFamily();
            if (body1FontFamily == null) {
                body1FontFamily = q.INSTANCE.a();
            }
            qVar4 = body1FontFamily;
        } else {
            qVar4 = qVarB;
        }
        long mediumFontSize = stripeTypography.getMediumFontSize();
        float fontSizeMultiplier4 = stripeTypography.getFontSizeMultiplier();
        w4.w.b(mediumFontSize);
        TextStyle textStyleE4 = TextStyle.e(textStyleT, 0L, w4.w.k(w4.v.f(mediumFontSize), w4.v.h(mediumFontSize) * fontSizeMultiplier4), new FontWeight(stripeTypography.getFontWeightNormal()), null, null, qVar4, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777177, null);
        if (qVarB == null) {
            q subtitle1FontFamily = stripeTypography.getSubtitle1FontFamily();
            if (subtitle1FontFamily == null) {
                subtitle1FontFamily = q.INSTANCE.a();
            }
            qVar5 = subtitle1FontFamily;
        } else {
            qVar5 = qVarB;
        }
        long mediumFontSize2 = stripeTypography.getMediumFontSize();
        float fontSizeMultiplier5 = stripeTypography.getFontSizeMultiplier();
        w4.w.b(mediumFontSize2);
        TextStyle textStyleE5 = TextStyle.e(textStyleT, 0L, w4.w.k(w4.v.f(mediumFontSize2), w4.v.h(mediumFontSize2) * fontSizeMultiplier5), new FontWeight(stripeTypography.getFontWeightNormal()), null, null, qVar5, null, w4.w.f(-0.15d), null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777049, null);
        if (qVarB == null) {
            q captionFontFamily = stripeTypography.getCaptionFontFamily();
            if (captionFontFamily == null) {
                captionFontFamily = q.INSTANCE.a();
            }
            qVar6 = captionFontFamily;
        } else {
            qVar6 = qVarB;
        }
        long xSmallFontSize = stripeTypography.getXSmallFontSize();
        float fontSizeMultiplier6 = stripeTypography.getFontSizeMultiplier();
        w4.w.b(xSmallFontSize);
        TextStyle textStyleE6 = TextStyle.e(textStyleT, 0L, w4.w.k(w4.v.f(xSmallFontSize), w4.v.h(xSmallFontSize) * fontSizeMultiplier6), new FontWeight(stripeTypography.getFontWeightMedium()), null, null, qVar6, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777177, null);
        if (qVarB == null && (qVarB = stripeTypography.getBody2FontFamily()) == null) {
            qVarB = q.INSTANCE.a();
        }
        q qVar7 = qVarB;
        long xxSmallFontSize = stripeTypography.getXxSmallFontSize();
        float fontSizeMultiplier7 = stripeTypography.getFontSizeMultiplier();
        w4.w.b(xxSmallFontSize);
        TextStyle textStyleE7 = TextStyle.e(textStyleT, 0L, w4.w.k(w4.v.f(xxSmallFontSize), w4.v.h(xxSmallFontSize) * fontSizeMultiplier7), new FontWeight(stripeTypography.getFontWeightNormal()), null, null, qVar7, null, w4.w.f(-0.15d), null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777049, null);
        Typography w2VarC = j1.f74525a.c(lVar, j1.f74526b);
        Typography w2VarA = w2VarC.a(t(w2VarC.getH1()), t(w2VarC.getH2()), t(w2VarC.getH3()), textStyleE, textStyleE2, textStyleE3, textStyleE5, t(w2VarC.getSubtitle2()), textStyleE4, textStyleE7, t(w2VarC.getButton()), textStyleE6, t(w2VarC.getOverline()));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return w2VarA;
    }
}
