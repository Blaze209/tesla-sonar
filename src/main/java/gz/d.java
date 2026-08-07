package gz;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgz/d;", "", "a", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: gz.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgz/d$a;", "", "<init>", "()V", "", "format", "", "a", "(I)Ljava/lang/String;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int format) {
            if (format == 3) {
                return "RGB_888";
            }
            if (format == 4) {
                return "RGB_565";
            }
            if (format == 16) {
                return "NV16";
            }
            if (format == 17) {
                return "NV21";
            }
            if (format == 20) {
                return "YUY2";
            }
            if (format == 54) {
                return "YCBCR_P010";
            }
            if (format == 256) {
                return "JPEG";
            }
            if (format == 538982489) {
                return "Y8";
            }
            if (format == 842094169) {
                return "YV12";
            }
            if (format == 34) {
                return "PRIVATE";
            }
            if (format == 35) {
                return "YUV_420_888";
            }
            switch (format) {
                case 39:
                    return "YUV_422_888";
                case 40:
                    return "YUV_444_888";
                case 41:
                    return "FLEX_RGB_888";
                case 42:
                    return "FLEX_RGBA_8888";
                default:
                    return "UNKNOWN (" + format + ")";
            }
        }

        private Companion() {
        }
    }
}
