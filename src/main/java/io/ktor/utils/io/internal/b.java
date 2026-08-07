package io.ktor.utils.io.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0010\u0010\f\u001a\f0\u000bR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lio/ktor/utils/io/internal/b;", "", "T", "Lkotlin/coroutines/Continuation;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "g", "(Lkotlin/coroutines/CoroutineContext;)V", "Lio/ktor/utils/io/internal/b$a;", "relation", "f", "(Lio/ktor/utils/io/internal/b$a;)V", "Lkotlinx/coroutines/Job;", "job", "", "exception", "h", "(Lkotlinx/coroutines/Job;Ljava/lang/Throwable;)V", "value", "c", "(Ljava/lang/Object;)V", "cause", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;)V", "actual", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/s;", "result", "resumeWith", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<T> implements Continuation<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78733a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78734b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/internal/b$a;", "Lkotlin/Function1;", "", "Ljn0/h0;", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lio/ktor/utils/io/internal/b;Lkotlinx/coroutines/Job;)V", "cause", "c", "(Ljava/lang/Throwable;)V", "a", "()V", "Lkotlinx/coroutines/Job;", "b", "()Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "handler", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Job job;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private DisposableHandle handler;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T> f78737c;

        public a(b bVar, Job job) {
            s.k(job, "job");
            this.f78737c = bVar;
            this.job = job;
            DisposableHandle disposableHandleInvokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(job, true, false, this, 2, null);
            if (job.isActive()) {
                this.handler = disposableHandleInvokeOnCompletion$default;
            }
        }

        public final void a() {
            DisposableHandle disposableHandle = this.handler;
            if (disposableHandle != null) {
                this.handler = null;
                disposableHandle.dispose();
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Job getJob() {
            return this.job;
        }

        public void c(Throwable cause) {
            this.f78737c.f(this);
            a();
            if (cause != null) {
                this.f78737c.h(this.job, cause);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            c(th2);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(b<T>.a relation) {
        androidx.concurrent.futures.b.a(f78734b, this, relation, null);
    }

    private final void g(CoroutineContext context) {
        Object obj;
        a aVar;
        Job job = (Job) context.get(Job.INSTANCE);
        a aVar2 = (a) this.jobCancellationHandler;
        if ((aVar2 != null ? aVar2.getJob() : null) == job) {
            return;
        }
        if (job == null) {
            a aVar3 = (a) f78734b.getAndSet(this, null);
            if (aVar3 != null) {
                aVar3.a();
                return;
            }
            return;
        }
        a aVar4 = new a(this, job);
        do {
            obj = this.jobCancellationHandler;
            aVar = (a) obj;
            if (aVar != null && aVar.getJob() == job) {
                aVar4.a();
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f78734b, this, obj, aVar4));
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Job job, Throwable exception) {
        Object obj;
        Continuation continuation;
        do {
            obj = this.state;
            if (!(obj instanceof Continuation)) {
                return;
            }
            continuation = (Continuation) obj;
            if (continuation.get$context().get(Job.INSTANCE) != job) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f78733a, this, obj, null));
        s.i(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        jn0.s.Companion companion = jn0.s.INSTANCE;
        continuation.resumeWith(jn0.s.b(t.a(exception)));
    }

    public final void c(T value) {
        s.k(value, "value");
        resumeWith(jn0.s.b(value));
        a aVar = (a) f78734b.getAndSet(this, null);
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void d(Throwable cause) {
        s.k(cause, "cause");
        jn0.s.Companion companion = jn0.s.INSTANCE;
        resumeWith(jn0.s.b(t.a(cause)));
        a aVar = (a) f78734b.getAndSet(this, null);
        if (aVar != null) {
            aVar.a();
        }
    }

    public final Object e(Continuation<? super T> actual) {
        s.k(actual, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f78733a, this, null, actual)) {
                    g(actual.get$context());
                    return IntrinsicsKt.getCOROUTINE_SUSPENDED();
                }
            } else if (androidx.concurrent.futures.b.a(f78733a, this, obj, null)) {
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                s.i(obj, "null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
                return obj;
            }
        }
    }

    @Override // p013kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext get$context() {
        CoroutineContext coroutineContext;
        Object obj = this.state;
        Continuation continuation = obj instanceof Continuation ? (Continuation) obj : null;
        return (continuation == null || (coroutineContext = continuation.get$context()) == null) ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // p013kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        Object obj;
        Object objE;
        do {
            obj = this.state;
            if (obj == null) {
                objE = jn0.s.e(result);
                if (objE == null) {
                    t.b(result);
                    objE = result;
                }
            } else if (!(obj instanceof Continuation)) {
                return;
            } else {
                objE = null;
            }
        } while (!androidx.concurrent.futures.b.a(f78733a, this, obj, objE));
        if (obj instanceof Continuation) {
            ((Continuation) obj).resumeWith(result);
        }
    }
}
