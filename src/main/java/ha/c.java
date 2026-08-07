package ha;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface c extends IInterface {
    List<l.h> B();

    boolean B0();

    void B1(Uri uri, Bundle bundle);

    void D(String str, Bundle bundle);

    boolean G();

    boolean G1(KeyEvent keyEvent);

    void H(Uri uri, Bundle bundle);

    PendingIntent J();

    void L1(j jVar, int i11);

    void Q0(boolean z11);

    void R(String str, Bundle bundle);

    void T(String str, Bundle bundle);

    void T1(q qVar);

    void V(b bVar);

    void W1(long j11);

    void b();

    void d();

    void d0(int i11);

    String e();

    void e1(q qVar, Bundle bundle);

    void f();

    o f1();

    p g();

    Bundle getExtras();

    k getMetadata();

    String getTag();

    int h();

    void h2(int i11, int i12, String str);

    void i(int i11);

    long j();

    void j0(boolean z11);

    void l(float f11);

    void l2(String str, Bundle bundle);

    void m();

    void next();

    void o0(j jVar);

    boolean p();

    void previous();

    void q(j jVar);

    void q2();

    CharSequence r();

    int s();

    void s2(String str, Bundle bundle, l.i iVar);

    void seekTo(long j11);

    void stop();

    int t();

    void t1(b bVar);

    void v(int i11);

    Bundle w1();

    void x1(String str, Bundle bundle);

    void z2(int i11, int i12, String str);

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: ha.c$a$a, reason: collision with other inner class name */
        private static class C1511a implements c {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static c f72205o;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f72206n;

            C1511a(IBinder iBinder) {
                this.f72206n = iBinder;
            }

            @Override // ha.c
            public void V(b bVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f72206n.transact(3, parcelObtain, parcelObtain2, 0) || a.S2() == null) {
                        parcelObtain2.readException();
                    } else {
                        ((c) s7.a.f(a.S2())).V(bVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f72206n;
            }

            @Override // ha.c
            public p g() {
                p pVarCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f72206n.transact(28, parcelObtain, parcelObtain2, 0) || a.S2() == null) {
                        parcelObtain2.readException();
                        pVarCreateFromParcel = parcelObtain2.readInt() != 0 ? p.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        pVarCreateFromParcel = ((c) s7.a.f(a.S2())).g();
                    }
                    return pVarCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ha.c
            public int h() {
                int iH;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f72206n.transact(37, parcelObtain, parcelObtain2, 0) || a.S2() == null) {
                        parcelObtain2.readException();
                        iH = parcelObtain2.readInt();
                    } else {
                        iH = ((c) s7.a.f(a.S2())).h();
                    }
                    return iH;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ha.c
            public boolean p() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f72206n.transact(45, parcelObtain, parcelObtain2, 0) && a.S2() != null) {
                        return ((c) s7.a.f(a.S2())).p();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ha.c
            public int s() {
                int iS;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f72206n.transact(32, parcelObtain, parcelObtain2, 0) || a.S2() == null) {
                        parcelObtain2.readException();
                        iS = parcelObtain2.readInt();
                    } else {
                        iS = ((c) s7.a.f(a.S2())).s();
                    }
                    return iS;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ha.c
            public int t() {
                int iT;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f72206n.transact(47, parcelObtain, parcelObtain2, 0) || a.S2() == null) {
                        parcelObtain2.readException();
                        iT = parcelObtain2.readInt();
                    } else {
                        iT = ((c) s7.a.f(a.S2())).t();
                    }
                    return iT;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ha.c
            public void t1(b bVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f72206n.transact(4, parcelObtain, parcelObtain2, 0) || a.S2() == null) {
                        parcelObtain2.readException();
                    } else {
                        ((c) s7.a.f(a.S2())).t1(bVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static c R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C1511a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        public static c S2() {
            return C1511a.f72205o;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1598968902) {
                ((Parcel) s7.a.f(parcel2)).writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i11) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    s2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? l.i.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zG1 = G1(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeInt(zG1 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    V(b.a.R2(parcel.readStrongBinder()));
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    t1(b.a.R2(parcel.readStrongBinder()));
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zB0 = B0();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeInt(zB0 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strE = e();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeString(strE);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String tag = getTag();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentJ = J();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    if (pendingIntentJ != null) {
                        ((Parcel) s7.a.f(parcel2)).writeInt(1);
                        pendingIntentJ.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) s7.a.f(parcel2)).writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long j11 = j();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeLong(j11);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    o oVarF1 = f1();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    if (oVarF1 != null) {
                        ((Parcel) s7.a.f(parcel2)).writeInt(1);
                        oVarF1.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) s7.a.f(parcel2)).writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    z2(parcel.readInt(), parcel.readInt(), parcel.readString());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    h2(parcel.readInt(), parcel.readInt(), parcel.readString());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    f();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    T(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    x1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    B1(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    W1(parcel.readLong());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    d();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    q2();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    seekTo(parcel.readLong());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    T1(parcel.readInt() != 0 ? q.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    D(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    k metadata = getMetadata();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    if (metadata != null) {
                        ((Parcel) s7.a.f(parcel2)).writeInt(1);
                        metadata.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) s7.a.f(parcel2)).writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    p pVarG = g();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    if (pVarG != null) {
                        ((Parcel) s7.a.f(parcel2)).writeInt(1);
                        pVarG.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) s7.a.f(parcel2)).writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<l.h> listB = B();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeTypedList(listB);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceR = r();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    if (charSequenceR != null) {
                        ((Parcel) s7.a.f(parcel2)).writeInt(1);
                        TextUtils.writeToParcel(charSequenceR, parcel2, 1);
                    } else {
                        ((Parcel) s7.a.f(parcel2)).writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    if (extras != null) {
                        ((Parcel) s7.a.f(parcel2)).writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) s7.a.f(parcel2)).writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iS = s();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeInt(iS);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    R(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    l2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    H(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iH = h();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeInt(iH);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zG = G();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeInt(zG ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    i(parcel.readInt());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    j0(parcel.readInt() != 0);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    o0(parcel.readInt() != 0 ? j.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    L1(parcel.readInt() != 0 ? j.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    q(parcel.readInt() != 0 ? j.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    d0(parcel.readInt());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zP = p();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeInt(zP ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Q0(parcel.readInt() != 0);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iT = t();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    ((Parcel) s7.a.f(parcel2)).writeInt(iT);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    v(parcel.readInt());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    l(parcel.readFloat());
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleW1 = w1();
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    if (bundleW1 != null) {
                        ((Parcel) s7.a.f(parcel2)).writeInt(1);
                        bundleW1.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) s7.a.f(parcel2)).writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    e1(parcel.readInt() != 0 ? q.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) s7.a.f(parcel2)).writeNoException();
                    return true;
                default:
                    return super.onTransact(i11, parcel, parcel2, i12);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
