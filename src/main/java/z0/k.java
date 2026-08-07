package z0;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class k extends t0.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f126163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f126164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Consumer<d2> f126165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f126166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f126167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f126168m;

    k(u uVar, Executor executor, Consumer<d2> consumer, boolean z11, boolean z12, long j11) {
        if (uVar == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f126163h = uVar;
        this.f126164i = executor;
        this.f126165j = consumer;
        this.f126166k = z11;
        this.f126167l = z12;
        this.f126168m = j11;
    }

    @Override // z0.t0.j
    Executor T() {
        return this.f126164i;
    }

    @Override // z0.t0.j
    Consumer<d2> b0() {
        return this.f126165j;
    }

    @Override // z0.t0.j
    @NonNull
    u c0() {
        return this.f126163h;
    }

    @Override // z0.t0.j
    long e0() {
        return this.f126168m;
    }

    public boolean equals(Object obj) {
        Executor executor;
        Consumer<d2> consumer;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0.j) {
            t0.j jVar = (t0.j) obj;
            if (this.f126163h.equals(jVar.c0()) && ((executor = this.f126164i) != null ? executor.equals(jVar.T()) : jVar.T() == null) && ((consumer = this.f126165j) != null ? consumer.equals(jVar.b0()) : jVar.b0() == null) && this.f126166k == jVar.n0() && this.f126167l == jVar.t0() && this.f126168m == jVar.e0()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f126163h.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f126164i;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        Consumer<d2> consumer = this.f126165j;
        int iHashCode3 = (((iHashCode2 ^ (consumer != null ? consumer.hashCode() : 0)) * 1000003) ^ (this.f126166k ? 1231 : 1237)) * 1000003;
        int i11 = this.f126167l ? 1231 : 1237;
        long j11 = this.f126168m;
        return ((iHashCode3 ^ i11) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // z0.t0.j
    boolean n0() {
        return this.f126166k;
    }

    @Override // z0.t0.j
    boolean t0() {
        return this.f126167l;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f126163h + ", getCallbackExecutor=" + this.f126164i + ", getEventListener=" + this.f126165j + ", hasAudioEnabled=" + this.f126166k + ", isPersistent=" + this.f126167l + ", getRecordingId=" + this.f126168m + "}";
    }
}
