package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oi0.Option;
import oi0.c2;
import oi0.d4;
import oi0.e0;
import oi0.n5;
import oi0.v;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pi0.l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 O2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001*B]\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJv\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u00105\u001a\u0004\b8\u00107R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b;\u0010#R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u00103R&\u0010C\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b@\u00102\u0012\u0004\bA\u0010B\u001a\u0004\b<\u00103R \u0010G\u001a\u00020'8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u0015\u0010D\u0012\u0004\bF\u0010B\u001a\u0004\b*\u0010ER(\u0010N\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bM\u0010B\u001a\u0004\b4\u0010K\"\u0004\b@\u0010L¨\u0006P"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;", "Loi0/n5;", "Loi0/d4;", "Loi0/c2;", "Loi0/v;", "Loi0/e0;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "Loi0/e4;", "selectedOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", AnnotatedPrivateKey.LABEL, "placeholder", "options", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "c", "Ljava/util/List;", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "f", "getLabel", "getPlaceholder", "h", "getOptions", "", "Lxi0/a;", IntegerTokenConverter.CONVERTER_KEY, "getAssociatedViews$annotations", "()V", "associatedViews", "Z", "()Z", "getCanSelectMultipleValues$annotations", "canSelectMultipleValues", "Lpi0/l;", "k", "Lpi0/l;", "()Lpi0/l;", "(Lpi0/l;)V", "getSelectedOptionsController$annotations", "selectedOptionsController", "l", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputMultiSelectComponent implements n5, d4<InputMultiSelectComponent>, c2, v, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputSelectComponentStyle styles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Option> selectedOptions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeholder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Option> options;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean canSelectMultipleValues;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private l selectedOptionsController;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InputMultiSelectComponent> CREATOR = new b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/d$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InputMultiSelectComponent a(InputMultiSelect config) {
            Set setD;
            List listM;
            List listM2;
            List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options;
            List<String> prefill;
            s.k(config, "config");
            InputMultiSelect.Attributes attributes = config.getAttributes();
            List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options2 = attributes != null ? attributes.getOptions() : null;
            InputMultiSelect.Attributes attributes2 = config.getAttributes();
            if (attributes2 == null || (prefill = attributes2.getPrefill()) == null || (setD = p013kotlin.collections.v.r1(prefill)) == null) {
                setD = d1.d();
            }
            if (options2 != null) {
                ArrayList<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> arrayList = new ArrayList();
                for (Object obj : options2) {
                    if (setD.contains(((com.withpersona.sdk2.inquiry.network.dto.ui.components.Option) obj).getValue())) {
                        arrayList.add(obj);
                    }
                }
                listM = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
                for (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option : arrayList) {
                    listM.add(new Option(option.getText(), option.getValue()));
                }
            } else {
                listM = p013kotlin.collections.v.m();
            }
            List list = listM;
            String name = config.getName();
            InputSelectComponentStyle styles = config.getStyles();
            InputMultiSelect.Attributes attributes3 = config.getAttributes();
            JsonLogicBoolean hidden = attributes3 != null ? attributes3.getHidden() : null;
            InputMultiSelect.Attributes attributes4 = config.getAttributes();
            JsonLogicBoolean disabled = attributes4 != null ? attributes4.getDisabled() : null;
            InputMultiSelect.Attributes attributes5 = config.getAttributes();
            String label = attributes5 != null ? attributes5.getLabel() : null;
            InputMultiSelect.Attributes attributes6 = config.getAttributes();
            String placeholder = attributes6 != null ? attributes6.getPlaceholder() : null;
            InputMultiSelect.Attributes attributes7 = config.getAttributes();
            if (attributes7 == null || (options = attributes7.getOptions()) == null) {
                listM2 = p013kotlin.collections.v.m();
            } else {
                List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> list2 = options;
                listM2 = new ArrayList(p013kotlin.collections.v.y(list2, 10));
                for (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option2 : list2) {
                    listM2.add(new Option(option2.getText(), option2.getValue()));
                }
            }
            return new InputMultiSelectComponent(name, styles, list, hidden, disabled, label, placeholder, listM2);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.d$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InputMultiSelectComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMultiSelectComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            InputSelectComponentStyle inputSelectComponentStyle = (InputSelectComponentStyle) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Option.CREATOR.createFromParcel(parcel));
            }
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(Option.CREATOR.createFromParcel(parcel));
            }
            return new InputMultiSelectComponent(string, inputSelectComponentStyle, arrayList, jsonLogicBoolean, jsonLogicBoolean2, string2, string3, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputMultiSelectComponent[] newArray(int i11) {
            return new InputMultiSelectComponent[i11];
        }
    }

    public InputMultiSelectComponent(String name, InputSelectComponentStyle inputSelectComponentStyle, List<Option> selectedOptions, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, String str2, List<Option> options) {
        s.k(name, "name");
        s.k(selectedOptions, "selectedOptions");
        s.k(options, "options");
        this.name = name;
        this.styles = inputSelectComponentStyle;
        this.selectedOptions = selectedOptions;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.label = str;
        this.placeholder = str2;
        this.options = options;
        this.associatedViews = new ArrayList();
        this.canSelectMultipleValues = true;
        this.selectedOptionsController = new l(c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputMultiSelectComponent f(InputMultiSelectComponent inputMultiSelectComponent, String str, InputSelectComponentStyle inputSelectComponentStyle, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputMultiSelectComponent.name;
        }
        if ((i11 & 2) != 0) {
            inputSelectComponentStyle = inputMultiSelectComponent.styles;
        }
        if ((i11 & 4) != 0) {
            list = inputMultiSelectComponent.selectedOptions;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean = inputMultiSelectComponent.hidden;
        }
        if ((i11 & 16) != 0) {
            jsonLogicBoolean2 = inputMultiSelectComponent.disabled;
        }
        if ((i11 & 32) != 0) {
            str2 = inputMultiSelectComponent.label;
        }
        if ((i11 & 64) != 0) {
            str3 = inputMultiSelectComponent.placeholder;
        }
        if ((i11 & 128) != 0) {
            list2 = inputMultiSelectComponent.options;
        }
        String str4 = str3;
        List list3 = list2;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        String str5 = str2;
        return inputMultiSelectComponent.e(str, inputSelectComponentStyle, list, jsonLogicBoolean, jsonLogicBoolean3, str5, str4, list3);
    }

    @Override // oi0.c2
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getCanSelectMultipleValues() {
        return this.canSelectMultipleValues;
    }

    @Override // oi0.c2
    public List<Option> c() {
        return this.selectedOptions;
    }

    @Override // oi0.d4
    /* JADX INFO: renamed from: d, reason: from getter */
    public l getSelectedOptionsController() {
        return this.selectedOptionsController;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final InputMultiSelectComponent e(String name, InputSelectComponentStyle styles, List<Option> selectedOptions, JsonLogicBoolean hidden, JsonLogicBoolean disabled, String label, String placeholder, List<Option> options) {
        s.k(name, "name");
        s.k(selectedOptions, "selectedOptions");
        s.k(options, "options");
        return new InputMultiSelectComponent(name, styles, selectedOptions, hidden, disabled, label, placeholder, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputMultiSelectComponent)) {
            return false;
        }
        InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) other;
        return s.f(this.name, inputMultiSelectComponent.name) && s.f(this.styles, inputMultiSelectComponent.styles) && s.f(this.selectedOptions, inputMultiSelectComponent.selectedOptions) && s.f(this.hidden, inputMultiSelectComponent.hidden) && s.f(this.disabled, inputMultiSelectComponent.disabled) && s.f(this.label, inputMultiSelectComponent.label) && s.f(this.placeholder, inputMultiSelectComponent.placeholder) && s.f(this.options, inputMultiSelectComponent.options);
    }

    @Override // oi0.c2
    /* JADX INFO: renamed from: g, reason: from getter */
    public InputSelectComponentStyle getStyles() {
        return this.styles;
    }

    @Override // oi0.v
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // oi0.e0
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // oi0.c2
    public String getLabel() {
        return this.label;
    }

    @Override // oi0.n5
    public String getName() {
        return this.name;
    }

    @Override // oi0.c2
    public List<Option> getOptions() {
        return this.options;
    }

    @Override // oi0.e0
    public List<xi0.a> h() {
        return this.associatedViews;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.styles;
        int iHashCode2 = (((iHashCode + (inputSelectComponentStyle == null ? 0 : inputSelectComponentStyle.hashCode())) * 31) + this.selectedOptions.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.label;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        return ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.options.hashCode();
    }

    public void i(l lVar) {
        s.k(lVar, "<set-?>");
        this.selectedOptionsController = lVar;
    }

    @Override // oi0.d4
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InputMultiSelectComponent b(List<Option> selectedOptions) {
        s.k(selectedOptions, "selectedOptions");
        InputMultiSelectComponent inputMultiSelectComponentF = f(this, null, null, selectedOptions, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
        inputMultiSelectComponentF.i(getSelectedOptionsController());
        return inputMultiSelectComponentF;
    }

    public String toString() {
        return "InputMultiSelectComponent(name=" + this.name + ", styles=" + this.styles + ", selectedOptions=" + this.selectedOptions + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", label=" + this.label + ", placeholder=" + this.placeholder + ", options=" + this.options + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.styles, flags);
        List<Option> list = this.selectedOptions;
        dest.writeInt(list.size());
        Iterator<Option> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.label);
        dest.writeString(this.placeholder);
        List<Option> list2 = this.options;
        dest.writeInt(list2.size());
        Iterator<Option> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }
}
