package w80;

import androidx.compose.foundation.layout.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.flow.StateFlow;
import p010i90.IdentifierSpec;
import p010i90.OTPElement;
import p010i90.SectionElement;
import p010i90.d0;
import p010i90.h1;
import p010i90.o0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import wn0.q;
import z3.a0;
import z3.i0;
import z80.AffirmHeaderElement;
import z80.AfterpayClearpayHeaderElement;
import z80.AuBecsDebitMandateTextElement;
import z80.EmptyFormElement;
import z80.MandateTextElement;
import z80.SaveForFutureUseElement;
import z80.StaticTextElement;
import z80.c2;
import z80.m2;
import z80.u1;
import z80.w;
import z80.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a_\u0010\r\u001a\u00020\f2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00002\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00002\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u0013\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lkotlinx/coroutines/flow/StateFlow;", "", "Li90/g0;", "hiddenIdentifiersFlow", "", "enabledFlow", "", "Li90/d0;", "elementsFlow", "lastTextFieldIdentifierFlow", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "b", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/d;Lr2/l;II)V", "hiddenIdentifiers", "enabled", "elements", "lastTextFieldIdentifier", "a", "(Ljava/util/Set;ZLjava/util/List;Li90/g0;Landroidx/compose/ui/d;Lr2/l;II)V", "element", "g", "(Li90/d0;ZLjava/util/Set;Li90/g0;Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StateFlow<Set<IdentifierSpec>> f121451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<Boolean> f121452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StateFlow<List<d0>> f121453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ StateFlow<IdentifierSpec> f121454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f121455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f121456h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f121457i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(StateFlow<? extends Set<IdentifierSpec>> stateFlow, StateFlow<Boolean> stateFlow2, StateFlow<? extends List<? extends d0>> stateFlow3, StateFlow<IdentifierSpec> stateFlow4, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f121451c = stateFlow;
            this.f121452d = stateFlow2;
            this.f121453e = stateFlow3;
            this.f121454f = stateFlow4;
            this.f121455g = dVar;
            this.f121456h = i11;
            this.f121457i = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.b(this.f121451c, this.f121452d, this.f121453e, this.f121454f, this.f121455g, lVar, k2.a(this.f121456h | 1), this.f121457i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f121458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f121459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<d0> f121460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f121461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f121462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f121463h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f121464i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Set<IdentifierSpec> set, boolean z11, List<? extends d0> list, IdentifierSpec identifierSpec, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f121458c = set;
            this.f121459d = z11;
            this.f121460e = list;
            this.f121461f = identifierSpec;
            this.f121462g = dVar;
            this.f121463h = i11;
            this.f121464i = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.a(this.f121458c, this.f121459d, this.f121460e, this.f121461f, this.f121462g, lVar, k2.a(this.f121463h | 1), this.f121464i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0 f121465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f121466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f121467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f121468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f121469g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d0 d0Var, boolean z11, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11) {
            super(2);
            this.f121465c = d0Var;
            this.f121466d = z11;
            this.f121467e = set;
            this.f121468f = identifierSpec;
            this.f121469g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.g(this.f121465c, this.f121466d, this.f121467e, this.f121468f, lVar, k2.a(this.f121469g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(Set<IdentifierSpec> hiddenIdentifiers, boolean z11, List<? extends d0> elements, IdentifierSpec identifierSpec, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        s.k(elements, "elements");
        p020r2.l lVarV = lVar.v(1527302195);
        androidx.compose.ui.d dVar2 = (i12 & 16) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(1527302195, i11, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:68)");
        }
        androidx.compose.ui.d dVarG = x.g(dVar2, 1.0f);
        lVarV.H(-483455358);
        int i13 = 0;
        i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion.a();
        q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarG);
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
        d4.b(lVarA, i0VarA, companion.c());
        d4.b(lVarA, xVarC, companion.e());
        wn0.p<b4.g, Integer, h0> pVarB = companion.b();
        if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.j jVar = v1.j.f117505a;
        lVarV.H(-1230466951);
        for (Object obj : elements) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                v.x();
            }
            d0 d0Var = (d0) obj;
            lVarV.H(-1230465628);
            if (!hiddenIdentifiers.contains(d0Var.getIdentifier())) {
                g(d0Var, z11, hiddenIdentifiers, identifierSpec, lVarV, (i11 & 112) | 520 | (IdentifierSpec.f76539d << 9) | (i11 & 7168));
            }
            lVarV.T();
            i13 = i14;
        }
        lVarV.T();
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(hiddenIdentifiers, z11, elements, identifierSpec, dVar2, i11, i12));
        }
    }

    public static final void b(StateFlow<? extends Set<IdentifierSpec>> hiddenIdentifiersFlow, StateFlow<Boolean> enabledFlow, StateFlow<? extends List<? extends d0>> elementsFlow, StateFlow<IdentifierSpec> lastTextFieldIdentifierFlow, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        s.k(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        s.k(enabledFlow, "enabledFlow");
        s.k(elementsFlow, "elementsFlow");
        s.k(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        p020r2.l lVarV = lVar.v(-1475980057);
        androidx.compose.ui.d dVar2 = (i12 & 16) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(-1475980057, i11, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:45)");
        }
        a(c(r90.f.a(hiddenIdentifiersFlow, lVarV, 8)), d(r90.f.a(enabledFlow, lVarV, 8)), e(r90.f.a(elementsFlow, lVarV, 8)), f(r90.f.a(lastTextFieldIdentifierFlow, lVarV, 8)), dVar2, lVarV, (IdentifierSpec.f76539d << 9) | 520 | (57344 & i11), 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, dVar2, i11, i12));
        }
    }

    private static final Set<IdentifierSpec> c(y3<? extends Set<IdentifierSpec>> y3Var) {
        return y3Var.getValue();
    }

    private static final boolean d(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    private static final List<d0> e(y3<? extends List<? extends d0>> y3Var) {
        return (List) y3Var.getValue();
    }

    private static final IdentifierSpec f(y3<IdentifierSpec> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void g(d0 d0Var, boolean z11, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, p020r2.l lVar, int i11) {
        boolean z12;
        IdentifierSpec identifierSpec2;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(979865244);
        if (p020r2.o.J()) {
            p020r2.o.S(979865244, i11, -1, "com.stripe.android.ui.core.FormUIElement (FormUI.kt:91)");
        }
        if (d0Var instanceof SectionElement) {
            lVarV.H(373269316);
            z12 = z11;
            h1.a(z12, (SectionElement) d0Var, set, identifierSpec, 0, 0, lVarV, ((i11 >> 3) & 14) | 512 | (SectionElement.f76567g << 3) | (IdentifierSpec.f76539d << 9) | (i11 & 7168), 48);
            lVarV = lVarV;
            lVarV.T();
        } else {
            if (!(d0Var instanceof p010i90.n)) {
                if (d0Var instanceof StaticTextElement) {
                    lVarV.H(373279000);
                    m2.a((StaticTextElement) d0Var, lVarV, 8);
                    lVarV.T();
                } else if (d0Var instanceof SaveForFutureUseElement) {
                    lVarV.H(373281159);
                    z12 = z11;
                    c2.a(z12, (SaveForFutureUseElement) d0Var, null, lVarV, ((i11 >> 3) & 14) | 64, 4);
                    lVarV.T();
                } else {
                    z12 = z11;
                    if (d0Var instanceof AfterpayClearpayHeaderElement) {
                        lVarV.H(373284009);
                        z80.e.a(z12, (AfterpayClearpayHeaderElement) d0Var, lVarV, ((i11 >> 3) & 14) | 64);
                        lVarV.T();
                    } else if (d0Var instanceof AuBecsDebitMandateTextElement) {
                        lVarV.H(373287872);
                        z80.j.a((AuBecsDebitMandateTextElement) d0Var, lVarV, 8);
                        lVarV.T();
                    } else if (d0Var instanceof AffirmHeaderElement) {
                        lVarV.H(373290125);
                        z80.b.a(lVarV, 0);
                        lVarV.T();
                    } else if (d0Var instanceof MandateTextElement) {
                        lVarV.H(373291762);
                        u1.a((MandateTextElement) d0Var, lVarV, 8);
                        lVarV.T();
                    } else if (d0Var instanceof z80.h0) {
                        lVarV.H(373293914);
                        z80.i0.a(z12, ((z80.h0) d0Var).getController(), set, identifierSpec, lVarV, ((i11 >> 3) & 14) | 576 | (IdentifierSpec.f76539d << 9) | (i11 & 7168));
                        lVarV = lVarV;
                        lVarV.T();
                    } else if (d0Var instanceof z80.v) {
                        lVarV.H(373299699);
                        int i12 = i11 >> 3;
                        identifierSpec2 = identifierSpec;
                        w.a(z12, (z80.v) d0Var, identifierSpec2, lVarV, (i12 & 896) | (i12 & 14) | 64 | (IdentifierSpec.f76539d << 6));
                        lVarV.T();
                    } else {
                        identifierSpec2 = identifierSpec;
                        if (d0Var instanceof OTPElement) {
                            lVarV.H(373302266);
                            o0.a(z12, (OTPElement) d0Var, null, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, lVarV, ((i11 >> 3) & 14) | (OTPElement.f76679e << 3), 1020);
                            lVarV = lVarV;
                            lVarV.T();
                        } else if (d0Var instanceof z1) {
                            lVarV.H(373304654);
                            ((z1) d0Var).f(z12, lVarV, ((i11 >> 3) & 14) | 64);
                            lVarV.T();
                        } else if (d0Var instanceof EmptyFormElement) {
                            lVarV.H(-1312408508);
                            lVarV.T();
                        } else {
                            lVarV.H(-1312400634);
                            lVarV.T();
                        }
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(d0Var, z12, set, identifierSpec2, i11));
                }
            }
            lVarV.H(373274785);
            p010i90.o.a(null, ((p010i90.n) d0Var).getController(), z11, lVarV, (p010i90.m.f76690f << 3) | ((i11 << 3) & 896), 1);
            lVarV.T();
            z12 = z11;
        }
        identifierSpec2 = identifierSpec;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(d0Var, z12, set, identifierSpec2, i11));
        }
    }
}
