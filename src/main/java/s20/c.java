package s20;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ls20/c;", "", "", "level", "<init>", "(Ljava/lang/String;II)V", "I", "getLevel", "()I", "OFF", "ERROR", "DEBUG", "VERBOSE", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum c {
    OFF(0),
    ERROR(1),
    DEBUG(2),
    VERBOSE(3);

    private final int level;

    c(int i11) {
        this.level = i11;
    }

    public final int getLevel() {
        return this.level;
    }
}
