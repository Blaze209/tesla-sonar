package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0696a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f44494b;

    /* JADX INFO: renamed from: com.google.firebase.perf.metrics.a$a, reason: collision with other inner class name */
    class C0696a implements Parcelable.Creator<a> {
        C0696a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, C0696a c0696a) {
        this(parcel);
    }

    long a() {
        return this.f44494b.get();
    }

    public void b(long j11) {
        this.f44494b.addAndGet(j11);
    }

    void c(long j11) {
        this.f44494b.set(j11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    String getName() {
        return this.f44493a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f44493a);
        parcel.writeLong(this.f44494b.get());
    }

    public a(@NonNull String str) {
        this.f44493a = str;
        this.f44494b = new AtomicLong(0L);
    }

    private a(Parcel parcel) {
        this.f44493a = parcel.readString();
        this.f44494b = new AtomicLong(parcel.readLong());
    }
}
