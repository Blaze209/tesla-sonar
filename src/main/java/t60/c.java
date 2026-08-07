package t60;

import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.x0;
import com.stripe.android.paymentsheet.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.x;
import p010i90.IdentifierSpec;
import p010i90.p0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt60/c;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/y$c;", "defaultBillingDetails", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/x0;", "paymentMethodExtraParams", "", "Li90/g0;", "", "a", "(Lcom/stripe/android/paymentsheet/y$c;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/x0;)Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f112679a = new c();

    private c() {
    }

    public final Map<IdentifierSpec, String> a(y.BillingDetails defaultBillingDetails, PaymentMethodCreateParams paymentMethodCreateParams, x0 paymentMethodExtraParams) {
        Map<IdentifierSpec, String> mapI;
        Map mapI2;
        y.Address address;
        y.Address address2;
        y.Address address3;
        y.Address address4;
        y.Address address5;
        y.Address address6;
        if (paymentMethodCreateParams == null || (mapI = d90.a.c(paymentMethodCreateParams.c3())) == null) {
            mapI = v0.i();
        }
        if (paymentMethodExtraParams != null) {
            Map<IdentifierSpec, String> mapC = d90.a.c(paymentMethodExtraParams.c3());
            mapI2 = new LinkedHashMap(v0.e(mapC.size()));
            Iterator<T> it = mapC.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                mapI2.put(IdentifierSpec.K((IdentifierSpec) entry.getKey(), null, false, p0.b.Extras, 3, null), entry.getValue());
            }
        } else {
            mapI2 = v0.i();
        }
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        String postalCode = null;
        Pair pairA = x.a(companion.r(), defaultBillingDetails != null ? defaultBillingDetails.getName() : null);
        Pair pairA2 = x.a(companion.n(), defaultBillingDetails != null ? defaultBillingDetails.getEmail() : null);
        Pair pairA3 = x.a(companion.t(), defaultBillingDetails != null ? defaultBillingDetails.getPhone() : null);
        Pair pairA4 = x.a(companion.p(), (defaultBillingDetails == null || (address6 = defaultBillingDetails.getAddress()) == null) ? null : address6.getLine1());
        Pair pairA5 = x.a(companion.q(), (defaultBillingDetails == null || (address5 = defaultBillingDetails.getAddress()) == null) ? null : address5.getLine2());
        Pair pairA6 = x.a(companion.k(), (defaultBillingDetails == null || (address4 = defaultBillingDetails.getAddress()) == null) ? null : address4.getCity());
        Pair pairA7 = x.a(companion.z(), (defaultBillingDetails == null || (address3 = defaultBillingDetails.getAddress()) == null) ? null : address3.getState());
        Pair pairA8 = x.a(companion.l(), (defaultBillingDetails == null || (address2 = defaultBillingDetails.getAddress()) == null) ? null : address2.getCountry());
        IdentifierSpec identifierSpecU = companion.u();
        if (defaultBillingDetails != null && (address = defaultBillingDetails.getAddress()) != null) {
            postalCode = address.getPostalCode();
        }
        return v0.r(v0.r(v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, x.a(identifierSpecU, postalCode)), mapI), mapI2);
    }
}
