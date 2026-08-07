package hk0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f73089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f73090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f73091c;

    w(boolean z11) {
        this.f73091c = z11;
        this.f73089a = new v(z11);
    }

    private void a(z zVar) throws Throwable {
        this.f73089a.a(zVar);
        if (zVar.b()) {
            if (this.f73090b == null) {
                this.f73090b = new y(this.f73091c);
            }
            this.f73090b.a(zVar);
        }
    }

    void b(Constructor constructor) throws Throwable {
        a(new z(constructor, constructor.getParameterTypes()));
    }

    void c(Method method) throws Throwable {
        a(new z(method, method.getParameterTypes()));
    }
}
