package xb;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.e0;
import lb.e1;
import lb.g1;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class l implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f123179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.work.l[] f123178b = androidx.work.l.values();
    public static final Parcelable.Creator<l> CREATOR = new a();

    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    public l(e0 e0Var) {
        this.f123179a = new b(e0Var);
    }

    public b a() {
        return this.f123179a;
    }

    public e0 b(e1 e1Var) {
        return this.f123179a.f(e1Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String strB = this.f123179a.b();
        boolean zIsEmpty = TextUtils.isEmpty(strB);
        xb.b.c(parcel, !zIsEmpty);
        if (!zIsEmpty) {
            parcel.writeString(strB);
        }
        parcel.writeInt(this.f123179a.a().ordinal());
        List<? extends u0> listD = this.f123179a.d();
        parcel.writeInt(listD.size());
        if (!listD.isEmpty()) {
            for (int i12 = 0; i12 < listD.size(); i12++) {
                parcel.writeParcelable(new p(listD.get(i12)), i11);
            }
        }
        List<b> listC = this.f123179a.c();
        boolean z11 = (listC == null || listC.isEmpty()) ? false : true;
        xb.b.c(parcel, z11);
        if (z11) {
            parcel.writeInt(listC.size());
            for (int i13 = 0; i13 < listC.size(); i13++) {
                parcel.writeParcelable(new l(listC.get(i13)), i11);
            }
        }
    }

    public l(b bVar) {
        this.f123179a = bVar;
    }

    protected l(Parcel parcel) {
        ArrayList arrayList = null;
        String string = xb.b.a(parcel) ? parcel.readString() : null;
        androidx.work.l lVar = f123178b[parcel.readInt()];
        int i11 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(i11);
        ClassLoader classLoader = getClass().getClassLoader();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList2.add((g1) ((p) parcel.readParcelable(classLoader)).a());
        }
        if (xb.b.a(parcel)) {
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList3.add(((l) parcel.readParcelable(classLoader)).a());
            }
            arrayList = arrayList3;
        }
        this.f123179a = new b(string, lVar, arrayList2, arrayList);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f123180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.work.l f123181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<? extends u0> f123182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<b> f123183d;

        public b(e0 e0Var) {
            this.f123180a = e0Var.e();
            this.f123181b = e0Var.c();
            this.f123182c = e0Var.g();
            List<e0> listF = e0Var.f();
            this.f123183d = null;
            if (listF != null) {
                this.f123183d = new ArrayList(listF.size());
                Iterator<e0> it = listF.iterator();
                while (it.hasNext()) {
                    this.f123183d.add(new b(it.next()));
                }
            }
        }

        private static List<e0> e(e1 e1Var, List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (b bVar : list) {
                arrayList.add(new e0(e1Var, bVar.b(), bVar.a(), bVar.d(), e(e1Var, bVar.c())));
            }
            return arrayList;
        }

        public androidx.work.l a() {
            return this.f123181b;
        }

        public String b() {
            return this.f123180a;
        }

        public List<b> c() {
            return this.f123183d;
        }

        public List<? extends u0> d() {
            return this.f123182c;
        }

        public e0 f(e1 e1Var) {
            return new e0(e1Var, b(), a(), d(), e(e1Var, c()));
        }

        public b(String str, androidx.work.l lVar, List<? extends u0> list, List<b> list2) {
            this.f123180a = str;
            this.f123181b = lVar;
            this.f123182c = list;
            this.f123183d = list2;
        }
    }
}
