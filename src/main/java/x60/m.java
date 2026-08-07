package x60;

import com.stripe.android.model.Card;
import com.stripe.android.model.CustomerBankAccount;
import com.stripe.android.model.CustomerCard;
import com.stripe.android.model.CustomerSource;
import com.stripe.android.model.Source;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx60/m;", "Lu30/a;", "Lcom/stripe/android/model/d0;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/d0;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m implements u30.a<com.stripe.android.model.d0> {
    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.d0 a(JSONObject json) {
        Source sourceA;
        Card cardA;
        p013kotlin.jvm.internal.s.k(json, "json");
        String strL = t30.e.l(json, "object");
        if (strL != null) {
            int iHashCode = strL.hashCode();
            if (iHashCode != -1825227990) {
                if (iHashCode == -896505829) {
                    if (strL.equals("source") && (sourceA = new b0().a(json)) != null) {
                        return new CustomerSource(sourceA);
                    }
                    return null;
                }
                if (iHashCode == 3046160 && strL.equals("card") && (cardA = new e().a(json)) != null) {
                    return new CustomerCard(cardA);
                }
                return null;
            }
            if (strL.equals("bank_account")) {
                return new CustomerBankAccount(new d().a(json));
            }
        }
        return null;
    }
}
