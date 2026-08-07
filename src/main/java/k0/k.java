package k0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.s2;
import androidx.camera.core.impl.x0;

/* JADX INFO: loaded from: classes.dex */
public interface k<T> extends s2 {

    @NonNull
    public static final x0.a<String> H = x0.a.a("camerax.core.target.name", String.class);

    @NonNull
    public static final x0.a<Class<?>> I = x0.a.a("camerax.core.target.class", Class.class);

    @NonNull
    default String D() {
        return (String) a(H);
    }

    default String q(String str) {
        return (String) d(H, str);
    }
}
