package com.fourthline.kyc.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.zipper.ZipperError;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jn0.x;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements m {
    private final double b(File file) {
        return a(file) / ((double) 1024);
    }

    private final double c(File file) {
        return b(file) / ((double) 1024);
    }

    @Override // com.fourthline.kyc.internal.m
    public void a() {
        FourthlineAnalytics.i$default(FourthlineAnalytics.INSTANCE, "zipper_start", null, v0.f(a("zipper_start")), 2, null);
    }

    @Override // com.fourthline.kyc.internal.m
    public void a(KycInfo kycInfo, URI uri) {
        DocumentType type;
        s.k(kycInfo, "kycInfo");
        s.k(uri, "uri");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        Pair pairA = a("zipper_success");
        Pair pairA2 = x.a("zip_size", Double.valueOf(c(a(uri))));
        Pair pairA3 = x.a("number_of_images", Integer.valueOf(a(kycInfo)));
        Document document = kycInfo.getDocument();
        FourthlineAnalytics.i$default(fourthlineAnalytics, "zipper_success", null, v0.m(pairA, pairA2, pairA3, x.a(AnalyticsAttribute.DocumentType, (document == null || (type = document.getType()) == null) ? null : a(type))), 2, null);
    }

    @Override // com.fourthline.kyc.internal.m
    public void a(KycInfo kycInfo, ZipperError error) {
        DocumentType type;
        s.k(kycInfo, "kycInfo");
        s.k(error, "error");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        Pair pairA = a(error);
        Pair pairA2 = a("zipper_fail");
        Pair pairA3 = x.a("number_of_images", Integer.valueOf(a(kycInfo)));
        Document document = kycInfo.getDocument();
        FourthlineAnalytics.e$default(fourthlineAnalytics, "zipper_fail", null, v0.m(pairA, pairA2, pairA3, x.a(AnalyticsAttribute.DocumentType, (document == null || (type = document.getType()) == null) ? null : a(type))), 2, null);
    }

    private final Pair a(ZipperError zipperError) {
        String str;
        if (s.f(zipperError, ZipperError.CannotCreateZip.INSTANCE)) {
            str = "cannot_create_zip";
        } else if (s.f(zipperError, ZipperError.KycNotValid.INSTANCE)) {
            str = "kyc_not_valid";
        } else if (s.f(zipperError, ZipperError.NotEnoughSpace.INSTANCE)) {
            str = "not_enough_space";
        } else {
            if (!s.f(zipperError, ZipperError.ZipExceedMaximumSize.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "zip_exceed_maximum_size";
        }
        return x.a("fatal_error", str);
    }

    private final Pair a(String str) {
        return x.a("zipper_flow", str);
    }

    private final double a(File file) {
        if (file.exists()) {
            return file.length();
        }
        return 0.0d;
    }

    private final File a(URI uri) {
        Path path = Paths.get(uri);
        s.j(path, "get(...)");
        return new File(path.toString());
    }

    private final int a(KycInfo kycInfo) {
        Attachment.Nfc nfc;
        List<Attachment.Document> images;
        Document document = kycInfo.getDocument();
        int size = (document == null || (images = document.getImages()) == null) ? 0 : images.size();
        Iterator<T> it = kycInfo.getSecondaryDocuments().iterator();
        int size2 = 0;
        while (it.hasNext()) {
            List<Attachment.Document> images2 = ((SecondaryDocument) it.next()).getImages();
            size2 += images2 != null ? images2.size() : 0;
        }
        Document document2 = kycInfo.getDocument();
        int i11 = ((document2 == null || (nfc = document2.getNfc()) == null) ? null : nfc.getImage()) != null ? 1 : 0;
        Attachment.Selfie selfie = kycInfo.getSelfie();
        return size + size2 + i11 + ((selfie != null ? selfie.getImage() : null) != null ? 1 : 0);
    }

    private final String a(DocumentType documentType) {
        String strName = documentType.name();
        Locale ROOT = Locale.ROOT;
        s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
