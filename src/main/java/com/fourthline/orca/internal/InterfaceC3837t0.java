package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.vision.document.DocumentScannerStepResult;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3837t0 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f35495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final DocumentScannerStepResult f35496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f35497e;

        public a(String documentId, String imageId, Bitmap image, DocumentScannerStepResult stepResult, long j11) {
            p013kotlin.jvm.internal.s.k(documentId, "documentId");
            p013kotlin.jvm.internal.s.k(imageId, "imageId");
            p013kotlin.jvm.internal.s.k(image, "image");
            p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
            this.f35493a = documentId;
            this.f35494b = imageId;
            this.f35495c = image;
            this.f35496d = stepResult;
            this.f35497e = j11;
        }

        public final String a() {
            return this.f35493a;
        }

        public final Bitmap b() {
            return this.f35495c;
        }

        public final String c() {
            return this.f35494b;
        }

        public final DocumentScannerStepResult d() {
            return this.f35496d;
        }

        public final long e() {
            return this.f35497e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f35493a, aVar.f35493a) && p013kotlin.jvm.internal.s.f(this.f35494b, aVar.f35494b) && p013kotlin.jvm.internal.s.f(this.f35495c, aVar.f35495c) && p013kotlin.jvm.internal.s.f(this.f35496d, aVar.f35496d) && this.f35497e == aVar.f35497e;
        }

        public int hashCode() {
            return (((((((this.f35493a.hashCode() * 31) + this.f35494b.hashCode()) * 31) + this.f35495c.hashCode()) * 31) + this.f35496d.hashCode()) * 31) + Long.hashCode(this.f35497e);
        }

        public String toString() {
            return "Input(documentId=" + this.f35493a + ", imageId=" + this.f35494b + ", image=" + this.f35495c + ", stepResult=" + this.f35496d + ", timeOutInMillis=" + this.f35497e + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t0$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.t0$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final LegacyImageAnalysisResponse f35498a;

            public a(LegacyImageAnalysisResponse imageAnalysisResult) {
                p013kotlin.jvm.internal.s.k(imageAnalysisResult, "imageAnalysisResult");
                this.f35498a = imageAnalysisResult;
            }

            public final LegacyImageAnalysisResponse a() {
                return this.f35498a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f35498a, ((a) obj).f35498a);
            }

            public int hashCode() {
                return this.f35498a.hashCode();
            }

            public String toString() {
                return "LegacySucceed(imageAnalysisResult=" + this.f35498a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.t0$b$b, reason: collision with other inner class name */
        public static final class C0614b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ImageAnalysisResponse f35499a;

            public C0614b(ImageAnalysisResponse imageAnalysisResult) {
                p013kotlin.jvm.internal.s.k(imageAnalysisResult, "imageAnalysisResult");
                this.f35499a = imageAnalysisResult;
            }

            public final ImageAnalysisResponse a() {
                return this.f35499a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0614b) && p013kotlin.jvm.internal.s.f(this.f35499a, ((C0614b) obj).f35499a);
            }

            public int hashCode() {
                return this.f35499a.hashCode();
            }

            public String toString() {
                return "Succeed(imageAnalysisResult=" + this.f35499a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
