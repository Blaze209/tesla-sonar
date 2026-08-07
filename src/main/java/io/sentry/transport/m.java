package io.sentry.transport;

import java.net.Authenticator;

/* JADX INFO: loaded from: classes9.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f81391a = new m();

    private m() {
    }

    public static m a() {
        return f81391a;
    }

    public void b(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
