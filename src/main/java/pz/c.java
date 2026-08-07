package pz;

import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Provider f104107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Provider f104108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Provider f104109e;

    public c() {
        this(null, null, null, null, null);
    }

    public Provider d() {
        Provider provider = this.f104108d;
        return provider != null ? provider : a();
    }

    public Provider e() {
        Provider provider = this.f104107c;
        return provider != null ? provider : a();
    }

    public Provider f() {
        Provider provider = this.f104109e;
        return provider != null ? provider : a();
    }

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f104107c = provider2;
        this.f104108d = provider3;
        this.f104109e = provider4;
    }
}
