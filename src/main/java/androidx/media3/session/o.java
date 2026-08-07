package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
public interface o extends IInterface {

    public static abstract class a extends Binder implements o {

        /* JADX INFO: renamed from: androidx.media3.session.o$a$a, reason: collision with other inner class name */
        private static class C0209a implements o {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f12078n;

            C0209a(IBinder iBinder) {
                this.f12078n = iBinder;
            }

            @Override // androidx.media3.session.o
            public void A0(n nVar, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f12078n.transact(3017, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void B2(n nVar, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f12078n.transact(3052, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void C0(n nVar, int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f12078n.transact(3027, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void C1(n nVar, int i11, Bundle bundle, boolean z11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f12078n.transact(3057, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void C2(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3040, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void D0(n nVar, int i11, int i12, int i13, int i14) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeInt(i14);
                    this.f12078n.transact(3023, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void D1(n nVar, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f12078n.transact(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void E(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(AuthApiStatusCodes.AUTH_TOKEN_ERROR, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void E1(n nVar, int i11, IBinder iBinder, boolean z11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f12078n.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void F(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3025, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void F0(n nVar, int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f12078n.transact(3033, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void F1(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3042, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void H1(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3047, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void I2(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(AuthApiStatusCodes.AUTH_URL_RESOLUTION, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void L0(n nVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    this.f12078n.transact(3045, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void M0(n nVar, int i11, int i12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    this.f12078n.transact(3020, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void O1(n nVar, int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f12078n.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void Q2(n nVar, int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f12078n.transact(3048, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void R1(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3046, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void T0(n nVar, int i11, Bundle bundle, boolean z11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f12078n.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void U0(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3034, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void U1(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3036, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void Y0(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3041, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void a1(n nVar, int i11, int i12, int i13, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f12078n.transact(3056, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void a2(n nVar, int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f12078n.transact(3014, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12078n;
            }

            @Override // androidx.media3.session.o
            public void b1(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3024, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void c1(n nVar, int i11, boolean z11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f12078n.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void c2(n nVar, int i11, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f12078n.transact(3031, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void d2(n nVar, int i11, int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    b.d(parcelObtain, bundle, 0);
                    this.f12078n.transact(3030, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void e2(n nVar, int i11, int i12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    this.f12078n.transact(3051, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void f2(n nVar, int i11, boolean z11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f12078n.transact(AuthApiStatusCodes.AUTH_APP_CERT_ERROR, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void i0(n nVar, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f12078n.transact(3053, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void i1(n nVar, int i11, boolean z11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    parcelObtain.writeInt(i12);
                    this.f12078n.transact(3054, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void i2(n nVar, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f12078n.transact(3037, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void j1(n nVar, int i11, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    b.d(parcelObtain, bundle2, 0);
                    this.f12078n.transact(3016, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void j2(n nVar, int i11, int i12, long j11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeLong(j11);
                    this.f12078n.transact(3039, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void k0(n nVar, int i11, Bundle bundle, long j11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    parcelObtain.writeLong(j11);
                    this.f12078n.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void k1(n nVar, int i11, IBinder iBinder, int i12, long j11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeLong(j11);
                    this.f12078n.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void l0(n nVar, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f12078n.transact(3019, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void m0(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3043, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void n0(n nVar, int i11, long j11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeLong(j11);
                    this.f12078n.transact(3038, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void o2(n nVar, int i11, Surface surface) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, surface, 0);
                    this.f12078n.transact(3044, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void p2(n nVar, int i11, int i12, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f12078n.transact(3032, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void q0(n nVar, int i11, float f11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeFloat(f11);
                    this.f12078n.transact(AuthApiStatusCodes.AUTH_API_CLIENT_ERROR, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void r0(n nVar, int i11, int i12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    this.f12078n.transact(3022, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void r2(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3026, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void s1(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3021, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void t0(n nVar, int i11, float f11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeFloat(f11);
                    this.f12078n.transact(3028, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void u0(n nVar, int i11, int i12, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    b.d(parcelObtain, bundle, 0);
                    this.f12078n.transact(3055, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void y1(n nVar, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    this.f12078n.transact(3035, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.o
            public void z1(n nVar, int i11, boolean z11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(nVar);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f12078n.transact(3018, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.media3.session.IMediaSession");
        }

        public static o R2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o)) ? new C0209a(iBinder) : (o) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaSession");
            }
            if (i11 == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaSession");
                return true;
            }
            switch (i11) {
                case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                    q0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                    D1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                    E(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case AuthApiStatusCodes.AUTH_URL_RESOLUTION /* 3005 */:
                    I2(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case AuthApiStatusCodes.AUTH_APP_CERT_ERROR /* 3006 */:
                    f2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3007:
                    v1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3008:
                    k0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readLong());
                    return true;
                case 3009:
                    T0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3010:
                    b0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3011:
                    E1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                    return true;
                case 3012:
                    k1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3013:
                    c1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3014:
                    a2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3015:
                    O1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3016:
                    n nVarR2 = n.a.R2(parcel.readStrongBinder());
                    int i13 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    j1(nVarR2, i13, (Bundle) b.c(parcel, creator), (Bundle) b.c(parcel, creator));
                    return true;
                case 3017:
                    A0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3018:
                    z1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3019:
                    l0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3020:
                    M0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3021:
                    s1(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3022:
                    r0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3023:
                    D0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3024:
                    b1(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3025:
                    F(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3026:
                    r2(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3027:
                    C0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3028:
                    t0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3029:
                    f0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3030:
                    d2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3031:
                    c2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3032:
                    p2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3033:
                    F0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3034:
                    U0(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3035:
                    y1(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3036:
                    U1(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3037:
                    i2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3038:
                    n0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    return true;
                case 3039:
                    j2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3040:
                    C2(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3041:
                    Y0(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3042:
                    F1(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3043:
                    m0(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3044:
                    o2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Surface) b.c(parcel, Surface.CREATOR));
                    return true;
                case 3045:
                    L0(n.a.R2(parcel.readStrongBinder()));
                    return true;
                case 3046:
                    R1(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3047:
                    H1(n.a.R2(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3048:
                    Q2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3049:
                    V0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3050:
                    X1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3051:
                    e2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3052:
                    B2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3053:
                    i0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3054:
                    i1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case 3055:
                    u0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3056:
                    a1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3057:
                    C1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                default:
                    switch (i11) {
                        case 4001:
                            O(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4002:
                            g2(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case 4003:
                            K0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4004:
                            g0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4005:
                            a0(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4006:
                            V1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4007:
                            p1(n.a.R2(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        default:
                            return super.onTransact(i11, parcel, parcel2, i12);
                    }
            }
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t11, int i11) {
            if (t11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t11.writeToParcel(parcel, i11);
            }
        }
    }

    void A0(n nVar, int i11, int i12);

    void B2(n nVar, int i11, int i12);

    void C0(n nVar, int i11, Bundle bundle);

    void C1(n nVar, int i11, Bundle bundle, boolean z11);

    void C2(n nVar, int i11);

    void D0(n nVar, int i11, int i12, int i13, int i14);

    void D1(n nVar, int i11, int i12);

    void E(n nVar, int i11);

    void E1(n nVar, int i11, IBinder iBinder, boolean z11);

    void F(n nVar, int i11);

    void F0(n nVar, int i11, Bundle bundle);

    void F1(n nVar, int i11);

    void H1(n nVar, int i11);

    void I2(n nVar, int i11);

    void K0(n nVar, int i11, String str, int i12, int i13, Bundle bundle);

    void L0(n nVar);

    void M0(n nVar, int i11, int i12, int i13);

    void O(n nVar, int i11, Bundle bundle);

    void O1(n nVar, int i11, Bundle bundle);

    void Q2(n nVar, int i11, Bundle bundle);

    void R1(n nVar, int i11);

    void T0(n nVar, int i11, Bundle bundle, boolean z11);

    void U0(n nVar, int i11);

    void U1(n nVar, int i11);

    void V0(n nVar, int i11, String str, Bundle bundle);

    void V1(n nVar, int i11, String str, Bundle bundle);

    void X1(n nVar, int i11, Bundle bundle);

    void Y0(n nVar, int i11);

    void a0(n nVar, int i11, String str, int i12, int i13, Bundle bundle);

    void a1(n nVar, int i11, int i12, int i13, IBinder iBinder);

    void a2(n nVar, int i11, Bundle bundle);

    void b0(n nVar, int i11, IBinder iBinder);

    void b1(n nVar, int i11);

    void c1(n nVar, int i11, boolean z11);

    void c2(n nVar, int i11, IBinder iBinder);

    void d2(n nVar, int i11, int i12, Bundle bundle);

    void e2(n nVar, int i11, int i12, int i13);

    void f0(n nVar, int i11, Bundle bundle);

    void f2(n nVar, int i11, boolean z11);

    void g0(n nVar, int i11, String str, Bundle bundle);

    void g2(n nVar, int i11, String str);

    void i0(n nVar, int i11, int i12);

    void i1(n nVar, int i11, boolean z11, int i12);

    void i2(n nVar, int i11, int i12);

    void j1(n nVar, int i11, Bundle bundle, Bundle bundle2);

    void j2(n nVar, int i11, int i12, long j11);

    void k0(n nVar, int i11, Bundle bundle, long j11);

    void k1(n nVar, int i11, IBinder iBinder, int i12, long j11);

    void l0(n nVar, int i11, int i12);

    void m0(n nVar, int i11);

    void n0(n nVar, int i11, long j11);

    void o2(n nVar, int i11, Surface surface);

    void p1(n nVar, int i11, String str);

    void p2(n nVar, int i11, int i12, IBinder iBinder);

    void q0(n nVar, int i11, float f11);

    void r0(n nVar, int i11, int i12, int i13);

    void r2(n nVar, int i11);

    void s1(n nVar, int i11);

    void t0(n nVar, int i11, float f11);

    void u0(n nVar, int i11, int i12, Bundle bundle);

    void v1(n nVar, int i11, Bundle bundle);

    void y1(n nVar, int i11);

    void z1(n nVar, int i11, boolean z11);
}
