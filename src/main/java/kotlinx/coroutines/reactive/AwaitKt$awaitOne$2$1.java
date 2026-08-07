package kotlinx.coroutines.reactive;

import java.util.NoSuchElementException;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import nr0.c;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import wn0.l;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"kotlinx/coroutines/reactive/AwaitKt$awaitOne$2$1", "Lnr0/b;", "", "signalName", "", "tryEnterTerminalState", "(Ljava/lang/String;)Z", "Lkotlin/Function0;", "Ljn0/h0;", "block", "withSubscriptionLock", "(Lwn0/a;)V", "Lnr0/c;", "sub", "onSubscribe", "(Lnr0/c;)V", "t", "onNext", "(Ljava/lang/Object;)V", "onComplete", "()V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "subscription", "Lnr0/c;", "value", "Ljava/lang/Object;", "seenValue", "Z", "inTerminalState", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AwaitKt$awaitOne$2$1<T> implements nr0.b<T> {
    final /* synthetic */ CancellableContinuation<T> $cont;
    final /* synthetic */ T $default;
    final /* synthetic */ Mode $mode;
    private boolean inTerminalState;
    private boolean seenValue;
    private c subscription;
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
            try {
                iArr[Mode.SINGLE_OR_DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AwaitKt$awaitOne$2$1(CancellableContinuation<? super T> cancellableContinuation, Mode mode, T t11) {
        this.$cont = cancellableContinuation;
        this.$mode = mode;
        this.$default = t11;
    }

    private final boolean tryEnterTerminalState(String signalName) {
        if (this.inTerminalState) {
            AwaitKt.gotSignalInTerminalStateException(this.$cont.getContext(), signalName);
            return false;
        }
        this.inTerminalState = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void withSubscriptionLock(wn0.a<h0> block) {
        block.invoke();
    }

    @Override // nr0.b
    public void onComplete() {
        if (tryEnterTerminalState("onComplete")) {
            if (this.seenValue) {
                Mode mode = this.$mode;
                if (mode == Mode.FIRST_OR_DEFAULT || mode == Mode.FIRST || !this.$cont.isActive()) {
                    return;
                }
                CancellableContinuation<T> cancellableContinuation = this.$cont;
                s.Companion companion = s.INSTANCE;
                cancellableContinuation.resumeWith(s.b(this.value));
                return;
            }
            Mode mode2 = this.$mode;
            if (mode2 == Mode.FIRST_OR_DEFAULT || mode2 == Mode.SINGLE_OR_DEFAULT) {
                CancellableContinuation<T> cancellableContinuation2 = this.$cont;
                s.Companion companion2 = s.INSTANCE;
                cancellableContinuation2.resumeWith(s.b(this.$default));
            } else if (this.$cont.isActive()) {
                CancellableContinuation<T> cancellableContinuation3 = this.$cont;
                s.Companion companion3 = s.INSTANCE;
                cancellableContinuation3.resumeWith(s.b(t.a(new NoSuchElementException("No value received via onNext for " + this.$mode))));
            }
        }
    }

    @Override // nr0.b
    public void onError(Throwable e11) {
        if (tryEnterTerminalState("onError")) {
            CancellableContinuation<T> cancellableContinuation = this.$cont;
            s.Companion companion = s.INSTANCE;
            cancellableContinuation.resumeWith(s.b(t.a(e11)));
        }
    }

    @Override // nr0.b
    public void onNext(T t11) {
        final c cVar = this.subscription;
        CancellableContinuation<T> cancellableContinuation = this.$cont;
        if (cVar == null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(cancellableContinuation.getContext(), new IllegalStateException("'onNext' was called before 'onSubscribe'"));
            return;
        }
        if (this.inTerminalState) {
            AwaitKt.gotSignalInTerminalStateException(cancellableContinuation.getContext(), "onNext");
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.$mode.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (this.seenValue) {
                AwaitKt.moreThanOneValueProvidedException(this.$cont.getContext(), this.$mode);
                return;
            }
            this.seenValue = true;
            withSubscriptionLock(new wn0.a<h0>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onNext$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    cVar.cancel();
                }
            });
            this.$cont.resumeWith(s.b(t11));
            return;
        }
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        Mode mode = this.$mode;
        if ((mode != Mode.SINGLE && mode != Mode.SINGLE_OR_DEFAULT) || !this.seenValue) {
            this.value = t11;
            this.seenValue = true;
            return;
        }
        withSubscriptionLock(new wn0.a<h0>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onNext$2
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                cVar.cancel();
            }
        });
        if (this.$cont.isActive()) {
            CancellableContinuation<T> cancellableContinuation2 = this.$cont;
            s.Companion companion = s.INSTANCE;
            cancellableContinuation2.resumeWith(s.b(t.a(new IllegalArgumentException("More than one onNext value for " + this.$mode))));
        }
    }

    @Override // nr0.b
    public void onSubscribe(final c sub) {
        if (this.subscription != null) {
            withSubscriptionLock(new wn0.a<h0>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    sub.cancel();
                }
            });
            return;
        }
        this.subscription = sub;
        this.$cont.invokeOnCancellation(new l<Throwable, h0>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                invoke2(th2);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                AwaitKt$awaitOne$2$1 awaitKt$awaitOne$2$1 = this.this$0;
                final c cVar = sub;
                awaitKt$awaitOne$2$1.withSubscriptionLock(new wn0.a<h0>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2.1
                    @Override // wn0.a
                    public /* bridge */ /* synthetic */ h0 invoke() {
                        invoke2();
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        cVar.cancel();
                    }
                });
            }
        });
        final Mode mode = this.$mode;
        withSubscriptionLock(new wn0.a<h0>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$3
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c cVar = sub;
                Mode mode2 = mode;
                cVar.request((mode2 == Mode.FIRST || mode2 == Mode.FIRST_OR_DEFAULT) ? 1L : Long.MAX_VALUE);
            }
        });
    }
}
