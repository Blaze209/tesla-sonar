package v60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import p010i90.IdentifierSpec;
import p010i90.PhoneNumberElement;
import p010i90.SameAsShippingElement;
import p010i90.SectionElement;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import z80.EmailElement;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aE\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/y$d$a;", "Lw80/c;", "e", "(Lcom/stripe/android/paymentsheet/y$d$a;)Lw80/c;", "collectionMode", "", "Li90/g0;", "", "initialValues", "shippingValues", "Li90/d0;", "c", "(Lw80/c;Ljava/util/Map;Ljava/util/Map;)Li90/d0;", "", "collectEmail", "collectPhone", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;ZZ)Li90/d0;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118068a;

        static {
            int[] iArr = new int[com.stripe.android.paymentsheet.y.BillingDetailsCollectionConfiguration.a.values().length];
            try {
                iArr[com.stripe.android.paymentsheet.y.BillingDetailsCollectionConfiguration.a.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.stripe.android.paymentsheet.y.BillingDetailsCollectionConfiguration.a.Never.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.stripe.android.paymentsheet.y.BillingDetailsCollectionConfiguration.a.Full.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f118068a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public static final p010i90.d0 c(w80.c cVar, Map<IdentifierSpec, String> map, Map<IdentifierSpec, String> map2) {
        SameAsShippingElement sameAsShippingElement;
        Boolean boolE1;
        if (map2 != null) {
            IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
            String str = map2.get(companion.w());
            if (str == null || (boolE1 = p013kotlin.text.t.E1(str)) == null) {
                sameAsShippingElement = null;
            } else {
                sameAsShippingElement = new SameAsShippingElement(companion.w(), new p010i90.c1(boolE1.booleanValue()));
            }
        } else {
            sameAsShippingElement = null;
        }
        SameAsShippingElement sameAsShippingElement2 = sameAsShippingElement;
        return SectionElement.INSTANCE.b(p013kotlin.collections.v.r(new z80.a0(IdentifierSpec.INSTANCE.a("credit_billing"), map, t30.d.f112276a.h(), null, sameAsShippingElement2, map2, cVar, 8, null), sameAsShippingElement2), Integer.valueOf(w80.n.f121516j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p010i90.d0 d(Map<IdentifierSpec, String> map, boolean z11, boolean z12) {
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        EmailElement emailElement = new EmailElement(null, map.get(companion.n()), null, 5, null);
        if (!z11) {
            emailElement = null;
        }
        IdentifierSpec identifierSpecT = companion.t();
        p010i90.q0.Companion companion2 = p010i90.q0.INSTANCE;
        String str = map.get(companion.t());
        if (str == null) {
            str = "";
        }
        PhoneNumberElement phoneNumberElement = new PhoneNumberElement(identifierSpecT, p010i90.q0.Companion.b(companion2, str, null, null, false, false, 30, null));
        if (!z12) {
            phoneNumberElement = null;
        }
        List<? extends p010i90.j1> listR = p013kotlin.collections.v.r(emailElement, phoneNumberElement);
        if (listR.isEmpty()) {
            return null;
        }
        return SectionElement.INSTANCE.b(listR, Integer.valueOf(w80.n.f121524n));
    }

    public static final w80.c e(com.stripe.android.paymentsheet.y.BillingDetailsCollectionConfiguration.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        int i11 = a.f118068a[aVar.ordinal()];
        if (i11 == 1) {
            return w80.c.Automatic;
        }
        if (i11 == 2) {
            return w80.c.Never;
        }
        if (i11 == 3) {
            return w80.c.Full;
        }
        throw new NoWhenBranchMatchedException();
    }
}
