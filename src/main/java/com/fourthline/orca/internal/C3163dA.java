package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3163dA implements InterfaceC3788rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31086b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31088b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31090d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31088b = obj;
            this.f31090d |= Integer.MIN_VALUE;
            Object objA = C3163dA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3163dA(Object obj, long j11) {
        this.f31085a = obj;
        this.f31086b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3788rv
    public Object a(InterfaceC3788rv.a aVar, Continuation continuation) {
        a aVar2;
        C3163dA c3163dA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f31090d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f31090d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f31088b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f31090d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f31086b;
            aVar2.f31087a = this;
            aVar2.f31090d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3163dA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3163dA = (C3163dA) aVar2.f31087a;
            jn0.t.b(obj);
        }
        return c3163dA.f31085a;
    }
}
