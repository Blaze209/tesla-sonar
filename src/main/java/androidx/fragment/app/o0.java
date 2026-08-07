package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f8590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f8591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f8592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f8593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f8595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f8596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f8597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f8598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f8599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f8600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f8601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final String f8602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f8603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f8604o;

    class a implements Parcelable.Creator<o0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o0 createFromParcel(Parcel parcel) {
            return new o0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o0[] newArray(int i11) {
            return new o0[i11];
        }
    }

    o0(Fragment fragment) {
        this.f8590a = fragment.getClass().getName();
        this.f8591b = fragment.mWho;
        this.f8592c = fragment.mFromLayout;
        this.f8593d = fragment.mInDynamicContainer;
        this.f8594e = fragment.mFragmentId;
        this.f8595f = fragment.mContainerId;
        this.f8596g = fragment.mTag;
        this.f8597h = fragment.mRetainInstance;
        this.f8598i = fragment.mRemoving;
        this.f8599j = fragment.mDetached;
        this.f8600k = fragment.mHidden;
        this.f8601l = fragment.mMaxState.ordinal();
        this.f8602m = fragment.mTargetWho;
        this.f8603n = fragment.mTargetRequestCode;
        this.f8604o = fragment.mUserVisibleHint;
    }

    @NonNull
    Fragment a(@NonNull y yVar, @NonNull ClassLoader classLoader) {
        Fragment fragmentInstantiate = yVar.instantiate(classLoader, this.f8590a);
        fragmentInstantiate.mWho = this.f8591b;
        fragmentInstantiate.mFromLayout = this.f8592c;
        fragmentInstantiate.mInDynamicContainer = this.f8593d;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = this.f8594e;
        fragmentInstantiate.mContainerId = this.f8595f;
        fragmentInstantiate.mTag = this.f8596g;
        fragmentInstantiate.mRetainInstance = this.f8597h;
        fragmentInstantiate.mRemoving = this.f8598i;
        fragmentInstantiate.mDetached = this.f8599j;
        fragmentInstantiate.mHidden = this.f8600k;
        fragmentInstantiate.mMaxState = Lifecycle.State.values()[this.f8601l];
        fragmentInstantiate.mTargetWho = this.f8602m;
        fragmentInstantiate.mTargetRequestCode = this.f8603n;
        fragmentInstantiate.mUserVisibleHint = this.f8604o;
        return fragmentInstantiate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f8590a);
        sb2.append(" (");
        sb2.append(this.f8591b);
        sb2.append(")}:");
        if (this.f8592c) {
            sb2.append(" fromLayout");
        }
        if (this.f8593d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f8595f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f8595f));
        }
        String str = this.f8596g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f8596g);
        }
        if (this.f8597h) {
            sb2.append(" retainInstance");
        }
        if (this.f8598i) {
            sb2.append(" removing");
        }
        if (this.f8599j) {
            sb2.append(" detached");
        }
        if (this.f8600k) {
            sb2.append(" hidden");
        }
        if (this.f8602m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f8602m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f8603n);
        }
        if (this.f8604o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f8590a);
        parcel.writeString(this.f8591b);
        parcel.writeInt(this.f8592c ? 1 : 0);
        parcel.writeInt(this.f8593d ? 1 : 0);
        parcel.writeInt(this.f8594e);
        parcel.writeInt(this.f8595f);
        parcel.writeString(this.f8596g);
        parcel.writeInt(this.f8597h ? 1 : 0);
        parcel.writeInt(this.f8598i ? 1 : 0);
        parcel.writeInt(this.f8599j ? 1 : 0);
        parcel.writeInt(this.f8600k ? 1 : 0);
        parcel.writeInt(this.f8601l);
        parcel.writeString(this.f8602m);
        parcel.writeInt(this.f8603n);
        parcel.writeInt(this.f8604o ? 1 : 0);
    }

    o0(Parcel parcel) {
        this.f8590a = parcel.readString();
        this.f8591b = parcel.readString();
        this.f8592c = parcel.readInt() != 0;
        this.f8593d = parcel.readInt() != 0;
        this.f8594e = parcel.readInt();
        this.f8595f = parcel.readInt();
        this.f8596g = parcel.readString();
        this.f8597h = parcel.readInt() != 0;
        this.f8598i = parcel.readInt() != 0;
        this.f8599j = parcel.readInt() != 0;
        this.f8600k = parcel.readInt() != 0;
        this.f8601l = parcel.readInt();
        this.f8602m = parcel.readString();
        this.f8603n = parcel.readInt();
        this.f8604o = parcel.readInt() != 0;
    }
}
