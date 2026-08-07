package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import oi0.e0;
import oi0.e5;
import oi0.n5;
import oi0.v;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import pi0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R&\u0010:\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R(\u0010A\u001a\u00020;8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\b@\u00109\u001a\u0004\b*\u0010>\"\u0004\b<\u0010?¨\u0006B"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Loi0/n5;", "Loi0/v;", "Loi0/e0;", "Loi0/e5;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/lang/String;Ljava/util/Set;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;)V", "newValue", "g", "(Ljava/util/Set;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "(Ljava/lang/String;Ljava/util/Set;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "getDisabled", "", "Lxi0/a;", "Ljava/util/List;", "h", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lpi0/m;", "f", "Lpi0/m;", "()Lpi0/m;", "(Lpi0/m;)V", "getStringSetController$annotations", "stringSetController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputCheckboxGroupComponent implements n5, v, e0, e5<InputCheckboxGroupComponent> {
    public static final Parcelable.Creator<InputCheckboxGroupComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private m stringSetController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputCheckboxGroupComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputCheckboxGroupComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashSet.add(parcel.readString());
            }
            return new InputCheckboxGroupComponent(string, linkedHashSet, (JsonLogicBoolean) parcel.readParcelable(InputCheckboxGroupComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCheckboxGroupComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputCheckboxGroupComponent[] newArray(int i11) {
            return new InputCheckboxGroupComponent[i11];
        }
    }

    public InputCheckboxGroupComponent(String name, Set<String> value, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        s.k(name, "name");
        s.k(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.stringSetController = new m(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputCheckboxGroupComponent d(InputCheckboxGroupComponent inputCheckboxGroupComponent, String str, Set set, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputCheckboxGroupComponent.name;
        }
        if ((i11 & 2) != 0) {
            set = inputCheckboxGroupComponent.value;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
        }
        return inputCheckboxGroupComponent.c(str, set, jsonLogicBoolean, jsonLogicBoolean2);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getStringSetController$annotations() {
    }

    @Override // oi0.e5
    /* JADX INFO: renamed from: b, reason: from getter */
    public m getStringSetController() {
        return this.stringSetController;
    }

    public final InputCheckboxGroupComponent c(String name, Set<String> value, JsonLogicBoolean hidden, JsonLogicBoolean disabled) {
        s.k(name, "name");
        s.k(value, "value");
        return new InputCheckboxGroupComponent(name, value, hidden, disabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Set<String> e() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCheckboxGroupComponent)) {
            return false;
        }
        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) other;
        return s.f(this.name, inputCheckboxGroupComponent.name) && s.f(this.value, inputCheckboxGroupComponent.value) && s.f(this.hidden, inputCheckboxGroupComponent.hidden) && s.f(this.disabled, inputCheckboxGroupComponent.disabled);
    }

    public void f(m mVar) {
        s.k(mVar, "<set-?>");
        this.stringSetController = mVar;
    }

    @Override // oi0.e5
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InputCheckboxGroupComponent a(Set<String> newValue) {
        s.k(newValue, "newValue");
        InputCheckboxGroupComponent inputCheckboxGroupComponentD = d(this, null, newValue, null, null, 13, null);
        inputCheckboxGroupComponentD.f(getStringSetController());
        return inputCheckboxGroupComponentD;
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
        return "InputCheckboxGroupComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        Set<String> set = this.value;
        dest.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputCheckboxGroupComponent(InputCheckboxGroup config) {
        List<String> prefill;
        s.k(config, "config");
        String name = config.getName();
        InputCheckboxGroup.Attributes attributes = config.getAttributes();
        Set setD = (attributes == null || (prefill = attributes.getPrefill()) == null || (setD = p013kotlin.collections.v.r1(prefill)) == null) ? d1.d() : setD;
        InputCheckboxGroup.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputCheckboxGroup.Attributes attributes3 = config.getAttributes();
        this(name, setD, hidden, attributes3 != null ? attributes3.getDisabled() : null);
    }
}
