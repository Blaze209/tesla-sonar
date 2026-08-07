package com.fourthline.adapters.common;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Base64;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.IdlBasicInfo;
import com.fourthline.nfc.NfcDataGroup;
import com.fourthline.scanners.DocumentResultHolder;
import com.fourthline.scanners.DocumentStepResult;
import com.fourthline.scanners.Kyc;
import com.fourthline.scanners.NfcResultHolder;
import com.fourthline.scanners.SelfieResultHolder;
import com.fourthline.scanners.config.ImageReturnType;
import com.fourthline.vision.document.DocumentScannerStep;
import com.google.android.gms.common.internal.ImagesContract;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import zn0.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u000e\u0010\u0015\u001a\u00020\u0016*\u0004\u0018\u00010\u0017H\u0002J%\u0010\u0018\u001a\n \u0019*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016J\u001f\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0002\b)J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J'\u0010,\u001a\n \u0019*\u0004\u0018\u00010\u000b0\u000b2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0.¢\u0006\u0002\u00100R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u00061"}, d2 = {"Lcom/fourthline/adapters/common/FourthlineOutputProcessor;", "", "<init>", "()V", "mrzJsonProducer", "Lcom/fourthline/adapters/common/MrzJsonProducer;", "getMrzJsonProducer", "()Lcom/fourthline/adapters/common/MrzJsonProducer;", "mrzJsonProducer$delegate", "Lkotlin/Lazy;", "toSuccessSelfieJson", "Lorg/json/JSONObject;", "selfieResultHolder", "Lcom/fourthline/scanners/SelfieResultHolder;", "provideJsonVideoRecording", "videoRecording", "Lcom/fourthline/core/VideoRecording;", "provideJsonVideoRecording$fourthline_adapters_json_release", "toSuccessDocumentJson", "kyc", "Lcom/fourthline/scanners/Kyc;", "toName", "", "Lcom/fourthline/core/DocumentType;", "addTimestamp", "kotlin.jvm.PlatformType", "jsonObject", "time", "", "(Lorg/json/JSONObject;J)Lorg/json/JSONObject;", "toSuccessNfcJson", "(Lcom/fourthline/scanners/Kyc;)Lorg/json/JSONObject;", "toFailJson", "errorCode", "", "errorMessage", "storeImage", "bitmap", "Landroid/graphics/Bitmap;", "imageReturnType", "Lcom/fourthline/scanners/config/ImageReturnType;", "storeImage$fourthline_adapters_json_release", "toFile", "toBase64", "provideJsonLocation", "coordinates", "Lkotlin/Pair;", "", "(Lkotlin/Pair;)Lorg/json/JSONObject;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FourthlineOutputProcessor {
    public static final FourthlineOutputProcessor INSTANCE = new FourthlineOutputProcessor();

    /* JADX INFO: renamed from: mrzJsonProducer$delegate, reason: from kotlin metadata */
    private static final Lazy mrzJsonProducer = m.b(new wn0.a() { // from class: com.fourthline.adapters.common.b
        @Override // wn0.a
        public final Object invoke() {
            return FourthlineOutputProcessor.mrzJsonProducer_delegate$lambda$0();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageReturnType.values().length];
            try {
                iArr2[ImageReturnType.BASE_64.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ImageReturnType.FILE_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.adapters.common.FourthlineOutputProcessor$toSuccessDocumentJson$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.fourthline.adapters.common.FourthlineOutputProcessor$toSuccessDocumentJson$1", f = "FourthlineOutputProcessor.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ JSONObject $jsonResult;
        final /* synthetic */ Kyc $kyc;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.fourthline.adapters.common.FourthlineOutputProcessor$toSuccessDocumentJson$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.fourthline.adapters.common.FourthlineOutputProcessor$toSuccessDocumentJson$1$2", f = "FourthlineOutputProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Object>, Object> {
            final /* synthetic */ JSONObject $jsonResult;
            final /* synthetic */ Kyc $kyc;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Kyc kyc, JSONObject jSONObject, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$kyc = kyc;
                this.$jsonResult = jSONObject;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$kyc, this.$jsonResult, continuation);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
                return invoke2(coroutineScope, (Continuation<Object>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws JSONException {
                VideoRecording videoRecording;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                DocumentResultHolder documentResult = this.$kyc.getDocumentResult();
                if (documentResult != null && (videoRecording = documentResult.getVideoRecording()) != null) {
                    this.$jsonResult.put("videoRecording", FourthlineOutputProcessor.INSTANCE.provideJsonVideoRecording$fourthline_adapters_json_release(videoRecording));
                }
                MrzInfo documentMrzInfo = this.$kyc.getDocumentMrzInfo();
                if (documentMrzInfo == null) {
                    return null;
                }
                JSONObject jSONObject = this.$jsonResult;
                if (documentMrzInfo instanceof MrtdMrzInfo) {
                    return jSONObject.put("mrtdMrzInfo", FourthlineOutputProcessor.INSTANCE.getMrzJsonProducer().produceMrtdMrzInfoJsonObject((MrtdMrzInfo) documentMrzInfo));
                }
                return documentMrzInfo instanceof IdlMrzInfo ? jSONObject.put("idlMrzInfo", FourthlineOutputProcessor.INSTANCE.getMrzJsonProducer().produceIdlMrzInfoJsonObject((IdlMrzInfo) documentMrzInfo)) : h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Kyc kyc, JSONObject jSONObject, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$kyc = kyc;
            this.$jsonResult = jSONObject;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$kyc, this.$jsonResult, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            Iterator it;
            Map<DocumentScannerStep, DocumentStepResult> images;
            DocumentType documentType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ArrayList arrayList = new ArrayList();
                DocumentResultHolder documentResult = this.$kyc.getDocumentResult();
                if (documentResult != null && (images = documentResult.getImages()) != null) {
                    JSONObject jSONObject = this.$jsonResult;
                    Kyc kyc = this.$kyc;
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put("documentScans", jSONArray);
                    DocumentResultHolder documentResult2 = kyc.getDocumentResult();
                    jSONObject.put("documentType", (documentResult2 == null || (documentType = documentResult2.getDocumentType()) == null) ? null : FourthlineOutputProcessor.INSTANCE.toName(documentType));
                    Iterator<T> it2 = images.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FourthlineOutputProcessor$toSuccessDocumentJson$1$1$1$job$1(jSONArray, (Map.Entry) it2.next(), kyc, null), 3, null));
                    }
                }
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass2(this.$kyc, this.$jsonResult, null), 3, null));
                it = arrayList.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                t.b(obj);
            }
            while (it.hasNext()) {
                Deferred deferred = (Deferred) it.next();
                this.L$0 = it;
                this.label = 1;
                if (deferred.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private FourthlineOutputProcessor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject addTimestamp(JSONObject jsonObject, long time) {
        return jsonObject.put("timestamp", DateFormat.ISO8601.toUtcDateFormat(time));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MrzJsonProducer getMrzJsonProducer() {
        return (MrzJsonProducer) mrzJsonProducer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KycMrzJsonProducer mrzJsonProducer_delegate$lambda$0() {
        return new KycMrzJsonProducer();
    }

    private final String toBase64(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.j(byteArray, "toByteArray(...)");
        String strEncodeToString = Base64.encodeToString(byteArray, 0);
        s.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    private final String toFile(Bitmap bitmap) throws IOException {
        c.Companion companion = c.INSTANCE;
        File fileCreateTempFile = File.createTempFile(String.valueOf(companion.c()), String.valueOf(companion.c()));
        s.j(fileCreateTempFile, "createTempFile(...)");
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            h0 h0Var = h0.f84049a;
            sn0.b.a(fileOutputStream, null);
            String string = fileCreateTempFile.toURI().toString();
            s.j(string, "toString(...)");
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toName(DocumentType documentType) {
        switch (documentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                return "passport";
            case 2:
                return "idCard";
            case 3:
                return "driversLicense";
            case 4:
                return "residencePermit";
            case 5:
                return "paperId";
            case 6:
                return "frenchIdCard";
            case 7:
                return "dutchDriversLicense";
            default:
                throw new IllegalStateException("Unsupported document type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toSuccessNfcJson$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(byte b11) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
        s.j(str, "format(...)");
        return str;
    }

    public final JSONObject provideJsonLocation(Pair<Double, Double> coordinates) throws JSONException {
        s.k(coordinates, "coordinates");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(OrcaKeys.LATITUDE, coordinates.e().doubleValue());
        return jSONObject.put(OrcaKeys.LONGITUDE, coordinates.f().doubleValue());
    }

    public final JSONObject provideJsonVideoRecording$fourthline_adapters_json_release(VideoRecording videoRecording) throws JSONException {
        JSONObject jSONObject;
        s.k(videoRecording, "videoRecording");
        JSONObject jSONObject2 = new JSONObject();
        Coordinate location = videoRecording.getLocation();
        if (location != null) {
            jSONObject = new JSONObject();
            jSONObject.put(OrcaKeys.LATITUDE, location.getLatitude());
            jSONObject.put(OrcaKeys.LONGITUDE, location.getLongitude());
        } else {
            jSONObject = null;
        }
        jSONObject2.put(ImagesContract.URL, videoRecording.getUrl());
        jSONObject2.put("duration", videoRecording.getDuration().getAlias());
        JSONObject jSONObjectPut = jSONObject2.put("location", jSONObject);
        s.j(jSONObjectPut, "with(...)");
        return jSONObjectPut;
    }

    public final String storeImage$fourthline_adapters_json_release(Bitmap bitmap, ImageReturnType imageReturnType) {
        s.k(bitmap, "bitmap");
        if (imageReturnType == null) {
            imageReturnType = ImageReturnType.BASE_64;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$1[imageReturnType.ordinal()];
        if (i11 == 1) {
            return toBase64(bitmap);
        }
        if (i11 == 2) {
            return toFile(bitmap);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final JSONObject toFailJson(int errorCode, String errorMessage) {
        s.k(errorMessage, "errorMessage");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", errorCode);
        JSONObject jSONObjectPut = jSONObject.put("errorDescription", errorMessage);
        s.j(jSONObjectPut, "with(...)");
        return jSONObjectPut;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final JSONObject toSuccessDocumentJson(Kyc kyc) {
        s.k(kyc, "kyc");
        JSONObject jSONObject = new JSONObject();
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(kyc, jSONObject, null), 1, null);
        return jSONObject;
    }

    public final JSONObject toSuccessNfcJson(Kyc kyc) throws JSONException {
        List<NfcDataGroup> nfcRawData;
        s.k(kyc, "kyc");
        JSONObject jSONObject = new JSONObject();
        NfcResultHolder nfcResult = kyc.getNfcResult();
        if (nfcResult != null) {
            Bitmap nfcImage = nfcResult.getNfcImage();
            if (nfcImage != null) {
                FourthlineOutputProcessor fourthlineOutputProcessor = INSTANCE;
                NfcResultHolder nfcResult2 = kyc.getNfcResult();
                jSONObject.put("image", fourthlineOutputProcessor.storeImage$fourthline_adapters_json_release(nfcImage, nfcResult2 != null ? nfcResult2.getImageReturnType() : null));
            }
            if (nfcResult.getNfcImage() != null) {
                JSONObject jSONObject2 = new JSONObject();
                Date timestamp = nfcResult.getTimestamp();
                if (timestamp != null) {
                    INSTANCE.addTimestamp(jSONObject2, timestamp.getTime());
                }
                Pair<Double, Double> location = nfcResult.getLocation();
                jSONObject.put(OrcaKeys.METADATA, location != null ? jSONObject2.put("location", INSTANCE.provideJsonLocation(location)) : null);
            }
        }
        MrzInfo nfcMrzInfo = kyc.getNfcMrzInfo();
        if (nfcMrzInfo != null && (nfcMrzInfo instanceof MrtdMrzInfo)) {
            jSONObject.put("mrzInfo", INSTANCE.getMrzJsonProducer().produceMrtdMrzInfoJsonObject((MrtdMrzInfo) nfcMrzInfo));
        }
        IdlBasicInfo nfcIdlInfo = kyc.getNfcIdlInfo();
        if (nfcIdlInfo != null) {
            jSONObject.put("idlInfo", INSTANCE.getMrzJsonProducer().produceIdlBasicInfoJsonObject(kyc.getIdlMrz(), nfcIdlInfo));
        }
        JSONArray jSONArray = new JSONArray();
        NfcResultHolder nfcResult3 = kyc.getNfcResult();
        if (nfcResult3 != null && (nfcRawData = nfcResult3.getNfcRawData()) != null) {
            for (NfcDataGroup nfcDataGroup : nfcRawData) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("groupNumber", nfcDataGroup.getGroupNumber());
                jSONObject3.put("data", n.P0(nfcDataGroup.getRawData(), "", null, null, 0, null, new l() { // from class: com.fourthline.adapters.common.a
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return FourthlineOutputProcessor.toSuccessNfcJson$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(((Byte) obj).byteValue());
                    }
                }, 30, null));
                jSONArray.put(jSONObject3);
            }
        }
        return jSONObject.put("nfcDataGroups", jSONArray);
    }

    @SuppressLint({"SimpleDateFormat"})
    public final JSONObject toSuccessSelfieJson(SelfieResultHolder selfieResultHolder) throws JSONException {
        Date timestamp;
        Pair<Double, Double> location;
        VideoRecording videoRecording;
        Bitmap image;
        JSONObject jSONObject = new JSONObject();
        if (selfieResultHolder != null && (image = selfieResultHolder.getImage()) != null) {
            jSONObject.put("image", INSTANCE.storeImage$fourthline_adapters_json_release(image, selfieResultHolder.getImageReturnType()));
        }
        if (selfieResultHolder != null && (videoRecording = selfieResultHolder.getVideoRecording()) != null) {
            jSONObject.put("videoRecording", INSTANCE.provideJsonVideoRecording$fourthline_adapters_json_release(videoRecording));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put(OrcaKeys.METADATA, jSONObject2);
        if (selfieResultHolder != null && (location = selfieResultHolder.getLocation()) != null) {
            jSONObject2.put("location", INSTANCE.provideJsonLocation(location));
        }
        if (selfieResultHolder != null && (timestamp = selfieResultHolder.getTimestamp()) != null) {
            INSTANCE.addTimestamp(jSONObject2, timestamp.getTime());
        }
        return jSONObject;
    }
}
