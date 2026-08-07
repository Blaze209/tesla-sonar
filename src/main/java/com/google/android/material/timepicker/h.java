package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f43053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f43054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f43055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f43056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f43059g;

    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i11) {
            return new h[i11];
        }
    }

    public h() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int g(int i11) {
        return i11 >= 12 ? 1 : 0;
    }

    public int c() {
        return this.f43055c == 1 ? zs.k.f128775j : zs.k.f128777l;
    }

    public int d() {
        if (this.f43055c == 1) {
            return this.f43056d % 24;
        }
        int i11 = this.f43056d;
        if (i11 % 12 == 0) {
            return 12;
        }
        return this.f43059g == 1 ? i11 - 12 : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public e e() {
        return this.f43054b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f43056d == hVar.f43056d && this.f43057e == hVar.f43057e && this.f43055c == hVar.f43055c && this.f43058f == hVar.f43058f;
    }

    public e f() {
        return this.f43053a;
    }

    public void h(int i11) {
        if (this.f43055c == 1) {
            this.f43056d = i11;
        } else {
            this.f43056d = (i11 % 12) + (this.f43059g != 1 ? 0 : 12);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43055c), Integer.valueOf(this.f43056d), Integer.valueOf(this.f43057e), Integer.valueOf(this.f43058f)});
    }

    public void i(int i11) {
        this.f43059g = g(i11);
        this.f43056d = i11;
    }

    public void j(int i11) {
        this.f43057e = i11 % 60;
    }

    public void k(int i11) {
        if (i11 != this.f43059g) {
            this.f43059g = i11;
            int i12 = this.f43056d;
            if (i12 < 12 && i11 == 1) {
                this.f43056d = i12 + 12;
            } else {
                if (i12 < 12 || i11 != 0) {
                    return;
                }
                this.f43056d = i12 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f43056d);
        parcel.writeInt(this.f43057e);
        parcel.writeInt(this.f43058f);
        parcel.writeInt(this.f43055c);
    }

    public h(int i11) {
        this(0, 0, 10, i11);
    }

    public h(int i11, int i12, int i13, int i14) {
        this.f43056d = i11;
        this.f43057e = i12;
        this.f43058f = i13;
        this.f43055c = i14;
        this.f43059g = g(i11);
        this.f43053a = new e(59);
        this.f43054b = new e(i14 == 1 ? 23 : 12);
    }

    protected h(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
