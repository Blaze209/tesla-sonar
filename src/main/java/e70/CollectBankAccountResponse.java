package e70;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import t30.f;

/* JADX INFO: renamed from: e70.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Le70/a;", "Lt30/f;", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "financialConnectionsSession", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/StripeIntent;", "()Lcom/stripe/android/model/StripeIntent;", "b", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "getFinancialConnectionsSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CollectBankAccountResponse implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent intent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSession financialConnectionsSession;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f62212c = FinancialConnectionsSession.f50308l;
    public static final Parcelable.Creator<CollectBankAccountResponse> CREATOR = new C1278a();

    /* JADX INFO: renamed from: e70.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C1278a implements Parcelable.Creator<CollectBankAccountResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectBankAccountResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new CollectBankAccountResponse((StripeIntent) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()), (FinancialConnectionsSession) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CollectBankAccountResponse[] newArray(int i11) {
            return new CollectBankAccountResponse[i11];
        }
    }

    public CollectBankAccountResponse(StripeIntent intent, FinancialConnectionsSession financialConnectionsSession) {
        s.k(intent, "intent");
        s.k(financialConnectionsSession, "financialConnectionsSession");
        this.intent = intent;
        this.financialConnectionsSession = financialConnectionsSession;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final StripeIntent getIntent() {
        return this.intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectBankAccountResponse)) {
            return false;
        }
        CollectBankAccountResponse collectBankAccountResponse = (CollectBankAccountResponse) other;
        return s.f(this.intent, collectBankAccountResponse.intent) && s.f(this.financialConnectionsSession, collectBankAccountResponse.financialConnectionsSession);
    }

    public int hashCode() {
        return (this.intent.hashCode() * 31) + this.financialConnectionsSession.hashCode();
    }

    public String toString() {
        return "CollectBankAccountResponse(intent=" + this.intent + ", financialConnectionsSession=" + this.financialConnectionsSession + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.intent, flags);
        parcel.writeParcelable(this.financialConnectionsSession, flags);
    }
}
