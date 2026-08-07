package u60;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.y;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Lu60/i;", "", "Lcom/stripe/android/paymentsheet/y$e;", "cardBrandAcceptance", "<init>", "(Lcom/stripe/android/paymentsheet/y$e;)V", "Lcom/stripe/android/model/h;", "cardBrand", "", "a", "(Lcom/stripe/android/model/h;)Z", "Lcom/stripe/android/model/v0;", "paymentMethod", "b", "(Lcom/stripe/android/model/v0;)Z", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/y$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y.e cardBrandAcceptance;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new i((y.e) parcel.readParcelable(i.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i[] newArray(int i11) {
            return new i[i11];
        }
    }

    public i(y.e cardBrandAcceptance) {
        s.k(cardBrandAcceptance, "cardBrandAcceptance");
        this.cardBrandAcceptance = cardBrandAcceptance;
    }

    public boolean a(com.stripe.android.model.h cardBrand) {
        s.k(cardBrand, "cardBrand");
        y.e.c cVarA = j.a(cardBrand);
        y.e eVar = this.cardBrandAcceptance;
        if (eVar instanceof y.e.a) {
            return true;
        }
        if (eVar instanceof y.e.Allowed) {
            return cVarA != null && ((y.e.Allowed) eVar).a().contains(cVarA);
        }
        if (eVar instanceof y.e.Disallowed) {
            return cVarA == null || !((y.e.Disallowed) eVar).a().contains(cVarA);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    public final boolean b(PaymentMethod paymentMethod) {
        PaymentMethod.Card card;
        com.stripe.android.model.h hVarB;
        String str;
        s.k(paymentMethod, "paymentMethod");
        PaymentMethod.Card card2 = paymentMethod.card;
        if (card2 == null || (str = card2.displayBrand) == null) {
            card = paymentMethod.card;
            if (card != null) {
                hVarB = card.brand;
            } else {
                hVarB = com.stripe.android.model.h.Unknown;
            }
        } else {
            hVarB = com.stripe.android.model.h.INSTANCE.b(str);
            if (hVarB == com.stripe.android.model.h.Unknown) {
                hVarB = null;
            }
            if (hVarB == null) {
                card = paymentMethod.card;
                if (card != null) {
                    hVarB = card.brand;
                } else {
                    hVarB = com.stripe.android.model.h.Unknown;
                }
            }
        }
        return paymentMethod.type != PaymentMethod.p.Card || a(hVarB);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.cardBrandAcceptance, flags);
    }
}
