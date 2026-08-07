package z3;

import p013kotlin.Metadata;
import p020r2.d4;
import p020r2.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lr2/y2;", "Lb4/g;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;)Lwn0/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr2/y2;", "Lb4/g;", "Ljn0/h0;", "a", "(Lr2/l;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f126640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar) {
            super(3);
            this.f126640c = dVar;
        }

        public final void a(p020r2.l lVar, p020r2.l lVar2, int i11) {
            if (p020r2.o.J()) {
                p020r2.o.S(-1586257396, i11, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:205)");
            }
            int iA = p020r2.j.a(lVar2, 0);
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar2, this.f126640c);
            lVar.H(509942095);
            p020r2.l lVarA = d4.a(lVar);
            b4.g.Companion companion = b4.g.INSTANCE;
            d4.b(lVarA, dVarE, companion.d());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ jn0.h0 invoke(y2<b4.g> y2Var, p020r2.l lVar, Integer num) {
            a(y2Var.getComposer(), lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> a(androidx.compose.ui.d dVar) {
        return z2.c.c(-1586257396, true, new a(dVar));
    }
}
