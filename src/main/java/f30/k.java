package f30;

import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf30/k;", "", "<init>", "()V", "", "price", "Ljava/util/Currency;", "currency", "", "a", "(JLjava/util/Currency;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f64129a = new k();

    private k() {
    }

    public static final String a(long price, Currency currency) {
        p013kotlin.jvm.internal.s.k(currency, "currency");
        int iC = m90.a.f91626a.c(currency);
        int length = String.valueOf(price).length();
        StringBuilder sb2 = new StringBuilder();
        if (iC == 0) {
            for (int i11 = 0; i11 < length; i11++) {
                sb2.append('#');
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb2.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
            decimalFormat.setCurrency(currency);
            decimalFormat.setGroupingUsed(false);
            String str = decimalFormat.format(price);
            p013kotlin.jvm.internal.s.j(str, "format(...)");
            return str;
        }
        int i12 = length - iC;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append('#');
        }
        if (length <= iC) {
            sb2.append('0');
        }
        sb2.append(CoreConstants.DOT);
        for (int i14 = 0; i14 < iC; i14++) {
            sb2.append('0');
        }
        double dPow = price / Math.pow(10.0d, iC);
        DecimalFormat decimalFormat2 = new DecimalFormat(sb2.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
        decimalFormat2.setCurrency(currency);
        decimalFormat2.setGroupingUsed(false);
        String str2 = decimalFormat2.format(dPow);
        p013kotlin.jvm.internal.s.j(str2, "format(...)");
        return str2;
    }
}
