package v5;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: v5.i, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lv5/i;", "", "", "channel", "preambleIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "b", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UwbComplexChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int preambleIndex;

    public UwbComplexChannel(int i11, int i12) {
        this.channel = i11;
        this.preambleIndex = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPreambleIndex() {
        return this.preambleIndex;
    }

    public String toString() {
        return "UwbComplexChannel(channel=" + this.channel + ", preambleIndex=" + this.preambleIndex + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
