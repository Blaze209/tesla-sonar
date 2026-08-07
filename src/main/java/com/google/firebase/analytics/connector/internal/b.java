package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.common.collect.b0;
import com.google.common.collect.x;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b0 f43851a = b0.v("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x f43852b = x.w("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x f43853c = x.u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x f43854d = x.t("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final x f43855e = new x.a().i(zzjo.zza).i(zzjo.zzb).k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x f43856f = x.t("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f43857g = 0;

    public static boolean a(String str) {
        return !f43853c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(String str, Bundle bundle) {
        if (f43852b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        x xVar = f43854d;
        int size = xVar.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zContainsKey = bundle.containsKey((String) xVar.get(i11));
            i11++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f43851a.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f43855e.contains(str2)) {
            return false;
        }
        x xVar = f43856f;
        int size = xVar.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zMatches = str2.matches((String) xVar.get(i11));
            i11++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        x xVar = f43854d;
        int size = xVar.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zContainsKey = bundle.containsKey((String) xVar.get(i11));
            i11++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
