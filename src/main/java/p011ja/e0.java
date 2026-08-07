package p011ja;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00040\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lja/e0;", "", "<init>", "()V", "Lja/d0;", "T", "Ljava/lang/Class;", "navigatorClass", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;)Lja/d0;", "", "name", "e", "(Ljava/lang/String;)Lja/d0;", "Lja/r;", "navigator", "b", "(Lja/d0;)Lja/d0;", "c", "(Ljava/lang/String;Lja/d0;)Lja/d0;", "", "a", "Ljava/util/Map;", "_navigators", "", "f", "()Ljava/util/Map;", "navigators", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
public class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, String> f83228c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, d0<? extends r>> _navigators = new LinkedHashMap();

    /* JADX INFO: renamed from: ja.e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0001¢\u0006\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lja/e0$a;", "", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "Lja/d0;", "navigatorClass", "a", "(Ljava/lang/Class;)Ljava/lang/String;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class<? extends d0<?>> navigatorClass) {
            s.k(navigatorClass, "navigatorClass");
            String strValue = (String) e0.f83228c.get(navigatorClass);
            if (strValue == null) {
                d0.b bVar = (d0.b) navigatorClass.getAnnotation(d0.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                e0.f83228c.put(navigatorClass, strValue);
            }
            s.h(strValue);
            return strValue;
        }

        public final boolean b(String name) {
            return name != null && name.length() > 0;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d0<? extends r> b(d0<? extends r> navigator) {
        s.k(navigator, "navigator");
        return c(INSTANCE.a(navigator.getClass()), navigator);
    }

    public d0<? extends r> c(String name, d0<? extends r> navigator) {
        s.k(name, "name");
        s.k(navigator, "navigator");
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        d0<? extends r> d0Var = this._navigators.get(name);
        if (s.f(d0Var, navigator)) {
            return navigator;
        }
        boolean z11 = false;
        if (d0Var != null && d0Var.getIsAttached()) {
            z11 = true;
        }
        if (z11) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + d0Var).toString());
        }
        if (!navigator.getIsAttached()) {
            return this._navigators.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final <T extends d0<?>> T d(Class<T> navigatorClass) {
        s.k(navigatorClass, "navigatorClass");
        return (T) e(INSTANCE.a(navigatorClass));
    }

    public <T extends d0<?>> T e(String name) {
        s.k(name, "name");
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        d0<? extends r> d0Var = this._navigators.get(name);
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map<String, d0<? extends r>> f() {
        return v0.A(this._navigators);
    }
}
