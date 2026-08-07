package nf;

import android.content.Context;
import com.adyen.checkout.components.core.Amount;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lnf/e;", "", "<init>", "()V", "Lcom/adyen/checkout/components/core/Amount;", "amount", "Ljava/util/Locale;", "locale", "Landroid/content/Context;", "localizedContext", "", "emptyAmountStringResId", "zeroAmountStringResId", "positiveAmountStringResId", "", "a", "(Lcom/adyen/checkout/components/core/Amount;Ljava/util/Locale;Landroid/content/Context;III)Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f94911a = new e();

    private e() {
    }

    public static /* synthetic */ String b(e eVar, Amount amount, Locale locale, Context context, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i11 = gf.h.f68832b;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gf.h.f68831a;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gf.h.f68833c;
        }
        return eVar.a(amount, locale, context, i15, i16, i13);
    }

    public final String a(Amount amount, Locale locale, Context localizedContext, int emptyAmountStringResId, int zeroAmountStringResId, int positiveAmountStringResId) {
        s.k(locale, "locale");
        s.k(localizedContext, "localizedContext");
        if (amount == null) {
            String string = localizedContext.getString(emptyAmountStringResId);
            s.h(string);
            return string;
        }
        if (le.a.b(amount)) {
            String string2 = localizedContext.getString(zeroAmountStringResId);
            s.h(string2);
            return string2;
        }
        String string3 = localizedContext.getString(positiveAmountStringResId, le.d.f89947a.b(amount, locale));
        s.h(string3);
        return string3;
    }
}
