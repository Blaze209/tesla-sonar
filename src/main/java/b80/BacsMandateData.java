package b80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.p;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: b80.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lb80/e;", "", "", "name", Scopes.EMAIL, "accountNumber", "sortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", DateTokenConverter.CONVERTER_KEY, "e", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BacsMandateData {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sortCode;

    /* JADX INFO: renamed from: b80.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb80/e$a;", "", "<init>", "()V", "Lcom/stripe/android/paymentsheet/p$a;", "confirmationOption", "Lb80/e;", "a", "(Lcom/stripe/android/paymentsheet/p$a;)Lb80/e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BacsMandateData a(p.BacsPaymentMethod confirmationOption) {
            s.k(confirmationOption, "confirmationOption");
            PaymentMethodCreateParams paymentMethodCreateParamsB = confirmationOption.getCreateParams();
            PaymentMethodCreateParams.Companion companion = PaymentMethodCreateParams.INSTANCE;
            PaymentMethodCreateParams.BacsDebit bacsDebitW = companion.w(paymentMethodCreateParamsB);
            String strZ = companion.Z(paymentMethodCreateParamsB);
            String strY = companion.Y(paymentMethodCreateParamsB);
            if (bacsDebitW == null || strZ == null || strY == null) {
                return null;
            }
            return new BacsMandateData(strZ, strY, bacsDebitW.getAccountNumber(), bacsDebitW.getSortCode());
        }

        private Companion() {
        }
    }

    public BacsMandateData(String name, String email, String accountNumber, String sortCode) {
        s.k(name, "name");
        s.k(email, "email");
        s.k(accountNumber, "accountNumber");
        s.k(sortCode, "sortCode");
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsMandateData)) {
            return false;
        }
        BacsMandateData bacsMandateData = (BacsMandateData) other;
        return s.f(this.name, bacsMandateData.name) && s.f(this.email, bacsMandateData.email) && s.f(this.accountNumber, bacsMandateData.accountNumber) && s.f(this.sortCode, bacsMandateData.sortCode);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.email.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.sortCode.hashCode();
    }

    public String toString() {
        return "BacsMandateData(name=" + this.name + ", email=" + this.email + ", accountNumber=" + this.accountNumber + ", sortCode=" + this.sortCode + ")";
    }
}
