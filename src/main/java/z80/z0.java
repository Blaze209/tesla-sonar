package z80;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import p010i90.IdentifierSpec;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\u00020\u00198\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lz80/z0;", "Lz80/e1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lro0/d;", "serializer", "()Lro0/d;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Li90/g0;", "a", "Li90/g0;", "getApiPath", "()Li90/g0;", "getApiPath$annotations", "apiPath", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class z0 extends e1 {
    public static final z0 INSTANCE = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final IdentifierSpec apiPath = IdentifierSpec.INSTANCE.a("empty");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f127892b = IdentifierSpec.f76539d;
    public static final Parcelable.Creator<z0> CREATOR = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ Lazy<ro0.d<Object>> f127893c = jn0.m.a(jn0.p.PUBLICATION, a.f127894c);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127894c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ro0.d<Object> invoke() {
            return new vo0.e1("com.stripe.android.ui.core.elements.EmptyFormSpec", z0.INSTANCE, new Annotation[0]);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<z0> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            parcel.readInt();
            return z0.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z0[] newArray(int i11) {
            return new z0[i11];
        }
    }

    private z0() {
        super(null);
    }

    private final /* synthetic */ ro0.d d() {
        return f127893c.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof z0);
    }

    public int hashCode() {
        return 780162941;
    }

    public final ro0.d<z0> serializer() {
        return d();
    }

    public String toString() {
        return "EmptyFormSpec";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(1);
    }
}
