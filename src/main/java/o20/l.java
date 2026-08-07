package o20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u0004\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lo20/l;", "Lo20/c;", "Lr20/b;", "eventData", "<init>", "(Lr20/b;)V", "", "schema", "", "", StatusResponse.PAYLOAD, "(Ljava/lang/String;Ljava/util/Map;)V", DateTokenConverter.CONVERTER_KEY, "Lr20/b;", "getEventData", "()Lr20/b;", "e", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "dataPayload", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r20.b eventData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> dataPayload;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String schema;

    public l(r20.b eventData) {
        s.k(eventData, "eventData");
        Map<String, Object> mapA = eventData.a();
        Object obj = mapA.get("data");
        s.i(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        this.dataPayload = (Map) obj;
        Object obj2 = mapA.get("schema");
        s.i(obj2, "null cannot be cast to non-null type kotlin.String");
        this.schema = (String) obj2;
        this.eventData = eventData;
    }

    @Override // o20.f
    public Map<String, Object> b() {
        return this.dataPayload;
    }

    @Override // o20.c
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getSchema() {
        return this.schema;
    }

    public l(String schema, Map<String, ? extends Object> payload) {
        s.k(schema, "schema");
        s.k(payload, "payload");
        this.schema = schema;
        this.dataPayload = payload;
        this.eventData = new r20.b(schema, payload);
    }
}
