package mi0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: mi0.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0013\u0010.\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0013\u00104\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lmi0/g;", "Landroid/os/Parcelable;", "", "Loi0/n5;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", "a", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)Lmi0/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "t0", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "backgroundColor", "e", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UiComponentScreen implements Parcelable {
    public static final Parcelable.Creator<UiComponentScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<n5> components;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<UiComponentConfig> componentConfigs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final StepStyles.UiStepStyle styles;

    /* JADX INFO: renamed from: mi0.g$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UiComponentScreen> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiComponentScreen createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.k(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList3.add(parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
            }
            return new UiComponentScreen(arrayList, arrayList3, (StepStyles.UiStepStyle) parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UiComponentScreen[] newArray(int i11) {
            return new UiComponentScreen[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiComponentScreen(List<? extends n5> list, List<? extends UiComponentConfig> componentConfigs, StepStyles.UiStepStyle uiStepStyle) {
        s.k(componentConfigs, "componentConfigs");
        this.components = list;
        this.componentConfigs = componentConfigs;
        this.styles = uiStepStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiComponentScreen c(UiComponentScreen uiComponentScreen, List list, List list2, StepStyles.UiStepStyle uiStepStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uiComponentScreen.components;
        }
        if ((i11 & 2) != 0) {
            list2 = uiComponentScreen.componentConfigs;
        }
        if ((i11 & 4) != 0) {
            uiStepStyle = uiComponentScreen.styles;
        }
        return uiComponentScreen.b(list, list2, uiStepStyle);
    }

    public final Drawable a(Context context) {
        s.k(context, "context");
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle != null) {
            return wi0.c.a(uiStepStyle, context);
        }
        return null;
    }

    public final UiComponentScreen b(List<? extends n5> components, List<? extends UiComponentConfig> componentConfigs, StepStyles.UiStepStyle styles) {
        s.k(componentConfigs, "componentConfigs");
        return new UiComponentScreen(components, componentConfigs, styles);
    }

    public final Integer d() {
        StepStyles.StepBackgroundColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle == null || (backgroundColor = uiStepStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        StyleElements.SimpleElementColor headerButton;
        StyleElements.SimpleElementColorValue base;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiComponentScreen)) {
            return false;
        }
        UiComponentScreen uiComponentScreen = (UiComponentScreen) other;
        return s.f(this.components, uiComponentScreen.components) && s.f(this.componentConfigs, uiComponentScreen.componentConfigs) && s.f(this.styles, uiComponentScreen.styles);
    }

    public final StyleElements.PositionType f() {
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle != null) {
            return uiStepStyle.getPageLevelVerticalAlignment();
        }
        return null;
    }

    public final List<n5> getComponents() {
        return this.components;
    }

    public final StepStyles.UiStepStyle getStyles() {
        return this.styles;
    }

    public int hashCode() {
        List<n5> list = this.components;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.componentConfigs.hashCode()) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        return iHashCode + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    public final List<UiComponentConfig> t0() {
        return this.componentConfigs;
    }

    public String toString() {
        return "UiComponentScreen(components=" + this.components + ", componentConfigs=" + this.componentConfigs + ", styles=" + this.styles + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        List<n5> list = this.components;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<n5> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        List<UiComponentConfig> list2 = this.componentConfigs;
        dest.writeInt(list2.size());
        Iterator<UiComponentConfig> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeParcelable(this.styles, flags);
    }
}
