package expo.modules.imagepicker;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$5", f = "ImagePickerModule.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
public final class ImagePickerModule$definition$lambda$7$$inlined$Coroutine$5 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    int label;
    final /* synthetic */ ImagePickerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickerModule$definition$lambda$7$$inlined$Coroutine$5(Continuation continuation, ImagePickerModule imagePickerModule) {
        super(3, continuation);
        this.this$0 = imagePickerModule;
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException, FailedToCreateFileException, FailedToDeduceTypeException, FailedToExtractVideoMetadataException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return obj;
        }
        t.b(obj);
        PendingMediaPickingResult pendingMediaPickingResult = this.this$0.pendingMediaPickingResult;
        if (pendingMediaPickingResult == null) {
            return null;
        }
        List<Pair<MediaType, Uri>> listComponent1 = pendingMediaPickingResult.component1();
        ImagePickerOptions options = pendingMediaPickingResult.getOptions();
        this.this$0.pendingMediaPickingResult = null;
        MediaHandler mediaHandler = this.this$0.mediaHandler;
        this.label = 1;
        Object extras$expo_image_picker_release = mediaHandler.readExtras$expo_image_picker_release(listComponent1, options, this);
        return extras$expo_image_picker_release == coroutine_suspended ? coroutine_suspended : extras$expo_image_picker_release;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        return new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$5(continuation, this.this$0).invokeSuspend(h0.f84049a);
    }
}
