package com.stripe.android.link;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import java.io.Serializable;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import x60.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/link/a;", "a", "(ILandroid/content/Intent;)Lcom/stripe/android/link/a;", "", "Lcom/stripe/android/model/v0;", "b", "(Ljava/lang/String;)Lcom/stripe/android/model/v0;", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final a a(int i11, Intent intent) {
        Uri data;
        if (i11 == 0) {
            return new a.Canceled(null, 1, null);
        }
        if (i11 != 49871) {
            if (i11 != 91367) {
                return new a.Canceled(null, 1, null);
            }
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("LinkFailure") : null;
            return serializableExtra != null ? new a.Failed((Exception) serializableExtra) : new a.Canceled(null, 1, null);
        }
        if (intent == null || (data = intent.getData()) == null) {
            return new a.Canceled(null, 1, null);
        }
        String queryParameter = data.getQueryParameter("link_status");
        if (queryParameter != null) {
            int iHashCode = queryParameter.hashCode();
            if (iHashCode != -1097329270) {
                if (iHashCode == -599445191 && queryParameter.equals("complete")) {
                    String queryParameter2 = data.getQueryParameter("pm");
                    PaymentMethod paymentMethodB = queryParameter2 != null ? b(queryParameter2) : null;
                    return paymentMethodB == null ? new a.Canceled(null, 1, null) : new a.Completed(paymentMethodB);
                }
            } else if (queryParameter.equals("logout")) {
                return new a.Canceled(a.Canceled.b.LoggedOut);
            }
        }
        return new a.Canceled(null, 1, null);
    }

    private static final PaymentMethod b(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            s.j(bArrDecode, "decode(...)");
            return new v().a(new JSONObject(new String(bArrDecode, p013kotlin.text.d.UTF_8)));
        } catch (Exception unused) {
            return null;
        }
    }
}
