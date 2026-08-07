package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.networking.NetworkEnvironmentKt;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4025xF {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(C3765rE c3765rE) {
        String strD;
        XE xeA = c3765rE.a();
        if (xeA == null || (strD = xeA.d()) == null) {
            throw new IllegalStateException("FL Developer error. Next endpoint requires valid 'workflowId'.");
        }
        return strD;
    }

    public final wn0.a a(final C3765rE dataBundle) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        return new wn0.a() { // from class: com.fourthline.orca.internal.zh1
            @Override // wn0.a
            public final Object invoke() {
                return C4025xF.b(dataBundle);
            }
        };
    }

    public final InterfaceC3852tF a(NetworkEnvironment networkEnvironment, Gl statusNetworkService, Provider stubProvider) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(statusNetworkService, "statusNetworkService");
        p013kotlin.jvm.internal.s.k(stubProvider, "stubProvider");
        if (!NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            return new Pl(statusNetworkService);
        }
        Object obj = stubProvider.get();
        p013kotlin.jvm.internal.s.h(obj);
        return (InterfaceC3852tF) obj;
    }

    public final InterfaceC3645og a(NetworkEnvironment networkEnvironment, Provider networkWhatsNextProvider, Provider stubProvider) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(networkWhatsNextProvider, "networkWhatsNextProvider");
        p013kotlin.jvm.internal.s.k(stubProvider, "stubProvider");
        if (NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironment)) {
            Object obj = stubProvider.get();
            p013kotlin.jvm.internal.s.h(obj);
            return (InterfaceC3645og) obj;
        }
        Object obj2 = networkWhatsNextProvider.get();
        p013kotlin.jvm.internal.s.h(obj2);
        return (InterfaceC3645og) obj2;
    }

    public final X3 a(Il networkServiceProvider, C3259ff etagSharedPreference) {
        p013kotlin.jvm.internal.s.k(networkServiceProvider, "networkServiceProvider");
        p013kotlin.jvm.internal.s.k(etagSharedPreference, "etagSharedPreference");
        return new Wk(networkServiceProvider, etagSharedPreference);
    }

    public final InterfaceC3559mg a(InterfaceC3051ak mainRepository, Gl networkService) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        if (mainRepository.a()) {
            return new Xz(null, 0L, 3, null);
        }
        return new C3478kl(networkService);
    }
}
