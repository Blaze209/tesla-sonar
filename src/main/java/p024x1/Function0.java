package p024x1;

import a3.d;
import androidx.compose.foundation.lazy.layout.e;
import androidx.compose.foundation.lazy.layout.h;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k0;
import p020r2.k2;
import p020r2.l;
import p020r2.l0;
import p020r2.n3;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import wn0.p;
import wn0.q;
import z2.c;
import z3.g1;
import z3.h1;
import z3.i1;
import z3.j0;

/* JADX INFO: renamed from: x1.w, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/Function0;", "Lx1/t;", "itemProvider", "Landroidx/compose/ui/d;", "modifier", "Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lkotlin/Function2;", "Lx1/x;", "Lw4/b;", "Lz3/j0;", "measurePolicy", "Ljn0/h0;", "a", "(Lwn0/a;Landroidx/compose/ui/d;Landroidx/compose/foundation/lazy/layout/d;Lwn0/p;Lr2/l;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: x1.w$a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La3/d;", "saveableStateHolder", "Ljn0/h0;", "a", "(La3/d;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<d, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f122669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f122670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<x, w4.b, j0> f122671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y3<wn0.a<t>> f122672f;

        /* JADX INFO: renamed from: x1.w$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
        static final class C2641a extends u implements wn0.l<l0, k0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.d f122673c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ r f122674d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ h1 f122675e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q0 f122676f;

            /* JADX INFO: renamed from: x1.w$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"x1/w$a$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class C2642a implements k0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.lazy.layout.d f122677a;

                public C2642a(androidx.compose.foundation.lazy.layout.d dVar) {
                    this.f122677a = dVar;
                }

                @Override // p020r2.k0
                public void dispose() {
                    this.f122677a.f(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2641a(androidx.compose.foundation.lazy.layout.d dVar, r rVar, h1 h1Var, q0 q0Var) {
                super(1);
                this.f122673c = dVar;
                this.f122674d = rVar;
                this.f122675e = h1Var;
                this.f122676f = q0Var;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k0 invoke(l0 l0Var) {
                this.f122673c.f(new h(this.f122674d, this.f122675e, this.f122676f));
                return new C2642a(this.f122673c);
            }
        }

        /* JADX INFO: renamed from: x1.w$a$b */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/i1;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/i1;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements p<i1, w4.b, j0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ r f122678c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p<x, w4.b, j0> f122679d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(r rVar, p<? super x, ? super w4.b, ? extends j0> pVar) {
                super(2);
                this.f122678c = rVar;
                this.f122679d = pVar;
            }

            public final j0 a(i1 i1Var, long j11) {
                return this.f122679d.invoke(new y(this.f122678c, i1Var), w4.b.a(j11));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ j0 invoke(i1 i1Var, w4.b bVar) {
                return a(i1Var, bVar.getValue());
            }
        }

        /* JADX INFO: renamed from: x1.w$a$c */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx1/t;", "b", "()Lx1/t;"}, k = 3, mv = {1, 8, 0})
        static final class c extends u implements wn0.a<t> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<wn0.a<t>> f122680c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(y3<? extends wn0.a<? extends t>> y3Var) {
                super(0);
                this.f122680c = y3Var;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t invoke() {
                return this.f122680c.getValue().invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.lazy.layout.d dVar, androidx.compose.ui.d dVar2, p<? super x, ? super w4.b, ? extends j0> pVar, y3<? extends wn0.a<? extends t>> y3Var) {
            super(3);
            this.f122669c = dVar;
            this.f122670d = dVar2;
            this.f122671e = pVar;
            this.f122672f = y3Var;
        }

        public final void a(d dVar, l lVar, int i11) {
            if (o.J()) {
                o.S(-1488997347, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
            }
            y3<wn0.a<t>> y3Var = this.f122672f;
            Object objI = lVar.I();
            l.Companion companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = new r(dVar, new c(y3Var));
                lVar.B(objI);
            }
            r rVar = (r) objI;
            Object objI2 = lVar.I();
            if (objI2 == companion.a()) {
                objI2 = new h1(new v(rVar));
                lVar.B(objI2);
            }
            h1 h1Var = (h1) objI2;
            if (this.f122669c != null) {
                lVar.o(205264983);
                q0 prefetchScheduler = this.f122669c.getPrefetchScheduler();
                if (prefetchScheduler == null) {
                    lVar.o(6622915);
                    prefetchScheduler = r0.a(lVar, 0);
                } else {
                    lVar.o(6621830);
                }
                lVar.l();
                Object obj = this.f122669c;
                Object[] objArr = {obj, rVar, h1Var, prefetchScheduler};
                boolean zN = lVar.n(obj) | lVar.K(rVar) | lVar.K(h1Var) | lVar.K(prefetchScheduler);
                androidx.compose.foundation.lazy.layout.d dVar2 = this.f122669c;
                Object objI3 = lVar.I();
                if (zN || objI3 == companion.a()) {
                    objI3 = new C2641a(dVar2, rVar, h1Var, prefetchScheduler);
                    lVar.B(objI3);
                }
                p020r2.Function0.d(objArr, (wn0.l) objI3, lVar, 0);
                lVar.l();
            } else {
                lVar.o(205858881);
                lVar.l();
            }
            androidx.compose.ui.d dVarB = e.b(this.f122670d, this.f122669c);
            boolean zN2 = lVar.n(rVar) | lVar.n(this.f122671e);
            p<x, w4.b, j0> pVar = this.f122671e;
            Object objI4 = lVar.I();
            if (zN2 || objI4 == companion.a()) {
                objI4 = new b(rVar, pVar);
                lVar.B(objI4);
            }
            g1.b(h1Var, dVarB, (p) objI4, lVar, h1.f126744f, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(d dVar, l lVar, Integer num) {
            a(dVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: x1.w$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<t> f122681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f122682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f122683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<x, w4.b, j0> f122684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f122685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f122686h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.a<? extends t> aVar, androidx.compose.ui.d dVar, androidx.compose.foundation.lazy.layout.d dVar2, p<? super x, ? super w4.b, ? extends j0> pVar, int i11, int i12) {
            super(2);
            this.f122681c = aVar;
            this.f122682d = dVar;
            this.f122683e = dVar2;
            this.f122684f = pVar;
            this.f122685g = i11;
            this.f122686h = i12;
        }

        public final void a(l lVar, int i11) {
            Function0.a(this.f122681c, this.f122682d, this.f122683e, this.f122684f, lVar, k2.a(this.f122685g | 1), this.f122686h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(wn0.a<? extends t> aVar, androidx.compose.ui.d dVar, androidx.compose.foundation.lazy.layout.d dVar2, p<? super x, ? super w4.b, ? extends j0> pVar, l lVar, int i11, int i12) {
        int i13;
        l lVarV = lVar.v(2002163445);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(dVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(dVar2) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(pVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (i15 != 0) {
                dVar2 = null;
            }
            if (o.J()) {
                o.S(2002163445, i13, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            Function1.a(c.e(-1488997347, true, new a(dVar2, dVar, pVar, n3.o(aVar, lVarV, i13 & 14)), lVarV, 54), lVarV, 6);
            if (o.J()) {
                o.R();
            }
        }
        androidx.compose.ui.d dVar3 = dVar;
        androidx.compose.foundation.lazy.layout.d dVar4 = dVar2;
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(aVar, dVar3, dVar4, pVar, i11, i12));
        }
    }
}
