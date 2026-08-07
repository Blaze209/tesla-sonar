package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f43859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wu.a.b f43860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppMeasurementSdk f43861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f43862d;

    public d(AppMeasurementSdk appMeasurementSdk, wu.a.b bVar) {
        this.f43860b = bVar;
        this.f43861c = appMeasurementSdk;
        c cVar = new c(this);
        this.f43862d = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(cVar);
        this.f43859a = new HashSet();
    }

    final /* synthetic */ wu.a.b a() {
        return this.f43860b;
    }
}
