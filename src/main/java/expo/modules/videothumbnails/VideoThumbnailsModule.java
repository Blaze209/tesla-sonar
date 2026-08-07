package expo.modules.videothumbnails;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.webkit.URLUtil;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.q;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.common.internal.ImagesContract;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import expo.modules.interfaces.filesystem.Permission;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.io.FileInputStream;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sn0.b;
import un0.a;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0004\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lexpo/modules/videothumbnails/VideoThumbnailsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "", ImagesContract.URL, "", "isAllowedToRead", "(Ljava/lang/String;)Z", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lkotlin/Function0;", "Ljn0/h0;", "block", "Lkotlinx/coroutines/Job;", "withModuleScope", "(Lexpo/modules/kotlin/Promise;Lwn0/a;)Lkotlinx/coroutines/Job;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lkotlinx/coroutines/CoroutineScope;", "moduleCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Companion", "GetThumbnail", "expo-video-thumbnails_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoThumbnailsModule extends Module {
    private static final String ERROR_TAG = "E_VIDEO_THUMBNAILS";
    private static final String TAG = "ExpoVideoThumbnails";
    private final CoroutineScope moduleCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lexpo/modules/videothumbnails/VideoThumbnailsModule$GetThumbnail;", "", "sourceFilename", "", "videoOptions", "Lexpo/modules/videothumbnails/VideoThumbnailOptions;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Ljava/lang/String;Lexpo/modules/videothumbnails/VideoThumbnailOptions;Landroid/content/Context;)V", "execute", "Landroid/graphics/Bitmap;", "expo-video-thumbnails_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class GetThumbnail {
        private final Context context;
        private final String sourceFilename;
        private final VideoThumbnailOptions videoOptions;

        public GetThumbnail(String sourceFilename, VideoThumbnailOptions videoOptions, Context context) {
            s.k(sourceFilename, "sourceFilename");
            s.k(videoOptions, "videoOptions");
            s.k(context, "context");
            this.sourceFilename = sourceFilename;
            this.videoOptions = videoOptions;
            this.context = context;
        }

        public final Bitmap execute() throws Exception {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
                try {
                    if (URLUtil.isFileUrl(this.sourceFilename)) {
                        String strDecode = Uri.decode(this.sourceFilename);
                        s.j(strDecode, "decode(...)");
                        mediaMetadataRetriever2.setDataSource(t.V(strDecode, "file://", "", false, 4, null));
                    } else if (URLUtil.isContentUrl(this.sourceFilename)) {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.context.getContentResolver().openFileDescriptor(Uri.parse(this.sourceFilename), "r");
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                try {
                                    mediaMetadataRetriever2.setDataSource(fileInputStream.getFD());
                                    h0 h0Var = h0.f84049a;
                                    b.a(fileInputStream, null);
                                    b.a(parcelFileDescriptorOpenFileDescriptor, null);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        b.a(fileInputStream, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    b.a(parcelFileDescriptorOpenFileDescriptor, th4);
                                    throw th5;
                                }
                            }
                        }
                    } else {
                        mediaMetadataRetriever2.setDataSource(this.sourceFilename, this.videoOptions.getHeaders());
                    }
                    Bitmap frameAtTime = mediaMetadataRetriever2.getFrameAtTime(((long) this.videoOptions.getTime()) * ((long) 1000), 2);
                    a.a(mediaMetadataRetriever, null);
                    return frameAtTime;
                } catch (Exception unused) {
                    Log.e(VideoThumbnailsModule.ERROR_TAG, "Unable to retrieve source file");
                    a.a(mediaMetadataRetriever, null);
                    return null;
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    a.a(mediaMetadataRetriever, th6);
                    throw th7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.videothumbnails.VideoThumbnailsModule$withModuleScope$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.videothumbnails.VideoThumbnailsModule$withModuleScope$1", f = "VideoThumbnailsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ wn0.a<h0> $block;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wn0.a<h0> aVar, Promise promise, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = aVar;
            this.$promise = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$block, this.$promise, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            try {
                this.$block.invoke();
            } catch (ModuleDestroyedException e11) {
                this.$promise.reject(VideoThumbnailsModule.TAG, "VideoThumbnails module destroyed", e11);
            } catch (CodedException e12) {
                this.$promise.reject(e12);
            }
            return h0.f84049a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            try {
                this.$block.invoke();
            } catch (ModuleDestroyedException e11) {
                this.$promise.reject(VideoThumbnailsModule.TAG, "VideoThumbnails module destroyed", e11);
            } catch (CodedException e12) {
                this.$promise.reject(e12);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAllowedToRead(String url) throws FilePermissionsModuleNotFound {
        FilePermissionModuleInterface filePermission = getAppContext().getFilePermission();
        if (filePermission != null) {
            return filePermission.getPathPermissions(getContext(), url).contains(Permission.READ);
        }
        throw new FilePermissionsModuleNotFound();
    }

    private final Job withModuleScope(Promise promise, wn0.a<h0> block) {
        return BuildersKt__Builders_commonKt.launch$default(this.moduleCoroutineScope, null, null, new AnonymousClass1(block, promise, null), 3, null);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name(TAG);
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.videothumbnails.VideoThumbnailsModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(VideoThumbnailOptions.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(VideoThumbnailOptions.class), false, new wn0.a<q>() { // from class: expo.modules.videothumbnails.VideoThumbnailsModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(VideoThumbnailOptions.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getThumbnail", new AsyncFunctionWithPromiseComponent("getThumbnail", new AnyType[]{anyType, anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.videothumbnails.VideoThumbnailsModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new VideoThumbnailsModule$definition$lambda$4$lambda$2$$inlined$withModuleScope$1(promise, null, (String) obj, this.this$0, (VideoThumbnailOptions) objArr[1], promise), 3, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_DESTROY;
            eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.videothumbnails.VideoThumbnailsModule$definition$lambda$4$$inlined$OnDestroy$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    try {
                        CoroutineScopeKt.cancel(this.this$0.moduleCoroutineScope, new ModuleDestroyedException(null, 1, null));
                    } catch (IllegalStateException unused) {
                        Log.e("ExpoVideoThumbnails", "The scope does not have a job in it");
                    }
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
