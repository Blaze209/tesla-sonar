package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3120cA implements InterfaceC3703pv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30815b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30817b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f30819d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30817b = obj;
            this.f30819d |= Integer.MIN_VALUE;
            Object objA = C3120cA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3120cA(Object obj, long j11) {
        this.f30814a = obj;
        this.f30815b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3703pv
    public Object a(InterfaceC3703pv.a aVar, Continuation continuation) {
        a aVar2;
        C3120cA c3120cA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f30819d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f30819d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f30817b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f30819d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f30815b;
            aVar2.f30816a = this;
            aVar2.f30819d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3120cA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3120cA = (C3120cA) aVar2.f30816a;
            jn0.t.b(obj);
        }
        return c3120cA.f30814a;
    }

    public /* synthetic */ C3120cA(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
