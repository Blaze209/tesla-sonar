package kotlin;

import android.view.KeyEvent;
import t3.d;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb2/u;", "a", "Lb2/u;", "()Lb2/u;", "platformDefaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u f15907a = new a();

    @p013kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"b2/w$a", "Lb2/u;", "Lt3/b;", "event", "Lb2/s;", "a", "(Landroid/view/KeyEvent;)Lb2/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements u {
        a() {
        }

        @Override // kotlin.u
        public s a(KeyEvent event) {
            s sVar = null;
            if (d.f(event) && d.d(event)) {
                long jA = d.a(event);
                f0 f0Var = f0.f15533a;
                if (t3.a.q(jA, f0Var.i())) {
                    sVar = s.SELECT_LINE_LEFT;
                } else if (t3.a.q(jA, f0Var.j())) {
                    sVar = s.SELECT_LINE_RIGHT;
                } else if (t3.a.q(jA, f0Var.k())) {
                    sVar = s.SELECT_HOME;
                } else if (t3.a.q(jA, f0Var.h())) {
                    sVar = s.SELECT_END;
                }
            } else if (d.d(event)) {
                long jA2 = d.a(event);
                f0 f0Var2 = f0.f15533a;
                if (t3.a.q(jA2, f0Var2.i())) {
                    sVar = s.LINE_LEFT;
                } else if (t3.a.q(jA2, f0Var2.j())) {
                    sVar = s.LINE_RIGHT;
                } else if (t3.a.q(jA2, f0Var2.k())) {
                    sVar = s.HOME;
                } else if (t3.a.q(jA2, f0Var2.h())) {
                    sVar = s.END;
                }
            }
            return sVar == null ? Function1.b().a(event) : sVar;
        }
    }

    public static final u a() {
        return f15907a;
    }
}
