package kotlin;

import android.view.KeyEvent;
import t3.c;
import t3.d;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lt3/b;", "", "a", "(Landroid/view/KeyEvent;)Z", "Ljn0/h0;", "b", "()V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {
    public static final boolean a(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && c.e(d.b(keyEvent), c.INSTANCE.b());
    }

    public static final void b() {
    }
}
