package se;

import p013kotlin.Metadata;

/* JADX INFO: renamed from: se.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lse/a;", "", "", "expiryMonth", "expiryYear", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ExpiryDate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int expiryMonth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int expiryYear;

    public ExpiryDate(int i11, int i12) {
        this.expiryMonth = i11;
        this.expiryYear = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiryDate)) {
            return false;
        }
        ExpiryDate expiryDate = (ExpiryDate) other;
        return this.expiryMonth == expiryDate.expiryMonth && this.expiryYear == expiryDate.expiryYear;
    }

    public int hashCode() {
        return (Integer.hashCode(this.expiryMonth) * 31) + Integer.hashCode(this.expiryYear);
    }

    public String toString() {
        return "ExpiryDate(expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ")";
    }
}
