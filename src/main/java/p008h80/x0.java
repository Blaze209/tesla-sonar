package p008h80;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import f90.n;
import jn0.h0;
import k3.p1;
import p009i2.j1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.FontWeight;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y2;
import v1.e0;
import v1.g0;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "text", "Ljn0/h0;", "a", "(Ljava/lang/String;Lr2/l;I)V", "Landroidx/compose/ui/d;", "modifier", "b", "(Landroidx/compose/ui/d;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class x0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f71685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f71686d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i11) {
            super(2);
            this.f71685c = str;
            this.f71686d = i11;
        }

        public final void a(l lVar, int i11) {
            x0.a(this.f71685c, lVar, k2.a(this.f71686d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f71687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f71688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71689e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, int i11, int i12) {
            super(2);
            this.f71687c = dVar;
            this.f71688d = i11;
            this.f71689e = i12;
        }

        public final void a(l lVar, int i11) {
            x0.b(this.f71687c, lVar, k2.a(this.f71688d | 1), this.f71689e);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(String text, l lVar, int i11) {
        int i12;
        l lVar2;
        s.k(text, "text");
        l lVarV = lVar.v(-1860183759);
        if ((i11 & 14) == 0) {
            i12 = i11 | (lVarV.n(text) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(-1860183759, i12, -1, "com.stripe.android.paymentsheet.ui.WalletsDivider (WalletsDivider.kt:21)");
            }
            c.InterfaceC1212c interfaceC1212cI = c.INSTANCE.i();
            d.Companion companion = d.INSTANCE;
            d dVarH = x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.H(693286680);
            i0 i0VarB = e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVarV, 48);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            g.Companion companion2 = g.INSTANCE;
            wn0.a<g> aVarA = companion2.a();
            q<y2<g>, l, Integer, h0> qVarA = a0.a(dVarH);
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
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            b(g0.c(h0Var, companion, 1.0f, false, 2, null), lVarV, 0, 0);
            j1 j1Var = j1.f74525a;
            int i13 = j1.f74526b;
            v2.b(text, t.k(companion, h.g(8), BitmapDescriptorFactory.HUE_RED, 2, null), n.n(j1Var, lVarV, i13).getSubtitle(), 0L, null, FontWeight.INSTANCE.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVarV, i13).getCaption(), lVarV, (i12 & 14) | 196656, 0, 65496);
            lVar2 = lVarV;
            b(g0.c(h0Var, companion, 1.0f, false, 2, null), lVar2, 0, 0);
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a(text, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d dVar, l lVar, int i11, int i12) {
        d dVar2;
        int i13;
        l lVarV = lVar.v(-256253185);
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
                o.S(-256253185, i13, -1, "com.stripe.android.paymentsheet.ui.WalletsDividerLine (WalletsDivider.kt:47)");
            }
            j1 j1Var = j1.f74525a;
            int i15 = j1.f74526b;
            androidx.compose.foundation.layout.g.a(x.h(x.i(androidx.compose.foundation.b.d(dVar3, n.s(j1Var.a(lVarV, i15).n()) ? p1.p(p1.INSTANCE.a(), 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : p1.p(p1.INSTANCE.k(), 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null), h.g(n.o(j1Var, lVarV, i15).getBorderStrokeWidth())), BitmapDescriptorFactory.HUE_RED, 1, null), lVarV, 0);
            if (o.J()) {
                o.R();
            }
            dVar2 = dVar3;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(dVar2, i11, i12));
        }
    }
}
