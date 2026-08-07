package androidx.compose.foundation;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import com.facebook.react.modules.appstate.AppStateModule;
import jn0.h0;
import k3.a4;
import k3.g4;
import k3.h1;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/d;", "Lk3/p1;", "color", "Lk3/g4;", "shape", "c", "(Landroidx/compose/ui/d;JLk3/g4;)Landroidx/compose/ui/d;", "Lk3/h1;", "brush", "", "alpha", "a", "(Landroidx/compose/ui/d;Lk3/h1;Lk3/g4;F)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h1 f4241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g4 f4242e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f11, h1 h1Var, g4 g4Var) {
            super(1);
            this.f4240c = f11;
            this.f4241d = h1Var;
            this.f4242e = g4Var;
        }

        public final void a(q1 q1Var) {
            q1Var.b(AppStateModule.APP_STATE_BACKGROUND);
            q1Var.getProperties().a("alpha", Float.valueOf(this.f4240c));
            q1Var.getProperties().a("brush", this.f4241d);
            q1Var.getProperties().a("shape", this.f4242e);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C0087b extends u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g4 f4244d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0087b(long j11, g4 g4Var) {
            super(1);
            this.f4243c = j11;
            this.f4244d = g4Var;
        }

        public final void a(q1 q1Var) {
            q1Var.b(AppStateModule.APP_STATE_BACKGROUND);
            q1Var.c(p1.l(this.f4243c));
            q1Var.getProperties().a("color", p1.l(this.f4243c));
            q1Var.getProperties().a("shape", this.f4244d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, h1 h1Var, g4 g4Var, float f11) {
        return dVar.g(new BackgroundElement(0L, h1Var, f11, g4Var, o1.b() ? new a(f11, h1Var, g4Var) : o1.a(), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, h1 h1Var, g4 g4Var, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            g4Var = a4.a();
        }
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        }
        return a(dVar, h1Var, g4Var, f11);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, long j11, g4 g4Var) {
        return dVar.g(new BackgroundElement(j11, null, 1.0f, g4Var, o1.b() ? new C0087b(j11, g4Var) : o1.a(), 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, long j11, g4 g4Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            g4Var = a4.a();
        }
        return c(dVar, j11, g4Var);
    }
}
