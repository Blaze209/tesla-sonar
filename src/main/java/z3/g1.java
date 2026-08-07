package z3;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p020r2.Function0;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u000e\u001a3\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function2;", "Lz3/i1;", "Lw4/b;", "Lz3/j0;", "measurePolicy", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;Lwn0/p;Lr2/l;II)V", "Lz3/h1;", "state", "b", "(Lz3/h1;Landroidx/compose/ui/d;Lwn0/p;Lr2/l;II)V", "z3/g1$a", "Lz3/g1$a;", "ReusedSlotId", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f126726a = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"z3/g1$a", "", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f126727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.p<i1, w4.b, j0> f126728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f126729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f126730f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.d dVar, wn0.p<? super i1, ? super w4.b, ? extends j0> pVar, int i11, int i12) {
            super(2);
            this.f126727c = dVar;
            this.f126728d = pVar;
            this.f126729e = i11;
            this.f126730f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            g1.a(this.f126727c, this.f126728d, lVar, k2.a(this.f126729e | 1), this.f126730f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h1 f126731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h1 h1Var) {
            super(0);
            this.f126731c = h1Var;
        }

        public final void b() {
            this.f126731c.d();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h1 f126732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f126733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<i1, w4.b, j0> f126734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f126735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f126736g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h1 h1Var, androidx.compose.ui.d dVar, wn0.p<? super i1, ? super w4.b, ? extends j0> pVar, int i11, int i12) {
            super(2);
            this.f126732c = h1Var;
            this.f126733d = dVar;
            this.f126734e = pVar;
            this.f126735f = i11;
            this.f126736g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            g1.b(this.f126732c, this.f126733d, this.f126734e, lVar, k2.a(this.f126735f | 1), this.f126736g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, wn0.p<? super i1, ? super w4.b, ? extends j0> pVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        wn0.p<? super i1, ? super w4.b, ? extends j0> pVar2;
        p020r2.l lVarV = lVar.v(-1298353104);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
            pVar2 = pVar;
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            androidx.compose.ui.d dVar2 = dVar;
            if (p020r2.o.J()) {
                p020r2.o.S(-1298353104, i13, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            Object objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new h1();
                lVarV.B(objI);
            }
            pVar2 = pVar;
            b((h1) objI, dVar2, pVar2, lVarV, (i13 << 3) & 1008, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar = dVar2;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(dVar, pVar2, i11, i12));
        }
    }

    public static final void b(h1 h1Var, androidx.compose.ui.d dVar, wn0.p<? super i1, ? super w4.b, ? extends j0> pVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(-511989831);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(h1Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(dVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.K(pVar) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-511989831, i13, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.q qVarD = p020r2.j.d(lVarV, 0);
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVar);
            p020r2.x xVarC = lVarV.c();
            wn0.a<b4.g0> aVarA = b4.g0.INSTANCE.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, h1Var, h1Var.g());
            d4.b(lVarA, qVarD, h1Var.e());
            d4.b(lVarA, pVar, h1Var.f());
            b4.g.Companion companion = b4.g.INSTANCE;
            d4.b(lVarA, xVarC, companion.e());
            d4.b(lVarA, dVarE, companion.d());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            lVarV.g();
            if (lVarV.b()) {
                lVarV.o(-26502501);
                lVarV.l();
            } else {
                lVarV.o(-26580342);
                boolean zK = lVarV.K(h1Var);
                Object objI = lVarV.I();
                if (zK || objI == p020r2.l.INSTANCE.a()) {
                    objI = new c(h1Var);
                    lVarV.B(objI);
                }
                Function0.i((wn0.a) objI, lVarV, 0);
                lVarV.l();
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(h1Var, dVar2, pVar, i11, i12));
        }
    }
}
