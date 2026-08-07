package u30;

import ch.qos.logback.core.joran.action.Action;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import java.util.Iterator;
import java.util.Map;
import jn0.t;
import jn0.x;
import o30.StripeError;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import t30.e;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lu30/b;", "Lu30/a;", "Lo30/f;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lo30/f;", "a", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements a<StripeError> {

    /* JADX INFO: renamed from: u30.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", Action.KEY_ATTRIBUTE, "Lkotlin/Pair;", "a", "(Ljava/lang/String;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    static final class C2472b extends u implements l<String, Pair<? extends String, ? extends String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f115361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2472b(JSONObject jSONObject) {
            super(1);
            this.f115361c = jSONObject;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, String> invoke(String str) {
            return x.a(str, this.f115361c.get(str).toString());
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public StripeError a(JSONObject json) {
        Object objB;
        Map mapW;
        s.k(json, "json");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            JSONObject jSONObject = json.getJSONObject(AnalyticsAttribute.Error);
            String strL = e.l(jSONObject, "charge");
            String strL2 = e.l(jSONObject, "code");
            String strL3 = e.l(jSONObject, "decline_code");
            String strL4 = e.l(jSONObject, "message");
            String strL5 = e.l(jSONObject, "param");
            String strL6 = e.l(jSONObject, "type");
            String strL7 = e.l(jSONObject, "doc_url");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra_fields");
            if (jSONObjectOptJSONObject != null) {
                s.h(jSONObjectOptJSONObject);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                s.j(itKeys, "keys(...)");
                mapW = v0.w(ho0.l.U(ho0.l.h(itKeys), new C2472b(jSONObjectOptJSONObject)));
            } else {
                mapW = null;
            }
            objB = jn0.s.b(new StripeError(strL6, strL4, strL2, strL5, strL3, strL, strL7, mapW));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        StripeError stripeError = new StripeError(null, "An improperly formatted error response was found.", null, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        if (jn0.s.g(objB)) {
            objB = stripeError;
        }
        return (StripeError) objB;
    }
}
