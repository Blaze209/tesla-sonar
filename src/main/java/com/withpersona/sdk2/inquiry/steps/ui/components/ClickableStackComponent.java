package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oi0.e0;
import oi0.n5;
import oi0.o5;
import oi0.v;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BE\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b%\u0010 J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010$R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b0\u00108R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b4\u0010;\"\u0004\b6\u0010<R&\u0010C\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b?\u0010-\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010/¨\u0006D"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Loi0/n5;", "Loi0/o5;", "Loi0/v;", "Loi0/e0;", "", "name", "", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "styles", "", "isActive", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;)V", "newChildren", "G0", "(Ljava/util/List;)Loi0/o5;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "f", "Z", "()Z", "(Z)V", "", "Lxi0/a;", "g", "h", "getAssociatedViews$annotations", "()V", "associatedViews", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClickableStackComponent implements n5, o5, v, e0 {
    public static final Parcelable.Creator<ClickableStackComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<n5> children;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ClickableStack.ClickableStackComponentStyle styles;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isActive;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClickableStackComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClickableStackComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(ClickableStackComponent.class.getClassLoader()));
            }
            return new ClickableStackComponent(string, arrayList, (JsonLogicBoolean) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), (ClickableStack.ClickableStackComponentStyle) parcel.readParcelable(ClickableStackComponent.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ClickableStackComponent[] newArray(int i11) {
            return new ClickableStackComponent[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableStackComponent(String name, List<? extends n5> children, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z11) {
        s.k(name, "name");
        s.k(children, "children");
        this.name = name;
        this.children = children;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.styles = clickableStackComponentStyle;
        this.isActive = z11;
        this.associatedViews = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClickableStackComponent b(ClickableStackComponent clickableStackComponent, String str, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clickableStackComponent.name;
        }
        if ((i11 & 2) != 0) {
            list = clickableStackComponent.children;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = clickableStackComponent.hidden;
        }
        if ((i11 & 8) != 0) {
            jsonLogicBoolean2 = clickableStackComponent.disabled;
        }
        if ((i11 & 16) != 0) {
            clickableStackComponentStyle = clickableStackComponent.styles;
        }
        if ((i11 & 32) != 0) {
            z11 = clickableStackComponent.isActive;
        }
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle2 = clickableStackComponentStyle;
        boolean z12 = z11;
        return clickableStackComponent.a(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle2, z12);
    }

    @Override // oi0.o5
    public o5 G0(List<? extends n5> newChildren) {
        s.k(newChildren, "newChildren");
        return b(this, null, newChildren, null, null, null, false, 61, null);
    }

    public final ClickableStackComponent a(String name, List<? extends n5> children, JsonLogicBoolean hidden, JsonLogicBoolean disabled, ClickableStack.ClickableStackComponentStyle styles, boolean isActive) {
        s.k(name, "name");
        s.k(children, "children");
        return new ClickableStackComponent(name, children, hidden, disabled, styles, isActive);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ClickableStack.ClickableStackComponentStyle getStyles() {
        return this.styles;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(boolean z11) {
        this.isActive = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableStackComponent)) {
            return false;
        }
        ClickableStackComponent clickableStackComponent = (ClickableStackComponent) other;
        return s.f(this.name, clickableStackComponent.name) && s.f(this.children, clickableStackComponent.children) && s.f(this.hidden, clickableStackComponent.hidden) && s.f(this.disabled, clickableStackComponent.disabled) && s.f(this.styles, clickableStackComponent.styles) && this.isActive == clickableStackComponent.isActive;
    }

    @Override // oi0.o5
    public List<n5> getChildren() {
        return this.children;
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
        int iHashCode = ((this.name.hashCode() * 31) + this.children.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = this.styles;
        return ((iHashCode3 + (clickableStackComponentStyle != null ? clickableStackComponentStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.isActive);
    }

    public String toString() {
        return "ClickableStackComponent(name=" + this.name + ", children=" + this.children + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", styles=" + this.styles + ", isActive=" + this.isActive + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        List<n5> list = this.children;
        dest.writeInt(list.size());
        Iterator<n5> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.styles, flags);
        dest.writeInt(this.isActive ? 1 : 0);
    }

    public /* synthetic */ ClickableStackComponent(String str, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle, (i11 & 32) != 0 ? false : z11);
    }

    public ClickableStackComponent(ClickableStack config) {
        List listM;
        s.k(config, "config");
        String name = config.getName();
        List<UiComponentConfig> children = config.getChildren();
        if (children != null) {
            listM = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                n5 n5VarK = g.k((UiComponentConfig) it.next());
                if (n5VarK != null) {
                    listM.add(n5VarK);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        List list = listM;
        ClickableStack.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        ClickableStack.Attributes attributes2 = config.getAttributes();
        this(name, list, hidden, attributes2 != null ? attributes2.getDisabled() : null, config.getStyles(), false, 32, null);
    }
}
