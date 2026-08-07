package p024x1;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lx1/q0;", "a", "(Lr2/l;I)Lx1/q0;", "x1/r0$a", "Lx1/r0$a;", "getRobolectricImpl$annotations", "()V", "RobolectricImpl", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f122658a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f122658a = s.f(lowerCase, "robolectric") ? new a() : null;
    }

    public static final q0 a(l lVar, int i11) {
        if (o.J()) {
            o.S(1141871251, i11, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
        }
        q0 q0Var = f122658a;
        if (q0Var != null) {
            lVar.o(1213893039);
            lVar.l();
        } else {
            lVar.o(1213931944);
            View view = (View) lVar.U(AndroidCompositionLocals_androidKt.k());
            boolean zN = lVar.n(view);
            Object objI = lVar.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = new p024x1.a(view);
                lVar.B(objI);
            }
            q0Var = (p024x1.a) objI;
            lVar.l();
        }
        if (o.J()) {
            o.R();
        }
        return q0Var;
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x1/r0$a", "Lx1/q0;", "Lx1/o0;", "prefetchRequest", "Ljn0/h0;", "a", "(Lx1/o0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements q0 {
        a() {
        }

        @Override // p024x1.q0
        public void a(o0 prefetchRequest) {
        }
    }
}
