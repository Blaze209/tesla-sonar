package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import zf0.AutoCaptureRuleSet;

/* JADX INFO: renamed from: pg0.d4, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0011$-.B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b'\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b-\u00100¨\u00061"}, d2 = {"Lpg0/d4;", "Landroid/os/Parcelable;", "", "idClassKey", "Lpg0/h4;", "icon", "", "Lpg0/d4$c;", "sideConfigs", "Lpg0/i4;", "parts", "Lwg0/e;", "type", "<init>", "(Ljava/lang/String;Lpg0/h4;Ljava/util/List;Ljava/util/List;Lwg0/e;)V", "Lpg0/d4$e;", "side", "c", "(Lpg0/d4$e;)Lpg0/d4$c;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b3", "b", "Lpg0/h4;", "()Lpg0/h4;", "Ljava/util/List;", "getSideConfigs", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "e", "Lwg0/e;", "()Lwg0/e;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IdConfig implements Parcelable {
    public static final Parcelable.Creator<IdConfig> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idClassKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final h4 icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<IdSideConfig> sideConfigs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<i4> parts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final wg0.e type;

    /* JADX INFO: renamed from: pg0.d4$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpg0/d4$a;", "Landroid/os/Parcelable;", "Lzf0/f;", "ruleSet", "<init>", "(Lzf0/f;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzf0/f;", "()Lzf0/f;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AutoCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new C2172a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AutoCaptureRuleSet ruleSet;

        /* JADX INFO: renamed from: pg0.d4$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2172a implements Parcelable.Creator<AutoCaptureConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AutoCaptureConfig createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new AutoCaptureConfig((AutoCaptureRuleSet) parcel.readParcelable(AutoCaptureConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AutoCaptureConfig[] newArray(int i11) {
                return new AutoCaptureConfig[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoCaptureConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AutoCaptureRuleSet getRuleSet() {
            return this.ruleSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoCaptureConfig) && p013kotlin.jvm.internal.s.f(this.ruleSet, ((AutoCaptureConfig) other).ruleSet);
        }

        public int hashCode() {
            return this.ruleSet.hashCode();
        }

        public String toString() {
            return "AutoCaptureConfig(ruleSet=" + this.ruleSet + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeParcelable(this.ruleSet, flags);
        }

        public AutoCaptureConfig(AutoCaptureRuleSet ruleSet) {
            p013kotlin.jvm.internal.s.k(ruleSet, "ruleSet");
            this.ruleSet = ruleSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ AutoCaptureConfig(AutoCaptureRuleSet fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new AutoCaptureRuleSet(null, 1, 0 == true ? 1 : 0) : fVar);
        }
    }

    /* JADX INFO: renamed from: pg0.d4$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IdConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdConfig createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            h4 h4VarValueOf = h4.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(IdSideConfig.CREATOR.createFromParcel(parcel));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(parcel.readParcelable(IdConfig.class.getClassLoader()));
            }
            return new IdConfig(string, h4VarValueOf, arrayList, arrayList2, wg0.e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IdConfig[] newArray(int i11) {
            return new IdConfig[i11];
        }
    }

    /* JADX INFO: renamed from: pg0.d4$c, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b\u001f\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b\"\u0010,¨\u0006-"}, d2 = {"Lpg0/d4$c;", "Landroid/os/Parcelable;", "", "sideKey", "Lpg0/d4$e;", "side", "Lpg0/g5$d;", "overlay", "Lpg0/d4$a;", "autoCaptureConfig", "Lpg0/d4$d;", "manualCaptureConfig", "<init>", "(Ljava/lang/String;Lpg0/d4$e;Lpg0/g5$d;Lpg0/d4$a;Lpg0/d4$d;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lpg0/d4$e;", DateTokenConverter.CONVERTER_KEY, "()Lpg0/d4$e;", "c", "Lpg0/g5$d;", "()Lpg0/g5$d;", "Lpg0/d4$a;", "()Lpg0/d4$a;", "Lpg0/d4$d;", "()Lpg0/d4$d;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IdSideConfig implements Parcelable {
        public static final Parcelable.Creator<IdSideConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sideKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final e side;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final g5.d overlay;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AutoCaptureConfig autoCaptureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ManualCaptureConfig manualCaptureConfig;

        /* JADX INFO: renamed from: pg0.d4$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IdSideConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IdSideConfig createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new IdSideConfig(parcel.readString(), e.valueOf(parcel.readString()), (g5.d) parcel.readParcelable(IdSideConfig.class.getClassLoader()), AutoCaptureConfig.CREATOR.createFromParcel(parcel), ManualCaptureConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IdSideConfig[] newArray(int i11) {
                return new IdSideConfig[i11];
            }
        }

        public IdSideConfig(String sideKey, e side, g5.d overlay, AutoCaptureConfig autoCaptureConfig, ManualCaptureConfig manualCaptureConfig) {
            p013kotlin.jvm.internal.s.k(sideKey, "sideKey");
            p013kotlin.jvm.internal.s.k(side, "side");
            p013kotlin.jvm.internal.s.k(overlay, "overlay");
            p013kotlin.jvm.internal.s.k(autoCaptureConfig, "autoCaptureConfig");
            p013kotlin.jvm.internal.s.k(manualCaptureConfig, "manualCaptureConfig");
            this.sideKey = sideKey;
            this.side = side;
            this.overlay = overlay;
            this.autoCaptureConfig = autoCaptureConfig;
            this.manualCaptureConfig = manualCaptureConfig;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AutoCaptureConfig getAutoCaptureConfig() {
            return this.autoCaptureConfig;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ManualCaptureConfig getManualCaptureConfig() {
            return this.manualCaptureConfig;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final g5.d getOverlay() {
            return this.overlay;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getSide() {
            return this.side;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSideKey() {
            return this.sideKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdSideConfig)) {
                return false;
            }
            IdSideConfig idSideConfig = (IdSideConfig) other;
            return p013kotlin.jvm.internal.s.f(this.sideKey, idSideConfig.sideKey) && this.side == idSideConfig.side && p013kotlin.jvm.internal.s.f(this.overlay, idSideConfig.overlay) && p013kotlin.jvm.internal.s.f(this.autoCaptureConfig, idSideConfig.autoCaptureConfig) && p013kotlin.jvm.internal.s.f(this.manualCaptureConfig, idSideConfig.manualCaptureConfig);
        }

        public int hashCode() {
            return (((((((this.sideKey.hashCode() * 31) + this.side.hashCode()) * 31) + this.overlay.hashCode()) * 31) + this.autoCaptureConfig.hashCode()) * 31) + this.manualCaptureConfig.hashCode();
        }

        public String toString() {
            return "IdSideConfig(sideKey=" + this.sideKey + ", side=" + this.side + ", overlay=" + this.overlay + ", autoCaptureConfig=" + this.autoCaptureConfig + ", manualCaptureConfig=" + this.manualCaptureConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.sideKey);
            dest.writeString(this.side.name());
            dest.writeParcelable(this.overlay, flags);
            this.autoCaptureConfig.writeToParcel(dest, flags);
            this.manualCaptureConfig.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: pg0.d4$d, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpg0/d4$d;", "Landroid/os/Parcelable;", "", "isEnabled", "", "delayMs", "<init>", "(ZJ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "J", "()J", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ManualCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long delayMs;

        /* JADX INFO: renamed from: pg0.d4$d$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ManualCaptureConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ManualCaptureConfig createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new ManualCaptureConfig(parcel.readInt() != 0, parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ManualCaptureConfig[] newArray(int i11) {
                return new ManualCaptureConfig[i11];
            }
        }

        public ManualCaptureConfig(boolean z11, long j11) {
            this.isEnabled = z11;
            this.delayMs = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDelayMs() {
            return this.delayMs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualCaptureConfig)) {
                return false;
            }
            ManualCaptureConfig manualCaptureConfig = (ManualCaptureConfig) other;
            return this.isEnabled == manualCaptureConfig.isEnabled && this.delayMs == manualCaptureConfig.delayMs;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isEnabled) * 31) + Long.hashCode(this.delayMs);
        }

        public String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeInt(this.isEnabled ? 1 : 0);
            dest.writeLong(this.delayMs);
        }
    }

    /* JADX INFO: renamed from: pg0.d4$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lpg0/d4$e;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Companion", "a", "Front", "Back", "FrontOrBack", "BarcodePdf417", "PassportSignature", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum e {
        Front("front"),
        Back("back"),
        FrontOrBack("front_or_back"),
        BarcodePdf417("barcode_pdf417"),
        PassportSignature("passport_signature");

        private final String key;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<Map<String, e>> sideKeyToSide$delegate = jn0.m.b(new wn0.a() { // from class: pg0.e4
            @Override // wn0.a
            public final Object invoke() {
                return IdConfig.e.sideKeyToSide_delegate$lambda$1();
            }
        });

        /* JADX INFO: renamed from: pg0.d4$e$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lpg0/d4$e$a;", "", "<init>", "()V", "", "sideKey", "Lpg0/d4$e;", "a", "(Ljava/lang/String;)Lpg0/d4$e;", "", "sideKeyToSide$delegate", "Lkotlin/Lazy;", "b", "()Ljava/util/Map;", "sideKeyToSide", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final Map<String, e> b() {
                return (Map) e.sideKeyToSide$delegate.getValue();
            }

            public final e a(String sideKey) {
                p013kotlin.jvm.internal.s.k(sideKey, "sideKey");
                return b().get(sideKey);
            }

            private Companion() {
            }
        }

        e(String str) {
            this.key = str;
        }

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map sideKeyToSide_delegate$lambda$1() {
            e[] eVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(eVarArrValues.length), 16));
            for (e eVar : eVarArrValues) {
                linkedHashMap.put(eVar.key, eVar);
            }
            return linkedHashMap;
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdConfig(String idClassKey, h4 icon, List<IdSideConfig> sideConfigs, List<? extends i4> parts, wg0.e type) {
        p013kotlin.jvm.internal.s.k(idClassKey, "idClassKey");
        p013kotlin.jvm.internal.s.k(icon, "icon");
        p013kotlin.jvm.internal.s.k(sideConfigs, "sideConfigs");
        p013kotlin.jvm.internal.s.k(parts, "parts");
        p013kotlin.jvm.internal.s.k(type, "type");
        this.idClassKey = idClassKey;
        this.icon = icon;
        this.sideConfigs = sideConfigs;
        this.parts = parts;
        this.type = type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h4 getIcon() {
        return this.icon;
    }

    public final List<i4> b() {
        return this.parts;
    }

    /* JADX INFO: renamed from: b3, reason: from getter */
    public final String getIdClassKey() {
        return this.idClassKey;
    }

    public final IdSideConfig c(e side) {
        p013kotlin.jvm.internal.s.k(side, "side");
        for (IdSideConfig idSideConfig : this.sideConfigs) {
            if (idSideConfig.getSide() == side) {
                return idSideConfig;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final wg0.e getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdConfig)) {
            return false;
        }
        IdConfig idConfig = (IdConfig) other;
        return p013kotlin.jvm.internal.s.f(this.idClassKey, idConfig.idClassKey) && this.icon == idConfig.icon && p013kotlin.jvm.internal.s.f(this.sideConfigs, idConfig.sideConfigs) && p013kotlin.jvm.internal.s.f(this.parts, idConfig.parts) && this.type == idConfig.type;
    }

    public int hashCode() {
        return (((((((this.idClassKey.hashCode() * 31) + this.icon.hashCode()) * 31) + this.sideConfigs.hashCode()) * 31) + this.parts.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "IdConfig(idClassKey=" + this.idClassKey + ", icon=" + this.icon + ", sideConfigs=" + this.sideConfigs + ", parts=" + this.parts + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.idClassKey);
        dest.writeString(this.icon.name());
        List<IdSideConfig> list = this.sideConfigs;
        dest.writeInt(list.size());
        Iterator<IdSideConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<i4> list2 = this.parts;
        dest.writeInt(list2.size());
        Iterator<i4> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeString(this.type.name());
    }
}
