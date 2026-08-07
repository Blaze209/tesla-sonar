package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Lz implements InterfaceC3625o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26872b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26874b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26876d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26874b = obj;
            this.f26876d |= Integer.MIN_VALUE;
            Object objA = Lz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Lz(Object obj, long j11) {
        this.f26871a = obj;
        this.f26872b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3625o2
    public Object a(InterfaceC3625o2.a aVar, Continuation continuation) {
        a aVar2;
        Lz lz2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f26876d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f26876d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f26874b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f26876d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f26872b;
            aVar2.f26873a = this;
            aVar2.f26876d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lz2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lz2 = (Lz) aVar2.f26873a;
            jn0.t.b(obj);
        }
        return lz2.f26871a;
    }

    public /* synthetic */ Lz(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
