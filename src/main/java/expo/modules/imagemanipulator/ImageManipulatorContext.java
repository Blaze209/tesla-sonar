package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import expo.modules.imagemanipulator.transformers.ImageTransformer;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.sharedobjects.SharedObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/imagemanipulator/ImageManipulatorContext;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lexpo/modules/kotlin/RuntimeContext;", "runtimeContext", "Lexpo/modules/imagemanipulator/ManipulatorTask;", "task", "<init>", "(Lexpo/modules/kotlin/RuntimeContext;Lexpo/modules/imagemanipulator/ManipulatorTask;)V", "Lexpo/modules/imagemanipulator/transformers/ImageTransformer;", "transformer", "addTransformer", "(Lexpo/modules/imagemanipulator/transformers/ImageTransformer;)Lexpo/modules/imagemanipulator/ImageManipulatorContext;", "reset", "()Lexpo/modules/imagemanipulator/ImageManipulatorContext;", "Landroid/graphics/Bitmap;", "render", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "sharedObjectDidRelease", "()V", "Lexpo/modules/imagemanipulator/ManipulatorTask;", "expo-image-manipulator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageManipulatorContext extends SharedObject {
    private final ManipulatorTask task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageManipulatorContext(RuntimeContext runtimeContext, ManipulatorTask task) {
        super(runtimeContext);
        s.k(runtimeContext, "runtimeContext");
        s.k(task, "task");
        this.task = task;
    }

    public final ImageManipulatorContext addTransformer(ImageTransformer transformer) {
        s.k(transformer, "transformer");
        this.task.addTransformer(transformer);
        return this;
    }

    public final Object render(Continuation<? super Bitmap> continuation) {
        return this.task.render(continuation);
    }

    public final ImageManipulatorContext reset() {
        this.task.reset();
        return this;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void sharedObjectDidRelease() {
        this.task.cancel();
    }
}
