package q80;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements q, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f104921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f104922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f104923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Map<q.a, b> f104924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Map<String, b> f104925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f104926f;

    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i11) {
            return new m[i11];
        }
    }

    private boolean j(@NonNull m mVar) {
        return v80.c.a(this.f104921a, mVar.f104921a) && v80.c.a(this.f104926f, mVar.f104926f) && v80.c.a(this.f104922b, mVar.f104922b) && v80.c.a(this.f104923c, mVar.f104923c) && v80.c.a(this.f104924d, mVar.f104924d) && v80.c.a(this.f104925e, mVar.f104925e);
    }

    @Override // q80.q
    public String a() {
        return this.f104926f;
    }

    @Override // q80.q
    public o b() {
        return this.f104923c;
    }

    @Override // q80.q
    public b c(@NonNull q.a aVar) {
        return this.f104924d.get(aVar);
    }

    @Override // q80.q
    public d d() {
        return this.f104922b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public p e() {
        return this.f104921a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && j((m) obj);
        }
        return true;
    }

    public void f(@NonNull String str) {
        this.f104926f = v80.a.e(str);
    }

    public void g(@NonNull b bVar, @NonNull q.a aVar) {
        this.f104924d.put(aVar, bVar);
    }

    public void h(@NonNull d dVar) {
        this.f104922b = dVar;
    }

    public int hashCode() {
        return v80.c.b(this.f104921a, this.f104926f, this.f104922b, this.f104923c, this.f104924d, this.f104925e);
    }

    public void i(@NonNull p pVar) {
        this.f104921a = pVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeString(this.f104926f);
        parcel.writeParcelable((k) this.f104921a, 0);
        parcel.writeParcelable((g) this.f104922b, 0);
        parcel.writeParcelable((i) this.f104923c, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry<q.a, b> entry : this.f104924d.entrySet()) {
            bundle.putParcelable(entry.getKey().name(), (e) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, b> entry2 : this.f104925e.entrySet()) {
            bundle2.putParcelable(entry2.getKey(), (e) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public m() {
        this.f104924d = new EnumMap(q.a.class);
        this.f104925e = new HashMap();
    }

    private m(Parcel parcel) {
        this.f104926f = parcel.readString();
        this.f104921a = (p) parcel.readParcelable(k.class.getClassLoader());
        this.f104922b = (d) parcel.readParcelable(g.class.getClassLoader());
        this.f104923c = (o) parcel.readParcelable(i.class.getClassLoader());
        this.f104924d = new HashMap();
        Bundle bundle = parcel.readBundle(m.class.getClassLoader());
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                b bVar = (b) q5.c.a(bundle, str, b.class);
                if (bVar != null) {
                    this.f104924d.put(q.a.valueOf(str), bVar);
                }
            }
        }
        this.f104925e = new HashMap();
        Bundle bundle2 = parcel.readBundle(m.class.getClassLoader());
        if (bundle2 != null) {
            for (String str2 : bundle2.keySet()) {
                b bVar2 = (b) q5.c.a(bundle2, str2, b.class);
                if (bVar2 != null) {
                    this.f104925e.put(str2, bVar2);
                }
            }
        }
    }
}
