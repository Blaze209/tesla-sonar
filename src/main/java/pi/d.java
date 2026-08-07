package pi;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import ii.DeferredFragmentIdentifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import okio.j;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJC\u0010\u000f\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0014J9\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0003R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR)\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020%0)8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b&\u0010+R$\u00101\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b \u00100R$\u00102\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b*\u00100¨\u00063"}, d2 = {"Lpi/d;", "", "<init>", "()V", "", "", "Lcom/apollographql/apollo3/internal/JsonMap;", "incrementalItem", "Ljn0/h0;", "h", "(Ljava/util/Map;)V", "", "Lcom/apollographql/apollo3/internal/MutableJsonMap;", "destination", "map", "a", "(Ljava/util/Map;Ljava/util/Map;)V", "Lokio/j;", "json", "e", "(Lokio/j;)Ljava/util/Map;", "", "path", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", StatusResponse.PAYLOAD, "g", "f", "(Ljava/util/Map;)Ljava/util/Map;", "j", "Ljava/util/Map;", "_merged", "b", "getMerged", "()Ljava/util/Map;", "merged", "", "Lii/l;", "c", "Ljava/util/Set;", "_mergedFragmentIds", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Set;", "mergedFragmentIds", "", "<set-?>", "Z", "()Z", "hasNext", "isEmptyPayload", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> _merged;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> merged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<DeferredFragmentIdentifier> _mergedFragmentIds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<DeferredFragmentIdentifier> mergedFragmentIds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isEmptyPayload;

    public d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this._merged = linkedHashMap;
        this.merged = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this._mergedFragmentIds = linkedHashSet;
        this.mergedFragmentIds = linkedHashSet;
        this.hasNext = true;
    }

    private final void a(Map<String, Object> destination, Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (destination.containsKey(key) && u0.q(destination.get(key))) {
                Object obj = destination.get(key);
                s.i(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.MutableJsonMap }");
                Map<String, Object> mapD = u0.d(obj);
                Map<String, ? extends Object> map2 = value instanceof Map ? (Map) value : null;
                if (map2 == null) {
                    throw new IllegalStateException((CoreConstants.SINGLE_QUOTE_CHAR + key + "' is an object in destination but not in map").toString());
                }
                a(mapD, map2);
            } else {
                destination.put(key, value);
            }
        }
    }

    private final Map<String, Object> e(j json) {
        Object objD = mi.a.d(new mi.d(json));
        s.i(objD, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.JsonMap }");
        return (Map) objD;
    }

    private final void h(Map<String, ? extends Object> incrementalItem) {
        Map<String, ? extends Object> map = (Map) incrementalItem.get("data");
        Object obj = incrementalItem.get("path");
        s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List<? extends Object> list = (List) obj;
        Object obj2 = this.merged.get("data");
        s.i(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.JsonMap }");
        Map<String, ? extends Object> map2 = (Map) obj2;
        if (map != null) {
            Object objI = i(map2, list);
            s.i(objI, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.MutableJsonMap }");
            a(u0.d(objI), map);
            this._mergedFragmentIds.add(new DeferredFragmentIdentifier(list, (String) incrementalItem.get(AnnotatedPrivateKey.LABEL)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    private final Object i(Map<String, ? extends Object> map, List<? extends Object> path) {
        for (Object obj : path) {
            if (map instanceof List) {
                s.i(obj, "null cannot be cast to non-null type kotlin.Int");
                map = ((List) map).get(((Integer) obj).intValue());
            } else {
                s.i(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.apollographql.apollo3.internal.DeferredJsonMergerKt.JsonMap }");
                map = ((Map) map).get(obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    public final Set<DeferredFragmentIdentifier> c() {
        return this.mergedFragmentIds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsEmptyPayload() {
        return this.isEmptyPayload;
    }

    public final Map<String, Object> f(Map<String, ? extends Object> payload) {
        s.k(payload, "payload");
        if (this.merged.isEmpty()) {
            this._merged.putAll(payload);
            return this.merged;
        }
        Object obj = payload.get("incremental");
        List<Map<String, ? extends Object>> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            this.isEmptyPayload = true;
        } else {
            this.isEmptyPayload = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map<String, ? extends Object> map : list) {
                h(map);
                Object obj2 = map.get("errors");
                List list2 = obj2 instanceof List ? (List) obj2 : null;
                if (list2 != null) {
                    v.E(arrayList, list2);
                }
                Object obj3 = map.get("extensions");
                Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map2 != null) {
                    arrayList2.add(map2);
                }
            }
            if (arrayList.isEmpty()) {
                this._merged.remove("errors");
            } else {
                this._merged.put("errors", arrayList);
            }
            if (arrayList2.isEmpty()) {
                this._merged.remove("extensions");
            } else {
                this._merged.put("extensions", v0.f(x.a("incremental", arrayList2)));
            }
        }
        Boolean bool = (Boolean) payload.get("hasNext");
        this.hasNext = bool != null ? bool.booleanValue() : false;
        return this.merged;
    }

    public final Map<String, Object> g(j payload) {
        s.k(payload, "payload");
        return f(e(payload));
    }

    public final void j() {
        this._merged.clear();
        this._mergedFragmentIds.clear();
        this.hasNext = true;
        this.isEmptyPayload = false;
    }
}
