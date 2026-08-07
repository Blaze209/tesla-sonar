package p010i90;

import androidx.compose.foundation.layout.t;
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
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import p020r2.y3;
import r90.f;
import v1.b;
import v1.g;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e²\u0006\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Li90/a;", "controller", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Ljn0/h0;", "a", "(ZLi90/a;Ljava/util/Set;Li90/g0;Lr2/l;I)V", "", "Li90/j1;", "fields", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p010i90.a f76465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f76468g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, p010i90.a aVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11) {
            super(2);
            this.f76464c = z11;
            this.f76465d = aVar;
            this.f76466e = set;
            this.f76467f = identifierSpec;
            this.f76468g = i11;
        }

        public final void a(l lVar, int i11) {
            d.a(this.f76464c, this.f76465d, this.f76466e, this.f76467f, lVar, k2.a(this.f76468g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(boolean z11, p010i90.a controller, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, l lVar, int i11) {
        Set<IdentifierSpec> hiddenIdentifiers = set;
        s.k(controller, "controller");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        l lVarV = lVar.v(1383545451);
        if (o.J()) {
            o.S(1383545451, i11, -1, "com.stripe.android.uicore.elements.AddressElementUI (AddressElementUI.kt:22)");
        }
        List<j1> listB = b(f.a(controller.u(), lVarV, 8));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (!hiddenIdentifiers.contains(((j1) obj).getIdentifier())) {
                arrayList.add(obj);
            }
        }
        lVarV.H(-483455358);
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        i0 i0VarA = g.a(b.f117444a.g(), c.INSTANCE.k(), lVarV, 0);
        lVarV.H(-1323940314);
        int iA = j.a(lVarV, 0);
        x xVarC = lVarV.c();
        b4.g.Companion companion2 = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion2.a();
        q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(companion);
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
        d4.b(lVarA, i0VarA, companion2.c());
        d4.b(lVarA, xVarC, companion2.e());
        p<b4.g, Integer, h0> pVarB = companion2.b();
        if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.j jVar = v1.j.f117505a;
        lVarV.H(1145868076);
        int i12 = 0;
        for (Object obj2 : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                v.x();
            }
            l lVar2 = lVarV;
            k1.a(z11, (j1) obj2, null, hiddenIdentifiers, identifierSpec, 0, 0, lVar2, (i11 & 14) | 4096 | ((i11 << 3) & 57344), 100);
            lVar2.H(1145877083);
            if (i12 != v.o(arrayList)) {
                j1 j1Var = j1.f74525a;
                int i14 = j1.f74526b;
                p009i2.i0.a(t.k(androidx.compose.ui.d.INSTANCE, h.g(n.o(j1Var, lVar2, i14).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, 2, null), n.n(j1Var, lVar2, i14).getComponentDivider(), h.g(n.o(j1Var, lVar2, i14).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, lVar2, 0, 8);
                lVar2 = lVar2;
            }
            lVar2.T();
            hiddenIdentifiers = set;
            lVarV = lVar2;
            i12 = i13;
        }
        l lVar3 = lVarV;
        lVar3.T();
        lVar3.T();
        lVar3.g();
        lVar3.T();
        lVar3.T();
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, controller, set, identifierSpec, i11));
        }
    }

    private static final List<j1> b(y3<? extends List<? extends j1>> y3Var) {
        return (List) y3Var.getValue();
    }
}
