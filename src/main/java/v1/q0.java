package v1;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/d;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "c", "a", "b", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {
        public a() {
            super(1);
        }

        public final void a(q1 q1Var) {
            q1Var.b("imePadding");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {
        public b() {
            super(3);
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(359872873);
            if (p020r2.o.J()) {
                p020r2.o.S(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            n0 n0VarC = n0.INSTANCE.c(lVar, 6);
            boolean zN = lVar.n(n0VarC);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new s(n0VarC.getIme());
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {
        public c() {
            super(1);
        }

        public final void a(q1 q1Var) {
            q1Var.b("navigationBarsPadding");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends p013kotlin.jvm.internal.u implements wn0.q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {
        public d() {
            super(3);
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(359872873);
            if (p020r2.o.J()) {
                p020r2.o.S(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            n0 n0VarC = n0.INSTANCE.c(lVar, 6);
            boolean zN = lVar.n(n0VarC);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new s(n0VarC.getNavigationBars());
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {
        public e() {
            super(1);
        }

        public final void a(q1 q1Var) {
            q1Var.b("statusBarsPadding");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class f extends p013kotlin.jvm.internal.u implements wn0.q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {
        public f() {
            super(3);
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(359872873);
            if (p020r2.o.J()) {
                p020r2.o.S(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            n0 n0VarC = n0.INSTANCE.c(lVar, 6);
            boolean zN = lVar.n(n0VarC);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new s(n0VarC.getStatusBars());
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class g extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {
        public g() {
            super(1);
        }

        public final void a(q1 q1Var) {
            q1Var.b("systemBarsPadding");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class h extends p013kotlin.jvm.internal.u implements wn0.q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {
        public h() {
            super(3);
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(359872873);
            if (p020r2.o.J()) {
                p020r2.o.S(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            n0 n0VarC = n0.INSTANCE.c(lVar, 6);
            boolean zN = lVar.n(n0VarC);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new s(n0VarC.getSystemBars());
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

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new a() : o1.a(), new b());
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new c() : o1.a(), new d());
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new e() : o1.a(), new f());
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new g() : o1.a(), new h());
    }
}
