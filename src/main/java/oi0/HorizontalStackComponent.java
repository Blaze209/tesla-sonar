package oi0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: oi0.f0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010\u001eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R&\u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b1\u0010(\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010*¨\u00066"}, d2 = {"Loi0/f0;", "Loi0/n5;", "Loi0/o5;", "Loi0/e0;", "", "name", "", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;)V", "newChildren", "G0", "(Ljava/util/List;)Loi0/o5;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Loi0/f0;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "", "Lxi0/a;", DateTokenConverter.CONVERTER_KEY, "h", "getAssociatedViews$annotations", "()V", "associatedViews", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HorizontalStackComponent implements n5, o5, e0 {
    public static final Parcelable.Creator<HorizontalStackComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<n5> children;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: oi0.f0$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HorizontalStackComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HorizontalStackComponent createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(HorizontalStackComponent.class.getClassLoader()));
            }
            return new HorizontalStackComponent(string, arrayList, (JsonLogicBoolean) parcel.readParcelable(HorizontalStackComponent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HorizontalStackComponent[] newArray(int i11) {
            return new HorizontalStackComponent[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalStackComponent(String name, List<? extends n5> children, JsonLogicBoolean jsonLogicBoolean) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(children, "children");
        this.name = name;
        this.children = children;
        this.hidden = jsonLogicBoolean;
        this.associatedViews = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HorizontalStackComponent b(HorizontalStackComponent horizontalStackComponent, String str, List list, JsonLogicBoolean jsonLogicBoolean, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = horizontalStackComponent.name;
        }
        if ((i11 & 2) != 0) {
            list = horizontalStackComponent.children;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean = horizontalStackComponent.hidden;
        }
        return horizontalStackComponent.a(str, list, jsonLogicBoolean);
    }

    @Override // oi0.o5
    public o5 G0(List<? extends n5> newChildren) {
        p013kotlin.jvm.internal.s.k(newChildren, "newChildren");
        return b(this, null, newChildren, null, 5, null);
    }

    public final HorizontalStackComponent a(String name, List<? extends n5> children, JsonLogicBoolean hidden) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(children, "children");
        return new HorizontalStackComponent(name, children, hidden);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalStackComponent)) {
            return false;
        }
        HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) other;
        return p013kotlin.jvm.internal.s.f(this.name, horizontalStackComponent.name) && p013kotlin.jvm.internal.s.f(this.children, horizontalStackComponent.children) && p013kotlin.jvm.internal.s.f(this.hidden, horizontalStackComponent.hidden);
    }

    @Override // oi0.o5
    public List<n5> getChildren() {
        return this.children;
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
        return iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode());
    }

    public String toString() {
        return "HorizontalStackComponent(name=" + this.name + ", children=" + this.children + ", hidden=" + this.hidden + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.name);
        List<n5> list = this.children;
        dest.writeInt(list.size());
        Iterator<n5> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.hidden, flags);
    }

    public HorizontalStackComponent(HorizontalStack config) {
        List listM;
        p013kotlin.jvm.internal.s.k(config, "config");
        String name = config.getName();
        List<UiComponentConfig> children = config.getChildren();
        if (children != null) {
            listM = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                n5 n5VarK = com.withpersona.sdk2.inquiry.steps.ui.components.g.k((UiComponentConfig) it.next());
                if (n5VarK != null) {
                    listM.add(n5VarK);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        HorizontalStack.Attributes attributes = config.getAttributes();
        this(name, listM, attributes != null ? attributes.getHidden() : null);
    }
}
