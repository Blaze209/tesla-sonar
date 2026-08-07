package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hl {
    public static final Gl a(String baseUrl, NetworkEnvironment networkEnvironment) {
        p013kotlin.jvm.internal.s.k(baseUrl, "baseUrl");
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        return Rj.a(new Li(baseUrl, networkEnvironment));
    }
}
