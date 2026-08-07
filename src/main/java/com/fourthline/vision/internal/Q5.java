package com.fourthline.vision.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Q5 implements InterfaceC4265q0, InterfaceC4306w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wn0.p f37903a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f37904a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f37906c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37904a = obj;
            this.f37906c |= Integer.MIN_VALUE;
            return Q5.this.consume((jn0.h0) null, (Continuation<? super jn0.h0>) this);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((jn0.h0) obj, (Continuation<? super jn0.h0>) continuation);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public void m86get() {
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super jn0.h0, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        this.f37903a = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object consume(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) throws AbstractC4255o4.a {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f37906c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f37906c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f37904a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f37906c;
        if (i12 == 0) {
            jn0.t.b(obj);
            wn0.p pVar = this.f37903a;
            if (pVar == null) {
                throw new AbstractC4255o4.a(EnumC4241m4.TAKE_SNAPSHOT_NOT_ALLOWED, null, 2, null);
            }
            jn0.h0 h0Var2 = jn0.h0.f84049a;
            aVar.f37906c = 1;
            if (pVar.invoke(h0Var2, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public /* bridge */ /* synthetic */ Object get() {
        m86get();
        return jn0.h0.f84049a;
    }
}
