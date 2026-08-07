package yu;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f125824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<a0<? super T>> f125825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<q> f125826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f125827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f125828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g<T> f125829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f125830g;

    public static /* synthetic */ Object a(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, d dVar) {
        return obj;
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> b<T> e(a0<T> a0Var) {
        return new b<>(a0Var, new a0[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(a0<T> a0Var, a0<? super T>... a0VarArr) {
        return new b<>(a0Var, a0VarArr);
    }

    public static <T> c<T> l(final T t11, Class<T> cls) {
        return m(cls).f(new g() { // from class: yu.a
            @Override // yu.g
            public final Object a(d dVar) {
                return c.b(t11, dVar);
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return c(cls).g();
    }

    @SafeVarargs
    public static <T> c<T> q(final T t11, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new g() { // from class: yu.b
            @Override // yu.g
            public final Object a(d dVar) {
                return c.a(t11, dVar);
            }
        }).d();
    }

    public Set<q> g() {
        return this.f125826c;
    }

    public g<T> h() {
        return this.f125829f;
    }

    public String i() {
        return this.f125824a;
    }

    public Set<a0<? super T>> j() {
        return this.f125825b;
    }

    public Set<Class<?>> k() {
        return this.f125830g;
    }

    public boolean n() {
        return this.f125827d == 1;
    }

    public boolean o() {
        return this.f125827d == 2;
    }

    public boolean p() {
        return this.f125828e == 0;
    }

    public c<T> r(g<T> gVar) {
        return new c<>(this.f125824a, this.f125825b, this.f125826c, this.f125827d, this.f125828e, gVar, this.f125830g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f125825b.toArray()) + ">{" + this.f125827d + ", type=" + this.f125828e + ", deps=" + Arrays.toString(this.f125826c.toArray()) + "}";
    }

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f125831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<a0<? super T>> f125832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<q> f125833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f125834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f125835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g<T> f125836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f125837g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f125835e = 1;
            return this;
        }

        private b<T> i(int i11) {
            z.d(this.f125834d == 0, "Instantiation type has already been set.");
            this.f125834d = i11;
            return this;
        }

        private void j(a0<?> a0Var) {
            z.a(!this.f125832b.contains(a0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            z.c(qVar, "Null dependency");
            j(qVar.c());
            this.f125833c.add(qVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            z.d(this.f125836f != null, "Missing required property: factory.");
            return new c<>(this.f125831a, new HashSet(this.f125832b), new HashSet(this.f125833c), this.f125834d, this.f125835e, this.f125836f, this.f125837g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(g<T> gVar) {
            this.f125836f = (g) z.c(gVar, "Null factory");
            return this;
        }

        public b<T> h(@NonNull String str) {
            this.f125831a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f125831a = null;
            HashSet hashSet = new HashSet();
            this.f125832b = hashSet;
            this.f125833c = new HashSet();
            this.f125834d = 0;
            this.f125835e = 0;
            this.f125837g = new HashSet();
            z.c(cls, "Null interface");
            hashSet.add(a0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                z.c(cls2, "Null interface");
                this.f125832b.add(a0.b(cls2));
            }
        }

        @SafeVarargs
        private b(a0<T> a0Var, a0<? super T>... a0VarArr) {
            this.f125831a = null;
            HashSet hashSet = new HashSet();
            this.f125832b = hashSet;
            this.f125833c = new HashSet();
            this.f125834d = 0;
            this.f125835e = 0;
            this.f125837g = new HashSet();
            z.c(a0Var, "Null interface");
            hashSet.add(a0Var);
            for (a0<? super T> a0Var2 : a0VarArr) {
                z.c(a0Var2, "Null interface");
            }
            Collections.addAll(this.f125832b, a0VarArr);
        }
    }

    private c(String str, Set<a0<? super T>> set, Set<q> set2, int i11, int i12, g<T> gVar, Set<Class<?>> set3) {
        this.f125824a = str;
        this.f125825b = Collections.unmodifiableSet(set);
        this.f125826c = Collections.unmodifiableSet(set2);
        this.f125827d = i11;
        this.f125828e = i12;
        this.f125829f = gVar;
        this.f125830g = Collections.unmodifiableSet(set3);
    }
}
