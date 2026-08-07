package expo.modules.sms;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.q;
import co0.s;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.libraries.places.api.model.PlaceTypes;
import eb.a;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lexpo/modules/sms/SMSModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "<init>", "()V", "", "", "addresses", "message", "Lexpo/modules/sms/SMSOptions;", "options", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "sendSMSAsync", "(Ljava/util/List;Ljava/lang/String;Lexpo/modules/sms/SMSOptions;Lexpo/modules/kotlin/Promise;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "onHostResume", "onHostPause", "onHostDestroy", "pendingPromise", "Lexpo/modules/kotlin/Promise;", "", "smsComposerOpened", "Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "expo-sms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SMSModule extends Module implements LifecycleEventListener {
    private Promise pendingPromise;
    private boolean smsComposerOpened;

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSMSAsync(List<String> addresses, String message, SMSOptions options, Promise promise) throws MissingSMSAppException {
        Intent intent;
        if (options.getAttachments().isEmpty()) {
            intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:" + v.y0(addresses, ";", null, null, 0, null, null, 62, null)));
        } else {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra(PlaceTypes.ADDRESS, v.y0(addresses, ";", null, null, 0, null, null, 62, null));
            SMSAttachment sMSAttachment = options.getAttachments().get(0);
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(sMSAttachment.getUri()));
            intent.setType(sMSAttachment.getMimeType());
            intent.addFlags(1);
        }
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(getContext());
        if (defaultSmsPackage == null || intent.setPackage(defaultSmsPackage) == null) {
            throw new MissingSMSAppException();
        }
        intent.putExtra("exit_on_sent", true);
        intent.putExtra("compose_mode", true);
        intent.putExtra("sms_body", message);
        this.pendingPromise = promise;
        getAppContext().getThrowingActivity().startActivity(intent);
        this.smsComposerOpened = true;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoSMS");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.sms.SMSModule$definition$lambda$4$$inlined$OnCreate$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Object module;
                    try {
                        module = this.this$0.getAppContext().getLegacyModuleRegistry().getModule(UIManager.class);
                    } catch (Exception unused) {
                        module = null;
                    }
                    UIManager uIManager = (UIManager) module;
                    if (uIManager != null) {
                        uIManager.registerLifecycleEventListener(this.this$0);
                    }
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(List.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(List.class), false, new wn0.a<q>() { // from class: expo.modules.sms.SMSModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.p(List.class, s.INSTANCE.d(o0.o(String.class)));
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.sms.SMSModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(SMSOptions.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(SMSOptions.class), false, new wn0.a<q>() { // from class: expo.modules.sms.SMSModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(SMSOptions.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("sendSMSAsync", new AsyncFunctionWithPromiseComponent("sendSMSAsync", new AnyType[]{anyType, anyType2, anyType3}, new p<Object[], Promise, h0>() { // from class: expo.modules.sms.SMSModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws MissingSMSAppException {
                    p013kotlin.jvm.internal.s.k(objArr, "<destruct>");
                    p013kotlin.jvm.internal.s.k(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    SMSOptions sMSOptions = (SMSOptions) objArr[2];
                    SMSModule sMSModule = this.this$0;
                    sMSModule.sendSMSAsync((List) obj, (String) obj2, sMSOptions, promise);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws MissingSMSAppException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            AnyType[] anyTypeArr = new AnyType[0];
            l<Object[], Boolean> lVar = new l<Object[], Boolean>() { // from class: expo.modules.sms.SMSModule$definition$lambda$4$$inlined$AsyncFunction$1
                @Override // wn0.l
                public final Boolean invoke(Object[] it) {
                    p013kotlin.jvm.internal.s.k(it, "it");
                    return Boolean.valueOf(this.this$0.getContext().getPackageManager().hasSystemFeature("android.hardware.telephony"));
                }
            };
            if (p013kotlin.jvm.internal.s.f(Boolean.class, Integer.TYPE)) {
                stringAsyncFunctionComponent = new IntAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            } else if (p013kotlin.jvm.internal.s.f(Boolean.class, Boolean.TYPE)) {
                stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            } else if (p013kotlin.jvm.internal.s.f(Boolean.class, Double.TYPE)) {
                stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            } else if (p013kotlin.jvm.internal.s.f(Boolean.class, Float.TYPE)) {
                stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            } else {
                stringAsyncFunctionComponent = p013kotlin.jvm.internal.s.f(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("isAvailableAsync", stringAsyncFunctionComponent);
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new wn0.a<h0>() { // from class: expo.modules.sms.SMSModule$definition$lambda$4$$inlined$OnDestroy$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Object module;
                    try {
                        module = this.this$0.getAppContext().getLegacyModuleRegistry().getModule(UIManager.class);
                    } catch (Exception unused) {
                        module = null;
                    }
                    UIManager uIManager = (UIManager) module;
                    if (uIManager != null) {
                        uIManager.unregisterLifecycleEventListener(this.this$0);
                    }
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        Promise promise = this.pendingPromise;
        if (this.smsComposerOpened && promise != null) {
            promise.resolve(q5.d.b(new Pair("result", "unknown")));
            this.pendingPromise = null;
        }
        this.smsComposerOpened = false;
    }
}
