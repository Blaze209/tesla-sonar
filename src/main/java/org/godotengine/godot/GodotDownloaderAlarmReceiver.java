package org.godotengine.godot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import ku.b;

/* JADX INFO: loaded from: classes10.dex */
public class GodotDownloaderAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("GODOT", "Alarma recivida");
        try {
            b.d(context, intent, GodotDownloaderService.class);
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            Log.d("GODOT", "Exception: " + e11.getClass().getName() + ":" + e11.getMessage());
        }
    }
}
