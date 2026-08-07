package com.stripe.android.paymentsheet.analytics;

import androidx.annotation.Keep;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.h;
import com.stripe.android.model.n0;
import com.stripe.android.paymentsheet.y;
import java.util.List;
import n70.f;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import w70.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001:\u0002)FJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJS\u0010\u0018\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010 J\u001b\u0010%\u001a\u00020\u00062\n\u0010$\u001a\u00060\u0011j\u0002`#H&¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u00062\n\u0010$\u001a\u00060\u0011j\u0002`#H&¢\u0006\u0004\b'\u0010&J\u001b\u0010(\u001a\u00020\u00062\n\u0010$\u001a\u00060\u0011j\u0002`#H&¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u0006H&¢\u0006\u0004\b)\u0010 J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b,\u0010+J#\u0010/\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010.\u001a\u0004\u0018\u00010-H&¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u000201H&¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b5\u0010&J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0011H&¢\u0006\u0004\b7\u0010&J\u000f\u00108\u001a\u00020\u0006H&¢\u0006\u0004\b8\u0010 J\u000f\u00109\u001a\u00020\u0006H&¢\u0006\u0004\b9\u0010 J\u001f\u0010>\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H&¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<H&¢\u0006\u0004\b@\u0010?J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<H&¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0006H&¢\u0006\u0004\bE\u0010 ¨\u0006G"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "", "isDeferred", "Ljn0/h0;", "t", "(Lcom/stripe/android/paymentsheet/y$h;Z)V", "initializedViaCompose", "g", "(Z)V", "Lw70/j;", "paymentSelection", "Lcom/stripe/android/model/n0;", "linkMode", "googlePaySupported", "", "currency", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "", "orderedLpms", "requireCvcRecollection", "s", "(Lw70/j;Lcom/stripe/android/model/n0;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/y$m;Ljava/util/List;Z)V", "", AnalyticsAttribute.Error, "u", "(Ljava/lang/Throwable;)V", DateTokenConverter.CONVERTER_KEY, "onDismiss", "()V", "e", "w", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "q", "(Ljava/lang/String;)V", "j", "n", "a", "h", "(Lw70/j;)V", "k", "Ln70/f;", "deferredIntentConfirmationType", "r", "(Lw70/j;Ln70/f;)V", "Lq70/b;", "l", "(Lw70/j;Lq70/b;)V", "errorMessage", "v", "type", "o", "p", "x", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$a;", "source", "Lcom/stripe/android/model/h;", "selectedBrand", "f", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$a;Lcom/stripe/android/model/h;)V", IntegerTokenConverter.CONVERTER_KEY, "b", "(Lcom/stripe/android/model/h;)V", "c", "(Lcom/stripe/android/model/h;Ljava/lang/Throwable;)V", "m", "Mode", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EventReporter {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "Complete", "Custom", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Mode {
        Complete("complete"),
        Custom("custom");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String code;

        Mode(String str) {
            this.code = str;
        }

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter$a;", "", "<init>", "(Ljava/lang/String;I)V", "Edit", "Add", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        Edit,
        Add;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    void a();

    void b(h selectedBrand);

    void c(h selectedBrand, Throwable error);

    void d(Throwable error);

    void e();

    void f(a source, h selectedBrand);

    void g(boolean initializedViaCompose);

    void h(j paymentSelection);

    void i(a source, h selectedBrand);

    void j(String code);

    void k(j paymentSelection);

    void l(j paymentSelection, q70.b error);

    void m();

    void n(String code);

    void o(String type);

    void onDismiss();

    void p();

    void q(String code);

    void r(j paymentSelection, f deferredIntentConfirmationType);

    void s(j paymentSelection, n0 linkMode, boolean googlePaySupported, String currency, y.m initializationMode, List<String> orderedLpms, boolean requireCvcRecollection);

    void t(y.Configuration configuration, boolean isDeferred);

    void u(Throwable error);

    void v(String errorMessage);

    void w();

    void x();
}
