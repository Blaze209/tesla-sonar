package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes9.dex */
final class v extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f81401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f81402b;

    v(String str, String str2) {
        this.f81401a = (String) io.sentry.util.y.c(str, "user is required");
        this.f81402b = (String) io.sentry.util.y.c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f81401a, this.f81402b.toCharArray());
        }
        return null;
    }
}
