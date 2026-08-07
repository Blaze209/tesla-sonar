package ob0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ob0.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\f¨\u0006\u0015"}, d2 = {"Lob0/c;", "", "", "retry", "", "delayMilliseconds", "<init>", "(ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "I", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RetryPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean retry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int delayMilliseconds;

    public RetryPolicy(boolean z11, int i11) {
        this.retry = z11;
        this.delayMilliseconds = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDelayMilliseconds() {
        return this.delayMilliseconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRetry() {
        return this.retry;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetryPolicy)) {
            return false;
        }
        RetryPolicy retryPolicy = (RetryPolicy) other;
        return this.retry == retryPolicy.retry && this.delayMilliseconds == retryPolicy.delayMilliseconds;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.retry) * 31) + Integer.hashCode(this.delayMilliseconds);
    }

    public String toString() {
        return "RetryPolicy(retry=" + this.retry + ", delayMilliseconds=" + this.delayMilliseconds + ")";
    }

    public /* synthetic */ RetryPolicy(boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i12 & 2) != 0 ? 0 : i11);
    }
}
