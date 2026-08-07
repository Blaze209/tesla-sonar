package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.stripe.android.model.e0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/e0;", "Lcom/stripe/android/model/d0;", "Lcom/stripe/android/model/Source;", "source", "<init>", "(Lcom/stripe/android/model/Source;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/Source;", "getSource", "()Lcom/stripe/android/model/Source;", "Lcom/stripe/android/model/r1;", "()Lcom/stripe/android/model/r1;", "tokenizationMethod", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CustomerSource extends d0 {
    public static final Parcelable.Creator<CustomerSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Source source;

    /* JADX INFO: renamed from: com.stripe.android.model.e0$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CustomerSource> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerSource createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new CustomerSource(Source.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomerSource[] newArray(int i11) {
            return new CustomerSource[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSource(Source source) {
        super(null);
        p013kotlin.jvm.internal.s.k(source, "source");
        this.source = source;
    }

    @Override // com.stripe.android.model.d0
    public r1 a() {
        if (this.source.getSourceTypeModel() instanceof SourceTypeModel.Card) {
            return ((SourceTypeModel.Card) this.source.getSourceTypeModel()).getTokenizationMethod();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomerSource) && p013kotlin.jvm.internal.s.f(this.source, ((CustomerSource) other).source);
    }

    public int hashCode() {
        return this.source.hashCode();
    }

    public String toString() {
        return "CustomerSource(source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        this.source.writeToParcel(parcel, flags);
    }
}
