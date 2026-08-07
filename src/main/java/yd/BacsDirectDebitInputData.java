package yd;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ud.e;

/* JADX INFO: renamed from: yd.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u001b\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010(\u001a\u0004\b\u001c\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lyd/a;", "", "", "holderName", "bankAccountNumber", "sortCode", EContextPaymentMethod.SHOPPER_EMAIL, "", "isAmountConsentChecked", "isAccountConsentChecked", "Lud/e;", "mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLud/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "k", "(Ljava/lang/String;)V", "j", "c", "e", "n", DateTokenConverter.CONVERTER_KEY, "m", "Z", "g", "()Z", IntegerTokenConverter.CONVERTER_KEY, "(Z)V", "f", "h", "Lud/e;", "()Lud/e;", "l", "(Lud/e;)V", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BacsDirectDebitInputData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String holderName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String bankAccountNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String sortCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String shopperEmail;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isAmountConsentChecked;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isAccountConsentChecked;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private e mode;

    public BacsDirectDebitInputData() {
        this(null, null, null, null, false, false, null, 127, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsDirectDebitInputData)) {
            return false;
        }
        BacsDirectDebitInputData bacsDirectDebitInputData = (BacsDirectDebitInputData) other;
        return s.f(this.holderName, bacsDirectDebitInputData.holderName) && s.f(this.bankAccountNumber, bacsDirectDebitInputData.bankAccountNumber) && s.f(this.sortCode, bacsDirectDebitInputData.sortCode) && s.f(this.shopperEmail, bacsDirectDebitInputData.shopperEmail) && this.isAmountConsentChecked == bacsDirectDebitInputData.isAmountConsentChecked && this.isAccountConsentChecked == bacsDirectDebitInputData.isAccountConsentChecked && this.mode == bacsDirectDebitInputData.mode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsAccountConsentChecked() {
        return this.isAccountConsentChecked;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsAmountConsentChecked() {
        return this.isAmountConsentChecked;
    }

    public final void h(boolean z11) {
        this.isAccountConsentChecked = z11;
    }

    public int hashCode() {
        return (((((((((((this.holderName.hashCode() * 31) + this.bankAccountNumber.hashCode()) * 31) + this.sortCode.hashCode()) * 31) + this.shopperEmail.hashCode()) * 31) + Boolean.hashCode(this.isAmountConsentChecked)) * 31) + Boolean.hashCode(this.isAccountConsentChecked)) * 31) + this.mode.hashCode();
    }

    public final void i(boolean z11) {
        this.isAmountConsentChecked = z11;
    }

    public final void j(String str) {
        s.k(str, "<set-?>");
        this.bankAccountNumber = str;
    }

    public final void k(String str) {
        s.k(str, "<set-?>");
        this.holderName = str;
    }

    public final void l(e eVar) {
        s.k(eVar, "<set-?>");
        this.mode = eVar;
    }

    public final void m(String str) {
        s.k(str, "<set-?>");
        this.shopperEmail = str;
    }

    public final void n(String str) {
        s.k(str, "<set-?>");
        this.sortCode = str;
    }

    public String toString() {
        return "BacsDirectDebitInputData(holderName=" + this.holderName + ", bankAccountNumber=" + this.bankAccountNumber + ", sortCode=" + this.sortCode + ", shopperEmail=" + this.shopperEmail + ", isAmountConsentChecked=" + this.isAmountConsentChecked + ", isAccountConsentChecked=" + this.isAccountConsentChecked + ", mode=" + this.mode + ")";
    }

    public BacsDirectDebitInputData(String holderName, String bankAccountNumber, String sortCode, String shopperEmail, boolean z11, boolean z12, e mode) {
        s.k(holderName, "holderName");
        s.k(bankAccountNumber, "bankAccountNumber");
        s.k(sortCode, "sortCode");
        s.k(shopperEmail, "shopperEmail");
        s.k(mode, "mode");
        this.holderName = holderName;
        this.bankAccountNumber = bankAccountNumber;
        this.sortCode = sortCode;
        this.shopperEmail = shopperEmail;
        this.isAmountConsentChecked = z11;
        this.isAccountConsentChecked = z12;
        this.mode = mode;
    }

    public /* synthetic */ BacsDirectDebitInputData(String str, String str2, String str3, String str4, boolean z11, boolean z12, e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? e.INPUT : eVar);
    }
}
