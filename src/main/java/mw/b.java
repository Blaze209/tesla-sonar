package mw;

import com.google.firebase.perf.v1.GaugeMetric;

/* JADX INFO: loaded from: classes5.dex */
final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GaugeMetric f92524b;

    b(GaugeMetric gaugeMetric) {
        this.f92524b = gaugeMetric;
    }

    @Override // mw.e
    public boolean c() {
        if (!this.f92524b.hasSessionId()) {
            return false;
        }
        if (this.f92524b.getCpuMetricReadingsCount() > 0 || this.f92524b.getAndroidMemoryReadingsCount() > 0) {
            return true;
        }
        return this.f92524b.hasGaugeMetadata() && this.f92524b.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb();
    }
}
