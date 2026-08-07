package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Jz implements InterfaceC3624o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26511b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26513b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26515d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26513b = obj;
            this.f26515d |= Integer.MIN_VALUE;
            Object objA = Jz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Jz(Object obj, long j11) {
        this.f26510a = obj;
        this.f26511b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3624o1
    public Object a(InterfaceC3624o1.b bVar, Continuation continuation) {
        a aVar;
        Jz jz2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f26515d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f26515d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f26513b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f26515d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f26511b;
            aVar.f26512a = this;
            aVar.f26515d = 1;
            if (DelayKt.delay(j11, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jz2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jz2 = (Jz) aVar.f26512a;
            jn0.t.b(obj);
        }
        return jz2.f26510a;
    }

    public /* synthetic */ Jz(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
