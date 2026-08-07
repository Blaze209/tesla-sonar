package xb;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.u0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import lb.g1;
import sb.c2;
import sb.m0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f123188a;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i11) {
            return new p[i11];
        }
    }

    public p(u0 u0Var) {
        this.f123188a = u0Var;
    }

    public u0 a() {
        return this.f123188a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f123188a.b());
        parcel.writeStringList(new ArrayList(this.f123188a.c()));
        m0 workSpec = this.f123188a.getWorkSpec();
        parcel.writeString(workSpec.workerClassName);
        parcel.writeString(workSpec.inputMergerClassName);
        parcel.writeInt(c2.k(workSpec.state));
        new d(workSpec.input).writeToParcel(parcel, i11);
        new d(workSpec.output).writeToParcel(parcel, i11);
        parcel.writeLong(workSpec.initialDelay);
        parcel.writeLong(workSpec.intervalDuration);
        parcel.writeLong(workSpec.flexDuration);
        parcel.writeInt(workSpec.runAttemptCount);
        parcel.writeParcelable(new c(workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String), i11);
        parcel.writeInt(c2.a(workSpec.backoffPolicy));
        parcel.writeLong(workSpec.backoffDelayDuration);
        parcel.writeLong(workSpec.minimumRetentionDuration);
        parcel.writeLong(workSpec.scheduleRequestedAt);
        b.c(parcel, workSpec.expedited);
        parcel.writeInt(c2.i(workSpec.outOfQuotaPolicy));
        parcel.writeString(workSpec.getTraceTag());
    }

    protected p(Parcel parcel) {
        String string = parcel.readString();
        HashSet hashSet = new HashSet(parcel.createStringArrayList());
        m0 m0Var = new m0(string, parcel.readString());
        m0Var.inputMergerClassName = parcel.readString();
        m0Var.state = c2.g(parcel.readInt());
        m0Var.input = new d(parcel).getData();
        m0Var.output = new d(parcel).getData();
        m0Var.initialDelay = parcel.readLong();
        m0Var.intervalDuration = parcel.readLong();
        m0Var.flexDuration = parcel.readLong();
        m0Var.runAttemptCount = parcel.readInt();
        m0Var.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String = ((c) parcel.readParcelable(getClass().getClassLoader())).a();
        m0Var.backoffPolicy = c2.d(parcel.readInt());
        m0Var.backoffDelayDuration = parcel.readLong();
        m0Var.minimumRetentionDuration = parcel.readLong();
        m0Var.scheduleRequestedAt = parcel.readLong();
        m0Var.expedited = b.a(parcel);
        m0Var.outOfQuotaPolicy = c2.f(parcel.readInt());
        m0Var.u(parcel.readString());
        this.f123188a = new g1(UUID.fromString(string), m0Var, hashSet);
    }
}
