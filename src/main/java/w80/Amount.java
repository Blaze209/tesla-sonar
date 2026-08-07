package w80;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegate;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: w80.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\f¨\u0006!"}, d2 = {"Lw80/b;", "Landroid/os/Parcelable;", "", "value", "", "currencyCode", "<init>", "(JLjava/lang/String;)V", "Lx30/c;", "a", "()Lx30/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "c", "()J", "b", "Ljava/lang/String;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Amount implements Parcelable {
    public static final Parcelable.Creator<Amount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyCode;

    /* JADX INFO: renamed from: w80.b$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Amount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Amount createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new Amount(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Amount[] newArray(int i11) {
            return new Amount[i11];
        }
    }

    public Amount(long j11, String currencyCode) {
        s.k(currencyCode, "currencyCode");
        this.value = j11;
        this.currencyCode = currencyCode;
    }

    public final x30.c a() {
        int i11 = n.F;
        m90.a aVar = m90.a.f91626a;
        long j11 = this.value;
        String str = this.currencyCode;
        Locale localeC = AppCompatDelegate.getApplicationLocales().c(0);
        if (localeC == null) {
            localeC = Locale.getDefault();
        }
        s.h(localeC);
        return x30.d.g(i11, new Object[]{aVar.a(j11, str, localeC)}, null, 4, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) other;
        return this.value == amount.value && s.f(this.currencyCode, amount.currencyCode);
    }

    public int hashCode() {
        return (Long.hashCode(this.value) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "Amount(value=" + this.value + ", currencyCode=" + this.currencyCode + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeLong(this.value);
        parcel.writeString(this.currencyCode);
    }
}
