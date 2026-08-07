package v;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

/* JADX INFO: loaded from: classes.dex */
public class h5 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f117020a;

        static {
            int[] iArr = new int[androidx.camera.core.impl.p3.b.values().length];
            f117020a = iArr;
            try {
                iArr[androidx.camera.core.impl.p3.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117020a[androidx.camera.core.impl.p3.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f117020a[androidx.camera.core.impl.p3.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f117020a[androidx.camera.core.impl.p3.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f117020a[androidx.camera.core.impl.p3.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(@NonNull androidx.camera.core.impl.p3.b bVar, int i11) {
        int i12 = a.f117020a[bVar.ordinal()];
        if (i12 != 1) {
            return (i12 == 2 && androidx.camera.camera2.internal.compat.quirk.b.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i11 == 2 ? 5 : 2;
    }

    public static int b(@NonNull androidx.camera.core.impl.p3.b bVar, int i11) {
        int i12 = a.f117020a[bVar.ordinal()];
        if (i12 != 1) {
            return (i12 == 2 && androidx.camera.camera2.internal.compat.quirk.b.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i11 == 2 ? 5 : 1;
    }
}
