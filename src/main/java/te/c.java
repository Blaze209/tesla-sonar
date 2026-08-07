package te;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB;\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lte/c;", "", "", InquiryField.FloatField.TYPE2, "expiryMonth", "expiryYear", "cvc", "cardHolderName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "c", "e", "getCardHolderName", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String expiryMonth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String expiryYear;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String cvc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String cardHolderName;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Lte/c$a;", "", "<init>", "()V", "", InquiryField.StringField.TYPE, "b", "(Ljava/lang/String;)Ljava/lang/String;", InquiryField.FloatField.TYPE2, "e", "(Ljava/lang/String;)Lte/c$a;", "expiryMonth", "expiryYear", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)Lte/c$a;", "cvc", "c", "Lte/c;", "a", "()Lte/c;", "Ljava/lang/String;", "cardHolderName", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String number;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String expiryMonth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String expiryYear;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String cardHolderName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String cvc;

        private final String b(String string) {
            if (string != null) {
                return new q("\\s").j(string, "");
            }
            return null;
        }

        public final c a() {
            return new c(this.number, this.expiryMonth, this.expiryYear, this.cvc, this.cardHolderName);
        }

        public final a c(String cvc) {
            s.k(cvc, "cvc");
            this.cvc = b(cvc);
            return this;
        }

        public final a d(String expiryMonth, String expiryYear) {
            s.k(expiryMonth, "expiryMonth");
            s.k(expiryYear, "expiryYear");
            this.expiryMonth = b(expiryMonth);
            this.expiryYear = b(expiryYear);
            return this;
        }

        public final a e(String number) {
            s.k(number, "number");
            this.number = b(number);
            return this;
        }
    }

    public c(String str, String str2, String str3, String str4, String str5) {
        this.number = str;
        this.expiryMonth = str2;
        this.expiryYear = str3;
        this.cvc = str4;
        this.cardHolderName = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCvc() {
        return this.cvc;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNumber() {
        return this.number;
    }
}
