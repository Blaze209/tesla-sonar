package h10;

import com.facebook.react.uimanager.v0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh10/f;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/v0;", "reactContext", "Lo10/e;", "a", "(Lcom/facebook/react/uimanager/v0;)Lo10/e;", "view", "", "value", "Ljn0/h0;", "b", "(Lo10/e;Z)V", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {
    public final o10.e a(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return new o10.e(reactContext);
    }

    public final void b(o10.e view, boolean value) {
        s.k(view, "view");
        if (value) {
            view.i();
        } else {
            view.h();
        }
    }
}
