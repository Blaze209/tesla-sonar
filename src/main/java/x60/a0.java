package x60;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Card;
import com.stripe.android.model.SourceTypeModel;
import com.stripe.android.model.r1;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/a0;", "Lu30/a;", "Lcom/stripe/android/model/SourceTypeModel$Card;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a0 implements u30.a<SourceTypeModel.Card> {
    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SourceTypeModel.Card a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        String strL = t30.e.l(json, "address_line1_check");
        String strL2 = t30.e.l(json, "address_zip_check");
        com.stripe.android.model.h hVarA = Card.INSTANCE.a(t30.e.l(json, "brand"));
        String strL3 = t30.e.l(json, PlaceTypes.COUNTRY);
        String strL4 = t30.e.l(json, "cvc_check");
        String strL5 = t30.e.l(json, "dynamic_last4");
        t30.e eVar = t30.e.f112281a;
        return new SourceTypeModel.Card(strL, strL2, hVarA, strL3, strL4, strL5, eVar.i(json, "exp_month"), eVar.i(json, "exp_year"), com.stripe.android.model.i.INSTANCE.a(t30.e.l(json, "funding")), t30.e.l(json, "last4"), SourceTypeModel.Card.ThreeDSecureStatus.INSTANCE.a(t30.e.l(json, "three_d_secure")), r1.INSTANCE.a(t30.e.l(json, "tokenization_method")));
    }
}
