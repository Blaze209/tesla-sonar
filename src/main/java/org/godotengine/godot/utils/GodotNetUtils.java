package org.godotengine.godot.utils;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class GodotNetUtils {
    private WifiManager.MulticastLock multicastLock;

    public GodotNetUtils(Activity activity) {
        if (PermissionsUtil.hasManifestPermission(activity, "android.permission.CHANGE_WIFI_MULTICAST_STATE")) {
            WifiManager.MulticastLock multicastLockCreateMulticastLock = ((WifiManager) activity.getApplicationContext().getSystemService("wifi")).createMulticastLock("GodotMulticastLock");
            this.multicastLock = multicastLockCreateMulticastLock;
            multicastLockCreateMulticastLock.setReferenceCounted(true);
        }
    }

    public void multicastLockAcquire() {
        WifiManager.MulticastLock multicastLock = this.multicastLock;
        if (multicastLock == null) {
            return;
        }
        try {
            multicastLock.acquire();
        } catch (RuntimeException e11) {
            Log.e("Godot", "Exception during multicast lock acquire: " + e11);
        }
    }

    public void multicastLockRelease() {
        WifiManager.MulticastLock multicastLock = this.multicastLock;
        if (multicastLock == null) {
            return;
        }
        try {
            multicastLock.release();
        } catch (RuntimeException e11) {
            Log.e("Godot", "Exception during multicast lock release: " + e11);
        }
    }
}
