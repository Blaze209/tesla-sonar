package com.stripe.android.model;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "", "cardPaymentMethodCreateParams", "Lkotlin/Pair;", "a", "(Ljava/util/Map;)Lkotlin/Pair;", "payments-model_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class r {
    public static final Pair<String, Object> a(Map<String, ? extends Object> cardPaymentMethodCreateParams) {
        p013kotlin.jvm.internal.s.k(cardPaymentMethodCreateParams, "cardPaymentMethodCreateParams");
        Object obj = cardPaymentMethodCreateParams.get("billing_details");
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get(PlaceTypes.ADDRESS) : null;
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 != null) {
            return jn0.x.a("billing_address", p013kotlin.collections.v0.m(jn0.x.a("country_code", map2.get(PlaceTypes.COUNTRY)), jn0.x.a(PlaceTypes.POSTAL_CODE, map2.get(PlaceTypes.POSTAL_CODE))));
        }
        return null;
    }
}
