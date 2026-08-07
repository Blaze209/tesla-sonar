package com.fourthline.orca.internal;

import java.util.Objects;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Es implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineScope f25643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Flow f25644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SendChannel f25645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MutableStateFlow f25646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StateFlow f25647e;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25648a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Es$a$a, reason: collision with other inner class name */
        static final class C0487a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25650a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f25651b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Es f25652c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0487a(Es es2, Continuation continuation) {
                super(2, continuation);
                this.f25652c = es2;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC3914us interfaceC3914us, Continuation continuation) {
                return ((C0487a) create(interfaceC3914us, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0487a c0487a = new C0487a(this.f25652c, continuation);
                c0487a.f25651b = obj;
                return c0487a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC4001ws interfaceC4001wsA;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f25650a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                InterfaceC3914us interfaceC3914us = (InterfaceC3914us) this.f25651b;
                Objects.toString(interfaceC3914us);
                MutableStateFlow mutableStateFlow = this.f25652c.f25646d;
                if (interfaceC3914us instanceof InterfaceC3914us.b) {
                    InterfaceC3914us.b bVar = (InterfaceC3914us.b) interfaceC3914us;
                    if (p013kotlin.jvm.internal.s.f(this.f25652c.f25646d.getValue(), bVar.a())) {
                        this.f25652c.c().mo85trySendJP2dKIU(InterfaceC3958vs.c.f36289a);
                        interfaceC4001wsA = (InterfaceC4001ws) this.f25652c.f25646d.getValue();
                    } else {
                        interfaceC4001wsA = bVar.a();
                    }
                } else {
                    if (!(interfaceC3914us instanceof InterfaceC3914us.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC4001wsA = null;
                }
                mutableStateFlow.setValue(interfaceC4001wsA);
                return jn0.h0.f84049a;
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Es.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f25648a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flowB = Es.this.b();
                C0487a c0487a = new C0487a(Es.this, null);
                this.f25648a = 1;
                if (AbstractC3989wg.a(flowB, c0487a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    public Es(CoroutineScope coroutineScope, Flow inputEffects, SendChannel outputEvents) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(inputEffects, "inputEffects");
        p013kotlin.jvm.internal.s.k(outputEvents, "outputEvents");
        this.f25643a = coroutineScope;
        this.f25644b = inputEffects;
        this.f25645c = outputEvents;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f25646d = MutableStateFlow;
        this.f25647e = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
    }

    public final Flow b() {
        return this.f25644b;
    }

    public final SendChannel c() {
        return this.f25645c;
    }

    public final StateFlow d() {
        return this.f25647e;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25643a.getCoroutineContext();
    }
}
