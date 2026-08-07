package go0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes9.dex */
class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f69266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f69267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f69268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f69269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f69270e;

    public d(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f69266a = cls;
        this.f69267b = map;
        this.f69268c = lazy;
        this.f69269d = lazy2;
        this.f69270e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f69266a, this.f69267b, this.f69268c, this.f69269d, this.f69270e, obj, method, objArr);
    }
}
