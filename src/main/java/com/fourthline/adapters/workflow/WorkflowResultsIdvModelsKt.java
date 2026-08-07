package com.fourthline.adapters.workflow;

import android.graphics.Bitmap;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.fourthline.adapters.common.DateFormat;
import com.fourthline.adapters.extensions.StringExtensionsKt;
import com.fourthline.adapters.kyc.BitmapSaver;
import com.fourthline.adapters.kyc.DocumentModelMapperKt;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.ExtensionsKt;
import com.fourthline.core.location.Coordinate;
import com.fourthline.orca.workflow.WorkflowResults;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import jn0.h0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\t\u001a!\u0010\n\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000bH\u0002\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u0010H\u0000\u001a\u0019\u0010\u0011\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\u001a\u0019\u0010\u0014\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0015H\u0000¢\u0006\u0002\u0010\u0016\u001a\u0019\u0010\u0017\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0018H\u0000¢\u0006\u0002\u0010\u0019\u001a!\u0010\u001a\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u001c\u001a\u0019\u0010\u001d\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u001eH\u0000¢\u0006\u0002\u0010\u001f\u001a!\u0010 \u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020!2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\"\u001a\u0019\u0010#\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020$H\u0000¢\u0006\u0002\u0010%\u001a\u0019\u0010&\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020'H\u0000¢\u0006\u0002\u0010(\u001a\f\u0010)\u001a\u00020\u000e*\u00020*H\u0000\u001a\u0019\u0010+\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020,H\u0002¢\u0006\u0002\u0010-\"\u0014\u0010.\u001a\u00020/X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"documentToJson", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "bitmapSaver", "Lcom/fourthline/adapters/kyc/BitmapSaver;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;Lcom/fourthline/adapters/kyc/BitmapSaver;)Lorg/json/JSONObject;", "secondaryDocumentToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;Lcom/fourthline/adapters/kyc/BitmapSaver;)Lorg/json/JSONObject;", "attachmentToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;Lcom/fourthline/adapters/kyc/BitmapSaver;)Lorg/json/JSONObject;", "fileName", "", "geolocationToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Geolocation;", "addressToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;)Lorg/json/JSONObject;", "metadataToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;)Lorg/json/JSONObject;", "recordingToJson", "Lcom/fourthline/core/VideoRecording;", "(Lcom/fourthline/core/VideoRecording;)Lorg/json/JSONObject;", "nfcToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;Lcom/fourthline/adapters/kyc/BitmapSaver;)Lorg/json/JSONObject;", "personToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;)Lorg/json/JSONObject;", "selfieToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;Lcom/fourthline/adapters/kyc/BitmapSaver;)Lorg/json/JSONObject;", "texInfoToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;)Lorg/json/JSONObject;", "contactsToJson", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;", "(Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;)Lorg/json/JSONObject;", "formattedTimestamp", "", "locationToJson", "Lcom/fourthline/core/location/Coordinate;", "(Lcom/fourthline/core/location/Coordinate;)Lorg/json/JSONObject;", "dateOnlyFormat", "Ljava/text/SimpleDateFormat;", "getDateOnlyFormat", "()Ljava/text/SimpleDateFormat;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WorkflowResultsIdvModelsKt {
    private static final SimpleDateFormat dateOnlyFormat;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        dateOnlyFormat = simpleDateFormat;
    }

    public static final JSONObject addressToJson(WorkflowResults.IDV.Address address) {
        s.k(address, "<this>");
        return new JSONObject().put("street", address.getStreet()).put("streetNumber", address.getStreetNumber()).put("streetNumberSuffix", address.getStreetNumberSuffix()).put("postalCode", address.getPostalCode()).put("city", address.getCity()).put("countryCode", address.getCountryCode()).putOpt("region", address.getRegion());
    }

    public static final JSONObject attachmentToJson(WorkflowResults.IDV.Attachment attachment, BitmapSaver bitmapSaver) throws JSONException {
        s.k(attachment, "<this>");
        s.k(bitmapSaver, "bitmapSaver");
        JSONObject jSONObjectPut = new JSONObject().put("image", bitmapSaver.saveToFileSystem(attachment.getImage(), fileName(attachment)));
        String lowerCase = attachment.getFileSide().name().toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        JSONObject jSONObjectPut2 = jSONObjectPut.put("fileSide", lowerCase).put("isAngled", attachment.isAngled());
        Long timestamp = attachment.getTimestamp();
        JSONObject jSONObjectPutOpt = jSONObjectPut2.putOpt("timestamp", timestamp != null ? formattedTimestamp(timestamp.longValue()) : null);
        Coordinate location = attachment.getLocation();
        return jSONObjectPutOpt.putOpt("location", location != null ? locationToJson(location) : null);
    }

    public static final JSONObject contactsToJson(WorkflowResults.IDV.Contacts contacts) {
        s.k(contacts, "<this>");
        return new JSONObject().put(Scopes.EMAIL, contacts.getEmail()).put("mobile", contacts.getMobile()).putOpt("phone", contacts.getPhone());
    }

    public static final JSONObject documentToJson(WorkflowResults.IDV.Document document, BitmapSaver bitmapSaver) throws JSONException {
        s.k(document, "<this>");
        s.k(bitmapSaver, "bitmapSaver");
        JSONObject jSONObjectPut = new JSONObject().put("type", StringExtensionsKt.toLowerCamelCase(document.getType().name())).put(InquiryField.FloatField.TYPE2, document.getNumber());
        Date issueDate = document.getIssueDate();
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("issueDate", issueDate != null ? dateOnlyFormat.format(issueDate) : null);
        Date expirationDate = document.getExpirationDate();
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("expirationDate", expirationDate != null ? dateOnlyFormat.format(expirationDate) : null);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = document.getImages().iterator();
        while (it.hasNext()) {
            jSONArray.put(attachmentToJson((WorkflowResults.IDV.Attachment) it.next(), bitmapSaver));
        }
        h0 h0Var = h0.f84049a;
        return jSONObjectPutOpt2.put("images", jSONArray);
    }

    private static final String fileName(WorkflowResults.IDV.Attachment attachment) {
        return "document." + DocumentModelMapperKt.formatted(attachment.getFileSide()) + (attachment.isAngled() ? ".angled" : "");
    }

    public static final String formattedTimestamp(long j11) {
        return DateFormat.ISO8601.toUtcDateFormat(j11);
    }

    public static final JSONObject geolocationToJson(WorkflowResults.IDV.Geolocation geolocation) {
        s.k(geolocation, "<this>");
        Coordinate location = geolocation.getLocation();
        if (location != null) {
            return locationToJson(location);
        }
        return null;
    }

    public static final SimpleDateFormat getDateOnlyFormat() {
        return dateOnlyFormat;
    }

    private static final JSONObject locationToJson(Coordinate coordinate) {
        return new JSONObject().put(OrcaKeys.LATITUDE, coordinate.getLatitude()).put(OrcaKeys.LONGITUDE, coordinate.getLongitude());
    }

    public static final JSONObject metadataToJson(WorkflowResults.IDV.DeviceMetadata deviceMetadata) {
        s.k(deviceMetadata, "<this>");
        return new JSONObject().put("model", deviceMetadata.getModel()).put("sdkVersion", deviceMetadata.getSdkVersion()).put("osVersion", deviceMetadata.getOsVersion()).put("language", deviceMetadata.getLanguage()).put("osCompromised", String.valueOf(deviceMetadata.getOsCompromised()));
    }

    public static final JSONObject nfcToJson(WorkflowResults.IDV.Nfc nfc, BitmapSaver bitmapSaver) throws JSONException {
        s.k(nfc, "<this>");
        s.k(bitmapSaver, "bitmapSaver");
        JSONObject jSONObject = new JSONObject();
        Bitmap image = nfc.getImage();
        JSONObject jSONObjectPutOpt = jSONObject.putOpt("image", image != null ? bitmapSaver.saveToFileSystem(image, "nfc.embedded") : null);
        Long timestamp = nfc.getTimestamp();
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("timestamp", timestamp != null ? formattedTimestamp(timestamp.longValue()) : null);
        Coordinate location = nfc.getLocation();
        JSONObject jSONObjectPut = jSONObjectPutOpt2.putOpt("location", location != null ? locationToJson(location) : null).put("mrz", nfc.getMrz());
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<Integer, byte[]> entry : nfc.getDataGroups().entrySet()) {
            jSONArray.put(new JSONObject().put("groupNumber", entry.getKey().intValue()).put("data", ExtensionsKt.toHex(entry.getValue())));
        }
        h0 h0Var = h0.f84049a;
        return jSONObjectPut.put("dataGroups", jSONArray);
    }

    public static final JSONObject personToJson(WorkflowResults.IDV.Person person) throws JSONException {
        s.k(person, "<this>");
        JSONObject jSONObjectPut = new JSONObject().put(EContextPaymentMethod.FIRST_NAME, person.getFirstName()).putOpt("middleName", person.getMiddleName()).put(EContextPaymentMethod.LAST_NAME, person.getLastName());
        String lowerCase = person.getGender().name().toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return jSONObjectPut.put("gender", lowerCase).put("nationalityCode", person.getNationalityCode()).putOpt("birthCountryCode", person.getBirthCountryCode()).putOpt("birthPlace", person.getBirthPlace()).put("birthDate", dateOnlyFormat.format(person.getBirthDate()));
    }

    public static final JSONObject recordingToJson(VideoRecording videoRecording) throws JSONException {
        s.k(videoRecording, "<this>");
        JSONObject jSONObjectPut = new JSONObject().put(ImagesContract.URL, videoRecording.getUrl().toString());
        String lowerCase = videoRecording.getDuration().getAlias().toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        JSONObject jSONObjectPut2 = jSONObjectPut.put("duration", lowerCase);
        Coordinate location = videoRecording.getLocation();
        return jSONObjectPut2.putOpt("location", location != null ? locationToJson(location) : null);
    }

    public static final JSONObject secondaryDocumentToJson(WorkflowResults.IDV.SecondaryDocument secondaryDocument, BitmapSaver bitmapSaver) throws JSONException {
        s.k(secondaryDocument, "<this>");
        s.k(bitmapSaver, "bitmapSaver");
        JSONObject jSONObjectPut = new JSONObject().put("type", StringExtensionsKt.toLowerCamelCase(secondaryDocument.getType().name()));
        Date issueDate = secondaryDocument.getIssueDate();
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("issueDate", issueDate != null ? dateOnlyFormat.format(issueDate) : null);
        Date expirationDate = secondaryDocument.getExpirationDate();
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("expirationDate", expirationDate != null ? dateOnlyFormat.format(expirationDate) : null);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = secondaryDocument.getImages().iterator();
        while (it.hasNext()) {
            jSONArray.put(attachmentToJson((WorkflowResults.IDV.Attachment) it.next(), bitmapSaver));
        }
        h0 h0Var = h0.f84049a;
        return jSONObjectPutOpt2.put("images", jSONArray);
    }

    public static final JSONObject selfieToJson(WorkflowResults.IDV.Selfie selfie, BitmapSaver bitmapSaver) throws JSONException {
        s.k(selfie, "<this>");
        s.k(bitmapSaver, "bitmapSaver");
        JSONObject jSONObjectPut = new JSONObject().put("image", bitmapSaver.saveToFileSystem(selfie.getImage(), "selfie"));
        Long timestamp = selfie.getTimestamp();
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("timestamp", timestamp != null ? formattedTimestamp(timestamp.longValue()) : null);
        Coordinate location = selfie.getLocation();
        return jSONObjectPutOpt.putOpt("location", location != null ? locationToJson(location) : null);
    }

    public static final JSONObject texInfoToJson(WorkflowResults.IDV.TaxInfo taxInfo) {
        s.k(taxInfo, "<this>");
        return new JSONObject().put("taxationCountryCode", taxInfo.getTaxationCountryCode()).put("taxpayerIdentificationNumber", taxInfo.getTaxNumber()).put("usPerson", taxInfo.getUsPerson()).putOpt("usTin", taxInfo.getUsTin());
    }
}
