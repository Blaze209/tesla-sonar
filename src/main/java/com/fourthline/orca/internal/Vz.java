package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Vz implements Vf {

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29377a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29379c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f29377a = obj;
            this.f29379c |= Integer.MIN_VALUE;
            Object objA = Vz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3500l6
    public void a(InterfaceC3543m6 request) {
        p013kotlin.jvm.internal.s.k(request, "request");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Vf
    public Object a(C3304gh c3304gh, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f29379c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f29379c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f29377a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f29379c;
        if (i12 == 0) {
            jn0.t.b(obj);
            aVar.f29379c = 1;
            if (DelayKt.delay(1000L, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.h0.f84049a);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3500l6
    public Flow a(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        return FlowKt.flowOf(new C3629o6(identifier, new InterfaceC3500l6.a.d("Success")));
    }
}
