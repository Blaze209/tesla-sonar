package z50;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import jn0.h0;
import o4.q0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.l0;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz50/j;", "b", "(Lr2/l;I)Lz50/j;", "Lr2/y3;", "", "a", "(Lr2/l;I)Lr2/y3;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "b", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f127005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f127006d;

        /* JADX INFO: renamed from: z50.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"z50/l$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C2753a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f127007a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f127008b;

            public C2753a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f127007a = view;
                this.f127008b = onGlobalLayoutListener;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f127007a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f127008b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, p1<Boolean> p1Var) {
            super(1);
            this.f127005c = view;
            this.f127006d = p1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(View view, p1 state) {
            s.k(view, "$view");
            s.k(state, "$state");
            WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(view);
            state.setValue(Boolean.valueOf(windowInsetsCompatH != null ? windowInsetsCompatH.q(WindowInsetsCompat.n.c()) : true));
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 DisposableEffect) {
            s.k(DisposableEffect, "$this$DisposableEffect");
            final View view = this.f127005c;
            final p1<Boolean> p1Var = this.f127006d;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: z50.k
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    l.a.c(view, p1Var);
                }
            };
            this.f127005c.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            return new C2753a(this.f127005c, onGlobalLayoutListener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q0 f127009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q0 q0Var) {
            super(0);
            this.f127009c = q0Var;
        }

        public final void b() {
            q0 q0Var = this.f127009c;
            if (q0Var != null) {
                q0Var.b();
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    private static final y3<Boolean> a(p020r2.l lVar, int i11) {
        lVar.H(1086676156);
        if (p020r2.o.J()) {
            p020r2.o.S(1086676156, i11, -1, "com.stripe.android.financialconnections.utils.isKeyboardVisibleAsState (KeyboardController.kt:49)");
        }
        View view = (View) lVar.U(AndroidCompositionLocals_androidKt.k());
        lVar.H(-1072538740);
        Object objI = lVar.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = s3.d(Boolean.FALSE, null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        lVar.T();
        Function0.c(view, new a(view, p1Var), lVar, 8);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return p1Var;
    }

    public static final j b(p020r2.l lVar, int i11) {
        lVar.H(-1168628962);
        if (p020r2.o.J()) {
            p020r2.o.S(-1168628962, i11, -1, "com.stripe.android.financialconnections.utils.rememberKeyboardController (KeyboardController.kt:33)");
        }
        q0 q0Var = (q0) lVar.U(z0.r());
        j jVar = new j(new b(q0Var), a(lVar, 0));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return jVar;
    }
}
