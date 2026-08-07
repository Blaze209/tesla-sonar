package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import android.net.Uri;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagemanipulator.ImageManipulatorModule$createManipulatorContext$loader$1", f = "ImageManipulatorModule.kt", i = {0}, l = {150}, m = "invokeSuspend", n = {"imageLoader"}, s = {"L$0"})
final class ImageManipulatorModule$createManipulatorContext$loader$1 extends SuspendLambda implements l<Continuation<? super Bitmap>, Object> {
    final /* synthetic */ Uri $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImageManipulatorModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageManipulatorModule$createManipulatorContext$loader$1(ImageManipulatorModule imageManipulatorModule, Uri uri, Continuation<? super ImageManipulatorModule$createManipulatorContext$loader$1> continuation) {
        super(1, continuation);
        this.this$0 = imageManipulatorModule;
        this.$url = uri;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Continuation<?> continuation) {
        return new ImageManipulatorModule$createManipulatorContext$loader$1(this.this$0, this.$url, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ImageLoaderNotFoundException {
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
        ImageLoaderInterface imageLoader = this.this$0.getAppContext().getImageLoader();
        if (imageLoader == null) {
            throw new ImageLoaderNotFoundException();
        }
        final Uri uri = this.$url;
        this.L$0 = imageLoader;
        this.L$1 = uri;
        this.label = 1;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
        cancellableContinuationImpl.initCancellability();
        imageLoader.loadImageForManipulationFromURL(uri.toString(), new ImageLoaderInterface.ResultListener() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$createManipulatorContext$loader$1$1$1
            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onFailure(Throwable cause) {
                CodedException unexpectedException;
                CodedException unexpectedException2;
                CancellableContinuation<Bitmap> cancellableContinuation = cancellableContinuationImpl;
                String string = uri.toString();
                s.j(string, "toString(...)");
                if (cause == null) {
                    unexpectedException2 = new UnexpectedException("Unknown error");
                } else if (cause instanceof CodedException) {
                    unexpectedException2 = (CodedException) cause;
                } else {
                    if (cause instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) cause;
                        String code = codedException.getCode();
                        s.j(code, "getCode(...)");
                        unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(cause);
                    }
                    unexpectedException2 = unexpectedException;
                }
                ImageLoadingFailedException imageLoadingFailedException = new ImageLoadingFailedException(string, unexpectedException2);
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(t.a(imageLoadingFailedException)));
            }

            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onSuccess(Bitmap bitmap) {
                s.k(bitmap, "bitmap");
                cancellableContinuationImpl.resumeWith(jn0.s.b(bitmap));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }

    @Override // wn0.l
    public final Object invoke(Continuation<? super Bitmap> continuation) {
        return ((ImageManipulatorModule$createManipulatorContext$loader$1) create(continuation)).invokeSuspend(h0.f84049a);
    }
}
