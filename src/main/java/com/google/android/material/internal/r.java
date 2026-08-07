package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class r extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    class a implements Parcelable.ClassLoaderCreator<r> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(@NonNull Parcel parcel) {
            return new r(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new r(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i11) {
            return new r[i11];
        }
    }

    public r() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = keyAt(i12);
            parcelableArr[i12] = valueAt(i12);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i11);
    }

    public r(@NonNull Parcel parcel, ClassLoader classLoader) {
        int i11 = parcel.readInt();
        int[] iArr = new int[i11];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i12 = 0; i12 < i11; i12++) {
            put(iArr[i12], parcelableArray[i12]);
        }
    }
}
