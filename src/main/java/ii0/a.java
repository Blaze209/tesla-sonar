package ii0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lii0/a;", "Landroid/os/Parcelable;", "", "showBackButton", "showCancelButton", "showNavBar", "handleBackPress", "isNavigationEnabled", "<init>", "(ZZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Z", "b", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "e", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1655a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean showBackButton;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean showCancelButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean showNavBar;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean handleBackPress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isNavigationEnabled;

    /* JADX INFO: renamed from: ii0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C1655a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            return new a(z11, z12, z12, z12, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.showBackButton = z11;
        this.showCancelButton = z12;
        this.showNavBar = z13;
        this.handleBackPress = z14;
        this.isNavigationEnabled = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHandleBackPress() {
        return this.handleBackPress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowNavBar() {
        return this.showNavBar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsNavigationEnabled() {
        return this.isNavigationEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeInt(this.showBackButton ? 1 : 0);
        dest.writeInt(this.showCancelButton ? 1 : 0);
        dest.writeInt(this.showNavBar ? 1 : 0);
        dest.writeInt(this.handleBackPress ? 1 : 0);
        dest.writeInt(this.isNavigationEnabled ? 1 : 0);
    }
}
