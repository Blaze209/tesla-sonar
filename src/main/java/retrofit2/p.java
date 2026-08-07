package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f107911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f107912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f107913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<?> f107914d;

    p(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f107911a = cls;
        this.f107912b = obj;
        this.f107913c = method;
        this.f107914d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f107913c;
    }

    public Class<?> b() {
        return this.f107911a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f107911a.getName(), this.f107913c.getName(), this.f107914d);
    }
}
