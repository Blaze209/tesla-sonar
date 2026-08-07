package com.fourthline.orca.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class J2 implements InterfaceC3849tC, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f26416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f26417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3839t2 f26418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W0 f26419d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[H2.values().length];
            try {
                iArr[H2.Sepa.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4065yC f26421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BavPaymentMethod f26422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ J2 f26423d;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[H2.values().length];
                try {
                    iArr[H2.Online.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[H2.Sepa.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4065yC c4065yC, BavPaymentMethod bavPaymentMethod, J2 j11, Continuation continuation) {
            super(2, continuation);
            this.f26421b = c4065yC;
            this.f26422c = bavPaymentMethod;
            this.f26423d = j11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f26421b, this.f26422c, this.f26423d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC3839t2.b aVar;
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f26420a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f26421b.b().a(this.f26421b.c().a(true));
                int i12 = a.$EnumSwitchMapping$0[this.f26422c.getName().ordinal()];
                if (i12 == 1) {
                    aVar = new InterfaceC3839t2.b.a((String) this.f26423d.f26417b.invoke(), this.f26423d.f26419d.d());
                } else {
                    if (i12 != 2) {
                        return jn0.h0.f84049a;
                    }
                    aVar = new InterfaceC3839t2.b.C0616b((String) this.f26423d.f26417b.invoke());
                }
                InterfaceC3839t2 interfaceC3839t2 = this.f26423d.f26418c;
                this.f26420a = 1;
                objA = interfaceC3839t2.a(aVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            }
            J2 j11 = this.f26423d;
            C4065yC c4065yC = this.f26421b;
            BavPaymentMethod bavPaymentMethod = this.f26422c;
            Throwable thE = jn0.s.e(objA);
            if (thE == null) {
                j11.a(c4065yC, bavPaymentMethod, ((InterfaceC3839t2.c) objA).a());
            } else {
                j11.a(c4065yC, bavPaymentMethod, AbstractC3039aE.a(thE));
            }
            return jn0.h0.f84049a;
        }
    }

    public J2(wn0.a workflowIdProvider, InterfaceC3839t2 startPaymentWorker, W0 dataBundle, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(startPaymentWorker, "startPaymentWorker");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f26416a = coroutineScope;
        this.f26417b = workflowIdProvider;
        this.f26418c = startPaymentWorker;
        this.f26419d = dataBundle;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f26416a.getCoroutineContext();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3849tC
    public void a(C4065yC c4065yC, BavPaymentMethod selectedType) {
        p013kotlin.jvm.internal.s.k(c4065yC, "<this>");
        p013kotlin.jvm.internal.s.k(selectedType, "selectedType");
        BuildersKt__Builders_commonKt.launch$default(c4065yC, null, null, new b(c4065yC, selectedType, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4065yC c4065yC, BavPaymentMethod bavPaymentMethod, InterfaceC3839t2.BavStartPaymentResult bavStartPaymentResult) {
        InterfaceC3924v1 interfaceC3924v1;
        this.f26419d.a(bavStartPaymentResult.getValues());
        if (a.$EnumSwitchMapping$0[bavPaymentMethod.getName().ordinal()] == 1) {
            interfaceC3924v1 = InterfaceC3924v1.a.f35983a;
        } else {
            interfaceC3924v1 = InterfaceC3924v1.c.f35985a;
        }
        c4065yC.d().a(new K2(interfaceC3924v1));
        c4065yC.b().a(c4065yC.c().a(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4065yC c4065yC, BavPaymentMethod bavPaymentMethod, ZD zd2) {
        c4065yC.b().a(c4065yC.c().a(false));
    }
}
