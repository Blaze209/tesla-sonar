package w5;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120843a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f120844b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f120845c = 0;

    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            l lVar = new l();
            lVar.a(parcel);
            return lVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    public final void a(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int i11 = parcel.readInt();
        try {
            if (i11 < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (parcel.dataPosition() - iDataPosition < i11) {
                this.f120843a = parcel.readInt();
                if (parcel.dataPosition() - iDataPosition < i11) {
                    this.f120844b = parcel.readInt();
                    if (parcel.dataPosition() - iDataPosition < i11) {
                        this.f120845c = parcel.readInt();
                        if (iDataPosition > Integer.MAX_VALUE - i11) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } else if (iDataPosition > Integer.MAX_VALUE - i11) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(iDataPosition + i11);
        } catch (Throwable th2) {
            if (iDataPosition > Integer.MAX_VALUE - i11) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(iDataPosition + i11);
            throw th2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeInt(this.f120843a);
        parcel.writeInt(this.f120844b);
        parcel.writeInt(this.f120845c);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
