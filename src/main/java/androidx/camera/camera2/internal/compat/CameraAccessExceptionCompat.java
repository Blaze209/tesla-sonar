package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Set<Integer> f2978c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Set<Integer> f2979d = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraAccessException f2981b;

    public CameraAccessExceptionCompat(int i11, String str, Throwable th2) {
        super(a(i11, str), th2);
        this.f2980a = i11;
        this.f2981b = f2978c.contains(Integer.valueOf(i11)) ? new CameraAccessException(i11, str, th2) : null;
    }

    private static String a(int i11, String str) {
        return String.format("%s (%d): %s", c(i11), Integer.valueOf(i11), str);
    }

    private static String b(int i11) {
        if (i11 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i11 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i11 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i11 == 4) {
            return "The camera device is in use already";
        }
        if (i11 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i11 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i11 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    @NonNull
    private static String c(int i11) {
        if (i11 == 1) {
            return "CAMERA_DISABLED";
        }
        if (i11 == 2) {
            return "CAMERA_DISCONNECTED";
        }
        if (i11 == 3) {
            return "CAMERA_ERROR";
        }
        if (i11 == 4) {
            return "CAMERA_IN_USE";
        }
        if (i11 == 5) {
            return "MAX_CAMERAS_IN_USE";
        }
        if (i11 == 1000) {
            return "CAMERA_DEPRECATED_HAL";
        }
        if (i11 != 10001) {
            return i11 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR";
        }
        return "CAMERA_UNAVAILABLE_DO_NOT_DISTURB";
    }

    @NonNull
    public static CameraAccessExceptionCompat e(@NonNull CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int d() {
        return this.f2980a;
    }

    public CameraAccessExceptionCompat(int i11, Throwable th2) {
        super(b(i11), th2);
        this.f2980a = i11;
        this.f2981b = f2978c.contains(Integer.valueOf(i11)) ? new CameraAccessException(i11, null, th2) : null;
    }

    private CameraAccessExceptionCompat(@NonNull CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f2980a = cameraAccessException.getReason();
        this.f2981b = cameraAccessException;
    }
}
