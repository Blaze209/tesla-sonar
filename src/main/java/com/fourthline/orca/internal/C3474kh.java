package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3474kh {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kh$a */
    static final class a extends SuspendLambda implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3559mg f32991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ X3 f32992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f32993f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3559mg interfaceC3559mg, X3 x11, Context context, Continuation continuation) {
            super(3, continuation);
            this.f32991d = interfaceC3559mg;
            this.f32992e = x11;
            this.f32993f = context;
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3559mg.a aVar, WorkflowConfigurationResponse workflowConfigurationResponse, Continuation continuation) {
            a aVar2 = new a(this.f32991d, this.f32992e, this.f32993f, continuation);
            aVar2.f32989b = aVar;
            aVar2.f32990c = workflowConfigurationResponse;
            return aVar2.invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        
            if (r5.a(r6) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f32988a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r6.f32989b
                jn0.s r0 = (jn0.s) r0
                jn0.t.b(r7)
                jn0.s r7 = (jn0.s) r7
                r7.getValue()
                goto L68
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                java.lang.Object r1 = r6.f32989b
                com.fourthline.orca.internal.iE r1 = (com.fourthline.orca.internal.WorkflowConfigurationResponse) r1
                jn0.t.b(r7)
                jn0.s r7 = (jn0.s) r7
                java.lang.Object r7 = r7.getValue()
                goto L49
            L31:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f32989b
                com.fourthline.orca.internal.mg$a r7 = (com.fourthline.orca.internal.InterfaceC3559mg.a) r7
                java.lang.Object r1 = r6.f32990c
                com.fourthline.orca.internal.iE r1 = (com.fourthline.orca.internal.WorkflowConfigurationResponse) r1
                com.fourthline.orca.internal.mg r4 = r6.f32991d
                r6.f32989b = r1
                r6.f32988a = r3
                java.lang.Object r7 = r4.a(r7, r6)
                if (r7 != r0) goto L49
                goto L67
            L49:
                jn0.s r7 = jn0.s.a(r7)
                com.fourthline.orca.internal.X3 r3 = r6.f32992e
                android.content.Context r4 = r6.f32993f
                r7.getValue()
                com.fourthline.orca.internal.ol r5 = new com.fourthline.orca.internal.ol
                java.io.File r4 = com.fourthline.core.ContextExtensionsKt.getAssetsFourthlineDirectory(r4)
                r5.<init>(r3, r4, r1)
                r6.f32989b = r7
                r6.f32988a = r2
                java.lang.Object r7 = r5.a(r6)
                if (r7 != r0) goto L68
            L67:
                return r0
            L68:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3474kh.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final C3251fD a(Context context, InterfaceC3051ak mainRepository, wn0.a workflowIdProvider, Gl networkService, CC collectDeviceDataWorker, Provider completeOnboardingWorkerProvider, X3 downloadWorker, InterfaceC3559mg flowVariantWorker, C3687pf featuresAnalyticsContext) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(collectDeviceDataWorker, "collectDeviceDataWorker");
        p013kotlin.jvm.internal.s.k(completeOnboardingWorkerProvider, "completeOnboardingWorkerProvider");
        p013kotlin.jvm.internal.s.k(downloadWorker, "downloadWorker");
        p013kotlin.jvm.internal.s.k(flowVariantWorker, "flowVariantWorker");
        p013kotlin.jvm.internal.s.k(featuresAnalyticsContext, "featuresAnalyticsContext");
        C3521ll c3521ll = new C3521ll(context, workflowIdProvider, networkService, featuresAnalyticsContext, new a(flowVariantWorker, downloadWorker, context, null));
        Object obj = completeOnboardingWorkerProvider.get();
        p013kotlin.jvm.internal.s.j(obj, "get(...)");
        return new C3251fD(mainRepository, c3521ll, workflowIdProvider, collectDeviceDataWorker, (XC) obj);
    }

    public final XC a(InterfaceC3051ak mainRepository, Gl onboardingNetworkService) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(onboardingNetworkService, "onboardingNetworkService");
        if (mainRepository.a()) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return new C3890uA(jn0.s.b(XC.b.a.f29714a), 0L, 2, null);
        }
        return new Ll(onboardingNetworkService);
    }
}
