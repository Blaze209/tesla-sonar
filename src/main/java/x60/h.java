package x60;

import com.stripe.android.model.ConsumerPaymentDetailsShare;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx60/h;", "Lu30/a;", "Lcom/stripe/android/model/s;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/s;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h implements u30.a<ConsumerPaymentDetailsShare> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f122843b = new h();

    private h() {
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConsumerPaymentDetailsShare a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        String strL = t30.e.l(json, "payment_method");
        if (strL == null) {
            return null;
        }
        return new ConsumerPaymentDetailsShare(strL);
    }
}
