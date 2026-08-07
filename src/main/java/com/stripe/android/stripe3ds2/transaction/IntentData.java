package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.n, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\n¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/n;", "Landroid/os/Parcelable;", "", "clientSecret", "sourceId", "publishableKey", "accountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "p", "b", DateTokenConverter.CONVERTER_KEY, "c", "e", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IntentData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publishableKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<IntentData> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final IntentData f54048f = new IntentData("", "", "", null);

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/n$a;", "", "<init>", "()V", "Lcom/stripe/android/stripe3ds2/transaction/n;", "EMPTY", "Lcom/stripe/android/stripe3ds2/transaction/n;", "a", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntentData a() {
            return IntentData.f54048f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.n$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IntentData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IntentData createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new IntentData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IntentData[] newArray(int i11) {
            return new IntentData[i11];
        }
    }

    public IntentData(String clientSecret, String sourceId, String publishableKey, String str) {
        s.k(clientSecret, "clientSecret");
        s.k(sourceId, "sourceId");
        s.k(publishableKey, "publishableKey");
        this.clientSecret = clientSecret;
        this.sourceId = sourceId;
        this.publishableKey = publishableKey;
        this.accountId = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntentData)) {
            return false;
        }
        IntentData intentData = (IntentData) other;
        return s.f(this.clientSecret, intentData.clientSecret) && s.f(this.sourceId, intentData.sourceId) && s.f(this.publishableKey, intentData.publishableKey) && s.f(this.accountId, intentData.accountId);
    }

    public int hashCode() {
        int iHashCode = ((((this.clientSecret.hashCode() * 31) + this.sourceId.hashCode()) * 31) + this.publishableKey.hashCode()) * 31;
        String str = this.accountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public String toString() {
        return "IntentData(clientSecret=" + this.clientSecret + ", sourceId=" + this.sourceId + ", publishableKey=" + this.publishableKey + ", accountId=" + this.accountId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.sourceId);
        parcel.writeString(this.publishableKey);
        parcel.writeString(this.accountId);
    }
}
