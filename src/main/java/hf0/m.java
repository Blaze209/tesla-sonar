package hf0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import vc0.h3;

/* JADX INFO: loaded from: classes8.dex */
public class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public Boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f72668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f72669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f72670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f72671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f72672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f72673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f72674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f72675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f72676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public String[] f72677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f72678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f72679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f72680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f72681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f72682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f72683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f72684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f72685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f72686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f72687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f72688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f72689v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f72690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public Set<String> f72691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f72692y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h3 f72693z;

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

    public m() {
        this.f72677j = new String[0];
        this.f72691x = new HashSet();
        this.f72693z = h3.VEHICLE_SLEEP_STATUS_UNKNOWN;
    }

    public Bundle a() {
        if (b() != bc0.a.f17002o0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("view", "vehicle_phone_key_screen");
        bundle.putString("vin", this.f72682o);
        return bundle;
    }

    public int b() {
        int i11 = bc0.a.f17002o0;
        if (!this.f72688u) {
            return bc0.a.f16992j0;
        }
        g gVar = this.f72690w;
        if (gVar == null) {
            return i11;
        }
        int i12 = bc0.a.f16998m0;
        if (!gVar.f72654b) {
            return i12;
        }
        int i13 = bc0.a.f16996l0;
        if (!this.f72689v || this.f72691x.size() <= 0) {
            return i13;
        }
        return this.f72683p ? bc0.a.f16994k0 : bc0.a.f17000n0;
    }

    public void c(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, Integer num5) {
        if (num != null) {
            this.f72668a = num;
        }
        if (num2 != null) {
            this.f72669b = num2;
        }
        if (num3 != null) {
            this.f72670c = num3;
        }
        if (num4 != null) {
            this.f72671d = num4;
        }
        if (bool != null) {
            this.f72674g = bool;
        }
        if (bool2 != null) {
            this.f72675h = bool2;
        }
        if (bool3 != null) {
            this.f72676i = bool3;
        }
        if (num5 != null) {
            this.f72672e = num5;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f72668a);
        parcel.writeSerializable(this.f72669b);
        parcel.writeSerializable(this.f72670c);
        parcel.writeSerializable(this.f72671d);
        parcel.writeSerializable(this.f72672e);
        parcel.writeSerializable(this.f72673f);
        parcel.writeSerializable(this.f72674g);
        parcel.writeSerializable(this.f72675h);
        parcel.writeSerializable(this.f72676i);
        parcel.writeByte(this.f72678k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f72679l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f72680m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f72681n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f72682o);
        parcel.writeByte(this.f72683p ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f72684q);
        parcel.writeInt(this.f72685r);
        parcel.writeStringArray(this.f72677j);
        parcel.writeDouble(this.f72686s);
        parcel.writeDouble(this.f72687t);
        parcel.writeByte(this.f72688u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f72689v ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f72690w, i11);
        parcel.writeInt(this.f72691x.size());
        Iterator<String> it = this.f72691x.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        parcel.writeSerializable(this.f72692y);
        parcel.writeSerializable(this.f72693z);
        parcel.writeSerializable(this.A);
    }

    protected m(Parcel parcel) {
        this.f72677j = new String[0];
        this.f72691x = new HashSet();
        this.f72693z = h3.VEHICLE_SLEEP_STATUS_UNKNOWN;
        this.f72668a = (Integer) parcel.readSerializable();
        this.f72669b = (Integer) parcel.readSerializable();
        this.f72670c = (Integer) parcel.readSerializable();
        this.f72671d = (Integer) parcel.readSerializable();
        this.f72672e = (Integer) parcel.readSerializable();
        this.f72673f = (Integer) parcel.readSerializable();
        this.f72674g = (Boolean) parcel.readSerializable();
        this.f72675h = (Boolean) parcel.readSerializable();
        this.f72676i = (Boolean) parcel.readSerializable();
        this.f72678k = parcel.readByte() != 0;
        this.f72679l = parcel.readByte() != 0;
        this.f72680m = parcel.readByte() != 0;
        this.f72681n = parcel.readByte() != 0;
        this.f72682o = parcel.readString();
        this.f72683p = parcel.readByte() != 0;
        this.f72684q = parcel.readLong();
        this.f72685r = parcel.readInt();
        this.f72677j = parcel.createStringArray();
        this.f72686s = parcel.readDouble();
        this.f72687t = parcel.readDouble();
        this.f72688u = parcel.readByte() != 0;
        this.f72689v = parcel.readByte() != 0;
        this.f72690w = (g) parcel.readParcelable(g.class.getClassLoader());
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f72691x.add(parcel.readString());
        }
        this.f72692y = (Boolean) parcel.readSerializable();
        this.f72693z = (h3) parcel.readSerializable();
        this.A = (Boolean) parcel.readSerializable();
    }
}
