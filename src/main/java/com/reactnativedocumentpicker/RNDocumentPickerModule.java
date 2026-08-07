package com.reactnativedocumentpicker;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import bo0.j;
import bo0.n;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;
import z00.PickOptions;
import z00.f;
import z00.h;
import z00.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001BB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0014J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\"J\u001f\u0010$\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0014J\u0015\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u000eR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020,028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/reactnativedocumentpicker/RNDocumentPickerModule;", "Lcom/reactnativedocumentpicker/NativeDocumentPickerSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "processDirectoryPickerResult", "(Landroid/content/Intent;)V", "processSaveAsResult", "invalidate", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "opts", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "pick", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "options", "saveDocument", "pickDirectory", "keepLocalCopy", "", "kind", "value", "Lcom/facebook/react/bridge/WritableMap;", "isKnownType", "(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "releaseSecureAccess", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "releaseLongTermAccess", "writeDocuments", "processFilePickerResult", "onHostResume", "onHostPause", "onHostDestroy", "Lz00/g;", "currentPickOptions", "Lz00/g;", "Landroid/net/Uri;", "currentUriOfFileBeingExported", "Landroid/net/Uri;", "Lz00/i;", "promiseWrapper", "Lz00/i;", "", "pickedFilesUriMap", "Ljava/util/Map;", "Lz00/f;", "metadataGetter", "Lz00/f;", "Lz00/d;", "fileOps", "Lz00/d;", "Lkotlinx/coroutines/CoroutineScope;", "fileCopyingCoroutine", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/facebook/react/bridge/ActivityEventListener;", "activityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "Companion", "a", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNDocumentPickerModule extends NativeDocumentPickerSpec implements LifecycleEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String E_INVALID_DATA_RETURNED = "INVALID_DATA_RETURNED";
    private static final String E_OTHER_PRESENTING_ERROR = "OTHER_PRESENTING_ERROR";
    private static final int PICK_DIR_REQUEST_CODE = 42;
    private static final int PICK_FILES_REQUEST_CODE = 41;
    private static final String PRESENTER_IS_NULL = "NULL_PRESENTER";
    private static final int SAVE_DOC_REQUEST_CODE = 43;
    private static final String UNABLE_TO_OPEN_FILE_TYPE = "UNABLE_TO_OPEN_FILE_TYPE";
    private final ActivityEventListener activityEventListener;
    private PickOptions currentPickOptions;
    private Uri currentUriOfFileBeingExported;
    private final CoroutineScope fileCopyingCoroutine;
    private final z00.d fileOps;
    private final f metadataGetter;
    private final Map<String, Uri> pickedFilesUriMap;
    private final i promiseWrapper;

    /* JADX INFO: renamed from: com.reactnativedocumentpicker.RNDocumentPickerModule$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/reactnativedocumentpicker/RNDocumentPickerModule$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "a", "(Lcom/facebook/react/bridge/Promise;)V", "", "PICK_FILES_REQUEST_CODE", "I", "PICK_DIR_REQUEST_CODE", "SAVE_DOC_REQUEST_CODE", "", "PRESENTER_IS_NULL", "Ljava/lang/String;", RNDocumentPickerModule.UNABLE_TO_OPEN_FILE_TYPE, "E_OTHER_PRESENTING_ERROR", "E_INVALID_DATA_RETURNED", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Promise promise) {
            s.k(promise, "promise");
            promise.reject(RNDocumentPickerModule.PRESENTER_IS_NULL, RNDocumentPickerModule.PRESENTER_IS_NULL);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativedocumentpicker/RNDocumentPickerModule$b", "Lcom/facebook/react/bridge/BaseActivityEventListener;", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "Ljn0/h0;", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends BaseActivityEventListener {
        b() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
            s.k(activity, "activity");
            if (requestCode == 41 || requestCode == 42 || requestCode == 43) {
                if (resultCode != -1) {
                    if (resultCode == 0) {
                        RNDocumentPickerModule.this.promiseWrapper.e();
                        return;
                    }
                    RNDocumentPickerModule.this.promiseWrapper.d("UNEXPECTED_ACTIVITY_RESULT", "Unknown activity result: " + resultCode, null);
                    return;
                }
                if (data == null) {
                    RNDocumentPickerModule.this.promiseWrapper.c(RNDocumentPickerModule.E_INVALID_DATA_RETURNED, "Data from document picker is null");
                    return;
                }
                switch (requestCode) {
                    case 41:
                        RNDocumentPickerModule.this.processFilePickerResult(data);
                        break;
                    case 42:
                        RNDocumentPickerModule.this.processDirectoryPickerResult(data);
                        break;
                    case 43:
                        RNDocumentPickerModule.this.processSaveAsResult(data);
                        break;
                    default:
                        RNDocumentPickerModule.this.promiseWrapper.d("UNEXPECTED_ACTIVITY_RESULT", "Unknown activity result: " + resultCode, null);
                        break;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativedocumentpicker.RNDocumentPickerModule$keepLocalCopy$1", f = "RNDocumentPickerModule.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48650n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ReadableArray f48652p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f48653q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f48654r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReadableArray readableArray, String str, Promise promise, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f48652p = readableArray;
            this.f48653q = str;
            this.f48654r = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return RNDocumentPickerModule.this.new c(this.f48652p, this.f48653q, this.f48654r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48650n;
            if (i11 == 0) {
                t.b(obj);
                z00.d dVar = RNDocumentPickerModule.this.fileOps;
                ReactApplicationContext reactApplicationContext = RNDocumentPickerModule.this.getReactApplicationContext();
                s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                ReadableArray readableArray = this.f48652p;
                a aVarA = a.INSTANCE.a(this.f48653q);
                this.f48650n = 1;
                obj = dVar.g(reactApplicationContext, readableArray, aVarA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.f48654r.resolve((ReadableArray) obj);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativedocumentpicker.RNDocumentPickerModule$processFilePickerResult$1", f = "RNDocumentPickerModule.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48655n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<Uri> f48657p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Uri> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f48657p = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return RNDocumentPickerModule.this.new d(this.f48657p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48655n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    PickOptions pickOptions = RNDocumentPickerModule.this.currentPickOptions;
                    if (pickOptions == null) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    f fVar = RNDocumentPickerModule.this.metadataGetter;
                    ReactApplicationContext reactApplicationContext = RNDocumentPickerModule.this.getReactApplicationContext();
                    s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    List<Uri> list = this.f48657p;
                    this.f48655n = 1;
                    obj = fVar.e(reactApplicationContext, list, pickOptions, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                RNDocumentPickerModule.this.promiseWrapper.h((ReadableArray) obj);
            } catch (Exception e11) {
                RNDocumentPickerModule.this.promiseWrapper.b(e11);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativedocumentpicker.RNDocumentPickerModule$writeDocuments$1", f = "RNDocumentPickerModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48658n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ReadableMap f48659o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ RNDocumentPickerModule f48660p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f48661q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReadableMap readableMap, RNDocumentPickerModule rNDocumentPickerModule, Promise promise, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f48659o = readableMap;
            this.f48660p = rNDocumentPickerModule;
            this.f48661q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new e(this.f48659o, this.f48660p, this.f48661q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f48658n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                String string = this.f48659o.hasKey("uri") ? this.f48659o.getString("uri") : null;
                z00.d dVar = this.f48660p.fileOps;
                Uri uri = this.f48660p.currentUriOfFileBeingExported;
                ReactApplicationContext reactApplicationContext = this.f48660p.getReactApplicationContext();
                s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                z00.a aVarM = dVar.m(uri, string, reactApplicationContext);
                f fVar = this.f48660p.metadataGetter;
                ContentResolver contentResolver = this.f48660p.getReactApplicationContext().getContentResolver();
                s.j(contentResolver, "getContentResolver(...)");
                fVar.f(contentResolver, aVarM, false);
                WritableArray writableArrayCreateArray = Arguments.createArray();
                writableArrayCreateArray.pushMap(aVarM.c());
                this.f48661q.resolve(writableArrayCreateArray);
            } catch (Exception e11) {
                this.f48661q.reject(e11);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNDocumentPickerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.promiseWrapper = new i(NativeDocumentPickerSpec.NAME);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.pickedFilesUriMap = linkedHashMap;
        this.metadataGetter = new f(linkedHashMap);
        this.fileOps = new z00.d(linkedHashMap);
        this.fileCopyingCoroutine = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        b bVar = new b();
        this.activityEventListener = bVar;
        reactContext.addActivityEventListener(bVar);
        reactContext.addLifecycleEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public final void processDirectoryPickerResult(Intent intent) {
        Uri data = intent.getData();
        PickOptions pickOptions = this.currentPickOptions;
        if (data == null || pickOptions == null) {
            this.promiseWrapper.c(E_INVALID_DATA_RETURNED, "Data from document picker is null");
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", data.toString());
        if (pickOptions.getRequestLongTermAccess()) {
            try {
                getReactApplicationContext().getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 3);
                String string = data.toString();
                s.j(string, "toString(...)");
                byte[] bytes = string.getBytes(p013kotlin.text.d.UTF_8);
                s.j(bytes, "getBytes(...)");
                String strEncodeToString = Base64.encodeToString(bytes, 0);
                writableMapCreateMap.putString("bookmarkStatus", "success");
                writableMapCreateMap.putString("bookmark", strEncodeToString);
            } catch (Exception e11) {
                String localizedMessage = e11.getLocalizedMessage();
                if (localizedMessage == null && (localizedMessage = e11.getMessage()) == null) {
                    localizedMessage = "Unknown error with takePersistableUriPermission";
                }
                writableMapCreateMap.putString("bookmarkStatus", AnalyticsAttribute.Error);
                writableMapCreateMap.putString("bookmarkError", localizedMessage);
            }
        }
        this.promiseWrapper.h(writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSaveAsResult(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            this.promiseWrapper.c(E_INVALID_DATA_RETURNED, "Data from document picker is null");
            return;
        }
        this.pickedFilesUriMap.put(data.toString(), data);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", data.toString());
        this.promiseWrapper.h(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        CoroutineScopeKt.cancel$default(this.fileCopyingCoroutine, "module invalidated", null, 2, null);
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
        super.invalidate();
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public WritableMap isKnownType(String kind, String value) {
        s.k(kind, "kind");
        s.k(value, "value");
        return com.reactnativedocumentpicker.b.INSTANCE.b(kind, value);
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void keepLocalCopy(ReadableMap options, Promise promise) {
        s.k(options, "options");
        s.k(promise, "promise");
        ReadableArray array = options.getArray("files");
        String string = options.getString("destination");
        if (string != null && array != null) {
            BuildersKt__Builders_commonKt.launch$default(this.fileCopyingCoroutine, null, null, new c(array, string, promise, null), 3, null);
            return;
        }
        promise.reject("keepLocalCopy", "You did not provide the correct options. Expected 'files' and 'destination', got: " + options.toHashMap().keySet());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        CoroutineScopeKt.cancel$default(this.fileCopyingCoroutine, "host destroyed", null, 2, null);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void pick(ReadableMap opts, Promise promise) {
        s.k(opts, "opts");
        s.k(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            INSTANCE.a(promise);
            return;
        }
        if (this.promiseWrapper.i(promise, "pick")) {
            PickOptions pickOptionsA = h.a(opts);
            this.currentPickOptions = pickOptionsA;
            try {
                currentActivity.startActivityForResult(z00.e.f126411a.a(pickOptionsA), 41);
            } catch (ActivityNotFoundException e11) {
                promise.reject(UNABLE_TO_OPEN_FILE_TYPE, e11);
            } catch (Exception e12) {
                promise.reject(E_OTHER_PRESENTING_ERROR, e12);
            }
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void pickDirectory(ReadableMap opts, Promise promise) {
        s.k(opts, "opts");
        s.k(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            INSTANCE.a(promise);
            return;
        }
        if (this.promiseWrapper.i(promise, "pickDirectory")) {
            PickOptions pickOptionsA = h.a(opts);
            this.currentPickOptions = pickOptionsA;
            try {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && pickOptionsA.getInitialDirectoryUrl() != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", pickOptionsA.getInitialDirectoryUrl());
                }
                currentActivity.startActivityForResult(intent, 42);
            } catch (ActivityNotFoundException e11) {
                promise.reject(UNABLE_TO_OPEN_FILE_TYPE, e11);
            } catch (Exception e12) {
                promise.reject(E_OTHER_PRESENTING_ERROR, e12);
            }
        }
    }

    public final void processFilePickerResult(Intent intent) {
        List listE;
        s.k(intent, "intent");
        Uri data = intent.getData();
        ClipData clipData = intent.getClipData();
        if (clipData == null || clipData.getItemCount() <= 0) {
            listE = data != null ? v.e(data) : v.m();
        } else {
            j jVarW = n.w(0, clipData.getItemCount());
            listE = new ArrayList(v.y(jVarW, 10));
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                listE.add(clipData.getItemAt(((s0) it).nextInt()).getUri());
            }
        }
        BuildersKt__Builders_commonKt.launch$default(this.fileCopyingCoroutine, null, null, new d(listE, null), 3, null);
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void releaseLongTermAccess(ReadableArray uris, Promise promise) {
        s.k(uris, "uris");
        s.k(promise, "promise");
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int size = uris.size();
        for (int i11 = 0; i11 < size; i11++) {
            String string = uris.getString(i11);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("uri", string);
            try {
                contentResolver.releasePersistableUriPermission(Uri.parse(string), 3);
                writableMapCreateMap.putString(PermissionsResponse.STATUS_KEY, "success");
            } catch (Exception e11) {
                writableMapCreateMap.putString(PermissionsResponse.STATUS_KEY, AnalyticsAttribute.Error);
                String message = e11.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                writableMapCreateMap.putString("errorMessage", message);
            }
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        promise.resolve(writableArrayCreateArray);
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void releaseSecureAccess(ReadableArray uris, Promise promise) {
        s.k(uris, "uris");
        s.k(promise, "promise");
        promise.resolve(null);
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void saveDocument(ReadableMap options, Promise promise) {
        String type;
        s.k(options, "options");
        s.k(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            INSTANCE.a(promise);
            return;
        }
        if (this.promiseWrapper.i(promise, "saveDocuments")) {
            try {
                ReadableArray array = options.getArray("sourceUris");
                s.h(array);
                Uri uri = Uri.parse(array.getString(0));
                this.currentUriOfFileBeingExported = uri;
                if (options.hasKey("mimeType")) {
                    type = options.getString("mimeType");
                } else {
                    type = getReactApplicationContext().getContentResolver().getType(uri);
                    if (type == null) {
                        throw new IllegalStateException("MIME type could not be determined from the URI");
                    }
                }
                String string = options.hasKey("fileName") ? options.getString("fileName") : null;
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType(type);
                if (string != null) {
                    intent.putExtra("android.intent.extra.TITLE", string);
                }
                if (Build.VERSION.SDK_INT >= 26 && options.hasKey("initialUri")) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", options.getString("initialUri"));
                }
                currentActivity.startActivityForResult(intent, 43);
            } catch (ActivityNotFoundException e11) {
                promise.reject(UNABLE_TO_OPEN_FILE_TYPE, e11);
            } catch (Exception e12) {
                promise.reject(E_OTHER_PRESENTING_ERROR, e12);
            }
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void writeDocuments(ReadableMap options, Promise promise) {
        s.k(options, "options");
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.fileCopyingCoroutine, null, null, new e(options, this, promise, null), 3, null);
    }
}
