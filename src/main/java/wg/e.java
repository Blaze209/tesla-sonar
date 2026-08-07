package wg;

import android.content.Context;
import android.os.Build;
import com.adyen.checkout.components.core.action.SdkAction;
import java.io.File;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f121807a = new e();

    public static e b() {
        return f121807a;
    }

    public final String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public boolean c(Context context) {
        try {
            return Build.HARDWARE.contains("goldfish") || Build.PRODUCT.contains(SdkAction.ACTION_TYPE) || Build.FINGERPRINT.contains("generic");
        } catch (Exception unused) {
            return false;
        }
    }

    public String d() {
        return "android";
    }

    public boolean e() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i11 = 0; i11 < 5; i11++) {
            try {
                if (new File(strArr[i11] + "su").exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public String f() {
        return Build.BOARD;
    }

    public String g() {
        return Build.BRAND;
    }

    public String h() {
        return Build.DEVICE;
    }

    public String i() {
        return Build.DISPLAY;
    }

    public String j() {
        return Build.VERSION.INCREMENTAL;
    }

    public String k() {
        return Build.MANUFACTURER;
    }

    public String l() {
        return Build.MODEL;
    }

    public String m() {
        return Build.PRODUCT;
    }

    public String n() {
        return Build.VERSION.RELEASE;
    }

    public String o() {
        return Build.VERSION.SDK;
    }

    public String p() {
        return Build.TAGS;
    }

    public String q() {
        return a("ro.kernel.qemu", WebrtcBuildVersion.maint_version);
    }
}
