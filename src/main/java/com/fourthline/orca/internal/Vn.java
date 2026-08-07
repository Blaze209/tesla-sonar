package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
final class Vn implements EidServiceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Vn f29137a = new Vn();

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29138a;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f29138a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            throw Vn.f29137a.a();
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29139a;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f29139a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            throw Vn.f29137a.a();
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29140a;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f29140a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            throw Vn.f29137a.a();
        }
    }

    private Vn() {
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    /* JADX INFO: renamed from: acceptAccessRights-IoAF18A */
    public Object mo82acceptAccessRightsIoAF18A(Continuation continuation) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(a()));
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public Object authenticateWithCan(String str, Continuation continuation) {
        return FlowKt.flow(new a(null));
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public Object authenticateWithPin(String str, Continuation continuation) {
        return FlowKt.flow(new b(null));
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public void disconnect() {
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    /* JADX INFO: renamed from: fetchAccessRights-gIAlu-s */
    public Object mo83fetchAccessRightsgIAlus(String str, Continuation continuation) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(a()));
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public boolean isAvailable() {
        return false;
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public Object retryAuthenticateWithPin(String str, Continuation continuation) {
        return FlowKt.flow(new c(null));
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    /* JADX INFO: renamed from: startProcess-gIAlu-s */
    public Object mo84startProcessgIAlus(boolean z11, Continuation continuation) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnsupportedOperationException a() {
        return new UnsupportedOperationException("eID functionality is not available. Add ':fourthline-eid' to dependencies to enable it.");
    }
}
