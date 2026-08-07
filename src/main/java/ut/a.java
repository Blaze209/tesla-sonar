package ut;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.x0;

/* JADX INFO: loaded from: classes5.dex */
public class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new C2514a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final x0<String, Bundle> f116717c;

    /* JADX INFO: renamed from: ut.a$a, reason: collision with other inner class name */
    class C2514a implements Parcelable.ClassLoaderCreator<a> {
        C2514a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@NonNull Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C2514a c2514a) {
        this(parcel, classLoader);
    }

    @NonNull
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f116717c + "}";
    }

    @Override // r6.a, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        int size = this.f116717c.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i12 = 0; i12 < size; i12++) {
            strArr[i12] = this.f116717c.i(i12);
            bundleArr[i12] = this.f116717c.m(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f116717c = new x0<>();
    }

    private a(@NonNull Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i11 = parcel.readInt();
        String[] strArr = new String[i11];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i11];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f116717c = new x0<>(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f116717c.put(strArr[i12], bundleArr[i12]);
        }
    }
}
