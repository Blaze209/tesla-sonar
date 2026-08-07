package fx;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    static double a(LatLng latLng, LatLng latLng2) {
        return b(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
    }

    private static double b(double d11, double d12, double d13, double d14) {
        return a.a(a.c(d11, d13, d12 - d14));
    }

    public static LatLng c(LatLng latLng, LatLng latLng2, double d11) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double dCos = Math.cos(radians);
        double dCos2 = Math.cos(radians3);
        double dA = a(latLng, latLng2);
        double dSin = Math.sin(dA);
        if (dSin < 1.0E-6d) {
            double d12 = latLng.latitude;
            double d13 = d12 + ((latLng2.latitude - d12) * d11);
            double d14 = latLng.longitude;
            return new LatLng(d13, d14 + ((latLng2.longitude - d14) * d11));
        }
        double dSin2 = Math.sin((1.0d - d11) * dA) / dSin;
        double dSin3 = Math.sin(dA * d11) / dSin;
        double d15 = dCos * dSin2;
        double d16 = dCos2 * dSin3;
        double dCos3 = (Math.cos(radians2) * d15) + (Math.cos(radians4) * d16);
        double dSin4 = (d15 * Math.sin(radians2)) + (d16 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((Math.sin(radians) * dSin2) + (dSin3 * Math.sin(radians3)), Math.sqrt((dCos3 * dCos3) + (dSin4 * dSin4)))), Math.toDegrees(Math.atan2(dSin4, dCos3)));
    }
}
