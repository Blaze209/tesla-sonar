package p027z70;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.BankAccount;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\b\u000b\u000f\r\u0012B\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lz70/f;", "Landroid/os/Parcelable;", "Lx30/c;", AnalyticsAttribute.Error, "", "isProcessing", "<init>", "(Lx30/c;Z)V", "a", "Lx30/c;", "()Lx30/c;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "c", "primaryButtonText", "mandateText", "e", "Lz70/f$a;", "Lz70/f$b;", "Lz70/f$d;", "Lz70/f$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x30.c error;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isProcessing;

    /* JADX INFO: renamed from: z70.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b \u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lz70/f$a;", "Lz70/f;", "Lx30/c;", AnalyticsAttribute.Error, "primaryButtonText", "", "isProcessing", "<init>", "(Lx30/c;Lx30/c;Z)V", "e", "(Lx30/c;Lx30/c;Z)Lz70/f$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lx30/c;", "a", "()Lx30/c;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "b", "mandateText", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BillingDetailsCollection extends f {
        public static final Parcelable.Creator<BillingDetailsCollection> CREATOR = new C2762a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c error;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c primaryButtonText;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isProcessing;

        /* JADX INFO: renamed from: z70.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C2762a implements Parcelable.Creator<BillingDetailsCollection> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BillingDetailsCollection createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new BillingDetailsCollection((x30.c) parcel.readParcelable(BillingDetailsCollection.class.getClassLoader()), (x30.c) parcel.readParcelable(BillingDetailsCollection.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BillingDetailsCollection[] newArray(int i11) {
                return new BillingDetailsCollection[i11];
            }
        }

        public /* synthetic */ BillingDetailsCollection(x30.c cVar, x30.c cVar2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : cVar, cVar2, z11);
        }

        public static /* synthetic */ BillingDetailsCollection f(BillingDetailsCollection billingDetailsCollection, x30.c cVar, x30.c cVar2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = billingDetailsCollection.error;
            }
            if ((i11 & 2) != 0) {
                cVar2 = billingDetailsCollection.primaryButtonText;
            }
            if ((i11 & 4) != 0) {
                z11 = billingDetailsCollection.isProcessing;
            }
            return billingDetailsCollection.e(cVar, cVar2, z11);
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public x30.c getError() {
            return this.error;
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: b */
        public x30.c getMandateText() {
            return null;
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: c, reason: from getter */
        public x30.c getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getIsProcessing() {
            return this.isProcessing;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final BillingDetailsCollection e(x30.c error, x30.c primaryButtonText, boolean isProcessing) {
            s.k(primaryButtonText, "primaryButtonText");
            return new BillingDetailsCollection(error, primaryButtonText, isProcessing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetailsCollection)) {
                return false;
            }
            BillingDetailsCollection billingDetailsCollection = (BillingDetailsCollection) other;
            return s.f(this.error, billingDetailsCollection.error) && s.f(this.primaryButtonText, billingDetailsCollection.primaryButtonText) && this.isProcessing == billingDetailsCollection.isProcessing;
        }

        public int hashCode() {
            x30.c cVar = this.error;
            return ((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31) + Boolean.hashCode(this.isProcessing);
        }

        public String toString() {
            return "BillingDetailsCollection(error=" + this.error + ", primaryButtonText=" + this.primaryButtonText + ", isProcessing=" + this.isProcessing + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.error, flags);
            parcel.writeParcelable(this.primaryButtonText, flags);
            parcel.writeInt(this.isProcessing ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BillingDetailsCollection(x30.c cVar, x30.c primaryButtonText, boolean z11) {
            super(null, false, 3, 0 == true ? 1 : 0);
            s.k(primaryButtonText, "primaryButtonText");
            this.error = cVar;
            this.primaryButtonText = primaryButtonText;
            this.isProcessing = z11;
        }
    }

    /* JADX INFO: renamed from: z70.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJT\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b'\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b \u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lz70/f$b;", "Lz70/f;", "Lz70/f$c;", "resultIdentifier", "", "bankName", "last4", "intentId", "Lx30/c;", "primaryButtonText", "mandateText", "<init>", "(Lz70/f$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx30/c;Lx30/c;)V", "e", "(Lz70/f$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx30/c;Lx30/c;)Lz70/f$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lz70/f$c;", IntegerTokenConverter.CONVERTER_KEY, "()Lz70/f$c;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "h", "f", "getIntentId", "Lx30/c;", "()Lx30/c;", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MandateCollection extends f {
        public static final Parcelable.Creator<MandateCollection> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c resultIdentifier;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bankName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String last4;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String intentId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c primaryButtonText;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c mandateText;

        /* JADX INFO: renamed from: z70.f$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MandateCollection> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MandateCollection createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new MandateCollection((c) parcel.readParcelable(MandateCollection.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (x30.c) parcel.readParcelable(MandateCollection.class.getClassLoader()), (x30.c) parcel.readParcelable(MandateCollection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MandateCollection[] newArray(int i11) {
                return new MandateCollection[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MandateCollection(c resultIdentifier, String str, String str2, String str3, x30.c primaryButtonText, x30.c cVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            s.k(resultIdentifier, "resultIdentifier");
            s.k(primaryButtonText, "primaryButtonText");
            this.resultIdentifier = resultIdentifier;
            this.bankName = str;
            this.last4 = str2;
            this.intentId = str3;
            this.primaryButtonText = primaryButtonText;
            this.mandateText = cVar;
        }

        public static /* synthetic */ MandateCollection f(MandateCollection mandateCollection, c cVar, String str, String str2, String str3, x30.c cVar2, x30.c cVar3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = mandateCollection.resultIdentifier;
            }
            if ((i11 & 2) != 0) {
                str = mandateCollection.bankName;
            }
            if ((i11 & 4) != 0) {
                str2 = mandateCollection.last4;
            }
            if ((i11 & 8) != 0) {
                str3 = mandateCollection.intentId;
            }
            if ((i11 & 16) != 0) {
                cVar2 = mandateCollection.primaryButtonText;
            }
            if ((i11 & 32) != 0) {
                cVar3 = mandateCollection.mandateText;
            }
            x30.c cVar4 = cVar2;
            x30.c cVar5 = cVar3;
            return mandateCollection.e(cVar, str, str2, str3, cVar4, cVar5);
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: b, reason: from getter */
        public x30.c getMandateText() {
            return this.mandateText;
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: c, reason: from getter */
        public x30.c getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final MandateCollection e(c resultIdentifier, String bankName, String last4, String intentId, x30.c primaryButtonText, x30.c mandateText) {
            s.k(resultIdentifier, "resultIdentifier");
            s.k(primaryButtonText, "primaryButtonText");
            return new MandateCollection(resultIdentifier, bankName, last4, intentId, primaryButtonText, mandateText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MandateCollection)) {
                return false;
            }
            MandateCollection mandateCollection = (MandateCollection) other;
            return s.f(this.resultIdentifier, mandateCollection.resultIdentifier) && s.f(this.bankName, mandateCollection.bankName) && s.f(this.last4, mandateCollection.last4) && s.f(this.intentId, mandateCollection.intentId) && s.f(this.primaryButtonText, mandateCollection.primaryButtonText) && s.f(this.mandateText, mandateCollection.mandateText);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        public int hashCode() {
            int iHashCode = this.resultIdentifier.hashCode() * 31;
            String str = this.bankName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.last4;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.intentId;
            int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.primaryButtonText.hashCode()) * 31;
            x30.c cVar = this.mandateText;
            return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final c getResultIdentifier() {
            return this.resultIdentifier;
        }

        public String toString() {
            return "MandateCollection(resultIdentifier=" + this.resultIdentifier + ", bankName=" + this.bankName + ", last4=" + this.last4 + ", intentId=" + this.intentId + ", primaryButtonText=" + this.primaryButtonText + ", mandateText=" + this.mandateText + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.resultIdentifier, flags);
            parcel.writeString(this.bankName);
            parcel.writeString(this.last4);
            parcel.writeString(this.intentId);
            parcel.writeParcelable(this.primaryButtonText, flags);
            parcel.writeParcelable(this.mandateText, flags);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lz70/f$c;", "Landroid/os/Parcelable;", "a", "b", "Lz70/f$c$a;", "Lz70/f$c$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends Parcelable {

        /* JADX INFO: renamed from: z70.f$c$a, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lz70/f$c$a;", "Lz70/f$c;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentMethod implements c {
            public static final Parcelable.Creator<PaymentMethod> CREATOR = new C2763a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: z70.f$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C2763a implements Parcelable.Creator<PaymentMethod> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaymentMethod createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new PaymentMethod(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PaymentMethod[] newArray(int i11) {
                    return new PaymentMethod[i11];
                }
            }

            public PaymentMethod(String id2) {
                s.k(id2, "id");
                this.id = id2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentMethod) && s.f(this.id, ((PaymentMethod) other).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "PaymentMethod(id=" + this.id + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeString(this.id);
            }
        }

        /* JADX INFO: renamed from: z70.f$c$b, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lz70/f$c$b;", "Lz70/f$c;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Session implements c {
            public static final Parcelable.Creator<Session> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: z70.f$c$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Session> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Session createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Session(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Session[] newArray(int i11) {
                    return new Session[i11];
                }
            }

            public Session(String id2) {
                s.k(id2, "id");
                this.id = id2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Session) && s.f(this.id, ((Session) other).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.id + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeString(this.id);
            }
        }
    }

    /* JADX INFO: renamed from: z70.f$d, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJT\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b$\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b\u001f\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lz70/f$d;", "Lz70/f;", "", "financialConnectionsSessionId", "intentId", "bankName", "last4", "Lx30/c;", "primaryButtonText", "mandateText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx30/c;Lx30/c;)V", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx30/c;Lx30/c;)Lz70/f$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", "h", DateTokenConverter.CONVERTER_KEY, "getIntentId", "g", "f", IntegerTokenConverter.CONVERTER_KEY, "Lx30/c;", "()Lx30/c;", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SavedAccount extends f {
        public static final Parcelable.Creator<SavedAccount> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String financialConnectionsSessionId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String intentId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bankName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String last4;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c primaryButtonText;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c mandateText;

        /* JADX INFO: renamed from: z70.f$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedAccount> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SavedAccount createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new SavedAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (x30.c) parcel.readParcelable(SavedAccount.class.getClassLoader()), (x30.c) parcel.readParcelable(SavedAccount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SavedAccount[] newArray(int i11) {
                return new SavedAccount[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SavedAccount(String str, String str2, String bankName, String str3, x30.c primaryButtonText, x30.c cVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            s.k(bankName, "bankName");
            s.k(primaryButtonText, "primaryButtonText");
            this.financialConnectionsSessionId = str;
            this.intentId = str2;
            this.bankName = bankName;
            this.last4 = str3;
            this.primaryButtonText = primaryButtonText;
            this.mandateText = cVar;
        }

        public static /* synthetic */ SavedAccount f(SavedAccount savedAccount, String str, String str2, String str3, String str4, x30.c cVar, x30.c cVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = savedAccount.financialConnectionsSessionId;
            }
            if ((i11 & 2) != 0) {
                str2 = savedAccount.intentId;
            }
            if ((i11 & 4) != 0) {
                str3 = savedAccount.bankName;
            }
            if ((i11 & 8) != 0) {
                str4 = savedAccount.last4;
            }
            if ((i11 & 16) != 0) {
                cVar = savedAccount.primaryButtonText;
            }
            if ((i11 & 32) != 0) {
                cVar2 = savedAccount.mandateText;
            }
            x30.c cVar3 = cVar;
            x30.c cVar4 = cVar2;
            return savedAccount.e(str, str2, str3, str4, cVar3, cVar4);
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: b, reason: from getter */
        public x30.c getMandateText() {
            return this.mandateText;
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: c, reason: from getter */
        public x30.c getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final SavedAccount e(String financialConnectionsSessionId, String intentId, String bankName, String last4, x30.c primaryButtonText, x30.c mandateText) {
            s.k(bankName, "bankName");
            s.k(primaryButtonText, "primaryButtonText");
            return new SavedAccount(financialConnectionsSessionId, intentId, bankName, last4, primaryButtonText, mandateText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedAccount)) {
                return false;
            }
            SavedAccount savedAccount = (SavedAccount) other;
            return s.f(this.financialConnectionsSessionId, savedAccount.financialConnectionsSessionId) && s.f(this.intentId, savedAccount.intentId) && s.f(this.bankName, savedAccount.bankName) && s.f(this.last4, savedAccount.last4) && s.f(this.primaryButtonText, savedAccount.primaryButtonText) && s.f(this.mandateText, savedAccount.mandateText);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public int hashCode() {
            String str = this.financialConnectionsSessionId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.intentId;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.bankName.hashCode()) * 31;
            String str3 = this.last4;
            int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.primaryButtonText.hashCode()) * 31;
            x30.c cVar = this.mandateText;
            return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        public String toString() {
            return "SavedAccount(financialConnectionsSessionId=" + this.financialConnectionsSessionId + ", intentId=" + this.intentId + ", bankName=" + this.bankName + ", last4=" + this.last4 + ", primaryButtonText=" + this.primaryButtonText + ", mandateText=" + this.mandateText + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.financialConnectionsSessionId);
            parcel.writeString(this.intentId);
            parcel.writeString(this.bankName);
            parcel.writeString(this.last4);
            parcel.writeParcelable(this.primaryButtonText, flags);
            parcel.writeParcelable(this.mandateText, flags);
        }
    }

    /* JADX INFO: renamed from: z70.f$e, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b&\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lz70/f$e;", "Lz70/f;", "Lcom/stripe/android/financialconnections/model/c;", "paymentAccount", "", "financialConnectionsSessionId", "intentId", "Lx30/c;", "primaryButtonText", "mandateText", "<init>", "(Lcom/stripe/android/financialconnections/model/c;Ljava/lang/String;Ljava/lang/String;Lx30/c;Lx30/c;)V", "e", "(Lcom/stripe/android/financialconnections/model/c;Ljava/lang/String;Ljava/lang/String;Lx30/c;Lx30/c;)Lz70/f$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lcom/stripe/android/financialconnections/model/c;", "h", "()Lcom/stripe/android/financialconnections/model/c;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "getIntentId", "f", "Lx30/c;", "()Lx30/c;", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VerifyWithMicrodeposits extends f {
        public static final Parcelable.Creator<VerifyWithMicrodeposits> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BankAccount paymentAccount;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String financialConnectionsSessionId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String intentId;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c primaryButtonText;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c mandateText;

        /* JADX INFO: renamed from: z70.f$e$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VerifyWithMicrodeposits> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VerifyWithMicrodeposits createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new VerifyWithMicrodeposits((BankAccount) parcel.readParcelable(VerifyWithMicrodeposits.class.getClassLoader()), parcel.readString(), parcel.readString(), (x30.c) parcel.readParcelable(VerifyWithMicrodeposits.class.getClassLoader()), (x30.c) parcel.readParcelable(VerifyWithMicrodeposits.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final VerifyWithMicrodeposits[] newArray(int i11) {
                return new VerifyWithMicrodeposits[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public VerifyWithMicrodeposits(BankAccount paymentAccount, String financialConnectionsSessionId, String str, x30.c primaryButtonText, x30.c cVar) {
            super(null, false, 3, 0 == true ? 1 : 0);
            s.k(paymentAccount, "paymentAccount");
            s.k(financialConnectionsSessionId, "financialConnectionsSessionId");
            s.k(primaryButtonText, "primaryButtonText");
            this.paymentAccount = paymentAccount;
            this.financialConnectionsSessionId = financialConnectionsSessionId;
            this.intentId = str;
            this.primaryButtonText = primaryButtonText;
            this.mandateText = cVar;
        }

        public static /* synthetic */ VerifyWithMicrodeposits f(VerifyWithMicrodeposits verifyWithMicrodeposits, BankAccount cVar, String str, String str2, x30.c cVar2, x30.c cVar3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = verifyWithMicrodeposits.paymentAccount;
            }
            if ((i11 & 2) != 0) {
                str = verifyWithMicrodeposits.financialConnectionsSessionId;
            }
            if ((i11 & 4) != 0) {
                str2 = verifyWithMicrodeposits.intentId;
            }
            if ((i11 & 8) != 0) {
                cVar2 = verifyWithMicrodeposits.primaryButtonText;
            }
            if ((i11 & 16) != 0) {
                cVar3 = verifyWithMicrodeposits.mandateText;
            }
            x30.c cVar4 = cVar3;
            String str3 = str2;
            return verifyWithMicrodeposits.e(cVar, str, str3, cVar2, cVar4);
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: b, reason: from getter */
        public x30.c getMandateText() {
            return this.mandateText;
        }

        @Override // p027z70.f
        /* JADX INFO: renamed from: c, reason: from getter */
        public x30.c getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final VerifyWithMicrodeposits e(BankAccount paymentAccount, String financialConnectionsSessionId, String intentId, x30.c primaryButtonText, x30.c mandateText) {
            s.k(paymentAccount, "paymentAccount");
            s.k(financialConnectionsSessionId, "financialConnectionsSessionId");
            s.k(primaryButtonText, "primaryButtonText");
            return new VerifyWithMicrodeposits(paymentAccount, financialConnectionsSessionId, intentId, primaryButtonText, mandateText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerifyWithMicrodeposits)) {
                return false;
            }
            VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) other;
            return s.f(this.paymentAccount, verifyWithMicrodeposits.paymentAccount) && s.f(this.financialConnectionsSessionId, verifyWithMicrodeposits.financialConnectionsSessionId) && s.f(this.intentId, verifyWithMicrodeposits.intentId) && s.f(this.primaryButtonText, verifyWithMicrodeposits.primaryButtonText) && s.f(this.mandateText, verifyWithMicrodeposits.mandateText);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final BankAccount getPaymentAccount() {
            return this.paymentAccount;
        }

        public int hashCode() {
            int iHashCode = ((this.paymentAccount.hashCode() * 31) + this.financialConnectionsSessionId.hashCode()) * 31;
            String str = this.intentId;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.primaryButtonText.hashCode()) * 31;
            x30.c cVar = this.mandateText;
            return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "VerifyWithMicrodeposits(paymentAccount=" + this.paymentAccount + ", financialConnectionsSessionId=" + this.financialConnectionsSessionId + ", intentId=" + this.intentId + ", primaryButtonText=" + this.primaryButtonText + ", mandateText=" + this.mandateText + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.paymentAccount, flags);
            parcel.writeString(this.financialConnectionsSessionId);
            parcel.writeString(this.intentId);
            parcel.writeParcelable(this.primaryButtonText, flags);
            parcel.writeParcelable(this.mandateText, flags);
        }
    }

    public /* synthetic */ f(x30.c cVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, z11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public x30.c getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b */
    public abstract x30.c getMandateText();

    /* JADX INFO: renamed from: c */
    public abstract x30.c getPrimaryButtonText();

    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getIsProcessing() {
        return this.isProcessing;
    }

    private f(x30.c cVar, boolean z11) {
        this.error = cVar;
        this.isProcessing = z11;
    }

    public /* synthetic */ f(x30.c cVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? false : z11, null);
    }
}
