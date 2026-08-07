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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aT\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/d;", "", "selected", "enabled", "Lg4/i;", "role", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "b", "(Landroidx/compose/ui/d;ZZLg4/i;Lwn0/a;)Landroidx/compose/ui/d;", "Lu1/l;", "interactionSource", "Lq1/c0;", "indication", "a", "(Landroidx/compose/ui/d;ZLu1/l;Lq1/c0;ZLg4/i;Lwn0/a;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class C0105a extends u implements q<androidx.compose.ui.d, l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f4912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f4913f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0105a(boolean z11, boolean z12, i iVar, wn0.a<h0> aVar) {
            super(3);
            this.f4910c = z11;
            this.f4911d = z12;
            this.f4912e = iVar;
            this.f4913f = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l lVar, int i11) {
            u1.l lVar2;
            lVar.o(-2124609672);
            if (o.J()) {
                o.S(-2124609672, i11, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
            }
            c0 c0Var = (c0) lVar.U(j.a());
            if (c0Var instanceof e0) {
                lVar.o(-1412264498);
                lVar.l();
                lVar2 = null;
            } else {
                lVar.o(-1412156525);
                Object objI = lVar.I();
                if (objI == l.INSTANCE.a()) {
                    objI = k.a();
                    lVar.B(objI);
                }
                lVar2 = (u1.l) objI;
                lVar.l();
            }
            androidx.compose.ui.d dVarA = a.a(androidx.compose.ui.d.INSTANCE, this.f4910c, lVar2, c0Var, this.f4911d, this.f4912e, this.f4913f);
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
        final /* synthetic */ c0 f4914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f4917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a f4918g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, boolean z11, boolean z12, i iVar, wn0.a aVar) {
            super(3);
            this.f4914c = c0Var;
            this.f4915d = z11;
            this.f4916e = z12;
            this.f4917f = iVar;
            this.f4918g = aVar;
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
            androidx.compose.ui.d dVarG = j.b(androidx.compose.ui.d.INSTANCE, lVar2, this.f4914c).g(new SelectableElement(this.f4915d, lVar2, null, this.f4916e, this.f4917f, this.f4918g, null));
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f4921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a f4922f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z11, boolean z12, i iVar, wn0.a aVar) {
            super(1);
            this.f4919c = z11;
            this.f4920d = z12;
            this.f4921e = iVar;
            this.f4922f = aVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b("selectable");
            q1Var.getProperties().a("selected", Boolean.valueOf(this.f4919c));
            q1Var.getProperties().a("enabled", Boolean.valueOf(this.f4920d));
            q1Var.getProperties().a("role", this.f4921e);
            q1Var.getProperties().a("onClick", this.f4922f);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, boolean z11, u1.l lVar, c0 c0Var, boolean z12, i iVar, wn0.a<h0> aVar) {
        androidx.compose.ui.d dVarG;
        if (c0Var instanceof e0) {
            dVarG = new SelectableElement(z11, lVar, (e0) c0Var, z12, iVar, aVar, null);
        } else if (c0Var == null) {
            dVarG = new SelectableElement(z11, lVar, null, z12, iVar, aVar, null);
        } else {
            dVarG = lVar != null ? j.b(androidx.compose.ui.d.INSTANCE, lVar, c0Var).g(new SelectableElement(z11, lVar, null, z12, iVar, aVar, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.INSTANCE, null, new b(c0Var, z11, z12, iVar, aVar), 1, null);
        }
        return dVar.g(dVarG);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, boolean z11, boolean z12, i iVar, wn0.a<h0> aVar) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new c(z11, z12, iVar, aVar) : o1.a(), new C0105a(z11, z12, iVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.d c(androidx.compose.ui.d dVar, boolean z11, boolean z12, i iVar, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            iVar = null;
        }
        return b(dVar, z11, z12, iVar, aVar);
    }
}
