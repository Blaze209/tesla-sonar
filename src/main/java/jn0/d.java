package jn0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004BE\u00124\u0010\u0007\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013RH\u0010\u0016\u001a4\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R \u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ljn0/d;", "T", "R", "Ljn0/c;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Function3;", "", "block", "value", "<init>", "(Lwn0/q;Ljava/lang/Object;)V", "Ljn0/s;", "result", "Ljn0/h0;", "resumeWith", "(Ljava/lang/Object;)V", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lkotlin/DeepRecursiveFunctionBlock;", "Lwn0/q;", "function", "Ljava/lang/Object;", "c", "Lkotlin/coroutines/Continuation;", "cont", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d<T, R> extends c<T, R> implements Continuation<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private wn0.q<? super c<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Continuation<Object> cont;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(wn0.q<? super c<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T t11) {
        super(null);
        p013kotlin.jvm.internal.s.k(block, "block");
        this.function = block;
        this.value = t11;
        p013kotlin.jvm.internal.s.i(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = this;
        this.result = b.f84030a;
    }

    @Override // jn0.c
    public Object a(T t11, Continuation<? super R> continuation) {
        p013kotlin.jvm.internal.s.i(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = continuation;
        this.value = t11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    public final R b() {
        while (true) {
            R r11 = (R) this.result;
            Continuation<Object> continuation = this.cont;
            if (continuation == null) {
                t.b(r11);
                return r11;
            }
            if (s.d(b.f84030a, r11)) {
                try {
                    wn0.q<? super c<?, ?>, Object, ? super Continuation<Object>, ? extends Object> qVar = this.function;
                    Object obj = this.value;
                    Object objWrapWithContinuationImpl = !(qVar instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(qVar, this, obj, continuation) : ((wn0.q) u0.g(qVar, 3)).invoke(this, obj, continuation);
                    if (objWrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        continuation.resumeWith(s.b(objWrapWithContinuationImpl));
                    }
                } catch (Throwable th2) {
                    s.Companion companion = s.INSTANCE;
                    continuation.resumeWith(s.b(t.a(th2)));
                }
            } else {
                this.result = b.f84030a;
                continuation.resumeWith(r11);
            }
        }
    }

    @Override // p013kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // p013kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        this.cont = null;
        this.result = result;
    }
}
