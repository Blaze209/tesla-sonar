package r30;

import ch.qos.logback.core.joran.action.Action;
import java.util.Iterator;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr30/f;", "", "<init>", "()V", "", "", "stripeIntentParams", Action.KEY_ATTRIBUTE, "Lr30/d;", "fraudDetectionData", "a", "(Ljava/util/Map;Ljava/lang/String;Lr30/d;)Ljava/util/Map;", "params", "b", "(Ljava/util/Map;Lr30/d;)Ljava/util/Map;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {
    private final Map<String, ?> a(Map<String, ?> stripeIntentParams, String key, FraudDetectionData fraudDetectionData) {
        Object obj = stripeIntentParams.get(key);
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            Map<String, String> mapC = fraudDetectionData != null ? fraudDetectionData.c() : null;
            if (mapC == null) {
                mapC = v0.i();
            }
            Map<String, ?> mapR = v0.r(stripeIntentParams, v0.f(x.a(key, v0.r(map, mapC))));
            if (mapR != null) {
                return mapR;
            }
        }
        return stripeIntentParams;
    }

    public final Map<String, ?> b(Map<String, ?> params, FraudDetectionData fraudDetectionData) {
        Object next;
        Map<String, ?> mapA;
        s.k(params, "params");
        Iterator it = d1.i("source_data", "payment_method_data").iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!params.containsKey((String) next));
        String str = (String) next;
        return (str == null || (mapA = a(params, str, fraudDetectionData)) == null) ? params : mapA;
    }
}
