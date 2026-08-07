package ie0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lie0/s;", "", "<init>", "()V", "", "userLat", "userLng", "geofenceLat", "geofenceLng", "angleMin", "angleMax", "", "a", "(DDDDDD)Z", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f77618a = new s();

    private s() {
    }

    public final boolean a(double userLat, double userLng, double geofenceLat, double geofenceLng, double angleMin, double angleMax) {
        double dAtan2 = Math.atan2(userLat - geofenceLat, userLng - geofenceLng);
        if (dAtan2 < 0.0d) {
            dAtan2 += 6.283185307179586d;
        }
        if (angleMin <= angleMax) {
            return angleMin <= dAtan2 && dAtan2 <= angleMax;
        }
        return dAtan2 >= angleMin || dAtan2 <= angleMax;
    }
}
