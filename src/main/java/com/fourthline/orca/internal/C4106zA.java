package com.fourthline.orca.internal;

import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4106zA implements InterfaceC3852tF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f37230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37231b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37233b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f37235d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37233b = obj;
            this.f37235d |= Integer.MIN_VALUE;
            Object objA = C4106zA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C4106zA(Object obj, long j11) {
        this.f37230a = obj;
        this.f37231b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3852tF
    public Object a(InterfaceC3852tF.a aVar, Continuation continuation) {
        a aVar2;
        C4106zA c4106zA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f37235d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f37235d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f37233b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f37235d;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f37231b;
            aVar2.f37232a = this;
            aVar2.f37235d = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c4106zA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4106zA = (C4106zA) aVar2.f37232a;
            jn0.t.b(obj);
        }
        return c4106zA.f37230a;
    }

    public /* synthetic */ C4106zA(Object obj, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 1000L : j11);
    }
}
