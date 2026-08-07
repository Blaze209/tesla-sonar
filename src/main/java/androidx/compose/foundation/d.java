package androidx.compose.foundation;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import b4.x1;
import b4.y1;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p021s1.v;
import q1.c0;
import q1.e0;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aX\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u008a\u0001\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0001*\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/d;", "", "enabled", "", "onClickLabel", "Lg4/i;", "role", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "c", "(Landroidx/compose/ui/d;ZLjava/lang/String;Lg4/i;Lwn0/a;)Landroidx/compose/ui/d;", "Lu1/l;", "interactionSource", "Lq1/c0;", "indication", "a", "(Landroidx/compose/ui/d;Lu1/l;Lq1/c0;ZLjava/lang/String;Lg4/i;Lwn0/a;)Landroidx/compose/ui/d;", "onLongClickLabel", "onLongClick", "onDoubleClick", "e", "(Landroidx/compose/ui/d;Lu1/l;Lq1/c0;ZLjava/lang/String;Lg4/i;Ljava/lang/String;Lwn0/a;Lwn0/a;Lwn0/a;)Landroidx/compose/ui/d;", "Lb4/x1;", "g", "(Lb4/x1;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f4257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g4.i f4258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f4259f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, String str, g4.i iVar, wn0.a<h0> aVar) {
            super(3);
            this.f4256c = z11;
            this.f4257d = str;
            this.f4258e = iVar;
            this.f4259f = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            u1.l lVar2;
            lVar.o(-756081143);
            if (p020r2.o.J()) {
                p020r2.o.S(-756081143, i11, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
            }
            c0 c0Var = (c0) lVar.U(j.a());
            if (c0Var instanceof e0) {
                lVar.o(617140216);
                lVar.l();
                lVar2 = null;
            } else {
                lVar.o(617248189);
                Object objI = lVar.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = u1.k.a();
                    lVar.B(objI);
                }
                lVar2 = (u1.l) objI;
                lVar.l();
            }
            androidx.compose.ui.d dVarA = d.a(androidx.compose.ui.d.INSTANCE, lVar2, c0Var, this.f4256c, this.f4257d, this.f4258e, this.f4259f);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return dVarA;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, p020r2.l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends u implements q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f4260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4.i f4263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a f4264g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, boolean z11, String str, g4.i iVar, wn0.a aVar) {
            super(3);
            this.f4260c = c0Var;
            this.f4261d = z11;
            this.f4262e = str;
            this.f4263f = iVar;
            this.f4264g = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(-1525724089);
            if (p020r2.o.J()) {
                p020r2.o.S(-1525724089, i11, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objI = lVar.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = u1.k.a();
                lVar.B(objI);
            }
            u1.l lVar2 = (u1.l) objI;
            androidx.compose.ui.d dVarG = j.b(androidx.compose.ui.d.INSTANCE, lVar2, this.f4260c).g(new ClickableElement(lVar2, null, this.f4261d, this.f4262e, this.f4263f, this.f4264g, null));
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return dVarG;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, p020r2.l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f4266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g4.i f4267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a f4268f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z11, String str, g4.i iVar, wn0.a aVar) {
            super(1);
            this.f4265c = z11;
            this.f4266d = str;
            this.f4267e = iVar;
            this.f4268f = aVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b("clickable");
            q1Var.getProperties().a("enabled", Boolean.valueOf(this.f4265c));
            q1Var.getProperties().a("onClickLabel", this.f4266d);
            q1Var.getProperties().a("role", this.f4267e);
            q1Var.getProperties().a("onClick", this.f4268f);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class C0088d extends u implements q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f4269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4.i f4272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a f4273g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f4274h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ wn0.a f4275i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ wn0.a f4276j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0088d(c0 c0Var, boolean z11, String str, g4.i iVar, wn0.a aVar, String str2, wn0.a aVar2, wn0.a aVar3) {
            super(3);
            this.f4269c = c0Var;
            this.f4270d = z11;
            this.f4271e = str;
            this.f4272f = iVar;
            this.f4273g = aVar;
            this.f4274h = str2;
            this.f4275i = aVar2;
            this.f4276j = aVar3;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(-1525724089);
            if (p020r2.o.J()) {
                p020r2.o.S(-1525724089, i11, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objI = lVar.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = u1.k.a();
                lVar.B(objI);
            }
            u1.l lVar2 = (u1.l) objI;
            androidx.compose.ui.d dVarG = j.b(androidx.compose.ui.d.INSTANCE, lVar2, this.f4269c).g(new CombinedClickableElement(lVar2, null, this.f4270d, this.f4271e, this.f4272f, this.f4273g, this.f4274h, this.f4275i, this.f4276j, null));
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return dVarG;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, p020r2.l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/x1;", "node", "", "a", "(Lb4/x1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.l<x1, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f4277c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j0 j0Var) {
            super(1);
            this.f4277c = j0Var;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(x1 x1Var) {
            boolean z11;
            j0 j0Var = this.f4277c;
            if (j0Var.f86523a) {
                z11 = true;
            } else {
                s.i(x1Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                if (((v) x1Var).getEnabled()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            j0Var.f86523a = z11;
            return Boolean.valueOf(!this.f4277c.f86523a);
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, u1.l lVar, c0 c0Var, boolean z11, String str, g4.i iVar, wn0.a<h0> aVar) {
        androidx.compose.ui.d dVarG;
        if (c0Var instanceof e0) {
            dVarG = new ClickableElement(lVar, (e0) c0Var, z11, str, iVar, aVar, null);
        } else if (c0Var == null) {
            dVarG = new ClickableElement(lVar, null, z11, str, iVar, aVar, null);
        } else {
            dVarG = lVar != null ? j.b(androidx.compose.ui.d.INSTANCE, lVar, c0Var).g(new ClickableElement(lVar, null, z11, str, iVar, aVar, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.INSTANCE, null, new b(c0Var, z11, str, iVar, aVar), 1, null);
        }
        return dVar.g(dVarG);
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, u1.l lVar, c0 c0Var, boolean z11, String str, g4.i iVar, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return a(dVar, lVar, c0Var, z11, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : iVar, aVar);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, boolean z11, String str, g4.i iVar, wn0.a<h0> aVar) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new c(z11, str, iVar, aVar) : o1.a(), new a(z11, str, iVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, boolean z11, String str, g4.i iVar, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            iVar = null;
        }
        return c(dVar, z11, str, iVar, aVar);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, u1.l lVar, c0 c0Var, boolean z11, String str, g4.i iVar, String str2, wn0.a<h0> aVar, wn0.a<h0> aVar2, wn0.a<h0> aVar3) {
        androidx.compose.ui.d dVarG;
        if (c0Var instanceof e0) {
            dVarG = new CombinedClickableElement(lVar, (e0) c0Var, z11, str, iVar, aVar3, str2, aVar, aVar2, null);
        } else if (c0Var == null) {
            dVarG = new CombinedClickableElement(lVar, null, z11, str, iVar, aVar3, str2, aVar, aVar2, null);
        } else {
            dVarG = lVar != null ? j.b(androidx.compose.ui.d.INSTANCE, lVar, c0Var).g(new CombinedClickableElement(lVar, null, z11, str, iVar, aVar3, str2, aVar, aVar2, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.INSTANCE, null, new C0088d(c0Var, z11, str, iVar, aVar3, str2, aVar, aVar2), 1, null);
        }
        return dVar.g(dVarG);
    }

    public static /* synthetic */ androidx.compose.ui.d f(androidx.compose.ui.d dVar, u1.l lVar, c0 c0Var, boolean z11, String str, g4.i iVar, String str2, wn0.a aVar, wn0.a aVar2, wn0.a aVar3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return e(dVar, lVar, c0Var, z11, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : iVar, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : aVar, (i11 & 128) != 0 ? null : aVar2, aVar3);
    }

    public static final boolean g(x1 x1Var) {
        j0 j0Var = new j0();
        y1.c(x1Var, v.INSTANCE, new e(j0Var));
        return j0Var.f86523a;
    }
}
