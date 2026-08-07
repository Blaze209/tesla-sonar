package xm;

import android.util.SparseIntArray;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lxm/i;", "", "<init>", "()V", "Lxm/z;", "a", "()Lxm/z;", "Landroid/util/SparseIntArray;", "b", "Landroid/util/SparseIntArray;", "DEFAULT_BUCKETS", "", "()I", "maxSizeHardCap", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f123733a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SparseIntArray DEFAULT_BUCKETS = new SparseIntArray(0);

    private i() {
    }

    public static final z a() {
        return new z(0, f123733a.b(), DEFAULT_BUCKETS);
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
