package com.teslamotors.plugins.ble;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import vc0.g2;

/* JADX INFO: loaded from: classes8.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.tesla.logging.g f57007a = com.tesla.logging.g.h("BLEServiceStarter");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Long> f57008b = new ConcurrentHashMap<>();

    static Intent a(Context context, g2.e eVar) {
        he0.b bVarM = he0.b.m(context);
        ArrayList<String> arrayList = new ArrayList<>(bVarM.v());
        String strX = bVarM.x();
        String strG = bVarM.g();
        String strY = bVarM.y(strX);
        Intent intent = new Intent(context, (Class<?>) BLEService.class);
        intent.putStringArrayListExtra("VINS", arrayList);
        intent.putExtra("SELECTED_VIN", strX);
        intent.putExtra("ACCOUNT_EMAIL", strG);
        intent.putExtra("VEHICLE_NAME", strY);
        intent.putExtra("SERVICE_IN_FOREGROUND", true);
        if (eVar != null) {
            intent.putExtra("START_REASON", eVar.getValue());
        }
        return intent;
    }

    static boolean b(String str) {
        if (str == null) {
            f57007a.n("consumeCommandNonce called with null nonce");
            return false;
        }
        boolean z11 = f57008b.remove(str) != null;
        if (z11) {
            f57007a.j("Successfully consumed internal command nonce");
            return z11;
        }
        f57007a.n("Failed to consume internal command nonce (invalid or already used)");
        return z11;
    }

    static String c() {
        String str;
        ConcurrentHashMap<String, Long> concurrentHashMap = f57008b;
        if (concurrentHashMap.size() >= 5 && (str = (String) concurrentHashMap.entrySet().stream().min(Map.Entry.comparingByValue()).map(new Function() { // from class: com.teslamotors.plugins.ble.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getKey();
            }
        }).orElse(null)) != null) {
            concurrentHashMap.remove(str);
            f57007a.n("Evicted oldest pending nonce due to cap (size=5)");
        }
        String string = UUID.randomUUID().toString();
        concurrentHashMap.put(string, Long.valueOf(System.currentTimeMillis()));
        f57007a.j("Issued internal command nonce for notification command");
        return string;
    }

    static boolean d(Context context, Intent intent) {
        try {
            androidx.core.content.b.startForegroundService(context, intent);
            return true;
        } catch (Exception e11) {
            f57007a.c("Failed to start BLEService: " + e11.getMessage());
            return false;
        }
    }

    static boolean e(Context context, g2.e eVar) {
        he0.b bVarM = he0.b.m(context);
        if (z0.d(context, new ArrayList(bVarM.v()), bVarM.g(), false)) {
            return d(context, a(context, eVar));
        }
        f57007a.j("shouldRunInForeground() => false, not starting service");
        return false;
    }
}
