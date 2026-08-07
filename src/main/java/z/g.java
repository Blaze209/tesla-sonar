package z;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import c0.y0;
import java.nio.BufferUnderflowException;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static boolean a(@NonNull b bVar) {
        return b(false, bVar);
    }

    public static boolean b(boolean z11, @NonNull b bVar) {
        Boolean bool;
        try {
            bool = (Boolean) bVar.b(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e11) {
            if (androidx.camera.camera2.internal.compat.quirk.b.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                y0.a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                y0.d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e11);
            }
            if (z11) {
                throw e11;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            y0.l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
