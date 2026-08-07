package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class m implements com.google.android.material.datepicker.a.c {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41973a;

    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(@NonNull Parcel parcel) {
            return new m(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i11) {
            return new m[i11];
        }
    }

    /* synthetic */ m(long j11, a aVar) {
        this(j11);
    }

    @NonNull
    public static m a(long j11) {
        return new m(j11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f41973a == ((m) obj).f41973a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f41973a)});
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean u0(long j11) {
        return j11 >= this.f41973a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeLong(this.f41973a);
    }

    private m(long j11) {
        this.f41973a = j11;
    }
}
