package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import com.fourthline.networking.NetworkEnvironment;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4072yd {
    public final C3092bi a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3092bi("eid", tracker);
    }

    public final InterfaceC3947vi a(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new C2880Hd(lottieServiceLocator.a(Tj.DocumentIntro));
    }

    public final InterfaceC2869Fd a(NetworkEnvironment networkEnvironment, C3257fd eidFlowConfig) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(eidFlowConfig, "eidFlowConfig");
        return new C2875Gd(eidFlowConfig, networkEnvironment);
    }

    public final C3991wi.e a(InterfaceC2869Fd eidIntroRepository, C2899Lc eidBundle, CoroutineScope coroutineScope, EidServiceProvider eidServiceProvider) {
        p013kotlin.jvm.internal.s.k(eidIntroRepository, "eidIntroRepository");
        p013kotlin.jvm.internal.s.k(eidBundle, "eidBundle");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(eidServiceProvider, "eidServiceProvider");
        return new C3987we(eidIntroRepository, eidBundle, coroutineScope, eidServiceProvider);
    }

    public final C3991wi a(C3092bi analytics, C3343hd flowCoordinator, C3991wi.e startScreenHandler, InterfaceC3947vi stateProvider) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(startScreenHandler, "startScreenHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        return new C3991wi(analytics, new C3520lk(stateProvider), stateProvider, flowCoordinator, C2863Ed.f25590a, startScreenHandler, null, 64, null);
    }
}
