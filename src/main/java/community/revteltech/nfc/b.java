package community.revteltech.nfc;

import android.app.Activity;
import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
class b {
    public static boolean a(Activity activity) {
        if (activity == null || !activity.getPackageManager().hasSystemFeature("android.hardware.nfc") || !activity.getPackageManager().hasSystemFeature("com.nxp.mifare")) {
            return false;
        }
        boolean z11 = Build.MANUFACTURER.equals("LENOVO") && Build.MODEL.equals("Lenovo P2a42");
        File file = new File("/dev/bcm2079x-i2c");
        if (!z11 && file.exists()) {
            return false;
        }
        if (new File("/dev/pn544").exists()) {
            return true;
        }
        for (File file2 : new File("/system/lib").listFiles()) {
            if (file2.isFile() && file2.getName().startsWith("libnfc") && file2.getName().contains("brcm")) {
                return false;
            }
        }
        return true;
    }
}
