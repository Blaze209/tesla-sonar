package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3890uA implements XC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35824b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.uA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35826b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f35828d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f35826b = obj;
            this.f35828d |= Integer.MIN_VALUE;
            Object objA = C3890uA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3890uA(Object obj, long j11) {
        this.f35823a = obj;
        this.f35824b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.XC
    public Object a(XC.a aVar, Continuation continuation) {
        a aVar2;
        C3890uA c3890uA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f35828d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f35828d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f35826b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f35828d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f35824b;
            aVar2.f35825a = this;
            aVar2.f35828d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3890uA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3890uA = (C3890uA) aVar2.f35825a;
            jn0.t.b(obj);
        }
        return c3890uA.f35823a;
    }

    public /* synthetic */ C3890uA(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
