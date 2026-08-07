package p023w50;

import androidx.compose.ui.platform.s2;
import com.plaid.internal.EnumC4419g;
import g4.w;
import g4.y;
import jn0.h0;
import p009i2.e1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import p026y50.h;
import q50.TopAppBarState;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f120900a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p<l, Integer, h0> f120901b = z2.c.c(-1318334173, false, a.f120906c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p<l, Integer, h0> f120902c = z2.c.c(-1910988991, false, b.f120908c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p<l, Integer, h0> f120903d = z2.c.c(1657803754, false, C2587c.f120909c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static p<l, Integer, h0> f120904e = z2.c.c(-131451939, false, d.f120911c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p<l, Integer, h0> f120905f = z2.c.c(293892879, false, e.f120913c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f120906c = new a();

        /* JADX INFO: renamed from: w50.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
        static final class C2586a extends u implements wn0.l<y, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2586a f120907c = new C2586a();

            C2586a() {
                super(1);
            }

            public final void a(y semantics) {
                s.k(semantics, "$this$semantics");
                w.a(semantics, true);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
                a(yVar);
                return h0.f84049a;
            }
        }

        a() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1318334173, i11, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-1.<anonymous> (TopAppBar.kt:147)");
            }
            e1.b(l2.a.a(j2.b.a.f82426a), "Back icon", g4.o.d(s2.a(androidx.compose.ui.d.INSTANCE, "top-app-bar-back-button"), false, C2586a.f120907c, 1, null), p026y50.d.f125064a.a(lVar, 6).getIconDefault(), lVar, 48, 0);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f120908c = new b();

        b() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1910988991, i11, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-2.<anonymous> (TopAppBar.kt:172)");
            }
            e1.b(l2.d.a(j2.b.a.f82426a), "Close icon", null, p026y50.d.f125064a.a(lVar, 6).getIconDefault(), lVar, 48, 4);
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

    public final p<l, Integer, h0> a() {
        return f120901b;
    }

    public final p<l, Integer, h0> b() {
        return f120902c;
    }

    /* JADX INFO: renamed from: w50.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C2587c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2587c f120909c = new C2587c();

        C2587c() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1657803754, i11, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-3.<anonymous> (TopAppBar.kt:239)");
            }
            o.c(new TopAppBarState(false, false, false, null, false, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), a.f120910c, lVar, 56);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: w50.c$c$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f120910c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }

            public final void b() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f120911c = new d();

        d() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-131451939, i11, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-4.<anonymous> (TopAppBar.kt:250)");
            }
            o.c(new TopAppBarState(false, false, false, h.LinkLight, false, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null), a.f120912c, lVar, 56);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f120912c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }

            public final void b() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f120913c = new e();

        e() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(293892879, i11, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-5.<anonymous> (TopAppBar.kt:264)");
            }
            o.c(new TopAppBarState(true, false, false, null, false, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), a.f120914c, lVar, 56);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f120914c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }

            public final void b() {
            }
        }
    }
}
