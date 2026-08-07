package fk;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import gk.c0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, d2 = {"Lfk/a;", "", "", "holderName", "cardNumber", "cvv", "", "expirationMonth", "expirationYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", DateTokenConverter.CONVERTER_KEY, "I", "sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String holderName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String cardNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String cvv;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int expirationMonth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int expirationYear;

    public a(String holderName, String cardNumber, String cvv, int i11, int i12) {
        s.k(holderName, "holderName");
        s.k(cardNumber, "cardNumber");
        s.k(cvv, "cvv");
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationMonth = i11;
        this.expirationYear = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getExpirationMonth() {
        return this.expirationMonth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getExpirationYear() {
        return this.expirationYear;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(this.holderName, aVar.holderName) && s.f(this.cardNumber, aVar.cardNumber) && s.f(this.cvv, aVar.cvv) && this.expirationMonth == aVar.expirationMonth && this.expirationYear == aVar.expirationYear;
    }

    public int hashCode() {
        return Integer.hashCode(this.expirationYear) + ((Integer.hashCode(this.expirationMonth) + c0.a(this.cvv, c0.a(this.cardNumber, this.holderName.hashCode() * 31, 31), 31)) * 31);
    }

    public String toString() {
        return "DLCardData(holderName=" + this.holderName + ", cardNumber=" + this.cardNumber + ", cvv=" + this.cvv + ", expirationMonth=" + this.expirationMonth + ", expirationYear=" + this.expirationYear + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
