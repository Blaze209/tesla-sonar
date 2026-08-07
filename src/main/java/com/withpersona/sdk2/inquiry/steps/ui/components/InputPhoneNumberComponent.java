package com.withpersona.sdk2.inquiry.steps.ui.components;

import a30.t;
import a30.w;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.List;
import oi0.Option;
import oi0.c2;
import oi0.e0;
import oi0.n5;
import oi0.v;
import oi0.z4;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pi0.PhoneNumberInfo;
import pi0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004:\u0001-B?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b0\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010#\"\u0004\b:\u0010;R&\u0010D\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\u001d\u0010I\u001a\u00020E8\u0006¢\u0006\u0012\n\u0004\b@\u0010F\u0012\u0004\bH\u0010C\u001a\u0004\b>\u0010GR(\u0010P\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b6\u0010K\u0012\u0004\bO\u0010C\u001a\u0004\b8\u0010L\"\u0004\bM\u0010NR#\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00130Q8\u0006¢\u0006\u0012\n\u0004\b9\u0010?\u0012\u0004\bR\u0010C\u001a\u0004\b4\u0010AR(\u0010Z\u001a\u00020T8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\bY\u0010C\u001a\u0004\b-\u0010W\"\u0004\bU\u0010X¨\u0006["}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Loi0/n5;", "Loi0/z4;", "Loi0/v;", "Loi0/e0;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "selectedCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Ljava/lang/String;)V", "newString", "l", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Loi0/e4;", "selectedCountry", "m", "(Loi0/e4;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "f", "j", "setSelectedCountryCode", "(Ljava/lang/String;)V", "", "Lxi0/a;", "g", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Loi0/c2;", "Loi0/c2;", "()Loi0/c2;", "getCountryCodeSelectComponent$annotations", "countryCodeSelectComponent", "Lpi0/l;", "Lpi0/l;", "()Lpi0/l;", "setCountryCodeOptionsController", "(Lpi0/l;)V", "getCountryCodeOptionsController$annotations", "countryCodeOptionsController", "", "getCountryCodeOptions$annotations", "countryCodeOptions", "La30/t;", "k", "La30/t;", "()La30/t;", "(La30/t;)V", "getTextController$annotations", "textController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputPhoneNumberComponent implements n5, z4<InputPhoneNumberComponent>, v, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextBasedComponentStyle errorTextStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String selectedCountryCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c2 countryCodeSelectComponent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private l countryCodeOptionsController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<Option> countryCodeOptions;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private t textController;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InputPhoneNumberComponent> CREATOR = new c();

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"com/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent$a", "Loi0/c2;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "a", "()Z", "canSelectMultipleValues", "", "Loi0/e4;", "getOptions", "()Ljava/util/List;", "options", "", "getLabel", "()Ljava/lang/String;", AnnotatedPrivateKey.LABEL, "c", "selectedOptions", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements c2 {
        a() {
        }

        @Override // oi0.c2
        /* JADX INFO: renamed from: a */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // oi0.c2
        public List<Option> c() {
            return p013kotlin.collections.v.e(pi0.e.f103042a.g(InputPhoneNumberComponent.this.getSelectedCountryCode()));
        }

        @Override // oi0.c2
        public String getLabel() {
            return null;
        }

        @Override // oi0.c2
        public List<Option> getOptions() {
            return InputPhoneNumberComponent.this.e();
        }

        @Override // oi0.c2
        public InputSelectBoxComponentStyle getStyles() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InputPhoneNumberComponent a(InputPhoneNumber config) {
            String string;
            String countryCode;
            String str;
            String countryCode2;
            String prefill;
            s.k(config, "config");
            InputPhoneNumber.Attributes attributes = config.getAttributes();
            if (attributes == null || (prefill = attributes.getPrefill()) == null || (string = p013kotlin.text.t.F1(prefill).toString()) == null) {
                string = "";
            }
            if (p013kotlin.text.t.b0(string, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
                PhoneNumberInfo phoneNumberInfoK = pi0.e.f103042a.k(string);
                String localPhoneNumber = phoneNumberInfoK.getLocalPhoneNumber();
                countryCode2 = phoneNumberInfoK.getCountryCode();
                str = localPhoneNumber;
            } else {
                InputPhoneNumber.Attributes attributes2 = config.getAttributes();
                if (attributes2 == null || (countryCode = attributes2.getCountryCode()) == null) {
                    countryCode = pi0.e.f103042a.j().getCountryCode();
                }
                str = string;
                countryCode2 = countryCode;
            }
            String name = config.getName();
            InputPhoneNumber.Attributes attributes3 = config.getAttributes();
            JsonLogicBoolean hidden = attributes3 != null ? attributes3.getHidden() : null;
            InputPhoneNumber.Attributes attributes4 = config.getAttributes();
            JsonLogicBoolean disabled = attributes4 != null ? attributes4.getDisabled() : null;
            InputTextBasedComponentStyle styles = config.getStyles();
            return new InputPhoneNumberComponent(name, str, hidden, disabled, styles != null ? styles.getErrorTextStyle() : null, countryCode2);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<InputPhoneNumberComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputPhoneNumberComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InputPhoneNumberComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputPhoneNumberComponent[] newArray(int i11) {
            return new InputPhoneNumberComponent[i11];
        }
    }

    public InputPhoneNumberComponent(String name, String value, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, String str) {
        s.k(name, "name");
        s.k(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.selectedCountryCode = str;
        this.associatedViews = new ArrayList();
        pi0.e eVar = pi0.e.f103042a;
        this.countryCodeOptions = eVar.f();
        this.countryCodeSelectComponent = new a();
        this.countryCodeOptionsController = new l(eVar.g(this.selectedCountryCode));
        this.textController = w.a(value);
    }

    public static /* synthetic */ InputPhoneNumberComponent d(InputPhoneNumberComponent inputPhoneNumberComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputPhoneNumberComponent.name;
        }
        if ((i11 & 2) != 0) {
            str2 = inputPhoneNumberComponent.value;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = inputPhoneNumberComponent.hidden;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean2 = inputPhoneNumberComponent.disabled;
        }
        if ((i11 & 16) != 0) {
            textBasedComponentStyle = inputPhoneNumberComponent.errorTextStyle;
        }
        if ((i11 & 32) != 0) {
            str3 = inputPhoneNumberComponent.selectedCountryCode;
        }
        TextBasedComponentStyle textBasedComponentStyle2 = textBasedComponentStyle;
        String str4 = str3;
        return inputPhoneNumberComponent.c(str, str2, jsonLogicBoolean, jsonLogicBoolean2, textBasedComponentStyle2, str4);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    @Override // oi0.z4
    /* JADX INFO: renamed from: b, reason: from getter */
    public t getTextController() {
        return this.textController;
    }

    public final InputPhoneNumberComponent c(String name, String value, JsonLogicBoolean hidden, JsonLogicBoolean disabled, TextBasedComponentStyle errorTextStyle, String selectedCountryCode) {
        s.k(name, "name");
        s.k(value, "value");
        return new InputPhoneNumberComponent(name, value, hidden, disabled, errorTextStyle, selectedCountryCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Option> e() {
        return this.countryCodeOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputPhoneNumberComponent)) {
            return false;
        }
        InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) other;
        return s.f(this.name, inputPhoneNumberComponent.name) && s.f(this.value, inputPhoneNumberComponent.value) && s.f(this.hidden, inputPhoneNumberComponent.hidden) && s.f(this.disabled, inputPhoneNumberComponent.disabled) && s.f(this.errorTextStyle, inputPhoneNumberComponent.errorTextStyle) && s.f(this.selectedCountryCode, inputPhoneNumberComponent.selectedCountryCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getCountryCodeOptionsController() {
        return this.countryCodeOptionsController;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c2 getCountryCodeSelectComponent() {
        return this.countryCodeSelectComponent;
    }

    @Override // oi0.v
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
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
        int iHashCode = ((this.name.hashCode() * 31) + this.value.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        int iHashCode4 = (iHashCode3 + (textBasedComponentStyle == null ? 0 : textBasedComponentStyle.hashCode())) * 31;
        String str = this.selectedCountryCode;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextBasedComponentStyle getErrorTextStyle() {
        return this.errorTextStyle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSelectedCountryCode() {
        return this.selectedCountryCode;
    }

    public void k(t tVar) {
        s.k(tVar, "<set-?>");
        this.textController = tVar;
    }

    @Override // oi0.z4
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public InputPhoneNumberComponent a(String newString) {
        s.k(newString, "newString");
        InputPhoneNumberComponent inputPhoneNumberComponentD = d(this, null, newString, null, null, null, null, 61, null);
        inputPhoneNumberComponentD.k(getTextController());
        inputPhoneNumberComponentD.countryCodeOptionsController = this.countryCodeOptionsController;
        return inputPhoneNumberComponentD;
    }

    public final InputPhoneNumberComponent m(Option selectedCountry) {
        InputPhoneNumberComponent inputPhoneNumberComponentD = d(this, null, null, null, null, null, selectedCountry != null ? pi0.e.f103042a.e(selectedCountry) : null, 31, null);
        inputPhoneNumberComponentD.k(getTextController());
        inputPhoneNumberComponentD.countryCodeOptionsController = this.countryCodeOptionsController;
        return inputPhoneNumberComponentD;
    }

    public String toString() {
        return "InputPhoneNumberComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ", selectedCountryCode=" + this.selectedCountryCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.errorTextStyle, flags);
        dest.writeString(this.selectedCountryCode);
    }
}
