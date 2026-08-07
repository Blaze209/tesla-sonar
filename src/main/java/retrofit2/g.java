package retrofit2;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(24)
@IgnoreJRERequirement
final class g extends e.a {

    @IgnoreJRERequirement
    private static final class a<R> implements e<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f107881a;

        /* JADX INFO: renamed from: retrofit2.g$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        private class C2293a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CompletableFuture<R> f107882a;

            public C2293a(CompletableFuture<R> completableFuture) {
                this.f107882a = completableFuture;
            }

            @Override // retrofit2.f
            public void onFailure(d<R> dVar, Throwable th2) {
                this.f107882a.completeExceptionally(th2);
            }

            @Override // retrofit2.f
            public void onResponse(d<R> dVar, y<R> yVar) {
                if (yVar.g()) {
                    this.f107882a.complete(yVar.a());
                } else {
                    this.f107882a.completeExceptionally(new HttpException(yVar));
                }
            }
        }

        a(Type type) {
            this.f107881a = type;
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> adapt(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.enqueue(new C2293a(bVar));
            return bVar;
        }

        @Override // retrofit2.e
        public Type responseType() {
            return this.f107881a;
        }
    }

    @IgnoreJRERequirement
    private static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<?> f107884a;

        b(d<?> dVar) {
            this.f107884a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            if (z11) {
                this.f107884a.cancel();
            }
            return super.cancel(z11);
        }
    }

    @IgnoreJRERequirement
    private static final class c<R> implements e<R, CompletableFuture<y<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f107885a;

        @IgnoreJRERequirement
        private class a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CompletableFuture<y<R>> f107886a;

            public a(CompletableFuture<y<R>> completableFuture) {
                this.f107886a = completableFuture;
            }

            @Override // retrofit2.f
            public void onFailure(d<R> dVar, Throwable th2) {
                this.f107886a.completeExceptionally(th2);
            }

            @Override // retrofit2.f
            public void onResponse(d<R> dVar, y<R> yVar) {
                this.f107886a.complete(yVar);
            }
        }

        c(Type type) {
            this.f107885a = type;
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<y<R>> adapt(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.enqueue(new a(bVar));
            return bVar;
        }

        @Override // retrofit2.e
        public Type responseType() {
            return this.f107885a;
        }
    }

    g() {
    }

    @Override // retrofit2.e.a
    public e<?, ?> get(Type type, Annotation[] annotationArr, z zVar) {
        if (e.a.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = e.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (e.a.getRawType(parameterUpperBound) != y.class) {
            return new a(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new c(e.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
