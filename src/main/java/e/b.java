package e;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f61262a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f61263b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e.a f61264c;

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

    /* JADX INFO: renamed from: e.b$b, reason: collision with other inner class name */
    class BinderC1253b extends e.a.AbstractBinderC1251a {
        BinderC1253b() {
        }

        @Override // e.a
        public void x0(int i11, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f61263b;
            if (handler != null) {
                handler.post(bVar.new c(i11, bundle));
            } else {
                bVar.a(i11, bundle);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f61266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f61267b;

        c(int i11, Bundle bundle) {
            this.f61266a = i11;
            this.f61267b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f61266a, this.f61267b);
        }
    }

    b(Parcel parcel) {
        this.f61264c = e.a.AbstractBinderC1251a.R2(parcel.readStrongBinder());
    }

    public void b(int i11, Bundle bundle) {
        if (this.f61262a) {
            Handler handler = this.f61263b;
            if (handler != null) {
                handler.post(new c(i11, bundle));
                return;
            } else {
                a(i11, bundle);
                return;
            }
        }
        e.a aVar = this.f61264c;
        if (aVar != null) {
            try {
                aVar.x0(i11, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        synchronized (this) {
            try {
                if (this.f61264c == null) {
                    this.f61264c = new BinderC1253b();
                }
                parcel.writeStrongBinder(this.f61264c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void a(int i11, Bundle bundle) {
    }
}
