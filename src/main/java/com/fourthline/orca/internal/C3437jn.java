package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3437jn implements InterfaceC3645og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3645og f32820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f32821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32822c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jn$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32823a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32825c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32823a = obj;
            this.f32825c |= Integer.MIN_VALUE;
            Object objA = C3437jn.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3437jn(InterfaceC3645og delegate, wn0.a skipPersonFlowUseCase, int i11) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(skipPersonFlowUseCase, "skipPersonFlowUseCase");
        this.f32820a = delegate;
        this.f32821b = skipPersonFlowUseCase;
        this.f32822c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3645og
    public Object a(InterfaceC3645og.a aVar, Continuation continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f32825c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f32825c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f32823a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f32825c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        if (!a(this.f32820a) && !((Boolean) this.f32821b.invoke()).booleanValue()) {
            InterfaceC3645og.c.d dVar = new InterfaceC3645og.c.d("person", new Qp(this.f32822c));
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(new InterfaceC3645og.b(dVar));
        }
        InterfaceC3645og interfaceC3645og = this.f32820a;
        aVar2.f32825c = 1;
        Object objA = interfaceC3645og.a(aVar, aVar2);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    private final boolean a(InterfaceC3645og interfaceC3645og) {
        return interfaceC3645og instanceof C3251fD;
    }
}
