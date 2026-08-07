package w5;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f120835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f120836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f120837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f120838d = 0;

    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            h hVar = new h();
            hVar.b(parcel);
            return hVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i11) {
            return new h[i11];
        }
    }

    private int a(Object obj) {
        if (obj != null && (obj instanceof Parcelable)) {
            return ((Parcelable) obj).describeContents();
        }
        return 0;
    }

    public final void b(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int i11 = parcel.readInt();
        try {
            if (i11 < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (parcel.dataPosition() - iDataPosition < i11) {
                Parcelable.Creator<f> creator = f.CREATOR;
                this.f120835a = (f) parcel.readTypedObject(creator);
                if (parcel.dataPosition() - iDataPosition < i11) {
                    this.f120836b = (f) parcel.readTypedObject(creator);
                    if (parcel.dataPosition() - iDataPosition < i11) {
                        this.f120837c = (f) parcel.readTypedObject(creator);
                        if (parcel.dataPosition() - iDataPosition < i11) {
                            this.f120838d = parcel.readLong();
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
        return a(this.f120835a) | a(this.f120836b) | a(this.f120837c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeTypedObject(this.f120835a, i11);
        parcel.writeTypedObject(this.f120836b, i11);
        parcel.writeTypedObject(this.f120837c, i11);
        parcel.writeLong(this.f120838d);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
