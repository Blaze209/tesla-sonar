package m90;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u0004\u0012\u00020\u00110\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0018"}, d2 = {"Lm90/a;", "", "<init>", "()V", "", "amount", "", "amountCurrencyCode", "Ljava/util/Locale;", "targetLocale", "a", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "Ljava/util/Currency;", "amountCurrency", "b", "(JLjava/util/Currency;Ljava/util/Locale;)Ljava/lang/String;", "currency", "", "c", "(Ljava/util/Currency;)I", "", "", "Ljava/util/Map;", "SERVER_DECIMAL_DIGITS", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f91626a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Set<String>, Integer> SERVER_DECIMAL_DIGITS = v0.f(x.a(d1.i("UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD"), 2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91628c = 8;

    private a() {
    }

    public final String a(long amount, String amountCurrencyCode, Locale targetLocale) {
        s.k(amountCurrencyCode, "amountCurrencyCode");
        s.k(targetLocale, "targetLocale");
        String upperCase = amountCurrencyCode.toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        Currency currency = Currency.getInstance(upperCase);
        s.j(currency, "getInstance(...)");
        return b(amount, currency, targetLocale);
    }

    public final String b(long amount, Currency amountCurrency, Locale targetLocale) {
        s.k(amountCurrency, "amountCurrency");
        s.k(targetLocale, "targetLocale");
        int iC = c(amountCurrency);
        double dPow = amount / Math.pow(10.0d, iC);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(targetLocale);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            s.i(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrency(amountCurrency);
            decimalFormatSymbols.setCurrencySymbol(amountCurrency.getSymbol(targetLocale));
            ((DecimalFormat) currencyInstance).setMinimumFractionDigits(iC);
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            jn0.s.b(h0.f84049a);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            jn0.s.b(t.a(th2));
        }
        String str = currencyInstance.format(dPow);
        s.j(str, "format(...)");
        return str;
    }

    public final int c(Currency currency) {
        s.k(currency, "currency");
        Map<Set<String>, Integer> map = SERVER_DECIMAL_DIGITS;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Set<String>, Integer> entry : map.entrySet()) {
            Set<String> key = entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            s.j(currencyCode, "getCurrencyCode(...)");
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            if (key.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) v.q0(arrayList);
        return num != null ? num.intValue() : currency.getDefaultFractionDigits();
    }
}
