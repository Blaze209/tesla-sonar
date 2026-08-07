package z80;

import android.content.Intent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.stripecardscan.cardscan.exception.UnknownScanException;
import java.util.Set;
import p010i90.IdentifierSpec;
import p010i90.SectionElement;
import p013kotlin.Metadata;
import p020r2.d4;
import p020r2.w2;
import p020r2.y2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "enabled", "Lz80/g0;", "controller", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Ljn0/h0;", "a", "(ZLz80/g0;Ljava/util/Set;Li90/g0;Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<g4.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127545c = new a();

        a() {
            super(1);
        }

        public final void a(g4.y semantics) {
            p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
            g4.v.v(semantics);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g4.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Intent;", "it", "Ljn0/h0;", "a", "(Landroid/content/Intent;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Intent, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f127546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g0 g0Var) {
            super(1);
            this.f127546c = g0Var;
        }

        public final void a(Intent it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            k0 k0VarI = this.f127546c.getCardDetailsElement().getController().getNumberElement().i();
            CardScanSheetResult cardScanSheetResult = (CardScanSheetResult) it.getParcelableExtra("CardScanActivityResult");
            if (cardScanSheetResult == null) {
                cardScanSheetResult = (CardScanSheetResult) new CardScanSheetResult.Failed(new UnknownScanException("No data in the result intent"));
            }
            k0VarI.x(cardScanSheetResult);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Intent intent) {
            a(intent);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f127547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f127548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f127549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f127550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f127551g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, g0 g0Var, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11) {
            super(2);
            this.f127547c = z11;
            this.f127548d = g0Var;
            this.f127549e = set;
            this.f127550f = identifierSpec;
            this.f127551g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            i0.a(this.f127547c, this.f127548d, this.f127549e, this.f127550f, lVar, p020r2.k2.a(this.f127551g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(boolean z11, g0 controller, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(controller, "controller");
        p013kotlin.jvm.internal.s.k(hiddenIdentifiers, "hiddenIdentifiers");
        p020r2.l lVarV = lVar.v(-314260694);
        if (p020r2.o.J()) {
            p020r2.o.S(-314260694, i11, -1, "com.stripe.android.ui.core.elements.CardDetailsSectionElementUI (CardDetailsSectionElementUI.kt:29)");
        }
        v1.b.f fVarD = v1.b.f117444a.d();
        d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
        lVarV.H(693286680);
        z3.i0 i0VarB = v1.e0.b(fVarD, interfaceC1212cI, lVarV, 54);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion2 = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion2.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarH);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarB, companion2.c());
        d4.b(lVarA, xVarC, companion2.e());
        wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
        if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.h0 h0Var = v1.h0.f117504a;
        p010i90.f0.a(e4.i.c(w80.n.I, lVarV, 0), g4.o.c(companion, true, a.f127545c), lVarV, 0, 0);
        lVarV.H(-1089014030);
        if (controller.getIsCardScanEnabled() && controller.getIsStripeCardScanAvailable().invoke()) {
            d2.a(z11, new b(controller), lVarV, i11 & 14);
        }
        lVarV.T();
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        p010i90.h1.a(z11, new SectionElement(IdentifierSpec.INSTANCE.a("credit_details"), p013kotlin.collections.v.e(controller.getCardDetailsElement()), new p010i90.f1(null, p013kotlin.collections.v.e(controller.getCardDetailsElement().getController()))), hiddenIdentifiers, identifierSpec, 0, 0, lVarV, (i11 & 14) | 512 | (SectionElement.f76567g << 3) | (IdentifierSpec.f76539d << 9) | (i11 & 7168), 48);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(z11, controller, hiddenIdentifiers, identifierSpec, i11));
        }
    }
}
