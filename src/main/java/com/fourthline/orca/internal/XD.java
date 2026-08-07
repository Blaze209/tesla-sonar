package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class XD {

    static final class b implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29718a;

        b(String str) {
            this.f29718a = str;
        }

        public final void a(v1.i it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(it, "it");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(454070337, i11, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen.<anonymous> (VisionScannerUploadScreen.kt:58)");
            }
            androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(32), 7, null);
            String str = this.f29718a;
            AbstractC3064ax.a(dVarM, str, str, lVar, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    static final class c implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Yj f29719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29720b;

        c(Yj yj2, String str) {
            this.f29719a = yj2;
            this.f29720b = str;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2114281259, i11, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen.<anonymous> (VisionScannerUploadScreen.kt:66)");
            }
            AbstractC3706py.a(null, this.f29719a, this.f29720b, lVar, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(String str, String str2, InterfaceC3903uh interfaceC3903uh, Bitmap bitmap, int i11, Yj yj2, boolean z11, int i12, int i13, p020r2.l lVar, int i14) {
        a(str, str2, interfaceC3903uh, bitmap, i11, yj2, z11, lVar, p020r2.k2.a(i12 | 1), i13);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:99:0x0192  */
    public static final void a(final String title, final String description, final InterfaceC3903uh closeImageSource, final Bitmap image, final int i11, final Yj spinnerLottieSource, boolean z11, p020r2.l lVar, final int i12, final int i13) {
        int i14;
        boolean z12;
        boolean z13;
        final boolean z14;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
        p013kotlin.jvm.internal.s.k(image, "image");
        p013kotlin.jvm.internal.s.k(spinnerLottieSource, "spinnerLottieSource");
        p020r2.l lVarV = lVar.v(-1654418745);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (lVarV.n(title) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= lVarV.n(description) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= KyberEngine.KyberPolyBytes;
        } else if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i14 |= (i12 & 512) == 0 ? lVarV.n(closeImageSource) : lVarV.K(closeImageSource) ? 256 : 128;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i14 |= lVarV.K(image) ? 2048 : 1024;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i12 & 24576) == 0) {
            i14 |= lVarV.r(i11) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i13 & 32) != 0) {
            i14 |= 196608;
        } else if ((i12 & 196608) == 0) {
            i14 |= (262144 & i12) == 0 ? lVarV.n(spinnerLottieSource) : lVarV.K(spinnerLottieSource) ? 131072 : 65536;
        }
        int i15 = i13 & 64;
        if (i15 == 0) {
            if ((1572864 & i12) == 0) {
                z12 = z11;
                i14 |= lVarV.p(z12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            if ((599187 & i14) == 599186 || !lVarV.b()) {
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1654418745, i14, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen (VisionScannerUploadScreen.kt:32)");
                }
                boolean z15 = z13;
                UD.a(null, C3825sp.f35377a.b(lVarV, 6).getScanner().getConfirmation().getBackground().a(lVarV, 0), null, closeImageSource, z2.c.e(-665983000, true, new a(i11, image, z13), lVarV, 54), z2.c.e(454070337, true, new b(title), lVarV, 54), C4100z4.f37194a.a(), z2.c.e(2114281259, true, new c(spinnerLottieSource, description), lVarV, 54), null, new Pair(Float.valueOf(1.5f), Float.valueOf(1.0f)), lVarV, ((i14 << 3) & 7168) | 14376960, EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z14 = z15;
            } else {
                lVarV.j();
                z14 = z12;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.tv0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return XD.a(title, description, closeImageSource, image, i11, spinnerLottieSource, z14, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 1572864;
        z12 = z11;
        if ((599187 & i14) == 599186) {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1654418745, i14, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen (VisionScannerUploadScreen.kt:32)");
            }
            boolean z16 = z13;
            UD.a(null, C3825sp.f35377a.b(lVarV, 6).getScanner().getConfirmation().getBackground().a(lVarV, 0), null, closeImageSource, z2.c.e(-665983000, true, new a(i11, image, z13), lVarV, 54), z2.c.e(454070337, true, new b(title), lVarV, 54), C4100z4.f37194a.a(), z2.c.e(2114281259, true, new c(spinnerLottieSource, description), lVarV, 54), null, new Pair(Float.valueOf(1.5f), Float.valueOf(1.0f)), lVarV, ((i14 << 3) & 7168) | 14376960, EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z14 = z16;
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1654418745, i14, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen (VisionScannerUploadScreen.kt:32)");
            }
            boolean z17 = z13;
            UD.a(null, C3825sp.f35377a.b(lVarV, 6).getScanner().getConfirmation().getBackground().a(lVarV, 0), null, closeImageSource, z2.c.e(-665983000, true, new a(i11, image, z13), lVarV, 54), z2.c.e(454070337, true, new b(title), lVarV, 54), C4100z4.f37194a.a(), z2.c.e(2114281259, true, new c(spinnerLottieSource, description), lVarV, 54), null, new Pair(Float.valueOf(1.5f), Float.valueOf(1.0f)), lVarV, ((i14 << 3) & 7168) | 14376960, EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z14 = z17;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.tv0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return XD.a(title, description, closeImageSource, image, i11, spinnerLottieSource, z14, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f29716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29717c;

        a(int i11, Bitmap bitmap, boolean z11) {
            this.f29715a = i11;
            this.f29716b = bitmap;
            this.f29717c = z11;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-665983000, i11, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen.<anonymous> (VisionScannerUploadScreen.kt:36)");
            }
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(androidx.compose.foundation.b.d(androidx.compose.ui.d.INSTANCE, k3.p1.INSTANCE.a(), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            if (this.f29717c) {
                dVarF = h3.k.b(dVarF, -1.0f, 1.0f);
            }
            lVar.o(-952200429);
            boolean zR = lVar.r(this.f29715a);
            final int i12 = this.f29715a;
            Object objI = lVar.I();
            if (zR || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.uv0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return XD.a.a(i12, (androidx.compose.ui.graphics.c) obj);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            q1.b0.b(k3.n0.c(this.f29716b), null, androidx.compose.ui.graphics.b.a(dVarF, (wn0.l) objI), null, z3.k.INSTANCE.e(), 0.75f, null, 0, lVar, 221232, 200);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(int i11, androidx.compose.ui.graphics.c graphicsLayer) {
            p013kotlin.jvm.internal.s.k(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.i(i11);
            return jn0.h0.f84049a;
        }
    }
}
