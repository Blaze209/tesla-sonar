package z80;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import p010i90.IdentifierSpec;
import p010i90.OTPElement;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lz80/w1;", "Lz80/e1;", "<init>", "()V", "Li90/l0;", "f", "()Li90/l0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lro0/d;", "serializer", "()Lro0/d;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Li90/g0;", "e", "()Li90/g0;", "apiPath", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class w1 extends e1 {
    public static final w1 INSTANCE = new w1();
    public static final Parcelable.Creator<w1> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ Lazy<ro0.d<Object>> f127868a = jn0.m.a(jn0.p.PUBLICATION, a.f127869c);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127869c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ro0.d<Object> invoke() {
            return new vo0.e1("com.stripe.android.ui.core.elements.OTPSpec", w1.INSTANCE, new Annotation[0]);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<w1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w1 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            parcel.readInt();
            return w1.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w1[] newArray(int i11) {
            return new w1[i11];
        }
    }

    private w1() {
        super(null);
    }

    private final /* synthetic */ ro0.d d() {
        return f127868a.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IdentifierSpec e() {
        return IdentifierSpec.INSTANCE.a("otp");
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof w1);
    }

    public final OTPElement f() {
        return new OTPElement(e(), new p010i90.k0(0, 1, null));
    }

    public int hashCode() {
        return -1061058889;
    }

    public final ro0.d<w1> serializer() {
        return d();
    }

    public String toString() {
        return "OTPSpec";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(1);
    }
}
