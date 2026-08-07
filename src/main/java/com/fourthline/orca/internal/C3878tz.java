package com.fourthline.orca.internal;

import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3878tz implements ED {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Of f35772a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tz$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35774b;

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
            a aVar = C3878tz.this.new a(continuation);
            aVar.f35774b = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35773a;
            if (i11 == 0) {
                jn0.t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f35774b;
                FD.a aVar = new FD.a(C3878tz.this.f35772a);
                this.f35773a = 1;
                if (flowCollector.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    public C3878tz(Of flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f35772a = flowAction;
    }

    @Override // com.fourthline.orca.internal.ED
    public Object a(OD od2, Continuation continuation) {
        return FlowKt.flow(new a(null));
    }
}
