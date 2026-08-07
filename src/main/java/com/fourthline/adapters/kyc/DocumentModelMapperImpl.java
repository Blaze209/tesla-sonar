package com.fourthline.adapters.kyc;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.common.DateFormat;
import com.fourthline.adapters.extensions.StringExtensionsKt;
import com.fourthline.adapters.kyc.DocumentModelMapperImpl;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Document;
import com.fourthline.scanners.config.orca.kyc.model.AttachmentModel;
import com.fourthline.scanners.config.orca.kyc.model.DocumentModel;
import com.fourthline.scanners.config.orca.kyc.model.NfcDataGroupModel;
import com.fourthline.scanners.config.orca.kyc.model.VideoRecordingModel;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/fourthline/adapters/kyc/DocumentModelMapperImpl;", "Lcom/fourthline/adapters/kyc/DocumentModelMapper;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "bitmapSaver", "Lcom/fourthline/adapters/kyc/BitmapSaver;", "<init>", "(Landroid/content/Context;Lcom/fourthline/adapters/kyc/BitmapSaver;)V", "map", "Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;", "document", "Lcom/fourthline/kyc/Document;", "toHex", "", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DocumentModelMapperImpl implements DocumentModelMapper {
    private final BitmapSaver bitmapSaver;
    private final Context context;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Attachment.LocalFileAttachment.MimeType.values().length];
            try {
                iArr[Attachment.LocalFileAttachment.MimeType.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DocumentModelMapperImpl(Context context, BitmapSaver bitmapSaver) {
        s.k(context, "context");
        s.k(bitmapSaver, "bitmapSaver");
        this.context = context;
        this.bitmapSaver = bitmapSaver;
    }

    private final String toHex(byte[] bArr) {
        return n.P0(bArr, "", null, null, 0, null, new l() { // from class: kp.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return DocumentModelMapperImpl.toHex$lambda$12(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toHex$lambda$12(byte b11) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
        s.j(str, "format(...)");
        return str;
    }

    @Override // com.fourthline.adapters.kyc.DocumentModelMapper
    public DocumentModel map(Document document) {
        ArrayList arrayList;
        AttachmentModel.Nfc nfc;
        VideoRecordingModel videoRecordingModel;
        AttachmentModel.LocalFileAttachmentModel localFileAttachmentModel;
        String strName;
        s.k(document, "document");
        DocumentType type = document.getType();
        String lowerCamelCase = (type == null || (strName = type.name()) == null) ? null : StringExtensionsKt.toLowerCamelCase(strName);
        String number = document.getNumber();
        Date issueDate = document.getIssueDate();
        String utcDateFormat = issueDate != null ? DateFormat.SHORT.toUtcDateFormat(issueDate.getTime()) : null;
        Date expirationDate = document.getExpirationDate();
        String utcDateFormat2 = expirationDate != null ? DateFormat.SHORT.toUtcDateFormat(expirationDate.getTime()) : null;
        List<Attachment.Document> images = document.getImages();
        if (images != null) {
            List<Attachment.Document> list = images;
            ArrayList arrayList2 = new ArrayList(v.y(list, 10));
            for (Attachment.Document document2 : list) {
                DocumentFileSide fileSide = document2.getFileSide();
                String str = fileSide != null ? DocumentModelMapperKt.formatted(fileSide) : null;
                String str2 = document2.isAngled() ? ".angled" : "";
                Bitmap image = document2.getImage();
                String strSaveToFileSystem = image != null ? this.bitmapSaver.saveToFileSystem(image, "document." + str + str2) : null;
                Attachment.LocalFileAttachment file = document2.getFile();
                if (file != null) {
                    URI filePath = file.getFilePath();
                    if (WhenMappings.$EnumSwitchMapping$0[file.getMimeType().ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    localFileAttachmentModel = new AttachmentModel.LocalFileAttachmentModel(filePath, "application/pdf");
                } else {
                    localFileAttachmentModel = null;
                }
                boolean zIsAngled = document2.isAngled();
                Long timestamp = document2.getTimestamp();
                String utcDateFormat3 = timestamp != null ? DateFormat.ISO8601.toUtcDateFormat(timestamp.longValue()) : null;
                Coordinate location = document2.getLocation();
                arrayList2.add(new AttachmentModel.Document(strSaveToFileSystem, localFileAttachmentModel, str, zIsAngled, utcDateFormat3, location != null ? DocumentModelMapperKt.toCoordinateModel(location) : null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Attachment.Nfc nfc2 = document.getNfc();
        if (nfc2 != null) {
            Bitmap image2 = nfc2.getImage();
            String strSaveToFileSystem2 = image2 != null ? this.bitmapSaver.saveToFileSystem(image2, "nfc.embedded") : null;
            String mrz = nfc2.getMrz();
            Map<Integer, byte[]> dataGroups = nfc2.getDataGroups();
            ArrayList arrayList3 = new ArrayList(dataGroups.size());
            for (Map.Entry<Integer, byte[]> entry : dataGroups.entrySet()) {
                arrayList3.add(new NfcDataGroupModel(entry.getKey().intValue(), toHex(entry.getValue())));
            }
            Long timestamp2 = nfc2.getTimestamp();
            String utcDateFormat4 = timestamp2 != null ? DateFormat.ISO8601.toUtcDateFormat(timestamp2.longValue()) : null;
            Coordinate location2 = nfc2.getLocation();
            nfc = new AttachmentModel.Nfc(strSaveToFileSystem2, mrz, utcDateFormat4, location2 != null ? DocumentModelMapperKt.toCoordinateModel(location2) : null, arrayList3);
        } else {
            nfc = null;
        }
        VideoRecording videoRecording = document.getVideoRecording();
        if (videoRecording != null) {
            URI url = videoRecording.getUrl();
            VideoDuration duration = videoRecording.getDuration();
            Coordinate location3 = videoRecording.getLocation();
            videoRecordingModel = new VideoRecordingModel(url, duration, location3 != null ? DocumentModelMapperKt.toCoordinateModel(location3) : null);
        } else {
            videoRecordingModel = null;
        }
        return new DocumentModel(lowerCamelCase, number, utcDateFormat, utcDateFormat2, arrayList, nfc, videoRecordingModel, (UUID) null, 128, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ DocumentModelMapperImpl(Context context, BitmapSaver bitmapSaver, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new BitmapSaverImpl(context) : bitmapSaver);
    }
}
