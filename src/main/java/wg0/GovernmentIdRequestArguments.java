package wg0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pg0.d0;

/* JADX INFO: renamed from: wg0.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001f\u0010\u0014¨\u0006!"}, d2 = {"Lwg0/c;", "Landroid/os/Parcelable;", "", "Lpg0/d0;", "ids", "", "fieldKeyDocument", "fieldKeyIdClass", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GovernmentIdRequestArguments implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdRequestArguments> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<d0> ids;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fieldKeyDocument;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fieldKeyIdClass;

    /* JADX INFO: renamed from: wg0.c$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GovernmentIdRequestArguments> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdRequestArguments createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(GovernmentIdRequestArguments.class.getClassLoader()));
            }
            return new GovernmentIdRequestArguments(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdRequestArguments[] newArray(int i11) {
            return new GovernmentIdRequestArguments[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GovernmentIdRequestArguments(List<? extends d0> ids, String fieldKeyDocument, String fieldKeyIdClass) {
        s.k(ids, "ids");
        s.k(fieldKeyDocument, "fieldKeyDocument");
        s.k(fieldKeyIdClass, "fieldKeyIdClass");
        this.ids = ids;
        this.fieldKeyDocument = fieldKeyDocument;
        this.fieldKeyIdClass = fieldKeyIdClass;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFieldKeyDocument() {
        return this.fieldKeyDocument;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFieldKeyIdClass() {
        return this.fieldKeyIdClass;
    }

    public final List<d0> c() {
        return this.ids;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdRequestArguments)) {
            return false;
        }
        GovernmentIdRequestArguments governmentIdRequestArguments = (GovernmentIdRequestArguments) other;
        return s.f(this.ids, governmentIdRequestArguments.ids) && s.f(this.fieldKeyDocument, governmentIdRequestArguments.fieldKeyDocument) && s.f(this.fieldKeyIdClass, governmentIdRequestArguments.fieldKeyIdClass);
    }

    public int hashCode() {
        return (((this.ids.hashCode() * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.fieldKeyIdClass.hashCode();
    }

    public String toString() {
        return "GovernmentIdRequestArguments(ids=" + this.ids + ", fieldKeyDocument=" + this.fieldKeyDocument + ", fieldKeyIdClass=" + this.fieldKeyIdClass + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        List<d0> list = this.ids;
        dest.writeInt(list.size());
        Iterator<d0> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.fieldKeyDocument);
        dest.writeString(this.fieldKeyIdClass);
    }
}
