package pz;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Provider f104105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SecureRandom f104106b;

    public b() {
        this(null, null);
    }

    public Provider a() {
        return this.f104105a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.f104106b;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }

    public void c(Provider provider) {
        this.f104105a = provider;
    }

    public b(Provider provider, SecureRandom secureRandom) {
        this.f104105a = provider;
        this.f104106b = secureRandom;
    }
}
