package v1;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/d;", "Lv1/m0;", "insets", "c", "(Landroidx/compose/ui/d;Lv1/m0;)Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Ljn0/h0;", "block", "b", "(Landroidx/compose/ui/d;Lwn0/l;)Landroidx/compose/ui/d;", "La4/l;", "a", "La4/l;", "()La4/l;", "ModifierLocalConsumedWindowInsets", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a4.l<m0> f117561a = a4.e.a(a.f117562c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv1/m0;", "b", "()Lv1/m0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<m0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f117562c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            return o0.a(0, 0, 0, 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l f117563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wn0.l lVar) {
            super(1);
            this.f117563c = lVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b("onConsumedWindowInsetsChanged");
            q1Var.getProperties().a("block", this.f117563c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<m0, jn0.h0> f117564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super m0, jn0.h0> lVar) {
            super(3);
            this.f117564c = lVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(-1608161351);
            if (p020r2.o.J()) {
                p020r2.o.S(-1608161351, i11, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            boolean zN = lVar.n(this.f117564c);
            wn0.l<m0, jn0.h0> lVar2 = this.f117564c;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new k(lVar2);
                lVar.B(objI);
            }
            k kVar = (k) objI;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return kVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, p020r2.l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f117565c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m0 m0Var) {
            super(1);
            this.f117565c = m0Var;
        }

        public final void a(q1 q1Var) {
            q1Var.b("windowInsetsPadding");
            q1Var.getProperties().a("insets", this.f117565c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f117566c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m0 m0Var) {
            super(3);
            this.f117566c = m0Var;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(-1415685722);
            if (p020r2.o.J()) {
                p020r2.o.S(-1415685722, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
            }
            boolean zN = lVar.n(this.f117566c);
            m0 m0Var = this.f117566c;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new s(m0Var);
                lVar.B(objI);
            }
            s sVar = (s) objI;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return sVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, p020r2.l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    public static final a4.l<m0> a() {
        return f117561a;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, wn0.l<? super m0, jn0.h0> lVar) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new b(lVar) : o1.a(), new c(lVar));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, m0 m0Var) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new d(m0Var) : o1.a(), new e(m0Var));
    }
}
