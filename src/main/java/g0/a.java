package g0;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @NonNull
    public static j1 a(@NonNull CamcorderProfile camcorderProfile) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            y0.l("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i11 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return d.a(camcorderProfile);
    }

    @NonNull
    public static j1 b(@NonNull EncoderProfiles encoderProfiles) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return c.a(encoderProfiles);
        }
        if (i11 >= 31) {
            return b.a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i11 + ". Version 31 or higher required.");
    }
}
