package p023w50;

import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import ezvcard.property.Gender;
import jn0.h0;
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
import w4.i;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;Lr2/l;II)V", "Lw4/k;", "J", "DragHandleSize", "Lw4/h;", "b", Gender.FEMALE, "DragHandleCornerRadius", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f120915a = i.b(h.g(32), h.g(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f120916b = h.g(40);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f120917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f120918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f120919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f120917c = dVar;
            this.f120918d = i11;
            this.f120919e = i12;
        }

        public final void a(l lVar, int i11) {
            d.a(this.f120917c, lVar, k2.a(this.f120918d | 1), this.f120919e);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, l lVar, int i11, int i12) {
        int i13;
        l lVarV = lVar.v(981530032);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (o.J()) {
                o.S(981530032, i13, -1, "com.stripe.android.financialconnections.ui.components.DragHandle (DragHandle.kt:20)");
            }
            c cVarE = c.INSTANCE.e();
            androidx.compose.ui.d dVarH = x.h(dVar, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.H(733328855);
            i0 i0VarJ = g.j(cVarE, false, lVarV, 6);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarH);
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
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            g.a(b.c(x.r(androidx.compose.ui.d.INSTANCE, f120915a), p026y50.d.f125064a.a(lVarV, 6).getBorder(), a2.g.c(f120916b)), lVarV, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar, i11, i12));
        }
    }
}
