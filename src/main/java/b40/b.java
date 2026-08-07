package b40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.stripe.android.customersheet.g;
import com.stripe.android.model.h;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0003,&*J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H&¢\u0006\u0004\b,\u0010\u0016¨\u0006-"}, d2 = {"Lb40/b;", "", "Lcom/stripe/android/customersheet/d$c;", "configuration", "Lcom/stripe/android/customersheet/g$c;", "integrationType", "Ljn0/h0;", "q", "(Lcom/stripe/android/customersheet/d$c;Lcom/stripe/android/customersheet/g$c;)V", "Lb40/b$c;", AnalyticsContext.Screen, IntegerTokenConverter.CONVERTER_KEY, "(Lb40/b$c;)V", "f", "", "code", "e", "(Ljava/lang/String;)V", "type", "n", "j", "g", "()V", "p", "m", "o", "Lb40/b$a;", "style", "l", "(Lb40/b$a;)V", "k", "Lb40/b$b;", "source", "Lcom/stripe/android/model/h;", "selectedBrand", DateTokenConverter.CONVERTER_KEY, "(Lb40/b$b;Lcom/stripe/android/model/h;)V", "h", "b", "(Lcom/stripe/android/model/h;)V", "", AnalyticsAttribute.Error, "c", "(Lcom/stripe/android/model/h;Ljava/lang/Throwable;)V", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lb40/b$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SetupIntent", "CreateAttach", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        SetupIntent("setup_intent"),
        CreateAttach("create_attach");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        a(String str) {
            this.value = str;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: b40.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lb40/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "Add", "Edit", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EnumC0322b {
        Add,
        Edit;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<EnumC0322b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lb40/b$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "AddPaymentMethod", "SelectPaymentMethod", "EditPaymentMethod", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum c {
        AddPaymentMethod("add_payment_method"),
        SelectPaymentMethod("select_payment_method"),
        EditPaymentMethod("edit_payment_method");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        c(String str) {
            this.value = str;
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    void a();

    void b(h selectedBrand);

    void c(h selectedBrand, Throwable error);

    void d(EnumC0322b source, h selectedBrand);

    void e(String code);

    void f(c screen);

    void g();

    void h(EnumC0322b source, h selectedBrand);

    void i(c screen);

    void j(String type);

    void k(a style);

    void l(a style);

    void m();

    void n(String type);

    void o();

    void p();

    void q(com.stripe.android.customersheet.d.Configuration configuration, g.c integrationType);
}
