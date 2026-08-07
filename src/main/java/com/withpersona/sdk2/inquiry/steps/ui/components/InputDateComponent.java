package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import java.util.ArrayList;
import java.util.List;
import oi0.e0;
import oi0.n5;
import oi0.s;
import oi0.v;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004BE\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJZ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107R&\u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b:\u00105\u0012\u0004\b<\u0010=\u001a\u0004\b;\u00107R(\u0010D\u001a\u00020?8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b;\u0010@\u0012\u0004\bC\u0010=\u001a\u0004\b,\u0010A\"\u0004\b3\u0010B¨\u0006E"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Loi0/n5;", "Loi0/s;", "Loi0/v;", "Loi0/e0;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "monthPlaceholder", "", "monthList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/util/List;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;)V", "newDate", "f", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "getDisabled", "e", "getMonthPlaceholder", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "", "Lxi0/a;", "g", "h", "getAssociatedViews$annotations", "()V", "associatedViews", "Lpi0/f;", "Lpi0/f;", "()Lpi0/f;", "(Lpi0/f;)V", "getDateController$annotations", "dateController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputDateComponent implements n5, s<InputDateComponent>, v, e0 {
    public static final Parcelable.Creator<InputDateComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String monthPlaceholder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> monthList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private pi0.f dateController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputDateComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputDateComponent createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new InputDateComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputDateComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputDateComponent.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputDateComponent[] newArray(int i11) {
            return new InputDateComponent[i11];
        }
    }

    public InputDateComponent(String name, String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, List<String> monthList) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(monthList, "monthList");
        this.name = name;
        this.value = str;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.monthPlaceholder = str2;
        this.monthList = monthList;
        this.associatedViews = new ArrayList();
        this.dateController = new pi0.f(str, str2, monthList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputDateComponent d(InputDateComponent inputDateComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputDateComponent.name;
        }
        if ((i11 & 2) != 0) {
            str2 = inputDateComponent.value;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = inputDateComponent.hidden;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean2 = inputDateComponent.disabled;
        }
        if ((i11 & 16) != 0) {
            str3 = inputDateComponent.monthPlaceholder;
        }
        if ((i11 & 32) != 0) {
            list = inputDateComponent.monthList;
        }
        String str4 = str3;
        List list2 = list;
        return inputDateComponent.c(str, str2, jsonLogicBoolean, jsonLogicBoolean2, str4, list2);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getDateController$annotations() {
    }

    @Override // oi0.s
    /* JADX INFO: renamed from: b, reason: from getter */
    public pi0.f getDateController() {
        return this.dateController;
    }

    public final InputDateComponent c(String name, String value, JsonLogicBoolean hidden, JsonLogicBoolean disabled, String monthPlaceholder, List<String> monthList) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(monthList, "monthList");
        return new InputDateComponent(name, value, hidden, disabled, monthPlaceholder, monthList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public void e(pi0.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<set-?>");
        this.dateController = fVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputDateComponent)) {
            return false;
        }
        InputDateComponent inputDateComponent = (InputDateComponent) other;
        return p013kotlin.jvm.internal.s.f(this.name, inputDateComponent.name) && p013kotlin.jvm.internal.s.f(this.value, inputDateComponent.value) && p013kotlin.jvm.internal.s.f(this.hidden, inputDateComponent.hidden) && p013kotlin.jvm.internal.s.f(this.disabled, inputDateComponent.disabled) && p013kotlin.jvm.internal.s.f(this.monthPlaceholder, inputDateComponent.monthPlaceholder) && p013kotlin.jvm.internal.s.f(this.monthList, inputDateComponent.monthList);
    }

    @Override // oi0.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputDateComponent a(String newDate) {
        InputDateComponent inputDateComponentD = d(this, null, newDate, null, null, null, null, 61, null);
        inputDateComponentD.e(getDateController());
        return inputDateComponentD;
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
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str2 = this.monthPlaceholder;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.monthList.hashCode();
    }

    public String toString() {
        return "InputDateComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", monthPlaceholder=" + this.monthPlaceholder + ", monthList=" + this.monthList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.monthPlaceholder);
        dest.writeStringList(this.monthList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputDateComponent(InputDate config) {
        List<String> textMonths;
        p013kotlin.jvm.internal.s.k(config, "config");
        String name = config.getName();
        InputDate.Attributes attributes = config.getAttributes();
        String prefill = attributes != null ? attributes.getPrefill() : null;
        InputDate.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputDate.Attributes attributes3 = config.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        InputDate.Attributes attributes4 = config.getAttributes();
        String placeholderMonth = attributes4 != null ? attributes4.getPlaceholderMonth() : null;
        InputDate.Attributes attributes5 = config.getAttributes();
        this(name, prefill, hidden, disabled, placeholderMonth, (attributes5 == null || (textMonths = attributes5.getTextMonths()) == null) ? p013kotlin.collections.v.m() : textMonths);
    }
}
