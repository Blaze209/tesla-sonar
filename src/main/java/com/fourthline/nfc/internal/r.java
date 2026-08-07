package com.fourthline.nfc.internal;

import android.nfc.NfcAdapter;
import com.fourthline.core.location.LocationProvider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C2802a0 f24706a;

        public a a(C2802a0 c2802a0) {
            this.f24706a = (C2802a0) qj0.h.b(c2802a0);
            return this;
        }

        private a() {
        }

        public U a() {
            qj0.h.a(this.f24706a, C2802a0.class);
            return new b(this.f24706a);
        }
    }

    private static final class b implements U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2802a0 f24707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f24708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private qj0.i f24709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qj0.i f24710d;

        private void a(C2802a0 c2802a0) {
            C2814g0 c2814g0A = C2814g0.a(c2802a0);
            this.f24709c = c2814g0A;
            this.f24710d = qj0.d.e(C2818i0.a(c2802a0, c2814g0A));
        }

        private LocationProvider d() {
            C2802a0 c2802a0 = this.f24707a;
            return AbstractC2812f0.a(c2802a0, AbstractC2804b0.a(c2802a0));
        }

        private X e() {
            C2802a0 c2802a0 = this.f24707a;
            return AbstractC2816h0.a(c2802a0, AbstractC2810e0.a(c2802a0));
        }

        private I0 f() {
            return k0.a(this.f24707a, e());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.nfc.internal.U
        public G0 b() {
            return AbstractC2820j0.a(this.f24707a, f(), l0.a(this.f24707a), (v0) this.f24710d.get(), d(), AbstractC2808d0.a(this.f24707a), AbstractC2806c0.a(this.f24707a));
        }

        @Override // com.fourthline.nfc.internal.U
        public NfcAdapter c() {
            return this.f24707a.e();
        }

        private b(C2802a0 c2802a0) {
            this.f24708b = this;
            this.f24707a = c2802a0;
            a(c2802a0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.nfc.internal.U
        public v0 a() {
            return (v0) this.f24710d.get();
        }
    }

    public static a a() {
        return new a();
    }
}
