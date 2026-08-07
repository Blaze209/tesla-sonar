package com.withpersona.sdk2.inquiry.steps.ui.components;

import a30.t;
import a30.w;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import java.util.ArrayList;
import java.util.List;
import oi0.e0;
import oi0.n5;
import oi0.v;
import oi0.z4;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R&\u00108\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R(\u0010>\u001a\u0002098\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010:\u0012\u0004\b=\u00107\u001a\u0004\b)\u0010;\"\u0004\b2\u0010<¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "Loi0/n5;", "Loi0/z4;", "Loi0/v;", "Loi0/e0;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;)V", "newString", "f", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "getDisabled", "", "Lxi0/a;", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "La30/t;", "La30/t;", "()La30/t;", "(La30/t;)V", "getTextController$annotations", "textController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputRadioGroupComponent implements n5, z4<InputRadioGroupComponent>, v, e0 {
    public static final Parcelable.Creator<InputRadioGroupComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private t textController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputRadioGroupComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputRadioGroupComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InputRadioGroupComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputRadioGroupComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputRadioGroupComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputRadioGroupComponent[] newArray(int i11) {
            return new InputRadioGroupComponent[i11];
        }
    }

    public InputRadioGroupComponent(String name, String value, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        s.k(name, "name");
        s.k(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.textController = w.a(value);
    }

    public static /* synthetic */ InputRadioGroupComponent d(InputRadioGroupComponent inputRadioGroupComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputRadioGroupComponent.name;
        }
        if ((i11 & 2) != 0) {
            str2 = inputRadioGroupComponent.value;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = inputRadioGroupComponent.hidden;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean2 = inputRadioGroupComponent.disabled;
        }
        return inputRadioGroupComponent.c(str, str2, jsonLogicBoolean, jsonLogicBoolean2);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    @Override // oi0.z4
    /* JADX INFO: renamed from: b, reason: from getter */
    public t getTextController() {
        return this.textController;
    }

    public final InputRadioGroupComponent c(String name, String value, JsonLogicBoolean hidden, JsonLogicBoolean disabled) {
        s.k(name, "name");
        s.k(value, "value");
        return new InputRadioGroupComponent(name, value, hidden, disabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public void e(t tVar) {
        s.k(tVar, "<set-?>");
        this.textController = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputRadioGroupComponent)) {
            return false;
        }
        InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) other;
        return s.f(this.name, inputRadioGroupComponent.name) && s.f(this.value, inputRadioGroupComponent.value) && s.f(this.hidden, inputRadioGroupComponent.hidden) && s.f(this.disabled, inputRadioGroupComponent.disabled);
    }

    @Override // oi0.z4
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputRadioGroupComponent a(String newString) {
        s.k(newString, "newString");
        InputRadioGroupComponent inputRadioGroupComponentD = d(this, null, newString, null, null, 13, null);
        inputRadioGroupComponentD.e(getTextController());
        return inputRadioGroupComponentD;
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
        return iHashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public String toString() {
        return "InputRadioGroupComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputRadioGroupComponent(InputRadioGroup config) {
        s.k(config, "config");
        String name = config.getName();
        InputRadioGroup.Attributes attributes = config.getAttributes();
        String prefill = (attributes == null || (prefill = attributes.getPrefill()) == null) ? "" : prefill;
        InputRadioGroup.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputRadioGroup.Attributes attributes3 = config.getAttributes();
        this(name, prefill, hidden, attributes3 != null ? attributes3.getDisabled() : null);
    }
}
