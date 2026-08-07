package rz;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static HashMap<Class<?>, LinkedHashSet<Class<?>>> f109272a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static HashMap<Class<?>, HashMap<String, String>> f109273b = new HashMap<>();

    static {
        a(Object.class, h.class);
        a(Object.class, g.class);
    }

    public static void a(Class<?> cls, Class<?> cls2) {
        synchronized (f109272a) {
            try {
                LinkedHashSet<Class<?>> linkedHashSet = f109272a.get(cls);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    f109272a.put(cls, linkedHashSet);
                }
                linkedHashSet.add(cls2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
