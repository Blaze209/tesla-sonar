package x60;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lx60/l;", "Lu30/a;", "Lcom/stripe/android/model/a0;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/a0;", "Lx60/m;", "Lx60/m;", "customerSourceJsonParser", "c", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l implements u30.a<Customer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f122848c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m customerSourceJsonParser = new m();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lx60/l$a;", "", "<init>", "()V", "", "FIELD_DATA", "Ljava/lang/String;", "FIELD_DEFAULT_SOURCE", "FIELD_DESCRIPTION", "FIELD_EMAIL", "FIELD_HAS_MORE", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_SHIPPING", "FIELD_SOURCES", "FIELD_TOTAL_COUNT", "FIELD_URL", "VALUE_CUSTOMER", "VALUE_LIST", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Customer a(JSONObject json) {
        Integer num;
        String str;
        boolean z11;
        List listM;
        boolean z12;
        p013kotlin.jvm.internal.s.k(json, "json");
        if (!p013kotlin.jvm.internal.s.f("customer", t30.e.l(json, "object"))) {
            return null;
        }
        String strL = t30.e.l(json, "id");
        String strL2 = t30.e.l(json, "default_source");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("shipping");
        ShippingInformation shippingInformationA = jSONObjectOptJSONObject != null ? new z().a(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("sources");
        if (jSONObjectOptJSONObject2 == null || !p013kotlin.jvm.internal.s.f("list", t30.e.l(jSONObjectOptJSONObject2, "object"))) {
            num = null;
            str = null;
            z11 = false;
            listM = p013kotlin.collections.v.m();
            z12 = false;
        } else {
            t30.e eVar = t30.e.f112281a;
            boolean zF = eVar.f(jSONObjectOptJSONObject2, "has_more");
            Integer numI = eVar.i(jSONObjectOptJSONObject2, "total_count");
            String strL3 = t30.e.l(jSONObjectOptJSONObject2, ImagesContract.URL);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            bo0.j jVarW = bo0.n.w(0, jSONArrayOptJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(p013kotlin.collections.v.y(jVarW, 10));
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(((s0) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                m mVar = this.customerSourceJsonParser;
                p013kotlin.jvm.internal.s.h(jSONObject);
                com.stripe.android.model.d0 d0VarA = mVar.a(jSONObject);
                if (d0VarA != null) {
                    arrayList2.add(d0VarA);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((com.stripe.android.model.d0) obj).a() != r1.ApplePay) {
                    arrayList3.add(obj);
                }
            }
            num = numI;
            z11 = false;
            str = strL3;
            listM = arrayList3;
            z12 = zF;
        }
        return new Customer(strL, strL2, shippingInformationA, listM, z12, num, str, t30.e.l(json, "description"), t30.e.l(json, Scopes.EMAIL), json.optBoolean("livemode", z11));
    }
}
