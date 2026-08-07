package com.teslamotors.plugins.ble;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import vc0.g2;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneKeyCommandReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.tesla.logging.g f56679a = com.tesla.logging.g.h("PhoneKeyCommandReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            f56679a.n("PhoneKeyCommandReceiver received null intent");
            return;
        }
        if (!"com.teslamotors.ble.action.COMMAND".equals(intent.getAction())) {
            f56679a.n("PhoneKeyCommandReceiver received unexpected action: " + intent.getAction());
            return;
        }
        int intExtra = intent.getIntExtra("command_id", -1);
        if (intExtra == -1) {
            f56679a.n("PhoneKeyCommandReceiver received command with invalid commandId");
            return;
        }
        Intent intentA = v.a(context, g2.e.SERVICE_START_REASON_SNA);
        intentA.putExtra("command_id", intExtra);
        String strC = v.c();
        intentA.putExtra("internal_command_nonce", strC);
        if (v.d(context, intentA)) {
            return;
        }
        v.b(strC);
    }
}
