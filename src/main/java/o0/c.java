package o0;

import android.util.Size;
import androidx.annotation.NonNull;
import com.plaid.internal.EnumC4419g;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Size f95561a = new Size(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Size f95562b = new Size(320, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Size f95563c = new Size(640, 480);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Size f95564d = new Size(720, 480);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f95565e = new Size(1280, 720);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f95566f = new Size(1920, 1080);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f95567g = new Size(1920, 1440);

    public static <T> T a(@NonNull Size size, @NonNull TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            return entryCeilingEntry.getValue();
        }
        Map.Entry<Size, T> entryFloorEntry = treeMap.floorEntry(size);
        if (entryFloorEntry != null) {
            return entryFloorEntry.getValue();
        }
        return null;
    }

    public static int b(int i11, int i12) {
        return i11 * i12;
    }

    public static int c(@NonNull Size size) {
        return b(size.getWidth(), size.getHeight());
    }

    public static boolean d(@NonNull Size size, @NonNull Size size2) {
        return c(size) < c(size2);
    }
}
