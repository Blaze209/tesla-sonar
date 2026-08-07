package x60;

import com.stripe.android.model.ConsumerSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lx60/i;", "Lu30/a;", "Lcom/stripe/android/model/t;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lcom/stripe/android/model/t$d;", "c", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/t$d;", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/t;", "a", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements u30.a<ConsumerSession> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f122845b = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lx60/i$a;", "", "<init>", "()V", "", "FIELD_CONSUMER_SESSION", "Ljava/lang/String;", "FIELD_CONSUMER_SESSION_EMAIL", "FIELD_CONSUMER_SESSION_FORMATTED_PHONE", "FIELD_CONSUMER_SESSION_PHONE", "FIELD_CONSUMER_SESSION_SECRET", "FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS", "FIELD_VERIFICATION_SESSION_STATE", "FIELD_VERIFICATION_SESSION_TYPE", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final ConsumerSession.VerificationSession c(JSONObject json) throws JSONException {
        ConsumerSession.VerificationSession.e.Companion companion = ConsumerSession.VerificationSession.e.INSTANCE;
        String string = json.getString("type");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        ConsumerSession.VerificationSession.e eVarA = companion.a(lowerCase);
        ConsumerSession.VerificationSession.EnumC0911d.Companion companion2 = ConsumerSession.VerificationSession.EnumC0911d.INSTANCE;
        String string2 = json.getString("state");
        p013kotlin.jvm.internal.s.j(string2, "getString(...)");
        String lowerCase2 = string2.toLowerCase(locale);
        p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
        return new ConsumerSession.VerificationSession(eVarA, companion2.a(lowerCase2));
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConsumerSession a(JSONObject json) throws JSONException {
        List listM;
        p013kotlin.jvm.internal.s.k(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("consumer_session");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("verification_sessions");
        if (jSONArrayOptJSONArray != null) {
            bo0.j jVarW = bo0.n.w(0, jSONArrayOptJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(p013kotlin.collections.v.y(jVarW, 10));
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(((s0) it).nextInt()));
            }
            listM = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                p013kotlin.jvm.internal.s.h(jSONObject);
                ConsumerSession.VerificationSession verificationSessionC = c(jSONObject);
                if (verificationSessionC != null) {
                    listM.add(verificationSessionC);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        List list = listM;
        String string = jSONObjectOptJSONObject.getString("client_secret");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        String string2 = jSONObjectOptJSONObject.getString("email_address");
        p013kotlin.jvm.internal.s.j(string2, "getString(...)");
        String string3 = jSONObjectOptJSONObject.getString("redacted_formatted_phone_number");
        p013kotlin.jvm.internal.s.j(string3, "getString(...)");
        String string4 = jSONObjectOptJSONObject.getString("redacted_phone_number");
        p013kotlin.jvm.internal.s.j(string4, "getString(...)");
        return new ConsumerSession(string, string2, string3, string4, list);
    }
}
