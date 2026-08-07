package retrofit2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.KotlinNullPointerException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\t\u0010\u0004\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "T", "Lretrofit2/d;", "a", "(Lretrofit2/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "Lretrofit2/y;", "c", "", "", "e", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ retrofit2.d<T> f107915c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(retrofit2.d<T> dVar) {
            super(1);
            this.f107915c = dVar;
        }

        public final void a(Throwable th2) {
            this.f107915c.cancel();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"retrofit2/q$b", "Lretrofit2/f;", "Lretrofit2/d;", "call", "Lretrofit2/y;", "response", "Ljn0/h0;", "onResponse", "(Lretrofit2/d;Lretrofit2/y;)V", "", "t", "onFailure", "(Lretrofit2/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements retrofit2.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<T> f107916a;

        /* JADX WARN: Multi-variable type inference failed */
        b(CancellableContinuation<? super T> cancellableContinuation) {
            this.f107916a = cancellableContinuation;
        }

        @Override // retrofit2.f
        public void onFailure(retrofit2.d<T> call, Throwable t11) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(t11, "t");
            CancellableContinuation<T> cancellableContinuation = this.f107916a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(t11)));
        }

        @Override // retrofit2.f
        public void onResponse(retrofit2.d<T> call, y<T> response) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(response, "response");
            if (!response.g()) {
                CancellableContinuation<T> cancellableContinuation = this.f107916a;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(new HttpException(response))));
                return;
            }
            T tA = response.a();
            if (tA != null) {
                this.f107916a.resumeWith(jn0.s.b(tA));
                return;
            }
            Object objTag = call.request().tag(p.class);
            p013kotlin.jvm.internal.s.h(objTag);
            p pVar = (p) objTag;
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + pVar.b().getName() + CoreConstants.DOT + pVar.a().getName() + " was null but response body type was declared as non-null");
            CancellableContinuation<T> cancellableContinuation2 = this.f107916a;
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            cancellableContinuation2.resumeWith(jn0.s.b(jn0.t.a(kotlinNullPointerException)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ retrofit2.d<T> f107917c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(retrofit2.d<T> dVar) {
            super(1);
            this.f107917c = dVar;
        }

        public final void a(Throwable th2) {
            this.f107917c.cancel();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"retrofit2/q$d", "Lretrofit2/f;", "Lretrofit2/d;", "call", "Lretrofit2/y;", "response", "Ljn0/h0;", "onResponse", "(Lretrofit2/d;Lretrofit2/y;)V", "", "t", "onFailure", "(Lretrofit2/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d<T> implements retrofit2.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<T> f107918a;

        /* JADX WARN: Multi-variable type inference failed */
        d(CancellableContinuation<? super T> cancellableContinuation) {
            this.f107918a = cancellableContinuation;
        }

        @Override // retrofit2.f
        public void onFailure(retrofit2.d<T> call, Throwable t11) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(t11, "t");
            CancellableContinuation<T> cancellableContinuation = this.f107918a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(t11)));
        }

        @Override // retrofit2.f
        public void onResponse(retrofit2.d<T> call, y<T> response) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(response, "response");
            if (response.g()) {
                CancellableContinuation<T> cancellableContinuation = this.f107918a;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(response.a()));
            } else {
                CancellableContinuation<T> cancellableContinuation2 = this.f107918a;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                cancellableContinuation2.resumeWith(jn0.s.b(jn0.t.a(new HttpException(response))));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ retrofit2.d<T> f107919c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(retrofit2.d<T> dVar) {
            super(1);
            this.f107919c = dVar;
        }

        public final void a(Throwable th2) {
            this.f107919c.cancel();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"retrofit2/q$f", "Lretrofit2/f;", "Lretrofit2/d;", "call", "Lretrofit2/y;", "response", "Ljn0/h0;", "onResponse", "(Lretrofit2/d;Lretrofit2/y;)V", "", "t", "onFailure", "(Lretrofit2/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f<T> implements retrofit2.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<y<T>> f107920a;

        /* JADX WARN: Multi-variable type inference failed */
        f(CancellableContinuation<? super y<T>> cancellableContinuation) {
            this.f107920a = cancellableContinuation;
        }

        @Override // retrofit2.f
        public void onFailure(retrofit2.d<T> call, Throwable t11) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(t11, "t");
            CancellableContinuation<y<T>> cancellableContinuation = this.f107920a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(t11)));
        }

        @Override // retrofit2.f
        public void onResponse(retrofit2.d<T> call, y<T> response) {
            p013kotlin.jvm.internal.s.k(call, "call");
            p013kotlin.jvm.internal.s.k(response, "response");
            this.f107920a.resumeWith(jn0.s.b(response));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {119}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f107921n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f107922o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f107923p;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f107922o = obj;
            this.f107923p |= Integer.MIN_VALUE;
            return q.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<?> f107924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f107925b;

        h(Continuation<?> continuation, Throwable th2) {
            this.f107924a = continuation;
            this.f107925b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(this.f107924a);
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuationIntercepted.resumeWith(jn0.s.b(jn0.t.a(this.f107925b)));
        }
    }

    public static final <T> Object a(retrofit2.d<T> dVar, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new a(dVar));
        dVar.enqueue(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> Object b(retrofit2.d<T> dVar, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new c(dVar));
        dVar.enqueue(new d(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> Object c(retrofit2.d<T> dVar, Continuation<? super y<T>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new e(dVar));
        dVar.enqueue(new f(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object d(retrofit2.d<h0> dVar, Continuation<? super h0> continuation) {
        p013kotlin.jvm.internal.s.i(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(Throwable th2, Continuation<?> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f107923p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f107923p = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f107922o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f107923p;
        if (i12 == 0) {
            jn0.t.b(obj);
            gVar.f107921n = th2;
            gVar.f107923p = 1;
            Dispatchers.getDefault().mo574dispatch(gVar.getContext(), new h(gVar, th2));
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(gVar);
            }
            if (coroutine_suspended2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
