package po0;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpo0/p;", "Output", "", "", "Lpo0/n;", "operations", "followedBy", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<n<Output>> operations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<p<Output>> followedBy;

    /* JADX WARN: Multi-variable type inference failed */
    public p(List<? extends n<? super Output>> operations, List<? extends p<? super Output>> followedBy) {
        p013kotlin.jvm.internal.s.k(operations, "operations");
        p013kotlin.jvm.internal.s.k(followedBy, "followedBy");
        this.operations = operations;
        this.followedBy = followedBy;
    }

    public final List<p<Output>> a() {
        return this.followedBy;
    }

    public final List<n<Output>> b() {
        return this.operations;
    }

    public String toString() {
        return v.y0(this.operations, ", ", null, null, 0, null, null, 62, null) + CoreConstants.LEFT_PARENTHESIS_CHAR + v.y0(this.followedBy, ";", null, null, 0, null, null, 62, null) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
