package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import java.util.ArrayList;
import java.util.List;
import oi0.e0;
import oi0.n5;
import oi0.v;
import oi0.y4;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pi0.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R&\u0010;\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R(\u0010A\u001a\u00020<8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010=\u0012\u0004\b@\u0010:\u001a\u0004\b*\u0010>\"\u0004\b5\u0010?¨\u0006B"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Loi0/n5;", "Loi0/y4;", "Loi0/v;", "Loi0/e0;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;)V", "newValue", "f", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljava/lang/Number;", "getValue", "()Ljava/lang/Number;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "getDisabled", "", "Lxi0/a;", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lpi0/j;", "Lpi0/j;", "()Lpi0/j;", "(Lpi0/j;)V", "getNumberController$annotations", "numberController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputNumberComponent implements n5, y4<InputNumberComponent>, v, e0 {
    public static final Parcelable.Creator<InputNumberComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Number value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private j numberController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputNumberComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputNumberComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InputNumberComponent(parcel.readString(), (Number) parcel.readSerializable(), (JsonLogicBoolean) parcel.readParcelable(InputNumberComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputNumberComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputNumberComponent[] newArray(int i11) {
            return new InputNumberComponent[i11];
        }
    }

    public InputNumberComponent(String name, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        s.k(name, "name");
        this.name = name;
        this.value = number;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.numberController = new j(number);
    }

    public static /* synthetic */ InputNumberComponent d(InputNumberComponent inputNumberComponent, String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputNumberComponent.name;
        }
        if ((i11 & 2) != 0) {
            number = inputNumberComponent.value;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = inputNumberComponent.hidden;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean2 = inputNumberComponent.disabled;
        }
        return inputNumberComponent.c(str, number, jsonLogicBoolean, jsonLogicBoolean2);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getNumberController$annotations() {
    }

    @Override // oi0.y4
    /* JADX INFO: renamed from: b, reason: from getter */
    public j getNumberController() {
        return this.numberController;
    }

    public final InputNumberComponent c(String name, Number value, JsonLogicBoolean hidden, JsonLogicBoolean disabled) {
        s.k(name, "name");
        return new InputNumberComponent(name, value, hidden, disabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public void e(j jVar) {
        s.k(jVar, "<set-?>");
        this.numberController = jVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputNumberComponent)) {
            return false;
        }
        InputNumberComponent inputNumberComponent = (InputNumberComponent) other;
        return s.f(this.name, inputNumberComponent.name) && s.f(this.value, inputNumberComponent.value) && s.f(this.hidden, inputNumberComponent.hidden) && s.f(this.disabled, inputNumberComponent.disabled);
    }

    @Override // oi0.y4
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputNumberComponent a(Number newValue) {
        InputNumberComponent inputNumberComponentD = d(this, null, newValue, null, null, 13, null);
        inputNumberComponentD.e(getNumberController());
        return inputNumberComponentD;
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
        int iHashCode = this.name.hashCode() * 31;
        Number number = this.value;
        int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return iHashCode3 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public String toString() {
        return "InputNumberComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeSerializable(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputNumberComponent(InputNumber config) {
        s.k(config, "config");
        String name = config.getName();
        InputNumber.Attributes attributes = config.getAttributes();
        Number prefill = attributes != null ? attributes.getPrefill() : null;
        InputNumber.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputNumber.Attributes attributes3 = config.getAttributes();
        this(name, prefill, hidden, attributes3 != null ? attributes3.getDisabled() : null);
    }
}
