package fn;

import android.graphics.ColorSpace;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfn/e;", "", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Landroid/graphics/ColorSpace;", "colorSpace", "<init>", "(IILandroid/graphics/ColorSpace;)V", "a", "Landroid/graphics/ColorSpace;", "()Landroid/graphics/ColorSpace;", "Lkotlin/Pair;", "b", "Lkotlin/Pair;", "()Lkotlin/Pair;", "dimensions", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ColorSpace colorSpace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Pair<Integer, Integer> dimensions;

    public e(int i11, int i12, ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
        this.dimensions = (i11 == -1 || i12 == -1) ? null : new Pair<>(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    public final Pair<Integer, Integer> b() {
        return this.dimensions;
    }
}
