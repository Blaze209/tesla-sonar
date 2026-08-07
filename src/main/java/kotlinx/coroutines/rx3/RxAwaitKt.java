package kotlinx.coroutines.rx3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.AwaitAction;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import java.util.NoSuchElementException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a'\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a-\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\r\u001a%\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010\u001a3\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0010\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0010\u001a\u001f\u0010\u001c\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b9¨\u0006\""}, d2 = {"Lio/reactivex/rxjava3/core/f;", "Ljn0/h0;", AwaitAction.ACTION_TYPE, "(Lio/reactivex/rxjava3/core/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lio/reactivex/rxjava3/core/n;", "awaitSingleOrNull", "(Lio/reactivex/rxjava3/core/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSingle", "default", "awaitOrDefault", "(Lio/reactivex/rxjava3/core/n;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/y;", "(Lio/reactivex/rxjava3/core/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/r;", "awaitFirst", "(Lio/reactivex/rxjava3/core/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrDefault", "(Lio/reactivex/rxjava3/core/r;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstOrNull", "Lkotlin/Function0;", "defaultValue", "awaitFirstOrElse", "(Lio/reactivex/rxjava3/core/r;Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLast", "Lkotlinx/coroutines/CancellableContinuation;", "Lam0/b;", DateTokenConverter.CONVERTER_KEY, "disposeOnCancellation", "(Lkotlinx/coroutines/CancellableContinuation;Lam0/b;)V", "Lkotlinx/coroutines/rx3/Mode;", "mode", "awaitOne", "(Lio/reactivex/rxjava3/core/r;Lkotlinx/coroutines/rx3/Mode;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxAwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxAwaitKt$awaitFirstOrElse$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {174}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
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
            return RxAwaitKt.awaitFirstOrElse(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxAwaitKt$awaitOrDefault$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {105}, m = "awaitOrDefault", n = {"default"}, s = {"L$0"})
    static final class C47811<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47811(Continuation<? super C47811> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RxAwaitKt.awaitOrDefault(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxAwaitKt$awaitSingle$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {}, l = {59}, m = "awaitSingle", n = {}, s = {})
    static final class C47821<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C47821(Continuation<? super C47821> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RxAwaitKt.awaitSingle((io.reactivex.rxjava3.core.n) null, this);
        }
    }

    public static final <T> Object awaitFirst(r<T> rVar, Continuation<? super T> continuation) {
        Object objAwaitOne$default = awaitOne$default(rVar, Mode.FIRST, null, continuation, 2, null);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objAwaitOne$default;
    }

    public static final <T> Object awaitFirstOrDefault(r<T> rVar, T t11, Continuation<? super T> continuation) {
        Object objAwaitOne = awaitOne(rVar, Mode.FIRST_OR_DEFAULT, t11, continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objAwaitOne;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final <T> Object awaitFirstOrElse(r<T> rVar, wn0.a<? extends T> aVar, Continuation<? super T> continuation) {
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
            anonymousClass2.L$0 = aVar;
            anonymousClass2.label = 1;
            objAwaitOne$default = awaitOne$default(rVar, mode, null, anonymousClass2, 2, null);
            if (objAwaitOne$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (wn0.a) anonymousClass2.L$0;
            t.b(objAwaitOne$default);
        }
        return objAwaitOne$default == null ? aVar.invoke() : objAwaitOne$default;
    }

    public static final <T> Object awaitFirstOrNull(r<T> rVar, Continuation<? super T> continuation) {
        return awaitOne$default(rVar, Mode.FIRST_OR_DEFAULT, null, continuation, 2, null);
    }

    public static final <T> Object awaitLast(r<T> rVar, Continuation<? super T> continuation) {
        Object objAwaitOne$default = awaitOne$default(rVar, Mode.LAST, null, continuation, 2, null);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objAwaitOne$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitOne(r<T> rVar, final Mode mode, final T t11, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        rVar.a(new s<T>() { // from class: kotlinx.coroutines.rx3.RxAwaitKt$awaitOne$2$1
            private boolean seenValue;
            private am0.b subscription;
            private T value;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Mode.values().length];
                    try {
                        iArr[Mode.FIRST.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Mode.LAST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Mode.SINGLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onComplete() {
                if (this.seenValue) {
                    if (cancellableContinuationImpl.isActive()) {
                        CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        cancellableContinuation.resumeWith(jn0.s.b(this.value));
                        return;
                    }
                    return;
                }
                if (mode == Mode.FIRST_OR_DEFAULT) {
                    CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl;
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    cancellableContinuation2.resumeWith(jn0.s.b(t11));
                } else if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<T> cancellableContinuation3 = cancellableContinuationImpl;
                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                    cancellableContinuation3.resumeWith(jn0.s.b(t.a(new NoSuchElementException("No value received via onNext for " + mode))));
                }
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onError(Throwable e11) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(t.a(e11)));
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onNext(T t12) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                am0.b bVar = null;
                if (i11 == 1 || i11 == 2) {
                    if (this.seenValue) {
                        return;
                    }
                    this.seenValue = true;
                    cancellableContinuationImpl.resumeWith(jn0.s.b(t12));
                    am0.b bVar2 = this.subscription;
                    if (bVar2 == null) {
                        p013kotlin.jvm.internal.s.B("subscription");
                    } else {
                        bVar = bVar2;
                    }
                    bVar.dispose();
                    return;
                }
                if (i11 != 3 && i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (mode != Mode.SINGLE || !this.seenValue) {
                    this.value = t12;
                    this.seenValue = true;
                    return;
                }
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    cancellableContinuation.resumeWith(jn0.s.b(t.a(new IllegalArgumentException("More than one onNext value for " + mode))));
                }
                am0.b bVar3 = this.subscription;
                if (bVar3 == null) {
                    p013kotlin.jvm.internal.s.B("subscription");
                } else {
                    bVar = bVar3;
                }
                bVar.dispose();
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onSubscribe(final am0.b sub) {
                this.subscription = sub;
                cancellableContinuationImpl.invokeOnCancellation(new wn0.l<Throwable, h0>() { // from class: kotlinx.coroutines.rx3.RxAwaitKt$awaitOne$2$1$onSubscribe$1
                    @Override // wn0.l
                    public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                        invoke2(th2);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        sub.dispose();
                    }
                });
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    static /* synthetic */ Object awaitOne$default(r rVar, Mode mode, Object obj, Continuation continuation, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        return awaitOne(rVar, mode, obj, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @jn0.e
    public static final /* synthetic */ Object awaitOrDefault(io.reactivex.rxjava3.core.n nVar, Object obj, Continuation continuation) {
        C47811 c47811;
        if (continuation instanceof C47811) {
            c47811 = (C47811) continuation;
            int i11 = c47811.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47811.label = i11 - Integer.MIN_VALUE;
            } else {
                c47811 = new C47811(continuation);
            }
        } else {
            c47811 = new C47811(continuation);
        }
        Object objAwaitSingleOrNull = c47811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47811.label;
        if (i12 == 0) {
            t.b(objAwaitSingleOrNull);
            c47811.L$0 = obj;
            c47811.label = 1;
            objAwaitSingleOrNull = awaitSingleOrNull(nVar, c47811);
            if (objAwaitSingleOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c47811.L$0;
            t.b(objAwaitSingleOrNull);
        }
        return objAwaitSingleOrNull == null ? obj : objAwaitSingleOrNull;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object awaitSingle(io.reactivex.rxjava3.core.n<T> nVar, Continuation<? super T> continuation) {
        C47821 c47821;
        if (continuation instanceof C47821) {
            c47821 = (C47821) continuation;
            int i11 = c47821.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47821.label = i11 - Integer.MIN_VALUE;
            } else {
                c47821 = new C47821(continuation);
            }
        } else {
            c47821 = new C47821(continuation);
        }
        Object objAwaitSingleOrNull = c47821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47821.label;
        if (i12 == 0) {
            t.b(objAwaitSingleOrNull);
            c47821.label = 1;
            objAwaitSingleOrNull = awaitSingleOrNull(nVar, c47821);
            if (objAwaitSingleOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objAwaitSingleOrNull);
        }
        if (objAwaitSingleOrNull != null) {
            return objAwaitSingleOrNull;
        }
        throw new NoSuchElementException();
    }

    public static final <T> Object awaitSingleOrNull(io.reactivex.rxjava3.core.n<T> nVar, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        nVar.a(new io.reactivex.rxjava3.core.l<T>() { // from class: kotlinx.coroutines.rx3.RxAwaitKt$awaitSingleOrNull$2$1
            @Override // io.reactivex.rxjava3.core.l
            public void onComplete() {
                cancellableContinuationImpl.resumeWith(jn0.s.b(null));
            }

            @Override // io.reactivex.rxjava3.core.l
            public void onError(Throwable error) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(t.a(error)));
            }

            @Override // io.reactivex.rxjava3.core.l
            public void onSubscribe(am0.b d11) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl, d11);
            }

            @Override // io.reactivex.rxjava3.core.l
            public void onSuccess(T t11) {
                cancellableContinuationImpl.resumeWith(jn0.s.b(t11));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final void disposeOnCancellation(CancellableContinuation<?> cancellableContinuation, final am0.b bVar) {
        cancellableContinuation.invokeOnCancellation(new wn0.l() { // from class: kotlinx.coroutines.rx3.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return RxAwaitKt.disposeOnCancellation$lambda$3(bVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 disposeOnCancellation$lambda$3(am0.b bVar, Throwable th2) {
        bVar.dispose();
        return h0.f84049a;
    }

    public static final Object await(io.reactivex.rxjava3.core.f fVar, Continuation<? super h0> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        fVar.b(new io.reactivex.rxjava3.core.d() { // from class: kotlinx.coroutines.rx3.RxAwaitKt$await$2$1
            @Override // io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.l
            public void onComplete() {
                CancellableContinuation<h0> cancellableContinuation = cancellableContinuationImpl;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(h0.f84049a));
            }

            @Override // io.reactivex.rxjava3.core.d
            public void onError(Throwable e11) {
                CancellableContinuation<h0> cancellableContinuation = cancellableContinuationImpl;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(t.a(e11)));
            }

            @Override // io.reactivex.rxjava3.core.d
            public void onSubscribe(am0.b d11) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl, d11);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }

    public static final <T> Object awaitSingle(r<T> rVar, Continuation<? super T> continuation) {
        Object objAwaitOne$default = awaitOne$default(rVar, Mode.SINGLE, null, continuation, 2, null);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objAwaitOne$default;
    }

    public static final <T> Object await(y<T> yVar, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        yVar.a(new w<T>() { // from class: kotlinx.coroutines.rx3.RxAwaitKt$await$5$1
            @Override // io.reactivex.rxjava3.core.w
            public void onError(Throwable error) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(t.a(error)));
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onSubscribe(am0.b d11) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl, d11);
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onSuccess(T t11) {
                cancellableContinuationImpl.resumeWith(jn0.s.b(t11));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
