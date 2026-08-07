package yu;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class b0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<a0<?>> f125815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<a0<?>> f125816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<a0<?>> f125817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<a0<?>> f125818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<a0<?>> f125819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f125820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f125821g;

    private static class a implements vv.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f125822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vv.c f125823b;

        public a(Set<Class<?>> set, vv.c cVar) {
            this.f125822a = set;
            this.f125823b = cVar;
        }

        @Override // vv.c
        public void a(vv.a<?> aVar) {
            if (!this.f125822a.contains(aVar.b())) {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f125823b.a(aVar);
        }
    }

    b0(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(a0.b(vv.c.class));
        }
        this.f125815a = Collections.unmodifiableSet(hashSet);
        this.f125816b = Collections.unmodifiableSet(hashSet2);
        this.f125817c = Collections.unmodifiableSet(hashSet3);
        this.f125818d = Collections.unmodifiableSet(hashSet4);
        this.f125819e = Collections.unmodifiableSet(hashSet5);
        this.f125820f = cVar.k();
        this.f125821g = dVar;
    }

    @Override // yu.d
    public <T> T a(Class<T> cls) {
        if (!this.f125815a.contains(a0.b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t11 = (T) this.f125821g.a(cls);
        return !cls.equals(vv.c.class) ? t11 : (T) new a(this.f125820f, (vv.c) t11);
    }

    @Override // yu.d
    public <T> Set<T> b(a0<T> a0Var) {
        if (this.f125818d.contains(a0Var)) {
            return this.f125821g.b(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", a0Var));
    }

    @Override // yu.d
    public <T> yv.b<Set<T>> c(a0<T> a0Var) {
        if (this.f125819e.contains(a0Var)) {
            return this.f125821g.c(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", a0Var));
    }

    @Override // yu.d
    public <T> T d(a0<T> a0Var) {
        if (this.f125815a.contains(a0Var)) {
            return (T) this.f125821g.d(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", a0Var));
    }

    @Override // yu.d
    public <T> yv.b<T> e(a0<T> a0Var) {
        if (this.f125816b.contains(a0Var)) {
            return this.f125821g.e(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", a0Var));
    }

    @Override // yu.d
    public <T> yv.a<T> g(a0<T> a0Var) {
        if (this.f125817c.contains(a0Var)) {
            return this.f125821g.g(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", a0Var));
    }

    @Override // yu.d
    public <T> yv.b<T> h(Class<T> cls) {
        return e(a0.b(cls));
    }

    @Override // yu.d
    public <T> yv.a<T> i(Class<T> cls) {
        return g(a0.b(cls));
    }
}
