package com.stripe.android.view;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001a3\u0010\u0005\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/h;", "userSelectedBrand", "", "possibleBrands", "merchantPreferredBrands", "a", "(Lcom/stripe/android/model/h;Ljava/util/List;Ljava/util/List;)Lcom/stripe/android/model/h;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class v {
    public static final com.stripe.android.model.h a(com.stripe.android.model.h hVar, List<? extends com.stripe.android.model.h> possibleBrands, List<? extends com.stripe.android.model.h> merchantPreferredBrands) {
        p013kotlin.jvm.internal.s.k(possibleBrands, "possibleBrands");
        p013kotlin.jvm.internal.s.k(merchantPreferredBrands, "merchantPreferredBrands");
        Object obj = null;
        if (hVar != com.stripe.android.model.h.Unknown && !p013kotlin.collections.v.g0(possibleBrands, hVar)) {
            hVar = null;
        }
        for (Object obj2 : merchantPreferredBrands) {
            if (possibleBrands.contains((com.stripe.android.model.h) obj2)) {
                obj = obj2;
                break;
            }
        }
        com.stripe.android.model.h hVar2 = (com.stripe.android.model.h) obj;
        if (hVar == null) {
            return hVar2 == null ? com.stripe.android.model.h.Unknown : hVar2;
        }
        return hVar;
    }
}
