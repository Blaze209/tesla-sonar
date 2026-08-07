package l50;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: l50.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Ll50/e;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lcom/stripe/android/financialconnections/model/k0;", "initialSyncResponse", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "<init>", "(Lcom/stripe/android/financialconnections/a$b;Lcom/stripe/android/financialconnections/model/k0;Lcom/stripe/android/financialconnections/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/a$b;", "()Lcom/stripe/android/financialconnections/a$b;", "b", "Lcom/stripe/android/financialconnections/model/k0;", "c", "()Lcom/stripe/android/financialconnections/model/k0;", "Lcom/stripe/android/financialconnections/a$c;", "()Lcom/stripe/android/financialconnections/a$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FinancialConnectionsSheetNativeActivityArgs implements Parcelable {
    public static final Parcelable.Creator<FinancialConnectionsSheetNativeActivityArgs> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SynchronizeSessionResponse initialSyncResponse;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext;

    /* JADX INFO: renamed from: l50.e$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FinancialConnectionsSheetNativeActivityArgs> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeActivityArgs createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new FinancialConnectionsSheetNativeActivityArgs(com.stripe.android.financialconnections.a.Configuration.CREATOR.createFromParcel(parcel), SynchronizeSessionResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.stripe.android.financialconnections.a.ElementsSessionContext.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeActivityArgs[] newArray(int i11) {
            return new FinancialConnectionsSheetNativeActivityArgs[i11];
        }
    }

    public FinancialConnectionsSheetNativeActivityArgs(com.stripe.android.financialconnections.a.Configuration configuration, SynchronizeSessionResponse initialSyncResponse, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        s.k(configuration, "configuration");
        s.k(initialSyncResponse, "initialSyncResponse");
        this.configuration = configuration;
        this.initialSyncResponse = initialSyncResponse;
        this.elementsSessionContext = elementsSessionContext;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.stripe.android.financialconnections.a.Configuration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.stripe.android.financialconnections.a.ElementsSessionContext getElementsSessionContext() {
        return this.elementsSessionContext;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SynchronizeSessionResponse getInitialSyncResponse() {
        return this.initialSyncResponse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSheetNativeActivityArgs)) {
            return false;
        }
        FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs = (FinancialConnectionsSheetNativeActivityArgs) other;
        return s.f(this.configuration, financialConnectionsSheetNativeActivityArgs.configuration) && s.f(this.initialSyncResponse, financialConnectionsSheetNativeActivityArgs.initialSyncResponse) && s.f(this.elementsSessionContext, financialConnectionsSheetNativeActivityArgs.elementsSessionContext);
    }

    public int hashCode() {
        int iHashCode = ((this.configuration.hashCode() * 31) + this.initialSyncResponse.hashCode()) * 31;
        com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
        return iHashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
    }

    public String toString() {
        return "FinancialConnectionsSheetNativeActivityArgs(configuration=" + this.configuration + ", initialSyncResponse=" + this.initialSyncResponse + ", elementsSessionContext=" + this.elementsSessionContext + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        this.configuration.writeToParcel(parcel, flags);
        this.initialSyncResponse.writeToParcel(parcel, flags);
        com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
        if (elementsSessionContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            elementsSessionContext.writeToParcel(parcel, flags);
        }
    }
}
