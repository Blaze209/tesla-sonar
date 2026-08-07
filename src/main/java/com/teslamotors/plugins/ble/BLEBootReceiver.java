package com.teslamotors.plugins.ble;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import vc0.g2;

/* JADX INFO: loaded from: classes8.dex */
public class BLEBootReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.tesla.logging.g f56635a = com.tesla.logging.g.h("BLEBootReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        g2.e eVar;
        this.f56635a.j(String.format("Got %s; checking whether to start...", intent.getAction()));
        he0.b.m(context);
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                ff0.g.d(new ff0.k.a());
                eVar = g2.e.SERVICE_START_REASON_BOOT_COMPLETE;
            } else {
                eVar = g2.e.SERVICE_START_REASON_PACKAGE_REPLACED;
            }
            boolean zE = v.e(context, eVar);
            this.f56635a.j("startServiceIfNeeded() => " + zE);
        }
    }
}
