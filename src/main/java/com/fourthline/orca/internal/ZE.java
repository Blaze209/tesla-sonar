package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30010a = "https://cdn.ext-development.fourthline.com/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30011b = "https://cdn.ext-sandbox.fourthline.com/";

    public static final String a(NetworkEnvironment networkEnvironment) {
        String str;
        p013kotlin.jvm.internal.s.k(networkEnvironment, "<this>");
        if (networkEnvironment instanceof NetworkEnvironment.Production) {
            str = "https://cdn.ext.fourthline.com/";
        } else if (networkEnvironment instanceof NetworkEnvironment.Sandbox) {
            str = f30011b;
        } else {
            if (!(networkEnvironment instanceof NetworkEnvironment.Mock)) {
                throw new NoWhenBranchMatchedException();
            }
            NetworkEnvironment.Mock mock = (NetworkEnvironment.Mock) networkEnvironment;
            int actualEnvironment$fourthline_sdk_release = mock.getActualEnvironment$fourthline_sdk_release();
            if (actualEnvironment$fourthline_sdk_release == 0) {
                str = f30011b;
            } else if (actualEnvironment$fourthline_sdk_release == 1 || actualEnvironment$fourthline_sdk_release == 2) {
                str = f30010a;
            } else if (actualEnvironment$fourthline_sdk_release == 3) {
                str = "https://cdn.ext-test.fourthline.com/";
            } else {
                if (actualEnvironment$fourthline_sdk_release != 4) {
                    throw new IllegalStateException(("FL Developer error. Mock.actualEnvironment has unsupported value: " + mock.getActualEnvironment$fourthline_sdk_release()).toString());
                }
                str = "https://cdn.ext-acceptance.fourthline.com/";
            }
        }
        return str + "android/3.2.22/";
    }
}
