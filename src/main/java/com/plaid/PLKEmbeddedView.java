package com.plaid;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.gson.PlaidJsonConverter;
import com.plaid.link.OpenPlaidLink;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidHandler;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import jn0.h0;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u0010J'\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/plaid/PLKEmbeddedView;", "Landroid/widget/FrameLayout;", "Lcom/plaid/ActivityResultHandler;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "token", "Landroid/view/View;", "createEmbedded", "(Ljava/lang/String;)Landroid/view/View;", "Ljn0/h0;", "setupOnEventListener", "()V", "Lcom/plaid/link/result/LinkExit;", "linkExit", "handleLinkExit", "(Lcom/plaid/link/result/LinkExit;)V", "Lorg/json/JSONException;", "e", "sendLinkExitFrom", "(Lorg/json/JSONException;)V", "setToken", "(Ljava/lang/String;)V", "onAttachedToWindow", "onDetachedFromWindow", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "handleActivityResult", "(IILandroid/content/Intent;)V", "Lcom/facebook/react/uimanager/v0;", "themedReactContext", "Lcom/facebook/react/uimanager/v0;", "TAG", "Ljava/lang/String;", "LINK_ACTIVITY_REQUEST_CODE", "I", "EVENT_NAME", "Lcom/plaid/gson/PlaidJsonConverter;", "jsonConverter", "Lcom/plaid/gson/PlaidJsonConverter;", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PLKEmbeddedView extends FrameLayout implements ActivityResultHandler {
    private final String EVENT_NAME;
    private final int LINK_ACTIVITY_REQUEST_CODE;
    private final String TAG;
    private final PlaidJsonConverter jsonConverter;
    private final v0 themedReactContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PLKEmbeddedView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        s.k(context, "context");
    }

    private final View createEmbedded(String token) {
        LinkTokenConfiguration linkTokenConfigurationBuild = new LinkTokenConfiguration.Builder().token(token).build();
        Activity currentActivity = this.themedReactContext.getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return Plaid.createLinkEmbeddedView(currentActivity, linkTokenConfigurationBuild, (l<? super LinkTokenConfiguration, h0>) new l() { // from class: com.plaid.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return PLKEmbeddedView.createEmbedded$lambda$0(this.f46181a, (LinkTokenConfiguration) obj);
            }
        }, (l<? super LinkExit, h0>) new l() { // from class: com.plaid.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return PLKEmbeddedView.createEmbedded$lambda$1(this.f46182a, (LinkExit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 createEmbedded$lambda$0(PLKEmbeddedView pLKEmbeddedView, LinkTokenConfiguration linkTokenConfiguration) throws LinkException {
        Context applicationContext = pLKEmbeddedView.themedReactContext.getApplicationContext();
        s.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
        s.h(linkTokenConfiguration);
        PlaidHandler plaidHandlerCreate = Plaid.create((Application) applicationContext, linkTokenConfiguration);
        Activity currentActivity = pLKEmbeddedView.themedReactContext.getCurrentActivity();
        if (currentActivity != null) {
            plaidHandlerCreate.open(currentActivity);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 createEmbedded$lambda$1(PLKEmbeddedView pLKEmbeddedView, LinkExit linkExit) {
        s.k(linkExit, "linkExit");
        pLKEmbeddedView.handleLinkExit(linkExit);
        return h0.f84049a;
    }

    private final void handleLinkExit(LinkExit linkExit) {
        try {
            WritableMap writableMapConvertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(this.jsonConverter.convert(linkExit)));
            writableMapConvertJsonToMap.putString("embeddedEventName", "onExit");
            Context context = getContext();
            s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), PLKEmbeddedViewManager.EVENT_NAME, writableMapConvertJsonToMap);
        } catch (JSONException e11) {
            Log.e(this.TAG, "JSON Exception: " + e11);
            sendLinkExitFrom(e11);
        }
    }

    private final void sendLinkExitFrom(JSONException e11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap2.putString("error_message", e11.getMessage());
        writableMapCreateMap2.putString("json", e11.getMessage());
        writableMapCreateMap2.putString("error_type", "JSONException");
        writableMapCreateMap2.putInt("error_code", DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR);
        writableMapCreateMap3.putString("error_message", e11.getMessage());
        writableMapCreateMap3.putString("json", e11.getMessage());
        writableMapCreateMap3.putString("error_type", "JSONException");
        writableMapCreateMap3.putInt("error_code", DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR);
        writableMapCreateMap.putString("eventName", "EXIT");
        writableMapCreateMap.putMap(OrcaKeys.METADATA, writableMapCreateMap3);
        writableMapCreateMap.putMap(AnalyticsAttribute.Error, writableMapCreateMap2);
        writableMapCreateMap.putString("embeddedEventName", "onExit");
        Context context = getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), PLKEmbeddedViewManager.EVENT_NAME, writableMapCreateMap);
    }

    private final void setupOnEventListener() {
        Plaid.setLinkEventListener(new l() { // from class: com.plaid.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return PLKEmbeddedView.setupOnEventListener$lambda$2(this.f46180a, (LinkEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 setupOnEventListener$lambda$2(PLKEmbeddedView pLKEmbeddedView, LinkEvent event) {
        s.k(event, "event");
        try {
            WritableMap writableMapConvertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(pLKEmbeddedView.jsonConverter.convert(event)));
            writableMapConvertJsonToMap.putString("embeddedEventName", "onEvent");
            Context context = pLKEmbeddedView.getContext();
            s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(pLKEmbeddedView.getId(), PLKEmbeddedViewManager.EVENT_NAME, writableMapConvertJsonToMap);
            return h0.f84049a;
        } catch (JSONException e11) {
            Log.e(pLKEmbeddedView.TAG, "JSON Exception: " + e11);
            return h0.f84049a;
        }
    }

    @Override // com.plaid.ActivityResultHandler
    public void handleActivityResult(int requestCode, int resultCode, Intent data) {
        s.k(data, "data");
        if (requestCode == this.LINK_ACTIVITY_REQUEST_CODE) {
            LinkResult result = new OpenPlaidLink().parseResult(resultCode, data);
            if (!(result instanceof LinkSuccess)) {
                if (result instanceof LinkExit) {
                    handleLinkExit((LinkExit) result);
                    return;
                } else {
                    Log.e(this.TAG, "Unhandled LinkResult");
                    return;
                }
            }
            try {
                WritableMap writableMapConvertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(this.jsonConverter.convert((LinkSuccess) result)));
                writableMapConvertJsonToMap.putString("embeddedEventName", "onSuccess");
                Context context = getContext();
                s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), PLKEmbeddedViewManager.EVENT_NAME, writableMapConvertJsonToMap);
            } catch (JSONException e11) {
                Log.e(this.TAG, "JSON Exception parsing LinkSuccess");
                sendLinkExitFrom(e11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NativeModule nativeModule = this.themedReactContext.getNativeModule((Class<NativeModule>) PlaidModule.class);
        if (nativeModule instanceof PlaidModule) {
            ((PlaidModule) nativeModule).getMActivityResultManager().put(Integer.valueOf(this.LINK_ACTIVITY_REQUEST_CODE), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NativeModule nativeModule = this.themedReactContext.getNativeModule((Class<NativeModule>) PlaidModule.class);
        if (nativeModule instanceof PlaidModule) {
            ((PlaidModule) nativeModule).getMActivityResultManager().remove(Integer.valueOf(this.LINK_ACTIVITY_REQUEST_CODE));
        }
    }

    public final void setToken(String token) {
        s.k(token, "token");
        ((FrameLayout) findViewById(R.id.embedded_frame_layout)).addView(createEmbedded(token));
    }

    public /* synthetic */ PLKEmbeddedView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLKEmbeddedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.k(context, "context");
        this.themedReactContext = (v0) context;
        this.TAG = "EmbeddedSearch";
        this.LINK_ACTIVITY_REQUEST_CODE = 3364;
        this.EVENT_NAME = "OnEmbeddedEvent";
        this.jsonConverter = new PlaidJsonConverter();
        View.inflate(context, R.layout.plk_embedded_view, this);
        setupOnEventListener();
    }
}
