package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3630o7 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o7$a */
    public static final class a implements InterfaceC3630o7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentRecognitionData f34088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OcrData f34089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f34090c;

        public a(DocumentRecognitionData documentRecognitionData, OcrData ocrData, List validationErrors) {
            p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
            this.f34088a = documentRecognitionData;
            this.f34089b = ocrData;
            this.f34090c = validationErrors;
        }

        public final DocumentRecognitionData a() {
            return this.f34088a;
        }

        public final OcrData b() {
            return this.f34089b;
        }

        public final List c() {
            return this.f34090c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f34088a, aVar.f34088a) && p013kotlin.jvm.internal.s.f(this.f34089b, aVar.f34089b) && p013kotlin.jvm.internal.s.f(this.f34090c, aVar.f34090c);
        }

        public int hashCode() {
            DocumentRecognitionData documentRecognitionData = this.f34088a;
            int iHashCode = (documentRecognitionData == null ? 0 : documentRecognitionData.hashCode()) * 31;
            OcrData ocrData = this.f34089b;
            return ((iHashCode + (ocrData != null ? ocrData.hashCode() : 0)) * 31) + this.f34090c.hashCode();
        }

        public String toString() {
            return "AnalysedDocument(documentRecognitionData=" + this.f34088a + ", ocr=" + this.f34089b + ", validationErrors=" + this.f34090c + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o7$b */
    public static final class b implements InterfaceC3630o7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f34091a;

        public b(Throwable error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f34091a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f34091a, ((b) obj).f34091a);
        }

        public int hashCode() {
            return this.f34091a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f34091a + ")";
        }
    }
}
