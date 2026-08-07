package com.fourthline.reactplugin;

import android.app.Activity;
import android.content.Intent;
import androidx.p002activity.ComponentActivity;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.fourthline.adapters.Orca;
import com.fourthline.adapters.analytics.FourthlineAnalyticsProcessor;
import com.fourthline.adapters.common.FourthlineOutputProcessor;
import com.fourthline.adapters.location.FourthlineLocationProviderProcessor;
import com.fourthline.adapters.workflow.WorkflowBridge;
import com.fourthline.adapters.workflow.WorkflowComponentsBridge;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.location.Coordinate;
import com.fourthline.scanners.KycResultHolder;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001HB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0016J!\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010 J!\u0010\"\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\"\u0010\u001bJ!\u0010#\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b#\u0010\u001bJ\u0019\u0010$\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b$\u0010\u0016J!\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b&\u0010\u001bJ!\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b'\u0010\u001bJ\u0019\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b)\u0010\u000eJ\u0017\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010\u000eJ\u0019\u0010-\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J1\u00108\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/fourthline/reactplugin/FourthlineModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ActivityEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Ljn0/h0;", "requestPermissions", "()V", "requestLocation", "", "message", "success", "(Ljava/lang/String;)V", AnalyticsAttribute.Error, "getReactNativeVersion", "()Ljava/lang/String;", "getName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "deleteFourthlineFiles", "(Lcom/facebook/react/bridge/Promise;)V", "requestAuthorizationAndLocation", "abortOrca", "jsonConfigString", "startWorkflow", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "startWorkflowSession", "Lcom/facebook/react/bridge/Callback;", "callback", "clearWorkflowSession", "(Lcom/facebook/react/bridge/Callback;)V", "isWorkflowSessionAvailable", "startWorkflowComponentDocument", "startWorkflowComponentBiometrics", "cancelLocationRequest", "config", "initializeAnalytics", "setTrackingConsent", "name", "addListener", "removeListener", "", "type", "removeListeners", "(Ljava/lang/Integer;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "onNewIntent", "(Landroid/content/Intent;)V", "Landroid/app/Activity;", "activity", "requestCode", StatusResponse.RESULT_CODE, "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "", "isPermissionsPollIsInProgress", "Z", "observingAnalytics", "observingWorkflowData", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "eventEmitter$delegate", "Lkotlin/Lazy;", "getEventEmitter", "()Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "eventEmitter", "Companion", "react-native-fourthline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FourthlineModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final String ANALYTICS_IDENTIFIER = "fourthlineAnalytics";
    public static final int LOCATION_REQUEST_CODE = 2051;
    public static final String WORKFLOW_RESULTS_IDENTIFIER = "fourthlineWorkflowData";
    private static Promise lastPromise;
    private static WorkflowComponentsBridge workflowSessionLauncher;

    /* JADX INFO: renamed from: eventEmitter$delegate, reason: from kotlin metadata */
    private final Lazy eventEmitter;
    private boolean isPermissionsPollIsInProgress;
    private boolean observingAnalytics;
    private boolean observingWorkflowData;
    private final ReactApplicationContext reactContext;
    private static JSONObject lastArgs = new JSONObject();

    /* JADX INFO: renamed from: com.fourthline.reactplugin.FourthlineModule$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.fourthline.reactplugin.FourthlineModule$1", f = "FourthlineModule.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return FourthlineModule.this.new AnonymousClass1(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0 && i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            do {
                if (FourthlineModule.this.isPermissionsPollIsInProgress && (androidx.core.content.b.checkSelfPermission(FourthlineModule.this.getReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.b.checkSelfPermission(FourthlineModule.this.getReactContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
                    FourthlineModule.this.requestLocation();
                }
                this.label = 1;
            } while (DelayKt.delay(2000L, this) != coroutine_suspended);
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.reactplugin.FourthlineModule$abortOrca$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.fourthline.reactplugin.FourthlineModule$abortOrca$1", f = "FourthlineModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C41381 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        int label;

        C41381(Continuation<? super C41381> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return FourthlineModule.this.new C41381(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                Orca.INSTANCE.abort();
                FourthlineModule.this.success("");
            } catch (Exception e11) {
                if (e11 instanceof CommonJsonError) {
                    FourthlineModule fourthlineModule = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor = FourthlineOutputProcessor.INSTANCE;
                    int errorCode = ((CommonJsonError) e11).getErrorCode();
                    String message = e11.getMessage();
                    if (message == null) {
                        message = CommonJsonError.IncorrectConfiguration.INSTANCE.getErrorMessage();
                    }
                    String string = fourthlineOutputProcessor.toFailJson(errorCode, message).toString();
                    s.j(string, "toString(...)");
                    fourthlineModule.error(string);
                } else {
                    FourthlineModule fourthlineModule2 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor2 = FourthlineOutputProcessor.INSTANCE;
                    CommonJsonError.IncorrectConfiguration incorrectConfiguration = CommonJsonError.IncorrectConfiguration.INSTANCE;
                    int errorCode2 = incorrectConfiguration.getErrorCode();
                    String message2 = e11.getMessage();
                    if (message2 == null) {
                        message2 = incorrectConfiguration.getErrorMessage();
                    }
                    String string2 = fourthlineOutputProcessor2.toFailJson(errorCode2, message2).toString();
                    s.j(string2, "toString(...)");
                    fourthlineModule2.error(string2);
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C41381) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.reactplugin.FourthlineModule$startWorkflow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.fourthline.reactplugin.FourthlineModule$startWorkflow$1", f = "FourthlineModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C41391 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ String $jsonConfigString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41391(String str, Continuation<? super C41391> continuation) {
            super(2, continuation);
            this.$jsonConfigString = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$0(FourthlineModule fourthlineModule, String str) {
            fourthlineModule.getEventEmitter().emit(FourthlineModule.WORKFLOW_RESULTS_IDENTIFIER, str);
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$1(FourthlineModule fourthlineModule, String str) {
            fourthlineModule.success(str);
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$2(FourthlineModule fourthlineModule, String str) {
            fourthlineModule.error(str);
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return FourthlineModule.this.new C41391(this.$jsonConfigString, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            wn0.l<? super String, h0> lVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                if (FourthlineModule.this.observingWorkflowData) {
                    final FourthlineModule fourthlineModule = FourthlineModule.this;
                    lVar = new wn0.l() { // from class: com.fourthline.reactplugin.e
                        @Override // wn0.l
                        public final Object invoke(Object obj2) {
                            return FourthlineModule.C41391.invokeSuspend$lambda$0(fourthlineModule, (String) obj2);
                        }
                    };
                } else {
                    lVar = null;
                }
                wn0.l<? super String, h0> lVar2 = lVar;
                WorkflowBridge workflowBridge = new WorkflowBridge();
                Activity currentActivity = FourthlineModule.this.getCurrentActivity();
                s.i(currentActivity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
                ComponentActivity componentActivity = (ComponentActivity) currentActivity;
                String str = this.$jsonConfigString;
                final FourthlineModule fourthlineModule2 = FourthlineModule.this;
                wn0.l<? super String, h0> lVar3 = new wn0.l() { // from class: com.fourthline.reactplugin.f
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return FourthlineModule.C41391.invokeSuspend$lambda$1(fourthlineModule2, (String) obj2);
                    }
                };
                final FourthlineModule fourthlineModule3 = FourthlineModule.this;
                workflowBridge.launch(componentActivity, str, lVar2, lVar3, new wn0.l() { // from class: com.fourthline.reactplugin.g
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return FourthlineModule.C41391.invokeSuspend$lambda$2(fourthlineModule3, (String) obj2);
                    }
                });
                FourthlineAnalyticsProcessor fourthlineAnalyticsProcessor = FourthlineAnalyticsProcessor.INSTANCE;
                fourthlineAnalyticsProcessor.setSessionAttribute(AnalyticsAttribute.PluginType, "ReactNative");
                fourthlineAnalyticsProcessor.setSessionAttribute(AnalyticsAttribute.PluginPlatformVersion, FourthlineModule.this.getReactNativeVersion());
            } catch (Exception e11) {
                if (e11 instanceof CommonJsonError) {
                    FourthlineModule fourthlineModule4 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor = FourthlineOutputProcessor.INSTANCE;
                    int errorCode = ((CommonJsonError) e11).getErrorCode();
                    String message = e11.getMessage();
                    if (message == null) {
                        message = CommonJsonError.IncorrectConfiguration.INSTANCE.getErrorMessage();
                    }
                    String string = fourthlineOutputProcessor.toFailJson(errorCode, message).toString();
                    s.j(string, "toString(...)");
                    fourthlineModule4.error(string);
                } else {
                    FourthlineModule fourthlineModule5 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor2 = FourthlineOutputProcessor.INSTANCE;
                    CommonJsonError.IncorrectConfiguration incorrectConfiguration = CommonJsonError.IncorrectConfiguration.INSTANCE;
                    int errorCode2 = incorrectConfiguration.getErrorCode();
                    String message2 = e11.getMessage();
                    if (message2 == null) {
                        message2 = incorrectConfiguration.getErrorMessage();
                    }
                    String string2 = fourthlineOutputProcessor2.toFailJson(errorCode2, message2).toString();
                    s.j(string2, "toString(...)");
                    fourthlineModule5.error(string2);
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C41391) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.reactplugin.FourthlineModule$startWorkflowComponentBiometrics$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.fourthline.reactplugin.FourthlineModule$startWorkflowComponentBiometrics$1", f = "FourthlineModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C41401 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ String $jsonConfigString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41401(String str, Continuation<? super C41401> continuation) {
            super(2, continuation);
            this.$jsonConfigString = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$0(FourthlineModule fourthlineModule, String str) {
            fourthlineModule.success(str);
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$1(FourthlineModule fourthlineModule, String str) {
            fourthlineModule.error(str);
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return FourthlineModule.this.new C41401(this.$jsonConfigString, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                WorkflowComponentsBridge workflowComponentsBridge = FourthlineModule.workflowSessionLauncher;
                if (workflowComponentsBridge != null) {
                    Activity currentActivity = FourthlineModule.this.getCurrentActivity();
                    s.i(currentActivity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
                    String str = this.$jsonConfigString;
                    final FourthlineModule fourthlineModule = FourthlineModule.this;
                    wn0.l<? super String, h0> lVar = new wn0.l() { // from class: com.fourthline.reactplugin.h
                        @Override // wn0.l
                        public final Object invoke(Object obj2) {
                            return FourthlineModule.C41401.invokeSuspend$lambda$0(fourthlineModule, (String) obj2);
                        }
                    };
                    final FourthlineModule fourthlineModule2 = FourthlineModule.this;
                    workflowComponentsBridge.launchBiometricsComponent((ComponentActivity) currentActivity, str, lVar, new wn0.l() { // from class: com.fourthline.reactplugin.i
                        @Override // wn0.l
                        public final Object invoke(Object obj2) {
                            return FourthlineModule.C41401.invokeSuspend$lambda$1(fourthlineModule2, (String) obj2);
                        }
                    });
                }
            } catch (Exception e11) {
                if (e11 instanceof CommonJsonError) {
                    FourthlineModule fourthlineModule3 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor = FourthlineOutputProcessor.INSTANCE;
                    int errorCode = ((CommonJsonError) e11).getErrorCode();
                    String message = e11.getMessage();
                    if (message == null) {
                        message = CommonJsonError.IncorrectConfiguration.INSTANCE.getErrorMessage();
                    }
                    String string = fourthlineOutputProcessor.toFailJson(errorCode, message).toString();
                    s.j(string, "toString(...)");
                    fourthlineModule3.error(string);
                } else {
                    FourthlineModule fourthlineModule4 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor2 = FourthlineOutputProcessor.INSTANCE;
                    CommonJsonError.IncorrectConfiguration incorrectConfiguration = CommonJsonError.IncorrectConfiguration.INSTANCE;
                    int errorCode2 = incorrectConfiguration.getErrorCode();
                    String message2 = e11.getMessage();
                    if (message2 == null) {
                        message2 = incorrectConfiguration.getErrorMessage();
                    }
                    String string2 = fourthlineOutputProcessor2.toFailJson(errorCode2, message2).toString();
                    s.j(string2, "toString(...)");
                    fourthlineModule4.error(string2);
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C41401) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.reactplugin.FourthlineModule$startWorkflowComponentDocument$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.fourthline.reactplugin.FourthlineModule$startWorkflowComponentDocument$1", f = "FourthlineModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C41411 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ String $jsonConfigString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41411(String str, Continuation<? super C41411> continuation) {
            super(2, continuation);
            this.$jsonConfigString = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$0(FourthlineModule fourthlineModule, String str) {
            fourthlineModule.success(str);
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$1(FourthlineModule fourthlineModule, String str) {
            fourthlineModule.error(str);
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return FourthlineModule.this.new C41411(this.$jsonConfigString, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                WorkflowComponentsBridge workflowComponentsBridge = FourthlineModule.workflowSessionLauncher;
                if (workflowComponentsBridge != null) {
                    Activity currentActivity = FourthlineModule.this.getCurrentActivity();
                    s.i(currentActivity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
                    String str = this.$jsonConfigString;
                    final FourthlineModule fourthlineModule = FourthlineModule.this;
                    wn0.l<? super String, h0> lVar = new wn0.l() { // from class: com.fourthline.reactplugin.j
                        @Override // wn0.l
                        public final Object invoke(Object obj2) {
                            return FourthlineModule.C41411.invokeSuspend$lambda$0(fourthlineModule, (String) obj2);
                        }
                    };
                    final FourthlineModule fourthlineModule2 = FourthlineModule.this;
                    workflowComponentsBridge.launchDocumentComponent((ComponentActivity) currentActivity, str, lVar, new wn0.l() { // from class: com.fourthline.reactplugin.k
                        @Override // wn0.l
                        public final Object invoke(Object obj2) {
                            return FourthlineModule.C41411.invokeSuspend$lambda$1(fourthlineModule2, (String) obj2);
                        }
                    });
                }
            } catch (Exception e11) {
                if (e11 instanceof CommonJsonError) {
                    FourthlineModule fourthlineModule3 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor = FourthlineOutputProcessor.INSTANCE;
                    int errorCode = ((CommonJsonError) e11).getErrorCode();
                    String message = e11.getMessage();
                    if (message == null) {
                        message = CommonJsonError.IncorrectConfiguration.INSTANCE.getErrorMessage();
                    }
                    String string = fourthlineOutputProcessor.toFailJson(errorCode, message).toString();
                    s.j(string, "toString(...)");
                    fourthlineModule3.error(string);
                } else {
                    FourthlineModule fourthlineModule4 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor2 = FourthlineOutputProcessor.INSTANCE;
                    CommonJsonError.IncorrectConfiguration incorrectConfiguration = CommonJsonError.IncorrectConfiguration.INSTANCE;
                    int errorCode2 = incorrectConfiguration.getErrorCode();
                    String message2 = e11.getMessage();
                    if (message2 == null) {
                        message2 = incorrectConfiguration.getErrorMessage();
                    }
                    String string2 = fourthlineOutputProcessor2.toFailJson(errorCode2, message2).toString();
                    s.j(string2, "toString(...)");
                    fourthlineModule4.error(string2);
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C41411) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.reactplugin.FourthlineModule$startWorkflowSession$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.fourthline.reactplugin.FourthlineModule$startWorkflowSession$1", f = "FourthlineModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C41421 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ String $jsonConfigString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41421(String str, Continuation<? super C41421> continuation) {
            super(2, continuation);
            this.$jsonConfigString = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$0(WorkflowComponentsBridge workflowComponentsBridge, FourthlineModule fourthlineModule) {
            FourthlineModule.workflowSessionLauncher = workflowComponentsBridge;
            fourthlineModule.success("");
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$1(FourthlineModule fourthlineModule, String str) {
            fourthlineModule.error(str);
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return FourthlineModule.this.new C41421(this.$jsonConfigString, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                final WorkflowComponentsBridge workflowComponentsBridge = new WorkflowComponentsBridge();
                Activity currentActivity = FourthlineModule.this.getCurrentActivity();
                s.i(currentActivity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
                String str = this.$jsonConfigString;
                final FourthlineModule fourthlineModule = FourthlineModule.this;
                wn0.a<h0> aVar = new wn0.a() { // from class: com.fourthline.reactplugin.l
                    @Override // wn0.a
                    public final Object invoke() {
                        return FourthlineModule.C41421.invokeSuspend$lambda$0(workflowComponentsBridge, fourthlineModule);
                    }
                };
                final FourthlineModule fourthlineModule2 = FourthlineModule.this;
                workflowComponentsBridge.startSession((ComponentActivity) currentActivity, str, aVar, new wn0.l() { // from class: com.fourthline.reactplugin.m
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return FourthlineModule.C41421.invokeSuspend$lambda$1(fourthlineModule2, (String) obj2);
                    }
                });
            } catch (Exception e11) {
                if (e11 instanceof CommonJsonError) {
                    FourthlineModule fourthlineModule3 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor = FourthlineOutputProcessor.INSTANCE;
                    int errorCode = ((CommonJsonError) e11).getErrorCode();
                    String message = e11.getMessage();
                    if (message == null) {
                        message = CommonJsonError.IncorrectConfiguration.INSTANCE.getErrorMessage();
                    }
                    String string = fourthlineOutputProcessor.toFailJson(errorCode, message).toString();
                    s.j(string, "toString(...)");
                    fourthlineModule3.error(string);
                } else {
                    FourthlineModule fourthlineModule4 = FourthlineModule.this;
                    FourthlineOutputProcessor fourthlineOutputProcessor2 = FourthlineOutputProcessor.INSTANCE;
                    CommonJsonError.IncorrectConfiguration incorrectConfiguration = CommonJsonError.IncorrectConfiguration.INSTANCE;
                    int errorCode2 = incorrectConfiguration.getErrorCode();
                    String message2 = e11.getMessage();
                    if (message2 == null) {
                        message2 = incorrectConfiguration.getErrorMessage();
                    }
                    String string2 = fourthlineOutputProcessor2.toFailJson(errorCode2, message2).toString();
                    s.j(string2, "toString(...)");
                    fourthlineModule4.error(string2);
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C41421) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FourthlineModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.eventEmitter = jn0.m.b(new wn0.a() { // from class: com.fourthline.reactplugin.a
            @Override // wn0.a
            public final Object invoke() {
                return FourthlineModule.eventEmitter_delegate$lambda$0(this.f37514a);
            }
        });
        reactContext.removeActivityEventListener(this);
        reactContext.addActivityEventListener(this);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 addListener$lambda$3(FourthlineModule fourthlineModule, String eventData) {
        s.k(eventData, "eventData");
        fourthlineModule.getEventEmitter().emit(ANALYTICS_IDENTIFIER, eventData);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void error(String message) {
        Promise promise = lastPromise;
        if (promise != null) {
            promise.reject(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter_delegate$lambda$0(FourthlineModule fourthlineModule) {
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) fourthlineModule.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        Object value = this.eventEmitter.getValue();
        s.j(value, "getValue(...)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getReactNativeVersion() {
        Map<String, Object> map = com.facebook.react.modules.systeminfo.b.f22873a;
        Object obj = map.get("major");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Object obj2 = map.get("minor");
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Object obj3 = map.get("patch");
        Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Object obj4 = map.get("prerelease");
        String str = obj4 instanceof String ? (String) obj4 : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iIntValue + "." + iIntValue2 + "." + iIntValue3);
        if (str != null && str.length() != 0) {
            sb2.append("-" + str);
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLocation() {
        this.isPermissionsPollIsInProgress = false;
        Activity currentActivity = getCurrentActivity();
        s.i(currentActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        FourthlineLocationProviderProcessor.INSTANCE.requestLocation((androidx.appcompat.app.c) currentActivity, new wn0.l() { // from class: com.fourthline.reactplugin.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return FourthlineModule.requestLocation$lambda$1(this.f37516a, (Coordinate) obj);
            }
        }, new p() { // from class: com.fourthline.reactplugin.d
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return FourthlineModule.requestLocation$lambda$2(this.f37517a, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestLocation$lambda$1(FourthlineModule fourthlineModule, Coordinate location) {
        s.k(location, "location");
        String string = FourthlineOutputProcessor.INSTANCE.provideJsonLocation(x.a(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()))).toString();
        s.j(string, "toString(...)");
        fourthlineModule.success(string);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestLocation$lambda$2(FourthlineModule fourthlineModule, int i11, String errorDescription) {
        s.k(errorDescription, "errorDescription");
        String string = FourthlineOutputProcessor.INSTANCE.toFailJson(i11, errorDescription).toString();
        s.j(string, "toString(...)");
        fourthlineModule.error(string);
        return h0.f84049a;
    }

    private final void requestPermissions() {
        Activity currentActivity = getCurrentActivity();
        s.i(currentActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.core.app.b.f((androidx.appcompat.app.c) currentActivity, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, LOCATION_REQUEST_CODE);
        this.isPermissionsPollIsInProgress = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void success(String message) {
        Promise promise = lastPromise;
        if (promise != null) {
            promise.resolve(message);
        }
    }

    @ReactMethod
    public final void abortOrca(Promise promise) {
        lastPromise = promise;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C41381(null), 3, null);
    }

    @ReactMethod
    public final void addListener(String name) {
        if (s.f(name, ANALYTICS_IDENTIFIER)) {
            this.observingAnalytics = true;
            FourthlineAnalyticsProcessor.INSTANCE.setObserver(new wn0.l() { // from class: com.fourthline.reactplugin.b
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return FourthlineModule.addListener$lambda$3(this.f37515a, (String) obj);
                }
            });
        } else if (s.f(name, WORKFLOW_RESULTS_IDENTIFIER)) {
            this.observingWorkflowData = true;
        }
    }

    @ReactMethod
    public final void cancelLocationRequest(Promise promise) {
        lastPromise = promise;
        FourthlineLocationProviderProcessor.INSTANCE.cancelLocationRequest();
        success("");
    }

    @ReactMethod
    public final void clearWorkflowSession(Callback callback) {
        s.k(callback, "callback");
        workflowSessionLauncher = null;
        callback.invoke(null, Boolean.TRUE);
    }

    @ReactMethod
    public final void deleteFourthlineFiles(Promise promise) {
        lastPromise = promise;
        ContextExtensionsKt.deleteFourthlineFiles(this.reactContext);
        success("");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Fourthline";
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void initializeAnalytics(String config, Promise promise) throws Throwable {
        s.k(config, "config");
        try {
            JSONObject jSONObject = new JSONObject(config);
            lastArgs = jSONObject;
            lastPromise = promise;
            FourthlineAnalyticsProcessor fourthlineAnalyticsProcessor = FourthlineAnalyticsProcessor.INSTANCE;
            Activity currentActivity = getCurrentActivity();
            s.h(currentActivity);
            fourthlineAnalyticsProcessor.init(jSONObject, currentActivity);
            success("");
        } catch (JSONException e11) {
            error(String.valueOf(e11.getMessage()));
        }
    }

    @ReactMethod
    public final void isWorkflowSessionAvailable(Callback callback) {
        s.k(callback, "callback");
        callback.invoke(null, Boolean.valueOf(workflowSessionLauncher != null));
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        s.k(activity, "activity");
        if (requestCode == 2051) {
            requestLocation();
        }
        KycResultHolder.INSTANCE.clear();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        s.k(intent, "intent");
    }

    @ReactMethod
    public final void removeListener(String name) {
        s.k(name, "name");
        if (s.f(name, ANALYTICS_IDENTIFIER)) {
            this.observingAnalytics = false;
            FourthlineAnalyticsProcessor.INSTANCE.removeObserver();
        } else if (s.f(name, WORKFLOW_RESULTS_IDENTIFIER)) {
            this.observingWorkflowData = false;
        }
    }

    @ReactMethod
    public final void removeListeners(Integer type) {
    }

    @ReactMethod
    public final void requestAuthorizationAndLocation(Promise promise) {
        lastPromise = promise;
        if (androidx.core.content.b.checkSelfPermission(this.reactContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            requestLocation();
        } else if (androidx.core.content.b.checkSelfPermission(this.reactContext, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            requestLocation();
        } else {
            this.isPermissionsPollIsInProgress = true;
            requestPermissions();
        }
    }

    @ReactMethod
    public final void setTrackingConsent(String config, Promise promise) {
        s.k(config, "config");
        try {
            JSONObject jSONObject = new JSONObject(config);
            lastArgs = jSONObject;
            lastPromise = promise;
            FourthlineAnalyticsProcessor.INSTANCE.setTrackingConsent(jSONObject);
            success("");
        } catch (JSONException e11) {
            error(String.valueOf(e11.getMessage()));
        }
    }

    @ReactMethod
    public final void startWorkflow(String jsonConfigString, Promise promise) {
        s.k(jsonConfigString, "jsonConfigString");
        lastPromise = promise;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C41391(jsonConfigString, null), 3, null);
    }

    @ReactMethod
    public final void startWorkflowComponentBiometrics(String jsonConfigString, Promise promise) {
        s.k(jsonConfigString, "jsonConfigString");
        lastPromise = promise;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C41401(jsonConfigString, null), 3, null);
    }

    @ReactMethod
    public final void startWorkflowComponentDocument(String jsonConfigString, Promise promise) {
        s.k(jsonConfigString, "jsonConfigString");
        lastPromise = promise;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C41411(jsonConfigString, null), 3, null);
    }

    @ReactMethod
    public final void startWorkflowSession(String jsonConfigString, Promise promise) {
        s.k(jsonConfigString, "jsonConfigString");
        lastPromise = promise;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C41421(jsonConfigString, null), 3, null);
    }
}
