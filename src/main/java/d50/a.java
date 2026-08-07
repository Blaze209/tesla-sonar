package d50;

import e4.i;
import i40.k;
import jn0.h0;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import v1.g0;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f59556a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<w1.c, l, Integer, h0> f59557b = z2.c.c(1685113889, false, C1215a.f59559c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q<g0, l, Integer, h0> f59558c = z2.c.c(-127816157, false, b.f59560c);

    /* JADX INFO: renamed from: d50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C1215a extends u implements q<w1.c, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1215a f59559c = new C1215a();

        C1215a() {
            super(3);
        }

        public final void a(w1.c item, l lVar, int i11) {
            s.k(item, "$this$item");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1685113889, i11, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.ComposableSingletons$NetworkingLinkLoginWarmupScreenKt.lambda-1.<anonymous> (NetworkingLinkLoginWarmupScreen.kt:80)");
            }
            d50.b.c(lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, l lVar, Integer num) {
            a(cVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<g0, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f59560c = new b();

        b() {
            super(3);
        }

        public final void a(g0 FinancialConnectionsButton, l lVar, int i11) {
            s.k(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-127816157, i11, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.ComposableSingletons$NetworkingLinkLoginWarmupScreenKt.lambda-2.<anonymous> (NetworkingLinkLoginWarmupScreen.kt:133)");
            }
            v2.b(i.c(k.U, lVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
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

    public final q<w1.c, l, Integer, h0> a() {
        return f59557b;
    }

    public final q<g0, l, Integer, h0> b() {
        return f59558c;
    }
}
