package q20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\b\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001e"}, d2 = {"Lq20/h;", "", "Lr20/a;", StatusResponse.PAYLOAD, "", "id", "", "oversize", "<init>", "(Lr20/a;JZ)V", "", "payloads", "emitterEventIds", "(Ljava/util/List;Ljava/util/List;)V", "", "e", "(Lr20/a;)Ljava/lang/String;", "a", "Lr20/a;", DateTokenConverter.CONVERTER_KEY, "()Lr20/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", "Ljava/lang/String;", "()Ljava/lang/String;", "customUserAgent", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r20.a payload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Long> emitterEventIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean oversize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String customUserAgent;

    public h(r20.a payload, long j11, boolean z11) {
        s.k(payload, "payload");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j11));
        this.emitterEventIds = arrayList;
        this.payload = payload;
        this.oversize = z11;
        this.customUserAgent = e(payload);
    }

    private final String e(r20.a payload) {
        Map<String, Object> map = payload.getMap();
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        if (map2 != null) {
            Object obj = map2.get("ua");
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCustomUserAgent() {
        return this.customUserAgent;
    }

    public final List<Long> b() {
        return this.emitterEventIds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getOversize() {
        return this.oversize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final r20.a getPayload() {
        return this.payload;
    }

    public h(List<? extends r20.a> payloads, List<Long> emitterEventIds) {
        s.k(payloads, "payloads");
        s.k(emitterEventIds, "emitterEventIds");
        ArrayList arrayList = new ArrayList();
        String strE = null;
        for (r20.a aVar : payloads) {
            arrayList.add(aVar.getMap());
            strE = e(aVar);
        }
        r20.c cVar = new r20.c();
        this.payload = cVar;
        Map<String, Object> mapA = new r20.b("iglu:com.snowplowanalytics.snowplow/payload_data/jsonschema/1-0-4", arrayList).a();
        Map<String, Object> map = mapA instanceof Map ? mapA : null;
        if (map != null) {
            cVar.c(map);
        }
        this.emitterEventIds = emitterEventIds;
        this.customUserAgent = strE;
        this.oversize = false;
    }
}
