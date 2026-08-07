package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wu.a.b f43864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppMeasurementSdk f43865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f43866c;

    public f(AppMeasurementSdk appMeasurementSdk, wu.a.b bVar) {
        this.f43864a = bVar;
        this.f43865b = appMeasurementSdk;
        e eVar = new e(this);
        this.f43866c = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(eVar);
    }

    final /* synthetic */ wu.a.b a() {
        return this.f43864a;
    }
}
