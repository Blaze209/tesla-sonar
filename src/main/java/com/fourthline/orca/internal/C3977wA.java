package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3977wA implements InterfaceC3508lE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36375b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36377b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36379d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36377b = obj;
            this.f36379d |= Integer.MIN_VALUE;
            Object objA = C3977wA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3977wA(Object obj, long j11) {
        this.f36374a = obj;
        this.f36375b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3508lE
    public Object a(InterfaceC3508lE.a aVar, Continuation continuation) {
        a aVar2;
        C3977wA c3977wA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f36379d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f36379d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f36377b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f36379d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f36375b;
            aVar2.f36376a = this;
            aVar2.f36379d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3977wA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3977wA = (C3977wA) aVar2.f36376a;
            jn0.t.b(obj);
        }
        return c3977wA.f36374a;
    }

    public /* synthetic */ C3977wA(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
