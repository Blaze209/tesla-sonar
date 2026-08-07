package u60;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import org.webrtc.PeerConnectionFactory;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\f\r\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lu60/h;", "Landroid/os/Parcelable;", "", "isSetupIntent", "Lw70/j$a;", "customerRequestedSave", "Lcom/stripe/android/model/v0$b;", "r1", "(ZLw70/j$a;)Lcom/stripe/android/model/v0$b;", "allowRedisplayForPaymentIntent", "(Lw70/j$a;)Lcom/stripe/android/model/v0$b;", "allowRedisplayForSetupIntent", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lu60/h$b;", "Lu60/h$c;", "Lu60/h$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface h extends Parcelable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static PaymentMethod.b a(h hVar, boolean z11, w70.j.a customerRequestedSave) {
            s.k(customerRequestedSave, "customerRequestedSave");
            return z11 ? c(hVar, customerRequestedSave) : b(hVar, customerRequestedSave);
        }

        private static PaymentMethod.b b(h hVar, w70.j.a aVar) {
            if (hVar instanceof d) {
                return PaymentMethod.b.UNSPECIFIED;
            }
            if (hVar instanceof Disabled) {
                return PaymentMethod.b.UNSPECIFIED;
            }
            if (hVar instanceof c) {
                return aVar == w70.j.a.RequestReuse ? PaymentMethod.b.ALWAYS : PaymentMethod.b.UNSPECIFIED;
            }
            throw new NoWhenBranchMatchedException();
        }

        private static PaymentMethod.b c(h hVar, w70.j.a aVar) {
            if (hVar instanceof d) {
                return PaymentMethod.b.UNSPECIFIED;
            }
            if (hVar instanceof Disabled) {
                PaymentMethod.b overrideAllowRedisplay = ((Disabled) hVar).getOverrideAllowRedisplay();
                return overrideAllowRedisplay == null ? PaymentMethod.b.LIMITED : overrideAllowRedisplay;
            }
            if (hVar instanceof c) {
                return aVar == w70.j.a.RequestReuse ? PaymentMethod.b.ALWAYS : PaymentMethod.b.LIMITED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: u60.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lu60/h$b;", "Lu60/h;", "Lcom/stripe/android/model/v0$b;", "overrideAllowRedisplay", "<init>", "(Lcom/stripe/android/model/v0$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/v0$b;", "()Lcom/stripe/android/model/v0$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Disabled implements h {
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentMethod.b overrideAllowRedisplay;

        /* JADX INFO: renamed from: u60.h$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Disabled> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Disabled createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Disabled((PaymentMethod.b) parcel.readParcelable(Disabled.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Disabled[] newArray(int i11) {
                return new Disabled[i11];
            }
        }

        public Disabled(PaymentMethod.b bVar) {
            this.overrideAllowRedisplay = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentMethod.b getOverrideAllowRedisplay() {
            return this.overrideAllowRedisplay;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disabled) && this.overrideAllowRedisplay == ((Disabled) other).overrideAllowRedisplay;
        }

        public int hashCode() {
            PaymentMethod.b bVar = this.overrideAllowRedisplay;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        @Override // u60.h
        public PaymentMethod.b r1(boolean z11, w70.j.a aVar) {
            return a.a(this, z11, aVar);
        }

        public String toString() {
            return "Disabled(overrideAllowRedisplay=" + this.overrideAllowRedisplay + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.overrideAllowRedisplay, flags);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lu60/h$c;", "Lu60/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f115779a = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return c.f115779a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        private c() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1481436890;
        }

        @Override // u60.h
        public PaymentMethod.b r1(boolean z11, w70.j.a aVar) {
            return a.a(this, z11, aVar);
        }

        public String toString() {
            return PeerConnectionFactory.TRIAL_ENABLED;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lu60/h$d;", "Lu60/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f115780a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return d.f115780a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        private d() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 144481604;
        }

        @Override // u60.h
        public PaymentMethod.b r1(boolean z11, w70.j.a aVar) {
            return a.a(this, z11, aVar);
        }

        public String toString() {
            return "Legacy";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    PaymentMethod.b r1(boolean isSetupIntent, w70.j.a customerRequestedSave);
}
