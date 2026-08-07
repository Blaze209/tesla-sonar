package expo.modules.core.utilities;

import android.os.Build;
import com.adyen.checkout.components.core.action.SdkAction;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/core/utilities/EmulatorUtilities;", "", "<init>", "()V", "isRunningOnEmulator", "", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmulatorUtilities {
    public static final EmulatorUtilities INSTANCE = new EmulatorUtilities();

    private EmulatorUtilities() {
    }

    public final boolean isRunningOnEmulator() {
        String FINGERPRINT = Build.FINGERPRINT;
        s.j(FINGERPRINT, "FINGERPRINT");
        if (t.b0(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        s.j(FINGERPRINT, "FINGERPRINT");
        if (t.b0(FINGERPRINT, "unknown", false, 2, null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        s.j(MODEL, "MODEL");
        if (t.h0(MODEL, "google_sdk", false, 2, null)) {
            return true;
        }
        s.j(MODEL, "MODEL");
        Locale ROOT = Locale.ROOT;
        s.j(ROOT, "ROOT");
        String lowerCase = MODEL.toLowerCase(ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        if (t.h0(lowerCase, "droid4x", false, 2, null)) {
            return true;
        }
        s.j(MODEL, "MODEL");
        if (t.h0(MODEL, "Emulator", false, 2, null)) {
            return true;
        }
        s.j(MODEL, "MODEL");
        if (t.h0(MODEL, "Android SDK built for x86", false, 2, null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        s.j(MANUFACTURER, "MANUFACTURER");
        if (t.h0(MANUFACTURER, "Genymotion", false, 2, null)) {
            return true;
        }
        String HARDWARE = Build.HARDWARE;
        s.j(HARDWARE, "HARDWARE");
        if (t.h0(HARDWARE, "goldfish", false, 2, null)) {
            return true;
        }
        s.j(HARDWARE, "HARDWARE");
        if (t.h0(HARDWARE, "ranchu", false, 2, null)) {
            return true;
        }
        s.j(HARDWARE, "HARDWARE");
        if (t.h0(HARDWARE, "vbox86", false, 2, null)) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        s.j(PRODUCT, "PRODUCT");
        if (t.h0(PRODUCT, SdkAction.ACTION_TYPE, false, 2, null)) {
            return true;
        }
        s.j(PRODUCT, "PRODUCT");
        if (t.h0(PRODUCT, "google_sdk", false, 2, null)) {
            return true;
        }
        s.j(PRODUCT, "PRODUCT");
        if (t.h0(PRODUCT, "sdk_google", false, 2, null)) {
            return true;
        }
        s.j(PRODUCT, "PRODUCT");
        if (t.h0(PRODUCT, "sdk_x86", false, 2, null)) {
            return true;
        }
        s.j(PRODUCT, "PRODUCT");
        if (t.h0(PRODUCT, "vbox86p", false, 2, null)) {
            return true;
        }
        s.j(PRODUCT, "PRODUCT");
        if (t.h0(PRODUCT, "emulator", false, 2, null)) {
            return true;
        }
        s.j(PRODUCT, "PRODUCT");
        if (t.h0(PRODUCT, "simulator", false, 2, null)) {
            return true;
        }
        String BOARD = Build.BOARD;
        s.j(BOARD, "BOARD");
        s.j(ROOT, "ROOT");
        String lowerCase2 = BOARD.toLowerCase(ROOT);
        s.j(lowerCase2, "toLowerCase(...)");
        if (t.h0(lowerCase2, "nox", false, 2, null)) {
            return true;
        }
        String BOOTLOADER = Build.BOOTLOADER;
        s.j(BOOTLOADER, "BOOTLOADER");
        s.j(ROOT, "ROOT");
        String lowerCase3 = BOOTLOADER.toLowerCase(ROOT);
        s.j(lowerCase3, "toLowerCase(...)");
        if (t.h0(lowerCase3, "nox", false, 2, null)) {
            return true;
        }
        s.j(HARDWARE, "HARDWARE");
        s.j(ROOT, "ROOT");
        String lowerCase4 = HARDWARE.toLowerCase(ROOT);
        s.j(lowerCase4, "toLowerCase(...)");
        if (t.h0(lowerCase4, "nox", false, 2, null)) {
            return true;
        }
        s.j(PRODUCT, "PRODUCT");
        s.j(ROOT, "ROOT");
        String lowerCase5 = PRODUCT.toLowerCase(ROOT);
        s.j(lowerCase5, "toLowerCase(...)");
        if (t.h0(lowerCase5, "nox", false, 2, null)) {
            return true;
        }
        String BRAND = Build.BRAND;
        s.j(BRAND, "BRAND");
        if (t.b0(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            s.j(DEVICE, "DEVICE");
            if (t.b0(DEVICE, "generic", false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
