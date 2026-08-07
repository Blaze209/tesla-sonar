package b80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: b80.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006 "}, d2 = {"Lb80/d;", "", "", Scopes.EMAIL, "nameOnAccount", "sortCode", "accountNumber", "Lx30/c;", "payer", "supportAddressAsHtml", "debitGuaranteeAsHtml", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx30/c;Lx30/c;Lx30/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", DateTokenConverter.CONVERTER_KEY, "f", "e", "Lx30/c;", "()Lx30/c;", "g", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BacsMandateConfirmationViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameOnAccount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sortCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.c payer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.c supportAddressAsHtml;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.c debitGuaranteeAsHtml;

    public BacsMandateConfirmationViewState(String email, String nameOnAccount, String sortCode, String accountNumber, x30.c payer, x30.c supportAddressAsHtml, x30.c debitGuaranteeAsHtml) {
        s.k(email, "email");
        s.k(nameOnAccount, "nameOnAccount");
        s.k(sortCode, "sortCode");
        s.k(accountNumber, "accountNumber");
        s.k(payer, "payer");
        s.k(supportAddressAsHtml, "supportAddressAsHtml");
        s.k(debitGuaranteeAsHtml, "debitGuaranteeAsHtml");
        this.email = email;
        this.nameOnAccount = nameOnAccount;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.payer = payer;
        this.supportAddressAsHtml = supportAddressAsHtml;
        this.debitGuaranteeAsHtml = debitGuaranteeAsHtml;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final x30.c getDebitGuaranteeAsHtml() {
        return this.debitGuaranteeAsHtml;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNameOnAccount() {
        return this.nameOnAccount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final x30.c getPayer() {
        return this.payer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsMandateConfirmationViewState)) {
            return false;
        }
        BacsMandateConfirmationViewState bacsMandateConfirmationViewState = (BacsMandateConfirmationViewState) other;
        return s.f(this.email, bacsMandateConfirmationViewState.email) && s.f(this.nameOnAccount, bacsMandateConfirmationViewState.nameOnAccount) && s.f(this.sortCode, bacsMandateConfirmationViewState.sortCode) && s.f(this.accountNumber, bacsMandateConfirmationViewState.accountNumber) && s.f(this.payer, bacsMandateConfirmationViewState.payer) && s.f(this.supportAddressAsHtml, bacsMandateConfirmationViewState.supportAddressAsHtml) && s.f(this.debitGuaranteeAsHtml, bacsMandateConfirmationViewState.debitGuaranteeAsHtml);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final x30.c getSupportAddressAsHtml() {
        return this.supportAddressAsHtml;
    }

    public int hashCode() {
        return (((((((((((this.email.hashCode() * 31) + this.nameOnAccount.hashCode()) * 31) + this.sortCode.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.payer.hashCode()) * 31) + this.supportAddressAsHtml.hashCode()) * 31) + this.debitGuaranteeAsHtml.hashCode();
    }

    public String toString() {
        return "BacsMandateConfirmationViewState(email=" + this.email + ", nameOnAccount=" + this.nameOnAccount + ", sortCode=" + this.sortCode + ", accountNumber=" + this.accountNumber + ", payer=" + this.payer + ", supportAddressAsHtml=" + this.supportAddressAsHtml + ", debitGuaranteeAsHtml=" + this.debitGuaranteeAsHtml + ")";
    }
}
