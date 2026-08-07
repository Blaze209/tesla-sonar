package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcn {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.MINUTES.toMicros(1);
    private final zzbx zzc;
    private final Context zzd;

    zzcn(Context context, zzbx zzbxVar) {
        this.zzd = context;
        this.zzc = zzbxVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    public final zziy zza(String str) {
        boolean z11;
        WifiManager wifiManager = (WifiManager) this.zzd.getSystemService("wifi");
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return zziy.zzm();
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.isEmpty()) {
            return zziy.zzm();
        }
        zziy zziyVarZzp = zziy.zzp(zzjj.zza(new Comparator() { // from class: com.google.android.libraries.places.internal.zzcm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i11 = zzcn.zza;
                return ((ScanResult) obj2).level - ((ScanResult) obj).level;
            }
        }), scanResults);
        ArrayList arrayList = new ArrayList();
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        int size = zziyVarZzp.size();
        for (int i11 = 0; i11 < size; i11++) {
            ScanResult scanResult = (ScanResult) zziyVarZzp.get(i11);
            if (scanResult != null && !TextUtils.isEmpty(scanResult.SSID)) {
                long jZza = (this.zzc.zza() * 1000) - scanResult.timestamp;
                long j11 = zzb;
                String str2 = scanResult.SSID;
                if (str2 == null) {
                    throw new IllegalArgumentException("Null SSID.");
                }
                if (str2.indexOf(95) < 0) {
                    z11 = false;
                } else {
                    String lowerCase = str2.toLowerCase(Locale.ENGLISH);
                    z11 = true;
                    if (!lowerCase.contains("_nomap") && !lowerCase.contains("_optout")) {
                        z11 = false;
                    }
                }
                if (jZza <= j11 && !z11) {
                    arrayList.add(new zzcl(connectionInfo, scanResult));
                }
            }
        }
        return zziy.zzk(arrayList);
    }
}
