package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2", f = "ImageManipulatorModule.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
public final class ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ImageManipulatorModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2(Continuation continuation, ImageManipulatorModule imageManipulatorModule) {
        super(3, continuation);
        this.this$0 = imageManipulatorModule;
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            t.b(obj);
            ImageManipulatorContext imageManipulatorContext = (ImageManipulatorContext) ((Object[]) this.L$0)[0];
            this.label = 1;
            obj = imageManipulatorContext.render(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return new ImageRef((Bitmap) obj, this.this$0.getRuntimeContext());
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2 imageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2 = new ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2(continuation, this.this$0);
        imageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2.L$0 = objArr;
        return imageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2.invokeSuspend(h0.f84049a);
    }
}
