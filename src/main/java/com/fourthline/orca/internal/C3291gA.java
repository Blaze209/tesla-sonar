package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3291gA implements InterfaceC3106bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31962b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31964b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31966d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31964b = obj;
            this.f31966d |= Integer.MIN_VALUE;
            Object objA = C3291gA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3291gA(Object obj, long j11) {
        this.f31961a = obj;
        this.f31962b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3106bw
    public Object a(InterfaceC3106bw.a aVar, Continuation continuation) {
        a aVar2;
        C3291gA c3291gA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f31966d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f31966d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f31964b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f31966d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f31962b;
            aVar2.f31963a = this;
            aVar2.f31966d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3291gA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3291gA = (C3291gA) aVar2.f31963a;
            jn0.t.b(obj);
        }
        return c3291gA.f31961a;
    }

    public /* synthetic */ C3291gA(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
