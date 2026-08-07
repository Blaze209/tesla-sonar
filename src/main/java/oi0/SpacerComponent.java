package oi0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: oi0.a5, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b)\u0010\u0016R&\u00102\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Loi0/a5;", "Loi0/n5;", "Loi0/e0;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "", Snapshot.HEIGHT, Snapshot.WIDTH, "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;II)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "c", "I", DateTokenConverter.CONVERTER_KEY, "getWidth", "", "Lxi0/a;", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpacerComponent implements n5, e0 {
    public static final Parcelable.Creator<SpacerComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int height;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int width;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: oi0.a5$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpacerComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpacerComponent createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new SpacerComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(SpacerComponent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SpacerComponent[] newArray(int i11) {
            return new SpacerComponent[i11];
        }
    }

    public SpacerComponent(String name, JsonLogicBoolean jsonLogicBoolean, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.height = i11;
        this.width = i12;
        this.associatedViews = new ArrayList();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpacerComponent)) {
            return false;
        }
        SpacerComponent spacerComponent = (SpacerComponent) other;
        return p013kotlin.jvm.internal.s.f(this.name, spacerComponent.name) && p013kotlin.jvm.internal.s.f(this.hidden, spacerComponent.hidden) && this.height == spacerComponent.height && this.width == spacerComponent.width;
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
        return ((((iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "SpacerComponent(name=" + this.name + ", hidden=" + this.hidden + ", height=" + this.height + ", width=" + this.width + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeInt(this.height);
        dest.writeInt(this.width);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpacerComponent(Spacer config) {
        int iIntValue;
        String height;
        String strW0;
        Integer numX;
        AttributeStyles.SpacerWidthStyle width;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        Double dp2;
        AttributeStyles.SpacerHeightStyle height2;
        StyleElements.Measurement base3;
        StyleElements.Size base4;
        Double dp3;
        p013kotlin.jvm.internal.s.k(config, "config");
        String name = config.getName();
        Spacer.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        Spacer.SpacerComponentStyle styles = config.getStyles();
        if (styles == null || (height2 = styles.getHeight()) == null || (base3 = height2.getBase()) == null || (base4 = base3.getBase()) == null || (dp3 = base4.getDp()) == null) {
            Spacer.Attributes attributes2 = config.getAttributes();
            iIntValue = (attributes2 == null || (height = attributes2.getHeight()) == null || (strW0 = p013kotlin.text.t.W0(height, "px")) == null || (numX = p013kotlin.text.t.x(strW0)) == null) ? 1 : numX.intValue();
        } else {
            iIntValue = (int) yh0.h.a(dp3.doubleValue());
        }
        Spacer.SpacerComponentStyle styles2 = config.getStyles();
        this(name, hidden, iIntValue, (styles2 == null || (width = styles2.getWidth()) == null || (base = width.getBase()) == null || (base2 = base.getBase()) == null || (dp2 = base2.getDp()) == null) ? 0 : (int) yh0.h.a(dp2.doubleValue()));
    }
}
