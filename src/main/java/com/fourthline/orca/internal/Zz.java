package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Zz implements InterfaceC3700ps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30246b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30248b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f30250d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30248b = obj;
            this.f30250d |= Integer.MIN_VALUE;
            Object objA = Zz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Zz(Object obj, long j11) {
        this.f30245a = obj;
        this.f30246b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3700ps
    public Object a(InterfaceC3700ps.a aVar, Continuation continuation) {
        a aVar2;
        Zz zz2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f30250d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f30250d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f30248b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f30250d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f30246b;
            aVar2.f30247a = this;
            aVar2.f30250d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zz2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zz2 = (Zz) aVar2.f30247a;
            jn0.t.b(obj);
        }
        return zz2.f30245a;
    }

    public /* synthetic */ Zz(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
