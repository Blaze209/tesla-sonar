package p024x1;

import a3.d;
import a3.f;
import a3.g;
import a3.i;
import a3.j;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.u;
import p020r2.h2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import wn0.p;
import wn0.q;

/* JADX INFO: renamed from: x1.h0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "La3/d;", "Ljn0/h0;", "content", "a", "(Lwn0/q;Lr2/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: x1.h0$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f122605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q<d, l, Integer, h0> f122606d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g0 g0Var, q<? super d, ? super l, ? super Integer, h0> qVar) {
            super(2);
            this.f122605c = g0Var;
            this.f122606d = qVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1863926504, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f122605c.i(f.a(lVar, 0));
            this.f122606d.invoke(this.f122605c, lVar, 0);
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

    /* JADX INFO: renamed from: x1.h0$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<d, l, Integer, h0> f122607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f122608d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super d, ? super l, ? super Integer, h0> qVar, int i11) {
            super(2);
            this.f122607c = qVar;
            this.f122608d = i11;
        }

        public final void a(l lVar, int i11) {
            Function1.a(this.f122607c, lVar, k2.a(this.f122608d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: x1.h0$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx1/g0;", "b", "()Lx1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<g0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f122609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.f122609c = gVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g0 invoke() {
            return new g0(this.f122609c, v0.i());
        }
    }

    public static final void a(q<? super d, ? super l, ? super Integer, h0> qVar, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(674185128);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(674185128, i12, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            g gVar = (g) lVarV.U(i.d());
            Object[] objArr = {gVar};
            j<g0, Map<String, List<Object>>> jVarA = g0.INSTANCE.a(gVar);
            boolean zK = lVarV.K(gVar);
            Object objI = lVarV.I();
            if (zK || objI == l.INSTANCE.a()) {
                objI = new c(gVar);
                lVarV.B(objI);
            }
            g0 g0Var = (g0) a3.b.c(objArr, jVarA, null, (wn0.a) objI, lVarV, 0, 4);
            w.a(i.d().d(g0Var), z2.c.e(1863926504, true, new a(g0Var, qVar), lVarV, 54), lVarV, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(qVar, i11));
        }
    }
}
