package ha;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f72452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f72453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f72454c;

    class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i11) {
            return new q[i11];
        }
    }

    q(int i11, float f11) {
        this.f72452a = i11;
        this.f72453b = f11;
    }

    @SuppressLint({"WrongConstant"})
    public static q a(Object obj) {
        q qVarM = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        qVarM = i(rating.hasHeart());
                        break;
                    case 2:
                        qVarM = l(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        qVarM = k(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        qVarM = j(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                qVarM = m(ratingStyle);
            }
            ((q) s7.a.f(qVarM)).f72454c = obj;
        }
        return qVarM;
    }

    public static q i(boolean z11) {
        return new q(1, z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }

    public static q j(float f11) {
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 100.0f) {
            return new q(6, f11);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static q k(int i11, float f11) {
        float f12;
        if (i11 == 3) {
            f12 = 3.0f;
        } else if (i11 == 4) {
            f12 = 4.0f;
        } else {
            if (i11 != 5) {
                Log.e("Rating", "Invalid rating style (" + i11 + ") for a star rating");
                return null;
            }
            f12 = 5.0f;
        }
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= f12) {
            return new q(i11, f11);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static q l(boolean z11) {
        return new q(2, z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }

    public static q m(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new q(i11, -1.0f);
            default:
                return null;
        }
    }

    public float b() {
        if (this.f72452a == 6 && g()) {
            return this.f72453b;
        }
        return -1.0f;
    }

    public Object c() {
        if (this.f72454c == null) {
            if (g()) {
                int i11 = this.f72452a;
                switch (i11) {
                    case 1:
                        this.f72454c = Rating.newHeartRating(f());
                        break;
                    case 2:
                        this.f72454c = Rating.newThumbRating(h());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f72454c = Rating.newStarRating(i11, e());
                        break;
                    case 6:
                        this.f72454c = Rating.newPercentageRating(b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f72454c = Rating.newUnratedRating(this.f72452a);
            }
        }
        return this.f72454c;
    }

    public int d() {
        return this.f72452a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f72452a;
    }

    public float e() {
        int i11 = this.f72452a;
        if ((i11 == 3 || i11 == 4 || i11 == 5) && g()) {
            return this.f72453b;
        }
        return -1.0f;
    }

    public boolean f() {
        return this.f72452a == 1 && this.f72453b == 1.0f;
    }

    public boolean g() {
        return this.f72453b >= BitmapDescriptorFactory.HUE_RED;
    }

    public boolean h() {
        return this.f72452a == 2 && this.f72453b == 1.0f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f72452a);
        sb2.append(" rating=");
        float f11 = this.f72453b;
        sb2.append(f11 < BitmapDescriptorFactory.HUE_RED ? "unrated" : String.valueOf(f11));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f72452a);
        parcel.writeFloat(this.f72453b);
    }
}
