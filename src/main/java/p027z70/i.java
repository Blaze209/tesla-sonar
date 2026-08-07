package p027z70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.Address;
import com.stripe.android.paymentsheet.y;
import java.util.Map;
import jn0.x;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import w70.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\b\u001a\u00020\u0000*\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/b;", "", "Li90/g0;", "", "b", "(Lcom/stripe/android/model/b;)Ljava/util/Map;", "Lcom/stripe/android/model/b$b;", "formFieldValues", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/b$b;Ljava/util/Map;)Lcom/stripe/android/model/b;", "Lcom/stripe/android/paymentsheet/y$a;", "a", "(Lcom/stripe/android/paymentsheet/y$a;)Lcom/stripe/android/model/b;", "", "showCheckbox", "saveForFutureUse", "Lw70/j$a;", "c", "(ZZ)Lw70/j$a;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {
    public static final Address a(y.Address address) {
        s.k(address, "<this>");
        String line1 = address.getLine1();
        String line2 = address.getLine2();
        return new Address(address.getCity(), address.getCountry(), line1, line2, address.getPostalCode(), address.getState());
    }

    public static final Map<IdentifierSpec, String> b(Address address) {
        s.k(address, "<this>");
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        return v0.m(x.a(companion.p(), address.getLine1()), x.a(companion.q(), address.getLine2()), x.a(companion.k(), address.getCity()), x.a(companion.z(), address.getState()), x.a(companion.l(), address.getCountry()), x.a(companion.u(), address.getPostalCode()));
    }

    public static final j.a c(boolean z11, boolean z12) {
        if (z11) {
            return z12 ? j.a.RequestReuse : j.a.RequestNoReuse;
        }
        return j.a.NoRequest;
    }

    public static final Address d(Address.Companion companion, Map<IdentifierSpec, String> formFieldValues) {
        s.k(companion, "<this>");
        s.k(formFieldValues, "formFieldValues");
        IdentifierSpec.Companion companion2 = IdentifierSpec.INSTANCE;
        String str = formFieldValues.get(companion2.p());
        String str2 = formFieldValues.get(companion2.q());
        return new Address(formFieldValues.get(companion2.k()), formFieldValues.get(companion2.l()), str, str2, formFieldValues.get(companion2.u()), formFieldValues.get(companion2.z()));
    }
}
