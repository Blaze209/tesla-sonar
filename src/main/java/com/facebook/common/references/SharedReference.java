package com.facebook.common.references;

import java.util.IdentityHashMap;
import java.util.Map;
import pk.k;
import qk.a;
import tk.h;

/* JADX INFO: loaded from: classes3.dex */
public class SharedReference<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Object, Integer> f21529d = new IdentityHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f21530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21531b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h<T> f21532c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t11, h<T> hVar, boolean z11) {
        this.f21530a = (T) k.g(t11);
        this.f21532c = hVar;
        if (z11) {
            a(t11);
        }
    }

    private static void a(Object obj) {
        Map<Object, Integer> map = f21529d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized int c() {
        int i11;
        e();
        k.b(Boolean.valueOf(this.f21531b > 0));
        i11 = this.f21531b - 1;
        this.f21531b = i11;
        return i11;
    }

    private void e() {
        if (!h(this)) {
            throw new NullReferenceException();
        }
    }

    public static boolean h(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.g();
    }

    private static void i(Object obj) {
        Map<Object, Integer> map = f21529d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    a.N("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f21531b++;
    }

    public void d() {
        T t11;
        if (c() == 0) {
            synchronized (this) {
                t11 = this.f21530a;
                this.f21530a = null;
            }
            if (t11 != null) {
                h<T> hVar = this.f21532c;
                if (hVar != null) {
                    hVar.a(t11);
                }
                i(t11);
            }
        }
    }

    public synchronized T f() {
        return this.f21530a;
    }

    public synchronized boolean g() {
        return this.f21531b > 0;
    }
}
