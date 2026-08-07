package p010i90;

import android.content.res.Resources;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.e;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import f90.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y2;
import v1.e0;
import v1.g0;
import w4.h;
import w4.r;
import wn0.l;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "enabled", "Li90/z0;", "controller", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Ljn0/h0;", "a", "(ZLi90/z0;Ljava/util/Set;Li90/g0;Lr2/l;I)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b1 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/r;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<r, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<h> f76325c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p1<h> p1Var) {
            super(1);
            this.f76325c = p1Var;
        }

        public final void a(long j11) {
            this.f76325c.setValue(h.d(h.g(r.f(j11) / Resources.getSystem().getDisplayMetrics().density)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(r rVar) {
            a(rVar.getPackedValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z0 f76327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f76330g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, z0 z0Var, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11) {
            super(2);
            this.f76326c = z11;
            this.f76327d = z0Var;
            this.f76328e = set;
            this.f76329f = identifierSpec;
            this.f76330g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b1.a(this.f76326c, this.f76327d, this.f76328e, this.f76329f, lVar, k2.a(this.f76330g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(boolean z11, z0 controller, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, p020r2.l lVar, int i11) {
        Set<IdentifierSpec> hiddenIdentifiers = set;
        int i12 = i11;
        s.k(controller, "controller");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        p020r2.l lVarV = lVar.v(652994833);
        if (o.J()) {
            o.S(652994833, i12, -1, "com.stripe.android.uicore.elements.RowElementUI (RowElementUI.kt:27)");
        }
        List<n1> listU = controller.u();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            if (!hiddenIdentifiers.contains(((n1) obj).getIdentifier())) {
                arrayList.add(obj);
            }
        }
        lVarV.H(1628104230);
        Object objI = lVarV.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = s3.d(h.d(h.g(0)), null, 2, null);
            lVarV.B(objI);
        }
        p1 p1Var = (p1) objI;
        lVarV.T();
        if (!arrayList.isEmpty()) {
            d dVarH = x.h(d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.H(693286680);
            i0 i0VarB = e0.b(v1.b.f117444a.f(), c.INSTANCE.l(), lVarV, 0);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            g.Companion companion = g.INSTANCE;
            wn0.a<g> aVarA = companion.a();
            q<y2<g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarH);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            lVarV.H(985624882);
            int i13 = 0;
            for (Object obj2 : arrayList) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    v.x();
                }
                n1 n1Var = (n1) obj2;
                int iA2 = i13 == v.o(arrayList) ? androidx.compose.ui.focus.d.INSTANCE.a() : androidx.compose.ui.focus.d.INSTANCE.g();
                int iH = i13 == 0 ? androidx.compose.ui.focus.d.INSTANCE.h() : androidx.compose.ui.focus.d.INSTANCE.d();
                d.Companion companion2 = d.INSTANCE;
                d dVarC = g0.c(h0Var, companion2, 1.0f / arrayList.size(), false, 2, null);
                lVarV.H(-1578013810);
                Object objI2 = lVarV.I();
                if (objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new a(p1Var);
                    lVarV.B(objI2);
                }
                lVarV.T();
                d dVarA = e.a(dVarC, (l) objI2);
                int i15 = ((i12 << 3) & 57344) | (i12 & 14) | 4096;
                int i16 = i13;
                p020r2.l lVar2 = lVarV;
                k1.a(z11, n1Var, dVarA, hiddenIdentifiers, identifierSpec, iA2, iH, lVar2, i15, 0);
                lVarV = lVar2;
                lVarV.H(985660022);
                if (i16 != v.o(arrayList)) {
                    d dVarI = x.i(companion2, ((h) p1Var.getValue()).getValue());
                    j1 j1Var = j1.f74525a;
                    int i17 = j1.f74526b;
                    p009i2.i0.a(x.v(dVarI, h.g(n.o(j1Var, lVarV, i17).getBorderStrokeWidth())), n.n(j1Var, lVarV, i17).getComponentDivider(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 0, 12);
                }
                lVarV.T();
                hiddenIdentifiers = set;
                i12 = i11;
                i13 = i14;
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
        }
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, controller, set, identifierSpec, i11));
        }
    }
}
