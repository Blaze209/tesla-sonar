package qj0;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Provider f105608a;

        a(Provider provider) {
            this.f105608a = provider;
        }

        @Override // javax.inject.Provider
        public T get() {
            return (T) this.f105608a.get();
        }
    }

    public static <T> i<T> a(Provider<T> provider) {
        h.b(provider);
        return provider instanceof i ? (i) provider : new a(provider);
    }
}
