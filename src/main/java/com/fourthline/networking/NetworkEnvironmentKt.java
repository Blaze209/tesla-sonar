package com.fourthline.networking;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00048@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"FourthlineMockServerPort", "", "orcaShouldUseStubs", "", "Lcom/fourthline/networking/NetworkEnvironment;", "alias", "", "getAlias$annotations", "(Lcom/fourthline/networking/NetworkEnvironment;)V", "getAlias", "(Lcom/fourthline/networking/NetworkEnvironment;)Ljava/lang/String;", "fourthline-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NetworkEnvironmentKt {
    public static final int FourthlineMockServerPort = 54321;

    public static final String getAlias(NetworkEnvironment networkEnvironment) {
        s.k(networkEnvironment, "<this>");
        if (s.f(networkEnvironment, NetworkEnvironment.Production.INSTANCE)) {
            return "production";
        }
        if (s.f(networkEnvironment, NetworkEnvironment.Sandbox.INSTANCE)) {
            return "sandbox";
        }
        NetworkEnvironment.Mock mock = NetworkEnvironment.Mock.INSTANCE;
        if (!s.f(networkEnvironment, mock)) {
            throw new NoWhenBranchMatchedException();
        }
        int actualEnvironment$fourthline_sdk_release = mock.getActualEnvironment$fourthline_sdk_release();
        if (actualEnvironment$fourthline_sdk_release == 0) {
            return "mock";
        }
        if (actualEnvironment$fourthline_sdk_release == 1) {
            return "mock_server";
        }
        if (actualEnvironment$fourthline_sdk_release == 2) {
            return "development";
        }
        if (actualEnvironment$fourthline_sdk_release == 3) {
            return "test";
        }
        if (actualEnvironment$fourthline_sdk_release == 4) {
            return "acceptance";
        }
        throw new IllegalStateException(("FL Developer error. Mock.actualEnvironment has unsupported value: " + mock.getActualEnvironment$fourthline_sdk_release()).toString());
    }

    public static /* synthetic */ void getAlias$annotations(NetworkEnvironment networkEnvironment) {
    }

    public static final boolean orcaShouldUseStubs(NetworkEnvironment networkEnvironment) {
        s.k(networkEnvironment, "<this>");
        NetworkEnvironment.Mock mock = NetworkEnvironment.Mock.INSTANCE;
        return s.f(networkEnvironment, mock) && mock.getActualEnvironment$fourthline_sdk_release() == 0;
    }
}
