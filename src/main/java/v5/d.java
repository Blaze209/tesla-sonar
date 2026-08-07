package v5;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"Lv5/d;", "", "Lv5/b;", "distance", "azimuth", "elevation", "", "elapsedRealtimeNanos", "<init>", "(Lv5/b;Lv5/b;Lv5/b;J)V", "a", "Lv5/b;", "b", "()Lv5/b;", "c", DateTokenConverter.CONVERTER_KEY, "J", "()J", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b distance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b azimuth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b elevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long elapsedRealtimeNanos;

    public d(b bVar, b bVar2, b bVar3, long j11) {
        this.distance = bVar;
        this.azimuth = bVar2;
        this.elevation = bVar3;
        this.elapsedRealtimeNanos = j11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAzimuth() {
        return this.azimuth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getElapsedRealtimeNanos() {
        return this.elapsedRealtimeNanos;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getElevation() {
        return this.elevation;
    }
}
