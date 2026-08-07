package x30;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: x30.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lx30/b;", "Lx30/c;", "", "id", "", "Ly30/b;", "transformations", "", "args", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "B2", "(Landroid/content/Context;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "b", "Ljava/util/List;", "c", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IdentifierResolvableString implements c {
    public static final Parcelable.Creator<IdentifierResolvableString> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<y30.b> transformations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Object> args;

    /* JADX INFO: renamed from: x30.b$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IdentifierResolvableString> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdentifierResolvableString createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(parcel.readParcelable(IdentifierResolvableString.class.getClassLoader()));
            }
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList2.add(parcel.readValue(IdentifierResolvableString.class.getClassLoader()));
            }
            return new IdentifierResolvableString(i11, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IdentifierResolvableString[] newArray(int i11) {
            return new IdentifierResolvableString[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdentifierResolvableString(int i11, List<? extends y30.b> transformations, List<? extends Object> args) {
        s.k(transformations, "transformations");
        s.k(args, "args");
        this.id = i11;
        this.transformations = transformations;
        this.args = args;
    }

    @Override // x30.c
    public String B2(Context context) {
        s.k(context, "context");
        List<y30.b> list = this.transformations;
        int i11 = this.id;
        Object[] objArrH = d.h(context, this.args);
        String string = context.getString(i11, Arrays.copyOf(objArrH, objArrH.length));
        s.j(string, "getString(...)");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            string = ((y30.b) it.next()).A2(string);
        }
        return string;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentifierResolvableString)) {
            return false;
        }
        IdentifierResolvableString identifierResolvableString = (IdentifierResolvableString) other;
        return this.id == identifierResolvableString.id && s.f(this.transformations, identifierResolvableString.transformations) && s.f(this.args, identifierResolvableString.args);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.transformations.hashCode()) * 31) + this.args.hashCode();
    }

    public String toString() {
        return "IdentifierResolvableString(id=" + this.id + ", transformations=" + this.transformations + ", args=" + this.args + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeInt(this.id);
        List<y30.b> list = this.transformations;
        parcel.writeInt(list.size());
        Iterator<y30.b> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
        List<Object> list2 = this.args;
        parcel.writeInt(list2.size());
        Iterator<Object> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeValue(it2.next());
        }
    }
}
