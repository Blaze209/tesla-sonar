package x60;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodsList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/w;", "Lu30/a;", "Lcom/stripe/android/model/b1;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/b1;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class w implements u30.a<PaymentMethodsList> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f122902b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v f122903c = new v();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx60/w$a;", "", "<init>", "()V", "", "FIELD_DATA", "Ljava/lang/String;", "Lx60/v;", "PAYMENT_METHOD_JSON_PARSER", "Lx60/v;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentMethodsList a(JSONObject json) {
        Object objB;
        p013kotlin.jvm.internal.s.k(json, "json");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            JSONArray jSONArrayOptJSONArray = json.optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            } else {
                p013kotlin.jvm.internal.s.h(jSONArrayOptJSONArray);
            }
            bo0.j jVarW = bo0.n.w(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                int iNextInt = ((s0) it).nextInt();
                v vVar = f122903c;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(iNextInt);
                p013kotlin.jvm.internal.s.j(jSONObjectOptJSONObject, "optJSONObject(...)");
                PaymentMethod paymentMethodA = vVar.a(jSONObjectOptJSONObject);
                if (paymentMethodA != null) {
                    arrayList.add(paymentMethodA);
                }
            }
            objB = jn0.s.b(arrayList);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        List listM = p013kotlin.collections.v.m();
        if (jn0.s.g(objB)) {
            objB = listM;
        }
        return new PaymentMethodsList((List) objB);
    }
}
