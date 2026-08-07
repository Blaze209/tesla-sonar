package io.sentry.ndk;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes9.dex */
public final class NdkOptions {
    private final String dist;
    private final String dsn;
    private final String environment;
    private final boolean isDebug;
    private final int maxBreadcrumbs;
    private final String outboxPath;
    private final String release;
    private final String sdkName;
    private b ndkHandlerStrategy = b.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private float tracesSampleRate = BitmapDescriptorFactory.HUE_RED;

    public NdkOptions(String str, boolean z11, String str2, String str3, String str4, String str5, int i11, String str6) {
        this.dsn = str;
        this.isDebug = z11;
        this.outboxPath = str2;
        this.release = str3;
        this.environment = str4;
        this.dist = str5;
        this.maxBreadcrumbs = i11;
        this.sdkName = str6;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public String getOutboxPath() {
        return this.outboxPath;
    }

    public String getRelease() {
        return this.release;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public float getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setNdkHandlerStrategy(b bVar) {
        this.ndkHandlerStrategy = bVar;
    }

    public void setTracesSampleRate(float f11) {
        this.tracesSampleRate = f11;
    }
}
