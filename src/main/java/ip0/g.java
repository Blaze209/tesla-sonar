package ip0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lip0/g;", "", "", "entryCount", "centralDirectoryOffset", "", "commentByteCount", "<init>", "(JJI)V", "a", "J", "c", "()J", "b", "I", "()I", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long entryCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long centralDirectoryOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int commentByteCount;

    public g(long j11, long j12, int i11) {
        this.entryCount = j11;
        this.centralDirectoryOffset = j12;
        this.commentByteCount = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCentralDirectoryOffset() {
        return this.centralDirectoryOffset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCommentByteCount() {
        return this.commentByteCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEntryCount() {
        return this.entryCount;
    }
}
