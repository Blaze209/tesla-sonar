package h10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import f10.g;
import f10.k;
import f10.p;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0011J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\rJ\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e¨\u0006 "}, d2 = {"Lh10/c;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/v0;", "reactContext", "Lm10/d;", "a", "(Lcom/facebook/react/uimanager/v0;)Lm10/d;", "Ljn0/h0;", "c", "view", IntegerTokenConverter.CONVERTER_KEY, "(Lm10/d;)V", "", "enabled", "e", "(Lm10/d;Z)V", "isStatusBarTranslucent", "h", "isNavigationBarTranslucent", "f", "isPreservingEdgeToEdge", "g", DateTokenConverter.CONVERTER_KEY, "", "", "b", "()Ljava/util/Map;", "Lf10/p;", "Lf10/p;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p listener;

    public final m10.d a(v0 reactContext) {
        s.k(reactContext, "reactContext");
        if (this.listener == null) {
            p pVar = new p(reactContext);
            this.listener = pVar;
            pVar.b();
        }
        return new m10.d(reactContext);
    }

    public final Map<String, Object> b() {
        b10.f.Companion companion = b10.f.INSTANCE;
        Map<String, Object> mapJ = jn.c.j(companion.c().getValue(), jn.c.d("registrationName", "onKeyboardMove"), companion.d().getValue(), jn.c.d("registrationName", "onKeyboardMoveStart"), companion.a().getValue(), jn.c.d("registrationName", "onKeyboardMoveEnd"), companion.b().getValue(), jn.c.d("registrationName", "onKeyboardMoveInteractive"), "topFocusedInputLayoutChanged", jn.c.d("registrationName", "onFocusedInputLayoutChanged"), "topFocusedInputTextChanged", jn.c.d("registrationName", "onFocusedInputTextChanged"), "topFocusedInputSelectionChanged", jn.c.d("registrationName", "onFocusedInputSelectionChanged"));
        s.j(mapJ, "of(...)");
        return mapJ;
    }

    public final void c() {
        p pVar = this.listener;
        if (pVar != null) {
            pVar.d();
        }
        this.listener = null;
    }

    public final void d(m10.d view) {
        s.k(view, "view");
        view.setEdgeToEdge();
    }

    public final void e(m10.d view, boolean enabled) {
        s.k(view, "view");
        view.setActive(enabled);
    }

    public final void f(m10.d view, boolean isNavigationBarTranslucent) {
        s.k(view, "view");
        view.setNavigationBarTranslucent(isNavigationBarTranslucent);
    }

    public final void g(m10.d view, boolean isPreservingEdgeToEdge) {
        s.k(view, "view");
        view.setPreserveEdgeToEdge(isPreservingEdgeToEdge);
    }

    public final void h(m10.d view, boolean isStatusBarTranslucent) {
        s.k(view, "view");
        view.setStatusBarTranslucent(isStatusBarTranslucent);
    }

    public final void i(m10.d view) {
        g layoutObserver;
        s.k(view, "view");
        k callback$react_native_keyboard_controller_release = view.getCallback$react_native_keyboard_controller_release();
        if (callback$react_native_keyboard_controller_release != null && (layoutObserver = callback$react_native_keyboard_controller_release.getLayoutObserver()) != null) {
            layoutObserver.l();
        }
        v0 reactContext = view.getReactContext();
        WritableMap writableMapCreateMap = Arguments.createMap();
        s.j(writableMapCreateMap, "createMap(...)");
        c10.g.b(reactContext, "KeyboardController::layoutDidSynchronize", writableMapCreateMap);
    }
}
