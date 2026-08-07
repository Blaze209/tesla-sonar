package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes5.dex */
final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Calendar f42050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f42051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f42052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f42053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f42054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f42055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f42056g;

    class a implements Parcelable.Creator<u> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(@NonNull Parcel parcel) {
            return u.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i11) {
            return new u[i11];
        }
    }

    private u(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarE = c0.e(calendar);
        this.f42050a = calendarE;
        this.f42051b = calendarE.get(2);
        this.f42052c = calendarE.get(1);
        this.f42053d = calendarE.getMaximum(7);
        this.f42054e = calendarE.getActualMaximum(5);
        this.f42055f = calendarE.getTimeInMillis();
    }

    @NonNull
    static u b(int i11, int i12) {
        Calendar calendarM = c0.m();
        calendarM.set(1, i11);
        calendarM.set(2, i12);
        return new u(calendarM);
    }

    @NonNull
    static u c(long j11) {
        Calendar calendarM = c0.m();
        calendarM.setTimeInMillis(j11);
        return new u(calendarM);
    }

    @NonNull
    static u d() {
        return new u(c0.k());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull u uVar) {
        return this.f42050a.compareTo(uVar.f42050a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int e(int i11) {
        int i12 = this.f42050a.get(7);
        if (i11 <= 0) {
            i11 = this.f42050a.getFirstDayOfWeek();
        }
        int i13 = i12 - i11;
        return i13 < 0 ? i13 + this.f42053d : i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f42051b == uVar.f42051b && this.f42052c == uVar.f42052c;
    }

    long f(int i11) {
        Calendar calendarE = c0.e(this.f42050a);
        calendarE.set(5, i11);
        return calendarE.getTimeInMillis();
    }

    int g(long j11) {
        Calendar calendarE = c0.e(this.f42050a);
        calendarE.setTimeInMillis(j11);
        return calendarE.get(5);
    }

    @NonNull
    String h() {
        if (this.f42056g == null) {
            this.f42056g = k.j(this.f42050a.getTimeInMillis());
        }
        return this.f42056g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42051b), Integer.valueOf(this.f42052c)});
    }

    long i() {
        return this.f42050a.getTimeInMillis();
    }

    @NonNull
    u j(int i11) {
        Calendar calendarE = c0.e(this.f42050a);
        calendarE.add(2, i11);
        return new u(calendarE);
    }

    int k(@NonNull u uVar) {
        if (this.f42050a instanceof GregorianCalendar) {
            return ((uVar.f42052c - this.f42052c) * 12) + (uVar.f42051b - this.f42051b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeInt(this.f42052c);
        parcel.writeInt(this.f42051b);
    }
}
