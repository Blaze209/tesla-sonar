package oi0;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: oi0.y, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Loi0/y;", "Loi0/n5;", "Loi0/o5;", "", "name", "", "children", "", "firstBelowTheFoldChildIndex", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;)V", "newChildren", "G0", "(Ljava/util/List;)Loi0/o5;", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Loi0/y;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FooterComponent implements n5, o5 {
    public static final Parcelable.Creator<FooterComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<n5> children;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer firstBelowTheFoldChildIndex;

    /* JADX INFO: renamed from: oi0.y$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FooterComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FooterComponent createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(FooterComponent.class.getClassLoader()));
            }
            return new FooterComponent(string, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FooterComponent[] newArray(int i11) {
            return new FooterComponent[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FooterComponent(String name, List<? extends n5> children, Integer num) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(children, "children");
        this.name = name;
        this.children = children;
        this.firstBelowTheFoldChildIndex = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FooterComponent b(FooterComponent footerComponent, String str, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = footerComponent.name;
        }
        if ((i11 & 2) != 0) {
            list = footerComponent.children;
        }
        if ((i11 & 4) != 0) {
            num = footerComponent.firstBelowTheFoldChildIndex;
        }
        return footerComponent.a(str, list, num);
    }

    @Override // oi0.o5
    public o5 G0(List<? extends n5> newChildren) {
        p013kotlin.jvm.internal.s.k(newChildren, "newChildren");
        return b(this, null, newChildren, null, 5, null);
    }

    public final FooterComponent a(String name, List<? extends n5> children, Integer firstBelowTheFoldChildIndex) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(children, "children");
        return new FooterComponent(name, children, firstBelowTheFoldChildIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getFirstBelowTheFoldChildIndex() {
        return this.firstBelowTheFoldChildIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterComponent)) {
            return false;
        }
        FooterComponent footerComponent = (FooterComponent) other;
        return p013kotlin.jvm.internal.s.f(this.name, footerComponent.name) && p013kotlin.jvm.internal.s.f(this.children, footerComponent.children) && p013kotlin.jvm.internal.s.f(this.firstBelowTheFoldChildIndex, footerComponent.firstBelowTheFoldChildIndex);
    }

    @Override // oi0.o5
    public List<n5> getChildren() {
        return this.children;
    }

    @Override // oi0.n5
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.children.hashCode()) * 31;
        Integer num = this.firstBelowTheFoldChildIndex;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "FooterComponent(name=" + this.name + ", children=" + this.children + ", firstBelowTheFoldChildIndex=" + this.firstBelowTheFoldChildIndex + ")";
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
        Integer num = this.firstBelowTheFoldChildIndex;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public FooterComponent(Footer config) {
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
        Footer.Attributes attributes = config.getAttributes();
        this(name, listM, attributes != null ? attributes.getFirstBelowTheFoldChildIndex() : null);
    }
}
