package p023w50;

import androidx.compose.foundation.j;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import q1.c0;
import u1.k;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aF\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lw50/g$a;", "Lw50/g;", "c", "(Lw50/g$a;)Lw50/g;", "Landroidx/compose/ui/d;", "", "enabled", "", "onClickLabel", "Lg4/i;", "role", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "a", "(Landroidx/compose/ui/d;ZLjava/lang/String;Lg4/i;Lwn0/a;)Landroidx/compose/ui/d;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<d, l, Integer, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f120928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f120929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g4.i f120930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f120931f;

        /* JADX INFO: renamed from: w50.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C2588a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g f120932c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f120933d;

            /* JADX INFO: renamed from: w50.i$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class C2589a extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.a<h0> f120934c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2589a(wn0.a<h0> aVar) {
                    super(0);
                    this.f120934c = aVar;
                }

                public final void b() {
                    this.f120934c.invoke();
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2588a(g gVar, wn0.a<h0> aVar) {
                super(0);
                this.f120932c = gVar;
                this.f120933d = aVar;
            }

            public final void b() {
                this.f120932c.a(new C2589a(this.f120933d));
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, String str, g4.i iVar, wn0.a<h0> aVar) {
            super(3);
            this.f120928c = z11;
            this.f120929d = str;
            this.f120930e = iVar;
            this.f120931f = aVar;
        }

        public final d a(d composed, l lVar, int i11) {
            s.k(composed, "$this$composed");
            lVar.H(-1610772522);
            if (o.J()) {
                o.S(-1610772522, i11, -1, "com.stripe.android.financialconnections.ui.components.clickableSingle.<anonymous> (MultipleEventsCutter.kt:61)");
            }
            lVar.H(-102827773);
            Object objI = lVar.I();
            l.Companion companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = i.c(g.INSTANCE);
                lVar.B(objI);
            }
            g gVar = (g) objI;
            lVar.T();
            d.Companion companion2 = d.INSTANCE;
            lVar.H(-102824573);
            Object objI2 = lVar.I();
            if (objI2 == companion.a()) {
                objI2 = k.a();
                lVar.B(objI2);
            }
            lVar.T();
            d dVarA = androidx.compose.foundation.d.a(companion2, (u1.l) objI2, (c0) lVar.U(j.a()), this.f120928c, this.f120929d, this.f120930e, new C2588a(gVar, this.f120931f));
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return dVarA;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ d invoke(d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 9, 0})
    public static final class b extends u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f120935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f120936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g4.i f120937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a f120938f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z11, String str, g4.i iVar, wn0.a aVar) {
            super(1);
            this.f120935c = z11;
            this.f120936d = str;
            this.f120937e = iVar;
            this.f120938f = aVar;
        }

        public final void a(q1 q1Var) {
            s.k(q1Var, "$this$null");
            q1Var.b("clickable");
            q1Var.getProperties().a("enabled", Boolean.valueOf(this.f120935c));
            q1Var.getProperties().a("onClickLabel", this.f120936d);
            q1Var.getProperties().a("role", this.f120937e);
            q1Var.getProperties().a("onClick", this.f120938f);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    public static final d a(d clickableSingle, boolean z11, String str, g4.i iVar, wn0.a<h0> onClick) {
        s.k(clickableSingle, "$this$clickableSingle");
        s.k(onClick, "onClick");
        return c.b(clickableSingle, o1.b() ? new b(z11, str, iVar, onClick) : o1.a(), new a(z11, str, iVar, onClick));
    }

    public static /* synthetic */ d b(d dVar, boolean z11, String str, g4.i iVar, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            iVar = null;
        }
        return a(dVar, z11, str, iVar, aVar);
    }

    public static final g c(g.Companion companion) {
        s.k(companion, "<this>");
        return new h();
    }
}
