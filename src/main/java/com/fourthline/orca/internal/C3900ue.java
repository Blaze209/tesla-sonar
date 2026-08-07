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

/* JADX INFO: renamed from: com.fourthline.orca.internal.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3900ue implements InterfaceC3814se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2899Lc f35890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f35891b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ue$a */
    public static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f35894c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ue$a$a, reason: collision with other inner class name */
        public static final class C0617a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f35895a;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.ue$a$a$a, reason: collision with other inner class name */
            public static final class C0618a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f35896a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f35897b;

                public C0618a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f35896a = obj;
                    this.f35897b |= Integer.MIN_VALUE;
                    return C0617a.this.emit(null, this);
                }
            }

            public C0617a(FlowCollector flowCollector) {
                this.f35895a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C0618a c0618a;
                if (continuation instanceof C0618a) {
                    c0618a = (C0618a) continuation;
                    int i11 = c0618a.f35897b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0618a.f35897b = i11 - Integer.MIN_VALUE;
                    } else {
                        c0618a = new C0618a(continuation);
                    }
                } else {
                    c0618a = new C0618a(continuation);
                }
                Object obj2 = c0618a.f35896a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0618a.f35897b;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f35895a;
                    InterfaceC3814se.a.C0612a c0612a = new InterfaceC3814se.a.C0612a((EidAuthEvent) obj);
                    c0618a.f35897b = 1;
                    if (flowCollector.emit(c0612a, c0618a) == coroutine_suspended) {
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
            this.f35894c = flow;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f35894c, continuation);
            aVar.f35893b = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35892a;
            if (i11 == 0) {
                jn0.t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f35893b;
                Flow flow = this.f35894c;
                C0617a c0617a = new C0617a(flowCollector);
                this.f35892a = 1;
                if (flow.collect(c0617a, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ue$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35899a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35901c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f35899a = obj;
            this.f35901c |= Integer.MIN_VALUE;
            return C3900ue.this.a(this);
        }
    }

    public C3900ue(C2899Lc bundle, EidServiceProvider provider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(provider, "provider");
        this.f35890a = bundle;
        this.f35891b = provider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3814se
    public Object a(Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f35901c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f35901c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objAuthenticateWithCan = bVar.f35899a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f35901c;
        if (i12 == 0) {
            jn0.t.b(objAuthenticateWithCan);
            EidServiceProvider eidServiceProvider = this.f35891b;
            String strA = AbstractC2904Mc.a(this.f35890a);
            bVar.f35901c = 1;
            objAuthenticateWithCan = eidServiceProvider.authenticateWithCan(strA, bVar);
            if (objAuthenticateWithCan == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objAuthenticateWithCan);
        }
        return FlowKt.flow(new a((Flow) objAuthenticateWithCan, null));
    }
}
