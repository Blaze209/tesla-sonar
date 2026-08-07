package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import sn0.b;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.imagemanipulator.ImageManipulatorModule$definition$1$3$3$1", f = "ImageManipulatorModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ImageManipulatorModule$definition$1$3$3$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ n0<String> $base64String;
    final /* synthetic */ int $compression;
    final /* synthetic */ ManipulateOptions $options;
    final /* synthetic */ String $path;
    final /* synthetic */ Bitmap $resultBitmap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageManipulatorModule$definition$1$3$3$1(String str, ManipulateOptions manipulateOptions, Bitmap bitmap, int i11, n0<String> n0Var, Continuation<? super ImageManipulatorModule$definition$1$3$3$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.$options = manipulateOptions;
        this.$resultBitmap = bitmap;
        this.$compression = i11;
        this.$base64String = n0Var;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new ImageManipulatorModule$definition$1$3$3$1(this.$path, this.$options, this.$resultBitmap, this.$compression, this.$base64String, continuation);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        FileOutputStream fileOutputStream = new FileOutputStream(this.$path);
        ManipulateOptions manipulateOptions = this.$options;
        Bitmap bitmap = this.$resultBitmap;
        int i11 = this.$compression;
        n0<String> n0Var = this.$base64String;
        try {
            Bitmap.CompressFormat compressFormat = manipulateOptions.getFormat().getCompressFormat();
            bitmap.compress(compressFormat, i11, fileOutputStream);
            if (manipulateOptions.getBase64()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(compressFormat, i11, byteArrayOutputStream);
                    n0Var.f86529a = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    h0 h0Var = h0.f84049a;
                    b.a(byteArrayOutputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(byteArrayOutputStream, th2);
                        throw th3;
                    }
                }
            }
            h0 h0Var2 = h0.f84049a;
            b.a(fileOutputStream, null);
            return h0.f84049a;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(fileOutputStream, th4);
                throw th5;
            }
        }
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((ImageManipulatorModule$definition$1$3$3$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
