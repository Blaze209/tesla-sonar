package x60;

import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionSignup;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx60/k;", "Lu30/a;", "Lcom/stripe/android/model/v;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k implements u30.a<ConsumerSessionSignup> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f122847b = new k();

    private k() {
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConsumerSessionSignup a(JSONObject json) throws JSONException {
        p013kotlin.jvm.internal.s.k(json, "json");
        ConsumerSession consumerSessionA = new i().a(json);
        String strL = t30.e.l(json, "publishable_key");
        if (consumerSessionA != null) {
            return new ConsumerSessionSignup(consumerSessionA, strL);
        }
        return null;
    }
}
