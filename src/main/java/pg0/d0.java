package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, d2 = {"Lpg0/d0;", "Landroid/os/Parcelable;", "", "Lpg0/c0;", "G3", "()Ljava/util/List;", "frames", "Lpg0/d0$d;", "E2", "()Lpg0/d0$d;", "side", "", "b3", "()Ljava/lang/String;", "idClassKey", "Lpg0/d0$a;", "D3", "()Lpg0/d0$a;", "captureMethod", "b", "c", DateTokenConverter.CONVERTER_KEY, "a", "Lpg0/d0$b;", "Lpg0/d0$c;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface d0 extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpg0/d0$a;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "MANUAL", "UPLOAD", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AUTO = new C2171a("AUTO", 0);
        public static final a MANUAL = new b("MANUAL", 1);
        public static final a UPLOAD = new c("UPLOAD", 2);

        /* JADX INFO: renamed from: pg0.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.AUTO", "Lpg0/d0$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class C2171a extends a {
            C2171a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.MANUAL", "Lpg0/d0$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class b extends a {
            b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "manual";
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/GovernmentId.CaptureMethod.UPLOAD", "Lpg0/d0$a;", "", "toString", "()Ljava/lang/String;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class c extends a {
            c(String str, int i11) {
                super(str, i11, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "upload";
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{AUTO, MANUAL, UPLOAD};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = on0.a.a(aVarArr$values);
        }

        public /* synthetic */ a(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11);
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        private a(String str, int i11) {
            super(str, i11);
        }
    }

    /* JADX INFO: renamed from: pg0.d0$c, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lpg0/d0$c;", "Lpg0/d0;", "", "Lpg0/c0;", "frames", "Lpg0/d0$d;", "side", "", "idClassKey", "Lpg0/d0$a;", "captureMethod", "<init>", "(Ljava/util/List;Lpg0/d0$d;Ljava/lang/String;Lpg0/d0$a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "G3", "()Ljava/util/List;", "b", "Lpg0/d0$d;", "E2", "()Lpg0/d0$d;", "c", "Ljava/lang/String;", "b3", DateTokenConverter.CONVERTER_KEY, "Lpg0/d0$a;", "D3", "()Lpg0/d0$a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GovernmentIdVideo implements d0 {
        public static final Parcelable.Creator<GovernmentIdVideo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Frame> frames;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final d side;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String idClassKey;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a captureMethod;

        /* JADX INFO: renamed from: pg0.d0$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdVideo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdVideo createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdVideo(arrayList, d.valueOf(parcel.readString()), parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdVideo[] newArray(int i11) {
                return new GovernmentIdVideo[i11];
            }
        }

        public GovernmentIdVideo(List<Frame> frames, d side, String idClassKey, a captureMethod) {
            p013kotlin.jvm.internal.s.k(frames, "frames");
            p013kotlin.jvm.internal.s.k(side, "side");
            p013kotlin.jvm.internal.s.k(idClassKey, "idClassKey");
            p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
            this.frames = frames;
            this.side = side;
            this.idClassKey = idClassKey;
            this.captureMethod = captureMethod;
        }

        @Override // pg0.d0
        /* JADX INFO: renamed from: D3, reason: from getter */
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // pg0.d0
        /* JADX INFO: renamed from: E2, reason: from getter */
        public d getSide() {
            return this.side;
        }

        @Override // pg0.d0
        public List<Frame> G3() {
            return this.frames;
        }

        @Override // pg0.d0
        /* JADX INFO: renamed from: b3, reason: from getter */
        public String getIdClassKey() {
            return this.idClassKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdVideo)) {
                return false;
            }
            GovernmentIdVideo governmentIdVideo = (GovernmentIdVideo) other;
            return p013kotlin.jvm.internal.s.f(this.frames, governmentIdVideo.frames) && this.side == governmentIdVideo.side && p013kotlin.jvm.internal.s.f(this.idClassKey, governmentIdVideo.idClassKey) && this.captureMethod == governmentIdVideo.captureMethod;
        }

        public int hashCode() {
            return (((((this.frames.hashCode() * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode()) * 31) + this.captureMethod.hashCode();
        }

        public String toString() {
            return "GovernmentIdVideo(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<Frame> list = this.frames;
            dest.writeInt(list.size());
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.side.name());
            dest.writeString(this.idClassKey);
            dest.writeString(this.captureMethod.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpg0/d0$d;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "FRONT_AND_BACK", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        FRONT,
        BACK,
        FRONT_AND_BACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: D3 */
    a getCaptureMethod();

    /* JADX INFO: renamed from: E2 */
    d getSide();

    List<Frame> G3();

    /* JADX INFO: renamed from: b3 */
    String getIdClassKey();

    /* JADX INFO: renamed from: pg0.d0$b, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b.\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107¨\u00068"}, d2 = {"Lpg0/d0$b;", "Lpg0/d0;", "", "Lpg0/c0;", "frames", "Lpg0/d0$d;", "side", "", "idClassKey", "Lpg0/d0$a;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "rawExtraction", "Lpg0/k0;", "idDetails", "<init>", "(Ljava/util/List;Lpg0/d0$d;Ljava/lang/String;Lpg0/d0$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lpg0/k0;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/util/List;Lpg0/d0$d;Ljava/lang/String;Lpg0/d0$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lpg0/k0;)Lpg0/d0$b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "G3", "()Ljava/util/List;", "b", "Lpg0/d0$d;", "E2", "()Lpg0/d0$d;", "c", "Ljava/lang/String;", "b3", DateTokenConverter.CONVERTER_KEY, "Lpg0/d0$a;", "D3", "()Lpg0/d0$a;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "()Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "f", "Lpg0/k0;", "()Lpg0/k0;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GovernmentIdImage implements d0 {
        public static final Parcelable.Creator<GovernmentIdImage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Frame> frames;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final d side;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String idClassKey;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a captureMethod;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final RawExtraction rawExtraction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final GovernmentIdDetails idDetails;

        /* JADX INFO: renamed from: pg0.d0$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdImage createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Frame.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdImage(arrayList, d.valueOf(parcel.readString()), parcel.readString(), a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RawExtraction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdDetails.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdImage[] newArray(int i11) {
                return new GovernmentIdImage[i11];
            }
        }

        public GovernmentIdImage(List<Frame> frames, d side, String idClassKey, a captureMethod, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails) {
            p013kotlin.jvm.internal.s.k(frames, "frames");
            p013kotlin.jvm.internal.s.k(side, "side");
            p013kotlin.jvm.internal.s.k(idClassKey, "idClassKey");
            p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
            this.frames = frames;
            this.side = side;
            this.idClassKey = idClassKey;
            this.captureMethod = captureMethod;
            this.rawExtraction = rawExtraction;
            this.idDetails = governmentIdDetails;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GovernmentIdImage b(GovernmentIdImage governmentIdImage, List list, d dVar, String str, a aVar, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = governmentIdImage.frames;
            }
            if ((i11 & 2) != 0) {
                dVar = governmentIdImage.side;
            }
            if ((i11 & 4) != 0) {
                str = governmentIdImage.idClassKey;
            }
            if ((i11 & 8) != 0) {
                aVar = governmentIdImage.captureMethod;
            }
            if ((i11 & 16) != 0) {
                rawExtraction = governmentIdImage.rawExtraction;
            }
            if ((i11 & 32) != 0) {
                governmentIdDetails = governmentIdImage.idDetails;
            }
            RawExtraction rawExtraction2 = rawExtraction;
            GovernmentIdDetails governmentIdDetails2 = governmentIdDetails;
            return governmentIdImage.a(list, dVar, str, aVar, rawExtraction2, governmentIdDetails2);
        }

        @Override // pg0.d0
        /* JADX INFO: renamed from: D3, reason: from getter */
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // pg0.d0
        /* JADX INFO: renamed from: E2, reason: from getter */
        public d getSide() {
            return this.side;
        }

        @Override // pg0.d0
        public List<Frame> G3() {
            return this.frames;
        }

        public final GovernmentIdImage a(List<Frame> frames, d side, String idClassKey, a captureMethod, RawExtraction rawExtraction, GovernmentIdDetails idDetails) {
            p013kotlin.jvm.internal.s.k(frames, "frames");
            p013kotlin.jvm.internal.s.k(side, "side");
            p013kotlin.jvm.internal.s.k(idClassKey, "idClassKey");
            p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
            return new GovernmentIdImage(frames, side, idClassKey, captureMethod, rawExtraction, idDetails);
        }

        @Override // pg0.d0
        /* JADX INFO: renamed from: b3, reason: from getter */
        public String getIdClassKey() {
            return this.idClassKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final GovernmentIdDetails getIdDetails() {
            return this.idDetails;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final RawExtraction getRawExtraction() {
            return this.rawExtraction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdImage)) {
                return false;
            }
            GovernmentIdImage governmentIdImage = (GovernmentIdImage) other;
            return p013kotlin.jvm.internal.s.f(this.frames, governmentIdImage.frames) && this.side == governmentIdImage.side && p013kotlin.jvm.internal.s.f(this.idClassKey, governmentIdImage.idClassKey) && this.captureMethod == governmentIdImage.captureMethod && p013kotlin.jvm.internal.s.f(this.rawExtraction, governmentIdImage.rawExtraction) && p013kotlin.jvm.internal.s.f(this.idDetails, governmentIdImage.idDetails);
        }

        public int hashCode() {
            int iHashCode = ((((((this.frames.hashCode() * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode()) * 31) + this.captureMethod.hashCode()) * 31;
            RawExtraction rawExtraction = this.rawExtraction;
            int iHashCode2 = (iHashCode + (rawExtraction == null ? 0 : rawExtraction.hashCode())) * 31;
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            return iHashCode2 + (governmentIdDetails != null ? governmentIdDetails.hashCode() : 0);
        }

        public String toString() {
            return "GovernmentIdImage(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ", rawExtraction=" + this.rawExtraction + ", idDetails=" + this.idDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<Frame> list = this.frames;
            dest.writeInt(list.size());
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.side.name());
            dest.writeString(this.idClassKey);
            dest.writeString(this.captureMethod.name());
            RawExtraction rawExtraction = this.rawExtraction;
            if (rawExtraction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rawExtraction.writeToParcel(dest, flags);
            }
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            if (governmentIdDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdDetails.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ GovernmentIdImage(List list, d dVar, String str, a aVar, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, dVar, str, aVar, (i11 & 16) != 0 ? null : rawExtraction, (i11 & 32) != 0 ? null : governmentIdDetails);
        }
    }
}
