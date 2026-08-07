package x60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.j0;
import com.stripe.android.model.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.s0;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010-J#\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050.2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00104R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00105¨\u00066"}, d2 = {"Lx60/p;", "Lu30/a;", "Lcom/stripe/android/model/h0;", "Lcom/stripe/android/model/j0;", "params", "", "isLiveMode", "Lkotlin/Function0;", "", "timeProvider", "<init>", "(Lcom/stripe/android/model/j0;ZLwn0/a;)V", "", "elementsSessionId", "Lorg/json/JSONObject;", "paymentMethodPreference", "Lorg/json/JSONArray;", "orderedPaymentMethodTypes", "unactivatedPaymentMethodTypes", "linkFundingSources", "countryCode", "Lcom/stripe/android/model/StripeIntent;", "k", "(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent;", "json", "Lcom/stripe/android/model/h0$e;", IntegerTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;Lorg/json/JSONArray;)Lcom/stripe/android/model/h0$e;", "Lcom/stripe/android/model/h0$d;", "e", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h0$d;", "Lcom/stripe/android/model/h0$d$c;", "f", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h0$d$c;", "Lcom/stripe/android/model/h0$d$a;", DateTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h0$d$a;", "Lcom/stripe/android/model/h0$d$a$c;", "j", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h0$d$a$c;", "Lcom/stripe/android/model/h0$d$a$b;", "g", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h0$d$a$b;", "Lcom/stripe/android/model/h0$a;", "c", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h0$a;", "", "h", "(Lorg/json/JSONObject;)Ljava/util/Map;", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h0;", "Lcom/stripe/android/model/j0;", "Z", "Lwn0/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p implements u30.a<ElementsSession> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f122862f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v f122863g = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j0 params;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Long> timeProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Long> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f122867c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries<n0> f122868a = on0.a.a(n0.values());
    }

    public p(j0 params, boolean z11, wn0.a<Long> timeProvider) {
        p013kotlin.jvm.internal.s.k(params, "params");
        p013kotlin.jvm.internal.s.k(timeProvider, "timeProvider");
        this.params = params;
        this.isLiveMode = z11;
        this.timeProvider = timeProvider;
    }

    private final ElementsSession.CardBrandChoice c(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("card_brand_choice");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("preferred_networks");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String strOptString = jSONArrayOptJSONArray.optString(i11);
                if (strOptString != null) {
                    p013kotlin.jvm.internal.s.h(strOptString);
                    arrayList.add(strOptString);
                }
            }
        }
        return new ElementsSession.CardBrandChoice(jSONObjectOptJSONObject.optBoolean("eligible", false), p013kotlin.collections.v.m1(arrayList));
    }

    private final ElementsSession.Customer.Components d(JSONObject json) {
        ElementsSession.Customer.Components.c cVarJ;
        ElementsSession.Customer.Components.b bVarG;
        if (json == null || (cVarJ = j(json.optJSONObject("mobile_payment_element"))) == null || (bVarG = g(json.optJSONObject("customer_sheet"))) == null) {
            return null;
        }
        return new ElementsSession.Customer.Components(cVarJ, bVarG);
    }

    private final ElementsSession.Customer e(JSONObject json) {
        List listM;
        if (json == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("payment_methods");
        if (jSONArrayOptJSONArray != null) {
            bo0.j jVarW = bo0.n.w(0, jSONArrayOptJSONArray.length());
            listM = new ArrayList();
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                int iNextInt = ((s0) it).nextInt();
                v vVar = f122863g;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(iNextInt);
                p013kotlin.jvm.internal.s.j(jSONObjectOptJSONObject, "optJSONObject(...)");
                PaymentMethod paymentMethodA = vVar.a(jSONObjectOptJSONObject);
                if (paymentMethodA != null) {
                    listM.add(paymentMethodA);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        ElementsSession.Customer.Session sessionF = f(json.optJSONObject("customer_session"));
        if (sessionF == null) {
            return null;
        }
        String strOptString = json.optString("default_payment_method");
        p013kotlin.jvm.internal.s.h(strOptString);
        return new ElementsSession.Customer(listM, p013kotlin.text.t.y0(strOptString) ? null : strOptString, sessionF);
    }

    private final ElementsSession.Customer.Session f(JSONObject json) {
        String strOptString;
        ElementsSession.Customer.Components componentsD;
        if (json == null || (strOptString = json.optString("id")) == null) {
            return null;
        }
        boolean zOptBoolean = json.optBoolean("livemode");
        String strOptString2 = json.optString("api_key");
        if (strOptString2 == null) {
            return null;
        }
        int iOptInt = json.optInt("api_key_expiry");
        String strOptString3 = json.optString("customer");
        if (strOptString3 == null || (componentsD = d(json.optJSONObject("components"))) == null) {
            return null;
        }
        return new ElementsSession.Customer.Session(strOptString, zOptBoolean, strOptString2, iOptInt, strOptString3, componentsD);
    }

    private final ElementsSession.Customer.Components.b g(JSONObject json) {
        if (json == null) {
            return null;
        }
        if (!json.optBoolean("enabled")) {
            return ElementsSession.Customer.Components.b.C0892a.f51197a;
        }
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(AnalyticsContext.Features);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new ElementsSession.Customer.Components.b.Enabled(p013kotlin.jvm.internal.s.f(jSONObjectOptJSONObject.optString("payment_method_remove"), "enabled"));
    }

    private final Map<String, Boolean> h(JSONObject json) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = json.keys();
        p013kotlin.jvm.internal.s.j(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = json.get(next);
            if (obj instanceof Boolean) {
                p013kotlin.jvm.internal.s.h(next);
                linkedHashMap.put(next, obj);
            }
        }
        return v0.A(linkedHashMap);
    }

    private final ElementsSession.LinkSettings i(JSONObject json, JSONArray linkFundingSources) {
        Map<String, Boolean> mapI;
        String strOptString;
        boolean zOptBoolean = json != null ? json.optBoolean("link_mobile_disable_signup") : false;
        boolean zOptBoolean2 = json != null ? json.optBoolean("link_passthrough_mode_enabled") : false;
        n0 n0Var = null;
        if (json != null && (strOptString = json.optString("link_mode")) != null) {
            for (n0 n0Var2 : c.f122868a) {
                if (p013kotlin.jvm.internal.s.f(n0Var2.getValue(), strOptString)) {
                    n0Var = n0Var2;
                    break;
                }
            }
            n0Var = n0Var;
        }
        n0 n0Var3 = n0Var;
        if (json == null || (mapI = h(json)) == null) {
            mapI = v0.i();
        }
        return new ElementsSession.LinkSettings(u30.a.INSTANCE.a(linkFundingSources), zOptBoolean2, n0Var3, mapI, zOptBoolean);
    }

    private final ElementsSession.Customer.Components.c j(JSONObject json) {
        PaymentMethod.b bVar = null;
        if (json == null) {
            return null;
        }
        if (!json.optBoolean("enabled")) {
            return ElementsSession.Customer.Components.c.C0896a.f51199a;
        }
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(AnalyticsContext.Features);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        String strOptString = jSONObjectOptJSONObject.optString("payment_method_save");
        String strOptString2 = jSONObjectOptJSONObject.optString("payment_method_remove");
        String strOptString3 = jSONObjectOptJSONObject.optString("payment_method_save_allow_redisplay_override");
        for (PaymentMethod.b bVar2 : PaymentMethod.b.getEntries()) {
            if (p013kotlin.jvm.internal.s.f(bVar2.getValue(), strOptString3)) {
                bVar = bVar2;
                break;
            }
        }
        return new ElementsSession.Customer.Components.c.Enabled(p013kotlin.jvm.internal.s.f(strOptString, "enabled"), p013kotlin.jvm.internal.s.f(strOptString2, "enabled"), bVar);
    }

    private final StripeIntent k(String elementsSessionId, JSONObject paymentMethodPreference, JSONArray orderedPaymentMethodTypes, JSONArray unactivatedPaymentMethodTypes, JSONArray linkFundingSources, String countryCode) throws JSONException {
        JSONObject jSONObjectOptJSONObject = paymentMethodPreference != null ? paymentMethodPreference.optJSONObject(this.params.getType()) : null;
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        if (orderedPaymentMethodTypes != null) {
            jSONObjectOptJSONObject.put("payment_method_types", orderedPaymentMethodTypes);
        }
        jSONObjectOptJSONObject.put("unactivated_payment_method_types", unactivatedPaymentMethodTypes);
        jSONObjectOptJSONObject.put("link_funding_sources", linkFundingSources);
        jSONObjectOptJSONObject.put("country_code", countryCode);
        j0 j0Var = this.params;
        if (j0Var instanceof j0.PaymentIntentType) {
            return new u().a(jSONObjectOptJSONObject);
        }
        if (j0Var instanceof j0.SetupIntentType) {
            return new x().a(jSONObjectOptJSONObject);
        }
        if (!(j0Var instanceof j0.DeferredIntentType)) {
            throw new NoWhenBranchMatchedException();
        }
        DeferredIntentParams.b mode = ((j0.DeferredIntentType) j0Var).getDeferredIntentParams().getMode();
        if (mode instanceof DeferredIntentParams.b.Payment) {
            return new n(elementsSessionId, (DeferredIntentParams.b.Payment) ((j0.DeferredIntentType) this.params).getDeferredIntentParams().getMode(), this.isLiveMode, this.timeProvider).a(jSONObjectOptJSONObject);
        }
        if (mode instanceof DeferredIntentParams.b.Setup) {
            return new o(elementsSessionId, (DeferredIntentParams.b.Setup) ((j0.DeferredIntentType) this.params).getDeferredIntentParams().getMode(), this.isLiveMode, this.timeProvider).a(jSONObjectOptJSONObject);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ElementsSession a(JSONObject json) throws JSONException {
        p013kotlin.jvm.internal.s.k(json, "json");
        t30.e eVar = t30.e.f112281a;
        JSONObject jSONObjectD = eVar.d(eVar.k(json, "payment_method_preference"));
        String strL = t30.e.l(jSONObjectD, "object");
        if (jSONObjectD != null && p013kotlin.jvm.internal.s.f("payment_method_preference", strL)) {
            String strOptString = jSONObjectD.optString("country_code");
            JSONArray jSONArrayOptJSONArray = json.optJSONArray("unactivated_payment_method_types");
            JSONArray jSONArrayOptJSONArray2 = json.optJSONArray("payment_method_specs");
            String string = jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null;
            JSONArray jSONArrayOptJSONArray3 = json.optJSONArray("external_payment_method_data");
            String string2 = jSONArrayOptJSONArray3 != null ? jSONArrayOptJSONArray3.toString() : null;
            JSONArray jSONArrayOptJSONArray4 = jSONObjectD.optJSONArray("ordered_payment_method_types");
            String strOptString2 = json.optString("session_id");
            ElementsSession.Customer customerE = e(json.optJSONObject("customer"));
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("link_settings");
            JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("link_funding_sources") : null;
            p013kotlin.jvm.internal.s.h(strOptString);
            StripeIntent stripeIntentK = k(strOptString2, jSONObjectD, jSONArrayOptJSONArray4, jSONArrayOptJSONArray, jSONArrayOptJSONArray5, strOptString);
            String strOptString3 = json.optString("merchant_country");
            ElementsSession.CardBrandChoice cardBrandChoiceC = c(json);
            String strOptString4 = json.optString("google_pay_preference");
            if (stripeIntentK != null) {
                return new ElementsSession(i(jSONObjectOptJSONObject, jSONArrayOptJSONArray5), string, string2, stripeIntentK, customerE, strOptString3, cardBrandChoiceC, !p013kotlin.jvm.internal.s.f(strOptString4, "disabled"), null, 256, null);
            }
        }
        return null;
    }

    public /* synthetic */ p(j0 j0Var, boolean z11, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j0Var, z11, (i11 & 4) != 0 ? a.f122867c : aVar);
    }
}
