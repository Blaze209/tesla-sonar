package com.wenkesj.voice;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.util.Log;
import androidx.annotation.NonNull;
import co.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class VoiceModule extends ReactContextBaseJavaModule implements RecognitionListener {
    private boolean isRecognizing;
    private String locale;
    final ReactApplicationContext reactContext;
    private SpeechRecognizer speech;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReadableMap f57139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f57140b;

        a(ReadableMap readableMap, Callback callback) {
            this.f57139a = readableMap;
            this.f57140b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                VoiceModule.this.startListening(this.f57139a);
                VoiceModule.this.isRecognizing = true;
                this.f57140b.invoke(Boolean.FALSE);
            } catch (Exception e11) {
                this.f57140b.invoke(e11.getMessage());
            }
        }
    }

    class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f57142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableMap f57143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f57144c;

        b(String str, ReadableMap readableMap, Callback callback) {
            this.f57142a = str;
            this.f57143b = readableMap;
            this.f57144c = callback;
        }

        @Override // co.g
        public boolean onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
            boolean z11 = true;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                z11 = z11 && (iArr[i12] == 0);
            }
            VoiceModule.this.startSpeechWithPermissions(this.f57142a, this.f57143b, this.f57144c);
            return z11;
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f57146a;

        c(Callback callback) {
            this.f57146a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VoiceModule.this.speech != null) {
                    VoiceModule.this.speech.stopListening();
                }
                VoiceModule.this.isRecognizing = false;
                this.f57146a.invoke(Boolean.FALSE);
            } catch (Exception e11) {
                this.f57146a.invoke(e11.getMessage());
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f57148a;

        d(Callback callback) {
            this.f57148a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VoiceModule.this.speech != null) {
                    VoiceModule.this.speech.cancel();
                }
                VoiceModule.this.isRecognizing = false;
                this.f57148a.invoke(Boolean.FALSE);
            } catch (Exception e11) {
                this.f57148a.invoke(e11.getMessage());
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f57150a;

        e(Callback callback) {
            this.f57150a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VoiceModule.this.speech != null) {
                    VoiceModule.this.speech.destroy();
                }
                VoiceModule.this.speech = null;
                VoiceModule.this.isRecognizing = false;
                this.f57150a.invoke(Boolean.FALSE);
            } catch (Exception e11) {
                this.f57150a.invoke(e11.getMessage());
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ VoiceModule f57152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f57153b;

        f(VoiceModule voiceModule, Callback callback) {
            this.f57152a = voiceModule;
            this.f57153b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f57153b.invoke(Boolean.valueOf(SpeechRecognizer.isRecognitionAvailable(this.f57152a.reactContext)), Boolean.FALSE);
            } catch (Exception e11) {
                this.f57153b.invoke(Boolean.FALSE, e11.getMessage());
            }
        }
    }

    public VoiceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.speech = null;
        this.isRecognizing = false;
        this.locale = null;
        this.reactContext = reactApplicationContext;
    }

    public static String getErrorText(int i11) {
        switch (i11) {
            case 1:
                return "Network timeout";
            case 2:
                return "Network error";
            case 3:
                return "Audio recording error";
            case 4:
                return "error from server";
            case 5:
                return "Client side error";
            case 6:
                return "No speech input";
            case 7:
                return "No match";
            case 8:
                return "RecognitionService busy";
            case 9:
                return "Insufficient permissions";
            default:
                return "Didn't understand, please try again.";
        }
    }

    private String getLocale(String str) {
        return (str == null || str.equals("")) ? Locale.getDefault().toString() : str;
    }

    private boolean isPermissionGranted() {
        return getReactApplicationContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    private void sendEvent(String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startListening(ReadableMap readableMap) {
        SpeechRecognizer speechRecognizer = this.speech;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
            this.speech = null;
        }
        if (readableMap.hasKey("RECOGNIZER_ENGINE")) {
            String string = readableMap.getString("RECOGNIZER_ENGINE");
            string.getClass();
            if (string.equals("GOOGLE")) {
                this.speech = SpeechRecognizer.createSpeechRecognizer(this.reactContext, ComponentName.unflattenFromString("com.google.android.googlequicksearchbox/com.google.android.voicesearch.serviceapi.GoogleRecognitionService"));
            } else {
                this.speech = SpeechRecognizer.createSpeechRecognizer(this.reactContext);
            }
        } else {
            this.speech = SpeechRecognizer.createSpeechRecognizer(this.reactContext);
        }
        this.speech.setRecognitionListener(this);
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            strNextKey.getClass();
            switch (strNextKey) {
                case "EXTRA_LANGUAGE_MODEL":
                    String string2 = readableMap.getString(strNextKey);
                    string2.getClass();
                    if (string2.equals("LANGUAGE_MODEL_FREE_FORM")) {
                        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                        break;
                    } else {
                        if (!string2.equals("LANGUAGE_MODEL_WEB_SEARCH")) {
                            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                        } else {
                            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
                        }
                        break;
                    }
                    break;
                case "EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS":
                    intent.putExtra("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS", Double.valueOf(readableMap.getDouble(strNextKey)).intValue());
                    break;
                case "EXTRA_SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS":
                    intent.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", Double.valueOf(readableMap.getDouble(strNextKey)).intValue());
                    break;
                case "EXTRA_MAX_RESULTS":
                    intent.putExtra("android.speech.extra.MAX_RESULTS", Double.valueOf(readableMap.getDouble(strNextKey)).intValue());
                    break;
                case "EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS":
                    intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", Double.valueOf(readableMap.getDouble(strNextKey)).intValue());
                    break;
                case "EXTRA_PARTIAL_RESULTS":
                    intent.putExtra("android.speech.extra.PARTIAL_RESULTS", readableMap.getBoolean(strNextKey));
                    break;
            }
        }
        intent.putExtra("android.speech.extra.LANGUAGE", getLocale(this.locale));
        this.speech.startListening(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSpeechWithPermissions(String str, ReadableMap readableMap, Callback callback) {
        this.locale = str;
        new Handler(this.reactContext.getMainLooper()).post(new a(readableMap, callback));
    }

    @ReactMethod
    public void cancelSpeech(Callback callback) {
        new Handler(this.reactContext.getMainLooper()).post(new d(callback));
    }

    @ReactMethod
    public void destroySpeech(Callback callback) {
        new Handler(this.reactContext.getMainLooper()).post(new e(callback));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTVoice";
    }

    @ReactMethod
    public void getSpeechRecognitionServices(Promise promise) {
        List<ResolveInfo> listQueryIntentServices = this.reactContext.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next().serviceInfo.packageName);
        }
        promise.resolve(writableArrayCreateArray);
    }

    @ReactMethod
    public void isRecognizing(Callback callback) {
        callback.invoke(Boolean.valueOf(this.isRecognizing));
    }

    @ReactMethod
    public void isSpeechAvailable(Callback callback) {
        new Handler(this.reactContext.getMainLooper()).post(new f(this, callback));
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean(AnalyticsAttribute.Error, false);
        sendEvent("onSpeechStart", writableMapCreateMap);
        Log.d("ASR", "onBeginningOfSpeech()");
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(byte[] bArr) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean(AnalyticsAttribute.Error, false);
        sendEvent("onSpeechRecognized", writableMapCreateMap);
        Log.d("ASR", "onBufferReceived()");
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean(AnalyticsAttribute.Error, false);
        sendEvent("onSpeechEnd", writableMapCreateMap);
        Log.d("ASR", "onEndOfSpeech()");
        this.isRecognizing = false;
    }

    @Override // android.speech.RecognitionListener
    public void onError(int i11) {
        String str = String.format("%d/%s", Integer.valueOf(i11), getErrorText(i11));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str);
        writableMapCreateMap.putString("code", String.valueOf(i11));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap(AnalyticsAttribute.Error, writableMapCreateMap);
        sendEvent("onSpeechError", writableMapCreateMap2);
        Log.d("ASR", "onError() - " + str);
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int i11, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(Bundle bundle) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<String> it = bundle.getStringArrayList("results_recognition").iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next());
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("value", writableArrayCreateArray);
        sendEvent("onSpeechPartialResults", writableMapCreateMap);
        Log.d("ASR", "onPartialResults()");
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(Bundle bundle) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean(AnalyticsAttribute.Error, false);
        sendEvent("onSpeechStart", writableMapCreateMap);
        Log.d("ASR", "onReadyForSpeech()");
    }

    @Override // android.speech.RecognitionListener
    public void onResults(Bundle bundle) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<String> it = bundle.getStringArrayList("results_recognition").iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next());
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("value", writableArrayCreateArray);
        sendEvent("onSpeechResults", writableMapCreateMap);
        Log.d("ASR", "onResults()");
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(float f11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("value", f11);
        sendEvent("onSpeechVolumeChanged", writableMapCreateMap);
    }

    @ReactMethod
    public void startSpeech(String str, ReadableMap readableMap, Callback callback) {
        if (isPermissionGranted() || !readableMap.getBoolean("REQUEST_PERMISSIONS_AUTO")) {
            startSpeechWithPermissions(str, readableMap, callback);
            return;
        }
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (getCurrentActivity() != null) {
            ((co.f) getCurrentActivity()).a(strArr, 1, new b(str, readableMap, callback));
        }
    }

    @ReactMethod
    public void stopSpeech(Callback callback) {
        new Handler(this.reactContext.getMainLooper()).post(new c(callback));
    }
}
