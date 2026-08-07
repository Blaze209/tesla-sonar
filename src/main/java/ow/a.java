package ow;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.f;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2126a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f100071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f100072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f100073c;

    /* JADX INFO: renamed from: ow.a$a, reason: collision with other inner class name */
    class C2126a implements Parcelable.Creator<a> {
        C2126a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@NonNull Parcel parcel) {
            return new a(parcel, (C2126a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, C2126a c2126a) {
        this(parcel);
    }

    public static PerfSession[] b(@NonNull List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        PerfSession[] perfSessionArr = new PerfSession[list.size()];
        PerfSession perfSessionA = list.get(0).a();
        boolean z11 = false;
        for (int i11 = 1; i11 < list.size(); i11++) {
            PerfSession perfSessionA2 = list.get(i11).a();
            if (z11 || !list.get(i11).g()) {
                perfSessionArr[i11] = perfSessionA2;
            } else {
                perfSessionArr[0] = perfSessionA2;
                perfSessionArr[i11] = perfSessionA;
                z11 = true;
            }
        }
        if (!z11) {
            perfSessionArr[0] = perfSessionA;
        }
        return perfSessionArr;
    }

    public static a c(@NonNull String str) {
        a aVar = new a(str.replace("-", ""), new com.google.firebase.perf.util.a());
        aVar.i(j());
        return aVar;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a aVarG = com.google.firebase.perf.config.a.g();
        return aVarG.K() && Math.random() < aVarG.D();
    }

    public PerfSession a() {
        PerfSession.c cVarH = PerfSession.newBuilder().h(this.f100071a);
        if (this.f100073c) {
            cVarH.a(f.GAUGES_AND_SYSTEM_EVENTS);
        }
        return cVarH.build();
    }

    public l d() {
        return this.f100072b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f100073c;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f100072b.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean g() {
        return this.f100073c;
    }

    public String h() {
        return this.f100071a;
    }

    public void i(boolean z11) {
        this.f100073c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeString(this.f100071a);
        parcel.writeByte(this.f100073c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f100072b, 0);
    }

    public a(String str, com.google.firebase.perf.util.a aVar) {
        this.f100073c = false;
        this.f100071a = str;
        this.f100072b = aVar.a();
    }

    private a(@NonNull Parcel parcel) {
        this.f100073c = false;
        this.f100071a = parcel.readString();
        this.f100073c = parcel.readByte() != 0;
        this.f100072b = (l) parcel.readParcelable(l.class.getClassLoader());
    }
}
