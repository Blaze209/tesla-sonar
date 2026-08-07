package p026y50;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.PlatformTextStyle;
import i4.TextStyle;
import jn0.h0;
import k3.Shadow;
import k3.p1;
import k3.r1;
import m3.g;
import n2.n;
import p007h2.SelectionColors;
import p007h2.m0;
import p009i2.Colors;
import p009i2.k1;
import p009i2.v2;
import p011ja.d0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p014n4.q;
import p020r2.Function0;
import p020r2.g2;
import p020r2.h2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import p4.LocaleList;
import t4.LineHeightStyle;
import t4.TextGeometricTransform;
import t4.TextIndent;
import t4.e;
import t4.f;
import t4.j;
import t4.k;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\nH\u0082\u0010¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\r*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020 0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&\"\u0014\u0010-\u001a\u00020*8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Ly50/h;", "theme", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Ly50/h;Lwn0/p;Lr2/l;II)V", "Landroid/view/Window;", "k", "(Lr2/l;I)Landroid/view/Window;", "Landroid/content/Context;", "j", "(Landroid/content/Context;)Landroid/view/Window;", "Li4/r0;", "", "useDefaultLineHeight", "m", "(Li4/r0;Z)Li4/r0;", "Lk3/p1;", "debugColor", "Li2/r;", "h", "(J)Li2/r;", "Ly50/b;", "Ly50/b;", "Colors", "b", "InstantDebitsColors", "Lt4/h;", "c", "Lt4/h;", "lineHeightStyle", "Ly50/e;", DateTokenConverter.CONVERTER_KEY, "Ly50/e;", "Typography", "Lr2/g2;", "e", "Lr2/g2;", "LocalTypography", "f", "LocalColors", "Lh2/l0;", "l", "(Lr2/l;I)Lh2/l0;", "TextSelectionColors", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FinancialConnectionsColors f125129a = new FinancialConnectionsColors(p026y50.a.r(), p026y50.a.p(), p026y50.a.n(), p026y50.a.k(), p026y50.a.e(), p026y50.a.f(), p026y50.a.q(), p026y50.a.k(), p026y50.a.d(), p026y50.a.a(), p026y50.a.c(), p026y50.a.d(), p026y50.a.m(), p026y50.a.k(), p026y50.a.m(), p026y50.a.o(), p026y50.a.m(), p026y50.a.b(), p026y50.a.l(), p026y50.a.d(), p026y50.a.k(), null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FinancialConnectionsColors f125130b = new FinancialConnectionsColors(p026y50.a.r(), p026y50.a.p(), p026y50.a.n(), p026y50.a.k(), p026y50.a.i(), p026y50.a.f(), p026y50.a.q(), p026y50.a.k(), p026y50.a.i(), p026y50.a.a(), p026y50.a.h(), p026y50.a.g(), p026y50.a.m(), p026y50.a.k(), p026y50.a.m(), p026y50.a.o(), p026y50.a.m(), p026y50.a.b(), p026y50.a.l(), p026y50.a.g(), p026y50.a.j(), null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LineHeightStyle f125131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FinancialConnectionsTypography f125132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g2<FinancialConnectionsTypography> f125133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g2<FinancialConnectionsColors> f125134f;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f125135c;

        /* JADX INFO: renamed from: y50.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C2711a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Window f125136c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ View f125137d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f125138e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2711a(Window window, View view, long j11) {
                super(0);
                this.f125136c = window;
                this.f125137d = view;
                this.f125138e = j11;
            }

            public final void b() {
                Window window = this.f125136c;
                if (window != null) {
                    View view = this.f125137d;
                    long j11 = this.f125138e;
                    WindowInsetsControllerCompat windowInsetsControllerCompatA = z0.a(window, view);
                    s.j(windowInsetsControllerCompatA, "getInsetsController(...)");
                    window.setNavigationBarColor(r1.k(j11));
                    windowInsetsControllerCompatA.f(true);
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<l, Integer, h0> f125139c;

            /* JADX INFO: renamed from: y50.i$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class C2712a extends u implements p<l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p<l, Integer, h0> f125140c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2712a(p<? super l, ? super Integer, h0> pVar) {
                    super(2);
                    this.f125140c = pVar;
                }

                public final void a(l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(1955858241, i11, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous>.<anonymous>.<anonymous> (Theme.kt:238)");
                    }
                    this.f125140c.invoke(lVar, 0);
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
            /* JADX WARN: Multi-variable type inference failed */
            b(p<? super l, ? super Integer, h0> pVar) {
                super(2);
                this.f125139c = pVar;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-1841232895, i11, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous>.<anonymous> (Theme.kt:233)");
                }
                w.b(new h2[]{m0.b().d(i.l(lVar, 0)), v2.e().d(i.m((TextStyle) lVar.U(v2.e()), true)), n.d().d(p026y50.c.f125063b)}, z2.c.b(lVar, 1955858241, true, new C2712a(this.f125139c)), lVar, 56);
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
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f125135c = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-290040275, i11, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous> (Theme.kt:218)");
            }
            View view = (View) lVar.U(AndroidCompositionLocals_androidKt.k());
            Window windowK = i.k(lVar, 0);
            long border = p026y50.d.f125064a.a(lVar, 6).getBorder();
            lVar.H(253607492);
            if (!view.isInEditMode()) {
                Function0.i(new C2711a(windowK, view, border), lVar, 0);
            }
            lVar.T();
            k1.a(i.i(0L, 1, null), null, null, z2.c.b(lVar, -1841232895, true, new b(this.f125135c)), lVar, 3072, 6);
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
        final /* synthetic */ h f125141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f125142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f125143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f125144f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h hVar, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f125141c = hVar;
            this.f125142d = pVar;
            this.f125143e = i11;
            this.f125144f = i12;
        }

        public final void a(l lVar, int i11) {
            i.a(this.f125141c, this.f125142d, lVar, k2.a(this.f125143e | 1), this.f125144f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly50/b;", "b", "()Ly50/b;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<FinancialConnectionsColors> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f125145c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsColors invoke() {
            throw new IllegalStateException("no Colors provided");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly50/e;", "b", "()Ly50/e;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<FinancialConnectionsTypography> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f125146c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsTypography invoke() {
            throw new IllegalStateException("no Typography provided");
        }
    }

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.c.INSTANCE.b(), null);
        f125131c = lineHeightStyle;
        long jH = w4.w.h(28);
        long jH2 = w4.w.h(36);
        long jF = w4.w.f(0.38d);
        FontWeight.Companion companion = FontWeight.INSTANCE;
        int i11 = 15597433;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextStyle textStyleN = n(new TextStyle(0L, jH, companion.i(), (b0) null, (c0) null, (q) null, (String) null, jF, (t4.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (g) null, (j) null, (t4.l) null, jH2, (TextIndent) null, (PlatformTextStyle) null, lineHeightStyle, (f) null, (e) null, (t4.s) null, i11, defaultConstructorMarker), false, 1, null);
        long j11 = 0;
        b0 b0Var = null;
        c0 c0Var = null;
        q qVar = null;
        String str = null;
        t4.a aVar = null;
        TextGeometricTransform textGeometricTransform = null;
        LocaleList localeList = null;
        k kVar = null;
        g gVar = null;
        t4.l lVar = null;
        PlatformTextStyle platformTextStyle = null;
        e eVar = null;
        t4.s sVar = null;
        TextStyle textStyleN2 = n(new TextStyle(j11, w4.w.h(28), companion.f(), b0Var, c0Var, qVar, str, w4.w.f(0.38d), aVar, textGeometricTransform, localeList, 0L, kVar, (Shadow) null, gVar, (j) null, lVar, w4.w.h(36), (TextIndent) null, platformTextStyle, lineHeightStyle, (f) null, eVar, sVar, i11, defaultConstructorMarker), false, 1, null);
        long j12 = 0;
        long j13 = 0;
        Shadow e4Var = null;
        j jVar = null;
        TextIndent textIndent = null;
        f fVar = null;
        TextStyle textStyleN3 = n(new TextStyle(j12, w4.w.h(24), companion.i(), b0Var, c0Var, qVar, str, w4.w.f(0.3d), aVar, textGeometricTransform, localeList, j13, kVar, e4Var, gVar, jVar, lVar, w4.w.h(32), textIndent, platformTextStyle, lineHeightStyle, fVar, eVar, sVar, i11, defaultConstructorMarker), false, 1, null);
        long j14 = 0;
        TextStyle textStyleN4 = n(new TextStyle(j14, w4.w.h(20), companion.i(), b0Var, c0Var, qVar, str, w4.w.f(0.3d), aVar, textGeometricTransform, localeList, j13, kVar, e4Var, gVar, jVar, lVar, w4.w.h(28), textIndent, platformTextStyle, lineHeightStyle, fVar, eVar, sVar, i11, defaultConstructorMarker), false, 1, null);
        int i12 = 15597561;
        long j15 = 0;
        f125132d = new FinancialConnectionsTypography(textStyleN, textStyleN2, textStyleN3, textStyleN4, n(new TextStyle(0L, w4.w.h(16), companion.h(), b0Var, c0Var, qVar, str, j15, aVar, textGeometricTransform, localeList, j13, kVar, e4Var, gVar, jVar, lVar, w4.w.h(24), textIndent, platformTextStyle, lineHeightStyle, fVar, eVar, sVar, i12, defaultConstructorMarker), false, 1, null), n(new TextStyle(0L, w4.w.h(16), companion.f(), b0Var, c0Var, qVar, str, j15, aVar, textGeometricTransform, localeList, j13, kVar, e4Var, gVar, jVar, lVar, w4.w.h(24), textIndent, platformTextStyle, lineHeightStyle, fVar, eVar, sVar, i12, defaultConstructorMarker), false, 1, null), n(new TextStyle(0L, w4.w.h(14), companion.f(), b0Var, c0Var, qVar, str, j15, aVar, textGeometricTransform, localeList, 0L, kVar, (Shadow) null, gVar, (j) null, lVar, w4.w.h(20), (TextIndent) null, platformTextStyle, lineHeightStyle, (f) null, eVar, sVar, i12, defaultConstructorMarker), false, 1, null), n(new TextStyle(0L, w4.w.h(16), companion.h(), b0Var, c0Var, qVar, str, j15, aVar, textGeometricTransform, localeList, 0L, kVar, (Shadow) null, gVar, (j) null, lVar, w4.w.h(24), (TextIndent) null, platformTextStyle, lineHeightStyle, (f) null, eVar, sVar, i12, defaultConstructorMarker), false, 1, null), n(new TextStyle(0L, w4.w.h(16), companion.f(), b0Var, c0Var, qVar, str, j15, aVar, textGeometricTransform, localeList, 0L, kVar, (Shadow) null, gVar, (j) null, lVar, w4.w.h(24), (TextIndent) null, platformTextStyle, lineHeightStyle, (f) null, eVar, sVar, i12, defaultConstructorMarker), false, 1, null), n(new TextStyle(0L, w4.w.h(14), companion.h(), b0Var, c0Var, qVar, str, j15, aVar, textGeometricTransform, localeList, 0L, kVar, (Shadow) null, gVar, (j) null, lVar, w4.w.h(20), (TextIndent) null, platformTextStyle, lineHeightStyle, (f) null, eVar, sVar, i12, defaultConstructorMarker), false, 1, null), n(new TextStyle(0L, w4.w.h(14), companion.f(), b0Var, c0Var, qVar, str, j15, aVar, textGeometricTransform, localeList, 0L, kVar, (Shadow) null, gVar, (j) null, lVar, w4.w.h(20), (TextIndent) null, platformTextStyle, lineHeightStyle, (f) null, eVar, sVar, i12, defaultConstructorMarker), false, 1, null), n(new TextStyle(0L, w4.w.h(12), companion.f(), b0Var, c0Var, qVar, str, j15, aVar, textGeometricTransform, localeList, 0L, kVar, (Shadow) null, gVar, (j) null, lVar, w4.w.h(16), (TextIndent) null, platformTextStyle, lineHeightStyle, (f) null, eVar, sVar, i12, defaultConstructorMarker), false, 1, null));
        f125133e = w.f(d.f125146c);
        f125134f = w.f(c.f125145c);
    }

    public static final void a(h hVar, p<? super l, ? super Integer, h0> content, l lVar, int i11, int i12) {
        int i13;
        s.k(content, "content");
        l lVarV = lVar.v(-1622343315);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(hVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.K(content) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                hVar = h.INSTANCE.a();
            }
            if (o.J()) {
                o.S(-1622343315, i13, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme (Theme.kt:212)");
            }
            w.b(new h2[]{v50.b.e().d(ka.l.e(new d0[0], lVarV, 8)), f125133e.d(f125132d), f125134f.d(hVar.getColors())}, z2.c.b(lVarV, -290040275, true, new a(content)), lVarV, 56);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(hVar, content, i11, i12));
        }
    }

    private static final Colors h(long j11) {
        return new Colors(j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, j11, true, null);
    }

    static /* synthetic */ Colors i(long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = p1.INSTANCE.g();
        }
        return h(j11);
    }

    private static final Window j(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            s.j(context, "getBaseContext(...)");
        }
        return ((Activity) context).getWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Window k(l lVar, int i11) {
        lVar.H(-1994167690);
        if (o.J()) {
            o.S(-1994167690, i11, -1, "com.stripe.android.financialconnections.ui.theme.findWindow (Theme.kt:247)");
        }
        ViewParent parent = ((View) lVar.U(AndroidCompositionLocals_androidKt.k())).getParent();
        androidx.compose.ui.window.k kVar = parent instanceof androidx.compose.ui.window.k ? (androidx.compose.ui.window.k) parent : null;
        Window window = kVar != null ? kVar.getWindow() : null;
        if (window == null) {
            Context context = ((View) lVar.U(AndroidCompositionLocals_androidKt.k())).getContext();
            s.j(context, "getContext(...)");
            window = j(context);
        }
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return window;
    }

    public static final SelectionColors l(l lVar, int i11) {
        lVar.H(-604171497);
        if (o.J()) {
            o.S(-604171497, i11, -1, "com.stripe.android.financialconnections.ui.theme.<get-TextSelectionColors> (Theme.kt:188)");
        }
        p026y50.d dVar = p026y50.d.f125064a;
        SelectionColors selectionColors = new SelectionColors(dVar.a(lVar, 6).getTextDefault(), p1.p(dVar.a(lVar, 6).getTextDefault(), 0.4f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return selectionColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle m(TextStyle textStyle, boolean z11) {
        return TextStyle.e(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, z11 ? TextStyle.INSTANCE.a().u() : textStyle.u(), null, new PlatformTextStyle(true), TextStyle.INSTANCE.a().v(), null, null, null, 15073279, null);
    }

    static /* synthetic */ TextStyle n(TextStyle textStyle, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m(textStyle, z11);
    }
}
