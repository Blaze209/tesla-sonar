package x60;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\t\u0007\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lx60/u;", "Lu30/a;", "Lcom/stripe/android/model/u0;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/u0;", "a", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u implements u30.a<PaymentIntent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f122883b = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006¨\u0006\u001f"}, d2 = {"Lx60/u$a;", "", "<init>", "()V", "", "FIELD_AMOUNT", "Ljava/lang/String;", "FIELD_CANCELED_AT", "FIELD_CANCELLATION_REASON", "FIELD_CAPTURE_METHOD", "FIELD_CLIENT_SECRET", "FIELD_CONFIRMATION_METHOD", "FIELD_COUNTRY_CODE", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_PAYMENT_ERROR", "FIELD_LINK_FUNDING_SOURCES", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_OPTIONS", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_RECEIPT_EMAIL", "FIELD_SETUP_FUTURE_USAGE", "FIELD_SHIPPING", "FIELD_STATUS", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "OBJECT_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/u$b;", "Lu30/a;", "Lcom/stripe/android/model/u0$g;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/u0$g;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements u30.a<PaymentIntent.Error> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122884b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lx60/u$b$a;", "", "<init>", "()V", "", "FIELD_CHARGE", "Ljava/lang/String;", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentIntent.Error a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            String strL = t30.e.l(json, "charge");
            String strL2 = t30.e.l(json, "code");
            String strL3 = t30.e.l(json, "decline_code");
            String strL4 = t30.e.l(json, "doc_url");
            String strL5 = t30.e.l(json, "message");
            String strL6 = t30.e.l(json, "param");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
            return new PaymentIntent.Error(strL, strL2, strL3, strL4, strL5, strL6, jSONObjectOptJSONObject != null ? new v().a(jSONObjectOptJSONObject) : null, PaymentIntent.Error.c.INSTANCE.a(t30.e.l(json, "type")));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/u$c;", "Lu30/a;", "Lcom/stripe/android/model/u0$h;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/u0$h;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements u30.a<PaymentIntent.Shipping> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122885b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lx60/u$c$a;", "", "<init>", "()V", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentIntent.Shipping a(JSONObject json) {
            Address addressA;
            p013kotlin.jvm.internal.s.k(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(PlaceTypes.ADDRESS);
            return new PaymentIntent.Shipping((jSONObjectOptJSONObject == null || (addressA = new x60.b().a(jSONObjectOptJSONObject)) == null) ? new Address(null, null, null, null, null, null, 63, null) : addressA, t30.e.l(json, "carrier"), t30.e.l(json, "name"), t30.e.l(json, "phone"), t30.e.l(json, "tracking_number"));
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentIntent a(JSONObject json) {
        String str;
        p013kotlin.jvm.internal.s.k(json, "json");
        if (!p013kotlin.jvm.internal.s.f("payment_intent", t30.e.l(json, "object"))) {
            return null;
        }
        String strL = t30.e.l(json, "id");
        u30.a.Companion companion = u30.a.INSTANCE;
        List<String> listA = companion.a(json.optJSONArray("payment_method_types"));
        t30.e eVar = t30.e.f112281a;
        Long lJ = eVar.j(json, "amount");
        long jOptLong = json.optLong("canceled_at");
        PaymentIntent.a aVarA = PaymentIntent.a.INSTANCE.a(t30.e.l(json, "cancellation_reason"));
        PaymentIntent.b bVarA = PaymentIntent.b.INSTANCE.a(t30.e.l(json, "capture_method"));
        String strL2 = t30.e.l(json, "client_secret");
        PaymentIntent.e eVarA = PaymentIntent.e.INSTANCE.a(t30.e.l(json, "confirmation_method"));
        long jOptLong2 = json.optLong("created");
        String strH = t30.e.h(json, "currency");
        String strL3 = t30.e.l(json, "description");
        boolean zF = eVar.f(json, "livemode");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
        PaymentMethod paymentMethodA = jSONObjectOptJSONObject != null ? new v().a(jSONObjectOptJSONObject) : null;
        String strL4 = t30.e.l(json, "payment_method");
        if (paymentMethodA != null) {
            strL4 = null;
        }
        if (strL4 != null) {
            str = strL4;
        } else if (paymentMethodA != null) {
            strL4 = paymentMethodA.id;
            str = strL4;
        } else {
            str = null;
        }
        String strL5 = t30.e.l(json, "receipt_email");
        StripeIntent.Status statusA = StripeIntent.Status.INSTANCE.a(t30.e.l(json, PermissionsResponse.STATUS_KEY));
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("payment_method_options");
        String string = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        StripeIntent.Usage usageA = StripeIntent.Usage.INSTANCE.a(t30.e.l(json, "setup_future_usage"));
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("last_payment_error");
        PaymentIntent.Error errorA = jSONObjectOptJSONObject3 != null ? new b().a(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("shipping");
        PaymentIntent.Shipping shippingA = jSONObjectOptJSONObject4 != null ? new c().a(jSONObjectOptJSONObject4) : null;
        JSONObject jSONObjectOptJSONObject5 = json.optJSONObject("next_action");
        StripeIntent.a aVarA2 = jSONObjectOptJSONObject5 != null ? new t().a(jSONObjectOptJSONObject5) : null;
        List<String> listA2 = companion.a(json.optJSONArray("unactivated_payment_method_types"));
        PaymentMethod paymentMethod = paymentMethodA;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listA2, 10));
        Iterator it = listA2.iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
            it = it2;
        }
        List<String> listA3 = u30.a.INSTANCE.a(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listA3, 10));
        Iterator it3 = listA3.iterator();
        while (it3.hasNext()) {
            Iterator it4 = it3;
            String lowerCase2 = ((String) it3.next()).toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
            arrayList2.add(lowerCase2);
            it3 = it4;
        }
        return new PaymentIntent(strL, listA, lJ, jOptLong, aVarA, bVarA, strL2, eVarA, t30.e.l(json, "country_code"), jOptLong2, strH, strL3, zF, paymentMethod, str, strL5, statusA, usageA, errorA, shippingA, arrayList, arrayList2, aVarA2, string);
    }
}
