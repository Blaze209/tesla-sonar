package io.realm.internal;

import io.realm.internal.j.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class j<T extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<T> f79085a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f79086b = false;

    public interface a<T extends b> {
        void a(T t11, Object obj);
    }

    public static abstract class b<T, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<T> f79087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final S f79088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f79089c = false;

        public b(T t11, S s11) {
            this.f79088b = s11;
            this.f79087a = new WeakReference<>(t11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f79088b.equals(bVar.f79088b) && this.f79087a.get() == bVar.f79087a.get()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T t11 = this.f79087a.get();
            int iHashCode = (527 + (t11 != null ? t11.hashCode() : 0)) * 31;
            S s11 = this.f79088b;
            return iHashCode + (s11 != null ? s11.hashCode() : 0);
        }
    }

    public void a(T t11) {
        if (!this.f79085a.contains(t11)) {
            this.f79085a.add(t11);
            t11.f79089c = false;
        }
        if (this.f79086b) {
            this.f79086b = false;
        }
    }

    public void b() {
        this.f79086b = true;
        this.f79085a.clear();
    }

    public void c(a<T> aVar) {
        for (T t11 : this.f79085a) {
            if (this.f79086b) {
                return;
            }
            Object obj = t11.f79087a.get();
            if (obj == null) {
                this.f79085a.remove(t11);
            } else if (!t11.f79089c) {
                aVar.a(t11, obj);
            }
        }
    }

    public boolean d() {
        return this.f79085a.isEmpty();
    }

    public <S, U> void e(S s11, U u11) {
        for (T t11 : this.f79085a) {
            if (s11 == t11.f79087a.get() && u11.equals(t11.f79088b)) {
                t11.f79089c = true;
                this.f79085a.remove(t11);
                return;
            }
        }
    }

    void f(Object obj) {
        for (T t11 : this.f79085a) {
            Object obj2 = t11.f79087a.get();
            if (obj2 == null || obj2 == obj) {
                t11.f79089c = true;
                this.f79085a.remove(t11);
            }
        }
    }

    public int g() {
        return this.f79085a.size();
    }
}
