package x60;

import com.stripe.android.model.ConsumerPaymentDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx60/g;", "Lu30/a;", "Lcom/stripe/android/model/p;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lcom/stripe/android/model/p$e;", "c", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/p$e;", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/p;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements u30.a<ConsumerPaymentDetails> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f122840b = new g();

    private g() {
    }

    private final ConsumerPaymentDetails.e c(JSONObject json) throws JSONException {
        String strL = t30.e.l(json, "type");
        if (strL == null) {
            return null;
        }
        String lowerCase = strL.toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        if (p013kotlin.jvm.internal.s.f(lowerCase, "card")) {
            JSONObject jSONObject = json.getJSONObject("card_details");
            String string = json.getString("id");
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            String string2 = jSONObject.getString("last4");
            p013kotlin.jvm.internal.s.j(string2, "getString(...)");
            return new ConsumerPaymentDetails.Card(string, string2);
        }
        if (!p013kotlin.jvm.internal.s.f(lowerCase, "bank_account")) {
            return null;
        }
        JSONObject jSONObject2 = json.getJSONObject("bank_account_details");
        String string3 = json.getString("id");
        p013kotlin.jvm.internal.s.j(string3, "getString(...)");
        String string4 = jSONObject2.getString("last4");
        p013kotlin.jvm.internal.s.j(string4, "getString(...)");
        return new ConsumerPaymentDetails.BankAccount(string3, string4, t30.e.l(jSONObject2, "bank_name"));
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConsumerPaymentDetails a(JSONObject json) throws JSONException {
        List listM;
        ConsumerPaymentDetails.e eVarC;
        p013kotlin.jvm.internal.s.k(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("redacted_payment_details");
        if (jSONArrayOptJSONArray != null) {
            bo0.j jVarW = bo0.n.w(0, jSONArrayOptJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(p013kotlin.collections.v.y(jVarW, 10));
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(((s0) it).nextInt()));
            }
            listM = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                g gVar = f122840b;
                p013kotlin.jvm.internal.s.h(jSONObject);
                ConsumerPaymentDetails.e eVarC2 = gVar.c(jSONObject);
                if (eVarC2 != null) {
                    listM.add(eVarC2);
                }
            }
        } else {
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("redacted_payment_details");
            listM = (jSONObjectOptJSONObject == null || (eVarC = f122840b.c(jSONObjectOptJSONObject)) == null) ? p013kotlin.collections.v.m() : p013kotlin.collections.v.e(eVarC);
        }
        return new ConsumerPaymentDetails(listM);
    }
}
