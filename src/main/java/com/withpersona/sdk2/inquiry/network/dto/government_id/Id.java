package com.withpersona.sdk2.inquiry.network.dto.government_id;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import u20.a;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0003./0B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001aR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b+\u0010\u0018R\u0011\u0010,\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Landroid/os/Parcelable;", "", Action.CLASS_ATTRIBUTE, "", "requiresSides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "icon", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "capturePageConfigs", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClass", "Ljava/util/List;", "getRequiresSides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "getIcon", "getCapturePageConfigs", "isDynamicGovId", "()Z", "Companion", "IdIcon", "IdLocalIcon", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Id implements Parcelable {
    private final List<CapturePageConfig> capturePageConfigs;
    private final String class;
    private final IdIcon icon;
    private final List<String> requiresSides;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Id> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$Companion;", "", "<init>", "()V", "Lcom/squareup/moshi/h$e;", "createAdapter", "()Lcom/squareup/moshi/h$e;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h createAdapter$lambda$0(Type type, Set set, u uVar) {
            if (s.f(type, CapturePageConfig.RuleType.class)) {
                return a.a(CapturePageConfig.RuleType.class).d(null);
            }
            if (s.f(type, CapturePageConfig.OverlayLocalIcon.class)) {
                return a.a(CapturePageConfig.OverlayLocalIcon.class).d(null);
            }
            if (s.f(type, IdLocalIcon.class)) {
                return a.a(IdLocalIcon.class).d(null);
            }
            return null;
        }

        public final h.e createAdapter() {
            return new h.e() { // from class: mh0.a
                @Override // com.squareup.moshi.h.e
                public final h create(Type type, Set set, u uVar) {
                    return Id.Companion.createAdapter$lambda$0(type, set, uVar);
                }
            };
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Id> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Id createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList = null;
            IdIcon idIconCreateFromParcel = parcel.readInt() == 0 ? null : IdIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(CapturePageConfig.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Id(string, arrayListCreateStringArrayList, idIconCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Id[] newArray(int i11) {
            return new Id[i11];
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "iconFallback", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "getIconFallback", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IdIcon implements Parcelable {
        public static final Parcelable.Creator<IdIcon> CREATOR = new Creator();
        private final IdLocalIcon iconFallback;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IdIcon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdIcon createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new IdIcon(parcel.readInt() == 0 ? null : IdLocalIcon.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdIcon[] newArray(int i11) {
                return new IdIcon[i11];
            }
        }

        public IdIcon(IdLocalIcon idLocalIcon) {
            this.iconFallback = idLocalIcon;
        }

        public static /* synthetic */ IdIcon copy$default(IdIcon idIcon, IdLocalIcon idLocalIcon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                idLocalIcon = idIcon.iconFallback;
            }
            return idIcon.copy(idLocalIcon);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        public final IdIcon copy(IdLocalIcon iconFallback) {
            return new IdIcon(iconFallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdIcon) && this.iconFallback == ((IdIcon) other).iconFallback;
        }

        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        public int hashCode() {
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                return 0;
            }
            return idLocalIcon.hashCode();
        }

        public String toString() {
            return "IdIcon(iconFallback=" + this.iconFallback + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(idLocalIcon.name());
            }
        }
    }

    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "", "<init>", "(Ljava/lang/String;I)V", "WORLD", "CARD", "FLAG", "HOUSE", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum IdLocalIcon {
        WORLD,
        CARD,
        FLAG,
        HOUSE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<IdLocalIcon> getEntries() {
            return $ENTRIES;
        }
    }

    public Id(String str, List<String> requiresSides, IdIcon idIcon, List<CapturePageConfig> list) {
        s.k(str, "class");
        s.k(requiresSides, "requiresSides");
        this.class = str;
        this.requiresSides = requiresSides;
        this.icon = idIcon;
        this.capturePageConfigs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Id copy$default(Id id2, String str, List list, IdIcon idIcon, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = id2.class;
        }
        if ((i11 & 2) != 0) {
            list = id2.requiresSides;
        }
        if ((i11 & 4) != 0) {
            idIcon = id2.icon;
        }
        if ((i11 & 8) != 0) {
            list2 = id2.capturePageConfigs;
        }
        return id2.copy(str, list, idIcon, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClass() {
        return this.class;
    }

    public final List<String> component2() {
        return this.requiresSides;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IdIcon getIcon() {
        return this.icon;
    }

    public final List<CapturePageConfig> component4() {
        return this.capturePageConfigs;
    }

    public final Id copy(String str, List<String> requiresSides, IdIcon icon, List<CapturePageConfig> capturePageConfigs) {
        s.k(str, "class");
        s.k(requiresSides, "requiresSides");
        return new Id(str, requiresSides, icon, capturePageConfigs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Id)) {
            return false;
        }
        Id id2 = (Id) other;
        return s.f(this.class, id2.class) && s.f(this.requiresSides, id2.requiresSides) && s.f(this.icon, id2.icon) && s.f(this.capturePageConfigs, id2.capturePageConfigs);
    }

    public final List<CapturePageConfig> getCapturePageConfigs() {
        return this.capturePageConfigs;
    }

    public final String getClass() {
        return this.class;
    }

    public final IdIcon getIcon() {
        return this.icon;
    }

    public final List<String> getRequiresSides() {
        return this.requiresSides;
    }

    public int hashCode() {
        int iHashCode = ((this.class.hashCode() * 31) + this.requiresSides.hashCode()) * 31;
        IdIcon idIcon = this.icon;
        int iHashCode2 = (iHashCode + (idIcon == null ? 0 : idIcon.hashCode())) * 31;
        List<CapturePageConfig> list = this.capturePageConfigs;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isDynamicGovId() {
        return this.capturePageConfigs != null;
    }

    public String toString() {
        return "Id(class=" + this.class + ", requiresSides=" + this.requiresSides + ", icon=" + this.icon + ", capturePageConfigs=" + this.capturePageConfigs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.class);
        dest.writeStringList(this.requiresSides);
        IdIcon idIcon = this.icon;
        if (idIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            idIcon.writeToParcel(dest, flags);
        }
        List<CapturePageConfig> list = this.capturePageConfigs;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<CapturePageConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
