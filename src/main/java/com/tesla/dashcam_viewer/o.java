package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\u0001*\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000f\u0010\b\u001a\u0011\u0010\u0011\u001a\u00020\u0001*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0014\u001a\u00020\u0001*\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0016\u0010\b\u001a\u0011\u0010\u0018\u001a\u00020\u0001*\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001b\u001a\u00020\u0001*\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\u0001*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a'\u0010(\u001a\u00020!*\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b(\u0010)\u001a'\u0010+\u001a\u00020**\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010.\u001a\u00020-*\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\u0004\b.\u0010/\u001a\u0019\u00100\u001a\u0004\u0018\u00010%*\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\u0004\b0\u00101\u001a\u0011\u00102\u001a\u00020 *\u00020!¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u00020 *\u00020*¢\u0006\u0004\b4\u00105\u001a\u0019\u00106\u001a\u0004\u0018\u00010-*\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\u0004\b6\u00107\"\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020$0\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:¨\u0006<"}, d2 = {"Lcom/tesla/dashcam_viewer/p;", "Lcom/facebook/react/bridge/WritableMap;", "r", "(Lcom/tesla/dashcam_viewer/p;)Lcom/facebook/react/bridge/WritableMap;", "", "", "Lcom/facebook/react/bridge/WritableArray;", "j", "(Ljava/util/List;)Lcom/facebook/react/bridge/WritableArray;", "Lcom/tesla/dashcam_viewer/k;", "o", "(Lcom/tesla/dashcam_viewer/k;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/tesla/dashcam_viewer/i;", "m", "(Lcom/tesla/dashcam_viewer/i;)Lcom/facebook/react/bridge/WritableMap;", "k", "Lcom/tesla/dashcam_viewer/j;", "n", "(Lcom/tesla/dashcam_viewer/j;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/tesla/dashcam_viewer/l;", "p", "(Lcom/tesla/dashcam_viewer/l;)Lcom/facebook/react/bridge/WritableMap;", "l", "Lcom/tesla/dashcam_viewer/m;", "q", "(Lcom/tesla/dashcam_viewer/m;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/tesla/dashcam_viewer/a0;", "s", "(Lcom/tesla/dashcam_viewer/a0;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/tesla/dashcam_viewer/k1;", "t", "(Lcom/tesla/dashcam_viewer/k1;)Lcom/facebook/react/bridge/WritableMap;", "", "Ljn0/a0;", "f", "([B)I", "", "", "start", "end", "e", "(Ljava/util/List;II)I", "Ljn0/c0;", "g", "(Ljava/util/List;II)J", "", "c", "(Ljava/util/List;)Z", "b", "(Ljava/util/List;)Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "(I)[B", "h", "(J)[B", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Ljava/lang/Boolean;", "a", "Ljava/util/List;", "()Ljava/util/List;", "NAL_UNIT_START_CODE", "dashcam-viewer_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Byte> f55929a = p013kotlin.collections.v.p((byte) 0, (byte) 0, (byte) 0, (byte) 1);

    public static final List<Byte> a() {
        return f55929a;
    }

    public static final Integer b(List<Byte> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        if (list.size() < 4) {
            return null;
        }
        return Integer.valueOf(list.get(4).byteValue() & 31);
    }

    public static final boolean c(List<Byte> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        return list.size() >= 4 && p013kotlin.jvm.internal.s.f(list.subList(0, 4), f55929a);
    }

    public static final Boolean d(List<Byte> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        Integer numB = b(list);
        if (numB != null) {
            return Boolean.valueOf(numB.intValue() == 5);
        }
        return null;
    }

    public static final int e(List<Byte> list, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        if (i12 - i11 == 4) {
            return jn0.a0.b(ByteBuffer.wrap(p013kotlin.collections.v.g1(list.subList(i11, i12))).order(ByteOrder.BIG_ENDIAN).getInt());
        }
        throw new IllegalArgumentException("Range must be exactly 4 bytes for UInt32");
    }

    public static final int f(byte[] bArr) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        if (bArr.length == 4) {
            return jn0.a0.b(ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).getInt());
        }
        throw new IllegalArgumentException("Byte array must be exactly 4 bytes");
    }

    public static final long g(List<Byte> list, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        if (i12 - i11 == 8) {
            return jn0.c0.b(ByteBuffer.wrap(p013kotlin.collections.v.g1(list.subList(i11, i12))).order(ByteOrder.BIG_ENDIAN).getLong());
        }
        throw new IllegalArgumentException("Range must be exactly 8 bytes for UInt64");
    }

    public static final byte[] h(long j11) {
        byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN).putLong(j11).array();
        p013kotlin.jvm.internal.s.j(bArrArray, "array(...)");
        return bArrArray;
    }

    public static final byte[] i(int i11) {
        byte[] bArrArray = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(i11).array();
        p013kotlin.jvm.internal.s.j(bArrArray, "array(...)");
        return bArrArray;
    }

    public static final WritableArray j(List<String> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString((String) it.next());
        }
        p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    public static final WritableArray k(List<DashcamViewerEvent> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap(m((DashcamViewerEvent) it.next()));
        }
        p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    public static final WritableArray l(List<DashcamViewerEventMetadataForJS> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap(p((DashcamViewerEventMetadataForJS) it.next()));
        }
        p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    public static final WritableMap m(DashcamViewerEvent dashcamViewerEvent) {
        p013kotlin.jvm.internal.s.k(dashcamViewerEvent, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("EventName", dashcamViewerEvent.getEventName());
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final WritableMap n(DashcamViewerEventList dashcamViewerEventList) {
        p013kotlin.jvm.internal.s.k(dashcamViewerEventList, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("SentryClips", k(dashcamViewerEventList.f()));
        writableMapCreateMap.putArray("SavedClips", k(dashcamViewerEventList.e()));
        writableMapCreateMap.putArray("EmergencyClips", k(dashcamViewerEventList.b()));
        writableMapCreateMap.putArray("InternalClips", k(dashcamViewerEventList.d()));
        String error = dashcamViewerEventList.getError();
        if (error != null) {
            writableMapCreateMap.putString("Error", error);
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final WritableMap o(DashcamViewerEventMetadata dashcamViewerEventMetadata) {
        p013kotlin.jvm.internal.s.k(dashcamViewerEventMetadata, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        String name = dashcamViewerEventMetadata.getName();
        if (name != null) {
            writableMapCreateMap.putString("Name", name);
        }
        writableMapCreateMap.putDouble("EventEpochTimeMs", jn0.j0.e(dashcamViewerEventMetadata.getEventEpochTimeMs()));
        writableMapCreateMap.putDouble("TotalDurationMs", jn0.j0.e(dashcamViewerEventMetadata.getTotalDurationMs()));
        writableMapCreateMap.putDouble("EarliestClipTimeMs", jn0.j0.e(dashcamViewerEventMetadata.getEarliestClipTimeMs()));
        writableMapCreateMap.putMap("EventMetadata", r(dashcamViewerEventMetadata.getEventMetadata()));
        List<String> listG = dashcamViewerEventMetadata.g();
        if (listG != null) {
            writableMapCreateMap.putArray("TotalAvailableCameras", j(listG));
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final WritableMap p(DashcamViewerEventMetadataForJS lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap(OrcaKeys.METADATA, o(lVar.getMetadata()));
        String strB = lVar.getThumbnail();
        if (strB != null) {
            writableMapCreateMap.putString("thumbnail", strB);
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final WritableMap q(DashcamViewerSaveClipStatus dashcamViewerSaveClipStatus) {
        p013kotlin.jvm.internal.s.k(dashcamViewerSaveClipStatus, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(PermissionsResponse.STATUS_KEY, dashcamViewerSaveClipStatus.getStatus());
        Integer downloadPercentage = dashcamViewerSaveClipStatus.getDownloadPercentage();
        if (downloadPercentage != null) {
            writableMapCreateMap.putInt("downloadPercentage", downloadPercentage.intValue());
        }
        Double startEpochMs = dashcamViewerSaveClipStatus.getStartEpochMs();
        if (startEpochMs != null) {
            writableMapCreateMap.putDouble("startEpochMs", startEpochMs.doubleValue());
        }
        Double endEpochMs = dashcamViewerSaveClipStatus.getEndEpochMs();
        if (endEpochMs != null) {
            writableMapCreateMap.putDouble("endEpochMs", endEpochMs.doubleValue());
        }
        String errorKey = dashcamViewerSaveClipStatus.getErrorKey();
        if (errorKey != null) {
            writableMapCreateMap.putString("errorKey", errorKey);
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final WritableMap r(EventMetadata eventMetadata) {
        p013kotlin.jvm.internal.s.k(eventMetadata, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("TimestampEpochMs", jn0.j0.e(eventMetadata.getTimestampEpochMs()));
        writableMapCreateMap.putDouble("Est_lat", eventMetadata.getEst_lat());
        writableMapCreateMap.putDouble("Est_lon", eventMetadata.getEst_lon());
        writableMapCreateMap.putString("Reason", eventMetadata.getReason());
        writableMapCreateMap.putInt("Camera", eventMetadata.getCamera() & 255);
        String city = eventMetadata.getCity();
        if (city != null) {
            writableMapCreateMap.putString("City", city);
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final WritableMap s(a0 a0Var) {
        p013kotlin.jvm.internal.s.k(a0Var, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("Id", a0Var.getId());
        if (a0Var instanceof PhotoBoothListResponse) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (CreationsFileMetadata fVar : ((PhotoBoothListResponse) a0Var).b()) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("Filename", fVar.getFilename());
                writableMapCreateMap2.putDouble("Epoch", jn0.j0.e(fVar.getEpoch()));
                writableMapCreateMap2.putBoolean("isInternal", fVar.getIsInternal());
                writableArrayCreateArray.pushMap(writableMapCreateMap2);
            }
            writableMapCreateMap.putArray("Photos", writableArrayCreateArray);
        } else if (a0Var instanceof PhotoBoothImageResponse) {
            PhotoBoothImageResponse yVar = (PhotoBoothImageResponse) a0Var;
            writableMapCreateMap.putString("Filename", yVar.getFilename());
            writableMapCreateMap.putDouble("Epoch", jn0.j0.e(yVar.getEpoch()));
        } else {
            if (!(a0Var instanceof PhotoBoothThumbnailResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            PhotoBoothThumbnailResponse photoBoothThumbnailResponse = (PhotoBoothThumbnailResponse) a0Var;
            writableMapCreateMap.putString("Filename", photoBoothThumbnailResponse.getFilename());
            writableMapCreateMap.putDouble("Epoch", jn0.j0.e(photoBoothThumbnailResponse.getEpoch()));
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final WritableMap t(k1 k1Var) {
        p013kotlin.jvm.internal.s.k(k1Var, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("Id", k1Var.getId());
        if (k1Var instanceof SketchpadListResponse) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (CreationsFileMetadata fVar : ((SketchpadListResponse) k1Var).b()) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("Filename", fVar.getFilename());
                writableMapCreateMap2.putDouble("Epoch", jn0.j0.e(fVar.getEpoch()));
                writableMapCreateMap2.putBoolean("isInternal", fVar.getIsInternal());
                writableArrayCreateArray.pushMap(writableMapCreateMap2);
            }
            writableMapCreateMap.putArray("Photos", writableArrayCreateArray);
        } else if (k1Var instanceof SketchpadImageResponse) {
            SketchpadImageResponse sketchpadImageResponse = (SketchpadImageResponse) k1Var;
            writableMapCreateMap.putString("Filename", sketchpadImageResponse.getFilename());
            writableMapCreateMap.putDouble("Epoch", jn0.j0.e(sketchpadImageResponse.getEpoch()));
        } else {
            if (!(k1Var instanceof SketchpadThumbnailResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            SketchpadThumbnailResponse sketchpadThumbnailResponse = (SketchpadThumbnailResponse) k1Var;
            writableMapCreateMap.putString("Filename", sketchpadThumbnailResponse.getFilename());
            writableMapCreateMap.putDouble("Epoch", jn0.j0.e(sketchpadThumbnailResponse.getEpoch()));
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
