package com.stripe.android.stripe3ds2.transaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import u80.ErrorData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0007\f\b\u0005\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0006\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "Lcom/stripe/android/stripe3ds2/transaction/n;", "b", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "Lcom/stripe/android/stripe3ds2/transactions/d;", "a", "()Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Lcom/stripe/android/stripe3ds2/transaction/h$a;", "Lcom/stripe/android/stripe3ds2/transaction/h$c;", "Lcom/stripe/android/stripe3ds2/transaction/h$d;", "Lcom/stripe/android/stripe3ds2/transaction/h$e;", "Lcom/stripe/android/stripe3ds2/transaction/h$f;", "Lcom/stripe/android/stripe3ds2/transaction/h$g;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h$a;", "Lcom/stripe/android/stripe3ds2/transaction/h;", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/d;Lcom/stripe/android/stripe3ds2/transaction/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/stripe/android/stripe3ds2/transactions/d;", "a", "()Lcom/stripe/android/stripe3ds2/transactions/d;", "Lcom/stripe/android/stripe3ds2/transaction/n;", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled extends h {
        public static final Parcelable.Creator<Canceled> CREATOR = new C1079a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String uiTypeCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.stripe3ds2.transactions.d initialUiType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final IntentData intentData;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1079a implements Parcelable.Creator<Canceled> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Canceled createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Canceled(parcel.readString(), parcel.readInt() == 0 ? null : com.stripe.android.stripe3ds2.transactions.d.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Canceled[] newArray(int i11) {
                return new Canceled[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(String str, com.stripe.android.stripe3ds2.transactions.d dVar, IntentData intentData) {
            super(null);
            s.k(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = dVar;
            this.intentData = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.stripe3ds2.transactions.d getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) other;
            return s.f(this.uiTypeCode, canceled.uiTypeCode) && this.initialUiType == canceled.initialUiType && s.f(this.intentData, canceled.intentData);
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            return ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.uiTypeCode);
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            if (dVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dVar.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h$b;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/stripe3ds2/transaction/h;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/stripe3ds2/transaction/h;", "", "EXTRA_RESULT", "Ljava/lang/String;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(Intent intent) {
            h hVar;
            return (intent == null || (hVar = (h) androidx.core.content.c.b(intent, "extra_result", h.class)) == null) ? new RuntimeError(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, IntentData.INSTANCE.a()) : hVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$c, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h$c;", "Lcom/stripe/android/stripe3ds2/transaction/h;", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/d;Lcom/stripe/android/stripe3ds2/transaction/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/stripe/android/stripe3ds2/transactions/d;", "a", "()Lcom/stripe/android/stripe3ds2/transactions/d;", "Lcom/stripe/android/stripe3ds2/transaction/n;", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed extends h {
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String uiTypeCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.stripe3ds2.transactions.d initialUiType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final IntentData intentData;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Failed createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Failed(parcel.readString(), parcel.readInt() == 0 ? null : com.stripe.android.stripe3ds2.transactions.d.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Failed[] newArray(int i11) {
                return new Failed[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String uiTypeCode, com.stripe.android.stripe3ds2.transactions.d dVar, IntentData intentData) {
            super(null);
            s.k(uiTypeCode, "uiTypeCode");
            s.k(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = dVar;
            this.intentData = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.stripe3ds2.transactions.d getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return s.f(this.uiTypeCode, failed.uiTypeCode) && this.initialUiType == failed.initialUiType && s.f(this.intentData, failed.intentData);
        }

        public int hashCode() {
            int iHashCode = this.uiTypeCode.hashCode() * 31;
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            return ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.uiTypeCode);
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            if (dVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dVar.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$d, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h$d;", "Lcom/stripe/android/stripe3ds2/transaction/h;", "Lu80/a;", "data", "Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "<init>", "(Lu80/a;Lcom/stripe/android/stripe3ds2/transactions/d;Lcom/stripe/android/stripe3ds2/transaction/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lu80/a;", "getData", "()Lu80/a;", "c", "Lcom/stripe/android/stripe3ds2/transactions/d;", "a", "()Lcom/stripe/android/stripe3ds2/transactions/d;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/stripe3ds2/transaction/n;", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProtocolError extends h {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ErrorData data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.stripe3ds2.transactions.d initialUiType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final IntentData intentData;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProtocolError> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProtocolError createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ProtocolError(ErrorData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.stripe.android.stripe3ds2.transactions.d.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProtocolError[] newArray(int i11) {
                return new ProtocolError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProtocolError(ErrorData data, com.stripe.android.stripe3ds2.transactions.d dVar, IntentData intentData) {
            super(null);
            s.k(data, "data");
            s.k(intentData, "intentData");
            this.data = data;
            this.initialUiType = dVar;
            this.intentData = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.stripe3ds2.transactions.d getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public IntentData getIntentData() {
            return this.intentData;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProtocolError)) {
                return false;
            }
            ProtocolError protocolError = (ProtocolError) other;
            return s.f(this.data, protocolError.data) && this.initialUiType == protocolError.initialUiType && s.f(this.intentData, protocolError.intentData);
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            return ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.data + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            this.data.writeToParcel(parcel, flags);
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            if (dVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dVar.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$e, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h$e;", "Lcom/stripe/android/stripe3ds2/transaction/h;", "", "throwable", "Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/d;Lcom/stripe/android/stripe3ds2/transaction/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "c", "Lcom/stripe/android/stripe3ds2/transactions/d;", "a", "()Lcom/stripe/android/stripe3ds2/transactions/d;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/stripe3ds2/transaction/n;", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RuntimeError extends h {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable throwable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.stripe3ds2.transactions.d initialUiType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final IntentData intentData;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$e$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RuntimeError> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RuntimeError createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new RuntimeError((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : com.stripe.android.stripe3ds2.transactions.d.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RuntimeError[] newArray(int i11) {
                return new RuntimeError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuntimeError(Throwable throwable, com.stripe.android.stripe3ds2.transactions.d dVar, IntentData intentData) {
            super(null);
            s.k(throwable, "throwable");
            s.k(intentData, "intentData");
            this.throwable = throwable;
            this.initialUiType = dVar;
            this.intentData = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.stripe3ds2.transactions.d getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public IntentData getIntentData() {
            return this.intentData;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RuntimeError)) {
                return false;
            }
            RuntimeError runtimeError = (RuntimeError) other;
            return s.f(this.throwable, runtimeError.throwable) && this.initialUiType == runtimeError.initialUiType && s.f(this.intentData, runtimeError.intentData);
        }

        public int hashCode() {
            int iHashCode = this.throwable.hashCode() * 31;
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            return ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.throwable + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeSerializable(this.throwable);
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            if (dVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dVar.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$f, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h$f;", "Lcom/stripe/android/stripe3ds2/transaction/h;", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/d;Lcom/stripe/android/stripe3ds2/transaction/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/stripe/android/stripe3ds2/transactions/d;", "a", "()Lcom/stripe/android/stripe3ds2/transactions/d;", "Lcom/stripe/android/stripe3ds2/transaction/n;", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Succeeded extends h {
        public static final Parcelable.Creator<Succeeded> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String uiTypeCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.stripe3ds2.transactions.d initialUiType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final IntentData intentData;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$f$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Succeeded> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Succeeded createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Succeeded(parcel.readString(), parcel.readInt() == 0 ? null : com.stripe.android.stripe3ds2.transactions.d.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Succeeded[] newArray(int i11) {
                return new Succeeded[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(String uiTypeCode, com.stripe.android.stripe3ds2.transactions.d dVar, IntentData intentData) {
            super(null);
            s.k(uiTypeCode, "uiTypeCode");
            s.k(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = dVar;
            this.intentData = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.stripe3ds2.transactions.d getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Succeeded)) {
                return false;
            }
            Succeeded succeeded = (Succeeded) other;
            return s.f(this.uiTypeCode, succeeded.uiTypeCode) && this.initialUiType == succeeded.initialUiType && s.f(this.intentData, succeeded.intentData);
        }

        public int hashCode() {
            int iHashCode = this.uiTypeCode.hashCode() * 31;
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            return ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.uiTypeCode);
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            if (dVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dVar.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$g, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h$g;", "Lcom/stripe/android/stripe3ds2/transaction/h;", "", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/d;Lcom/stripe/android/stripe3ds2/transaction/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/stripe/android/stripe3ds2/transactions/d;", "a", "()Lcom/stripe/android/stripe3ds2/transactions/d;", "Lcom/stripe/android/stripe3ds2/transaction/n;", "()Lcom/stripe/android/stripe3ds2/transaction/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Timeout extends h {
        public static final Parcelable.Creator<Timeout> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String uiTypeCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.stripe3ds2.transactions.d initialUiType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final IntentData intentData;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.h$g$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Timeout> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Timeout createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Timeout(parcel.readString(), parcel.readInt() == 0 ? null : com.stripe.android.stripe3ds2.transactions.d.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Timeout[] newArray(int i11) {
                return new Timeout[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(String str, com.stripe.android.stripe3ds2.transactions.d dVar, IntentData intentData) {
            super(null);
            s.k(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = dVar;
            this.intentData = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public com.stripe.android.stripe3ds2.transactions.d getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timeout)) {
                return false;
            }
            Timeout timeout = (Timeout) other;
            return s.f(this.uiTypeCode, timeout.uiTypeCode) && this.initialUiType == timeout.initialUiType && s.f(this.intentData, timeout.intentData);
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            return ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.uiTypeCode);
            com.stripe.android.stripe3ds2.transactions.d dVar = this.initialUiType;
            if (dVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dVar.name());
            }
            this.intentData.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract com.stripe.android.stripe3ds2.transactions.d getInitialUiType();

    /* JADX INFO: renamed from: b */
    public abstract IntentData getIntentData();

    public final Bundle c() {
        return q5.d.b(x.a("extra_result", this));
    }

    private h() {
    }
}
