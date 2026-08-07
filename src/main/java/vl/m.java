package vl;

import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lvl/m;", "", "Lvl/j;", "frameLoader", "Ljava/util/Date;", "insertedTime", "<init>", "(Lvl/j;Ljava/util/Date;)V", "a", "Lvl/j;", "()Lvl/j;", "b", "Ljava/util/Date;", "()Ljava/util/Date;", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j frameLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Date insertedTime;

    public m(j frameLoader, Date insertedTime) {
        s.k(frameLoader, "frameLoader");
        s.k(insertedTime, "insertedTime");
        this.frameLoader = frameLoader;
        this.insertedTime = insertedTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getFrameLoader() {
        return this.frameLoader;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Date getInsertedTime() {
        return this.insertedTime;
    }
}
