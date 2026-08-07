package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.e3;
import androidx.camera.core.impl.m2;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ExtraCroppingQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Range<Integer>> f2987a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2988a;

        static {
            int[] iArr = new int[e3.b.values().length];
            f2988a = iArr;
            try {
                iArr[e3.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2988a[e3.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2988a[e3.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f2987a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    private static boolean h() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map<String, Range<Integer>> map = f2987a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range<Integer> range = map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    static boolean i() {
        return h();
    }

    public Size g(@NonNull e3.b bVar) {
        if (!h()) {
            return null;
        }
        int i11 = a.f2988a[bVar.ordinal()];
        if (i11 == 1) {
            return new Size(1920, 1080);
        }
        if (i11 == 2) {
            return new Size(1280, 720);
        }
        if (i11 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
