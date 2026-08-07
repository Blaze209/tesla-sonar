package sf;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.action.Action;
import java.util.List;
import ke.m;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: sf.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001b\u0010-¨\u0006."}, d2 = {"Lsf/b;", "Lke/m;", "", "isValid", "", Action.PAYMENT_METHOD_TYPE, "", "introductionTextResource", "reference", "Lcom/adyen/checkout/components/core/Amount;", "totalAmount", "Lsf/e;", "storeAction", "instructionUrl", "", "Lsf/a;", "informationFields", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lsf/e;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "Lcom/adyen/checkout/components/core/Amount;", "g", "()Lcom/adyen/checkout/components/core/Amount;", "f", "Lsf/e;", "()Lsf/e;", "h", "Ljava/util/List;", "()Ljava/util/List;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VoucherOutputData implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer introductionTextResource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Amount totalAmount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final e storeAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String instructionUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<VoucherInformationField> informationFields;

    public VoucherOutputData(boolean z11, String str, Integer num, String str2, Amount amount, e eVar, String str3, List<VoucherInformationField> list) {
        this.isValid = z11;
        this.paymentMethodType = str;
        this.introductionTextResource = num;
        this.reference = str2;
        this.totalAmount = amount;
        this.storeAction = eVar;
        this.instructionUrl = str3;
        this.informationFields = list;
    }

    public final List<VoucherInformationField> a() {
        return this.informationFields;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstructionUrl() {
        return this.instructionUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getIntroductionTextResource() {
        return this.introductionTextResource;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherOutputData)) {
            return false;
        }
        VoucherOutputData voucherOutputData = (VoucherOutputData) other;
        return this.isValid == voucherOutputData.isValid && s.f(this.paymentMethodType, voucherOutputData.paymentMethodType) && s.f(this.introductionTextResource, voucherOutputData.introductionTextResource) && s.f(this.reference, voucherOutputData.reference) && s.f(this.totalAmount, voucherOutputData.totalAmount) && s.f(this.storeAction, voucherOutputData.storeAction) && s.f(this.instructionUrl, voucherOutputData.instructionUrl) && s.f(this.informationFields, voucherOutputData.informationFields);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getStoreAction() {
        return this.storeAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isValid) * 31;
        String str = this.paymentMethodType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.introductionTextResource;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.reference;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount = this.totalAmount;
        int iHashCode5 = (iHashCode4 + (amount == null ? 0 : amount.hashCode())) * 31;
        e eVar = this.storeAction;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str3 = this.instructionUrl;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<VoucherInformationField> list = this.informationFields;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "VoucherOutputData(isValid=" + this.isValid + ", paymentMethodType=" + this.paymentMethodType + ", introductionTextResource=" + this.introductionTextResource + ", reference=" + this.reference + ", totalAmount=" + this.totalAmount + ", storeAction=" + this.storeAction + ", instructionUrl=" + this.instructionUrl + ", informationFields=" + this.informationFields + ")";
    }
}
