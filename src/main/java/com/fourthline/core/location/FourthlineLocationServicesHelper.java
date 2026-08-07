package com.fourthline.core.location;

import android.content.Context;
import android.location.LocationManager;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"locationServicesEnabled", "", "Landroid/content/Context;", "getLocationServicesEnabled", "(Landroid/content/Context;)Z", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FourthlineLocationServicesHelper {
    public static final boolean getLocationServicesEnabled(Context context) {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        s.k(context, "<this>");
        Object systemService = context.getSystemService("location");
        s.i(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        try {
            zIsProviderEnabled = locationManager.isProviderEnabled("gps");
        } catch (Exception unused) {
            zIsProviderEnabled = false;
        }
        try {
            zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
        } catch (Exception unused2) {
            zIsProviderEnabled2 = false;
        }
        return zIsProviderEnabled || zIsProviderEnabled2;
    }
}
