package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.networking.NetworkEnvironmentKt;
import com.fourthline.orca.Orca;
import javax.inject.Provider;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3066az {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.az$a */
    static final class a implements InterfaceC3457k6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30533a = new a();

        a() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3457k6
        public final Object a(InterfaceC3457k6.a aVar, Continuation continuation) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.a(jn0.s.b(InterfaceC3457k6.b.f32903a));
        }
    }

    public final InterfaceC3681pF a(NetworkEnvironment networkEnvironment, Gl publicNetworkService, C3438jo tracker, Provider stubProvider) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(publicNetworkService, "publicNetworkService");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(stubProvider, "stubProvider");
        if (!NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            return new Ol(AbstractC3709q0.a(publicNetworkService, tracker));
        }
        Object obj = stubProvider.get();
        p013kotlin.jvm.internal.s.h(obj);
        return (InterfaceC3681pF) obj;
    }

    public final InterfaceC4018x8 b(NetworkEnvironment networkEnvironment, Gl onboardingNetworkService, Provider stubProvider) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(onboardingNetworkService, "onboardingNetworkService");
        p013kotlin.jvm.internal.s.k(stubProvider, "stubProvider");
        if (!NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            return new C3265fl(onboardingNetworkService);
        }
        Object obj = stubProvider.get();
        p013kotlin.jvm.internal.s.h(obj);
        return (InterfaceC4018x8) obj;
    }

    public final InterfaceC4049xx c(NetworkEnvironment networkEnvironment, Gl onboardingNetworkService, Provider stubProvider) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(onboardingNetworkService, "onboardingNetworkService");
        p013kotlin.jvm.internal.s.k(stubProvider, "stubProvider");
        if (!NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            return new Fl(onboardingNetworkService);
        }
        Object obj = stubProvider.get();
        p013kotlin.jvm.internal.s.h(obj);
        return (InterfaceC4049xx) obj;
    }

    public final InterfaceC3508lE a(NetworkEnvironment networkEnvironment, Gl onboardingNetworkService, Provider stubProvider, Orca.a integration, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(onboardingNetworkService, "onboardingNetworkService");
        p013kotlin.jvm.internal.s.k(stubProvider, "stubProvider");
        p013kotlin.jvm.internal.s.k(integration, "integration");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        if (NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            Object obj = stubProvider.get();
            p013kotlin.jvm.internal.s.h(obj);
            return (InterfaceC3508lE) obj;
        }
        return new Ml(onboardingNetworkService, integration, tracker);
    }

    public final InterfaceC3551mE a(NetworkEnvironment networkEnvironment, Context context, Vf dataWorkManager, DeviceMetadata deviceMetadata) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(deviceMetadata, "deviceMetadata");
        if (NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            return new C4020xA();
        }
        return new Nl(context, deviceMetadata, dataWorkManager);
    }

    public final InterfaceC3625o2 a(NetworkEnvironment networkEnvironment, Gl onboardingNetworkService, Provider stubProvider) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(onboardingNetworkService, "onboardingNetworkService");
        p013kotlin.jvm.internal.s.k(stubProvider, "stubProvider");
        if (NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            Object obj = stubProvider.get();
            p013kotlin.jvm.internal.s.h(obj);
            return (InterfaceC3625o2) obj;
        }
        return new Rk(onboardingNetworkService);
    }

    public final InterfaceC3457k6 a(NetworkEnvironment networkEnvironment, Gl onboardingNetworkService) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(onboardingNetworkService, "onboardingNetworkService");
        if (NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            return a.f30533a;
        }
        return new C3095bl(onboardingNetworkService);
    }
}
