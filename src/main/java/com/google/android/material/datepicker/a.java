package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0663a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final u f41917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final u f41918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final c f41919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u f41920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f41923g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0663a implements Parcelable.Creator<a> {
        C0663a() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@NonNull Parcel parcel) {
            return new a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public interface c extends Parcelable {
        boolean u0(long j11);
    }

    /* synthetic */ a(u uVar, u uVar2, c cVar, u uVar3, int i11, C0663a c0663a) {
        this(uVar, uVar2, cVar, uVar3, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f41917a.equals(aVar.f41917a) && this.f41918b.equals(aVar.f41918b) && u5.c.a(this.f41920d, aVar.f41920d) && this.f41921e == aVar.f41921e && this.f41919c.equals(aVar.f41919c);
    }

    u f(u uVar) {
        if (uVar.compareTo(this.f41917a) < 0) {
            return this.f41917a;
        }
        return uVar.compareTo(this.f41918b) > 0 ? this.f41918b : uVar;
    }

    public c g() {
        return this.f41919c;
    }

    @NonNull
    u h() {
        return this.f41918b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41917a, this.f41918b, this.f41920d, Integer.valueOf(this.f41921e), this.f41919c});
    }

    int i() {
        return this.f41921e;
    }

    int j() {
        return this.f41923g;
    }

    u k() {
        return this.f41920d;
    }

    @NonNull
    u l() {
        return this.f41917a;
    }

    int m() {
        return this.f41922f;
    }

    boolean q(long j11) {
        if (this.f41917a.f(1) > j11) {
            return false;
        }
        u uVar = this.f41918b;
        return j11 <= uVar.f(uVar.f42054e);
    }

    void r(u uVar) {
        this.f41920d = uVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f41917a, 0);
        parcel.writeParcelable(this.f41918b, 0);
        parcel.writeParcelable(this.f41920d, 0);
        parcel.writeParcelable(this.f41919c, 0);
        parcel.writeInt(this.f41921e);
    }

    private a(@NonNull u uVar, @NonNull u uVar2, @NonNull c cVar, u uVar3, int i11) {
        Objects.requireNonNull(uVar, "start cannot be null");
        Objects.requireNonNull(uVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f41917a = uVar;
        this.f41918b = uVar2;
        this.f41920d = uVar3;
        this.f41921e = i11;
        this.f41919c = cVar;
        if (uVar3 != null && uVar.compareTo(uVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (uVar3 != null && uVar3.compareTo(uVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i11 < 0 || i11 > c0.m().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f41923g = uVar.k(uVar2) + 1;
        this.f41922f = (uVar2.f42052c - uVar.f42052c) + 1;
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f41924f = c0.a(u.b(1900, 0).f42055f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f41925g = c0.a(u.b(2100, 11).f42055f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f41926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f41927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f41928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f41929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f41930e;

        public b() {
            this.f41926a = f41924f;
            this.f41927b = f41925g;
            this.f41930e = m.a(Long.MIN_VALUE);
        }

        @NonNull
        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f41930e);
            u uVarC = u.c(this.f41926a);
            u uVarC2 = u.c(this.f41927b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l11 = this.f41928c;
            return new a(uVarC, uVarC2, cVar, l11 == null ? null : u.c(l11.longValue()), this.f41929d, null);
        }

        @NonNull
        public b b(int i11) {
            this.f41929d = i11;
            return this;
        }

        @NonNull
        public b c(long j11) {
            this.f41928c = Long.valueOf(j11);
            return this;
        }

        @NonNull
        public b d(@NonNull c cVar) {
            Objects.requireNonNull(cVar, "validator cannot be null");
            this.f41930e = cVar;
            return this;
        }

        b(@NonNull a aVar) {
            this.f41926a = f41924f;
            this.f41927b = f41925g;
            this.f41930e = m.a(Long.MIN_VALUE);
            this.f41926a = aVar.f41917a.f42055f;
            this.f41927b = aVar.f41918b.f42055f;
            this.f41928c = Long.valueOf(aVar.f41920d.f42055f);
            this.f41929d = aVar.f41921e;
            this.f41930e = aVar.f41919c;
        }
    }
}
