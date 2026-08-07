package m20;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lm20/b;", "", "Lr20/a;", StatusResponse.PAYLOAD, "", "eventId", "<init>", "(Lr20/a;J)V", "a", "Lr20/a;", "b", "()Lr20/a;", "J", "()J", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r20.a payload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long eventId;

    public b(r20.a payload, long j11) {
        s.k(payload, "payload");
        this.payload = payload;
        this.eventId = j11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r20.a getPayload() {
        return this.payload;
    }
}
