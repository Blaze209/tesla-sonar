package io.ktor.utils.io.jvm.javaio;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.EventLoopKt;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\"\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\bH¤@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00148\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00148\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b.\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/a;", "", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "Ljava/lang/Thread;", "thread", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Thread;)V", "Lkotlin/coroutines/Continuation;", "ucont", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "k", "()V", "", "buffer", "", "offset", "length", "m", "([BII)I", "jobToken", "l", "(Ljava/lang/Object;)I", "rc", DateTokenConverter.CONVERTER_KEY, "(I)V", "a", "Lkotlinx/coroutines/Job;", "g", "()Lkotlinx/coroutines/Job;", "b", "Lkotlin/coroutines/Continuation;", "end", "Lkotlinx/coroutines/DisposableHandle;", "c", "Lkotlinx/coroutines/DisposableHandle;", "disposable", "<set-?>", "I", "f", "()I", "e", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f78793f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Job parent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Continuation<h0> end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DisposableHandle disposable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int length;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", f = "Blocking.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    static final class C1679a extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f78799n;

        C1679a(Continuation<? super C1679a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return a.this.new C1679a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f78799n;
            if (i11 == 0) {
                t.b(obj);
                a aVar = a.this;
                this.f78799n = 1;
                if (aVar.h(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((C1679a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<Throwable, h0> {
        b() {
            super(1);
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                Continuation continuation = a.this.end;
                s.Companion companion = s.INSTANCE;
                continuation.resumeWith(s.b(t.a(th2)));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0005\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"io/ktor/utils/io/jvm/javaio/a$c", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "Ljn0/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Continuation<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext context;

        c() {
            this.context = a.this.getParent() != null ? i.f78826b.plus(a.this.getParent()) : i.f78826b;
        }

        @Override // p013kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p013kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            Object obj;
            boolean z11;
            Throwable thE;
            Job parent;
            Object objE = s.e(result);
            if (objE == null) {
                objE = h0.f84049a;
            }
            a aVar = a.this;
            do {
                obj = aVar.state;
                z11 = obj instanceof Thread;
                if (!(z11 ? true : obj instanceof Continuation ? true : p013kotlin.jvm.internal.s.f(obj, this))) {
                    return;
                }
            } while (!androidx.concurrent.futures.b.a(a.f78793f, aVar, obj, objE));
            if (z11) {
                f.a().b(obj);
            } else if ((obj instanceof Continuation) && (thE = s.e(result)) != null) {
                ((Continuation) obj).resumeWith(s.b(t.a(thE)));
            }
            if (s.g(result) && !(s.e(result) instanceof CancellationException) && (parent = a.this.getParent()) != null) {
                Job.DefaultImpls.cancel$default(parent, (CancellationException) null, 1, (Object) null);
            }
            DisposableHandle disposableHandle = a.this.disposable;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void i(Thread thread) {
        if (this.state != thread) {
            return;
        }
        if (!f.b()) {
            io.ktor.utils.io.jvm.javaio.b.b().warn("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
        }
        while (true) {
            long jProcessNextEventInCurrentThread = EventLoopKt.processNextEventInCurrentThread();
            if (this.state != thread) {
                return;
            }
            if (jProcessNextEventInCurrentThread > 0) {
                f.a().a(jProcessNextEventInCurrentThread);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object j(Continuation<Object> ucont) {
        Object obj;
        Continuation continuationIntercepted;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                continuationIntercepted = IntrinsicsKt.intercepted(ucont);
                obj = obj3;
            } else {
                if (!p013kotlin.jvm.internal.s.f(obj3, this)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                continuationIntercepted = IntrinsicsKt.intercepted(ucont);
            }
            if (androidx.concurrent.futures.b.a(f78793f, this, obj3, continuationIntercepted)) {
                if (obj != null) {
                    f.a().b(obj);
                }
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            obj2 = obj;
        }
    }

    protected final void d(int rc2) {
        this.result = rc2;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    protected final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    protected final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Job getParent() {
        return this.parent;
    }

    protected abstract Object h(Continuation<? super h0> continuation);

    public final void k() {
        DisposableHandle disposableHandle = this.disposable;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
        Continuation<h0> continuation = this.end;
        s.Companion companion = s.INSTANCE;
        continuation.resumeWith(s.b(t.a(new CancellationException("Stream closed"))));
    }

    public final int l(Object jobToken) throws Throwable {
        Object obj;
        Object noWhenBranchMatchedException;
        p013kotlin.jvm.internal.s.k(jobToken, "jobToken");
        Thread thread = Thread.currentThread();
        Continuation continuation = null;
        do {
            obj = this.state;
            if (obj instanceof Continuation) {
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                continuation = (Continuation) obj;
                noWhenBranchMatchedException = thread;
            } else {
                if (obj instanceof h0) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (p013kotlin.jvm.internal.s.f(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            p013kotlin.jvm.internal.s.j(noWhenBranchMatchedException, "when (value) {\n         …Exception()\n            }");
        } while (!androidx.concurrent.futures.b.a(f78793f, this, obj, noWhenBranchMatchedException));
        p013kotlin.jvm.internal.s.h(continuation);
        continuation.resumeWith(s.b(jobToken));
        p013kotlin.jvm.internal.s.j(thread, "thread");
        i(thread);
        Object obj2 = this.state;
        if (obj2 instanceof Throwable) {
            throw ((Throwable) obj2);
        }
        return this.result;
    }

    public final int m(byte[] buffer, int offset, int length) {
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        this.offset = offset;
        this.length = length;
        return l(buffer);
    }

    public a(Job job) {
        this.parent = job;
        c cVar = new c();
        this.end = cVar;
        this.state = this;
        this.result = 0;
        this.disposable = job != null ? job.invokeOnCompletion(new b()) : null;
        ((l) u0.g(new C1679a(null), 1)).invoke(cVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public /* synthetic */ a(Job job, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : job);
    }
}
