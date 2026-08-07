package kotlinx.coroutines.reactive;

import ch.qos.logback.core.CoreConstants;
import jn0.e;
import jn0.t;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\u0003\u001a.\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a \u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\f\u0010\u0003\u001a \u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u0003\u001a(\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u000e\u0010\u0006\u001a\"\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@¢\u0006\u0004\b\u000f\u0010\u0003\u001a.\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087@¢\u0006\u0004\b\u0010\u0010\u000b\u001a4\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"T", "Lnr0/a;", "awaitFirst", "(Lnr0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "default", "awaitFirstOrDefault", "(Lnr0/a;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrNull", "Lkotlin/Function0;", "defaultValue", "awaitFirstOrElse", "(Lnr0/a;Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLast", "awaitSingle", "awaitSingleOrDefault", "awaitSingleOrNull", "awaitSingleOrElse", "Lkotlinx/coroutines/reactive/Mode;", "mode", "awaitOne", "(Lnr0/a;Lkotlinx/coroutines/reactive/Mode;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "signalName", "Ljn0/h0;", "gotSignalInTerminalStateException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "moreThanOneValueProvidedException", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/reactive/Mode;)V", "kotlinx-coroutines-reactive"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {52}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.awaitFirstOrElse(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {166}, m = "awaitSingleOrElse", n = {"defaultValue"}, s = {"L$0"})
    static final class C47791<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47791(Continuation<? super C47791> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.awaitSingleOrElse(null, null, this);
        }
    }

    public static final <T> Object awaitFirst(nr0.a<T> aVar, Continuation<? super T> continuation) {
        return awaitOne$default(aVar, Mode.FIRST, null, continuation, 2, null);
    }

    public static final <T> Object awaitFirstOrDefault(nr0.a<T> aVar, T t11, Continuation<? super T> continuation) {
        return awaitOne(aVar, Mode.FIRST_OR_DEFAULT, t11, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final <T> Object awaitFirstOrElse(nr0.a<T> aVar, wn0.a<? extends T> aVar2, Continuation<? super T> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objAwaitOne$default = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass2.label;
        if (i12 == 0) {
            t.b(objAwaitOne$default);
            Mode mode = Mode.FIRST_OR_DEFAULT;
            anonymousClass2.L$0 = aVar2;
            anonymousClass2.label = 1;
            objAwaitOne$default = awaitOne$default(aVar, mode, null, anonymousClass2, 2, null);
            if (objAwaitOne$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (wn0.a) anonymousClass2.L$0;
            t.b(objAwaitOne$default);
        }
        return objAwaitOne$default == null ? aVar2.invoke() : objAwaitOne$default;
    }

    public static final <T> Object awaitFirstOrNull(nr0.a<T> aVar, Continuation<? super T> continuation) {
        return awaitOne$default(aVar, Mode.FIRST_OR_DEFAULT, null, continuation, 2, null);
    }

    public static final <T> Object awaitLast(nr0.a<T> aVar, Continuation<? super T> continuation) {
        return awaitOne$default(aVar, Mode.LAST, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitOne(nr0.a<T> aVar, Mode mode, T t11, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ReactiveFlowKt.injectCoroutineContext(aVar, cancellableContinuationImpl.getContext()).subscribe(new AwaitKt$awaitOne$2$1(cancellableContinuationImpl, mode, t11));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object awaitOne$default(nr0.a aVar, Mode mode, Object obj, Continuation continuation, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        return awaitOne(aVar, mode, obj, continuation);
    }

    public static final <T> Object awaitSingle(nr0.a<T> aVar, Continuation<? super T> continuation) {
        return awaitOne$default(aVar, Mode.SINGLE, null, continuation, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @e
    public static final /* synthetic */ Object awaitSingleOrElse(nr0.a aVar, wn0.a aVar2, Continuation continuation) {
        C47791 c47791;
        if (continuation instanceof C47791) {
            c47791 = (C47791) continuation;
            int i11 = c47791.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47791.label = i11 - Integer.MIN_VALUE;
            } else {
                c47791 = new C47791(continuation);
            }
        } else {
            c47791 = new C47791(continuation);
        }
        C47791 c47792 = c47791;
        Object objAwaitOne$default = c47792.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47792.label;
        if (i12 == 0) {
            t.b(objAwaitOne$default);
            Mode mode = Mode.SINGLE_OR_DEFAULT;
            c47792.L$0 = aVar2;
            c47792.label = 1;
            objAwaitOne$default = awaitOne$default(aVar, mode, null, c47792, 2, null);
            if (objAwaitOne$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (wn0.a) c47792.L$0;
            t.b(objAwaitOne$default);
        }
        return objAwaitOne$default == null ? aVar2.invoke() : objAwaitOne$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gotSignalInTerminalStateException(CoroutineContext coroutineContext, String str) {
        CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, new IllegalStateException(CoreConstants.SINGLE_QUOTE_CHAR + str + "' was called after the publisher already signalled being in a terminal state"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moreThanOneValueProvidedException(CoroutineContext coroutineContext, Mode mode) {
        CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, new IllegalStateException("Only a single value was requested in '" + mode + "', but the publisher provided more"));
    }
}
