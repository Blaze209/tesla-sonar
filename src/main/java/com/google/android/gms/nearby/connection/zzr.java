package com.google.android.gms.nearby.connection;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzr {
    public static String zza(int i11) {
        if (i11 == 0) {
            return "UNKNOWN";
        }
        if (i11 != 1) {
            return i11 != 2 ? "OTHER" : "Secondary";
        }
        return "Main";
    }
}
