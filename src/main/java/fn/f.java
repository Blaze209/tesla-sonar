package fn;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.io.IOException;
import java.io.InputStream;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lfn/f;", "", "<init>", "()V", "", "orientation", "a", "(I)I", "Ljava/io/InputStream;", "inputStream", "b", "(Ljava/io/InputStream;)I", "markerToFind", "", "e", "(Ljava/io/InputStream;I)Z", "marker", "c", "(I)Z", DateTokenConverter.CONVERTER_KEY, "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f66060a = new f();

    private f() {
    }

    public static final int a(int orientation) {
        return h.a(orientation);
    }

    public static final int b(InputStream inputStream) {
        s.k(inputStream, "inputStream");
        try {
            int iD = f66060a.d(inputStream);
            if (iD == 0) {
                return 0;
            }
            return h.d(inputStream, iD);
        } catch (IOException unused) {
            return 0;
        }
    }

    private final boolean c(int marker) {
        switch (marker) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case SDK_ASSET_ICON_ARROW_UP_VALUE:
            case SDK_ASSET_ICON_CANCEL_VALUE:
            case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
            case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
            case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
            case SDK_ASSET_ICON_CLIPBOARD_VALUE:
            case SDK_ASSET_ICON_CLOCK_VALUE:
            case SDK_ASSET_ICON_COMMENT_VALUE:
                return true;
            case 196:
            case 200:
            case SDK_ASSET_ICON_CLEARED_REC_VALUE:
            default:
                return false;
        }
    }

    private final int d(InputStream inputStream) throws IOException {
        if (e(inputStream, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE)) {
            int iA = g.a(inputStream, 2, false);
            if (iA - 2 > 6) {
                int iA2 = g.a(inputStream, 4, false);
                int iA3 = g.a(inputStream, 2, false);
                int i11 = iA - 8;
                if (iA2 == 1165519206 && iA3 == 0) {
                    return i11;
                }
            }
        }
        return 0;
    }

    public static final boolean e(InputStream inputStream, int markerToFind) throws IOException {
        s.k(inputStream, "inputStream");
        while (g.a(inputStream, 1, false) == 255) {
            int iA = 255;
            while (iA == 255) {
                iA = g.a(inputStream, 1, false);
            }
            if ((markerToFind == 192 && f66060a.c(iA)) || iA == markerToFind) {
                return true;
            }
            if (iA != 1 && iA != 216) {
                if (iA == 217 || iA == 218) {
                    break;
                }
                inputStream.skip(g.a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }
}
