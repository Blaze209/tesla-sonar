package y00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: y00.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u000e¨\u0006 "}, d2 = {"Ly00/f;", "", "", "index", "", "success", "", "failureMessage", "", "size", "path", "<init>", "(IZLjava/lang/String;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "c", "Ljava/lang/String;", "J", "()J", "e", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String failureMessage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String path;

    public Result(int i11, boolean z11, String str, long j11, String str2) {
        this.index = i11;
        this.success = z11;
        this.failureMessage = str;
        this.size = j11;
        this.path = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return this.index == result.index && this.success == result.success && s.f(this.failureMessage, result.failureMessage) && this.size == result.size && s.f(this.path, result.path);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.index) * 31) + Boolean.hashCode(this.success)) * 31;
        String str = this.failureMessage;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.size)) * 31;
        String str2 = this.path;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Result(index=" + this.index + ", success=" + this.success + ", failureMessage=" + this.failureMessage + ", size=" + this.size + ", path=" + this.path + ")";
    }

    public /* synthetic */ Result(int i11, boolean z11, String str, long j11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11, str, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? null : str2);
    }
}
