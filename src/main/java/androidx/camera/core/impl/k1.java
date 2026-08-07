package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f3212a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Object, d0> f3213b = new HashMap();

    public static void a(@NonNull Object obj, @NonNull d0 d0Var) {
        synchronized (f3212a) {
            f3213b.put(obj, d0Var);
        }
    }

    @NonNull
    public static d0 b(@NonNull Object obj) {
        d0 d0Var;
        synchronized (f3212a) {
            d0Var = f3213b.get(obj);
        }
        return d0Var == null ? d0.f3152a : d0Var;
    }
}
