package expo.modules.imagepicker;

import expo.modules.imagepicker.contracts.CameraContract;
import expo.modules.imagepicker.contracts.CameraContractOptions;
import expo.modules.imagepicker.contracts.CropImageContract;
import expo.modules.imagepicker.contracts.CropImageContractOptions;
import expo.modules.imagepicker.contracts.ImageLibraryContract;
import expo.modules.imagepicker.contracts.ImageLibraryContractOptions;
import expo.modules.imagepicker.contracts.ImagePickerContractResult;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Ljn0/h0;", "<anonymous>", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.imagepicker.ImagePickerModule$definition$1$8", f = "ImagePickerModule.kt", i = {0, 1}, l = {101, 105, 109}, m = "invokeSuspend", n = {"$this$RegisterActivityContracts", "$this$RegisterActivityContracts"}, s = {"L$0", "L$0"})
final class ImagePickerModule$definition$1$8 extends SuspendLambda implements p<AppContextActivityResultCaller, Continuation<? super h0>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImagePickerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImagePickerModule$definition$1$8(ImagePickerModule imagePickerModule, Continuation<? super ImagePickerModule$definition$1$8> continuation) {
        super(2, continuation);
        this.this$0 = imagePickerModule;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        ImagePickerModule$definition$1$8 imagePickerModule$definition$1$8 = new ImagePickerModule$definition$1$8(this.this$0, continuation);
        imagePickerModule$definition$1$8.L$0 = obj;
        return imagePickerModule$definition$1$8;
    }

    @Override // wn0.p
    public final Object invoke(AppContextActivityResultCaller appContextActivityResultCaller, Continuation<? super h0> continuation) {
        return ((ImagePickerModule$definition$1$8) create(appContextActivityResultCaller, continuation)).invokeSuspend(h0.f84049a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ImagePickerModule imagePickerModule;
        AppContextActivityResultCaller appContextActivityResultCaller;
        ImagePickerModule imagePickerModule2;
        AppContextActivityResultCaller appContextActivityResultCaller2;
        ImagePickerModule imagePickerModule3;
        Object objRegisterForActivityResult;
        ImagePickerModule imagePickerModule4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            t.b(obj);
            AppContextActivityResultCaller appContextActivityResultCaller3 = (AppContextActivityResultCaller) this.L$0;
            imagePickerModule = this.this$0;
            CameraContract cameraContract = new CameraContract(imagePickerModule);
            final ImagePickerModule imagePickerModule5 = this.this$0;
            AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback = new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.1
                @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                public final void onActivityResult(CameraContractOptions input, ImagePickerContractResult result) {
                    s.k(input, "input");
                    s.k(result, "result");
                    imagePickerModule5.handleResultUponActivityDestruction(result, input.getOptions());
                }
            };
            this.L$0 = appContextActivityResultCaller3;
            this.L$1 = imagePickerModule;
            this.label = 1;
            Object objRegisterForActivityResult2 = appContextActivityResultCaller3.registerForActivityResult(cameraContract, appContextActivityResultFallbackCallback, this);
            if (objRegisterForActivityResult2 != coroutine_suspended) {
                appContextActivityResultCaller = appContextActivityResultCaller3;
                obj = objRegisterForActivityResult2;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            imagePickerModule = (ImagePickerModule) this.L$1;
            appContextActivityResultCaller = (AppContextActivityResultCaller) this.L$0;
            t.b(obj);
        } else {
            if (i11 == 2) {
                imagePickerModule2 = (ImagePickerModule) this.L$1;
                appContextActivityResultCaller2 = (AppContextActivityResultCaller) this.L$0;
                t.b(obj);
                imagePickerModule2.imageLibraryLauncher = (AppContextActivityResultLauncher) obj;
                imagePickerModule3 = this.this$0;
                CropImageContract cropImageContract = new CropImageContract(imagePickerModule3);
                final ImagePickerModule imagePickerModule6 = this.this$0;
                AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback2 = new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.3
                    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                    public final void onActivityResult(CropImageContractOptions input, ImagePickerContractResult result) {
                        s.k(input, "input");
                        s.k(result, "result");
                        imagePickerModule6.handleResultUponActivityDestruction(result, input.getOptions());
                    }
                };
                this.L$0 = imagePickerModule3;
                this.L$1 = null;
                this.label = 3;
                objRegisterForActivityResult = appContextActivityResultCaller2.registerForActivityResult(cropImageContract, appContextActivityResultFallbackCallback2, this);
                if (objRegisterForActivityResult != coroutine_suspended) {
                    imagePickerModule4 = imagePickerModule3;
                    obj = objRegisterForActivityResult;
                }
                return coroutine_suspended;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imagePickerModule4 = (ImagePickerModule) this.L$0;
            t.b(obj);
        }
        imagePickerModule4.cropImageLauncher = (AppContextActivityResultLauncher) obj;
        return h0.f84049a;
        imagePickerModule.cameraLauncher = (AppContextActivityResultLauncher) obj;
        imagePickerModule2 = this.this$0;
        ImageLibraryContract imageLibraryContract = new ImageLibraryContract(imagePickerModule2);
        final ImagePickerModule imagePickerModule7 = this.this$0;
        AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback3 = new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.2
            @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
            public final void onActivityResult(ImageLibraryContractOptions input, ImagePickerContractResult result) {
                s.k(input, "input");
                s.k(result, "result");
                imagePickerModule7.handleResultUponActivityDestruction(result, input.getOptions());
            }
        };
        this.L$0 = appContextActivityResultCaller;
        this.L$1 = imagePickerModule2;
        this.label = 2;
        obj = appContextActivityResultCaller.registerForActivityResult(imageLibraryContract, appContextActivityResultFallbackCallback3, this);
        if (obj != coroutine_suspended) {
            appContextActivityResultCaller2 = appContextActivityResultCaller;
            imagePickerModule2.imageLibraryLauncher = (AppContextActivityResultLauncher) obj;
            imagePickerModule3 = this.this$0;
            CropImageContract cropImageContract2 = new CropImageContract(imagePickerModule3);
            final ImagePickerModule imagePickerModule8 = this.this$0;
            AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback4 = new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.3
                @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                public final void onActivityResult(CropImageContractOptions input, ImagePickerContractResult result) {
                    s.k(input, "input");
                    s.k(result, "result");
                    imagePickerModule8.handleResultUponActivityDestruction(result, input.getOptions());
                }
            };
            this.L$0 = imagePickerModule3;
            this.L$1 = null;
            this.label = 3;
            objRegisterForActivityResult = appContextActivityResultCaller2.registerForActivityResult(cropImageContract2, appContextActivityResultFallbackCallback4, this);
            if (objRegisterForActivityResult != coroutine_suspended) {
                imagePickerModule4 = imagePickerModule3;
                obj = objRegisterForActivityResult;
                imagePickerModule4.cropImageLauncher = (AppContextActivityResultLauncher) obj;
                return h0.f84049a;
            }
        }
        return coroutine_suspended;
    }
}
