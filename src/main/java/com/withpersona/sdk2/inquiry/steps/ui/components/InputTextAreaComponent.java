package com.withpersona.sdk2.inquiry.steps.ui.components;

import a30.t;
import a30.w;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.List;
import oi0.e0;
import oi0.n5;
import oi0.v;
import oi0.z4;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R&\u0010=\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:R(\u0010C\u001a\u00020>8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010?\u0012\u0004\bB\u0010<\u001a\u0004\b+\u0010@\"\u0004\b7\u0010A¨\u0006D"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Loi0/n5;", "Loi0/z4;", "Loi0/v;", "Loi0/e0;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;)V", "newString", "g", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "", "Lxi0/a;", "f", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "La30/t;", "La30/t;", "()La30/t;", "(La30/t;)V", "getTextController$annotations", "textController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputTextAreaComponent implements n5, z4<InputTextAreaComponent>, v, e0 {
    public static final Parcelable.Creator<InputTextAreaComponent> CREATOR = new a();

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

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private t textController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputTextAreaComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputTextAreaComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InputTextAreaComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputTextAreaComponent[] newArray(int i11) {
            return new InputTextAreaComponent[i11];
        }
    }

    public InputTextAreaComponent(String name, String value, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle) {
        s.k(name, "name");
        s.k(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.associatedViews = new ArrayList();
        this.textController = w.a(value);
    }

    public static /* synthetic */ InputTextAreaComponent d(InputTextAreaComponent inputTextAreaComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputTextAreaComponent.name;
        }
        if ((i11 & 2) != 0) {
            str2 = inputTextAreaComponent.value;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = inputTextAreaComponent.hidden;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean2 = inputTextAreaComponent.disabled;
        }
        if ((i11 & 16) != 0) {
            textBasedComponentStyle = inputTextAreaComponent.errorTextStyle;
        }
        TextBasedComponentStyle textBasedComponentStyle2 = textBasedComponentStyle;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return inputTextAreaComponent.c(str, str2, jsonLogicBoolean3, jsonLogicBoolean2, textBasedComponentStyle2);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    @Override // oi0.z4
    /* JADX INFO: renamed from: b, reason: from getter */
    public t getTextController() {
        return this.textController;
    }

    public final InputTextAreaComponent c(String name, String value, JsonLogicBoolean hidden, JsonLogicBoolean disabled, TextBasedComponentStyle errorTextStyle) {
        s.k(name, "name");
        s.k(value, "value");
        return new InputTextAreaComponent(name, value, hidden, disabled, errorTextStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextBasedComponentStyle getErrorTextStyle() {
        return this.errorTextStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputTextAreaComponent)) {
            return false;
        }
        InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) other;
        return s.f(this.name, inputTextAreaComponent.name) && s.f(this.value, inputTextAreaComponent.value) && s.f(this.hidden, inputTextAreaComponent.hidden) && s.f(this.disabled, inputTextAreaComponent.disabled) && s.f(this.errorTextStyle, inputTextAreaComponent.errorTextStyle);
    }

    public void f(t tVar) {
        s.k(tVar, "<set-?>");
        this.textController = tVar;
    }

    @Override // oi0.z4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InputTextAreaComponent a(String newString) {
        s.k(newString, "newString");
        InputTextAreaComponent inputTextAreaComponentD = d(this, null, newString, null, null, null, 29, null);
        inputTextAreaComponentD.f(getTextController());
        return inputTextAreaComponentD;
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
        return iHashCode3 + (textBasedComponentStyle != null ? textBasedComponentStyle.hashCode() : 0);
    }

    public String toString() {
        return "InputTextAreaComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.errorTextStyle, flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputTextAreaComponent(InputTextArea config) {
        String prefill;
        s.k(config, "config");
        String name = config.getName();
        InputTextArea.Attributes attributes = config.getAttributes();
        String str = (attributes == null || (prefill = attributes.getPrefill()) == null) ? "" : prefill;
        InputTextArea.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputTextArea.Attributes attributes3 = config.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        InputTextBasedComponentStyle styles = config.getStyles();
        this(name, str, hidden, disabled, styles != null ? styles.getErrorTextStyle() : null);
    }
}
