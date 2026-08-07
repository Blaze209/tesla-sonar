package p017o70;

import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.paymentsheet.y;
import java.util.Map;
import jn0.x;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo70/a;", "Lcom/stripe/android/paymentsheet/y$c;", "billingDetails", "", "Li90/g0;", "", "b", "(Lo70/a;Lcom/stripe/android/paymentsheet/y$c;)Ljava/util/Map;", "Lcom/stripe/android/model/l$d;", "a", "(Lo70/a;)Lcom/stripe/android/model/l$d;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final ConfirmPaymentIntentParams.Shipping a(AddressDetails addressDetails) {
        s.k(addressDetails, "<this>");
        String name = addressDetails.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        Address.a aVar = new Address.a();
        y.Address address = addressDetails.getAddress();
        Address.a aVarE = aVar.e(address != null ? address.getLine1() : null);
        y.Address address2 = addressDetails.getAddress();
        Address.a aVarF = aVarE.f(address2 != null ? address2.getLine2() : null);
        y.Address address3 = addressDetails.getAddress();
        Address.a aVarB = aVarF.b(address3 != null ? address3.getCity() : null);
        y.Address address4 = addressDetails.getAddress();
        Address.a aVarH = aVarB.h(address4 != null ? address4.getState() : null);
        y.Address address5 = addressDetails.getAddress();
        Address.a aVarC = aVarH.c(address5 != null ? address5.getCountry() : null);
        y.Address address6 = addressDetails.getAddress();
        return new ConfirmPaymentIntentParams.Shipping(aVarC.g(address6 != null ? address6.getPostalCode() : null).a(), str, null, addressDetails.getPhoneNumber(), null, 20, null);
    }

    public static final Map<IdentifierSpec, String> b(AddressDetails addressDetails, y.BillingDetails billingDetails) {
        s.k(addressDetails, "<this>");
        if (billingDetails != null && billingDetails.d()) {
            return v0.i();
        }
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        Pair pairA = x.a(companion.r(), addressDetails.getName());
        IdentifierSpec identifierSpecP = companion.p();
        y.Address address = addressDetails.getAddress();
        Pair pairA2 = x.a(identifierSpecP, address != null ? address.getLine1() : null);
        IdentifierSpec identifierSpecQ = companion.q();
        y.Address address2 = addressDetails.getAddress();
        Pair pairA3 = x.a(identifierSpecQ, address2 != null ? address2.getLine2() : null);
        IdentifierSpec identifierSpecK = companion.k();
        y.Address address3 = addressDetails.getAddress();
        Pair pairA4 = x.a(identifierSpecK, address3 != null ? address3.getCity() : null);
        IdentifierSpec identifierSpecZ = companion.z();
        y.Address address4 = addressDetails.getAddress();
        Pair pairA5 = x.a(identifierSpecZ, address4 != null ? address4.getState() : null);
        IdentifierSpec identifierSpecU = companion.u();
        y.Address address5 = addressDetails.getAddress();
        Pair pairA6 = x.a(identifierSpecU, address5 != null ? address5.getPostalCode() : null);
        IdentifierSpec identifierSpecL = companion.l();
        y.Address address6 = addressDetails.getAddress();
        Map mapM = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, x.a(identifierSpecL, address6 != null ? address6.getCountry() : null), x.a(companion.t(), addressDetails.getPhoneNumber()));
        IdentifierSpec identifierSpecW = companion.w();
        Boolean isCheckboxSelected = addressDetails.getIsCheckboxSelected();
        Map mapF = addressDetails.getIsCheckboxSelected() != null ? v0.f(x.a(identifierSpecW, isCheckboxSelected != null ? isCheckboxSelected.toString() : null)) : null;
        if (mapF == null) {
            mapF = v0.i();
        }
        return v0.r(mapM, mapF);
    }

    public static /* synthetic */ Map c(AddressDetails addressDetails, y.BillingDetails billingDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            billingDetails = null;
        }
        return b(addressDetails, billingDetails);
    }
}
