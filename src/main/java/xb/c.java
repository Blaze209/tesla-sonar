package xb;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.a0;
import java.util.concurrent.TimeUnit;
import sb.c2;
import tb.v;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.e f123162a;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(androidx.work.e eVar) {
        this.f123162a = eVar;
    }

    public androidx.work.e a() {
        return this.f123162a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(c2.h(this.f123162a.getRequiredNetworkType()));
        b.c(parcel, this.f123162a.getRequiresBatteryNotLow());
        b.c(parcel, this.f123162a.getRequiresCharging());
        b.c(parcel, this.f123162a.getRequiresStorageNotLow());
        b.c(parcel, this.f123162a.getRequiresDeviceIdle());
        int i12 = Build.VERSION.SDK_INT;
        boolean zG = this.f123162a.g();
        b.c(parcel, zG);
        if (zG) {
            parcel.writeByteArray(c2.j(this.f123162a.c()));
        }
        parcel.writeLong(this.f123162a.getContentTriggerMaxDelayMillis());
        parcel.writeLong(this.f123162a.getContentTriggerUpdateDelayMillis());
        if (i12 >= 28) {
            NetworkRequest networkRequestD = this.f123162a.d();
            boolean z11 = networkRequestD != null;
            b.c(parcel, z11);
            if (z11) {
                parcel.writeIntArray(v.b(networkRequestD));
                parcel.writeIntArray(v.c(networkRequestD));
            }
        }
    }

    public c(Parcel parcel) {
        androidx.work.e.a aVar = new androidx.work.e.a();
        aVar.d(c2.e(parcel.readInt()));
        aVar.e(b.a(parcel));
        aVar.f(b.a(parcel));
        aVar.h(b.a(parcel));
        aVar.g(b.a(parcel));
        if (b.a(parcel)) {
            for (androidx.work.e.c cVar : c2.b(parcel.createByteArray())) {
                aVar.a(cVar.getUri(), cVar.getIsTriggeredForDescendants());
            }
        }
        long j11 = parcel.readLong();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.i(j11, timeUnit);
        aVar.j(parcel.readLong(), timeUnit);
        if (Build.VERSION.SDK_INT >= 28 && b.a(parcel)) {
            aVar.c(tb.r.a(parcel.createIntArray(), parcel.createIntArray()), a0.NOT_REQUIRED);
        }
        this.f123162a = aVar.b();
    }
}
