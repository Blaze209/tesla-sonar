package hk0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
final class z extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Member f73112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Class[] f73113b;

    z(Method method, Class[] clsArr) {
        this.f73112a = method;
        this.f73113b = clsArr;
    }

    @Override // hk0.m
    Class[] a() {
        return this.f73113b;
    }

    boolean b() {
        return g0.f(this.f73112a);
    }

    z(Constructor constructor, Class[] clsArr) {
        this.f73112a = constructor;
        this.f73113b = clsArr;
    }
}
