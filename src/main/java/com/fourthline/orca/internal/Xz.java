package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Xz implements InterfaceC3559mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f29781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29782b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29784b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f29786d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f29784b = obj;
            this.f29786d |= Integer.MIN_VALUE;
            Object objA = Xz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Xz(Object obj, long j11) {
        this.f29781a = obj;
        this.f29782b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3559mg
    public Object a(InterfaceC3559mg.a aVar, Continuation continuation) {
        a aVar2;
        Xz xz2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f29786d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f29786d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f29784b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f29786d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f29782b;
            aVar2.f29783a = this;
            aVar2.f29786d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            xz2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xz2 = (Xz) aVar2.f29783a;
            jn0.t.b(obj);
        }
        return xz2.f29781a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Xz(jn0.s sVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            sVar = jn0.s.a(jn0.s.b(C3602ng.f33939a));
        }
        this(sVar.getValue(), (i11 & 2) != 0 ? 1000L : j11);
    }
}
