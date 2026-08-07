package q90;

import androidx.compose.ui.platform.z0;
import e3.g;
import e3.k;
import e3.m;
import i3.o;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.y3;
import wn0.l;
import z3.v;
import z3.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b²\u0006\u0018\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/d;", "", "Le3/m;", "types", "Lkotlin/Function1;", "", "Ljn0/h0;", "onFill", "a", "(Landroidx/compose/ui/d;Ljava/util/List;Lwn0/l;Lr2/l;I)Landroidx/compose/ui/d;", "currentOnFill", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: q90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz3/v;", "it", "Ljn0/h0;", "a", "(Lz3/v;)V"}, k = 3, mv = {1, 9, 0})
    static final class C2220a extends u implements l<v, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f105120c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2220a(k kVar) {
            super(1);
            this.f105120c = kVar;
        }

        public final void a(v it) {
            s.k(it, "it");
            this.f105120c.g(w.c(it));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(v vVar) {
            a(vVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li3/o;", "focusState", "Ljn0/h0;", "a", "(Li3/o;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<o, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f105121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f105122d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar, g gVar) {
            super(1);
            this.f105121c = kVar;
            this.f105122d = gVar;
        }

        public final void a(o focusState) {
            g gVar;
            s.k(focusState, "focusState");
            if (this.f105121c.getBoundingBox() == null || (gVar = this.f105122d) == null) {
                return;
            }
            k kVar = this.f105121c;
            if (focusState.isFocused()) {
                gVar.b(kVar);
            } else {
                gVar.a(kVar);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(o oVar) {
            a(oVar);
            return h0.f84049a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, List<? extends m> types, l<? super String, h0> onFill, p020r2.l lVar, int i11) {
        s.k(dVar, "<this>");
        s.k(types, "types");
        s.k(onFill, "onFill");
        lVar.H(-322372817);
        if (p020r2.o.J()) {
            p020r2.o.S(-322372817, i11, -1, "com.stripe.android.uicore.text.autofill (AutofillModifier.kt:23)");
        }
        y3 y3VarO = n3.o(onFill, lVar, (i11 >> 6) & 14);
        lVar.H(-1148860887);
        boolean zN = lVar.n(types);
        Object objI = lVar.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            k kVar = new k(types, null, b(y3VarO), 2, null);
            lVar.B(kVar);
            objI = kVar;
        }
        k kVar2 = (k) objI;
        lVar.T();
        g gVar = (g) lVar.U(z0.d());
        ((e3.l) lVar.U(z0.e())).c(kVar2);
        androidx.compose.ui.d dVarA = androidx.compose.ui.focus.b.a(androidx.compose.ui.layout.c.a(dVar, new C2220a(kVar2)), new b(kVar2, gVar));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return dVarA;
    }

    private static final l<String, h0> b(y3<? extends l<? super String, h0>> y3Var) {
        return (l) y3Var.getValue();
    }
}
