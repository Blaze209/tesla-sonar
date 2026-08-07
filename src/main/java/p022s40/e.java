package p022s40;

import e4.i;
import i40.k;
import jn0.h0;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import t4.j;
import v1.g0;
import wn0.q;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f109863a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<v1.e, l, Integer, h0> f109864b = c.c(-1577666082, false, a.f109866c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q<g0, l, Integer, h0> f109865c = c.c(1370667170, false, b.f109867c);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<v1.e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f109866c = new a();

        a() {
            super(3);
        }

        public final void a(v1.e StripeImage, l lVar, int i11) {
            s.k(StripeImage, "$this$StripeImage");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1577666082, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$SharedPartnerAuthKt.lambda-1.<anonymous> (SharedPartnerAuth.kt:383)");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<g0, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f109867c = new b();

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
                o.S(1370667170, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$SharedPartnerAuthKt.lambda-2.<anonymous> (SharedPartnerAuth.kt:398)");
            }
            v2.b(i.c(k.f75857d0, lVar, 0), null, 0L, 0L, null, null, null, 0L, null, j.h(j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 130558);
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

    public final q<v1.e, l, Integer, h0> a() {
        return f109864b;
    }

    public final q<g0, l, Integer, h0> b() {
        return f109865c;
    }
}
