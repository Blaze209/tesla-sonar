package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;
import okio.s0;

/* JADX INFO: loaded from: classes10.dex */
final class i extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f107888a;

    class a implements e<Object, d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f107889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f107890b;

        a(Type type, Executor executor) {
            this.f107889a = type;
            this.f107890b = executor;
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<Object> adapt(d<Object> dVar) {
            Executor executor = this.f107890b;
            return executor == null ? dVar : new b(executor, dVar);
        }

        @Override // retrofit2.e
        public Type responseType() {
            return this.f107889a;
        }
    }

    static final class b<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Executor f107892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<T> f107893b;

        class a implements f<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f107894a;

            a(f fVar) {
                this.f107894a = fVar;
            }

            public static /* synthetic */ void b(a aVar, f fVar, y yVar) {
                if (b.this.f107893b.isCanceled()) {
                    fVar.onFailure(b.this, new IOException("Canceled"));
                } else {
                    fVar.onResponse(b.this, yVar);
                }
            }

            @Override // retrofit2.f
            public void onFailure(d<T> dVar, final Throwable th2) {
                Executor executor = b.this.f107892a;
                final f fVar = this.f107894a;
                executor.execute(new Runnable() { // from class: retrofit2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.onFailure(i.b.this, th2);
                    }
                });
            }

            @Override // retrofit2.f
            public void onResponse(d<T> dVar, final y<T> yVar) {
                Executor executor = b.this.f107892a;
                final f fVar = this.f107894a;
                executor.execute(new Runnable() { // from class: retrofit2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.b(this.f107896a, fVar, yVar);
                    }
                });
            }
        }

        b(Executor executor, d<T> dVar) {
            this.f107892a = executor;
            this.f107893b = dVar;
        }

        @Override // retrofit2.d
        public void cancel() {
            this.f107893b.cancel();
        }

        @Override // retrofit2.d
        public void enqueue(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f107893b.enqueue(new a(fVar));
        }

        @Override // retrofit2.d
        public y<T> execute() {
            return this.f107893b.execute();
        }

        @Override // retrofit2.d
        public boolean isCanceled() {
            return this.f107893b.isCanceled();
        }

        @Override // retrofit2.d
        public boolean isExecuted() {
            return this.f107893b.isExecuted();
        }

        @Override // retrofit2.d
        public Request request() {
            return this.f107893b.request();
        }

        @Override // retrofit2.d
        public s0 timeout() {
            return this.f107893b.timeout();
        }

        @Override // retrofit2.d
        /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] */
        public d<T> clone() {
            return new b(this.f107892a, this.f107893b.m123clone());
        }
    }

    i(Executor executor) {
        this.f107888a = executor;
    }

    @Override // retrofit2.e.a
    public e<?, ?> get(Type type, Annotation[] annotationArr, z zVar) {
        if (e.a.getRawType(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(d0.g(0, (ParameterizedType) type), d0.l(annotationArr, b0.class) ? null : this.f107888a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
