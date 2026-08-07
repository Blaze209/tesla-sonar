package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagemanipulator.ImageManipulatorModule$createManipulatorContext$task$1", f = "ImageManipulatorModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ImageManipulatorModule$createManipulatorContext$task$1 extends SuspendLambda implements l<Continuation<? super Bitmap>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageManipulatorModule$createManipulatorContext$task$1(Bitmap bitmap, Continuation<? super ImageManipulatorModule$createManipulatorContext$task$1> continuation) {
        super(1, continuation);
        this.$bitmap = bitmap;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Continuation<?> continuation) {
        return new ImageManipulatorModule$createManipulatorContext$task$1(this.$bitmap, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        return this.$bitmap;
    }

    @Override // wn0.l
    public final Object invoke(Continuation<? super Bitmap> continuation) {
        return ((ImageManipulatorModule$createManipulatorContext$task$1) create(continuation)).invokeSuspend(h0.f84049a);
    }
}
