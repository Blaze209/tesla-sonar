package x60;

import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx60/c;", "Lu30/a;", "Lcom/stripe/android/model/c;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/c;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements u30.a<AttachConsumerToLinkAccountSession> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f122824b = new c();

    private c() {
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AttachConsumerToLinkAccountSession a(JSONObject json) throws JSONException {
        p013kotlin.jvm.internal.s.k(json, "json");
        String string = json.getString("id");
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        String string2 = json.getString("client_secret");
        p013kotlin.jvm.internal.s.j(string2, "getString(...)");
        return new AttachConsumerToLinkAccountSession(string, string2);
    }
}
