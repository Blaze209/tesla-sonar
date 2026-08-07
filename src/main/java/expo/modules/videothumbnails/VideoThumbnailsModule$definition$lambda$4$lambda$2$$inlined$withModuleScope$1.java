package expo.modules.videothumbnails;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.URLUtil;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.core.utilities.FileUtilities;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import sn0.b;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "expo/modules/videothumbnails/VideoThumbnailsModule$withModuleScope$1"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.videothumbnails.VideoThumbnailsModule$definition$lambda$4$lambda$2$$inlined$withModuleScope$1", f = "VideoThumbnailsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VideoThumbnailsModule$definition$lambda$4$lambda$2$$inlined$withModuleScope$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ VideoThumbnailOptions $options$inlined;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Promise $promise$inlined;
    final /* synthetic */ String $sourceFilename$inlined;
    int label;
    final /* synthetic */ VideoThumbnailsModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoThumbnailsModule$definition$lambda$4$lambda$2$$inlined$withModuleScope$1(Promise promise, Continuation continuation, String str, VideoThumbnailsModule videoThumbnailsModule, VideoThumbnailOptions videoThumbnailOptions, Promise promise2) {
        super(2, continuation);
        this.$promise = promise;
        this.$sourceFilename$inlined = str;
        this.this$0 = videoThumbnailsModule;
        this.$options$inlined = videoThumbnailOptions;
        this.$promise$inlined = promise2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new VideoThumbnailsModule$definition$lambda$4$lambda$2$$inlined$withModuleScope$1(this.$promise, continuation, this.$sourceFilename$inlined, this.this$0, this.$options$inlined, this.$promise$inlined);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        try {
            try {
                try {
                    if (!URLUtil.isValidUrl(this.$sourceFilename$inlined)) {
                        throw new InvalidSourceFilenameException();
                    }
                    if (URLUtil.isFileUrl(this.$sourceFilename$inlined)) {
                        VideoThumbnailsModule videoThumbnailsModule = this.this$0;
                        String strDecode = Uri.decode(this.$sourceFilename$inlined);
                        s.j(strDecode, "decode(...)");
                        if (!videoThumbnailsModule.isAllowedToRead(p013kotlin.text.t.V(strDecode, "file://", "", false, 4, null))) {
                            throw new ThumbnailFileException();
                        }
                    }
                    Bitmap bitmapExecute = new VideoThumbnailsModule.GetThumbnail(this.$sourceFilename$inlined, this.$options$inlined, this.this$0.getContext()).execute();
                    if (bitmapExecute == null) {
                        throw new GenerateThumbnailException();
                    }
                    String strGenerateOutputPath = FileUtilities.generateOutputPath(this.this$0.getContext().getCacheDir(), "VideoThumbnails", "jpg");
                    FileOutputStream fileOutputStream = new FileOutputStream(strGenerateOutputPath);
                    try {
                        bitmapExecute.compress(Bitmap.CompressFormat.JPEG, (int) (this.$options$inlined.getQuality() * ((double) 100)), fileOutputStream);
                        b.a(fileOutputStream, null);
                        Promise promise = this.$promise$inlined;
                        String string = Uri.fromFile(new File(strGenerateOutputPath)).toString();
                        s.j(string, "toString(...)");
                        promise.resolve(new VideoThumbnailResult(string, Boxing.boxInt(bitmapExecute.getWidth()), Boxing.boxInt(bitmapExecute.getHeight())));
                        return h0.f84049a;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            b.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (ModuleDestroyedException e11) {
                    this.$promise.reject("ExpoVideoThumbnails", "VideoThumbnails module destroyed", e11);
                }
            } catch (IOException e12) {
                this.$promise$inlined.reject("E_VIDEO_THUMBNAILS", e12.getMessage(), e12);
            } catch (RuntimeException e13) {
                this.$promise$inlined.reject("E_VIDEO_THUMBNAILS", e13.getMessage(), e13);
            }
        } catch (CodedException e14) {
            this.$promise.reject(e14);
        }
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((VideoThumbnailsModule$definition$lambda$4$lambda$2$$inlined$withModuleScope$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
