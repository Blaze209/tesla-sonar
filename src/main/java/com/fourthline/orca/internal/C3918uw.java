package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3918uw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f35963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35966d;

    public C3918uw(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        this.f35963a = c3489kw;
        this.f35964b = provider;
        this.f35965c = provider2;
        this.f35966d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tv get() {
        return a(this.f35963a, (Dt) this.f35964b.get(), (DeviceMetadata) this.f35965c.get(), (Gl) this.f35966d.get());
    }

    public static C3918uw a(C3489kw c3489kw, Provider provider, Provider provider2, Provider provider3) {
        return new C3918uw(c3489kw, provider, provider2, provider3);
    }

    public static Tv a(C3489kw c3489kw, Dt dt2, DeviceMetadata deviceMetadata, Gl gl2) {
        return (Tv) qj0.h.d(c3489kw.a(dt2, deviceMetadata, gl2));
    }
}
