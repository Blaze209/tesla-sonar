package androidx.compose.foundation;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.w;
import q1.c0;
import q1.d0;
import q1.e0;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/d;", "Lu1/j;", "interactionSource", "Lq1/c0;", "indication", "b", "(Landroidx/compose/ui/d;Lu1/j;Lq1/c0;)Landroidx/compose/ui/d;", "Lr2/g2;", "a", "Lr2/g2;", "()Lr2/g2;", "LocalIndication", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<c0> f4467a = w.f(a.f4468c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq1/c0;", "b", "()Lq1/c0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4468c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c0 invoke() {
            return g.f4291a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u1.j f4469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f4470d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u1.j jVar, c0 c0Var) {
            super(1);
            this.f4469c = jVar;
            this.f4470d = c0Var;
        }

        public final void a(q1 q1Var) {
            q1Var.b("indication");
            q1Var.getProperties().a("interactionSource", this.f4469c);
            q1Var.getProperties().a("indication", this.f4470d);
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
        final /* synthetic */ c0 f4471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u1.j f4472d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0 c0Var, u1.j jVar) {
            super(3);
            this.f4471c = c0Var;
            this.f4472d = jVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(-353972293);
            if (p020r2.o.J()) {
                p020r2.o.S(-353972293, i11, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
            }
            d0 d0VarB = this.f4471c.b(this.f4472d, lVar, 0);
            boolean zN = lVar.n(d0VarB);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new k(d0VarB);
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

    public static final g2<c0> a() {
        return f4467a;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, u1.j jVar, c0 c0Var) {
        if (c0Var == null) {
            return dVar;
        }
        if (c0Var instanceof e0) {
            return dVar.g(new IndicationModifierElement(jVar, (e0) c0Var));
        }
        return androidx.compose.ui.c.b(dVar, o1.b() ? new b(jVar, c0Var) : o1.a(), new c(c0Var, jVar));
    }
}
