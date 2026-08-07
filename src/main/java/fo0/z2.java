package fo0;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes9.dex */
public class z2 {

    public static class a<T> extends b<T> implements wn0.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wn0.a<T> f66312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile SoftReference<Object> f66313c;

        public a(T t11, wn0.a<T> aVar) {
            if (aVar == null) {
                e(0);
            }
            this.f66313c = null;
            this.f66312b = aVar;
            if (t11 != null) {
                this.f66313c = new SoftReference<>(a(t11));
            }
        }

        private static /* synthetic */ void e(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // fo0.z2.b, wn0.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f66313c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T tInvoke = this.f66312b.invoke();
            this.f66313c = new SoftReference<>(a(tInvoke));
            return tInvoke;
        }
    }

    public static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f66314a = new a();

        static class a {
            a() {
            }
        }

        protected Object a(T t11) {
            return t11 == null ? f66314a : t11;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T c(Object obj) {
            if (obj == f66314a) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int i11) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static <T> a<T> b(T t11, wn0.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new a<>(t11, aVar);
    }

    public static <T> a<T> c(wn0.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return b(null, aVar);
    }
}
