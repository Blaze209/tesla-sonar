package w60;

import android.os.Parcel;
import android.os.Parcelable;
import c60.LinkConfiguration;
import m60.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: w60.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lw60/b;", "Landroid/os/Parcelable;", "Lm60/k;", "signupMode", "Lc60/c;", "linkConfiguration", "<init>", "(Lm60/k;Lc60/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lm60/k;", "b", "()Lm60/k;", "Lc60/c;", "()Lc60/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkInlineConfiguration implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final k signupMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LinkConfiguration linkConfiguration;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f121088c = LinkConfiguration.f18792i;
    public static final Parcelable.Creator<LinkInlineConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: w60.b$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LinkInlineConfiguration> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkInlineConfiguration createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkInlineConfiguration(k.valueOf(parcel.readString()), (LinkConfiguration) parcel.readParcelable(LinkInlineConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinkInlineConfiguration[] newArray(int i11) {
            return new LinkInlineConfiguration[i11];
        }
    }

    public LinkInlineConfiguration(k signupMode, LinkConfiguration linkConfiguration) {
        s.k(signupMode, "signupMode");
        s.k(linkConfiguration, "linkConfiguration");
        this.signupMode = signupMode;
        this.linkConfiguration = linkConfiguration;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LinkConfiguration getLinkConfiguration() {
        return this.linkConfiguration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getSignupMode() {
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
        if (!(other instanceof LinkInlineConfiguration)) {
            return false;
        }
        LinkInlineConfiguration linkInlineConfiguration = (LinkInlineConfiguration) other;
        return this.signupMode == linkInlineConfiguration.signupMode && s.f(this.linkConfiguration, linkInlineConfiguration.linkConfiguration);
    }

    public int hashCode() {
        return (this.signupMode.hashCode() * 31) + this.linkConfiguration.hashCode();
    }

    public String toString() {
        return "LinkInlineConfiguration(signupMode=" + this.signupMode + ", linkConfiguration=" + this.linkConfiguration + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.signupMode.name());
        parcel.writeParcelable(this.linkConfiguration, flags);
    }
}
