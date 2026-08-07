package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Mz implements InterfaceC3839t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26985b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26987b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26989d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26987b = obj;
            this.f26989d |= Integer.MIN_VALUE;
            Object objA = Mz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Mz(Object obj, long j11) {
        this.f26984a = obj;
        this.f26985b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3839t2
    public Object a(InterfaceC3839t2.b bVar, Continuation continuation) {
        a aVar;
        Mz mz2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f26989d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f26989d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f26987b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f26989d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f26985b;
            aVar.f26986a = this;
            aVar.f26989d = 1;
            if (DelayKt.delay(j11, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mz2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mz2 = (Mz) aVar.f26986a;
            jn0.t.b(obj);
        }
        return mz2.f26984a;
    }

    public /* synthetic */ Mz(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
