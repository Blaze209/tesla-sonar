package xm;

import android.util.SparseIntArray;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxm/k;", "", "<init>", "()V", "", "min", "max", "numThreads", "Landroid/util/SparseIntArray;", "a", "(III)Landroid/util/SparseIntArray;", "Lxm/z;", "b", "()Lxm/z;", "I", "getDEFAULT_MAX_NUM_THREADS", "()I", "DEFAULT_MAX_NUM_THREADS", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f123736a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int DEFAULT_MAX_NUM_THREADS = Runtime.getRuntime().availableProcessors();

    private k() {
    }

    public static final SparseIntArray a(int min, int max, int numThreads) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (min <= max) {
            sparseIntArray.put(min, numThreads);
            min *= 2;
        }
        return sparseIntArray;
    }

    public static final z b() {
        int i11 = DEFAULT_MAX_NUM_THREADS;
        return new z(4194304, i11 * 4194304, a(131072, 4194304, i11), 131072, 4194304, i11);
    }
}
