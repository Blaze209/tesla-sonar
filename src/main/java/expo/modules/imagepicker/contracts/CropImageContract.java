package expo.modules.imagepicker.contracts;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.canhub.cropper.CropImageOptions;
import com.canhub.cropper.CropImageView;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.imagepicker.CropShape;
import expo.modules.imagepicker.ExpoCropImageActivity;
import expo.modules.imagepicker.ImagePickerUtilsKt;
import expo.modules.imagepicker.MediaType;
import expo.modules.kotlin.activityresult.AppContextActivityResultContract;
import expo.modules.kotlin.providers.AppContextProvider;
import java.io.File;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p5.b;
import q5.d;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lexpo/modules/imagepicker/contracts/CropImageContract;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "Lexpo/modules/imagepicker/contracts/CropImageContractOptions;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;)V", "createIntent", "Landroid/content/Intent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "input", "parseResult", StatusResponse.RESULT_CODE, "", AnalyticsAttribute.Intent, "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropImageContract implements AppContextActivityResultContract<CropImageContractOptions, ImagePickerContractResult> {
    private final AppContextProvider appContextProvider;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropShape.values().length];
            try {
                iArr[CropShape.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropShape.OVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.contracts.CropImageContract$parseResult$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.imagepicker.contracts.CropImageContract$parseResult$1", f = "CropImageContract.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ ContentResolver $contentResolver;
        final /* synthetic */ CropImageContractOptions $input;
        final /* synthetic */ Uri $targetUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CropImageContractOptions cropImageContractOptions, Uri uri, ContentResolver contentResolver, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$input = cropImageContractOptions;
            this.$targetUri = uri;
            this.$contentResolver = contentResolver;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$input, this.$targetUri, this.$contentResolver, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                Uri uri = Uri.parse(this.$input.getSourceUri());
                File fileA = b.a(this.$targetUri);
                ContentResolver contentResolver = this.$contentResolver;
                s.h(contentResolver);
                this.label = 1;
                if (ImagePickerUtilsKt.copyExifData(uri, fileA, contentResolver, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public CropImageContract(AppContextProvider appContextProvider) {
        s.k(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public Intent createIntent(Context context, CropImageContractOptions input) {
        CropImageView.d dVar;
        s.k(context, "context");
        s.k(input, "input");
        Intent intent = new Intent(context, (Class<?>) ExpoCropImageActivity.class);
        ContentResolver contentResolver = context.getContentResolver();
        s.j(contentResolver, "getContentResolver(...)");
        Bitmap.CompressFormat bitmapCompressFormat = ImagePickerUtilsKt.toBitmapCompressFormat(ImagePickerUtilsKt.getType(contentResolver, Uri.parse(input.getSourceUri())));
        Uri uriFromFile = Uri.fromFile(ImagePickerUtilsKt.createOutputFile(this.appContextProvider.getAppContext().getCacheDirectory(), ImagePickerUtilsKt.toImageFileExtension(bitmapCompressFormat)));
        Pair pairA = x.a("CROP_IMAGE_EXTRA_SOURCE", Uri.parse(input.getSourceUri()));
        CropImageOptions cropImageOptions = new CropImageOptions(false, false, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, false, false, false, 0, false, false, false, false, 0, BitmapDescriptorFactory.HUE_RED, false, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, BitmapDescriptorFactory.HUE_RED, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        cropImageOptions.outputCompressFormat = bitmapCompressFormat;
        cropImageOptions.outputCompressQuality = (int) (input.getOptions().getQuality() * ((double) 100));
        cropImageOptions.customOutputUri = uriFromFile;
        Pair<Integer, Integer> aspect = input.getOptions().getAspect();
        if (aspect != null) {
            int iIntValue = aspect.a().intValue();
            int iIntValue2 = aspect.b().intValue();
            cropImageOptions.aspectRatioX = iIntValue;
            cropImageOptions.aspectRatioY = iIntValue2;
            cropImageOptions.fixAspectRatio = true;
            cropImageOptions.initialCropWindowPaddingRatio = BitmapDescriptorFactory.HUE_RED;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[input.getOptions().getShape().ordinal()];
        if (i11 == 1) {
            dVar = CropImageView.d.RECTANGLE;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = CropImageView.d.OVAL;
        }
        cropImageOptions.cropShape = dVar;
        h0 h0Var = h0.f84049a;
        intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", d.b(pairA, x.a("CROP_IMAGE_EXTRA_OPTIONS", cropImageOptions)));
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public ImagePickerContractResult parseResult(CropImageContractOptions input, int resultCode, Intent intent) {
        com.canhub.cropper.d dVar;
        s.k(input, "input");
        if (Build.VERSION.SDK_INT >= 33) {
            if (intent != null) {
                dVar = (com.canhub.cropper.d) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT", com.canhub.cropper.d.class);
            } else {
                dVar = null;
            }
        } else if (intent != null) {
            dVar = (com.canhub.cropper.d) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
        } else {
            dVar = null;
        }
        if (resultCode == 0 || dVar == null) {
            return ImagePickerContractResult.Cancelled.INSTANCE;
        }
        Uri uriContent = dVar.getUriContent();
        if (uriContent == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Context reactContext = this.appContextProvider.getAppContext().getReactContext();
        if (reactContext == null) {
            throw new IllegalArgumentException("React Application Context is null");
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(input, uriContent, reactContext.getContentResolver(), null), 1, null);
        return new ImagePickerContractResult.Success(v.e(x.a(MediaType.IMAGE, uriContent)));
    }
}
