package expo.modules.medialibrary;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentSender;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.q;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
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
import expo.modules.medialibrary.albums.AlbumUtilsKt;
import expo.modules.medialibrary.albums.migration.MigrateAlbum;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.m;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.s0;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 A2\u00020\u0001:\u0003BCAB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0016\u0010\u0014J(\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ/\u0010$\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010/\u001a\b\u0018\u00010.R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00101\u001a\b\u0018\u00010.R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0018\u00102\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00106\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001bR!\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u001bR\u0014\u0010@\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u001b¨\u0006D"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lkotlin/Function0;", "Ljn0/h0;", "block", "Lkotlinx/coroutines/Job;", "withModuleScope", "(Lexpo/modules/kotlin/Promise;Lwn0/a;)Lkotlinx/coroutines/Job;", "", "writeOnly", "", "Lexpo/modules/medialibrary/GranularPermission;", "granularPermissions", "", "", "getManifestPermissions", "(ZLjava/util/List;)[Ljava/lang/String;", "shouldIncludeGranular", "getGranularPermissions", "isWrite", "throwUnlessPermissionsGranted", "(ZLwn0/a;)V", "hasReadPermissions", "()Z", "permissions", "maybeThrowIfExpoGo", "(Ljava/util/List;)V", "hasWritePermissions", "assetsId", "Lexpo/modules/medialibrary/MediaLibraryModule$Action;", "action", "useDeletePermission", "runActionWithPermissions", "(Ljava/util/List;Lexpo/modules/medialibrary/MediaLibraryModule$Action;Z)V", "actionIfUserGrantedPermission", "(Lexpo/modules/kotlin/Promise;Lwn0/a;)Lexpo/modules/medialibrary/MediaLibraryModule$Action;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lkotlinx/coroutines/CoroutineScope;", "moduleCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;", "imagesObserver", "Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;", "videosObserver", "awaitingAction", "Lexpo/modules/medialibrary/MediaLibraryModule$Action;", "isExpoGo$delegate", "Lkotlin/Lazy;", "isExpoGo", "allowedPermissionsList$delegate", "getAllowedPermissionsList", "()Ljava/util/List;", "allowedPermissionsList", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "isMissingPermissions", "isMissingWritePermission", "Companion", "Action", "MediaStoreContentObserver", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaLibraryModule extends Module {
    private static final int DELETE_REQUEST_CODE = 7464;
    private static final int WRITE_REQUEST_CODE = 7463;
    private Action awaitingAction;
    private MediaStoreContentObserver imagesObserver;
    private MediaStoreContentObserver videosObserver;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = MediaLibraryModule.class.getSimpleName();
    private final CoroutineScope moduleCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: renamed from: isExpoGo$delegate, reason: from kotlin metadata */
    private final Lazy isExpoGo = m.b(new wn0.a() { // from class: expo.modules.medialibrary.a
        @Override // wn0.a
        public final Object invoke() {
            return Boolean.valueOf(MediaLibraryModule.isExpoGo_delegate$lambda$0(this.f63409a));
        }
    });

    /* JADX INFO: renamed from: allowedPermissionsList$delegate, reason: from kotlin metadata */
    private final Lazy allowedPermissionsList = m.b(new wn0.a() { // from class: expo.modules.medialibrary.b
        @Override // wn0.a
        public final Object invoke() {
            return MediaLibraryModule.allowedPermissionsList_delegate$lambda$1(this.f63415a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryModule$Action;", "", "", "permissionsWereGranted", "Ljn0/h0;", "runWithPermissions", "(Z)V", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface Action {
        void runWithPermissions(boolean permissionsWereGranted);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryModule$Companion;", "", "<init>", "()V", "WRITE_REQUEST_CODE", "", "DELETE_REQUEST_CODE", "TAG", "", "kotlin.jvm.PlatformType", "getTAG$expo_media_library_release", "()Ljava/lang/String;", "Ljava/lang/String;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG$expo_media_library_release() {
            return MediaLibraryModule.TAG;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;", "Landroid/database/ContentObserver;", "Landroid/os/Handler;", "handler", "", "mMediaType", "<init>", "(Lexpo/modules/medialibrary/MediaLibraryModule;Landroid/os/Handler;I)V", "mediaType", "getAssetsTotalCount", "(I)I", "", "selfChange", "Ljn0/h0;", "onChange", "(Z)V", "Landroid/net/Uri;", "uri", "(ZLandroid/net/Uri;)V", "I", "mAssetsTotalCount", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class MediaStoreContentObserver extends ContentObserver {
        private int mAssetsTotalCount;
        private final int mMediaType;
        final /* synthetic */ MediaLibraryModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaStoreContentObserver(MediaLibraryModule mediaLibraryModule, Handler handler, int i11) {
            super(handler);
            s.k(handler, "handler");
            this.this$0 = mediaLibraryModule;
            this.mMediaType = i11;
            this.mAssetsTotalCount = getAssetsTotalCount(i11);
        }

        private final int getAssetsTotalCount(int mediaType) {
            int count = 0;
            Cursor cursorQuery = this.this$0.getContext().getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[0], "media_type == " + mediaType, null, null);
            if (cursorQuery != null) {
                try {
                    count = cursorQuery.getCount();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
            sn0.b.a(cursorQuery, null);
            return count;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            onChange(selfChange, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            int assetsTotalCount = getAssetsTotalCount(this.mMediaType);
            if (this.mAssetsTotalCount != assetsTotalCount) {
                this.mAssetsTotalCount = assetsTotalCount;
                this.this$0.sendEvent(MediaLibraryConstantsKt.LIBRARY_DID_CHANGE_EVENT, new Bundle());
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.MediaLibraryModule$withModuleScope$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.medialibrary.MediaLibraryModule$withModuleScope$1", f = "MediaLibraryModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            t.b(obj);
            try {
                this.$block.invoke();
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

        public final Object invokeSuspend$$forInline(Object obj) {
            try {
                this.$block.invoke();
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Action actionIfUserGrantedPermission(final Promise promise, final wn0.a<h0> block) {
        return new Action() { // from class: expo.modules.medialibrary.c
            @Override // expo.modules.medialibrary.MediaLibraryModule.Action
            public final void runWithPermissions(boolean z11) {
                MediaLibraryModule.actionIfUserGrantedPermission$lambda$54(promise, block, z11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void actionIfUserGrantedPermission$lambda$54(Promise promise, wn0.a aVar, boolean z11) {
        if (z11) {
            aVar.invoke();
        } else {
            promise.reject(new PermissionsException(MediaLibraryConstantsKt.ERROR_USER_DID_NOT_GRANT_WRITE_PERMISSIONS_MESSAGE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allowedPermissionsList_delegate$lambda$1(MediaLibraryModule mediaLibraryModule) {
        return mediaLibraryModule.isExpoGo() ? v.e(GranularPermission.AUDIO) : v.p(GranularPermission.AUDIO, GranularPermission.PHOTO, GranularPermission.VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GranularPermission> getAllowedPermissionsList() {
        return (List) this.allowedPermissionsList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    @SuppressLint({"InlinedApi"})
    private final String[] getGranularPermissions(boolean shouldIncludeGranular, List<? extends GranularPermission> granularPermissions) {
        if (shouldIncludeGranular) {
            return (String[]) v.r(granularPermissions.contains(GranularPermission.PHOTO) ? "android.permission.READ_MEDIA_IMAGES" : null, granularPermissions.contains(GranularPermission.VIDEO) ? "android.permission.READ_MEDIA_VIDEO" : null, granularPermissions.contains(GranularPermission.AUDIO) ? "android.permission.READ_MEDIA_AUDIO" : null).toArray(new String[0]);
        }
        return new String[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public final String[] getManifestPermissions(boolean writeOnly, List<? extends GranularPermission> granularPermissions) {
        boolean z11;
        int i11 = Build.VERSION.SDK_INT;
        boolean z12 = i11 >= 29 && MediaLibraryUtils.INSTANCE.hasManifestPermission(getContext(), "android.permission.ACCESS_MEDIA_LOCATION") && !(i11 >= 33 && granularPermissions.size() == 1 && granularPermissions.contains(GranularPermission.AUDIO));
        boolean z13 = i11 < 33 && MediaLibraryUtils.INSTANCE.hasManifestPermission(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        if (i11 >= 33) {
            List<? extends GranularPermission> list = granularPermissions;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!MediaLibraryUtils.INSTANCE.hasManifestPermission(getContext(), ((GranularPermission) it.next()).toManifestPermission())) {
                            z11 = false;
                        }
                    }
                }
            }
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z11 && !writeOnly;
        s0 s0Var = new s0(4);
        s0Var.a(z13 ? "android.permission.WRITE_EXTERNAL_STORAGE" : null);
        s0Var.a((writeOnly || z11) ? null : "android.permission.READ_EXTERNAL_STORAGE");
        s0Var.a(z12 ? "android.permission.ACCESS_MEDIA_LOCATION" : null);
        s0Var.b(getGranularPermissions(z14, granularPermissions));
        return (String[]) v.r(s0Var.d(new String[s0Var.c()])).toArray(new String[0]);
    }

    private final boolean hasReadPermissions() {
        if (Build.VERSION.SDK_INT < 33) {
            String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
            Permissions permissions = getAppContext().getPermissions();
            if (permissions != null) {
                return !permissions.hasGrantedPermissions((String[]) Arrays.copyOf(strArr, 2));
            }
            return false;
        }
        List<GranularPermission> allowedPermissionsList = getAllowedPermissionsList();
        ArrayList arrayList = new ArrayList(v.y(allowedPermissionsList, 10));
        Iterator<T> it = allowedPermissionsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((GranularPermission) it.next()).toManifestPermission());
        }
        List listP1 = v.p1(arrayList);
        if (Build.VERSION.SDK_INT >= 34) {
            listP1.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        List<String> list = listP1;
        ArrayList arrayList2 = new ArrayList(v.y(list, 10));
        for (String str : list) {
            Permissions permissions2 = getAppContext().getPermissions();
            arrayList2.add(Boolean.valueOf(permissions2 != null ? permissions2.hasGrantedPermissions(str) : false));
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean hasWritePermissions() {
        Permissions permissions;
        if (Build.VERSION.SDK_INT < 33 && (permissions = getAppContext().getPermissions()) != null) {
            return !permissions.hasGrantedPermissions("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return false;
    }

    private final boolean isExpoGo() {
        return ((Boolean) this.isExpoGo.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpoGo_delegate$lambda$0(MediaLibraryModule mediaLibraryModule) {
        return Boolean.parseBoolean(mediaLibraryModule.getContext().getResources().getString(R.string.is_expo_go));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMissingPermissions() {
        return hasReadPermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMissingWritePermission() {
        return hasWritePermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeThrowIfExpoGo(List<? extends GranularPermission> permissions) throws PermissionsException {
        if (isExpoGo()) {
            if (permissions.contains(GranularPermission.PHOTO) || permissions.contains(GranularPermission.VIDEO)) {
                throw new PermissionsException("Due to changes in Androids permission requirements, Expo Go can no longer provide full access to the media library. To test the full functionality of this module, you can create a development build");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runActionWithPermissions(List<String> assetsId, Action action, boolean useDeletePermission) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 30) {
            List<Uri> assetsUris = MediaLibraryUtils.INSTANCE.getAssetsUris(getContext(), assetsId);
            ArrayList arrayList = new ArrayList();
            for (Object obj : assetsUris) {
                if (getContext().checkUriPermission((Uri) obj, Binder.getCallingPid(), Binder.getCallingUid(), 2) != 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                PendingIntent pendingIntentCreateDeleteRequest = useDeletePermission ? MediaStore.createDeleteRequest(getContext().getContentResolver(), arrayList) : MediaStore.createWriteRequest(getContext().getContentResolver(), arrayList);
                s.h(pendingIntentCreateDeleteRequest);
                try {
                    this.awaitingAction = action;
                    getAppContext().getThrowingActivity().startIntentSenderForResult(pendingIntentCreateDeleteRequest.getIntentSender(), useDeletePermission ? DELETE_REQUEST_CODE : WRITE_REQUEST_CODE, null, 0, 0, 0);
                    return;
                } catch (IntentSender.SendIntentException e11) {
                    this.awaitingAction = null;
                    throw e11;
                }
            }
        }
        action.runWithPermissions(true);
    }

    static /* synthetic */ void runActionWithPermissions$default(MediaLibraryModule mediaLibraryModule, List list, Action action, boolean z11, int i11, Object obj) throws IntentSender.SendIntentException {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        mediaLibraryModule.runActionWithPermissions(list, action, z11);
    }

    private final void throwUnlessPermissionsGranted(boolean isWrite, wn0.a<h0> block) throws PermissionsException {
        if (isWrite ? isMissingWritePermission() : isMissingPermissions()) {
            throw new PermissionsException(isWrite ? MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE : MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS_MESSAGE);
        }
        block.invoke();
    }

    static /* synthetic */ void throwUnlessPermissionsGranted$default(MediaLibraryModule mediaLibraryModule, boolean z11, wn0.a aVar, int i11, Object obj) throws PermissionsException {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if (z11 ? mediaLibraryModule.isMissingWritePermission() : mediaLibraryModule.isMissingPermissions()) {
            throw new PermissionsException(z11 ? MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE : MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS_MESSAGE);
        }
        aVar.invoke();
    }

    private final Job withModuleScope(Promise promise, wn0.a<h0> block) {
        return BuildersKt__Builders_commonKt.launch$default(this.moduleCoroutineScope, null, null, new AnonymousClass1(block, promise, null), 3, null);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoMediaLibrary");
            moduleDefinitionBuilder.Constants(new wn0.a<Map<String, ? extends Object>>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$1
                @Override // wn0.a
                public final Map<String, ? extends Object> invoke() {
                    return v0.m(x.a("MediaType", MediaType.INSTANCE.getConstants()), x.a("SortBy", SortBy.INSTANCE.getConstants()), x.a("CHANGE_LISTENER_NAME", MediaLibraryConstantsKt.LIBRARY_DID_CHANGE_EVENT));
                }
            });
            moduleDefinitionBuilder.Events(MediaLibraryConstantsKt.LIBRARY_DID_CHANGE_EVENT);
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(Boolean.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Boolean.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Boolean.TYPE);
                    }
                }), converters);
            }
            d dVarB2 = o0.b(List.class);
            Boolean bool2 = Boolean.TRUE;
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool2));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(List.class), true, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.h(List.class, co0.s.INSTANCE.d(o0.o(GranularPermission.class)));
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestPermissionsAsync", new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[]{anyType, anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    List allowedPermissionsList = (List) objArr[1];
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    if (allowedPermissionsList == null) {
                        allowedPermissionsList = this.this$0.getAllowedPermissionsList();
                    }
                    this.this$0.maybeThrowIfExpoGo(allowedPermissionsList);
                    Permissions permissions = this.this$0.getAppContext().getPermissions();
                    MediaLibraryPermissionPromiseWrapper mediaLibraryPermissionPromiseWrapper = new MediaLibraryPermissionPromiseWrapper(allowedPermissionsList, promise, new WeakReference(this.this$0.getContext()));
                    String[] manifestPermissions = this.this$0.getManifestPermissions(zBooleanValue, allowedPermissionsList);
                    Permissions.askForPermissionsWithPermissionsManager(permissions, mediaLibraryPermissionPromiseWrapper, (String[]) Arrays.copyOf(manifestPermissions, manifestPermissions.length));
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r4), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(Boolean.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Boolean.TYPE);
                    }
                }), converters2);
            }
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(List.class), bool2));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(o0.b(List.class), true, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.h(List.class, co0.s.INSTANCE.d(o0.o(GranularPermission.class)));
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPermissionsAsync", new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[]{anyType3, anyType4}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$6
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    List allowedPermissionsList = (List) objArr[1];
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    if (allowedPermissionsList == null) {
                        allowedPermissionsList = this.this$0.getAllowedPermissionsList();
                    }
                    this.this$0.maybeThrowIfExpoGo(allowedPermissionsList);
                    Permissions permissions = this.this$0.getAppContext().getPermissions();
                    MediaLibraryPermissionPromiseWrapper mediaLibraryPermissionPromiseWrapper = new MediaLibraryPermissionPromiseWrapper(allowedPermissionsList, promise, new WeakReference(this.this$0.getContext()));
                    String[] manifestPermissions = this.this$0.getManifestPermissions(zBooleanValue, allowedPermissionsList);
                    Permissions.getPermissionsWithPermissionsManager(permissions, mediaLibraryPermissionPromiseWrapper, (String[]) Arrays.copyOf(manifestPermissions, manifestPermissions.length));
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("saveToLibraryAsync", new AsyncFunctionWithPromiseComponent("saveToLibraryAsync", new AnyType[]{anyType5}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$8
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (this.this$0.isMissingWritePermission()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE);
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$lambda$42$lambda$6$lambda$5$$inlined$withModuleScope$1(promise, null, this.this$0, str, promise), 3, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$9
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters4);
            }
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool2));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters4);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("createAssetAsync", new AsyncFunctionWithPromiseComponent("createAssetAsync", new AnyType[]{anyType6, anyType7}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$11
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    String str2 = (String) obj;
                    if (this.this$0.isMissingWritePermission()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE);
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$lambda$42$lambda$9$lambda$8$$inlined$withModuleScope$1(promise, null, this.this$0, str2, promise, str), 3, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters5 = moduleDefinitionBuilder.getConverters();
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(List.class), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(o0.b(List.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$12
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.p(List.class, co0.s.INSTANCE.d(o0.o(String.class)));
                    }
                }), converters5);
            }
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$13
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters5);
            }
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r4), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(o0.b(r4), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$14
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Boolean.TYPE);
                    }
                }), converters5);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("addAssetsToAlbumAsync", new AsyncFunctionWithPromiseComponent("addAssetsToAlbumAsync", new AnyType[]{anyType8, anyType9, anyType10}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$15
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) throws IntentSender.SendIntentException, PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                    final String str = (String) obj2;
                    final List listM = (List) obj;
                    if (this.this$0.isMissingWritePermission()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE);
                    }
                    final MediaLibraryModule mediaLibraryModule = this.this$0;
                    MediaLibraryModule.Action actionActionIfUserGrantedPermission = mediaLibraryModule.actionIfUserGrantedPermission(promise, new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$6$1$action$1
                        @Override // wn0.a
                        public /* bridge */ /* synthetic */ h0 invoke() {
                            invoke2();
                            return h0.f84049a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            MediaLibraryModule mediaLibraryModule2 = mediaLibraryModule;
                            Promise promise2 = promise;
                            BuildersKt__Builders_commonKt.launch$default(mediaLibraryModule2.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$1$6$1$action$1$invoke$$inlined$withModuleScope$1(promise2, null, mediaLibraryModule2, listM, str, zBooleanValue, promise2), 3, null);
                        }
                    });
                    MediaLibraryModule mediaLibraryModule2 = this.this$0;
                    if (zBooleanValue) {
                        listM = v.m();
                    }
                    MediaLibraryModule.runActionWithPermissions$default(mediaLibraryModule2, listM, actionActionIfUserGrantedPermission, false, 4, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws IntentSender.SendIntentException, PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters6 = moduleDefinitionBuilder.getConverters();
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r5), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(o0.b(List.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$16
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.p(List.class, co0.s.INSTANCE.d(o0.o(String.class)));
                    }
                }), converters6);
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$17
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters6);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("removeAssetsFromAlbumAsync", new AsyncFunctionWithPromiseComponent("removeAssetsFromAlbumAsync", new AnyType[]{anyType11, anyType12}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$18
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) throws IntentSender.SendIntentException, PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    final String str = (String) objArr[1];
                    final List list = (List) obj;
                    if (this.this$0.isMissingWritePermission()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE);
                    }
                    final MediaLibraryModule mediaLibraryModule = this.this$0;
                    MediaLibraryModule.runActionWithPermissions$default(this.this$0, list, mediaLibraryModule.actionIfUserGrantedPermission(promise, new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$7$1$action$1
                        @Override // wn0.a
                        public /* bridge */ /* synthetic */ h0 invoke() {
                            invoke2();
                            return h0.f84049a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            MediaLibraryModule mediaLibraryModule2 = mediaLibraryModule;
                            Promise promise2 = promise;
                            BuildersKt__Builders_commonKt.launch$default(mediaLibraryModule2.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$1$7$1$action$1$invoke$$inlined$withModuleScope$1(promise2, null, mediaLibraryModule2, list, str, promise2), 3, null);
                        }
                    }), false, 4, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws IntentSender.SendIntentException, PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters7 = moduleDefinitionBuilder.getConverters();
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r5), bool));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(o0.b(r5), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$19
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.p(List.class, co0.s.INSTANCE.d(o0.o(String.class)));
                    }
                }), converters7);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteAssetsAsync", new AsyncFunctionWithPromiseComponent("deleteAssetsAsync", new AnyType[]{anyType13}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$20
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) throws IntentSender.SendIntentException, PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    final List list = (List) objArr[0];
                    if (this.this$0.isMissingWritePermission()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE);
                    }
                    final MediaLibraryModule mediaLibraryModule = this.this$0;
                    this.this$0.runActionWithPermissions(list, mediaLibraryModule.actionIfUserGrantedPermission(promise, new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$8$1$action$1
                        @Override // wn0.a
                        public /* bridge */ /* synthetic */ h0 invoke() {
                            invoke2();
                            return h0.f84049a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            MediaLibraryModule mediaLibraryModule2 = mediaLibraryModule;
                            Promise promise2 = promise;
                            BuildersKt__Builders_commonKt.launch$default(mediaLibraryModule2.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$1$8$1$action$1$invoke$$inlined$withModuleScope$1(promise2, null, mediaLibraryModule2, list, promise2), 3, null);
                        }
                    }), true);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws IntentSender.SendIntentException, PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters8 = moduleDefinitionBuilder.getConverters();
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$21
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters8);
            }
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r3), bool2));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(o0.b(Map.class), true, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$22
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        co0.s.Companion companion = co0.s.INSTANCE;
                        return o0.i(Map.class, companion.d(o0.o(String.class)), companion.d(o0.g(Object.class)));
                    }
                }), converters8);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getAssetInfoAsync", new AsyncFunctionWithPromiseComponent("getAssetInfoAsync", new AnyType[]{anyType14, anyType15}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$23
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    String str = (String) obj;
                    if (this.this$0.isMissingPermissions()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS_MESSAGE);
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$lambda$42$lambda$18$lambda$17$$inlined$withModuleScope$1(promise, null, this.this$0, str, promise), 3, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters9 = moduleDefinitionBuilder.getConverters();
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r3), bool2));
            if (anyType16 == null) {
                anyType16 = new AnyType(new LazyKType(o0.b(r3), true, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$24
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        co0.s.Companion companion = co0.s.INSTANCE;
                        return o0.i(Map.class, companion.d(o0.o(String.class)), companion.d(o0.g(Object.class)));
                    }
                }), converters9);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getAlbumsAsync", new AsyncFunctionWithPromiseComponent("getAlbumsAsync", new AnyType[]{anyType16}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$25
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    if (this.this$0.isMissingPermissions()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS_MESSAGE);
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$lambda$42$lambda$21$lambda$20$$inlined$withModuleScope$1(promise, null, this.this$0, promise), 3, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters10 = moduleDefinitionBuilder.getConverters();
            AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType17 == null) {
                anyType17 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$26
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters10);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getAlbumAsync", new AsyncFunctionWithPromiseComponent("getAlbumAsync", new AnyType[]{anyType17}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$27
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (this.this$0.isMissingPermissions()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS_MESSAGE);
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$lambda$42$lambda$24$lambda$23$$inlined$withModuleScope$1(promise, null, this.this$0, str, promise), 3, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters11 = moduleDefinitionBuilder.getConverters();
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$28
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters11);
            }
            AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool2));
            if (anyType19 == null) {
                anyType19 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$29
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters11);
            }
            AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r4), bool));
            if (anyType20 == null) {
                anyType20 = new AnyType(new LazyKType(o0.b(r4), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$30
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Boolean.TYPE);
                    }
                }), converters11);
            }
            AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r2), bool2));
            if (anyType21 == null) {
                anyType21 = new AnyType(new LazyKType(o0.b(Uri.class), true, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$31
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(Uri.class);
                    }
                }), converters11);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("createAlbumAsync", new AsyncFunctionWithPromiseComponent("createAlbumAsync", new AnyType[]{anyType18, anyType19, anyType20, anyType21}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$32
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) throws IntentSender.SendIntentException, PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    Object obj3 = objArr[2];
                    final Uri uri = (Uri) objArr[3];
                    final boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    final String str = (String) obj2;
                    final String str2 = (String) obj;
                    if (this.this$0.isMissingWritePermission()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE);
                    }
                    final MediaLibraryModule mediaLibraryModule = this.this$0;
                    MediaLibraryModule.runActionWithPermissions$default(this.this$0, (zBooleanValue || str == null) ? v.m() : v.e(str), mediaLibraryModule.actionIfUserGrantedPermission(promise, new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$12$1$action$1
                        @Override // wn0.a
                        public /* bridge */ /* synthetic */ h0 invoke() {
                            invoke2();
                            return h0.f84049a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            MediaLibraryModule mediaLibraryModule2 = mediaLibraryModule;
                            Promise promise2 = promise;
                            BuildersKt__Builders_commonKt.launch$default(mediaLibraryModule2.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$1$12$1$action$1$invoke$$inlined$withModuleScope$1(promise2, null, str, uri, mediaLibraryModule2, str2, zBooleanValue, promise2), 3, null);
                        }
                    }), false, 4, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws IntentSender.SendIntentException, PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters12 = moduleDefinitionBuilder.getConverters();
            AnyType anyType22 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r5), bool));
            if (anyType22 == null) {
                anyType22 = new AnyType(new LazyKType(o0.b(r5), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$33
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.p(List.class, co0.s.INSTANCE.d(o0.o(String.class)));
                    }
                }), converters12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deleteAlbumsAsync", new AsyncFunctionWithPromiseComponent("deleteAlbumsAsync", new AnyType[]{anyType22}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$34
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) throws IntentSender.SendIntentException, PermissionsException, Exceptions.ReactContextLost {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    final List list = (List) objArr[0];
                    if (this.this$0.isMissingWritePermission()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_WRITE_PERMISSION_MESSAGE);
                    }
                    final MediaLibraryModule mediaLibraryModule = this.this$0;
                    MediaLibraryModule.Action actionActionIfUserGrantedPermission = mediaLibraryModule.actionIfUserGrantedPermission(promise, new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$13$1$action$1
                        @Override // wn0.a
                        public /* bridge */ /* synthetic */ h0 invoke() {
                            invoke2();
                            return h0.f84049a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            MediaLibraryModule mediaLibraryModule2 = mediaLibraryModule;
                            Promise promise2 = promise;
                            BuildersKt__Builders_commonKt.launch$default(mediaLibraryModule2.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$1$13$1$action$1$invoke$$inlined$withModuleScope$1(promise2, null, mediaLibraryModule2, list, promise2), 3, null);
                        }
                    });
                    Context context = this.this$0.getContext();
                    String[] strArr = (String[]) list.toArray(new String[0]);
                    MediaLibraryModule.runActionWithPermissions$default(this.this$0, AlbumUtilsKt.getAssetsInAlbums(context, (String[]) Arrays.copyOf(strArr, strArr.length)), actionActionIfUserGrantedPermission, false, 4, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws IntentSender.SendIntentException, PermissionsException, Exceptions.ReactContextLost {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters13 = moduleDefinitionBuilder.getConverters();
            AnyType anyType23 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r0), bool));
            if (anyType23 == null) {
                anyType23 = new AnyType(new LazyKType(o0.b(AssetsOptions.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$35
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(AssetsOptions.class);
                    }
                }), converters13);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getAssetsAsync", new AsyncFunctionWithPromiseComponent("getAssetsAsync", new AnyType[]{anyType23}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$36
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    AssetsOptions assetsOptions = (AssetsOptions) objArr[0];
                    if (this.this$0.isMissingPermissions()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS_MESSAGE);
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$lambda$42$lambda$31$lambda$30$$inlined$withModuleScope$1(promise, null, this.this$0, assetsOptions, promise), 3, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters14 = moduleDefinitionBuilder.getConverters();
            AnyType anyType24 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType24 == null) {
                anyType24 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$37
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters14);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("migrateAlbumIfNeededAsync", new AsyncFunctionWithPromiseComponent("migrateAlbumIfNeededAsync", new AnyType[]{anyType24}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$38
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) throws AlbumPathException, EmptyAlbumException, IntentSender.SendIntentException, Exceptions.ReactContextLost {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (Build.VERSION.SDK_INT < 30) {
                        return;
                    }
                    List<String> assetsInAlbums = AlbumUtilsKt.getAssetsInAlbums(this.this$0.getContext(), str);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : assetsInAlbums) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    if (strArr.length == 0) {
                        return;
                    }
                    MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
                    Context context = this.this$0.getContext();
                    s0 s0Var = new s0(2);
                    s0Var.a(null);
                    s0Var.b(strArr);
                    final List<MediaLibraryUtils.AssetFile> assetsById = mediaLibraryUtils.getAssetsById(context, (String[]) s0Var.d(new String[s0Var.c()]));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : assetsById) {
                        File parentFile = ((MediaLibraryUtils.AssetFile) obj2).getParentFile();
                        Object arrayList2 = linkedHashMap.get(parentFile);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(parentFile, arrayList2);
                        }
                        ((List) arrayList2).add(obj2);
                    }
                    if (linkedHashMap.size() != 1) {
                        throw new EmptyAlbumException();
                    }
                    final File parentFile2 = assetsById.get(0).getParentFile();
                    if (parentFile2 == null) {
                        throw new AlbumPathException();
                    }
                    if (parentFile2.canWrite()) {
                        return;
                    }
                    final MediaLibraryModule mediaLibraryModule = this.this$0;
                    MediaLibraryModule.Action actionActionIfUserGrantedPermission = mediaLibraryModule.actionIfUserGrantedPermission(promise, new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$15$action$1

                        /* JADX INFO: renamed from: expo.modules.medialibrary.MediaLibraryModule$definition$1$15$action$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
                        @DebugMetadata(c = "expo.modules.medialibrary.MediaLibraryModule$definition$1$15$action$1$1", f = "MediaLibraryModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
                            final /* synthetic */ File $albumDir;
                            final /* synthetic */ List<MediaLibraryUtils.AssetFile> $assets;
                            final /* synthetic */ Promise $promise;
                            int label;
                            final /* synthetic */ MediaLibraryModule this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(MediaLibraryModule mediaLibraryModule, List<MediaLibraryUtils.AssetFile> list, File file, Promise promise, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.this$0 = mediaLibraryModule;
                                this.$assets = list;
                                this.$albumDir = file;
                                this.$promise = promise;
                            }

                            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.this$0, this.$assets, this.$albumDir, this.$promise, continuation);
                            }

                            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws AlbumException, Exceptions.ReactContextLost {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t.b(obj);
                                Context context = this.this$0.getContext();
                                List<MediaLibraryUtils.AssetFile> list = this.$assets;
                                String name = this.$albumDir.getName();
                                s.j(name, "getName(...)");
                                new MigrateAlbum(context, list, name, this.$promise).execute();
                                return h0.f84049a;
                            }

                            @Override // wn0.p
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                            }
                        }

                        @Override // wn0.a
                        public /* bridge */ /* synthetic */ h0 invoke() {
                            invoke2();
                            return h0.f84049a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BuildersKt__Builders_commonKt.launch$default(mediaLibraryModule.moduleCoroutineScope, null, null, new AnonymousClass1(mediaLibraryModule, assetsById, parentFile2, promise, null), 3, null);
                        }
                    });
                    List<MediaLibraryUtils.AssetFile> list = assetsById;
                    ArrayList arrayList3 = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((MediaLibraryUtils.AssetFile) it.next()).getAssetId());
                    }
                    MediaLibraryModule.runActionWithPermissions$default(this.this$0, arrayList3, actionActionIfUserGrantedPermission, false, 4, null);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws AlbumPathException, EmptyAlbumException, IntentSender.SendIntentException, Exceptions.ReactContextLost {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters15 = moduleDefinitionBuilder.getConverters();
            AnyType anyType25 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType25 == null) {
                anyType25 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$39
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters15);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("albumNeedsMigrationAsync", new AsyncFunctionWithPromiseComponent("albumNeedsMigrationAsync", new AnyType[]{anyType25}, new p<Object[], Promise, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$AsyncFunctionWithPromise$40
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws PermissionsException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    String str = (String) objArr[0];
                    if (this.this$0.isMissingPermissions()) {
                        throw new PermissionsException(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS_MESSAGE);
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        BuildersKt__Builders_commonKt.launch$default(this.this$0.moduleCoroutineScope, null, null, new MediaLibraryModule$definition$1$16$1$1(this.this$0, str, promise, null), 3, null);
                    }
                    promise.resolve(false);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws PermissionsException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            moduleDefinitionBuilder.OnStartObserving(new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$17
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.this$0.imagesObserver != null) {
                        return;
                    }
                    Handler handler = new Handler(Looper.getMainLooper());
                    ContentResolver contentResolver = this.this$0.getContext().getContentResolver();
                    MediaLibraryModule mediaLibraryModule = this.this$0;
                    MediaLibraryModule.MediaStoreContentObserver mediaStoreContentObserver = new MediaLibraryModule.MediaStoreContentObserver(this.this$0, handler, 1);
                    contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, mediaStoreContentObserver);
                    mediaLibraryModule.imagesObserver = mediaStoreContentObserver;
                    MediaLibraryModule mediaLibraryModule2 = this.this$0;
                    MediaLibraryModule.MediaStoreContentObserver mediaStoreContentObserver2 = new MediaLibraryModule.MediaStoreContentObserver(this.this$0, handler, 3);
                    contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, mediaStoreContentObserver2);
                    mediaLibraryModule2.videosObserver = mediaStoreContentObserver2;
                }
            });
            moduleDefinitionBuilder.OnStopObserving(new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$1$18
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ContentResolver contentResolver = this.this$0.getContext().getContentResolver();
                    MediaLibraryModule.MediaStoreContentObserver mediaStoreContentObserver = this.this$0.imagesObserver;
                    if (mediaStoreContentObserver != null) {
                        MediaLibraryModule mediaLibraryModule = this.this$0;
                        contentResolver.unregisterContentObserver(mediaStoreContentObserver);
                        mediaLibraryModule.imagesObserver = null;
                    }
                    MediaLibraryModule.MediaStoreContentObserver mediaStoreContentObserver2 = this.this$0.videosObserver;
                    if (mediaStoreContentObserver2 != null) {
                        MediaLibraryModule mediaLibraryModule2 = this.this$0;
                        contentResolver.unregisterContentObserver(mediaStoreContentObserver2);
                        mediaLibraryModule2.videosObserver = null;
                    }
                }
            });
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.ON_ACTIVITY_RESULT;
            eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new p<Activity, OnActivityResultPayload, h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$OnActivityResult$1
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                    invoke2(activity, onActivityResultPayload);
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                    s.k(sender, "sender");
                    s.k(payload, "payload");
                    MediaLibraryModule.Action action = this.this$0.awaitingAction;
                    if (action != null) {
                        if (payload.getRequestCode() != 7463 && payload.getRequestCode() != 7464) {
                            action = null;
                        }
                        if (action != null) {
                            action.runWithPermissions(payload.getResultCode() == -1);
                            this.this$0.awaitingAction = null;
                        }
                    }
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new wn0.a<h0>() { // from class: expo.modules.medialibrary.MediaLibraryModule$definition$lambda$42$$inlined$OnDestroy$1
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
                        Log.e(MediaLibraryModule.TAG, "The scope does not have a job in it");
                    }
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
