package af;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import ke.m;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: af.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Laf/a;", "Lke/m;", "", "isValid", "", Action.PAYMENT_METHOD_TYPE, "qrCodeData", "qrImageUrl", "", "messageTextResource", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class QRCodeOutputData implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String qrCodeData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String qrImageUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer messageTextResource;

    public QRCodeOutputData(boolean z11, String str, String str2, String str3, Integer num) {
        this.isValid = z11;
        this.paymentMethodType = str;
        this.qrCodeData = str2;
        this.qrImageUrl = str3;
        this.messageTextResource = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getMessageTextResource() {
        return this.messageTextResource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQrCodeData() {
        return this.qrCodeData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQrImageUrl() {
        return this.qrImageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRCodeOutputData)) {
            return false;
        }
        QRCodeOutputData qRCodeOutputData = (QRCodeOutputData) other;
        return this.isValid == qRCodeOutputData.isValid && s.f(this.paymentMethodType, qRCodeOutputData.paymentMethodType) && s.f(this.qrCodeData, qRCodeOutputData.qrCodeData) && s.f(this.qrImageUrl, qRCodeOutputData.qrImageUrl) && s.f(this.messageTextResource, qRCodeOutputData.messageTextResource);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isValid) * 31;
        String str = this.paymentMethodType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.qrCodeData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.qrImageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.messageTextResource;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "QRCodeOutputData(isValid=" + this.isValid + ", paymentMethodType=" + this.paymentMethodType + ", qrCodeData=" + this.qrCodeData + ", qrImageUrl=" + this.qrImageUrl + ", messageTextResource=" + this.messageTextResource + ")";
    }

    public /* synthetic */ QRCodeOutputData(boolean z11, String str, String str2, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : num);
    }
}
