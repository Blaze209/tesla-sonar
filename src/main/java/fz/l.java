package fz;

import android.util.Log;
import dz.n1;
import dz.x0;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lfz/l;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "toImageAnalysisFormat", "()I", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "Companion", "a", "YUV", "RGB", "UNKNOWN", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum l implements h {
    YUV("yuv"),
    RGB("rgb"),
    UNKNOWN("unknown");

    private static final String TAG = "PixelFormat";
    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfz/l$a;", "", "Lfz/l;", "<init>", "()V", "", "imageFormat", "a", "(I)Lfz/l;", "", "unionValue", "b", "(Ljava/lang/String;)Lfz/l;", "TAG", "Ljava/lang/String;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(int imageFormat) {
            if (imageFormat == 1) {
                return l.RGB;
            }
            if (imageFormat == 35) {
                return l.YUV;
            }
            Log.w(l.TAG, "Unknown PixelFormat! " + gz.d.INSTANCE.a(imageFormat));
            return l.UNKNOWN;
        }

        public l b(String unionValue) throws x0 {
            if (unionValue != null) {
                int iHashCode = unionValue.hashCode();
                if (iHashCode != -284840886) {
                    if (iHashCode != 112845) {
                        if (iHashCode == 120026 && unionValue.equals("yuv")) {
                            return l.YUV;
                        }
                    } else if (unionValue.equals("rgb")) {
                        return l.RGB;
                    }
                } else if (unionValue.equals("unknown")) {
                    return l.UNKNOWN;
                }
            }
            throw new x0("pixelFormat", unionValue);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66741a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.YUV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66741a = iArr;
        }
    }

    l(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<l> getEntries() {
        return $ENTRIES;
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }

    public final int toImageAnalysisFormat() throws n1 {
        int i11 = b.f66741a[ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        throw new n1(getUnionValue());
    }
}
