package h10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.uimanager.v0;
import m10.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lh10/d;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/v0;", "reactContext", "Lm10/g;", "a", "(Lcom/facebook/react/uimanager/v0;)Lm10/g;", "view", "", "offset", "Ljn0/h0;", "c", "(Lm10/g;D)V", "", "interpolator", "b", "(Lm10/g;Ljava/lang/String;)V", "", "value", DateTokenConverter.CONVERTER_KEY, "(Lm10/g;Z)V", "e", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {
    public final g a(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return new g(reactContext);
    }

    public final void b(g view, String interpolator) {
        s.k(view, "view");
        s.k(interpolator, "interpolator");
        view.setInterpolator(interpolator);
    }

    public final void c(g view, double offset) {
        s.k(view, "view");
        view.setOffset(offset);
    }

    public final void d(g view, boolean value) {
        s.k(view, "view");
        view.setScrollKeyboardOffScreenWhenVisible(value);
    }

    public final void e(g view, boolean value) {
        s.k(view, "view");
        view.setScrollKeyboardOnScreenWhenNotVisible(value);
    }
}
