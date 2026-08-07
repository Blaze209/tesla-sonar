package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f44561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44562b;

    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    /* synthetic */ l(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static l f(long j11) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j11);
        return new l(h() + (micros - a()), micros);
    }

    private static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f44561a + c();
    }

    public long c() {
        return d(new l());
    }

    public long d(@NonNull l lVar) {
        return lVar.f44562b - this.f44562b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f44561a;
    }

    public void g() {
        this.f44561a = h();
        this.f44562b = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f44561a);
        parcel.writeLong(this.f44562b);
    }

    public l() {
        this(h(), a());
    }

    l(long j11, long j12) {
        this.f44561a = j11;
        this.f44562b = j12;
    }

    private l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
