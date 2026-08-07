package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Li2/v0;", "", "", "isDocked", "", "left", Snapshot.WIDTH, Snapshot.HEIGHT, "<init>", "(ZIII)V", "a", "Z", "()Z", "b", "I", "()I", "c", "getWidth", DateTokenConverter.CONVERTER_KEY, "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDocked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int height;

    public v0(boolean z11, int i11, int i12, int i13) {
        this.isDocked = z11;
        this.left = i11;
        this.width = i12;
        this.height = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLeft() {
        return this.left;
    }
}
