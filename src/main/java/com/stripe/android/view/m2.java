package com.stripe.android.view;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/m2;", "", "<init>", "()V", "", "amount", "Ljava/util/Currency;", "currency", "", "free", "b", "(JLjava/util/Currency;Ljava/lang/String;)Ljava/lang/String;", "", "a", "(DLjava/util/Currency;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2 f55078a = new m2();

    private m2() {
    }

    public static final String b(long amount, Currency currency, String free) {
        p013kotlin.jvm.internal.s.k(currency, "currency");
        p013kotlin.jvm.internal.s.k(free, "free");
        if (amount == 0) {
            return free;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        p013kotlin.jvm.internal.s.i(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return f55078a.a(amount, currency);
    }

    public final /* synthetic */ String a(double amount, Currency currency) {
        p013kotlin.jvm.internal.s.k(currency, "currency");
        double dPow = amount / Math.pow(10.0d, currency.getDefaultFractionDigits());
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        try {
            p013kotlin.jvm.internal.s.i(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            String str = currencyInstance.format(dPow);
            p013kotlin.jvm.internal.s.h(str);
            return str;
        } catch (ClassCastException unused) {
            String str2 = currencyInstance.format(dPow);
            p013kotlin.jvm.internal.s.h(str2);
            return str2;
        }
    }
}
