package androidx.compose.foundation.selection;

import androidx.compose.foundation.j;
import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import g4.i;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import q1.c0;
import q1.e0;
import u1.k;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aZ\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/d;", "", "value", "enabled", "Lg4/i;", "role", "Lkotlin/Function1;", "Ljn0/h0;", "onValueChange", "b", "(Landroidx/compose/ui/d;ZZLg4/i;Lwn0/l;)Landroidx/compose/ui/d;", "Lu1/l;", "interactionSource", "Lq1/c0;", "indication", "a", "(Landroidx/compose/ui/d;ZLu1/l;Lq1/c0;ZLg4/i;Lwn0/l;)Landroidx/compose/ui/d;", "Lh4/a;", "state", "Lkotlin/Function0;", "onClick", "c", "(Landroidx/compose/ui/d;Lh4/a;Lu1/l;Lq1/c0;ZLg4/i;Lwn0/a;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<androidx.compose.ui.d, l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f4925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<Boolean, h0> f4926f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z11, boolean z12, i iVar, wn0.l<? super Boolean, h0> lVar) {
            super(3);
            this.f4923c = z11;
            this.f4924d = z12;
            this.f4925e = iVar;
            this.f4926f = lVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l lVar, int i11) {
            u1.l lVar2;
            lVar.o(290332169);
            if (o.J()) {
                o.S(290332169, i11, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:74)");
            }
            c0 c0Var = (c0) lVar.U(j.a());
            if (c0Var instanceof e0) {
                lVar.o(-2130154122);
                lVar.l();
                lVar2 = null;
            } else {
                lVar.o(-2130046149);
                Object objI = lVar.I();
                if (objI == l.INSTANCE.a()) {
                    objI = k.a();
                    lVar.B(objI);
                }
                lVar2 = (u1.l) objI;
                lVar.l();
            }
            androidx.compose.ui.d dVarA = c.a(androidx.compose.ui.d.INSTANCE, this.f4923c, lVar2, c0Var, this.f4924d, this.f4925e, this.f4926f);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarA;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends u implements q<androidx.compose.ui.d, l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f4927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f4930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l f4931g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, boolean z11, boolean z12, i iVar, wn0.l lVar) {
            super(3);
            this.f4927c = c0Var;
            this.f4928d = z11;
            this.f4929e = z12;
            this.f4930f = iVar;
            this.f4931g = lVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l lVar, int i11) {
            lVar.o(-1525724089);
            if (o.J()) {
                o.S(-1525724089, i11, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objI = lVar.I();
            if (objI == l.INSTANCE.a()) {
                objI = k.a();
                lVar.B(objI);
            }
            u1.l lVar2 = (u1.l) objI;
            androidx.compose.ui.d dVarG = j.b(androidx.compose.ui.d.INSTANCE, lVar2, this.f4927c).g(new ToggleableElement(this.f4928d, lVar2, null, this.f4929e, this.f4930f, this.f4931g, null));
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarG;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C0106c extends u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f4934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l f4935f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0106c(boolean z11, boolean z12, i iVar, wn0.l lVar) {
            super(1);
            this.f4932c = z11;
            this.f4933d = z12;
            this.f4934e = iVar;
            this.f4935f = lVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b("toggleable");
            q1Var.getProperties().a("value", Boolean.valueOf(this.f4932c));
            q1Var.getProperties().a("enabled", Boolean.valueOf(this.f4933d));
            q1Var.getProperties().a("role", this.f4934e);
            q1Var.getProperties().a("onValueChange", this.f4935f);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends u implements q<androidx.compose.ui.d, l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f4936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h4.a f4937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f4939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a f4940g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c0 c0Var, h4.a aVar, boolean z11, i iVar, wn0.a aVar2) {
            super(3);
            this.f4936c = c0Var;
            this.f4937d = aVar;
            this.f4938e = z11;
            this.f4939f = iVar;
            this.f4940g = aVar2;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l lVar, int i11) {
            lVar.o(-1525724089);
            if (o.J()) {
                o.S(-1525724089, i11, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objI = lVar.I();
            if (objI == l.INSTANCE.a()) {
                objI = k.a();
                lVar.B(objI);
            }
            u1.l lVar2 = (u1.l) objI;
            androidx.compose.ui.d dVarG = j.b(androidx.compose.ui.d.INSTANCE, lVar2, this.f4936c).g(new TriStateToggleableElement(this.f4937d, lVar2, null, this.f4938e, this.f4939f, this.f4940g, null));
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarG;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, boolean z11, u1.l lVar, c0 c0Var, boolean z12, i iVar, wn0.l<? super Boolean, h0> lVar2) {
        androidx.compose.ui.d dVarG;
        if (c0Var instanceof e0) {
            dVarG = new ToggleableElement(z11, lVar, (e0) c0Var, z12, iVar, lVar2, null);
        } else if (c0Var == null) {
            dVarG = new ToggleableElement(z11, lVar, null, z12, iVar, lVar2, null);
        } else {
            dVarG = lVar != null ? j.b(androidx.compose.ui.d.INSTANCE, lVar, c0Var).g(new ToggleableElement(z11, lVar, null, z12, iVar, lVar2, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.INSTANCE, null, new b(c0Var, z11, z12, iVar, lVar2), 1, null);
        }
        return dVar.g(dVarG);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, boolean z11, boolean z12, i iVar, wn0.l<? super Boolean, h0> lVar) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new C0106c(z11, z12, iVar, lVar) : o1.a(), new a(z11, z12, iVar, lVar));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, h4.a aVar, u1.l lVar, c0 c0Var, boolean z11, i iVar, wn0.a<h0> aVar2) {
        androidx.compose.ui.d dVarG;
        if (c0Var instanceof e0) {
            dVarG = new TriStateToggleableElement(aVar, lVar, (e0) c0Var, z11, iVar, aVar2, null);
        } else if (c0Var == null) {
            dVarG = new TriStateToggleableElement(aVar, lVar, null, z11, iVar, aVar2, null);
        } else {
            dVarG = lVar != null ? j.b(androidx.compose.ui.d.INSTANCE, lVar, c0Var).g(new TriStateToggleableElement(aVar, lVar, null, z11, iVar, aVar2, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.INSTANCE, null, new d(c0Var, aVar, z11, iVar, aVar2), 1, null);
        }
        return dVar.g(dVarG);
    }
}
