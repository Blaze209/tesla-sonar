package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fourthline.core.DocumentFileSideKt;
import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.core.internal.ExtensionsKt;
import com.fourthline.core.location.Coordinate;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.orca.workflow.WorkflowResultsKt;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Pair;
import p013kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f30006a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f30006a = simpleDateFormat;
    }

    public static final Pair a(A7 a11, String str, String str2) {
        p013kotlin.jvm.internal.s.k(a11, "<this>");
        WorkflowResults.IDV.Document documentAsWorkflowDataDocument = WorkflowResultsKt.asWorkflowDataDocument(a11, str2);
        if (documentAsWorkflowDataDocument == null) {
            return null;
        }
        Ql qlE = a11.e();
        return jn0.x.a(documentAsWorkflowDataDocument, a(documentAsWorkflowDataDocument, str, qlE != null ? WorkflowResultsKt.asWorkflowDataNfc(qlE) : null, "document", false));
    }

    public static final Pair b(A7 a11) {
        WorkflowResults.IDV.Nfc nfcAsWorkflowDataNfc;
        p013kotlin.jvm.internal.s.k(a11, "<this>");
        Ql qlE = a11.e();
        if (qlE == null || (nfcAsWorkflowDataNfc = WorkflowResultsKt.asWorkflowDataNfc(qlE)) == null) {
            return null;
        }
        JSONObject jSONObjectA = a("EmbeddedFace", null, null, null, a11.g(), "embeddedFace.jpeg", nfcAsWorkflowDataNfc.getLocation(), 14, null);
        p013kotlin.jvm.internal.s.j(jSONObjectA, "jsonFilesDescription$default(...)");
        return jn0.x.a(nfcAsWorkflowDataNfc, p013kotlin.collections.v.p(a(jSONObjectA), a(a11)));
    }

    public static final Pair a(A7 a11, byte[] videoBytes) {
        p013kotlin.jvm.internal.s.k(a11, "<this>");
        p013kotlin.jvm.internal.s.k(videoBytes, "videoBytes");
        WorkflowResults.IDV.DocumentVideo documentVideoAsWorkflowDataDocumentVideo = WorkflowResultsKt.asWorkflowDataDocumentVideo(a11, videoBytes);
        if (documentVideoAsWorkflowDataDocumentVideo == null) {
            return null;
        }
        JSONObject jSONObjectA = a("DocumentVideo", null, null, Boolean.TRUE, null, "documentvideo.mp4", documentVideoAsWorkflowDataDocumentVideo.getRecording().getLocation(), 22, null);
        p013kotlin.jvm.internal.s.j(jSONObjectA, "jsonFilesDescription$default(...)");
        return jn0.x.a(documentVideoAsWorkflowDataDocumentVideo, p013kotlin.collections.v.p(a(jSONObjectA), a(videoBytes, "documentvideo.mp4")));
    }

    public static final Pair a(C3404ix c3404ix, DocumentType type) {
        Object next;
        WorkflowResults.IDV.SecondaryDocument secondaryDocumentAsWorkflowDataSecondaryDocument;
        p013kotlin.jvm.internal.s.k(c3404ix, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        Iterator it = c3404ix.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C3363hx) next).d() != type);
        C3363hx c3363hx = (C3363hx) next;
        if (c3363hx == null || (secondaryDocumentAsWorkflowDataSecondaryDocument = WorkflowResultsKt.asWorkflowDataSecondaryDocument(c3363hx)) == null) {
            return null;
        }
        String lowerCase = type.toString().toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        JSONObject jSONObjectA = a(secondaryDocumentAsWorkflowDataSecondaryDocument, lowerCase);
        p013kotlin.jvm.internal.s.j(jSONObjectA, "jsonDocumentsDescription(...)");
        return jn0.x.a(secondaryDocumentAsWorkflowDataSecondaryDocument, p013kotlin.collections.v.P0(p013kotlin.collections.v.e(a(jSONObjectA)), a(secondaryDocumentAsWorkflowDataSecondaryDocument.getImages(), lowerCase, 0.0d, 2, (Object) null)));
    }

    public static final Pair a(C3490kx c3490kx) {
        p013kotlin.jvm.internal.s.k(c3490kx, "<this>");
        WorkflowResults.IDV.Selfie selfieAsWorkflowDataSelfie = WorkflowResultsKt.asWorkflowDataSelfie(c3490kx);
        if (selfieAsWorkflowDataSelfie == null) {
            return null;
        }
        JSONObject jSONObjectA = a("Selfie", null, null, null, null, "selfie.jpeg", selfieAsWorkflowDataSelfie.getLocation(), 30, null);
        p013kotlin.jvm.internal.s.j(jSONObjectA, "jsonFilesDescription$default(...)");
        return jn0.x.a(selfieAsWorkflowDataSelfie, p013kotlin.collections.v.p(a(jSONObjectA), a(selfieAsWorkflowDataSelfie)));
    }

    public static final Pair a(C3490kx c3490kx, byte[] videoBytes) {
        p013kotlin.jvm.internal.s.k(c3490kx, "<this>");
        p013kotlin.jvm.internal.s.k(videoBytes, "videoBytes");
        WorkflowResults.IDV.SelfieVideo selfieVideoAsWorkflowDataSelfieVideo = WorkflowResultsKt.asWorkflowDataSelfieVideo(c3490kx, videoBytes);
        if (selfieVideoAsWorkflowDataSelfieVideo == null) {
            return null;
        }
        JSONObject jSONObjectA = a("SelfieVideo", null, null, null, null, "selfievideo.mp4", selfieVideoAsWorkflowDataSelfieVideo.getRecording().getLocation(), 30, null);
        p013kotlin.jvm.internal.s.j(jSONObjectA, "jsonFilesDescription$default(...)");
        return jn0.x.a(selfieVideoAsWorkflowDataSelfieVideo, p013kotlin.collections.v.p(a(jSONObjectA), a(videoBytes, "selfievideo.mp4")));
    }

    private static final Cl.c.a a(JSONObject jSONObject) {
        return new Cl.c.a("UploadDocumentRequest", AbstractC3885u5.a(jSONObject), null, 4, null);
    }

    static /* synthetic */ List a(List list, String str, double d11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            d11 = 1.0d;
        }
        return a(list, str, d11);
    }

    private static final List a(List list, String str, double d11) {
        Iterable<IndexedValue> iterableT1 = p013kotlin.collections.v.t1(list);
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(iterableT1, 10));
        for (IndexedValue indexedValue : iterableT1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ((WorkflowResults.IDV.Attachment) indexedValue.d()).getImage().compress(Bitmap.CompressFormat.JPEG, (int) (((double) 100) * d11), byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
                Cl.c.a aVar = new Cl.c.a("Files", new C3842t5(byteArray), AbstractC3345hf.a(AbstractC3345hf.c(), str + indexedValue.c() + ".jpeg"));
                sn0.b.a(byteArrayOutputStream, null);
                arrayList.add(aVar);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(byteArrayOutputStream, th2);
                    throw th3;
                }
            }
        }
        return arrayList;
    }

    private static final Cl.c.a a(byte[] bArr, String str) {
        return new Cl.c.a("Files", new C3842t5(bArr), AbstractC3345hf.a(AbstractC3345hf.e(), str));
    }

    private static final Cl.c.a a(WorkflowResults.IDV.Selfie selfie) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            selfie.getImage().compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
            Cl.c.a aVar = new Cl.c.a("Files", new C3842t5(byteArray), AbstractC3345hf.a(AbstractC3345hf.c(), "selfie.jpeg"));
            sn0.b.a(byteArrayOutputStream, null);
            return aVar;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }

    private static final Cl.c.a a(A7 a11) {
        Bitmap bitmapB;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Ql qlE = a11.e();
            if (qlE != null && (bitmapB = qlE.b()) != null) {
                bitmapB.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
            Cl.c.a aVar = new Cl.c.a("Files", new C3842t5(byteArray), AbstractC3345hf.a(AbstractC3345hf.c(), "embeddedFace.jpeg"));
            sn0.b.a(byteArrayOutputStream, null);
            return aVar;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }

    private static final JSONObject a(WorkflowResults.IDV.Document document, String str, WorkflowResults.IDV.Nfc nfc, String str2, boolean z11) throws JSONException {
        Map<Integer, byte[]> dataGroups;
        Set<Map.Entry<Integer, byte[]>> setEntrySet;
        JSONObject jSONObjectPut = new JSONObject().put("DocumentType", DocumentTypeKt.toFourthlineValue(document.getType())).put("IsPrimaryDocument", true).put("EvaluateSecondaryDocument", false).put("DocumentNumber", document.getNumber());
        Date expirationDate = document.getExpirationDate();
        JSONArray jSONArray = null;
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("ExpirationDate", expirationDate != null ? f30006a.format(expirationDate) : null);
        Date issueDate = document.getIssueDate();
        JSONObject jSONObjectPut2 = jSONObjectPutOpt.putOpt("IssueDate", issueDate != null ? f30006a.format(issueDate) : null).put("IssuingCountry", document.getIssuingCountry());
        if (z11) {
            Iterable<IndexedValue> iterableT1 = p013kotlin.collections.v.t1(document.getImages());
            JSONArray jSONArray2 = new JSONArray();
            for (IndexedValue indexedValue : iterableT1) {
                JSONObject jSONObjectPut3 = new JSONObject().put("FileName", str2 + indexedValue.c() + ".jpeg").put("Side", DocumentFileSideKt.toFourthlineValue(((WorkflowResults.IDV.Attachment) indexedValue.d()).getFileSide())).put("RotationType", a(((WorkflowResults.IDV.Attachment) indexedValue.d()).isAngled()));
                Coordinate location = ((WorkflowResults.IDV.Attachment) indexedValue.d()).getLocation();
                JSONObject jSONObjectPutOpt2 = jSONObjectPut3.putOpt("Latitude", location != null ? Double.valueOf(location.getLatitude()).toString() : null);
                Coordinate location2 = ((WorkflowResults.IDV.Attachment) indexedValue.d()).getLocation();
                JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("Longitude", location2 != null ? Double.valueOf(location2.getLongitude()).toString() : null);
                p013kotlin.jvm.internal.s.j(jSONObjectPutOpt3, "putOpt(...)");
                jSONArray2.put(jSONObjectPutOpt3);
            }
            jSONObjectPut2.put("KycFiles", jSONArray2);
        } else {
            jSONObjectPut2.put("DocumentId", str);
        }
        if (nfc != null && (dataGroups = nfc.getDataGroups()) != null && (setEntrySet = dataGroups.entrySet()) != null) {
            jSONArray = new JSONArray();
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                JSONObject jSONObjectPut4 = new JSONObject().put("NfcDataGroupNumber", String.valueOf(((Number) entry.getKey()).intValue())).put("NfcData", ExtensionsKt.toHex((byte[]) entry.getValue()));
                p013kotlin.jvm.internal.s.j(jSONObjectPut4, "put(...)");
                jSONArray.put(jSONObjectPut4);
            }
        }
        return jSONObjectPut2.putOpt("NfcDataGroups", jSONArray);
    }

    private static final JSONObject a(WorkflowResults.IDV.SecondaryDocument secondaryDocument, String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("DocumentType", DocumentTypeKt.toFourthlineValue(secondaryDocument.getType())).put("IsPrimaryDocument", false);
        Date expirationDate = secondaryDocument.getExpirationDate();
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("ExpirationDate", expirationDate != null ? f30006a.format(expirationDate) : null);
        Date issueDate = secondaryDocument.getIssueDate();
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("IssueDate", issueDate != null ? f30006a.format(issueDate) : null);
        Iterable<IndexedValue> iterableT1 = p013kotlin.collections.v.t1(secondaryDocument.getImages());
        JSONArray jSONArray = new JSONArray();
        for (IndexedValue indexedValue : iterableT1) {
            JSONObject jSONObjectPut2 = new JSONObject().put("FileName", str + indexedValue.c() + ".jpeg").put("Side", DocumentFileSideKt.toFourthlineValue(((WorkflowResults.IDV.Attachment) indexedValue.d()).getFileSide())).put("RotationType", a(((WorkflowResults.IDV.Attachment) indexedValue.d()).isAngled()));
            Coordinate location = ((WorkflowResults.IDV.Attachment) indexedValue.d()).getLocation();
            JSONObject jSONObjectPutOpt3 = jSONObjectPut2.putOpt("Latitude", location != null ? Double.valueOf(location.getLatitude()).toString() : null);
            Coordinate location2 = ((WorkflowResults.IDV.Attachment) indexedValue.d()).getLocation();
            JSONObject jSONObjectPutOpt4 = jSONObjectPutOpt3.putOpt("Longitude", location2 != null ? Double.valueOf(location2.getLongitude()).toString() : null);
            p013kotlin.jvm.internal.s.j(jSONObjectPutOpt4, "putOpt(...)");
            jSONArray.put(jSONObjectPutOpt4);
        }
        return jSONObjectPutOpt2.put("KycFiles", jSONArray);
    }

    static /* synthetic */ JSONObject a(String str, Date date, String str2, Boolean bool, String str3, String str4, Coordinate coordinate, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            date = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            bool = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        return a(str, date, str2, bool, str3, str4, coordinate);
    }

    private static final JSONObject a(String str, Date date, String str2, Boolean bool, String str3, String str4, Coordinate coordinate) {
        return new JSONObject().put("DocumentType", str).putOpt("IsPrimaryDocument", bool).put("EvaluateSecondaryDocument", false).putOpt("ExpirationDate", date != null ? f30006a.format(date) : null).putOpt("IssuingCountry", str2).putOpt("DocumentNumber", str3).put("KycFiles", new JSONArray().put(new JSONObject().put("FileName", str4).putOpt("Latitude", coordinate != null ? Double.valueOf(coordinate.getLatitude()).toString() : null).putOpt("Longitude", coordinate != null ? Double.valueOf(coordinate.getLongitude()).toString() : null)));
    }

    public static final String a(boolean z11) {
        return z11 ? "Tilted" : ReactProgressBarViewManager.DEFAULT_STYLE;
    }

    public static final SimpleDateFormat a() {
        return f30006a;
    }

    public static final Date a(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        try {
            return f30006a.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
