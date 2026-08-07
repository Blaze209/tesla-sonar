package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class S4 implements Parcelable {
    public static final Parcelable.Creator<S4> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46697a;

    public static final class a implements Parcelable.Creator<S4> {
        @Override // android.os.Parcelable.Creator
        public final S4 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new S4(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final S4[] newArray(int i11) {
            return new S4[i11];
        }
    }

    public S4() {
        this.f46697a = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S4) && this.f46697a == ((S4) obj).f46697a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46697a);
    }

    public final String toString() {
        return "PlaidClientSideOnlyConfiguration(noLoadingUi=" + this.f46697a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        out.writeInt(this.f46697a ? 1 : 0);
    }

    public S4(boolean z11) {
        this.f46697a = z11;
    }
}
