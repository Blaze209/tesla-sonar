package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3283g2 implements C3991wi.c, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f31911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W0 f31912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f31913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.a f31914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3839t2 f31915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31916f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.g2$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31917a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BavPaymentMethod f31919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3991wi f31920d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.g2$a$a, reason: collision with other inner class name */
        static final class C0561a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f31921a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BavPaymentMethod f31922b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3991wi f31923c;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.g2$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0562a {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0561a(BavPaymentMethod bavPaymentMethod, C3991wi c3991wi, Continuation continuation) {
                super(2, continuation);
                this.f31922b = bavPaymentMethod;
                this.f31923c = c3991wi;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0561a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0561a(this.f31922b, this.f31923c, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f31921a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                this.f31923c.d().a(new K2(C0562a.$EnumSwitchMapping$0[this.f31922b.getName().ordinal()] == 1 ? InterfaceC3924v1.a.f35983a : InterfaceC3924v1.c.f35985a));
                this.f31923c.b().a(this.f31923c.c().a(false));
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.g2$a$b */
        public /* synthetic */ class b {
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
        a(BavPaymentMethod bavPaymentMethod, C3991wi c3991wi, Continuation continuation) {
            super(2, continuation);
            this.f31919c = bavPaymentMethod;
            this.f31920d = c3991wi;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3283g2.this.new a(this.f31919c, this.f31920d, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L24;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3283g2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3283g2(W0 dataBundle, List paymentMethods, wn0.a workflowIdProvider, InterfaceC3839t2 startPaymentWorker, boolean z11, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(startPaymentWorker, "startPaymentWorker");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f31911a = coroutineScope;
        this.f31912b = dataBundle;
        this.f31913c = paymentMethods;
        this.f31914d = workflowIdProvider;
        this.f31915e = startPaymentWorker;
        this.f31916f = z11;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31911a.getCoroutineContext();
    }

    private final void b(C3991wi c3991wi) {
        Object next;
        if (this.f31916f) {
            Iterator it = this.f31913c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((BavPaymentMethod) next).getName() != H2.Online);
            BavPaymentMethod bavPaymentMethod = (BavPaymentMethod) next;
            if (bavPaymentMethod != null) {
                a(c3991wi, bavPaymentMethod);
                return;
            }
        }
        c3991wi.d().a(new C3326h2(InterfaceC3924v1.c.f35985a));
    }

    private final void c(C3991wi c3991wi) {
        c3991wi.d().a(new C3326h2(InterfaceC3924v1.d.f35986a));
    }

    @Override // com.fourthline.orca.internal.C3991wi.c
    public void a(C3991wi c3991wi) {
        p013kotlin.jvm.internal.s.k(c3991wi, "<this>");
        if (!Co.f25256a.a()) {
            b(c3991wi);
        } else if (this.f31913c.size() > 1) {
            c(c3991wi);
        } else {
            a(c3991wi, (BavPaymentMethod) p013kotlin.collections.v.o0(this.f31913c));
        }
    }

    private final void a(C3991wi c3991wi, BavPaymentMethod bavPaymentMethod) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(bavPaymentMethod, c3991wi, null), 3, null);
    }
}
