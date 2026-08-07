package b50;

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
    public static final a f16545a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<g0, l, Integer, h0> f16546b = z2.c.c(-1128705666, false, C0324a.f16547c);

    /* JADX INFO: renamed from: b50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C0324a extends u implements q<g0, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0324a f16547c = new C0324a();

        C0324a() {
            super(3);
        }

        public final void a(g0 FinancialConnectionsButton, l lVar, int i11) {
            s.k(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1128705666, i11, -1, "com.stripe.android.financialconnections.features.manualentry.ComposableSingletons$ManualEntryScreenKt.lambda-1.<anonymous> (ManualEntryScreen.kt:271)");
            }
            v2.b(e4.i.c(k.O, lVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
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

    public final q<g0, l, Integer, h0> a() {
        return f16546b;
    }
}
