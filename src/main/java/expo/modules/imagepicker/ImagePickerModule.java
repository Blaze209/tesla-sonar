package expo.modules.imagepicker;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.OperationCanceledException;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.q;
import com.facebook.react.bridge.BaseJavaModule;
import com.plaid.internal.EnumC4419g;
import expo.modules.core.errors.ModuleNotFoundException;
import expo.modules.imagepicker.contracts.CameraContractOptions;
import expo.modules.imagepicker.contracts.CropImageContractOptions;
import expo.modules.imagepicker.contracts.ImageLibraryContractOptions;
import expo.modules.imagepicker.contracts.ImagePickerContractResult;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0010\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0017\u001a\u00020\u00162\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000b0)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000b0)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010,R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000b0)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010,R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010=\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "createPermissionsDecorator", "(Lexpo/modules/kotlin/Promise;)Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", "", "pickerLauncher", "Lexpo/modules/imagepicker/ImagePickerOptions;", "options", "launchContract", "(Lwn0/l;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "Ljn0/h0;", "handleResultUponActivityDestruction", "(Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;Lexpo/modules/imagepicker/ImagePickerOptions;)V", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Success;", "launchPicker", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeOnly", "", "", "getMediaLibraryPermissions", "(Z)[Ljava/lang/String;", "ensureTargetActivityIsAvailable", "(Lexpo/modules/imagepicker/ImagePickerOptions;)V", "ensureCameraPermissionsAreGranted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/imagepicker/MediaHandler;", "mediaHandler", "Lexpo/modules/imagepicker/MediaHandler;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/imagepicker/contracts/CameraContractOptions;", "cameraLauncher", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/imagepicker/contracts/ImageLibraryContractOptions;", "imageLibraryLauncher", "Lexpo/modules/imagepicker/contracts/CropImageContractOptions;", "cropImageLauncher", "Lexpo/modules/imagepicker/PendingMediaPickingResult;", "pendingMediaPickingResult", "Lexpo/modules/imagepicker/PendingMediaPickingResult;", "isPickerOpen", "Z", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImagePickerModule extends Module {
    private AppContextActivityResultLauncher<CameraContractOptions, ImagePickerContractResult> cameraLauncher;
    private AppContextActivityResultLauncher<CropImageContractOptions, ImagePickerContractResult> cropImageLauncher;
    private AppContextActivityResultLauncher<ImageLibraryContractOptions, ImagePickerContractResult> imageLibraryLauncher;
    private boolean isPickerOpen;
    private final MediaHandler mediaHandler = new MediaHandler(this);
    private PendingMediaPickingResult pendingMediaPickingResult;

    /* JADX INFO: renamed from: expo.modules.imagepicker.ImagePickerModule$launchContract$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.ImagePickerModule", f = "ImagePickerModule.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "launchContract", n = {"this", "options", "result", "this", "options", "result", "this"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImagePickerModule.this.launchContract(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.ImagePickerModule$launchContract$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.ImagePickerModule$launchContract$2", f = "ImagePickerModule.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements l<Continuation<? super ImagePickerContractResult>, Object> {
        final /* synthetic */ ImagePickerOptions $options;
        final /* synthetic */ n0<ImagePickerContractResult.Success> $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(n0<ImagePickerContractResult.Success> n0Var, ImagePickerOptions imagePickerOptions, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$result = n0Var;
            this.$options = imagePickerOptions;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return ImagePickerModule.this.new AnonymousClass2(this.$result, this.$options, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            AppContextActivityResultLauncher appContextActivityResultLauncher = ImagePickerModule.this.cropImageLauncher;
            if (appContextActivityResultLauncher == null) {
                s.B("cropImageLauncher");
                appContextActivityResultLauncher = null;
            }
            String string = this.$result.f86529a.getData().get(0).f().toString();
            s.j(string, "toString(...)");
            CropImageContractOptions cropImageContractOptions = new CropImageContractOptions(string, this.$options);
            this.label = 1;
            Object objLaunch = appContextActivityResultLauncher.launch(cropImageContractOptions, this);
            return objLaunch == coroutine_suspended ? coroutine_suspended : objLaunch;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super ImagePickerContractResult> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.ImagePickerModule$launchPicker$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Success;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.ImagePickerModule$launchPicker$2", f = "ImagePickerModule.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class C46272 extends SuspendLambda implements p<CoroutineScope, Continuation<? super ImagePickerContractResult.Success>, Object> {
        final /* synthetic */ l<Continuation<? super ImagePickerContractResult>, Object> $pickerLauncher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C46272(l<? super Continuation<? super ImagePickerContractResult>, ? extends Object> lVar, Continuation<? super C46272> continuation) {
            super(2, continuation);
            this.$pickerLauncher = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C46272(this.$pickerLauncher, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws FailedToPickMediaException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                l<Continuation<? super ImagePickerContractResult>, Object> lVar = this.$pickerLauncher;
                this.label = 1;
                obj = lVar.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            ImagePickerContractResult imagePickerContractResult = (ImagePickerContractResult) obj;
            if (imagePickerContractResult instanceof ImagePickerContractResult.Success) {
                return (ImagePickerContractResult.Success) imagePickerContractResult;
            }
            if (imagePickerContractResult instanceof ImagePickerContractResult.Cancelled) {
                throw new OperationCanceledException();
            }
            if (imagePickerContractResult instanceof ImagePickerContractResult.Error) {
                throw new FailedToPickMediaException();
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImagePickerContractResult.Success> continuation) {
            return ((C46272) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermissionsResponseListener createPermissionsDecorator(final Promise promise) {
        final WeakReference weakReferenceWeak = UtilsKt.weak(getAppContext().getReactContext());
        return new PermissionsResponseListener() { // from class: expo.modules.imagepicker.a
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                ImagePickerModule.createPermissionsDecorator$lambda$14(promise, weakReferenceWeak, this, map);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPermissionsDecorator$lambda$14(Promise promise, WeakReference weakReference, ImagePickerModule imagePickerModule, Map map) {
        boolean z11;
        boolean z12;
        String status;
        s.h(map);
        boolean z13 = false;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                } else if (((PermissionsResponse) ((Map.Entry) it.next()).getValue()).getStatus() != PermissionsStatus.GRANTED) {
                    z11 = false;
                    break;
                }
            }
        } else {
            z11 = true;
            break;
        }
        if (map.isEmpty()) {
            z12 = false;
        } else {
            if (!map.isEmpty()) {
                Iterator it2 = map.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((PermissionsResponse) ((Map.Entry) it2.next()).getValue()).getStatus() != PermissionsStatus.DENIED) {
                            z12 = false;
                        }
                    }
                }
            }
            z12 = true;
        }
        if (!map.isEmpty()) {
            Iterator it3 = map.entrySet().iterator();
            do {
                if (!it3.hasNext()) {
                    z13 = true;
                    break;
                }
            } while (((PermissionsResponse) ((Map.Entry) it3.next()).getValue()).getCanAskAgain());
        } else {
            z13 = true;
            break;
        }
        Bundle bundle = new Bundle();
        bundle.putString(PermissionsResponse.EXPIRES_KEY, PermissionsResponse.PERMISSION_EXPIRES_NEVER);
        if (z11) {
            status = PermissionsStatus.GRANTED.getStatus();
        } else {
            status = z12 ? PermissionsStatus.DENIED.getStatus() : PermissionsStatus.UNDETERMINED.getStatus();
        }
        bundle.putString(PermissionsResponse.STATUS_KEY, status);
        bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, z13);
        bundle.putBoolean(PermissionsResponse.GRANTED_KEY, z11);
        if (z11) {
            bundle.putString("accessPrivileges", "all");
            promise.resolve(bundle);
            return;
        }
        if (Build.VERSION.SDK_INT < 34) {
            bundle.putString("accessPrivileges", "none");
            promise.resolve(bundle);
            return;
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            promise.reject(new Exceptions.ReactContextLost());
            return;
        }
        if (androidx.core.content.b.checkSelfPermission(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            bundle.putBoolean(PermissionsResponse.GRANTED_KEY, true);
            bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, true);
            bundle.putString(PermissionsResponse.STATUS_KEY, PermissionsStatus.GRANTED.getStatus());
            bundle.putString("accessPrivileges", "limited");
        } else {
            bundle.putString("accessPrivileges", "none");
        }
        promise.resolve(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ensureCameraPermissionsAreGranted(Continuation<? super h0> continuation) throws ModuleNotFoundException {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Permissions permissions = getAppContext().getPermissions();
        if (permissions == null) {
            throw new ModuleNotFoundException("Permissions");
        }
        PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.imagepicker.ImagePickerModule$ensureCameraPermissionsAreGranted$2$1
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map<String, PermissionsResponse> map) {
                if (Build.VERSION.SDK_INT >= 29) {
                    PermissionsResponse permissionsResponse = map.get("android.permission.CAMERA");
                    if ((permissionsResponse != null ? permissionsResponse.getStatus() : null) == PermissionsStatus.GRANTED) {
                        CancellableContinuation<h0> cancellableContinuation = cancellableContinuationImpl;
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        cancellableContinuation.resumeWith(jn0.s.b(h0.f84049a));
                        return;
                    } else {
                        CancellableContinuation<h0> cancellableContinuation2 = cancellableContinuationImpl;
                        jn0.s.Companion companion2 = jn0.s.INSTANCE;
                        cancellableContinuation2.resumeWith(jn0.s.b(t.a(new UserRejectedPermissionsException())));
                        return;
                    }
                }
                PermissionsResponse permissionsResponse2 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                PermissionsStatus status = permissionsResponse2 != null ? permissionsResponse2.getStatus() : null;
                PermissionsStatus permissionsStatus = PermissionsStatus.GRANTED;
                if (status == permissionsStatus) {
                    PermissionsResponse permissionsResponse3 = map.get("android.permission.CAMERA");
                    if ((permissionsResponse3 != null ? permissionsResponse3.getStatus() : null) == permissionsStatus) {
                        CancellableContinuation<h0> cancellableContinuation3 = cancellableContinuationImpl;
                        jn0.s.Companion companion3 = jn0.s.INSTANCE;
                        cancellableContinuation3.resumeWith(jn0.s.b(h0.f84049a));
                        return;
                    }
                }
                CancellableContinuation<h0> cancellableContinuation4 = cancellableContinuationImpl;
                jn0.s.Companion companion4 = jn0.s.INSTANCE;
                cancellableContinuation4.resumeWith(jn0.s.b(t.a(new UserRejectedPermissionsException())));
            }
        };
        String[] strArr = (String[]) v.r(Build.VERSION.SDK_INT < 29 ? "android.permission.WRITE_EXTERNAL_STORAGE" : null, "android.permission.CAMERA").toArray(new String[0]);
        permissions.askForPermissions(permissionsResponseListener, (String[]) Arrays.copyOf(strArr, strArr.length));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureTargetActivityIsAvailable(ImagePickerOptions options) throws MissingActivityToHandleIntent {
        Intent intent = new Intent(options.getNativeMediaTypes().toCameraIntentAction());
        if (intent.resolveActivity(getAppContext().getThrowingActivity().getApplication().getPackageManager()) == null) {
            throw new MissingActivityToHandleIntent(intent.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDirectory() {
        return getAppContext().getCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] getMediaLibraryPermissions(boolean writeOnly) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new String[0];
        }
        return (String[]) v.r("android.permission.WRITE_EXTERNAL_STORAGE", !writeOnly ? "android.permission.READ_EXTERNAL_STORAGE" : null).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResultUponActivityDestruction(ImagePickerContractResult result, ImagePickerOptions options) {
        if (result instanceof ImagePickerContractResult.Success) {
            this.pendingMediaPickingResult = new PendingMediaPickingResult(((ImagePickerContractResult.Success) result).getData(), options);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        if (r12 == r1) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v29, types: [expo.modules.imagepicker.ImagePickerModule] */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v6, types: [expo.modules.imagepicker.ImagePickerModule] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object launchContract(wn0.l<? super p013kotlin.coroutines.Continuation<? super expo.modules.imagepicker.contracts.ImagePickerContractResult>, ? extends java.lang.Object> r10, expo.modules.imagepicker.ImagePickerOptions r11, p013kotlin.coroutines.Continuation<java.lang.Object> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.imagepicker.ImagePickerModule.launchContract(wn0.l, expo.modules.imagepicker.ImagePickerOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object launchPicker(l<? super Continuation<? super ImagePickerContractResult>, ? extends Object> lVar, Continuation<? super ImagePickerContractResult.Success> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C46272(lVar, null), continuation);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        Class<ImagePickerOptions> cls = ImagePickerOptions.class;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name(ImagePickerConstants.TAG);
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(Boolean.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Boolean.class), false, new wn0.a<q>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Boolean.TYPE);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestMediaLibraryPermissionsAsync", new AsyncFunctionWithPromiseComponent("requestMediaLibraryPermissionsAsync", new AnyType[]{anyType}, new p<Object[], Promise, h0>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                    Permissions permissions = this.this$0.getAppContext().getPermissions();
                    if (permissions == null) {
                        throw new Exceptions.PermissionsModuleNotFound();
                    }
                    String[] mediaLibraryPermissions = this.this$0.getMediaLibraryPermissions(zBooleanValue);
                    permissions.askForPermissions(this.this$0.createPermissionsDecorator(promise), (String[]) Arrays.copyOf(mediaLibraryPermissions, mediaLibraryPermissions.length));
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Boolean.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(Boolean.class), false, new wn0.a<q>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Boolean.TYPE);
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getMediaLibraryPermissionsAsync", new AsyncFunctionWithPromiseComponent("getMediaLibraryPermissionsAsync", new AnyType[]{anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                    Permissions permissions = this.this$0.getAppContext().getPermissions();
                    if (permissions == null) {
                        throw new Exceptions.PermissionsModuleNotFound();
                    }
                    String[] mediaLibraryPermissions = this.this$0.getMediaLibraryPermissions(zBooleanValue);
                    permissions.getPermissions(this.this$0.createPermissionsDecorator(promise), (String[]) Arrays.copyOf(mediaLibraryPermissions, mediaLibraryPermissions.length));
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            boolean zF = s.f(Promise.class, Promise.class);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            Class cls5 = Integer.TYPE;
            if (zF) {
                stringAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("requestCameraPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$1
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.CAMERA");
                    }
                });
                cls = cls;
                moduleDefinitionBuilder = moduleDefinitionBuilder;
                anyTypeProvider = anyTypeProvider;
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Promise.class), bool));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr = {anyType3};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), (Promise) objArr[0], "android.permission.CAMERA");
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls5)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, lVar);
                }
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestCameraPermissionsAsync", stringAsyncFunctionComponent);
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getCameraPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$4
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.CAMERA");
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
                AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Promise.class), bool));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters4);
                }
                AnyType[] anyTypeArr2 = {anyType4};
                l<Object[], h0> lVar2 = new l<Object[], h0>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$6
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), (Promise) objArr[0], "android.permission.CAMERA");
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls5)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, lVar2);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getCameraPermissionsAsync", asyncFunctionWithPromiseComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder2.AsyncFunction("launchCameraAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters5 = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(cls), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(o0.b(cls), false, new wn0.a<q>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImagePickerOptions.class);
                    }
                }), converters5);
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType5}, new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = moduleDefinitionBuilder2.AsyncFunction("launchImageLibraryAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters6 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(cls), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(o0.b(cls), false, new wn0.a<q>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImagePickerOptions.class);
                    }
                }), converters6);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType6}, new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$4(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction3 = moduleDefinitionBuilder2.AsyncFunction("getPendingResultAsync");
            asyncFunctionBuilderAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(asyncFunctionBuilderAsyncFunction3.getName(), new AnyType[0], new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$5(null, this)));
            moduleDefinitionBuilder2.RegisterActivityContracts(new ImagePickerModule$definition$1$8(this, null));
            return moduleDefinitionBuilder2.buildModule();
        } finally {
            eb.a.f();
        }
    }

    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }
}
