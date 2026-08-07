package expo.modules.medialibrary;

import android.net.Uri;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.medialibrary.albums.CreateAlbum;
import expo.modules.medialibrary.albums.CreateAlbumWithInitialFileUri;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "expo/modules/medialibrary/MediaLibraryModule$withModuleScope$1"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.medialibrary.MediaLibraryModule$definition$1$12$1$action$1$invoke$$inlined$withModuleScope$1", f = "MediaLibraryModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaLibraryModule$definition$1$12$1$action$1$invoke$$inlined$withModuleScope$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ String $albumName$inlined;
    final /* synthetic */ String $assetId$inlined;
    final /* synthetic */ boolean $copyAsset$inlined;
    final /* synthetic */ Uri $initialAssetUri$inlined;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Promise $promise$inlined;
    int label;
    final /* synthetic */ MediaLibraryModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaLibraryModule$definition$1$12$1$action$1$invoke$$inlined$withModuleScope$1(Promise promise, Continuation continuation, String str, Uri uri, MediaLibraryModule mediaLibraryModule, String str2, boolean z11, Promise promise2) {
        super(2, continuation);
        this.$promise = promise;
        this.$assetId$inlined = str;
        this.$initialAssetUri$inlined = uri;
        this.this$0 = mediaLibraryModule;
        this.$albumName$inlined = str2;
        this.$copyAsset$inlined = z11;
        this.$promise$inlined = promise2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new MediaLibraryModule$definition$1$12$1$action$1$invoke$$inlined$withModuleScope$1(this.$promise, continuation, this.$assetId$inlined, this.$initialAssetUri$inlined, this.this$0, this.$albumName$inlined, this.$copyAsset$inlined, this.$promise$inlined);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        try {
            if (this.$assetId$inlined != null) {
                new CreateAlbum(this.this$0.getContext(), this.$albumName$inlined, this.$assetId$inlined, this.$copyAsset$inlined, this.$promise$inlined).execute();
            }
            Uri uri = this.$initialAssetUri$inlined;
            if (uri != null) {
                new CreateAlbumWithInitialFileUri(this.this$0.getContext(), this.$albumName$inlined, uri, this.$promise$inlined).execute();
            }
        } catch (ModuleDestroyedException e11) {
            Promise promise = this.$promise;
            String tAG$expo_media_library_release = MediaLibraryModule.INSTANCE.getTAG$expo_media_library_release();
            s.j(tAG$expo_media_library_release, "<get-TAG>(...)");
            promise.reject(tAG$expo_media_library_release, "MediaLibrary module destroyed", e11);
        } catch (CodedException e12) {
            this.$promise.reject(e12);
        }
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((MediaLibraryModule$definition$1$12$1$action$1$invoke$$inlined$withModuleScope$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
