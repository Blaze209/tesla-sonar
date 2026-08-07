package v1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p020r2.k2;
import p020r2.w2;
import z3.g1;
import z3.i1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Ld3/c;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Lv1/e;", "Ljn0/h0;", "content", "a", "(Landroidx/compose/ui/d;Ld3/c;ZLwn0/q;Lr2/l;II)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/i1;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/i1;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<i1, w4.b, z3.j0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z3.i0 f117471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.q<e, p020r2.l, Integer, jn0.h0> f117472d;

        /* JADX INFO: renamed from: v1.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C2523a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.q<e, p020r2.l, Integer, jn0.h0> f117473c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BoxWithConstraintsScopeImpl f117474d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2523a(wn0.q<? super e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl) {
                super(2);
                this.f117473c = qVar;
                this.f117474d = boxWithConstraintsScopeImpl;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1945019079, i11, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f117473c.invoke(this.f117474d, lVar, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z3.i0 i0Var, wn0.q<? super e, ? super p020r2.l, ? super Integer, jn0.h0> qVar) {
            super(2);
            this.f117471c = i0Var;
            this.f117472d = qVar;
        }

        public final z3.j0 a(i1 i1Var, long j11) {
            return this.f117471c.c(i1Var, i1Var.c1(jn0.h0.f84049a, z2.c.c(-1945019079, true, new C2523a(this.f117472d, new BoxWithConstraintsScopeImpl(i1Var, j11, null)))), j11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ z3.j0 invoke(i1 i1Var, w4.b bVar) {
            return a(i1Var, bVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f117475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d3.c f117476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f117477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.q<e, p020r2.l, Integer, jn0.h0> f117478f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f117479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f117480h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.d dVar, d3.c cVar, boolean z11, wn0.q<? super e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, int i11, int i12) {
            super(2);
            this.f117475c = dVar;
            this.f117476d = cVar;
            this.f117477e = z11;
            this.f117478f = qVar;
            this.f117479g = i11;
            this.f117480h = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.a(this.f117475c, this.f117476d, this.f117477e, this.f117478f, lVar, k2.a(this.f117479g | 1), this.f117480h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, d3.c cVar, boolean z11, wn0.q<? super e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(1781813501);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(cVar) ? 32 : 16;
        }
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.p(z11) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(qVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (i15 != 0) {
                cVar = d3.c.INSTANCE.o();
            }
            if (i16 != 0) {
                z11 = false;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1781813501, i13, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(cVar, z11);
            boolean zN = ((i13 & 7168) == 2048) | lVarV.n(i0VarH);
            Object objI = lVarV.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(i0VarH, qVar);
                lVarV.B(objI);
            }
            g1.a(dVar, (wn0.p) objI, lVarV, i13 & 14, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        d3.c cVar2 = cVar;
        boolean z12 = z11;
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(dVar2, cVar2, z12, qVar, i11, i12));
        }
    }
}
