package ke;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: ke.o, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lke/o;", "", "", "millisUntilFinished", "", ReactProgressBarViewManager.PROP_PROGRESS, "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "I", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TimerData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long millisUntilFinished;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int progress;

    public TimerData(long j11, int i11) {
        this.millisUntilFinished = j11;
        this.progress = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getMillisUntilFinished() {
        return this.millisUntilFinished;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerData)) {
            return false;
        }
        TimerData timerData = (TimerData) other;
        return this.millisUntilFinished == timerData.millisUntilFinished && this.progress == timerData.progress;
    }

    public int hashCode() {
        return (Long.hashCode(this.millisUntilFinished) * 31) + Integer.hashCode(this.progress);
    }

    public String toString() {
        return "TimerData(millisUntilFinished=" + this.millisUntilFinished + ", progress=" + this.progress + ")";
    }
}
