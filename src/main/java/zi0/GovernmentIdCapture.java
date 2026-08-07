package zi0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: zi0.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001e&\"B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001e\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lzi0/e;", "Landroid/os/Parcelable;", "", "idClass", "Lzi0/e$d;", "side", "Lzi0/e$a;", "captureMethod", "", "Lzi0/e$c;", "frames", "<init>", "(Ljava/lang/String;Lzi0/e$d;Lzi0/e$a;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lzi0/e$d;", "c", "()Lzi0/e$d;", "Lzi0/e$a;", "()Lzi0/e$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "G3", "()Ljava/util/List;", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GovernmentIdCapture implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdCapture> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a captureMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Frame> frames;

    /* JADX INFO: renamed from: zi0.e$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzi0/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "Manual", "Auto", "Upload", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        Manual,
        Auto,
        Upload;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: zi0.e$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<GovernmentIdCapture> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdCapture createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            d dVarValueOf = d.valueOf(parcel.readString());
            a aVarValueOf = a.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Frame.CREATOR.createFromParcel(parcel));
            }
            return new GovernmentIdCapture(string, dVarValueOf, aVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdCapture[] newArray(int i11) {
            return new GovernmentIdCapture[i11];
        }
    }

    /* JADX INFO: renamed from: zi0.e$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lzi0/e$c;", "Landroid/os/Parcelable;", "Ljava/io/File;", "data", "", "mimeType", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "()Ljava/io/File;", "b", "Ljava/lang/String;", "getMimeType", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Frame implements Parcelable {
        public static final Parcelable.Creator<Frame> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final File data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mimeType;

        /* JADX INFO: renamed from: zi0.e$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Frame> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Frame createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Frame((File) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Frame[] newArray(int i11) {
                return new Frame[i11];
            }
        }

        public Frame(File data, String mimeType) {
            s.k(data, "data");
            s.k(mimeType, "mimeType");
            this.data = data;
            this.mimeType = mimeType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final File getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return s.f(this.data, frame.data) && s.f(this.mimeType, frame.mimeType);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.mimeType.hashCode();
        }

        public String toString() {
            return "Frame(data=" + this.data + ", mimeType=" + this.mimeType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeSerializable(this.data);
            dest.writeString(this.mimeType);
        }
    }

    /* JADX INFO: renamed from: zi0.e$d */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzi0/e$d;", "", "<init>", "(Ljava/lang/String;I)V", "Front", "Back", "FrontAndBack", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        Front,
        Back,
        FrontAndBack;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }
    }

    public GovernmentIdCapture(String idClass, d side, a captureMethod, List<Frame> frames) {
        s.k(idClass, "idClass");
        s.k(side, "side");
        s.k(captureMethod, "captureMethod");
        s.k(frames, "frames");
        this.idClass = idClass;
        this.side = side;
        this.captureMethod = captureMethod;
        this.frames = frames;
    }

    public final List<Frame> G3() {
        return this.frames;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCaptureMethod() {
        return this.captureMethod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIdClass() {
        return this.idClass;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getSide() {
        return this.side;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdCapture)) {
            return false;
        }
        GovernmentIdCapture governmentIdCapture = (GovernmentIdCapture) other;
        return s.f(this.idClass, governmentIdCapture.idClass) && this.side == governmentIdCapture.side && this.captureMethod == governmentIdCapture.captureMethod && s.f(this.frames, governmentIdCapture.frames);
    }

    public int hashCode() {
        return (((((this.idClass.hashCode() * 31) + this.side.hashCode()) * 31) + this.captureMethod.hashCode()) * 31) + this.frames.hashCode();
    }

    public String toString() {
        return "GovernmentIdCapture(idClass=" + this.idClass + ", side=" + this.side + ", captureMethod=" + this.captureMethod + ", frames=" + this.frames + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.idClass);
        dest.writeString(this.side.name());
        dest.writeString(this.captureMethod.name());
        List<Frame> list = this.frames;
        dest.writeInt(list.size());
        Iterator<Frame> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
