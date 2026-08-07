package expo.modules.filesystem;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.filesystem.FileSystemModule$definition$1$21$3", f = "FileSystemModule.kt", i = {}, l = {687}, m = "invokeSuspend", n = {}, s = {})
final class FileSystemModule$definition$1$21$3 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ FileSystemModule.DownloadResumableTaskParams $params;
    int label;
    final /* synthetic */ FileSystemModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystemModule$definition$1$21$3(FileSystemModule fileSystemModule, FileSystemModule.DownloadResumableTaskParams downloadResumableTaskParams, Continuation<? super FileSystemModule$definition$1$21$3> continuation) {
        super(2, continuation);
        this.this$0 = fileSystemModule;
        this.$params = downloadResumableTaskParams;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new FileSystemModule$definition$1$21$3(this.this$0, this.$params, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            t.b(obj);
            FileSystemModule fileSystemModule = this.this$0;
            FileSystemModule.DownloadResumableTaskParams downloadResumableTaskParams = this.$params;
            this.label = 1;
            if (fileSystemModule.downloadResumableTask(downloadResumableTaskParams, this) == coroutine_suspended) {
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
        return ((FileSystemModule$definition$1$21$3) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
