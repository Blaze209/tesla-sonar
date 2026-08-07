package h20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u000eJ\u001d\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u000eR$\u0010 \u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110$8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00106\u001a\b\u0012\u0004\u0012\u00020\u0015018\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b'\u00102\u001a\u0004\b%\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b+\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b8\u0010A\"\u0004\bB\u0010CR$\u0010J\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\b?\u0010G\"\u0004\bH\u0010IR\"\u0010P\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bE\u0010M\"\u0004\bN\u0010OR\"\u0010R\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010L\u001a\u0004\bK\u0010M\"\u0004\bQ\u0010O¨\u0006S"}, d2 = {"Lh20/r;", "Lg20/h;", "Lo20/f;", "event", "Lg20/m;", "state", "<init>", "(Lo20/f;Lg20/m;)V", "Lr20/a;", "toPayload", "", "base64Encoded", "Ljn0/h0;", "s", "(Lr20/a;Z)V", "", "", "", StatusResponse.PAYLOAD, "a", "(Ljava/util/Map;)Z", "Lr20/b;", "entity", "b", "(Lr20/b;)V", "q", "r", "Ljava/lang/String;", "getSchema", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "schema", "getName", "k", "name", "", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "l", "(Ljava/util/Map;)V", DateTokenConverter.CONVERTER_KEY, "Lg20/m;", "getState", "()Lg20/m;", "n", "(Lg20/m;)V", "", "Ljava/util/List;", "()Ljava/util/List;", "j", "(Ljava/util/List;)V", "entities", "Ljava/util/UUID;", "f", "Ljava/util/UUID;", "()Ljava/util/UUID;", "setEventId", "(Ljava/util/UUID;)V", "eventId", "", "g", "J", "()J", "o", "(J)V", "timestamp", "h", "Ljava/lang/Long;", "()Ljava/lang/Long;", "p", "(Ljava/lang/Long;)V", "trueTimestamp", IntegerTokenConverter.CONVERTER_KEY, "Z", "()Z", "setPrimitive", "(Z)V", "isPrimitive", "setService", "isService", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r implements g20.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String schema;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Map<String, Object> payload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public g20.m state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public List<r20.b> entities;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private UUID eventId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long timestamp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Long trueTimestamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isPrimitive;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isService;

    public r(o20.f event, g20.m mVar) {
        s.k(event, "event");
        UUID uuidRandomUUID = UUID.randomUUID();
        s.j(uuidRandomUUID, "randomUUID()");
        this.eventId = uuidRandomUUID;
        this.timestamp = System.currentTimeMillis();
        j(v.p1(event.getEntities()));
        this.trueTimestamp = event.getTrueTimestamp();
        l(new HashMap(event.b()));
        if (mVar != null) {
            n(mVar);
        } else {
            n(new g20.l());
        }
        this.isService = event instanceof o20.m;
        if (event instanceof o20.b) {
            k(((o20.b) event).f());
            this.isPrimitive = true;
        } else {
            o20.c cVar = event instanceof o20.c ? (o20.c) event : null;
            m(cVar != null ? cVar.getSchema() : null);
            this.isPrimitive = false;
        }
    }

    private final void s(r20.a toPayload, boolean base64Encoded) {
        String schema = getSchema();
        if (schema == null) {
            return;
        }
        r20.b bVar = new r20.b(schema, e());
        HashMap map = new HashMap();
        map.put("schema", "iglu:com.snowplowanalytics.snowplow/unstruct_event/jsonschema/1-0-0");
        map.put("data", bVar.a());
        toPayload.a(map, base64Encoded, "ue_px", "ue_pr");
    }

    @Override // g20.h
    public boolean a(Map<String, ? extends Object> payload) {
        s.k(payload, "payload");
        boolean z11 = true;
        for (Map.Entry<String, ? extends Object> entry : payload.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (e().get(key) == null) {
                e().put(key, value);
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    public final void b(r20.b entity) {
        s.k(entity, "entity");
        c().add(entity);
    }

    public List<r20.b> c() {
        List<r20.b> list = this.entities;
        if (list != null) {
            return list;
        }
        s.B("entities");
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    public Map<String, Object> e() {
        Map<String, Object> map = this.payload;
        if (map != null) {
            return map;
        }
        s.B(StatusResponse.PAYLOAD);
        return null;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getTrueTimestamp() {
        return this.trueTimestamp;
    }

    @Override // s20.b
    public String getName() {
        return this.name;
    }

    @Override // s20.b
    public String getSchema() {
        return this.schema;
    }

    @Override // g20.h
    public g20.m getState() {
        g20.m mVar = this.state;
        if (mVar != null) {
            return mVar;
        }
        s.B("state");
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsPrimitive() {
        return this.isPrimitive;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsService() {
        return this.isService;
    }

    public void j(List<r20.b> list) {
        s.k(list, "<set-?>");
        this.entities = list;
    }

    public void k(String str) {
        this.name = str;
    }

    public void l(Map<String, Object> map) {
        s.k(map, "<set-?>");
        this.payload = map;
    }

    public void m(String str) {
        this.schema = str;
    }

    public void n(g20.m mVar) {
        s.k(mVar, "<set-?>");
        this.state = mVar;
    }

    public final void o(long j11) {
        this.timestamp = j11;
    }

    public final void p(Long l11) {
        this.trueTimestamp = l11;
    }

    public final void q(r20.a payload, boolean base64Encoded) {
        s.k(payload, "payload");
        if (c().isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<r20.b> it = c().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().a());
        }
        payload.a(new r20.b("iglu:com.snowplowanalytics.snowplow/contexts/jsonschema/1-0-1", linkedList).a(), base64Encoded, "cx", "co");
    }

    public final void r(r20.a toPayload, boolean base64Encoded) {
        s.k(toPayload, "toPayload");
        if (this.isPrimitive) {
            toPayload.c(e());
        } else {
            s(toPayload, base64Encoded);
        }
    }
}
