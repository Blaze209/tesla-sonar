package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3791ry extends Eh {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ry$a */
    public static final class a {
        public static wn0.l a(InterfaceC3791ry interfaceC3791ry) {
            return new wn0.l() { // from class: com.fourthline.orca.internal.vb1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return InterfaceC3791ry.a.a((InterfaceC3491ky) obj);
                }
            };
        }

        public static wn0.l a(InterfaceC3791ry interfaceC3791ry, final Bitmap image) {
            p013kotlin.jvm.internal.s.k(image, "image");
            return new wn0.l() { // from class: com.fourthline.orca.internal.wb1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return InterfaceC3791ry.a.a(image, (InterfaceC3491ky) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InterfaceC3491ky a(Bitmap bitmap, InterfaceC3491ky interfaceC3491ky) {
            p013kotlin.jvm.internal.s.k(interfaceC3491ky, "<this>");
            if (interfaceC3491ky instanceof InterfaceC3491ky.a.C0572a) {
                return InterfaceC3491ky.a.C0572a.a((InterfaceC3491ky.a.C0572a) interfaceC3491ky, null, null, null, null, null, null, null, null, new C2916Oe(k3.n0.c(bitmap)), null, 767, null);
            }
            throw new IllegalStateException("Only confirm state supports enlarge functionality");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InterfaceC3491ky a(InterfaceC3491ky interfaceC3491ky) {
            p013kotlin.jvm.internal.s.k(interfaceC3491ky, "<this>");
            if (interfaceC3491ky instanceof InterfaceC3491ky.a.C0572a) {
                return InterfaceC3491ky.a.C0572a.a((InterfaceC3491ky.a.C0572a) interfaceC3491ky, null, null, null, null, null, null, null, null, null, null, 767, null);
            }
            throw new IllegalStateException("Only confirm state supports enlarge functionality");
        }
    }

    InterfaceC3491ky.b.InterfaceC0573b.a a(Pair pair, int i11);

    InterfaceC3491ky.b.InterfaceC0573b.C0574b a(int i11, Pair pair);

    InterfaceC3491ky a(InterfaceC3491ky interfaceC3491ky);

    InterfaceC3491ky a(ScannerImage scannerImage);

    InterfaceC3491ky a(SelfieScannerWarning selfieScannerWarning);

    wn0.l a(int i11);

    wn0.l a(Bitmap bitmap);

    wn0.l a(Integer num, Float f11, Float f12);

    InterfaceC3491ky.b.InterfaceC0573b.C0574b b(int i11);

    InterfaceC3491ky.b.a e();

    wn0.l f();

    wn0.l g();

    InterfaceC3491ky i();

    InterfaceC3491ky.b.a k();

    InterfaceC3491ky n();

    InterfaceC3491ky q();
}
