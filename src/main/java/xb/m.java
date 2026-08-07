package xb;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;
import sb.c2;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class m implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f123185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f123184b = new String[0];
    public static final Parcelable.Creator<m> CREATOR = new a();

    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i11) {
            return new m[i11];
        }
    }

    public m(r0 r0Var) {
        this.f123185a = r0Var;
    }

    public r0 a() {
        return this.f123185a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f123185a.getId().toString());
        parcel.writeInt(c2.k(this.f123185a.getState()));
        new d(this.f123185a.getOutputData()).writeToParcel(parcel, i11);
        parcel.writeStringArray((String[]) new ArrayList(this.f123185a.l()).toArray(f123184b));
        new d(this.f123185a.getProgress()).writeToParcel(parcel, i11);
        parcel.writeInt(this.f123185a.getRunAttemptCount());
        parcel.writeInt(this.f123185a.getGeneration());
        new c(this.f123185a.getConstraints()).writeToParcel(parcel, i11);
        parcel.writeLong(this.f123185a.getInitialDelayMillis());
        r0.b periodicityInfo = this.f123185a.getPeriodicityInfo();
        boolean z11 = periodicityInfo != null;
        b.c(parcel, z11);
        if (z11) {
            parcel.writeLong(periodicityInfo.getRepeatIntervalMillis());
            parcel.writeLong(periodicityInfo.getFlexIntervalMillis());
        }
        parcel.writeLong(this.f123185a.getNextScheduleTimeMillis());
        if (Build.VERSION.SDK_INT >= 31) {
            parcel.writeInt(this.f123185a.getStopReason());
        }
    }

    protected m(Parcel parcel) {
        this.f123185a = new r0(UUID.fromString(parcel.readString()), c2.g(parcel.readInt()), new HashSet(Arrays.asList(parcel.createStringArray())), new d(parcel).getData(), new d(parcel).getData(), parcel.readInt(), parcel.readInt(), new c(parcel).a(), parcel.readLong(), b.a(parcel) ? new r0.b(parcel.readLong(), parcel.readLong()) : null, parcel.readLong(), Build.VERSION.SDK_INT >= 31 ? parcel.readInt() : -256);
    }
}
