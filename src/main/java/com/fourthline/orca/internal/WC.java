package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.vision.document.DocumentScannerStepResult;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface WC {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f29491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final DocumentScannerStepResult f29492d;

        public a(String documentId, String imageId, Bitmap image, DocumentScannerStepResult stepResult) {
            p013kotlin.jvm.internal.s.k(documentId, "documentId");
            p013kotlin.jvm.internal.s.k(imageId, "imageId");
            p013kotlin.jvm.internal.s.k(image, "image");
            p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
            this.f29489a = documentId;
            this.f29490b = imageId;
            this.f29491c = image;
            this.f29492d = stepResult;
        }

        public final String a() {
            return this.f29489a;
        }

        public final Bitmap b() {
            return this.f29491c;
        }

        public final String c() {
            return this.f29490b;
        }

        public final DocumentScannerStepResult d() {
            return this.f29492d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f29489a, aVar.f29489a) && p013kotlin.jvm.internal.s.f(this.f29490b, aVar.f29490b) && p013kotlin.jvm.internal.s.f(this.f29491c, aVar.f29491c) && p013kotlin.jvm.internal.s.f(this.f29492d, aVar.f29492d);
        }

        public int hashCode() {
            return (((((this.f29489a.hashCode() * 31) + this.f29490b.hashCode()) * 31) + this.f29491c.hashCode()) * 31) + this.f29492d.hashCode();
        }

        public String toString() {
            return "Input(documentId=" + this.f29489a + ", imageId=" + this.f29490b + ", image=" + this.f29491c + ", stepResult=" + this.f29492d + ")";
        }
    }

    Object a(a aVar, long j11, Continuation continuation);

    void a(a aVar);
}
