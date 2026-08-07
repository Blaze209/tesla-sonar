package le;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lle/d;", "", "<init>", "()V", "Lcom/adyen/checkout/components/core/Amount;", "amount", "Ljava/util/Locale;", "locale", "", "b", "(Lcom/adyen/checkout/components/core/Amount;Ljava/util/Locale;)Ljava/lang/String;", "currencyCode", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f89947a = new d();

    private d() {
    }

    public final void a(String currencyCode) {
        if (be.e.INSTANCE.b(currencyCode)) {
            return;
        }
        throw new CheckoutException("Currency " + currencyCode + " not supported", null, 2, null);
    }

    public final String b(Amount amount, Locale locale) {
        s.k(amount, "amount");
        s.k(locale, "locale");
        String currency = amount.getCurrency();
        be.e eVarA = be.e.INSTANCE.a(currency == null ? "" : currency);
        Currency currency2 = Currency.getInstance(currency);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency2);
        currencyInstance.setMinimumFractionDigits(eVarA.getFractionDigits());
        currencyInstance.setMaximumFractionDigits(eVarA.getFractionDigits());
        String str = currencyInstance.format(BigDecimal.valueOf(amount.getValue(), eVarA.getFractionDigits()));
        s.j(str, "format(...)");
        return str;
    }
}
