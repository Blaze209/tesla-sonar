package com.stripe.android.customersheet;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.stripe.android.customersheet.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/customersheet/a;", "", "Lcom/stripe/android/customersheet/b$c;", "La40/a;", "result", "", InquiryField.DateField.TYPE, "<init>", "(Lcom/stripe/android/customersheet/b$c;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/customersheet/b$c;", "b", "()Lcom/stripe/android/customersheet/b$c;", "J", "()J", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final /* data */ class CachedCustomerEphemeralKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b.c<a40.a> result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long date;

    public CachedCustomerEphemeralKey(b.c<a40.a> result, long j11) {
        p013kotlin.jvm.internal.s.k(result, "result");
        this.result = result;
        this.date = j11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    public final b.c<a40.a> b() {
        return this.result;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedCustomerEphemeralKey)) {
            return false;
        }
        CachedCustomerEphemeralKey cachedCustomerEphemeralKey = (CachedCustomerEphemeralKey) other;
        return p013kotlin.jvm.internal.s.f(this.result, cachedCustomerEphemeralKey.result) && this.date == cachedCustomerEphemeralKey.date;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + Long.hashCode(this.date);
    }

    public String toString() {
        return "CachedCustomerEphemeralKey(result=" + this.result + ", date=" + this.date + ")";
    }
}
