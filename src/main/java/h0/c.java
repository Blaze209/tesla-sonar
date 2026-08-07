package h0;

import c0.y0;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static int a(int i11, int i12, boolean z11) {
        int i13 = z11 ? ((i12 - i11) + 360) % 360 : (i12 + i11) % 360;
        if (y0.h("CameraOrientationUtil")) {
            y0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11), Integer.valueOf(i13)));
        }
        return i13;
    }

    public static int b(int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 90;
        }
        if (i11 == 2) {
            return 180;
        }
        if (i11 == 3) {
            return EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i11);
    }
}
