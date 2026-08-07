package ig0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001\u0019BW\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\u001f\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006*"}, d2 = {"Lig0/u;", "Lmi0/b;", "", "Loi0/n5;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "", "selectDocumentButton", "selectPhotoButton", "takePhotoButton", "launchUploadOptionsButton", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "b", "t0", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "e", "f", "g", "h", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u implements mi0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<n5> components;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<UiComponentConfig> componentConfigs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StepStyles.UiStepStyle styles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String selectDocumentButton;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String selectPhotoButton;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String takePhotoButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String launchUploadOptionsButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<u> CREATOR = new b();

    /* JADX INFO: renamed from: ig0.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lig0/u$a;", "", "<init>", "()V", "", "titleText", "bodyText", "selectDocumentButtonText", "takePhotoButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lig0/u;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)Lig0/u;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a(String titleText, String bodyText, String selectDocumentButtonText, String takePhotoButtonText, StepStyles.DocumentStepStyle styles) {
            ButtonCancelComponentStyle buttonSecondaryStyleValue;
            ButtonSubmitComponentStyle buttonPrimaryStyleValue;
            StepStyles.DocumentStepFillColor fillColor;
            StepStyles.DocumentStepStrokeColor strokeColor;
            Double dValueOf = Double.valueOf(0.0d);
            Double dValueOf2 = Double.valueOf(24.0d);
            List listP = p013kotlin.collections.v.p(new Title("title", new Title.Attributes(titleText == null ? "" : titleText, null, null, 6, null), styles != null ? styles.getTitleStyleValue() : null), new Text("body", new Text.Attributes(bodyText == null ? "" : bodyText, null, null, 6, null), styles != null ? styles.getTextStyleValue() : null), new LocalImage("hero_image", new LocalImage.Attributes(LocalImage.Image.DOCUMENT_START_HERO, null), new LocalImageComponentStyle(new AttributeStyles.LocalImageStrokeColorStyle((styles == null || (strokeColor = styles.getStrokeColor()) == null) ? null : strokeColor.getBase()), new AttributeStyles.LocalImageFillColorStyle((styles == null || (fillColor = styles.getFillColor()) == null) ? null : fillColor.getBase(), null), null, null, null, new AttributeStyles.LocalImageMarginStyle(new StyleElements.MeasurementSet(new StyleElements.SizeSet(new StyleElements.DPSize(dValueOf2), new StyleElements.DPSize(dValueOf2), new StyleElements.DPSize(dValueOf), new StyleElements.DPSize(dValueOf)))), 28, null)), new CombinedStepButton("camera_button", new BasicButtonAttributes(takePhotoButtonText == null ? "" : takePhotoButtonText, Button.ButtonType.PRIMARY, null, null, null, null, 60, null), (styles == null || (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) == null) ? null : ig0.b.b(buttonPrimaryStyleValue)), new CombinedStepButton("upload_button", new BasicButtonAttributes(selectDocumentButtonText == null ? "" : selectDocumentButtonText, Button.ButtonType.SECONDARY, null, null, null, null, 60, null), (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) ? null : ig0.b.a(buttonSecondaryStyleValue)));
            return new u(com.withpersona.sdk2.inquiry.steps.ui.components.g.h(listP), listP, new StepStyles.UiStepStyle(styles != null ? styles.getHeaderButtonColor() : null, styles != null ? styles.getBackgroundColor() : null, styles != null ? styles.getBackgroundImage() : null, null, null, null, null, null, null, null, null, null), "upload_button", null, "camera_button", null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(u.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList3.add(parcel.readParcelable(u.class.getClassLoader()));
            }
            return new u(arrayList, arrayList3, (StepStyles.UiStepStyle) parcel.readParcelable(u.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i11) {
            return new u[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(List<? extends n5> list, List<? extends UiComponentConfig> componentConfigs, StepStyles.UiStepStyle uiStepStyle, String str, String str2, String str3, String str4) {
        p013kotlin.jvm.internal.s.k(componentConfigs, "componentConfigs");
        this.components = list;
        this.componentConfigs = componentConfigs;
        this.styles = uiStepStyle;
        this.selectDocumentButton = str;
        this.selectPhotoButton = str2;
        this.takePhotoButton = str3;
        this.launchUploadOptionsButton = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLaunchUploadOptionsButton() {
        return this.launchUploadOptionsButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSelectDocumentButton() {
        return this.selectDocumentButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSelectPhotoButton() {
        return this.selectPhotoButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTakePhotoButton() {
        return this.takePhotoButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // mi0.b
    public List<n5> getComponents() {
        return this.components;
    }

    @Override // mi0.b
    public StepStyles.UiStepStyle getStyles() {
        return this.styles;
    }

    @Override // mi0.b
    public List<UiComponentConfig> t0() {
        return this.componentConfigs;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
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
        dest.writeString(this.selectDocumentButton);
        dest.writeString(this.selectPhotoButton);
        dest.writeString(this.takePhotoButton);
        dest.writeString(this.launchUploadOptionsButton);
    }
}
