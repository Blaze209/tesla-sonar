package p008h80;

import a2.g;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import d3.c;
import f90.n;
import h3.e;
import jn0.h0;
import k3.p1;
import p009i2.e1;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y2;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class v0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f71626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f71627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71628e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, int i11, int i12) {
            super(2);
            this.f71626c = dVar;
            this.f71627d = i11;
            this.f71628e = i12;
        }

        public final void a(l lVar, int i11) {
            v0.a(this.f71626c, lVar, k2.a(this.f71627d | 1), this.f71628e);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(d dVar, l lVar, int i11, int i12) {
        d dVar2;
        int i13;
        l lVarV = lVar.v(949852527);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            d dVar3 = i14 != 0 ? d.INSTANCE : dVar2;
            if (o.J()) {
                o.S(949852527, i13, -1, "com.stripe.android.paymentsheet.ui.SelectedBadge (SelectedBadge.kt:21)");
            }
            j1 j1Var = j1.f74525a;
            int i15 = j1.f74526b;
            long jA = n.s(j1Var.a(lVarV, i15).j()) ? p1.INSTANCE.a() : p1.INSTANCE.k();
            c cVarE = c.INSTANCE.e();
            d dVarD = b.d(x.q(e.a(dVar3, g.f()), h.g(24)), j1Var.a(lVarV, i15).j(), null, 2, null);
            lVarV.H(733328855);
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarE, false, lVarV, 6);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarD);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            i iVar = i.f4585a;
            e1.a(e4.e.c(n70.u.f93494z, lVarV, 0), null, x.q(d.INSTANCE, h.g(12)), jA, lVarV, 440, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            dVar2 = dVar3;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar2, i11, i12));
        }
    }
}
