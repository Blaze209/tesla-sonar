package r40;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import i50.SharedPartnerAuthState;
import m40.p;
import n40.p0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import s50.i;
import wn0.l;
import z50.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lr40/b;", "Ls50/i;", "Li50/e;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "<init>", "(Li50/e;Ln40/p0;)V", "state", "Lq50/c;", "p", "(Li50/e;)Lq50/c;", "v", "a", "b", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends i<SharedPartnerAuthState> {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final FinancialConnectionsSessionManifest.Pane f106976w = FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR;

    /* JADX INFO: renamed from: r40.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lr40/b$a;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new C2271a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsSessionManifest.Pane pane;

        /* JADX INFO: renamed from: r40.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C2271a implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Args(FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(FinancialConnectionsSessionManifest.Pane pane) {
            s.k(pane, "pane");
            this.pane = pane;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FinancialConnectionsSessionManifest.Pane getPane() {
            return this.pane;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.pane == ((Args) other).pane;
        }

        public int hashCode() {
            return this.pane.hashCode();
        }

        public String toString() {
            return "Args(pane=" + this.pane + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.pane.name());
        }
    }

    /* JADX INFO: renamed from: r40.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lr40/b$b;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: r40.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lr40/b;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lr40/b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<CreationExtras, b> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f106978c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar) {
                super(1);
                this.f106978c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f106978c.q().a(new SharedPartnerAuthState(new Args(b.INSTANCE.b())));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(p parentComponent) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(b.class), new a(parentComponent));
            return bVar.b();
        }

        public final FinancialConnectionsSessionManifest.Pane b() {
            return b.f106976w;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr40/b$c;", "", "Li50/e;", "initialState", "Lr40/b;", "a", "(Li50/e;)Lr40/b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        b a(SharedPartnerAuthState initialState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SharedPartnerAuthState initialState, p0 nativeAuthFlowCoordinator) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
    }

    @Override // s50.i
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(SharedPartnerAuthState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR, state.d(), n.a(state.f()), null, false, 24, null);
    }
}
