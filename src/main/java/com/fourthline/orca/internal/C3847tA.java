package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3847tA implements Uv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35603b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35605b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f35607d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f35605b = obj;
            this.f35607d |= Integer.MIN_VALUE;
            Object objA = C3847tA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3847tA(Object obj, long j11) {
        this.f35602a = obj;
        this.f35603b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Uv
    public Object a(Uv.a aVar, Continuation continuation) {
        a aVar2;
        C3847tA c3847tA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f35607d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f35607d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f35605b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f35607d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f35603b;
            aVar2.f35604a = this;
            aVar2.f35607d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3847tA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3847tA = (C3847tA) aVar2.f35604a;
            jn0.t.b(obj);
        }
        return c3847tA.f35602a;
    }

    public /* synthetic */ C3847tA(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
