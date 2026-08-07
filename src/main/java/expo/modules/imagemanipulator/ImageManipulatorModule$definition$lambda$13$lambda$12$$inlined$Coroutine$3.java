package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import android.net.Uri;
import com.plaid.internal.EnumC4419g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3", f = "ImageManipulatorModule.kt", i = {0, 0, 0}, l = {EnumC4419g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {"path", "resultBitmap", "base64String"}, s = {"L$0", "L$1", "L$2"})
public final class ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ImageManipulatorModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3(Continuation continuation, ImageManipulatorModule imageManipulatorModule) {
        super(3, continuation);
        this.this$0 = imageManipulatorModule;
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ImageWriteFailedException {
        String str;
        Bitmap bitmap;
        n0 n0Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            t.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            ManipulateOptions manipulateOptions = (ManipulateOptions) objArr[1];
            ImageRef imageRef = (ImageRef) obj2;
            if (manipulateOptions == null) {
                manipulateOptions = new ManipulateOptions();
            }
            ManipulateOptions manipulateOptions2 = manipulateOptions;
            String strGenerateRandomOutputPath = FileUtils.INSTANCE.generateRandomOutputPath(this.this$0.getContext(), manipulateOptions2.getFormat());
            int compress = (int) (manipulateOptions2.getCompress() * ((double) 100));
            Bitmap ref = imageRef.getRef();
            n0 n0Var2 = new n0();
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.this$0.getAppContext().getBackgroundCoroutineScope(), null, null, new ImageManipulatorModule$definition$1$3$3$1(strGenerateRandomOutputPath, manipulateOptions2, ref, compress, n0Var2, null), 3, null);
            this.L$0 = strGenerateRandomOutputPath;
            this.L$1 = ref;
            this.L$2 = n0Var2;
            this.label = 1;
            if (deferredAsync$default.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = strGenerateRandomOutputPath;
            bitmap = ref;
            n0Var = n0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) this.L$2;
            bitmap = (Bitmap) this.L$1;
            str = (String) this.L$0;
            t.b(obj);
        }
        return v0.m(x.a("uri", Uri.fromFile(new File(str)).toString()), x.a(Snapshot.WIDTH, Boxing.boxInt(bitmap.getWidth())), x.a(Snapshot.HEIGHT, Boxing.boxInt(bitmap.getHeight())), x.a("base64", n0Var.f86529a));
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3 imageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3 = new ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3(continuation, this.this$0);
        imageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3.L$0 = objArr;
        return imageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3.invokeSuspend(h0.f84049a);
    }
}
