package expo.modules.imagepicker;

import expo.modules.imagepicker.contracts.ImageLibraryContractOptions;
import expo.modules.imagepicker.contracts.ImagePickerContractResult;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagepicker.ImagePickerModule$definition$1$6$1", f = "ImagePickerModule.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
final class ImagePickerModule$definition$1$6$1 extends SuspendLambda implements l<Continuation<? super ImagePickerContractResult>, Object> {
    final /* synthetic */ ImageLibraryContractOptions $contractOptions;
    int label;
    final /* synthetic */ ImagePickerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImagePickerModule$definition$1$6$1(ImagePickerModule imagePickerModule, ImageLibraryContractOptions imageLibraryContractOptions, Continuation<? super ImagePickerModule$definition$1$6$1> continuation) {
        super(1, continuation);
        this.this$0 = imagePickerModule;
        this.$contractOptions = imageLibraryContractOptions;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Continuation<?> continuation) {
        return new ImagePickerModule$definition$1$6$1(this.this$0, this.$contractOptions, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        AppContextActivityResultLauncher appContextActivityResultLauncher = this.this$0.imageLibraryLauncher;
        if (appContextActivityResultLauncher == null) {
            s.B("imageLibraryLauncher");
            appContextActivityResultLauncher = null;
        }
        ImageLibraryContractOptions imageLibraryContractOptions = this.$contractOptions;
        this.label = 1;
        Object objLaunch = appContextActivityResultLauncher.launch(imageLibraryContractOptions, this);
        return objLaunch == coroutine_suspended ? coroutine_suspended : objLaunch;
    }

    @Override // wn0.l
    public final Object invoke(Continuation<? super ImagePickerContractResult> continuation) {
        return ((ImagePickerModule$definition$1$6$1) create(continuation)).invokeSuspend(h0.f84049a);
    }
}
