package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: pg0.b0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lpg0/b0;", "Landroid/os/Parcelable;", "Lpg0/h4;", "icon", "Lpg0/d4;", "idConfig", "", "name", "<init>", "(Lpg0/h4;Lpg0/d4;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpg0/h4;", "()Lpg0/h4;", "b", "Lpg0/d4;", "()Lpg0/d4;", "c", "Ljava/lang/String;", "getName", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnabledIdClass implements Parcelable {
    public static final Parcelable.Creator<EnabledIdClass> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h4 icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdConfig idConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: pg0.b0$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EnabledIdClass> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnabledIdClass createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new EnabledIdClass(h4.valueOf(parcel.readString()), IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnabledIdClass[] newArray(int i11) {
            return new EnabledIdClass[i11];
        }
    }

    public EnabledIdClass(h4 icon, IdConfig idConfig, String name) {
        p013kotlin.jvm.internal.s.k(icon, "icon");
        p013kotlin.jvm.internal.s.k(idConfig, "idConfig");
        p013kotlin.jvm.internal.s.k(name, "name");
        this.icon = icon;
        this.idConfig = idConfig;
        this.name = name;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h4 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final IdConfig getIdConfig() {
        return this.idConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnabledIdClass)) {
            return false;
        }
        EnabledIdClass enabledIdClass = (EnabledIdClass) other;
        return this.icon == enabledIdClass.icon && p013kotlin.jvm.internal.s.f(this.idConfig, enabledIdClass.idConfig) && p013kotlin.jvm.internal.s.f(this.name, enabledIdClass.name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.idConfig.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "EnabledIdClass(icon=" + this.icon + ", idConfig=" + this.idConfig + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.icon.name());
        this.idConfig.writeToParcel(dest, flags);
        dest.writeString(this.name);
    }
}
