package sf;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.VoucherAction;
import java.util.List;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u001a+\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\n\u001a!\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lsf/c;", "Lcom/adyen/checkout/components/core/action/VoucherAction;", "action", "Ljava/util/Locale;", "shopperLocale", "", "Lsf/a;", "f", "(Lsf/c;Lcom/adyen/checkout/components/core/action/VoucherAction;Ljava/util/Locale;)Ljava/util/List;", "a", "(Lcom/adyen/checkout/components/core/action/VoucherAction;)Lsf/a;", "e", "c", "b", "(Lcom/adyen/checkout/components/core/action/VoucherAction;Ljava/util/Locale;)Lsf/a;", DateTokenConverter.CONVERTER_KEY, "voucher_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111132a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.BOLETO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.ECONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.MULTIBANCO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f111132a = iArr;
        }
    }

    private static final VoucherInformationField a(VoucherAction voucherAction) {
        String entity = voucherAction.getEntity();
        if (entity == null) {
            return null;
        }
        return new VoucherInformationField(of.c.f97261d, entity);
    }

    private static final VoucherInformationField b(VoucherAction voucherAction, Locale locale) {
        String strD;
        String expiresAt = voucherAction.getExpiresAt();
        if (expiresAt == null || (strD = le.e.d(le.e.f89948a, expiresAt, locale, null, 4, null)) == null) {
            return null;
        }
        return new VoucherInformationField(of.c.f97260c, strD);
    }

    private static final VoucherInformationField c(VoucherAction voucherAction) {
        String maskedTelephoneNumber = voucherAction.getMaskedTelephoneNumber();
        if (maskedTelephoneNumber == null) {
            return null;
        }
        return new VoucherInformationField(of.c.f97268k, maskedTelephoneNumber);
    }

    private static final VoucherInformationField d(VoucherAction voucherAction) {
        String merchantReference = voucherAction.getMerchantReference();
        if (merchantReference == null) {
            return null;
        }
        return new VoucherInformationField(of.c.f97270m, merchantReference);
    }

    private static final VoucherInformationField e(VoucherAction voucherAction) {
        String collectionInstitutionNumber = voucherAction.getCollectionInstitutionNumber();
        if (collectionInstitutionNumber == null) {
            return null;
        }
        return new VoucherInformationField(of.c.f97258a, collectionInstitutionNumber);
    }

    public static final List<VoucherInformationField> f(c cVar, VoucherAction action, Locale shopperLocale) {
        s.k(cVar, "<this>");
        s.k(action, "action");
        s.k(shopperLocale, "shopperLocale");
        int i11 = a.f111132a[cVar.ordinal()];
        if (i11 == 1) {
            return v.q(b(action, shopperLocale));
        }
        if (i11 == 2) {
            return v.r(e(action), b(action, shopperLocale), c(action));
        }
        if (i11 != 3) {
            return null;
        }
        return v.r(a(action), b(action, shopperLocale), d(action));
    }
}
