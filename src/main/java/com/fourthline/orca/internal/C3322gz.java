package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3322gz implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3066az f32132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32136e;

    public C3322gz(C3066az c3066az, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f32132a = c3066az;
        this.f32133b = provider;
        this.f32134c = provider2;
        this.f32135d = provider3;
        this.f32136e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3551mE get() {
        return a(this.f32132a, (NetworkEnvironment) this.f32133b.get(), (Context) this.f32134c.get(), (Vf) this.f32135d.get(), (DeviceMetadata) this.f32136e.get());
    }

    public static C3322gz a(C3066az c3066az, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3322gz(c3066az, provider, provider2, provider3, provider4);
    }

    public static InterfaceC3551mE a(C3066az c3066az, NetworkEnvironment networkEnvironment, Context context, Vf vf2, DeviceMetadata deviceMetadata) {
        return (InterfaceC3551mE) qj0.h.d(c3066az.a(networkEnvironment, context, vf2, deviceMetadata));
    }
}
