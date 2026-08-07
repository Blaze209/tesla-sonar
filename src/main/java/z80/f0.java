package z80;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Set;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "enabled", "Lz80/c0;", "controller", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Ljn0/h0;", "a", "(ZLz80/c0;Ljava/util/Set;Li90/g0;Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f127453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f127454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f127455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f127456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f127457g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, c0 c0Var, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11) {
            super(2);
            this.f127453c = z11;
            this.f127454d = c0Var;
            this.f127455e = set;
            this.f127456f = identifierSpec;
            this.f127457g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f0.a(this.f127453c, this.f127454d, this.f127455e, this.f127456f, lVar, p020r2.k2.a(this.f127457g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(boolean z11, c0 controller, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(controller, "controller");
        Set<IdentifierSpec> hiddenIdentifiers = set;
        p013kotlin.jvm.internal.s.k(hiddenIdentifiers, "hiddenIdentifiers");
        p020r2.l lVarV = lVar.v(-1519035641);
        if (p020r2.o.J()) {
            p020r2.o.S(-1519035641, i11, -1, "com.stripe.android.ui.core.elements.CardDetailsElementUI (CardDetailsElementUI.kt:20)");
        }
        int i12 = 0;
        for (Object obj : controller.w()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                p013kotlin.collections.v.x();
            }
            p010i90.j1 j1Var = (p010i90.j1) obj;
            p020r2.l lVar2 = lVarV;
            p010i90.k1.a(z11, j1Var, null, hiddenIdentifiers, identifierSpec, p013kotlin.jvm.internal.s.f(j1Var.getIdentifier(), IdentifierSpec.INSTANCE.j()) ? androidx.compose.ui.focus.d.INSTANCE.e() : androidx.compose.ui.focus.d.INSTANCE.a(), 0, lVar2, (i11 & 14) | 4160 | (IdentifierSpec.f76539d << 12) | ((i11 << 3) & 57344), 68);
            lVarV = lVar2;
            lVarV.H(1631013063);
            if (i12 != p013kotlin.collections.v.o(controller.w())) {
                p009i2.j1 j1Var2 = p009i2.j1.f74525a;
                int i14 = p009i2.j1.f74526b;
                p009i2.i0.a(androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, w4.h.g(f90.n.o(j1Var2, lVarV, i14).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, 2, null), f90.n.n(j1Var2, lVarV, i14).getComponentDivider(), w4.h.g(f90.n.o(j1Var2, lVarV, i14).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, lVarV, 0, 8);
            }
            lVarV.T();
            hiddenIdentifiers = set;
            i12 = i13;
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, controller, set, identifierSpec, i11));
        }
    }
}
