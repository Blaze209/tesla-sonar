package g80;

import android.os.Parcel;
import android.os.Parcelable;
import c60.LinkConfiguration;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: g80.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"Lg80/g;", "Landroid/os/Parcelable;", "Lc60/c;", "configuration", "Lg80/g$b;", "loginState", "Lm60/k;", "signupMode", "<init>", "(Lc60/c;Lg80/g$b;Lm60/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lc60/c;", "()Lc60/c;", "b", "Lg80/g$b;", "getLoginState", "()Lg80/g$b;", "c", "Lm60/k;", "()Lm60/k;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkState implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LinkConfiguration configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b loginState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final m60.k signupMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67608d = LinkConfiguration.f18792i;
    public static final Parcelable.Creator<LinkState> CREATOR = new a();

    /* JADX INFO: renamed from: g80.g$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LinkState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkState createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkState((LinkConfiguration) parcel.readParcelable(LinkState.class.getClassLoader()), b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : m60.k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinkState[] newArray(int i11) {
            return new LinkState[i11];
        }
    }

    /* JADX INFO: renamed from: g80.g$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lg80/g$b;", "", "<init>", "(Ljava/lang/String;I)V", "LoggedIn", "NeedsVerification", "LoggedOut", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        LoggedIn,
        NeedsVerification,
        LoggedOut;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    public LinkState(LinkConfiguration configuration, b loginState, m60.k kVar) {
        s.k(configuration, "configuration");
        s.k(loginState, "loginState");
        this.configuration = configuration;
        this.loginState = loginState;
        this.signupMode = kVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LinkConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m60.k getSignupMode() {
        return this.signupMode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkState)) {
            return false;
        }
        LinkState linkState = (LinkState) other;
        return s.f(this.configuration, linkState.configuration) && this.loginState == linkState.loginState && this.signupMode == linkState.signupMode;
    }

    public int hashCode() {
        int iHashCode = ((this.configuration.hashCode() * 31) + this.loginState.hashCode()) * 31;
        m60.k kVar = this.signupMode;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public String toString() {
        return "LinkState(configuration=" + this.configuration + ", loginState=" + this.loginState + ", signupMode=" + this.signupMode + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.configuration, flags);
        parcel.writeString(this.loginState.name());
        m60.k kVar = this.signupMode;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kVar.name());
        }
    }
}
