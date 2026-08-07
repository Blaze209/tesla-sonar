package x60;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/x;", "Lu30/a;", "Lcom/stripe/android/model/d1;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/d1;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x implements u30.a<SetupIntent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f122904b = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lx60/x$a;", "", "<init>", "()V", "", "FIELD_CANCELLATION_REASON", "Ljava/lang/String;", "FIELD_CLIENT_SECRET", "FIELD_COUNTRY_CODE", "FIELD_CREATED", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_SETUP_ERROR", "FIELD_LINK_FUNDING_SOURCES", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_OPTIONS", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_STATUS", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "FIELD_USAGE", "VALUE_SETUP_INTENT", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/x$b;", "Lu30/a;", "Lcom/stripe/android/model/d1$e;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/d1$e;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements u30.a<SetupIntent.Error> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122905b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lx60/x$b$a;", "", "<init>", "()V", "", "FIELD_CODE", "Ljava/lang/String;", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SetupIntent.Error a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            String strL = t30.e.l(json, "code");
            String strL2 = t30.e.l(json, "decline_code");
            String strL3 = t30.e.l(json, "doc_url");
            String strL4 = t30.e.l(json, "message");
            String strL5 = t30.e.l(json, "param");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
            return new SetupIntent.Error(strL, strL2, strL3, strL4, strL5, jSONObjectOptJSONObject != null ? new v().a(jSONObjectOptJSONObject) : null, SetupIntent.Error.c.INSTANCE.a(t30.e.l(json, "type")));
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SetupIntent a(JSONObject json) {
        String str;
        p013kotlin.jvm.internal.s.k(json, "json");
        if (!p013kotlin.jvm.internal.s.f("setup_intent", t30.e.l(json, "object"))) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
        PaymentMethod paymentMethodA = jSONObjectOptJSONObject != null ? new v().a(jSONObjectOptJSONObject) : null;
        String strL = t30.e.l(json, "payment_method");
        if (paymentMethodA != null) {
            strL = null;
        }
        if (strL != null) {
            str = strL;
        } else if (paymentMethodA != null) {
            strL = paymentMethodA.id;
            str = strL;
        } else {
            str = null;
        }
        List<String> listA = u30.a.INSTANCE.a(json.optJSONArray("unactivated_payment_method_types"));
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        List<String> listA2 = u30.a.INSTANCE.a(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listA2, 10));
        Iterator<T> it2 = listA2.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
            arrayList2.add(lowerCase2);
        }
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("payment_method_options");
        String string = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        String strL2 = t30.e.l(json, "id");
        long jOptLong = json.optLong("created");
        String strL3 = t30.e.l(json, "client_secret");
        SetupIntent.a aVarA = SetupIntent.a.INSTANCE.a(t30.e.l(json, "cancellation_reason"));
        String strL4 = t30.e.l(json, "country_code");
        String strL5 = t30.e.l(json, "description");
        boolean zOptBoolean = json.optBoolean("livemode");
        List<String> listA3 = u30.a.INSTANCE.a(json.optJSONArray("payment_method_types"));
        StripeIntent.Status statusA = StripeIntent.Status.INSTANCE.a(t30.e.l(json, PermissionsResponse.STATUS_KEY));
        StripeIntent.Usage usageA = StripeIntent.Usage.INSTANCE.a(t30.e.l(json, "usage"));
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("last_setup_error");
        SetupIntent.Error errorA = jSONObjectOptJSONObject3 != null ? new b().a(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("next_action");
        return new SetupIntent(strL2, aVarA, jOptLong, strL4, strL3, strL5, zOptBoolean, paymentMethodA, str, listA3, statusA, usageA, errorA, arrayList, arrayList2, jSONObjectOptJSONObject4 != null ? new t().a(jSONObjectOptJSONObject4) : null, string);
    }
}
