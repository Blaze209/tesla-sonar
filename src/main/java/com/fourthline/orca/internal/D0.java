package com.fourthline.orca.internal;

import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 implements Bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SendChannel f25300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReceiveChannel f25301b;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f25302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25303b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25305d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f25303b = obj;
            this.f25305d |= Integer.MIN_VALUE;
            return D0.this.a(null, this);
        }
    }

    public D0(SendChannel popupEffectChannel, ReceiveChannel popupEventChannel) {
        p013kotlin.jvm.internal.s.k(popupEffectChannel, "popupEffectChannel");
        p013kotlin.jvm.internal.s.k(popupEventChannel, "popupEventChannel");
        this.f25300a = popupEffectChannel;
        this.f25301b = popupEventChannel;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Bs
    public Object a(InterfaceC4001ws interfaceC4001ws, Continuation continuation) {
        a aVar;
        D0 d11;
        SendChannel sendChannel;
        InterfaceC3914us.a aVar2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f25305d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f25305d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objReceive = aVar.f25303b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f25305d;
        if (i12 == 0) {
            jn0.t.b(objReceive);
            SendChannel sendChannel2 = this.f25300a;
            InterfaceC3914us.b bVar = new InterfaceC3914us.b(interfaceC4001ws);
            aVar.f25302a = this;
            aVar.f25305d = 1;
            if (sendChannel2.send(bVar, aVar) != coroutine_suspended) {
                d11 = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            d11 = (D0) aVar.f25302a;
            jn0.t.b(objReceive);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = aVar.f25302a;
                jn0.t.b(objReceive);
                return obj;
            }
            d11 = (D0) aVar.f25302a;
            jn0.t.b(objReceive);
        }
        if (!p013kotlin.jvm.internal.s.f((InterfaceC3958vs) objReceive, InterfaceC3958vs.c.f36289a)) {
            sendChannel = d11.f25300a;
            aVar2 = InterfaceC3914us.a.f35946a;
            aVar.f25302a = objReceive;
            aVar.f25305d = 3;
            if (sendChannel.send(aVar2, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return objReceive;
        ReceiveChannel receiveChannel = d11.f25301b;
        aVar.f25302a = d11;
        aVar.f25305d = 2;
        objReceive = receiveChannel.receive(aVar);
        if (objReceive != coroutine_suspended) {
            if (!p013kotlin.jvm.internal.s.f((InterfaceC3958vs) objReceive, InterfaceC3958vs.c.f36289a)) {
                sendChannel = d11.f25300a;
                aVar2 = InterfaceC3914us.a.f35946a;
                aVar.f25302a = objReceive;
                aVar.f25305d = 3;
                if (sendChannel.send(aVar2, aVar) == coroutine_suspended) {
                }
            }
            return objReceive;
        }
        return coroutine_suspended;
    }
}
