package ha;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {
    void A(CharSequence charSequence);

    void D2(p pVar);

    void W0(k kVar);

    void k();

    void n(List<l.h> list);

    void o();

    void o1(o oVar);

    void onEvent(String str, Bundle bundle);

    void onRepeatModeChanged(int i11);

    void u(int i11);

    void x(Bundle bundle);

    void y(boolean z11);

    void z(boolean z11);

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: ha.b$a$a, reason: collision with other inner class name */
        private static class C1510a implements b {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static b f72203o;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f72204n;

            C1510a(IBinder iBinder) {
                this.f72204n = iBinder;
            }

            @Override // ha.b
            public void D2(p pVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (pVar != null) {
                        parcelObtain.writeInt(1);
                        pVar.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f72204n.transact(3, parcelObtain, null, 1) || a.S2() == null) {
                        return;
                    }
                    ((b) s7.a.f(a.S2())).D2(pVar);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f72204n;
            }

            @Override // ha.b
            public void onEvent(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f72204n.transact(1, parcelObtain, null, 1) || a.S2() == null) {
                        return;
                    }
                    ((b) s7.a.f(a.S2())).onEvent(str, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ha.b
            public void onRepeatModeChanged(int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i11);
                    if (this.f72204n.transact(9, parcelObtain, null, 1) || a.S2() == null) {
                        return;
                    }
                    ((b) s7.a.f(a.S2())).onRepeatModeChanged(i11);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // ha.b
            public void u(int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i11);
                    if (this.f72204n.transact(12, parcelObtain, null, 1) || a.S2() == null) {
                        return;
                    }
                    ((b) s7.a.f(a.S2())).u(i11);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static b R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C1510a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b S2() {
            return C1510a.f72203o;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1598968902) {
                ((Parcel) s7.a.f(parcel2)).writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i11) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onEvent(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    o();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    D2(parcel.readInt() != 0 ? p.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    W0(parcel.readInt() != 0 ? k.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    n(parcel.createTypedArrayList(l.h.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    A(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    x(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    o1(parcel.readInt() != 0 ? o.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    z(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    y(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    u(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    k();
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
