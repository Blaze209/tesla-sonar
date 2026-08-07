package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4096z0 implements InterfaceC3354ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f37165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f37166b;

    public C4096z0(long j11) {
        this.f37165a = j11;
        this.f37166b = p013kotlin.collections.v0.f(jn0.x.a(AnalyticsAttribute.ElapsedTime, Long.valueOf(j11)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4096z0) && this.f37165a == ((C4096z0) obj).f37165a;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        return this.f37166b;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "workflow_assets_extracted";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/workflow_assets_extracted/jsonschema/1-0-0";
    }

    public int hashCode() {
        return Long.hashCode(this.f37165a);
    }

    public String toString() {
        return "AssetBundleExtracted(extractionTime=" + this.f37165a + ")";
    }
}
