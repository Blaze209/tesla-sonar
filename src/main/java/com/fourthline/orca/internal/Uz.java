package com.fourthline.orca.internal;

import java.util.LinkedList;
import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Uz implements InterfaceC2891Je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f28940a = new LinkedList();

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28942b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f28944d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f28942b = obj;
            this.f28944d |= Integer.MIN_VALUE;
            Object objA = Uz.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC2891Je
    public Object a(InterfaceC2891Je.a aVar, Continuation continuation) {
        a aVar2;
        Uz uz2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f28944d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f28944d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f28942b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f28944d;
        if (i12 == 0) {
            jn0.t.b(obj);
            aVar2.f28941a = this;
            aVar2.f28944d = 1;
            if (DelayKt.delay(1000L, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            uz2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uz2 = (Uz) aVar2.f28941a;
            jn0.t.b(obj);
        }
        ZD zd2 = (ZD) uz2.f28940a.poll();
        if (zd2 != null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(zd2));
        }
        jn0.s.Companion companion2 = jn0.s.INSTANCE;
        return jn0.s.b(new InterfaceC2891Je.b.a("https://test.governikus-eid.de/AusweisAuskunft/WebServiceRequesterServlet?mode=json"));
    }
}
