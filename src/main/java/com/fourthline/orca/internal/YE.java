package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.networking.NetworkEnvironment;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class YE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29849a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final Gl a(Gl publicNetworkService, wn0.a tokenProvider, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(publicNetworkService, "publicNetworkService");
        p013kotlin.jvm.internal.s.k(tokenProvider, "tokenProvider");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return AbstractC3709q0.a(new B0(publicNetworkService, tokenProvider), tracker);
    }

    public final Gl b(NetworkEnvironment networkEnvironment) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        Gl glA = Hl.a(a(networkEnvironment), networkEnvironment);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        C3264fk c3264fk = analytics instanceof C3264fk ? (C3264fk) analytics : null;
        if (c3264fk != null) {
            c3264fk.a(glA);
        }
        return glA;
    }

    public final Il a(final NetworkEnvironment networkEnvironment, final C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Il() { // from class: com.fourthline.orca.internal.iw0
            @Override // com.fourthline.orca.internal.Il, wn0.a
            public final Object invoke() {
                return YE.b(networkEnvironment, tracker);
            }
        };
    }

    public final Gl b(Gl publicNetworkService, wn0.a tokenProvider, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(publicNetworkService, "publicNetworkService");
        p013kotlin.jvm.internal.s.k(tokenProvider, "tokenProvider");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return AbstractC3709q0.a(new B0(publicNetworkService, tokenProvider), tracker);
    }

    private final String a(NetworkEnvironment networkEnvironment) {
        if (networkEnvironment instanceof NetworkEnvironment.Production) {
            return "https://mapi.ext.fourthline.com/";
        }
        if (networkEnvironment instanceof NetworkEnvironment.Sandbox) {
            return "https://mapi.ext-sandbox.fourthline.com/";
        }
        if (!(networkEnvironment instanceof NetworkEnvironment.Mock)) {
            throw new NoWhenBranchMatchedException();
        }
        int actualEnvironment$fourthline_sdk_release = ((NetworkEnvironment.Mock) networkEnvironment).getActualEnvironment$fourthline_sdk_release();
        if (actualEnvironment$fourthline_sdk_release == 0) {
            return "stub";
        }
        if (actualEnvironment$fourthline_sdk_release == 1) {
            return "http://localhost:54321/";
        }
        if (actualEnvironment$fourthline_sdk_release == 2) {
            return "https://mapi.ext-development.fourthline.com/";
        }
        if (actualEnvironment$fourthline_sdk_release == 3) {
            return "https://mapi.ext-test.fourthline.com/";
        }
        if (actualEnvironment$fourthline_sdk_release == 4) {
            return "https://mapi.ext-acceptance.fourthline.com/";
        }
        throw new IllegalStateException(("FL Developer error. Mock.actualEnvironment has unsupported value: " + NetworkEnvironment.Mock.INSTANCE.getActualEnvironment$fourthline_sdk_release()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gl b(NetworkEnvironment networkEnvironment, C3438jo c3438jo) {
        return AbstractC3709q0.a(Hl.a(ZE.a(networkEnvironment), networkEnvironment), c3438jo);
    }
}
