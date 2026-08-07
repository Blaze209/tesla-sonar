package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.Set;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.vision.internal.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4225k2 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4232l2 f38499a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.k2$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38501b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Pair f38503d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Pair<? extends Try<? extends K5>, I5> pair, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f38503d = pair;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = C4225k2.this.new a(this.f38503d, continuation);
            aVar.f38501b = obj;
            return aVar;
        }

        @Override // wn0.p
        public final Object invoke(K5 k11, Continuation<? super InterfaceC4163c2> continuation) {
            return ((a) create(k11, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            K5 k11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38500a;
            if (i11 == 0) {
                jn0.t.b(obj);
                K5 k12 = (K5) this.f38501b;
                InterfaceC4232l2 interfaceC4232l2 = C4225k2.this.f38499a;
                I5 i12 = (I5) this.f38503d.f();
                this.f38501b = k12;
                this.f38500a = 1;
                Object objValidate = interfaceC4232l2.validate(k12, i12, this);
                if (objValidate == coroutine_suspended) {
                    return coroutine_suspended;
                }
                k11 = k12;
                obj = objValidate;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k11 = (K5) this.f38501b;
                jn0.t.b(obj);
            }
            Set set = (Set) obj;
            p013kotlin.jvm.internal.s.i(k11, "null cannot be cast to non-null type com.fourthline.vision.document.internal.domain.step.DocumentStepResult");
            InterfaceC4163c2 interfaceC4163c2 = (InterfaceC4163c2) k11;
            if (interfaceC4163c2 instanceof InterfaceC4163c2.a) {
                return InterfaceC4163c2.a.copy$default((InterfaceC4163c2.a) interfaceC4163c2, null, set, 1, null);
            }
            if (interfaceC4163c2 instanceof InterfaceC4163c2.b) {
                return InterfaceC4163c2.b.copy$default((InterfaceC4163c2.b) interfaceC4163c2, null, null, set, 3, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C4225k2(InterfaceC4232l2 documentValidator) {
        p013kotlin.jvm.internal.s.k(documentValidator, "documentValidator");
        this.f38499a = documentValidator;
    }

    private final boolean isTryStepResultSupported(Try<? extends K5> r11) {
        if (r11 instanceof Try.Failure) {
            return false;
        }
        if (r11 instanceof Try.Success) {
            return ((Try.Success) r11).getValue() instanceof InterfaceC4163c2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Pair<? extends Try<? extends K5>, I5>) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    public Object process(Pair<? extends Try<? extends K5>, I5> pair, Continuation<? super Try<? extends K5>> continuation) {
        Try<? extends K5> tryE = pair.e();
        if (!isTryStepResultSupported(tryE)) {
            return tryE;
        }
        Object objHandleSuccessSuspended = TryKt.handleSuccessSuspended(tryE, new a(pair, null), continuation);
        return objHandleSuccessSuspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleSuccessSuspended : (Try) objHandleSuccessSuspended;
    }
}
