package mx;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f92531a;

    public b(double d11) {
        this.f92531a = d11;
    }

    public a a(LatLng latLng) {
        double d11 = (latLng.longitude / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.latitude));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d12 = this.f92531a;
        return new a(d11 * d12, dLog * d12);
    }
}
