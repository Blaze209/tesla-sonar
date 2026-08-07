package com.fourthline.kyc.internal;

import android.graphics.Bitmap;
import com.fourthline.core.VideoRecording;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.QesAttachment;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.zipper.ZipperError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import jn0.h0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24424b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f24425a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(k xmlBuilder) {
        s.k(xmlBuilder, "xmlBuilder");
        this.f24425a = xmlBuilder;
    }

    private final void b(ZipOutputStream zipOutputStream, List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QesAttachment qesAttachment = (QesAttachment) it.next();
            String str = "kyc/DocumentsToSign/" + qesAttachment.getId() + ".pdf";
            File pdfFile = qesAttachment.getPdfFile();
            s.h(pdfFile);
            a(zipOutputStream, str, sn0.h.i(pdfFile));
        }
    }

    public final OutputStream a(KycInfo kyc, OutputStream outputStream) throws ZipperError.CannotCreateZip, ZipperError.KycNotValid {
        s.k(kyc, "kyc");
        s.k(outputStream, "outputStream");
        if (!kyc.validate().isEmpty()) {
            throw ZipperError.KycNotValid.INSTANCE;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
            Attachment.Selfie selfie = kyc.getSelfie();
            if (selfie != null) {
                a(zipOutputStream, selfie);
                VideoRecording videoRecording = selfie.getVideoRecording();
                a(zipOutputStream, videoRecording != null ? videoRecording.getUrl() : null, selfie.getVideoUUID$fourthline_kyc_release());
            }
            Document document = kyc.getDocument();
            if (document != null) {
                a(zipOutputStream, document.getImages());
                VideoRecording videoRecording2 = document.getVideoRecording();
                a(zipOutputStream, videoRecording2 != null ? videoRecording2.getUrl() : null, document.getVideoUUID$fourthline_kyc_release());
                a(zipOutputStream, document.getNfc());
            }
            Iterator<T> it = kyc.getSecondaryDocuments().iterator();
            while (it.hasNext()) {
                a(zipOutputStream, ((SecondaryDocument) it.next()).getImages());
            }
            b(zipOutputStream, kyc.getDocumentsToSign());
            byte[] bytes = this.f24425a.a(kyc).getBytes(p013kotlin.text.d.UTF_8);
            s.j(bytes, "getBytes(...)");
            a(zipOutputStream, "kyc/kyc.xml", bytes);
            zipOutputStream.close();
            outputStream.flush();
            return outputStream;
        } catch (IOException unused) {
            throw ZipperError.CannotCreateZip.INSTANCE;
        }
    }

    private final void a(ZipOutputStream zipOutputStream, Attachment attachment) throws IOException {
        String str = "kyc/Documents/" + attachment.getUuid() + ".jpg";
        Bitmap image = attachment.getImage();
        s.h(image);
        a(zipOutputStream, str, a(image));
    }

    private final h0 a(ZipOutputStream zipOutputStream, Attachment.Nfc nfc) throws IOException {
        Bitmap image;
        if (nfc == null || (image = nfc.getImage()) == null) {
            return null;
        }
        a(zipOutputStream, "kyc/EmbeddedData/face.jpg", a(image));
        return h0.f84049a;
    }

    private final h0 a(ZipOutputStream zipOutputStream, URI uri, UUID uuid, String str) throws IOException {
        if (uri == null) {
            return null;
        }
        a(zipOutputStream, "kyc/Documents/" + uuid + "." + str, a(uri));
        return h0.f84049a;
    }

    private final h0 a(ZipOutputStream zipOutputStream, URI uri, UUID uuid) throws IOException {
        if (uri == null) {
            return null;
        }
        a(zipOutputStream, "kyc/Documents/" + uuid + ".mp4", a(uri));
        return h0.f84049a;
    }

    private final void a(ZipOutputStream zipOutputStream, String str, byte[] bArr) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
    }

    private final byte[] a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            sn0.b.a(byteArrayOutputStream, null);
            s.j(byteArray, "use(...)");
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }

    private final byte[] a(URI uri) {
        FileInputStream fileInputStream = new FileInputStream(new File(uri));
        try {
            byte[] bArrC = sn0.a.c(fileInputStream);
            sn0.b.a(fileInputStream, null);
            return bArrC;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    private final h0 a(ZipOutputStream zipOutputStream, List list) throws IOException {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Attachment.Document document = (Attachment.Document) it.next();
            Attachment.LocalFileAttachment file = document.getFile();
            if (file != null) {
                a(zipOutputStream, file.getFilePath(), document.getUuid(), b.a(document));
            } else {
                a(zipOutputStream, document);
            }
        }
        return h0.f84049a;
    }
}
