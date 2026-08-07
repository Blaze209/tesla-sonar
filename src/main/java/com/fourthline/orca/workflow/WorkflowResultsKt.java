package com.fourthline.orca.workflow;

import android.graphics.Bitmap;
import com.fourthline.core.DeviceMetaDataValidationError;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.LocationProviderKt;
import com.fourthline.orca.internal.A7;
import com.fourthline.orca.internal.AbstractC3166dD;
import com.fourthline.orca.internal.C3363hx;
import com.fourthline.orca.internal.C3490kx;
import com.fourthline.orca.internal.C4052y;
import com.fourthline.orca.internal.C4103z7;
import com.fourthline.orca.internal.F4;
import com.fourthline.orca.internal.Jp;
import com.fourthline.orca.internal.Ql;
import com.fourthline.orca.internal.XA;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0015\u0010(\u001a\u0004\u0018\u00010'*\u00020&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010,\u001a\u0004\u0018\u00010+*\u00020*H\u0000¢\u0006\u0004\b,\u0010-\u001a'\u00101\u001a\u0004\u0018\u000100*\u00020*2\u0006\u0010.\u001a\u00020\u00012\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b1\u00102\u001a\u0015\u00105\u001a\u0004\u0018\u000104*\u000203H\u0000¢\u0006\u0004\b5\u00106\u001a\u0015\u00109\u001a\u0004\u0018\u000108*\u000207H\u0000¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/fourthline/orca/internal/A7;", "", WorkflowKeys.ISSUING_COUNTRY, "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "asWorkflowDataDocument", "(Lcom/fourthline/orca/internal/A7;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "documentId", "imageId", "asWorkflowDataImage", "(Lcom/fourthline/orca/internal/A7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "Lcom/fourthline/orca/internal/hx;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;", "asWorkflowDataSecondaryDocument", "(Lcom/fourthline/orca/internal/hx;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;", "", "videoBytes", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DocumentVideo;", "asWorkflowDataDocumentVideo", "(Lcom/fourthline/orca/internal/A7;[B)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DocumentVideo;", "Lcom/fourthline/orca/internal/kx;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;", "asWorkflowDataSelfie", "(Lcom/fourthline/orca/internal/kx;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SelfieVideo;", "asWorkflowDataSelfieVideo", "(Lcom/fourthline/orca/internal/kx;[B)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SelfieVideo;", "Lcom/fourthline/orca/internal/z7;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "asWorkflowDataAttachment", "(Lcom/fourthline/orca/internal/z7;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "Lcom/fourthline/orca/internal/Ql;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;", "asWorkflowDataNfc", "(Lcom/fourthline/orca/internal/Ql;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;", "Lcom/fourthline/orca/internal/y;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;", "asWorkflowDataAddress", "(Lcom/fourthline/orca/internal/y;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;", "Lcom/fourthline/orca/internal/Jp;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;", "asWorkflowDataPerson", "(Lcom/fourthline/orca/internal/Jp;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;", "Lcom/fourthline/core/DeviceMetadata;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Geolocation;", "asWorkflowGeolocation", "(Lcom/fourthline/core/DeviceMetadata;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Geolocation;", "appTrackerId", "analyticsId", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;", "asWorkflowDataMetadata", "(Lcom/fourthline/core/DeviceMetadata;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;", "Lcom/fourthline/orca/internal/XA;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;", "asWorkflowDataTaxInfo", "(Lcom/fourthline/orca/internal/XA;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;", "Lcom/fourthline/orca/internal/F4;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;", "asWorkflowDataContacts", "(Lcom/fourthline/orca/internal/F4;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;", "fourthline-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WorkflowResultsKt {
    public static final WorkflowResults.IDV.Address asWorkflowDataAddress(C4052y c4052y) {
        s.k(c4052y, "<this>");
        if (!c4052y.m()) {
            return null;
        }
        String strH = c4052y.h();
        if (strH == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strH) + " must not be null."))).toString());
        }
        Integer numI = c4052y.i();
        if (numI == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + numI + " must not be null."))).toString());
        }
        int iIntValue = numI.intValue();
        String strJ = c4052y.j();
        String strE = c4052y.e();
        if (strE == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strE) + " must not be null."))).toString());
        }
        String strA = c4052y.a();
        if (strA == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strA) + " must not be null."))).toString());
        }
        String strC = c4052y.c();
        if (strC != null) {
            return new WorkflowResults.IDV.Address(strH, iIntValue, strJ, strE, strA, strC, c4052y.g());
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strC) + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Attachment asWorkflowDataAttachment(C4103z7 c4103z7) {
        s.k(c4103z7, "<this>");
        if (!c4103z7.g()) {
            return null;
        }
        Bitmap bitmapC = c4103z7.c();
        if (bitmapC == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + bitmapC + " must not be null."))).toString());
        }
        DocumentFileSide documentFileSideA = c4103z7.a();
        if (documentFileSideA != null) {
            return new WorkflowResults.IDV.Attachment(bitmapC, documentFileSideA, c4103z7.h(), c4103z7.e(), c4103z7.f());
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentFileSideA + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Contacts asWorkflowDataContacts(F4 f11) {
        s.k(f11, "<this>");
        if (!f11.e()) {
            return null;
        }
        String strA = f11.a();
        if (strA == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strA) + " must not be null."))).toString());
        }
        String strC = f11.c();
        if (strC != null) {
            return new WorkflowResults.IDV.Contacts(strA, strC, null, 4, null);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strC) + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Document asWorkflowDataDocument(A7 a11, String str) {
        s.k(a11, "<this>");
        ArrayList arrayList = null;
        if (!a11.j()) {
            return null;
        }
        DocumentType documentTypeH = a11.h();
        if (documentTypeH == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentTypeH + " must not be null."))).toString());
        }
        String strG = a11.g();
        if (strG == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strG) + " must not be null."))).toString());
        }
        Date dateD = a11.d();
        Date dateB = a11.b();
        List listC = a11.c();
        if (listC != null) {
            arrayList = new ArrayList();
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                WorkflowResults.IDV.Attachment attachmentAsWorkflowDataAttachment = asWorkflowDataAttachment((C4103z7) it.next());
                if (attachmentAsWorkflowDataAttachment != null) {
                    arrayList.add(attachmentAsWorkflowDataAttachment);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 != null) {
            return new WorkflowResults.IDV.Document(documentTypeH, strG, dateD, str, dateB, arrayList2);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + arrayList2 + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.DocumentVideo asWorkflowDataDocumentVideo(A7 a11, byte[] videoBytes) {
        s.k(a11, "<this>");
        s.k(videoBytes, "videoBytes");
        VideoRecording videoRecordingK = a11.k();
        if (videoRecordingK == null) {
            return null;
        }
        URI url = videoRecordingK.getUrl();
        if (url != null) {
            AbstractC3166dD.a(url, videoBytes);
            return new WorkflowResults.IDV.DocumentVideo(new VideoRecording(url, videoRecordingK.getDuration(), videoRecordingK.getLocation()));
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + url + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Document asWorkflowDataImage(A7 a11, String str, String documentId, String imageId) {
        s.k(a11, "<this>");
        s.k(documentId, "documentId");
        s.k(imageId, "imageId");
        ArrayList arrayList = null;
        if (!a11.j()) {
            return null;
        }
        DocumentType documentTypeH = a11.h();
        if (documentTypeH == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentTypeH + " must not be null."))).toString());
        }
        String strG = a11.g();
        if (strG == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strG) + " must not be null."))).toString());
        }
        Date dateD = a11.d();
        Date dateB = a11.b();
        List listC = a11.c();
        if (listC != null) {
            arrayList = new ArrayList();
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                WorkflowResults.IDV.Attachment attachmentAsWorkflowDataAttachment = asWorkflowDataAttachment((C4103z7) it.next());
                if (attachmentAsWorkflowDataAttachment != null) {
                    arrayList.add(attachmentAsWorkflowDataAttachment);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 != null) {
            return new WorkflowResults.IDV.Document(documentTypeH, strG, dateD, str, dateB, arrayList2);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + arrayList2 + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.DeviceMetadata asWorkflowDataMetadata(DeviceMetadata deviceMetadata, String appTrackerId, String str) {
        s.k(deviceMetadata, "<this>");
        s.k(appTrackerId, "appTrackerId");
        List<DeviceMetaDataValidationError> listValidate = deviceMetadata.validate();
        boolean z11 = listValidate.size() == 1 && listValidate.contains(DeviceMetaDataValidationError.INVALID_LOCATION);
        if (listValidate.isEmpty() || z11) {
            return new WorkflowResults.IDV.DeviceMetadata(deviceMetadata.getLanguage(), deviceMetadata.getRegion(), deviceMetadata.getModel(), deviceMetadata.getOsVersion(), deviceMetadata.getSdkVersion(), deviceMetadata.getOsCompromised(), appTrackerId, str);
        }
        return null;
    }

    public static final WorkflowResults.IDV.Nfc asWorkflowDataNfc(Ql ql2) {
        s.k(ql2, "<this>");
        if (!ql2.h()) {
            return null;
        }
        String strD = ql2.d();
        if (strD != null) {
            return new WorkflowResults.IDV.Nfc(strD, ql2.b(), ql2.c(), ql2.g(), ql2.a());
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strD) + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Person asWorkflowDataPerson(Jp jp2) {
        s.k(jp2, "<this>");
        if (!jp2.i()) {
            return null;
        }
        String strA = jp2.a();
        if (strA == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strA) + " must not be null."))).toString());
        }
        String strM = jp2.m();
        String strC = jp2.c();
        if (strC == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strC) + " must not be null."))).toString());
        }
        Gender genderD = jp2.d();
        if (genderD == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + genderD + " must not be null."))).toString());
        }
        String strH = jp2.h();
        if (strH == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strH) + " must not be null."))).toString());
        }
        String strG = jp2.g();
        String strK = jp2.k();
        Date dateB = jp2.b();
        if (dateB != null) {
            return new WorkflowResults.IDV.Person(strA, strM, strC, genderD, strH, strG, strK, dateB);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + dateB + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.SecondaryDocument asWorkflowDataSecondaryDocument(C3363hx c3363hx) {
        s.k(c3363hx, "<this>");
        ArrayList arrayList = null;
        if (!c3363hx.f()) {
            return null;
        }
        DocumentType documentTypeD = c3363hx.d();
        if (documentTypeD == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentTypeD + " must not be null."))).toString());
        }
        Date dateC = c3363hx.c();
        Date dateA = c3363hx.a();
        List listB = c3363hx.b();
        if (listB != null) {
            arrayList = new ArrayList();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                WorkflowResults.IDV.Attachment attachmentAsWorkflowDataAttachment = asWorkflowDataAttachment((C4103z7) it.next());
                if (attachmentAsWorkflowDataAttachment != null) {
                    arrayList.add(attachmentAsWorkflowDataAttachment);
                }
            }
        }
        if (arrayList != null) {
            return new WorkflowResults.IDV.SecondaryDocument(documentTypeD, dateC, dateA, arrayList);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + arrayList + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Selfie asWorkflowDataSelfie(C3490kx c3490kx) {
        s.k(c3490kx, "<this>");
        if (!c3490kx.e()) {
            return null;
        }
        Bitmap bitmapA = c3490kx.a();
        if (bitmapA != null) {
            return new WorkflowResults.IDV.Selfie(bitmapA, c3490kx.c(), c3490kx.d());
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + bitmapA + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.SelfieVideo asWorkflowDataSelfieVideo(C3490kx c3490kx, byte[] videoBytes) {
        s.k(c3490kx, "<this>");
        s.k(videoBytes, "videoBytes");
        VideoRecording videoRecordingF = c3490kx.f();
        if (videoRecordingF == null) {
            return null;
        }
        URI url = videoRecordingF.getUrl();
        if (url != null) {
            AbstractC3166dD.a(url, videoBytes);
            return new WorkflowResults.IDV.SelfieVideo(new VideoRecording(url, videoRecordingF.getDuration(), videoRecordingF.getLocation()));
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + url + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.TaxInfo asWorkflowDataTaxInfo(XA xa2) {
        s.k(xa2, "<this>");
        if (!xa2.e()) {
            return null;
        }
        String strA = xa2.a();
        if (strA == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strA) + " must not be null."))).toString());
        }
        String strC = xa2.c();
        if (strC != null) {
            return new WorkflowResults.IDV.TaxInfo(strA, strC, null, null, 12, null);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strC) + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Geolocation asWorkflowGeolocation(DeviceMetadata deviceMetadata) {
        s.k(deviceMetadata, "<this>");
        if (deviceMetadata.validate().contains(DeviceMetaDataValidationError.INVALID_LOCATION)) {
            return null;
        }
        return new WorkflowResults.IDV.Geolocation(s.f(deviceMetadata.getLocation(), LocationProviderKt.getNotProvidedCoordinate()) ? null : deviceMetadata.getLocation());
    }
}
