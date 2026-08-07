package ezvcard.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class<T> f63660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Collection<T> f63661b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection<T> f63662c = null;

    public a(Class<T> cls) {
        this.f63660a = cls;
    }

    private void b() {
        if (this.f63661b == null) {
            synchronized (this) {
                try {
                    if (this.f63661b == null) {
                        f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        for (Field field : this.f63660a.getFields()) {
            if (g(field)) {
                try {
                    Object obj = field.get(null);
                    if (obj != null) {
                        arrayList.add(this.f63660a.cast(obj));
                    } else {
                        continue;
                    }
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        this.f63662c = new ArrayList(0);
        this.f63661b = Collections.unmodifiableCollection(arrayList);
    }

    private boolean g(Field field) {
        int modifiers = field.getModifiers();
        return Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers) && field.getDeclaringClass() == this.f63660a && field.getType() == this.f63660a;
    }

    public Collection<T> a() {
        b();
        return this.f63661b;
    }

    protected abstract T c(V v11);

    public T d(V v11) {
        b();
        for (T t11 : this.f63661b) {
            if (h(t11, v11)) {
                return t11;
            }
        }
        return null;
    }

    public T e(V v11) {
        T tD = d(v11);
        if (tD != null) {
            return tD;
        }
        synchronized (this.f63662c) {
            try {
                for (T t11 : this.f63662c) {
                    if (h(t11, v11)) {
                        return t11;
                    }
                }
                T tC = c(v11);
                this.f63662c.add(tC);
                return tC;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract boolean h(T t11, V v11);
}
