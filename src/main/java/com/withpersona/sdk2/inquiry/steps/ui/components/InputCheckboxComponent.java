package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import java.util.ArrayList;
import java.util.List;
import oi0.e0;
import oi0.n5;
import oi0.v;
import oi0.x4;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pi0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R&\u00109\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0012\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R(\u0010@\u001a\u00020:8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b?\u00108\u001a\u0004\b&\u0010=\"\u0004\b0\u0010>¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Loi0/n5;", "Loi0/x4;", "Loi0/v;", "Loi0/e0;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;Z)V", "newValue", "e", "(Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "(Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "Z", "getValue", "()Z", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "getDisabled", "", "Lxi0/a;", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lpi0/n;", "f", "Lpi0/n;", "()Lpi0/n;", "(Lpi0/n;)V", "getTwoStateViewController$annotations", "twoStateViewController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputCheckboxComponent implements n5, x4<InputCheckboxComponent>, v, e0 {
    public static final Parcelable.Creator<InputCheckboxComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private n twoStateViewController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputCheckboxComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputCheckboxComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InputCheckboxComponent(parcel.readString(), parcel.readInt() != 0, (JsonLogicBoolean) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputCheckboxComponent[] newArray(int i11) {
            return new InputCheckboxComponent[i11];
        }
    }

    public InputCheckboxComponent(String name, boolean z11, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        s.k(name, "name");
        this.name = name;
        this.value = z11;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.twoStateViewController = new n(z11);
    }

    public static /* synthetic */ InputCheckboxComponent c(InputCheckboxComponent inputCheckboxComponent, String str, boolean z11, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputCheckboxComponent.name;
        }
        if ((i11 & 2) != 0) {
            z11 = inputCheckboxComponent.value;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = inputCheckboxComponent.hidden;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean2 = inputCheckboxComponent.disabled;
        }
        return inputCheckboxComponent.b(str, z11, jsonLogicBoolean, jsonLogicBoolean2);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTwoStateViewController$annotations() {
    }

    @Override // oi0.x4
    /* JADX INFO: renamed from: a, reason: from getter */
    public n getTwoStateViewController() {
        return this.twoStateViewController;
    }

    public final InputCheckboxComponent b(String name, boolean value, JsonLogicBoolean hidden, JsonLogicBoolean disabled) {
        s.k(name, "name");
        return new InputCheckboxComponent(name, value, hidden, disabled);
    }

    public void d(n nVar) {
        s.k(nVar, "<set-?>");
        this.twoStateViewController = nVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // oi0.x4
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InputCheckboxComponent update(boolean newValue) {
        InputCheckboxComponent inputCheckboxComponentC = c(this, null, newValue, null, null, 13, null);
        inputCheckboxComponentC.d(getTwoStateViewController());
        return inputCheckboxComponentC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCheckboxComponent)) {
            return false;
        }
        InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) other;
        return s.f(this.name, inputCheckboxComponent.name) && this.value == inputCheckboxComponent.value && s.f(this.hidden, inputCheckboxComponent.hidden) && s.f(this.disabled, inputCheckboxComponent.disabled);
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
        int iHashCode = ((this.name.hashCode() * 31) + Boolean.hashCode(this.value)) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return iHashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public String toString() {
        return "InputCheckboxComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeInt(this.value ? 1 : 0);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InputCheckboxComponent(InputCheckbox inputCheckbox, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean prefill;
        if ((i11 & 2) != 0) {
            InputCheckbox.Attributes attributes = inputCheckbox.getAttributes();
            z11 = (attributes == null || (prefill = attributes.getPrefill()) == null) ? false : prefill.booleanValue();
        }
        this(inputCheckbox, z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputCheckboxComponent(InputCheckbox config, boolean z11) {
        s.k(config, "config");
        String name = config.getName();
        InputCheckbox.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        InputCheckbox.Attributes attributes2 = config.getAttributes();
        this(name, z11, hidden, attributes2 != null ? attributes2.getDisabled() : null);
    }
}
