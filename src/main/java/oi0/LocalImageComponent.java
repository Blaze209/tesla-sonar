package oi0;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: oi0.k2, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010,\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Loi0/k2;", "Loi0/n5;", "Loi0/e0;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "", "Lxi0/a;", "c", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocalImageComponent implements n5, e0 {
    public static final Parcelable.Creator<LocalImageComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: oi0.k2$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocalImageComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocalImageComponent createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new LocalImageComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(LocalImageComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LocalImageComponent[] newArray(int i11) {
            return new LocalImageComponent[i11];
        }
    }

    public LocalImageComponent(String name, JsonLogicBoolean jsonLogicBoolean) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.associatedViews = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalImageComponent)) {
            return false;
        }
        LocalImageComponent localImageComponent = (LocalImageComponent) other;
        return p013kotlin.jvm.internal.s.f(this.name, localImageComponent.name) && p013kotlin.jvm.internal.s.f(this.hidden, localImageComponent.hidden);
    }

    @Override // oi0.e0
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // oi0.n5
    public String getName() {
        return this.name;
    }

    @Override // oi0.e0
    public List<xi0.a> h() {
        return this.associatedViews;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        return iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode());
    }

    public String toString() {
        return "LocalImageComponent(name=" + this.name + ", hidden=" + this.hidden + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalImageComponent(LocalImage config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        String name = config.getName();
        LocalImage.Attributes attributes = config.getAttributes();
        this(name, attributes != null ? attributes.getHidden() : null);
    }
}
