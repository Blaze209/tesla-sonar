package sb;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lsb/f0;", "", "", "workSpecId", "Landroidx/work/g;", ReactProgressBarViewManager.PROP_PROGRESS, "<init>", "(Ljava/lang/String;Landroidx/work/g;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroidx/work/g;", "()Landroidx/work/g;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String workSpecId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.g progress;

    public f0(String workSpecId, androidx.work.g progress) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        p013kotlin.jvm.internal.s.k(progress, "progress");
        this.workSpecId = workSpecId;
        this.progress = progress;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.work.g getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
