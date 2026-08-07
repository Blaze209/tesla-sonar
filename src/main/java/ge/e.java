package ge;

import android.app.Application;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import ezvcard.property.Kind;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000  2\u00020\u0001:\u0001\u0015B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lge/e;", "Lge/b;", "Landroid/app/Application;", Kind.APPLICATION, "Ljava/util/Locale;", "shopperLocale", "", "isCreatedByDropIn", "Lcom/adyen/checkout/components/core/Amount;", "amount", "Lde/e;", "source", "", "sessionId", "<init>", "(Landroid/app/Application;Ljava/util/Locale;ZLcom/adyen/checkout/components/core/Amount;Lde/e;Ljava/lang/String;)V", "c", "(Z)Ljava/lang/String;", "b", "(Lde/e;)Ljava/lang/String;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "a", "()Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "Landroid/app/Application;", "Ljava/util/Locale;", "Z", DateTokenConverter.CONVERTER_KEY, "Lcom/adyen/checkout/components/core/Amount;", "e", "Lde/e;", "f", "Ljava/lang/String;", "g", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Locale shopperLocale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isCreatedByDropIn;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Amount amount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final de.e source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String sessionId;

    public e(Application application, Locale shopperLocale, boolean z11, Amount amount, de.e source, String str) {
        s.k(application, "application");
        s.k(shopperLocale, "shopperLocale");
        s.k(source, "source");
        this.application = application;
        this.shopperLocale = shopperLocale;
        this.isCreatedByDropIn = z11;
        this.amount = amount;
        this.source = source;
        this.sessionId = str;
    }

    private final String b(de.e source) {
        if (source instanceof de.e.a) {
            return "dropin";
        }
        if (source instanceof de.e.PaymentComponent) {
            return ((de.e.PaymentComponent) source).getPaymentMethodType();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String c(boolean isCreatedByDropIn) {
        return isCreatedByDropIn ? "dropin" : "components";
    }

    @Override // ge.b
    public AnalyticsSetupRequest a() {
        de.d dVar = de.d.f60485a;
        String strB = dVar.b();
        String strA = dVar.a();
        String languageTag = this.shopperLocale.toLanguageTag();
        String strB2 = b(this.source);
        String strC = c(this.isCreatedByDropIn);
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        String packageName = this.application.getPackageName();
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        int i11 = this.application.getResources().getDisplayMetrics().widthPixels;
        return new AnalyticsSetupRequest(strB, "android", strA, languageTag, strB2, strC, str, str2, packageName, strValueOf, null, Integer.valueOf(i11), this.source.a(), this.amount, this.sessionId);
    }
}
