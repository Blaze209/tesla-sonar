package p008h80;

import e4.e;
import e4.i;
import f90.n;
import jn0.h0;
import n70.x;
import p009i2.e1;
import p009i2.j1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import v1.g0;
import wn0.p;
import wn0.q;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f71084a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p<l, Integer, h0> f71085b = c.c(-1448355750, false, a.f71087c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q<g0, l, Integer, h0> f71086c = c.c(72907088, false, b.f71088c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71087c = new a();

        a() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1448355750, i11, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$SepaMandateActivityKt.lambda-1.<anonymous> (SepaMandateActivity.kt:93)");
            }
            e1.a(e.c(n70.u.f93486r, lVar, 0), i.c(x.F, lVar, 0), null, n.n(j1.f74525a, lVar, j1.f74526b).getAppBarIcon(), lVar, 8, 4);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<g0, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f71088c = new b();

        b() {
            super(3);
        }

        public final void a(g0 Button, l lVar, int i11) {
            s.k(Button, "$this$Button");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(72907088, i11, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$SepaMandateActivityKt.lambda-2.<anonymous> (SepaMandateActivity.kt:123)");
            }
            v2.b(i.c(w80.n.f121526o, lVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
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

    public final p<l, Integer, h0> a() {
        return f71085b;
    }

    public final q<g0, l, Integer, h0> b() {
        return f71086c;
    }
}
