package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3248fA implements Zv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31649b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31651b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31653d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31651b = obj;
            this.f31653d |= Integer.MIN_VALUE;
            Object objA = C3248fA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3248fA(Object obj, long j11) {
        this.f31648a = obj;
        this.f31649b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Zv
    public Object a(Zv.a aVar, Continuation continuation) {
        a aVar2;
        C3248fA c3248fA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f31653d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f31653d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f31651b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f31653d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f31649b;
            aVar2.f31650a = this;
            aVar2.f31653d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3248fA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3248fA = (C3248fA) aVar2.f31650a;
            jn0.t.b(obj);
        }
        return c3248fA.f31648a;
    }

    public /* synthetic */ C3248fA(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
