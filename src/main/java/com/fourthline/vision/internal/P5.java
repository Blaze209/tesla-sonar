package com.fourthline.vision.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class P5 implements G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4306w0 f37890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37891b;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37892a;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return P5.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f37892a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            P5.this.f37891b = true;
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) {
            return ((a) create(h0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public P5(InterfaceC4306w0 triggerDataSource) {
        p013kotlin.jvm.internal.s.k(triggerDataSource, "triggerDataSource");
        this.f37890a = triggerDataSource;
    }

    @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((jn0.h0) obj, (Continuation<? super jn0.h0>) continuation);
    }

    @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.F5
    public void start() {
        this.f37891b = false;
        this.f37890a.subscribe(new a(null));
    }

    @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.F5
    public void stop() {
        this.f37891b = false;
        this.f37890a.subscribe(null);
    }

    public Object consume(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) throws AbstractC4255o4.f.a {
        if (this.f37891b) {
            return jn0.h0.f84049a;
        }
        throw AbstractC4255o4.f.a.f38693a;
    }
}
