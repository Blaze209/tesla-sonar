package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class Kn implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f26619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Yj f26620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f26621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final En f26622d;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final En.e.a f26623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pair f26624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Pair f26625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Pair f26626d;

        public a(En.e.a videoSource, Pair initialFrameRange, Pair scanningFrameRange, Pair successFrameRange) {
            p013kotlin.jvm.internal.s.k(videoSource, "videoSource");
            p013kotlin.jvm.internal.s.k(initialFrameRange, "initialFrameRange");
            p013kotlin.jvm.internal.s.k(scanningFrameRange, "scanningFrameRange");
            p013kotlin.jvm.internal.s.k(successFrameRange, "successFrameRange");
            this.f26623a = videoSource;
            this.f26624b = initialFrameRange;
            this.f26625c = scanningFrameRange;
            this.f26626d = successFrameRange;
        }

        public final Pair a() {
            return this.f26624b;
        }

        public final Pair b() {
            return this.f26625c;
        }

        public final Pair c() {
            return this.f26626d;
        }

        public final En.e.a d() {
            return this.f26623a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f26623a, aVar.f26623a) && p013kotlin.jvm.internal.s.f(this.f26624b, aVar.f26624b) && p013kotlin.jvm.internal.s.f(this.f26625c, aVar.f26625c) && p013kotlin.jvm.internal.s.f(this.f26626d, aVar.f26626d);
        }

        public int hashCode() {
            return (((((this.f26623a.hashCode() * 31) + this.f26624b.hashCode()) * 31) + this.f26625c.hashCode()) * 31) + this.f26626d.hashCode();
        }

        public String toString() {
            return "VideoModel(videoSource=" + this.f26623a + ", initialFrameRange=" + this.f26624b + ", scanningFrameRange=" + this.f26625c + ", successFrameRange=" + this.f26626d + ")";
        }
    }

    public Kn(wn0.a videoSource, Yj loadingSpinnerLottieSource, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(videoSource, "videoSource");
        p013kotlin.jvm.internal.s.k(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f26619a = videoSource;
        this.f26620b = loadingSpinnerLottieSource;
        this.f26621c = imageServiceLocator;
        this.f26622d = new En.a(QA.a.a(QA.f27433a, R.string.step_qes_loading_header, 0, 2, null), loadingSpinnerLottieSource);
    }

    private final En.c c(int i11) {
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detected_title, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.step_selfie_capture_message_device_not_steady, 0, 2, null);
        a aVarT = t();
        return new En.c(new En.e(aVarT.d(), jn0.x.a(aVarT.b().e(), aVarT.b().f()), true), dVarA, dVarA2, this.f26621c.a(EnumC3689ph.J0), new Cn.a(0, bo0.n.n(i11, 0, 10), 1, null));
    }

    private final a t() {
        return new a((En.e.a) this.f26619a.invoke(), jn0.x.a(0, 6700), jn0.x.a(6700, 8200), jn0.x.a(8200, 10000));
    }

    public final En d(int i11) {
        return c(i11);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public En getInitialState() {
        return this.f26622d;
    }

    public final En.b o() {
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detecting_title, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.step_document_nfc_scan_hint_android_detecting_message_center, 0, 2, null);
        a aVarT = t();
        return new En.b(new En.e(aVarT.d(), jn0.x.a(aVarT.a().e(), aVarT.a().f()), true), dVarA, dVarA2, this.f26621c.a(EnumC3689ph.J0), new Cn.b(this.f26620b));
    }

    public final En.c r() {
        return c(0);
    }

    public final En s() {
        QA.d dVarA = QA.a.a(QA.f27433a, R.string.step_document_nfc_scan_hint_android_success_title, 0, 2, null);
        QA.b bVar = QA.b.f27435b;
        a aVarT = t();
        return new En.d(new En.e(aVarT.d(), jn0.x.a(aVarT.c().e(), aVarT.c().f()), false, 4, null), dVarA, bVar, this.f26621c.a(EnumC3689ph.J0), this.f26621c.a(EnumC3689ph.H0));
    }
}
