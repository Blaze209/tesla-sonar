package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import com.google.android.material.internal.r;

/* JADX INFO: loaded from: classes5.dex */
public class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f42450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f42451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42452c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42453d;

    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0668a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        r f42455b;

        /* JADX INFO: renamed from: com.google.android.material.navigation.d$a$a, reason: collision with other inner class name */
        class C0668a implements Parcelable.Creator<a> {
            C0668a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(@NonNull Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i11) {
                return new a[i11];
            }
        }

        a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeInt(this.f42454a);
            parcel.writeParcelable(this.f42455b, 0);
        }

        a(@NonNull Parcel parcel) {
            this.f42454a = parcel.readInt();
            this.f42455b = (r) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i11) {
        this.f42453d = i11;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z11) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(androidx.appcompat.view.menu.e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    @NonNull
    public Parcelable d() {
        a aVar = new a();
        aVar.f42454a = this.f42451b.getSelectedItemId();
        aVar.f42455b = bt.c.c(this.f42451b.getBadgeDrawables());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z11) {
        if (this.f42452c) {
            return;
        }
        if (z11) {
            this.f42451b.d();
        } else {
            this.f42451b.p();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(androidx.appcompat.view.menu.e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f42453d;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(@NonNull Context context, @NonNull androidx.appcompat.view.menu.e eVar) {
        this.f42450a = eVar;
        this.f42451b.a(eVar);
    }

    public void j(@NonNull c cVar) {
        this.f42451b = cVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(@NonNull Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f42451b.o(aVar.f42454a);
            this.f42451b.n(bt.c.b(this.f42451b.getContext(), aVar.f42455b));
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean l(m mVar) {
        return false;
    }

    public void m(boolean z11) {
        this.f42452c = z11;
    }
}
