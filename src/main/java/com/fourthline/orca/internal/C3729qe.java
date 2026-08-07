package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidAuthEvent;
import com.fourthline.core.eid.EidServiceProvider;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3729qe implements InterfaceC3814se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2899Lc f34812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f34813b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qe$a */
    public static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f34816c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qe$a$a, reason: collision with other inner class name */
        public static final class C0600a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f34817a;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.qe$a$a$a, reason: collision with other inner class name */
            public static final class C0601a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34818a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f34819b;

                public C0601a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f34818a = obj;
                    this.f34819b |= Integer.MIN_VALUE;
                    return C0600a.this.emit(null, this);
                }
            }

            public C0600a(FlowCollector flowCollector) {
                this.f34817a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C0601a c0601a;
                if (continuation instanceof C0601a) {
                    c0601a = (C0601a) continuation;
                    int i11 = c0601a.f34819b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0601a.f34819b = i11 - Integer.MIN_VALUE;
                    } else {
                        c0601a = new C0601a(continuation);
                    }
                } else {
                    c0601a = new C0601a(continuation);
                }
                Object obj2 = c0601a.f34818a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0601a.f34819b;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f34817a;
                    InterfaceC3814se.a.C0612a c0612a = new InterfaceC3814se.a.C0612a((EidAuthEvent) obj);
                    c0601a.f34819b = 1;
                    if (flowCollector.emit(c0612a, c0601a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj2);
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, Continuation continuation) {
            super(2, continuation);
            this.f34816c = flow;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f34816c, continuation);
            aVar.f34815b = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34814a;
            if (i11 == 0) {
                jn0.t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f34815b;
                Flow flow = this.f34816c;
                C0600a c0600a = new C0600a(flowCollector);
                this.f34814a = 1;
                if (flow.collect(c0600a, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qe$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34821a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34823c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34821a = obj;
            this.f34823c |= Integer.MIN_VALUE;
            return C3729qe.this.a(this);
        }
    }

    public C3729qe(C2899Lc bundle, EidServiceProvider provider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(provider, "provider");
        this.f34812a = bundle;
        this.f34813b = provider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3814se
    public Object a(Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f34823c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f34823c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objRetryAuthenticateWithPin = bVar.f34821a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f34823c;
        if (i12 == 0) {
            jn0.t.b(objRetryAuthenticateWithPin);
            EidServiceProvider eidServiceProvider = this.f34813b;
            String strB = AbstractC2904Mc.b(this.f34812a);
            bVar.f34823c = 1;
            objRetryAuthenticateWithPin = eidServiceProvider.retryAuthenticateWithPin(strB, bVar);
            if (objRetryAuthenticateWithPin == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objRetryAuthenticateWithPin);
        }
        return FlowKt.flow(new a((Flow) objRetryAuthenticateWithPin, null));
    }
}
