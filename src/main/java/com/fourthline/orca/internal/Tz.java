package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Tz implements InterfaceC3087bd {

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27983a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27985c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27983a = obj;
            this.f27985c |= Integer.MIN_VALUE;
            Object objA = Tz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3087bd
    public Object a(InterfaceC3087bd.a aVar, Continuation continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f27985c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f27985c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f27983a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f27985c;
        if (i12 == 0) {
            jn0.t.b(obj);
            aVar2.f27985c = 1;
            if (DelayKt.delay(2000L, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(InterfaceC3087bd.b.a.f30620a);
    }
}
