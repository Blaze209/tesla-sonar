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

/* JADX INFO: renamed from: com.fourthline.orca.internal.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3943ve implements InterfaceC3814se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2899Lc f36081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EidServiceProvider f36082b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ve$a */
    public static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f36085c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ve$a$a, reason: collision with other inner class name */
        public static final class C0620a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f36086a;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.ve$a$a$a, reason: collision with other inner class name */
            public static final class C0621a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f36087a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f36088b;

                public C0621a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f36087a = obj;
                    this.f36088b |= Integer.MIN_VALUE;
                    return C0620a.this.emit(null, this);
                }
            }

            public C0620a(FlowCollector flowCollector) {
                this.f36086a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C0621a c0621a;
                if (continuation instanceof C0621a) {
                    c0621a = (C0621a) continuation;
                    int i11 = c0621a.f36088b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0621a.f36088b = i11 - Integer.MIN_VALUE;
                    } else {
                        c0621a = new C0621a(continuation);
                    }
                } else {
                    c0621a = new C0621a(continuation);
                }
                Object obj2 = c0621a.f36087a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0621a.f36088b;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f36086a;
                    InterfaceC3814se.a.C0612a c0612a = new InterfaceC3814se.a.C0612a((EidAuthEvent) obj);
                    c0621a.f36088b = 1;
                    if (flowCollector.emit(c0612a, c0621a) == coroutine_suspended) {
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
            this.f36085c = flow;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f36085c, continuation);
            aVar.f36084b = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36083a;
            if (i11 == 0) {
                jn0.t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f36084b;
                Flow flow = this.f36085c;
                C0620a c0620a = new C0620a(flowCollector);
                this.f36083a = 1;
                if (flow.collect(c0620a, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ve$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f36090a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36092c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36090a = obj;
            this.f36092c |= Integer.MIN_VALUE;
            return C3943ve.this.a(this);
        }
    }

    public C3943ve(C2899Lc bundle, EidServiceProvider provider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(provider, "provider");
        this.f36081a = bundle;
        this.f36082b = provider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3814se
    public Object a(Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f36092c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f36092c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objAuthenticateWithPin = bVar.f36090a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f36092c;
        if (i12 == 0) {
            jn0.t.b(objAuthenticateWithPin);
            EidServiceProvider eidServiceProvider = this.f36082b;
            String strB = AbstractC2904Mc.b(this.f36081a);
            bVar.f36092c = 1;
            objAuthenticateWithPin = eidServiceProvider.authenticateWithPin(strB, bVar);
            if (objAuthenticateWithPin == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objAuthenticateWithPin);
        }
        return FlowKt.flow(new a((Flow) objAuthenticateWithPin, null));
    }
}
