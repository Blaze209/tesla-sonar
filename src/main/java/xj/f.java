package xj;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile T f123601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f123602b;

        a(b bVar) {
            this.f123602b = bVar;
        }

        @Override // xj.f.b
        public T get() {
            if (this.f123601a == null) {
                synchronized (this) {
                    try {
                        if (this.f123601a == null) {
                            this.f123601a = (T) k.d(this.f123602b.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f123601a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
