package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.Set;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4163c2 extends K5 {
    @Override // com.fourthline.vision.internal.K5
    /* synthetic */ ScannerImage getImage();

    Set<DocumentValidationError> getValidationErrors();

    /* JADX INFO: renamed from: com.fourthline.vision.internal.c2$a */
    public static final class a implements InterfaceC4163c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScannerImage f38190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f38191b;

        public a(ScannerImage image, Set<? extends DocumentValidationError> validationErrors) {
            p013kotlin.jvm.internal.s.k(image, "image");
            p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
            this.f38190a = image;
            this.f38191b = validationErrors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, ScannerImage scannerImage, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                scannerImage = aVar.f38190a;
            }
            if ((i11 & 2) != 0) {
                set = aVar.f38191b;
            }
            return aVar.copy(scannerImage, set);
        }

        public final ScannerImage component1() {
            return this.f38190a;
        }

        public final Set<DocumentValidationError> component2() {
            return this.f38191b;
        }

        public final a copy(ScannerImage image, Set<? extends DocumentValidationError> validationErrors) {
            p013kotlin.jvm.internal.s.k(image, "image");
            p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
            return new a(image, validationErrors);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f38190a, aVar.f38190a) && p013kotlin.jvm.internal.s.f(this.f38191b, aVar.f38191b);
        }

        @Override // com.fourthline.vision.internal.InterfaceC4163c2, com.fourthline.vision.internal.K5
        public ScannerImage getImage() {
            return this.f38190a;
        }

        @Override // com.fourthline.vision.internal.InterfaceC4163c2
        public Set<DocumentValidationError> getValidationErrors() {
            return this.f38191b;
        }

        public int hashCode() {
            return (this.f38190a.hashCode() * 31) + this.f38191b.hashCode();
        }

        public String toString() {
            return "ImageOnly(image=" + this.f38190a + ", validationErrors=" + this.f38191b + ")";
        }

        public /* synthetic */ a(ScannerImage scannerImage, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(scannerImage, (i11 & 2) != 0 ? p013kotlin.collections.d1.d() : set);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.c2$b */
    public static final class b implements InterfaceC4163c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScannerImage f38192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MrzInfo f38193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f38194c;

        public b(ScannerImage image, MrzInfo mrz, Set<? extends DocumentValidationError> validationErrors) {
            p013kotlin.jvm.internal.s.k(image, "image");
            p013kotlin.jvm.internal.s.k(mrz, "mrz");
            p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
            this.f38192a = image;
            this.f38193b = mrz;
            this.f38194c = validationErrors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b copy$default(b bVar, ScannerImage scannerImage, MrzInfo mrzInfo, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                scannerImage = bVar.f38192a;
            }
            if ((i11 & 2) != 0) {
                mrzInfo = bVar.f38193b;
            }
            if ((i11 & 4) != 0) {
                set = bVar.f38194c;
            }
            return bVar.copy(scannerImage, mrzInfo, set);
        }

        public final ScannerImage component1() {
            return this.f38192a;
        }

        public final MrzInfo component2() {
            return this.f38193b;
        }

        public final Set<DocumentValidationError> component3() {
            return this.f38194c;
        }

        public final b copy(ScannerImage image, MrzInfo mrz, Set<? extends DocumentValidationError> validationErrors) {
            p013kotlin.jvm.internal.s.k(image, "image");
            p013kotlin.jvm.internal.s.k(mrz, "mrz");
            p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
            return new b(image, mrz, validationErrors);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f38192a, bVar.f38192a) && p013kotlin.jvm.internal.s.f(this.f38193b, bVar.f38193b) && p013kotlin.jvm.internal.s.f(this.f38194c, bVar.f38194c);
        }

        @Override // com.fourthline.vision.internal.InterfaceC4163c2, com.fourthline.vision.internal.K5
        public ScannerImage getImage() {
            return this.f38192a;
        }

        public final MrzInfo getMrz() {
            return this.f38193b;
        }

        @Override // com.fourthline.vision.internal.InterfaceC4163c2
        public Set<DocumentValidationError> getValidationErrors() {
            return this.f38194c;
        }

        public int hashCode() {
            return (((this.f38192a.hashCode() * 31) + this.f38193b.hashCode()) * 31) + this.f38194c.hashCode();
        }

        public String toString() {
            return "Mrz(image=" + this.f38192a + ", mrz=" + this.f38193b + ", validationErrors=" + this.f38194c + ")";
        }

        public /* synthetic */ b(ScannerImage scannerImage, MrzInfo mrzInfo, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(scannerImage, mrzInfo, (i11 & 4) != 0 ? p013kotlin.collections.d1.d() : set);
        }
    }
}
