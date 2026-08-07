package x60;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Card;
import com.stripe.android.model.r1;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/e;", "Lu30/a;", "Lcom/stripe/android/model/g;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/g;", "a", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements u30.a<Card> {
    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Card a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        if (!p013kotlin.jvm.internal.s.f("card", json.optString("object"))) {
            return null;
        }
        t30.e eVar = t30.e.f112281a;
        Integer numI = eVar.i(json, "exp_month");
        Integer numValueOf = Integer.valueOf(numI != null ? numI.intValue() : -1);
        int iIntValue = numValueOf.intValue();
        Integer num = (iIntValue < 1 || iIntValue > 12) ? null : numValueOf;
        Integer numI2 = eVar.i(json, "exp_year");
        Integer numValueOf2 = Integer.valueOf(numI2 != null ? numI2.intValue() : -1);
        Integer num2 = numValueOf2.intValue() < 0 ? null : numValueOf2;
        String strL = t30.e.l(json, "address_city");
        String strL2 = t30.e.l(json, "address_line1");
        String strL3 = t30.e.l(json, "address_line1_check");
        String strL4 = t30.e.l(json, "address_line2");
        String strL5 = t30.e.l(json, "address_country");
        String strL6 = t30.e.l(json, "address_state");
        String strL7 = t30.e.l(json, "address_zip");
        String strL8 = t30.e.l(json, "address_zip_check");
        com.stripe.android.model.h hVarA = Card.INSTANCE.a(t30.e.l(json, "brand"));
        String strG = eVar.g(json, PlaceTypes.COUNTRY);
        String strL9 = t30.e.l(json, "customer");
        return new Card(num, num2, t30.e.l(json, "name"), strL2, strL3, strL4, strL, strL6, strL7, strL8, strL5, t30.e.l(json, "last4"), hVarA, com.stripe.android.model.i.INSTANCE.a(t30.e.l(json, "funding")), t30.e.l(json, "fingerprint"), strG, t30.e.h(json, "currency"), strL9, t30.e.l(json, "cvc_check"), t30.e.l(json, "id"), r1.INSTANCE.a(t30.e.l(json, "tokenization_method")));
    }
}
