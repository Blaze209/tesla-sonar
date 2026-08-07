package expo.modules.medialibrary;

import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.medialibrary.albums.migration.CheckIfAlbumShouldBeMigrated;
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
@DebugMetadata(c = "expo.modules.medialibrary.MediaLibraryModule$definition$1$16$1$1", f = "MediaLibraryModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class MediaLibraryModule$definition$1$16$1$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ String $albumId;
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ MediaLibraryModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaLibraryModule$definition$1$16$1$1(MediaLibraryModule mediaLibraryModule, String str, Promise promise, Continuation<? super MediaLibraryModule$definition$1$16$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaLibraryModule;
        this.$albumId = str;
        this.$promise = promise;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new MediaLibraryModule$definition$1$16$1$1(this.this$0, this.$albumId, this.$promise, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        try {
            new CheckIfAlbumShouldBeMigrated(this.this$0.getContext(), this.$albumId, this.$promise).execute();
        } catch (CodedException e11) {
            this.$promise.reject(e11);
        }
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((MediaLibraryModule$definition$1$16$1$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
