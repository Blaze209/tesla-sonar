package d3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0002\u0012&\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¢\u0006\u0004\b\t\u0010\nJN\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\b\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006\u0017"}, d2 = {"Ld3/k;", "T", "", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ld3/k$a;", "Landroidx/compose/ui/AtomicReference;", "currentSessionHolder", "b", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "R", "Lkotlin/Function1;", "Lkotlinx/coroutines/CoroutineScope;", "sessionInitializer", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "session", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/concurrent/atomic/AtomicReference;Lwn0/l;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class k<T> {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ld3/k$a;", "T", "", "Lkotlinx/coroutines/Job;", "job", "value", "<init>", "(Lkotlinx/coroutines/Job;Ljava/lang/Object;)V", "a", "Lkotlinx/coroutines/Job;", "()Lkotlinx/coroutines/Job;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Job job;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public a(Job job, T t11) {
            this.job = job;
            this.value = t11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Job getJob() {
            return this.job;
        }

        public final T b() {
            return this.value;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {67, 69}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
    static final class b<R> extends SuspendLambda implements p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59337n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f59338o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.l<CoroutineScope, T> f59339p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ AtomicReference<a<T>> f59340q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p<T, Continuation<? super R>, Object> f59341r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.l<? super CoroutineScope, ? extends T> lVar, AtomicReference<a<T>> atomicReference, p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f59339p = lVar;
            this.f59340q = atomicReference;
            this.f59341r = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f59339p, this.f59340q, this.f59341r, continuation);
            bVar.f59338o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            a<T> aVar;
            Job job;
            a<T> aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f59337n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f59338o;
                    aVar = new a<>(JobKt.getJob(coroutineScope.getCoroutineContext()), this.f59339p.invoke(coroutineScope));
                    a<T> andSet = this.f59340q.getAndSet(aVar);
                    if (andSet != null && (job = andSet.getJob()) != null) {
                        this.f59338o = aVar;
                        this.f59337n = 1;
                        if (JobKt.cancelAndJoin(job, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (a) this.f59338o;
                    try {
                        t.b(obj);
                        androidx.camera.view.i.a(this.f59340q, aVar2, null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        androidx.camera.view.i.a(this.f59340q, aVar2, null);
                        throw th;
                    }
                }
                aVar = (a) this.f59338o;
                t.b(obj);
                p<T, Continuation<? super R>, Object> pVar = this.f59341r;
                T tB = aVar.b();
                this.f59338o = aVar;
                this.f59337n = 2;
                obj = pVar.invoke(tB, this);
                if (obj != coroutine_suspended) {
                    aVar2 = aVar;
                    androidx.camera.view.i.a(this.f59340q, aVar2, null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                androidx.camera.view.i.a(this.f59340q, aVar2, null);
                throw th;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static <T> AtomicReference<a<T>> a() {
        return b(new AtomicReference(null));
    }

    public static final T c(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final <R> Object d(AtomicReference<a<T>> atomicReference, wn0.l<? super CoroutineScope, ? extends T> lVar, p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new b(lVar, atomicReference, pVar, null), continuation);
    }

    private static <T> AtomicReference<a<T>> b(AtomicReference<a<T>> atomicReference) {
        return atomicReference;
    }
}
