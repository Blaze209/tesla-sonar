package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements com.google.android.material.datepicker.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final InterfaceC0664d f41952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final List<com.google.android.material.datepicker.a.c> f41953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC0664d f41950c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC0664d f41951d = new b();
    public static final Parcelable.Creator<d> CREATOR = new c();

    class a implements InterfaceC0664d {
        a() {
        }

        @Override // com.google.android.material.datepicker.d.InterfaceC0664d
        public boolean a(@NonNull List<com.google.android.material.datepicker.a.c> list, long j11) {
            for (com.google.android.material.datepicker.a.c cVar : list) {
                if (cVar != null && cVar.u0(j11)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.d.InterfaceC0664d
        public int getId() {
            return 1;
        }
    }

    class b implements InterfaceC0664d {
        b() {
        }

        @Override // com.google.android.material.datepicker.d.InterfaceC0664d
        public boolean a(@NonNull List<com.google.android.material.datepicker.a.c> list, long j11) {
            for (com.google.android.material.datepicker.a.c cVar : list) {
                if (cVar != null && !cVar.u0(j11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.d.InterfaceC0664d
        public int getId() {
            return 2;
        }
    }

    class c implements Parcelable.Creator<d> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(@NonNull Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(com.google.android.material.datepicker.a.c.class.getClassLoader());
            int i11 = parcel.readInt();
            InterfaceC0664d interfaceC0664d = (i11 != 2 && i11 == 1) ? d.f41950c : d.f41951d;
            return new d((List) u5.h.g(arrayList), interfaceC0664d, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.d$d, reason: collision with other inner class name */
    private interface InterfaceC0664d {
        boolean a(@NonNull List<com.google.android.material.datepicker.a.c> list, long j11);

        int getId();
    }

    /* synthetic */ d(List list, InterfaceC0664d interfaceC0664d, a aVar) {
        this(list, interfaceC0664d);
    }

    @NonNull
    public static com.google.android.material.datepicker.a.c c(@NonNull List<com.google.android.material.datepicker.a.c> list) {
        return new d(list, f41951d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f41953b.equals(dVar.f41953b) && this.f41952a.getId() == dVar.f41952a.getId();
    }

    public int hashCode() {
        return this.f41953b.hashCode();
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean u0(long j11) {
        return this.f41952a.a(this.f41953b, j11);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeList(this.f41953b);
        parcel.writeInt(this.f41952a.getId());
    }

    private d(@NonNull List<com.google.android.material.datepicker.a.c> list, InterfaceC0664d interfaceC0664d) {
        this.f41953b = list;
        this.f41952a = interfaceC0664d;
    }
}
