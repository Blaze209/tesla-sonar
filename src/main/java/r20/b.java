package r20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R4\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"Lr20/b;", "", "", "schema", "Lr20/c;", "data", "<init>", "(Ljava/lang/String;Lr20/c;)V", "(Ljava/lang/String;Ljava/lang/Object;)V", "(Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lr20/b;", "trackerPayload", "c", "(Lr20/c;)Lr20/b;", "b", "(Ljava/lang/Object;)Lr20/b;", "toString", "()Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", StatusResponse.PAYLOAD, "", "()Ljava/util/Map;", "map", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, Object> payload;

    public b(String schema, c data) {
        s.k(schema, "schema");
        s.k(data, "data");
        this.payload = new HashMap<>();
        d(schema);
        c(data);
    }

    public final Map<String, Object> a() {
        return this.payload;
    }

    public final b b(Object data) {
        if (data != null) {
            this.payload.put("data", data);
        }
        return this;
    }

    public final b c(c trackerPayload) {
        if (trackerPayload != null) {
            this.payload.put("data", trackerPayload.getMap());
        }
        return this;
    }

    public final b d(String schema) {
        s.k(schema, "schema");
        if (schema.length() <= 0) {
            throw new IllegalArgumentException("schema cannot be empty");
        }
        this.payload.put("schema", schema);
        return this;
    }

    public String toString() {
        String string = new JSONObject(this.payload).toString();
        s.j(string, "JSONObject(payload).toString()");
        return string;
    }

    public b(String schema, Object data) {
        s.k(schema, "schema");
        s.k(data, "data");
        this.payload = new HashMap<>();
        d(schema);
        b(data);
    }

    public b(String schema) {
        s.k(schema, "schema");
        this.payload = new HashMap<>();
        d(schema);
        b(new HashMap());
    }
}
