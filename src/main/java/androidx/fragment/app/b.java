package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f8472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<String> f8473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f8474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f8475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f8477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f8478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f8479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f8480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f8481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f8482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList<String> f8483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList<String> f8484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f8485n;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i11) {
            return new b[i11];
        }
    }

    b(androidx.fragment.app.a aVar) {
        int size = aVar.f8622c.size();
        this.f8472a = new int[size * 6];
        if (!aVar.f8628i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f8473b = new ArrayList<>(size);
        this.f8474c = new int[size];
        this.f8475d = new int[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            r0.a aVar2 = aVar.f8622c.get(i12);
            int i13 = i11 + 1;
            this.f8472a[i11] = aVar2.f8639a;
            ArrayList<String> arrayList = this.f8473b;
            Fragment fragment = aVar2.f8640b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f8472a;
            iArr[i13] = aVar2.f8641c ? 1 : 0;
            iArr[i11 + 2] = aVar2.f8642d;
            iArr[i11 + 3] = aVar2.f8643e;
            int i14 = i11 + 5;
            iArr[i11 + 4] = aVar2.f8644f;
            i11 += 6;
            iArr[i14] = aVar2.f8645g;
            this.f8474c[i12] = aVar2.f8646h.ordinal();
            this.f8475d[i12] = aVar2.f8647i.ordinal();
        }
        this.f8476e = aVar.f8627h;
        this.f8477f = aVar.f8630k;
        this.f8478g = aVar.f8445v;
        this.f8479h = aVar.f8631l;
        this.f8480i = aVar.f8632m;
        this.f8481j = aVar.f8633n;
        this.f8482k = aVar.f8634o;
        this.f8483l = aVar.f8635p;
        this.f8484m = aVar.f8636q;
        this.f8485n = aVar.f8637r;
    }

    private void a(@NonNull androidx.fragment.app.a aVar) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= this.f8472a.length) {
                aVar.f8627h = this.f8476e;
                aVar.f8630k = this.f8477f;
                aVar.f8628i = true;
                aVar.f8631l = this.f8479h;
                aVar.f8632m = this.f8480i;
                aVar.f8633n = this.f8481j;
                aVar.f8634o = this.f8482k;
                aVar.f8635p = this.f8483l;
                aVar.f8636q = this.f8484m;
                aVar.f8637r = this.f8485n;
                return;
            }
            r0.a aVar2 = new r0.a();
            int i13 = i11 + 1;
            aVar2.f8639a = this.f8472a[i11];
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i12 + " base fragment #" + this.f8472a[i13]);
            }
            aVar2.f8646h = Lifecycle.State.values()[this.f8474c[i12]];
            aVar2.f8647i = Lifecycle.State.values()[this.f8475d[i12]];
            int[] iArr = this.f8472a;
            int i14 = i11 + 2;
            if (iArr[i13] == 0) {
                z11 = false;
            }
            aVar2.f8641c = z11;
            int i15 = iArr[i14];
            aVar2.f8642d = i15;
            int i16 = iArr[i11 + 3];
            aVar2.f8643e = i16;
            int i17 = i11 + 5;
            int i18 = iArr[i11 + 4];
            aVar2.f8644f = i18;
            i11 += 6;
            int i19 = iArr[i17];
            aVar2.f8645g = i19;
            aVar.f8623d = i15;
            aVar.f8624e = i16;
            aVar.f8625f = i18;
            aVar.f8626g = i19;
            aVar.f(aVar2);
            i12++;
        }
    }

    @NonNull
    public androidx.fragment.app.a b(@NonNull FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.f8445v = this.f8478g;
        for (int i11 = 0; i11 < this.f8473b.size(); i11++) {
            String str = this.f8473b.get(i11);
            if (str != null) {
                aVar.f8622c.get(i11).f8640b = fragmentManager.k0(str);
            }
        }
        aVar.y(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.f8472a);
        parcel.writeStringList(this.f8473b);
        parcel.writeIntArray(this.f8474c);
        parcel.writeIntArray(this.f8475d);
        parcel.writeInt(this.f8476e);
        parcel.writeString(this.f8477f);
        parcel.writeInt(this.f8478g);
        parcel.writeInt(this.f8479h);
        TextUtils.writeToParcel(this.f8480i, parcel, 0);
        parcel.writeInt(this.f8481j);
        TextUtils.writeToParcel(this.f8482k, parcel, 0);
        parcel.writeStringList(this.f8483l);
        parcel.writeStringList(this.f8484m);
        parcel.writeInt(this.f8485n ? 1 : 0);
    }

    b(Parcel parcel) {
        this.f8472a = parcel.createIntArray();
        this.f8473b = parcel.createStringArrayList();
        this.f8474c = parcel.createIntArray();
        this.f8475d = parcel.createIntArray();
        this.f8476e = parcel.readInt();
        this.f8477f = parcel.readString();
        this.f8478g = parcel.readInt();
        this.f8479h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f8480i = (CharSequence) creator.createFromParcel(parcel);
        this.f8481j = parcel.readInt();
        this.f8482k = (CharSequence) creator.createFromParcel(parcel);
        this.f8483l = parcel.createStringArrayList();
        this.f8484m = parcel.createStringArrayList();
        this.f8485n = parcel.readInt() != 0;
    }
}
