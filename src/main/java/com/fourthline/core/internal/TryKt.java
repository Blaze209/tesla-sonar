package com.fourthline.core.internal;

import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0007\u001aE\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001aQ\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u0006\u001aP\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0087@¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0006\u001aV\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0087@¢\u0006\u0004\b\u0015\u0010\u0013\u001a9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0006\u001a?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0006\u001a-\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002*\u00020\bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00028\u0000H\u0007¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010%\u001a\u00028\u0000H\u0002¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"A", "B", "Lcom/fourthline/core/internal/Try;", "Lkotlin/Function1;", "block", "flatMap", "(Lcom/fourthline/core/internal/Try;Lwn0/l;)Lcom/fourthline/core/internal/Try;", "map", "", "ifFailure", "ifSuccess", "handle", "(Lcom/fourthline/core/internal/Try;Lwn0/l;Lwn0/l;)Ljava/lang/Object;", "f", "handleSuccess", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "handleSuccessSuspended", "(Lcom/fourthline/core/internal/Try;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSuccessWith", "handleSuccessWithSuspended", "handleError", "handleErrorWith", "Lkotlin/Function0;", "default", "getOrDefault", "(Lcom/fourthline/core/internal/Try;Lwn0/a;)Ljava/lang/Object;", "getOrElse", "(Lcom/fourthline/core/internal/Try;Lwn0/l;)Ljava/lang/Object;", "orNull", "(Lcom/fourthline/core/internal/Try;)Ljava/lang/Object;", "", "failure", "(Ljava/lang/Throwable;)Lcom/fourthline/core/internal/Try;", "success", "(Ljava/lang/Object;)Lcom/fourthline/core/internal/Try;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TryKt {

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24081b;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f24080a = obj;
            this.f24081b |= Integer.MIN_VALUE;
            return TryKt.handleSuccessSuspended(null, null, this);
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24083b;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f24082a = obj;
            this.f24083b |= Integer.MIN_VALUE;
            return TryKt.handleSuccessWithSuspended(null, null, this);
        }
    }

    private static final Object a(Object obj) {
        return obj;
    }

    public static final Try failure(Throwable th2) {
        s.k(th2, "<this>");
        return new Try.Failure(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <A, B> Try<B> flatMap(Try<? extends A> r11, l<? super A, ? extends Try<? extends B>> block) {
        s.k(r11, "<this>");
        s.k(block, "block");
        if (r11 instanceof Try.Failure) {
            return r11;
        }
        if (r11 instanceof Try.Success) {
            return block.invoke((Object) ((Try.Success) r11).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <B> B getOrDefault(Try<? extends B> r11, wn0.a<? extends B> aVar) {
        s.k(r11, "<this>");
        s.k(aVar, "default");
        if (r11 instanceof Try.Failure) {
            ((Try.Failure) r11).getException();
            return aVar.invoke();
        }
        if (r11 instanceof Try.Success) {
            return (B) a(((Try.Success) r11).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <B> B getOrElse(Try<? extends B> r11, l<? super Throwable, ? extends B> lVar) {
        s.k(r11, "<this>");
        s.k(lVar, "default");
        if (r11 instanceof Try.Failure) {
            return lVar.invoke(((Try.Failure) r11).getException());
        }
        if (r11 instanceof Try.Success) {
            return (B) a(((Try.Success) r11).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <A, B> B handle(Try<? extends A> r11, l<? super Throwable, ? extends B> ifFailure, l<? super A, ? extends B> ifSuccess) {
        s.k(r11, "<this>");
        s.k(ifFailure, "ifFailure");
        s.k(ifSuccess, "ifSuccess");
        if (r11 instanceof Try.Failure) {
            return ifFailure.invoke(((Try.Failure) r11).getException());
        }
        if (r11 instanceof Try.Success) {
            return ifSuccess.invoke((Object) ((Try.Success) r11).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <B> Try<B> handleError(Try<? extends B> r11, l<? super Throwable, ? extends B> f11) {
        s.k(r11, "<this>");
        s.k(f11, "f");
        if (r11 instanceof Try.Failure) {
            return new Try.Success(f11.invoke(((Try.Failure) r11).getException()));
        }
        if (r11 instanceof Try.Success) {
            return new Try.Success(((Try.Success) r11).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <B> Try<B> handleErrorWith(Try<? extends B> r11, l<? super Throwable, ? extends Try<? extends B>> f11) {
        s.k(r11, "<this>");
        s.k(f11, "f");
        if (r11 instanceof Try.Failure) {
            return f11.invoke(((Try.Failure) r11).getException());
        }
        if (r11 instanceof Try.Success) {
            return new Try.Success(((Try.Success) r11).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <A, B> Try<B> handleSuccess(Try<? extends A> r11, l<? super A, ? extends B> f11) {
        s.k(r11, "<this>");
        s.k(f11, "f");
        if (r11 instanceof Try.Failure) {
            return new Try.Failure(((Try.Failure) r11).getException());
        }
        if (r11 instanceof Try.Success) {
            return new Try.Success(f11.invoke((Object) ((Try.Success) r11).getValue()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <A, B> Object handleSuccessSuspended(Try<? extends A> r11, p<? super A, ? super Continuation<? super B>, ? extends Object> pVar, Continuation<? super Try<? extends B>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f24081b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f24081b = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f24080a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f24081b;
        if (i12 == 0) {
            t.b(objInvoke);
            if (r11 instanceof Try.Failure) {
                return new Try.Failure(((Try.Failure) r11).getException());
            }
            if (!(r11 instanceof Try.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            a.a.Companion companion = (Object) ((Try.Success) r11).getValue();
            aVar.f24081b = 1;
            objInvoke = pVar.invoke(companion, aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objInvoke);
        }
        return new Try.Success(objInvoke);
    }

    public static final <A, B> Try<B> handleSuccessWith(Try<? extends A> r11, l<? super A, ? extends Try<? extends B>> f11) {
        s.k(r11, "<this>");
        s.k(f11, "f");
        if (r11 instanceof Try.Failure) {
            return new Try.Failure(((Try.Failure) r11).getException());
        }
        if (r11 instanceof Try.Success) {
            return f11.invoke((Object) ((Try.Success) r11).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <A, B> Object handleSuccessWithSuspended(Try<? extends A> r11, p<? super A, ? super Continuation<? super Try<? extends B>>, ? extends Object> pVar, Continuation<? super Try<? extends B>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f24083b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f24083b = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objInvoke = bVar.f24082a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f24083b;
        if (i12 == 0) {
            t.b(objInvoke);
            if (r11 instanceof Try.Failure) {
                return new Try.Failure(((Try.Failure) r11).getException());
            }
            if (!(r11 instanceof Try.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            a.a.Companion companion = (Object) ((Try.Success) r11).getValue();
            bVar.f24083b = 1;
            objInvoke = pVar.invoke(companion, bVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objInvoke);
        }
        return (Try) objInvoke;
    }

    public static final <A, B> Try<B> map(Try<? extends A> r11, final l<? super A, ? extends B> block) {
        s.k(r11, "<this>");
        s.k(block, "block");
        return flatMap(r11, new l() { // from class: com.fourthline.core.internal.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return TryKt.a(block, obj);
            }
        });
    }

    public static final <B> B orNull(Try<? extends B> r11) {
        s.k(r11, "<this>");
        return (B) getOrElse(r11, new l() { // from class: com.fourthline.core.internal.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return TryKt.a((Throwable) obj);
            }
        });
    }

    public static final <A> Try<A> success(A a11) {
        return new Try.Success(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a(Throwable it) {
        s.k(it, "it");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try a(l lVar, Object obj) {
        return new Try.Success(lVar.invoke(obj));
    }
}
