package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Nz implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27107b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27109b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27111d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27109b = obj;
            this.f27111d |= Integer.MIN_VALUE;
            Object objA = Nz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Nz(Object obj, long j11) {
        this.f27106a = obj;
        this.f27107b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.N2
    public Object a(N2.c cVar, Continuation continuation) {
        a aVar;
        Nz nz2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f27111d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f27111d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f27109b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f27111d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f27107b;
            aVar.f27108a = this;
            aVar.f27111d = 1;
            if (DelayKt.delay(j11, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            nz2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nz2 = (Nz) aVar.f27108a;
            jn0.t.b(obj);
        }
        return nz2.f27106a;
    }

    public /* synthetic */ Nz(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
