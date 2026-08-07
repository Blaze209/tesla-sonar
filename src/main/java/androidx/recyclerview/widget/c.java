package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f13353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Executor f13354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final h.f<T> f13355c;

    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Object f13356d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Executor f13357e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Executor f13358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f13359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h.f<T> f13360c;

        public a(@NonNull h.f<T> fVar) {
            this.f13360c = fVar;
        }

        @NonNull
        public c<T> a() {
            if (this.f13359b == null) {
                synchronized (f13356d) {
                    try {
                        if (f13357e == null) {
                            f13357e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f13359b = f13357e;
            }
            return new c<>(this.f13358a, this.f13359b, this.f13360c);
        }
    }

    c(Executor executor, @NonNull Executor executor2, @NonNull h.f<T> fVar) {
        this.f13353a = executor;
        this.f13354b = executor2;
        this.f13355c = fVar;
    }

    @NonNull
    public Executor a() {
        return this.f13354b;
    }

    @NonNull
    public h.f<T> b() {
        return this.f13355c;
    }

    public Executor c() {
        return this.f13353a;
    }
}
