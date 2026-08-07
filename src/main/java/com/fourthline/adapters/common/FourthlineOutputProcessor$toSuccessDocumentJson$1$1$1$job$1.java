package com.fourthline.adapters.common;

import android.graphics.Bitmap;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.scanners.DocumentResultHolder;
import com.fourthline.scanners.DocumentStepResult;
import com.fourthline.scanners.Kyc;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.Date;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.fourthline.adapters.common.FourthlineOutputProcessor$toSuccessDocumentJson$1$1$1$job$1", f = "FourthlineOutputProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class FourthlineOutputProcessor$toSuccessDocumentJson$1$1$1$job$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super JSONObject>, Object> {
    final /* synthetic */ JSONArray $jsonDocumentScans;
    final /* synthetic */ Kyc $kyc;
    final /* synthetic */ Map.Entry<DocumentScannerStep, DocumentStepResult> $pair;
    int label;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentFileSide.values().length];
            try {
                iArr[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentFileSide.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FourthlineOutputProcessor$toSuccessDocumentJson$1$1$1$job$1(JSONArray jSONArray, Map.Entry<DocumentScannerStep, DocumentStepResult> entry, Kyc kyc, Continuation<? super FourthlineOutputProcessor$toSuccessDocumentJson$1$1$1$job$1> continuation) {
        super(2, continuation);
        this.$jsonDocumentScans = jSONArray;
        this.$pair = entry;
        this.$kyc = kyc;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new FourthlineOutputProcessor$toSuccessDocumentJson$1$1$1$job$1(this.$jsonDocumentScans, this.$pair, this.$kyc, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        JSONObject jSONObject = new JSONObject();
        this.$jsonDocumentScans.put(jSONObject);
        DocumentStepResult value = this.$pair.getValue();
        FourthlineOutputProcessor fourthlineOutputProcessor = FourthlineOutputProcessor.INSTANCE;
        Bitmap image = value.getImage();
        DocumentResultHolder documentResult = this.$kyc.getDocumentResult();
        jSONObject.put("image", fourthlineOutputProcessor.storeImage$fourthline_adapters_json_release(image, documentResult != null ? documentResult.getImageReturnType() : null));
        DocumentScannerStep key = this.$pair.getKey();
        if (key != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(OrcaKeys.METADATA, jSONObject2);
            jSONObject2.put("isAngled", key.isAngled());
            Date timestamp = value.getTimestamp();
            if (timestamp != null) {
                fourthlineOutputProcessor.addTimestamp(jSONObject2, timestamp.getTime());
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[key.getFileSide().ordinal()];
            if (i11 == 1) {
                str = "front";
            } else if (i11 == 2) {
                str = "back";
            } else if (i11 == 3) {
                str = "insideLeft";
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "insideRight";
            }
            jSONObject2.put("fileSide", str);
            Pair<Double, Double> location = value.getLocation();
            if (location != null) {
                return jSONObject2.put("location", fourthlineOutputProcessor.provideJsonLocation(location));
            }
        }
        return null;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JSONObject> continuation) {
        return ((FourthlineOutputProcessor$toSuccessDocumentJson$1$1$1$job$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
