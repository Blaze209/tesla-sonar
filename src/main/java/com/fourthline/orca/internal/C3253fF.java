package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3253fF {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC3051ak interfaceC3051ak) {
        XE xeF = interfaceC3051ak.f();
        String strB = xeF != null ? xeF.b() : null;
        if (strB != null) {
            return strB;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The workflow session config must be present at this moment!")).toString());
    }

    public final wn0.a a(final InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new wn0.a() { // from class: com.fourthline.orca.internal.r11
            @Override // wn0.a
            public final Object invoke() {
                return C3253fF.b(mainRepository);
            }
        };
    }

    public final NetworkEnvironment c(InterfaceC3051ak mainRepository) {
        NetworkEnvironment networkEnvironmentA;
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        XE xeF = mainRepository.f();
        if (xeF == null || (networkEnvironmentA = xeF.a()) == null) {
            throw new IllegalStateException("FL Developer Error. This configuration does not support NetworkEnvironment.");
        }
        return networkEnvironmentA;
    }
}
