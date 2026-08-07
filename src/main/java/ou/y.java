package ou;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    static final class a<T> implements x<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f100034a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x<T> f100035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f100036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient T f100037d;

        a(x<T> xVar) {
            this.f100035b = (x) p.m(xVar);
        }

        @Override // ou.x
        public T get() {
            if (!this.f100036c) {
                synchronized (this.f100034a) {
                    try {
                        if (!this.f100036c) {
                            T t11 = this.f100035b.get();
                            this.f100037d = t11;
                            this.f100036c = true;
                            return t11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) k.a(this.f100037d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f100036c) {
                obj = "<supplier that returned " + this.f100037d + ">";
            } else {
                obj = this.f100035b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b<T> implements x<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final x<Void> f100038d = new x() { // from class: ou.z
            @Override // ou.x
            public final Object get() {
                return y.b.a();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f100039a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile x<T> f100040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f100041c;

        b(x<T> xVar) {
            this.f100040b = (x) p.m(xVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // ou.x
        public T get() {
            x<T> xVar = this.f100040b;
            x<T> xVar2 = (x<T>) f100038d;
            if (xVar != xVar2) {
                synchronized (this.f100039a) {
                    try {
                        if (this.f100040b != xVar2) {
                            T t11 = this.f100040b.get();
                            this.f100041c = t11;
                            this.f100040b = xVar2;
                            return t11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) k.a(this.f100041c);
        }

        public String toString() {
            Object obj = this.f100040b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f100038d) {
                obj = "<supplier that returned " + this.f100041c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static final class c<T> implements x<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f100042a;

        c(T t11) {
            this.f100042a = t11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f100042a, ((c) obj).f100042a);
            }
            return false;
        }

        @Override // ou.x
        public T get() {
            return this.f100042a;
        }

        public int hashCode() {
            return Objects.hash(this.f100042a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f100042a + ")";
        }
    }

    public static <T> x<T> a(x<T> xVar) {
        if ((xVar instanceof b) || (xVar instanceof a)) {
            return xVar;
        }
        return xVar instanceof Serializable ? new a(xVar) : new b(xVar);
    }

    public static <T> x<T> b(T t11) {
        return new c(t11);
    }
}
