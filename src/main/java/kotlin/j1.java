package kotlin;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import w4.n;
import wn0.a;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb2/j1;", "", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Lkotlin/Function0;", "Lw4/n;", "place", "<init>", "(IILwn0/a;)V", "a", "I", "c", "()I", "b", "Lwn0/a;", "()Lwn0/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a<n> place;

    public j1(int i11, int i12, a<n> aVar) {
        this.width = i11;
        this.height = i12;
        this.place = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final a<n> b() {
        return this.place;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getWidth() {
        return this.width;
    }
}
