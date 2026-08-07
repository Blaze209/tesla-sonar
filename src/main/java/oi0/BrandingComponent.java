package oi0;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: oi0.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Loi0/e;", "Loi0/n5;", "", "name", "", "showBranding", "<init>", "(Ljava/lang/String;Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Z", "()Z", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BrandingComponent implements n5 {
    public static final Parcelable.Creator<BrandingComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showBranding;

    /* JADX INFO: renamed from: oi0.e$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandingComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BrandingComponent createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new BrandingComponent(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BrandingComponent[] newArray(int i11) {
            return new BrandingComponent[i11];
        }
    }

    public BrandingComponent(String name, boolean z11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.name = name;
        this.showBranding = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShowBranding() {
        return this.showBranding;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandingComponent)) {
            return false;
        }
        BrandingComponent brandingComponent = (BrandingComponent) other;
        return p013kotlin.jvm.internal.s.f(this.name, brandingComponent.name) && this.showBranding == brandingComponent.showBranding;
    }

    @Override // oi0.n5
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.showBranding);
    }

    public String toString() {
        return "BrandingComponent(name=" + this.name + ", showBranding=" + this.showBranding + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeInt(this.showBranding ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BrandingComponent(Branding config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        String name = config.getName();
        Branding.Attributes attributes = config.getAttributes();
        this(name, !(attributes != null ? p013kotlin.jvm.internal.s.f(attributes.getHideLogo(), Boolean.TRUE) : false));
    }
}
