package androidx.compose.foundation;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p021s1.p;
import q1.u0;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "initial", "Landroidx/compose/foundation/o;", "a", "(ILr2/l;II)Landroidx/compose/foundation/o;", "Landroidx/compose/ui/d;", "state", "", "enabled", "Ls1/m;", "flingBehavior", "reverseScrolling", "c", "(Landroidx/compose/ui/d;Landroidx/compose/foundation/o;ZLs1/m;Z)Landroidx/compose/ui/d;", "isScrollable", "isVertical", "b", "(Landroidx/compose/ui/d;Landroidx/compose/foundation/o;ZLs1/m;ZZ)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/o;", "b", "()Landroidx/compose/foundation/o;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4824c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(0);
            this.f4824c = i11;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(this.f4824c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f4825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p021s1.m f4827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f4828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f4829g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, boolean z11, p021s1.m mVar, boolean z12, boolean z13) {
            super(1);
            this.f4825c = oVar;
            this.f4826d = z11;
            this.f4827e = mVar;
            this.f4828f = z12;
            this.f4829g = z13;
        }

        public final void a(q1 q1Var) {
            q1Var.b("scroll");
            q1Var.getProperties().a("state", this.f4825c);
            q1Var.getProperties().a("reverseScrolling", Boolean.valueOf(this.f4826d));
            q1Var.getProperties().a("flingBehavior", this.f4827e);
            q1Var.getProperties().a("isScrollable", Boolean.valueOf(this.f4828f));
            q1Var.getProperties().a("isVertical", Boolean.valueOf(this.f4829g));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f4830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p021s1.m f4832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f4833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f4834g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, boolean z11, p021s1.m mVar, boolean z12, boolean z13) {
            super(3);
            this.f4830c = oVar;
            this.f4831d = z11;
            this.f4832e = mVar;
            this.f4833f = z12;
            this.f4834g = z13;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(1478351300);
            if (p020r2.o.J()) {
                p020r2.o.S(1478351300, i11, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            androidx.compose.ui.d dVarG = androidx.compose.ui.d.INSTANCE.g(new ScrollSemanticsElement(this.f4830c, this.f4831d, this.f4832e, this.f4833f, this.f4834g));
            o oVar = this.f4830c;
            androidx.compose.ui.d dVarG2 = u0.a(dVarG, oVar, this.f4834g ? p.Vertical : p.Horizontal, this.f4833f, this.f4831d, this.f4832e, oVar.getInternalInteractionSource(), null, lVar, 0, 64).g(new ScrollingLayoutElement(this.f4830c, this.f4831d, this.f4834g));
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return dVarG2;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, p020r2.l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    public static final o a(int i11, p020r2.l lVar, int i12, int i13) {
        boolean z11 = true;
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if (p020r2.o.J()) {
            p020r2.o.S(-1464256199, i12, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        a3.j<o, ?> jVarA = o.INSTANCE.a();
        if ((((i12 & 14) ^ 6) <= 4 || !lVar.r(i11)) && (i12 & 6) != 4) {
            z11 = false;
        }
        Object objI = lVar.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = new a(i11);
            lVar.B(objI);
        }
        o oVar = (o) a3.b.c(objArr, jVarA, null, (wn0.a) objI, lVar, 0, 4);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return oVar;
    }

    private static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, o oVar, boolean z11, p021s1.m mVar, boolean z12, boolean z13) {
        o oVar2;
        boolean z14;
        p021s1.m mVar2;
        boolean z15;
        boolean z16;
        wn0.l lVarA;
        if (o1.b()) {
            oVar2 = oVar;
            z14 = z11;
            mVar2 = mVar;
            z15 = z12;
            z16 = z13;
            lVarA = new b(oVar2, z14, mVar2, z15, z16);
        } else {
            oVar2 = oVar;
            z14 = z11;
            mVar2 = mVar;
            z15 = z12;
            z16 = z13;
            lVarA = o1.a();
        }
        boolean z17 = z16;
        boolean z18 = z15;
        p021s1.m mVar3 = mVar2;
        return androidx.compose.ui.c.b(dVar, lVarA, new c(oVar2, z14, mVar3, z18, z17));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, o oVar, boolean z11, p021s1.m mVar, boolean z12) {
        return b(dVar, oVar, z12, mVar, z11, true);
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, o oVar, boolean z11, p021s1.m mVar, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            mVar = null;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return c(dVar, oVar, z11, mVar, z12);
    }
}
