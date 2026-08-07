package k10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010!\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001a¨\u0006\""}, d2 = {"Lk10/h;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "color", "", "animated", "Ljn0/h0;", "b", "(DZ)V", "translucent", DateTokenConverter.CONVERTER_KEY, "(Z)V", "", "style", "c", "(Ljava/lang/String;)V", "", "a", "()Ljava/util/Map;", "Ljava/lang/Object;", "instance", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setHiddenMethod", "setColorMethod", "setTranslucentMethod", "e", "setStyleMethod", "f", "getConstantsMethod", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object instance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Method setHiddenMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Method setColorMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Method setTranslucentMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Method setStyleMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Method getConstantsMethod;

    public h(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        try {
            StatusBarModule.Companion aVar = StatusBarModule.INSTANCE;
            this.instance = StatusBarModule.class.getConstructor(ReactApplicationContext.class).newInstance(reactContext);
            Class cls = Boolean.TYPE;
            this.setHiddenMethod = StatusBarModule.class.getMethod("setHidden", cls);
            this.setColorMethod = StatusBarModule.class.getMethod("setColor", Double.TYPE, cls);
            this.setTranslucentMethod = StatusBarModule.class.getMethod("setTranslucent", cls);
            this.setStyleMethod = StatusBarModule.class.getMethod("setStyle", String.class);
            this.getConstantsMethod = StatusBarModule.class.getMethod("getConstants", null);
        } catch (Exception e11) {
            g10.a.f67023a.c(i.f84643a, "Failed to initialize StatusBarModule via reflection", e11);
        }
    }

    public final Map<String, Object> a() {
        try {
            Method method = this.getConstantsMethod;
            Object objInvoke = method != null ? method.invoke(this.instance, null) : null;
            if (u0.q(objInvoke)) {
                return (Map) objInvoke;
            }
            return null;
        } catch (Exception e11) {
            g10.a.f67023a.c(i.f84643a, "Error invoking StatusBarModule.getConstants method", e11);
            return null;
        }
    }

    public final void b(double color, boolean animated) {
        try {
            Method method = this.setColorMethod;
            if (method != null) {
                method.invoke(this.instance, Double.valueOf(color), Boolean.valueOf(animated));
            }
        } catch (Exception e11) {
            g10.a.f67023a.c(i.f84643a, "Error invoking StatusBarModule.setColor method", e11);
        }
    }

    public final void c(String style) {
        s.k(style, "style");
        try {
            Method method = this.setStyleMethod;
            if (method != null) {
                method.invoke(this.instance, style);
            }
        } catch (Exception e11) {
            g10.a.f67023a.c(i.f84643a, "Error invoking StatusBarModule.setStyle method", e11);
        }
    }

    public final void d(boolean translucent) {
        try {
            Method method = this.setTranslucentMethod;
            if (method != null) {
                method.invoke(this.instance, Boolean.valueOf(translucent));
            }
        } catch (Exception e11) {
            g10.a.f67023a.c(i.f84643a, "Error invoking StatusBarModule.setTranslucent method", e11);
        }
    }
}
