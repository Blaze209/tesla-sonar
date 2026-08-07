package com.fourthline.orca.internal;

import java.util.Map;
import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3334hA implements InterfaceC3233ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32241c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32244c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f32246e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32244c = obj;
            this.f32246e |= Integer.MIN_VALUE;
            Object objA = C3334hA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3334hA(Object obj, Map specificResults, long j11) {
        p013kotlin.jvm.internal.s.k(specificResults, "specificResults");
        this.f32239a = obj;
        this.f32240b = specificResults;
        this.f32241c = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3233ew
    public Object a(InterfaceC3233ew.a aVar, Continuation continuation) {
        a aVar2;
        C3334hA c3334hA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f32246e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f32246e = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f32244c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f32246e;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f32241c;
            aVar2.f32242a = this;
            aVar2.f32243b = aVar;
            aVar2.f32246e = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3334hA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (InterfaceC3233ew.a) aVar2.f32243b;
            c3334hA = (C3334hA) aVar2.f32242a;
            jn0.t.b(obj);
        }
        jn0.s sVar = (jn0.s) c3334hA.f32240b.get(aVar.a());
        return sVar != null ? sVar.getValue() : c3334hA.f32239a;
    }

    public /* synthetic */ C3334hA(Object obj, Map map, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? p013kotlin.collections.v0.i() : map, (i11 & 4) != 0 ? 1000L : j11);
    }
}
