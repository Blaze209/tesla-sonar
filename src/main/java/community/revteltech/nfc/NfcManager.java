package community.revteltech.nfc;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.MifareUltralight;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import android.nfc.tech.NfcF;
import android.nfc.tech.NfcV;
import android.nfc.tech.TagTechnology;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class NfcManager extends ReactContextBaseJavaModule implements ActivityEventListener, LifecycleEventListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ERR_API_NOT_SUPPORT = "unsupported tag api";
    private static final String ERR_CANCEL = "cancelled";
    private static final String ERR_GET_ACTIVITY_FAIL = "fail to get current activity";
    private static final String ERR_MULTI_REQ = "You can only issue one request at a time";
    private static final String ERR_NOT_REGISTERED = "you should requestTagEvent first";
    private static final String ERR_NO_NFC_SUPPORT = "no nfc support";
    private static final String ERR_NO_REFERENCE = "no reference available";
    private static final String ERR_NO_TECH_REQ = "no tech request available";
    private static final String ERR_TRANSCEIVE_FAIL = "transceive fail";
    private static final String LOG_TAG = "ReactNativeNfcManager";
    private WritableMap bgTag;
    private final Context context;
    private final List<IntentFilter> intentFilters;
    private Boolean isForegroundEnabled;
    private Boolean isReaderModeEnabled;
    private Boolean isResumed;
    private final BroadcastReceiver mReceiver;
    private int readerModeDelay;
    private int readerModeFlags;
    private Tag tag;
    private final ArrayList<String[]> techLists;
    private d techRequest;
    private c writeNdefRequest;

    class a implements NfcAdapter.ReaderCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NfcManager f58885a;

        a(NfcManager nfcManager) {
            this.f58885a = nfcManager;
        }

        @Override // android.nfc.NfcAdapter.ReaderCallback
        public void onTagDiscovered(Tag tag) {
            WritableMap writableMapTag2React;
            synchronized (this) {
                try {
                    this.f58885a.tag = tag;
                    Log.d(NfcManager.LOG_TAG, "readerMode onTagDiscovered");
                    if (Arrays.asList(tag.getTechList()).contains(Ndef.class.getName())) {
                        Ndef ndef = Ndef.get(tag);
                        writableMapTag2React = NfcManager.this.ndef2React(ndef, new NdefMessage[]{ndef.getCachedNdefMessage()});
                    } else {
                        writableMapTag2React = NfcManager.this.tag2React(tag);
                    }
                    if (writableMapTag2React != null) {
                        NfcManager.this.sendEvent("NfcManagerDiscoverTag", writableMapTag2React);
                        if (NfcManager.this.techRequest != null && !NfcManager.this.techRequest.h()) {
                            if (NfcManager.this.techRequest.b(tag)) {
                                NfcManager.this.techRequest.f(NfcManager.this.techRequest.e());
                            } else {
                                NfcManager.this.techRequest.f(null);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            Log.d(NfcManager.LOG_TAG, "onReceive " + intent);
            if (intent.getAction().equals("android.nfc.action.ADAPTER_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
                if (intExtra == 1) {
                    str = DebugKt.DEBUG_PROPERTY_VALUE_OFF;
                } else if (intExtra == 2) {
                    str = "turning_on";
                } else if (intExtra != 3) {
                    str = intExtra != 4 ? "unknown" : "turning_off";
                } else {
                    str = DebugKt.DEBUG_PROPERTY_VALUE_ON;
                }
                try {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("state", str);
                    NfcManager.this.sendEvent("NfcManagerStateChanged", writableMapCreateMap);
                } catch (Exception e11) {
                    Log.d(NfcManager.LOG_TAG, "send nfc state change event fail: " + e11);
                }
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        NdefMessage f58888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Callback f58889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f58890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f58891d;

        c(NdefMessage ndefMessage, Callback callback, boolean z11, boolean z12) {
            this.f58888a = ndefMessage;
            this.f58889b = callback;
            this.f58890c = z11;
            this.f58891d = z12;
        }
    }

    public NfcManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.intentFilters = new ArrayList();
        this.techLists = new ArrayList<>();
        Boolean bool = Boolean.FALSE;
        this.isForegroundEnabled = bool;
        this.isResumed = bool;
        this.writeNdefRequest = null;
        this.techRequest = null;
        this.tag = null;
        this.bgTag = null;
        this.isReaderModeEnabled = bool;
        this.readerModeFlags = 0;
        this.readerModeDelay = 0;
        this.mReceiver = new b();
        this.context = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
        reactApplicationContext.addLifecycleEventListener(this);
        Log.d(LOG_TAG, "NfcManager created");
    }

    private static WritableArray appendBytesToRnArray(WritableArray writableArray, byte[] bArr) {
        for (byte b11 : bArr) {
            writableArray.pushInt(b11 & 255);
        }
        return writableArray;
    }

    private static WritableArray bytesToRnArray(byte[] bArr) {
        return appendBytesToRnArray(Arguments.createArray(), bArr);
    }

    private void enableDisableForegroundDispatch(boolean z11) {
        Log.i(LOG_TAG, "enableForegroundDispatch, enable = " + z11);
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.context);
        Activity currentActivity = getCurrentActivity();
        if (defaultAdapter == null || currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        try {
            if (!this.isReaderModeEnabled.booleanValue()) {
                if (z11) {
                    defaultAdapter.enableForegroundDispatch(currentActivity, getPendingIntent(), getIntentFilters(), getTechLists());
                    return;
                } else {
                    defaultAdapter.disableForegroundDispatch(currentActivity);
                    return;
                }
            }
            if (!z11) {
                Log.i(LOG_TAG, "disableReaderMode");
                defaultAdapter.disableReaderMode(currentActivity);
                return;
            }
            Log.i(LOG_TAG, "enableReaderMode: " + this.readerModeFlags);
            Bundle bundle = new Bundle();
            bundle.putInt("presence", this.readerModeDelay * 1000);
            defaultAdapter.enableReaderMode(currentActivity, new a(this), this.readerModeFlags, bundle);
        } catch (IllegalStateException | NullPointerException unused) {
            Log.w(LOG_TAG, "Illegal State Exception starting NFC. Assuming application is terminating.");
        }
    }

    private IntentFilter[] getIntentFilters() {
        return (IntentFilter[]) this.intentFilters.toArray(new IntentFilter[0]);
    }

    private PendingIntent getPendingIntent() {
        Activity currentActivity = getCurrentActivity();
        Intent intent = new Intent(currentActivity, currentActivity.getClass());
        intent.addFlags(603979776);
        return PendingIntent.getActivity(currentActivity, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
    }

    private String[][] getTechLists() {
        return (String[][]) this.techLists.toArray((String[][]) Array.newInstance((Class<?>) String.class, 0, 0));
    }

    private boolean hasPendingRequest() {
        return (this.writeNdefRequest == null && this.techRequest == null) ? false : true;
    }

    @ReactMethod
    private void hasTagEventRegistration(Callback callback) {
        Log.d(LOG_TAG, "isSessionAvailable: " + this.isForegroundEnabled);
        callback.invoke(null, this.isForegroundEnabled);
    }

    private void mifareClassicAuthenticate(char c11, int i11, ReadableArray readableArray, Callback callback) {
        d dVar = this.techRequest;
        if (dVar == null) {
            callback.invoke(ERR_NO_TECH_REQ);
            return;
        }
        try {
            MifareClassic mifareClassic = (MifareClassic) dVar.d();
            if (mifareClassic != null && mifareClassic.getType() != -1) {
                if (i11 >= mifareClassic.getSectorCount()) {
                    callback.invoke(String.format("mifareClassicAuthenticate fail: invalid sector %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getSectorCount())));
                    return;
                }
                if (readableArray.size() != 6) {
                    callback.invoke(String.format("mifareClassicAuthenticate fail: invalid key (needs length 6 but has %d characters)", Integer.valueOf(readableArray.size())));
                    return;
                }
                if (c11 == 'A' ? mifareClassic.authenticateSectorWithKeyA(i11, rnArrayToBytes(readableArray)) : mifareClassic.authenticateSectorWithKeyB(i11, rnArrayToBytes(readableArray))) {
                    callback.invoke(null, Boolean.TRUE);
                    return;
                } else {
                    callback.invoke("mifareClassicAuthenticate fail: AUTH_FAIL");
                    return;
                }
            }
            callback.invoke("mifareClassicAuthenticate fail: TYPE_UNKNOWN");
        } catch (TagLostException unused) {
            callback.invoke("mifareClassicAuthenticate fail: TAG_LOST");
        } catch (Exception e11) {
            callback.invoke("mifareClassicAuthenticate fail: " + e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap ndef2React(Ndef ndef, Parcelable[] parcelableArr) {
        try {
            return community.revteltech.nfc.a.b(buildNdefJSON(ndef, parcelableArr));
        } catch (JSONException unused) {
            return null;
        }
    }

    private WritableMap parseNfcIntent(Intent intent) {
        Tag tag;
        Log.d(LOG_TAG, "parseIntent " + intent);
        String action = intent.getAction();
        Log.d(LOG_TAG, "action " + action);
        if (action == null || (tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG")) == null) {
            return null;
        }
        synchronized (this) {
            try {
                this.tag = tag;
                c cVar = this.writeNdefRequest;
                if (cVar != null) {
                    writeNdef(tag, cVar);
                    this.writeNdefRequest = null;
                    return null;
                }
                d dVar = this.techRequest;
                if (dVar != null) {
                    if (!dVar.h()) {
                        if (this.techRequest.b(tag)) {
                            d dVar2 = this.techRequest;
                            dVar2.f(dVar2.e());
                        } else {
                            this.techRequest.f(null);
                        }
                    }
                    return null;
                }
                switch (action) {
                    case "android.nfc.action.TECH_DISCOVERED":
                        if (!Arrays.asList(tag.getTechList()).contains(Ndef.class.getName())) {
                            return tag2React(tag);
                        }
                        Ndef ndef = Ndef.get(tag);
                        return ndef2React(ndef, new NdefMessage[]{ndef.getCachedNdefMessage()});
                    case "android.nfc.action.TAG_DISCOVERED":
                        return tag2React(tag);
                    case "android.nfc.action.NDEF_DISCOVERED":
                        return ndef2React(Ndef.get(tag), intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES"));
                    default:
                        return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ReactMethod
    private void registerTagEvent(ReadableMap readableMap, Callback callback) {
        this.isReaderModeEnabled = Boolean.valueOf(readableMap.getBoolean("isReaderModeEnabled"));
        this.readerModeFlags = readableMap.getInt("readerModeFlags");
        this.readerModeDelay = readableMap.getInt("readerModeDelay");
        Log.d(LOG_TAG, "registerTagEvent");
        this.isForegroundEnabled = Boolean.TRUE;
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        try {
            intentFilter.addDataType("*/*");
            this.intentFilters.add(intentFilter);
            this.intentFilters.add(new IntentFilter("android.nfc.action.TECH_DISCOVERED"));
            this.techLists.add(new String[]{Ndef.class.getName()});
            this.intentFilters.add(new IntentFilter("android.nfc.action.TAG_DISCOVERED"));
            if (this.isResumed.booleanValue()) {
                enableDisableForegroundDispatch(true);
            }
            callback.invoke(new Object[0]);
        } catch (IntentFilter.MalformedMimeTypeException e11) {
            throw new RuntimeException("fail", e11);
        }
    }

    private static byte[] rnArrayToBytes(ReadableArray readableArray) {
        byte[] bArr = new byte[readableArray.size()];
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            bArr[i11] = (byte) (readableArray.getInt(i11) & 255);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ((RCTNativeAppEventEmitter) getReactApplicationContext().getJSModule(RCTNativeAppEventEmitter.class)).emit(str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap tag2React(Tag tag) {
        try {
            return community.revteltech.nfc.a.b(e.f(tag));
        } catch (JSONException unused) {
            return null;
        }
    }

    @ReactMethod
    private void unregisterTagEvent(Callback callback) {
        Log.d(LOG_TAG, "unregisterTagEvent");
        if (this.isResumed.booleanValue()) {
            enableDisableForegroundDispatch(false);
        }
        this.intentFilters.clear();
        Boolean bool = Boolean.FALSE;
        this.isForegroundEnabled = bool;
        this.isReaderModeEnabled = bool;
        this.readerModeFlags = 0;
        this.readerModeDelay = 0;
        callback.invoke(new Object[0]);
    }

    private void writeNdef(Tag tag, c cVar) {
        NdefMessage ndefMessage = cVar.f58888a;
        Callback callback = cVar.f58889b;
        boolean z11 = cVar.f58891d;
        if (cVar.f58890c || z11) {
            try {
                Log.d(LOG_TAG, "ready to writeNdef");
                NdefFormatable ndefFormatable = NdefFormatable.get(tag);
                if (ndefFormatable == null) {
                    callback.invoke(ERR_API_NOT_SUPPORT);
                    return;
                }
                Log.d(LOG_TAG, "ready to format ndef, seriously");
                ndefFormatable.connect();
                if (z11) {
                    ndefFormatable.formatReadOnly(ndefMessage);
                } else {
                    ndefFormatable.format(ndefMessage);
                }
                callback.invoke(new Object[0]);
                return;
            } catch (Exception e11) {
                callback.invoke(e11.toString());
                return;
            }
        }
        try {
            Log.d(LOG_TAG, "ready to writeNdef");
            Ndef ndef = Ndef.get(tag);
            if (ndef == null) {
                callback.invoke(ERR_API_NOT_SUPPORT);
                return;
            }
            if (!ndef.isWritable()) {
                callback.invoke("tag is not writeable");
                return;
            }
            if (ndef.getMaxSize() < ndefMessage.toByteArray().length) {
                callback.invoke("tag size is not enough");
                return;
            }
            Log.d(LOG_TAG, "ready to writeNdef, seriously");
            ndef.connect();
            ndef.writeNdefMessage(ndefMessage);
            callback.invoke(new Object[0]);
        } catch (Exception e12) {
            callback.invoke(e12.toString());
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    JSONObject buildNdefJSON(Ndef ndef, Parcelable[] parcelableArr) {
        JSONObject jSONObjectD = e.d(ndef);
        if (ndef == null && parcelableArr != null) {
            try {
                if (parcelableArr.length > 0) {
                    jSONObjectD.put("ndefMessage", e.c((NdefMessage) parcelableArr[0]));
                    jSONObjectD.put("type", "NDEF");
                }
                if (parcelableArr.length > 1) {
                    Log.d(LOG_TAG, "Expected one ndefMessage but found " + parcelableArr.length);
                    return jSONObjectD;
                }
            } catch (JSONException e11) {
                Log.e("NfcPlugin", "Failed to convert ndefMessage into json", e11);
            }
        }
        return jSONObjectD;
    }

    @ReactMethod
    public void cancelNdefWrite(Callback callback) {
        synchronized (this) {
            try {
                c cVar = this.writeNdefRequest;
                if (cVar != null) {
                    cVar.f58889b.invoke(ERR_CANCEL);
                    this.writeNdefRequest = null;
                    callback.invoke(new Object[0]);
                } else {
                    callback.invoke(ERR_NOT_REGISTERED);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ReactMethod
    public void cancelTechnologyRequest(Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                dVar.a();
                try {
                    this.techRequest.g(ERR_CANCEL);
                } catch (RuntimeException unused) {
                }
                this.techRequest = null;
            }
            callback.invoke(new Object[0]);
        }
    }

    @ReactMethod
    public void clearBackgroundTag(Callback callback) {
        this.bgTag = null;
        callback.invoke(new Object[0]);
    }

    @ReactMethod
    public void close(Callback callback) {
        synchronized (this) {
            try {
                this.techRequest.a();
                callback.invoke(null, null);
            } catch (Exception e11) {
                callback.invoke(e11.toString());
            }
        }
    }

    @ReactMethod
    public void closeTechnology(Callback callback) {
        synchronized (this) {
            try {
                d dVar = this.techRequest;
                if (dVar != null) {
                    dVar.a();
                    this.techRequest = null;
                }
                callback.invoke(new Object[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ReactMethod
    public void connect(ReadableArray readableArray, Callback callback) {
        synchronized (this) {
            try {
                d dVar = new d(readableArray.toArrayList(), callback);
                this.techRequest = dVar;
                dVar.b(this.tag);
                callback.invoke(null, null);
            } catch (Exception e11) {
                callback.invoke(e11.toString());
            }
        }
    }

    @ReactMethod
    public void formatNdef(ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
        boolean z11 = readableMap.getBoolean("readOnly");
        synchronized (this) {
            try {
                d dVar = this.techRequest;
                if (dVar != null) {
                    try {
                        NdefFormatable ndefFormatable = (NdefFormatable) dVar.d();
                        if (ndefFormatable == null) {
                            callback.invoke(ERR_API_NOT_SUPPORT);
                        } else {
                            NdefMessage ndefMessage = new NdefMessage(rnArrayToBytes(readableArray));
                            if (z11) {
                                ndefFormatable.formatReadOnly(ndefMessage);
                            } else {
                                ndefFormatable.format(ndefMessage);
                            }
                            callback.invoke(new Object[0]);
                        }
                    } catch (Exception e11) {
                        Log.d(LOG_TAG, e11.toString());
                        callback.invoke(e11.toString());
                    }
                } else {
                    callback.invoke(ERR_NO_TECH_REQ);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ReactMethod
    public void getBackgroundTag(Callback callback) {
        callback.invoke(null, this.bgTag);
    }

    @ReactMethod
    public void getCachedNdefMessage(Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    Ndef ndef = Ndef.get(dVar.c());
                    callback.invoke(null, ndef2React(ndef, new NdefMessage[]{ndef.getCachedNdefMessage()}));
                } catch (Exception e11) {
                    Log.d(LOG_TAG, e11.toString());
                    callback.invoke(e11.toString());
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("MIFARE_BLOCK_SIZE", 16);
        map.put("MIFARE_ULTRALIGHT_PAGE_SIZE", 4);
        map.put("MIFARE_ULTRALIGHT_TYPE", 1);
        map.put("MIFARE_ULTRALIGHT_TYPE_C", 2);
        map.put("MIFARE_ULTRALIGHT_TYPE_UNKNOWN", -1);
        return map;
    }

    @ReactMethod
    public void getLaunchTagEvent(Callback callback) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(ERR_GET_ACTIVITY_FAIL);
        } else {
            callback.invoke(null, parseNfcIntent(currentActivity.getIntent()));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactMethod
    public void getMaxTransceiveLength(Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    String strE = dVar.e();
                    TagTechnology tagTechnologyD = this.techRequest.d();
                    switch (strE.hashCode()) {
                        case -2095458966:
                            if (strE.equals("IsoDep")) {
                                callback.invoke(null, Integer.valueOf(((IsoDep) tagTechnologyD).getMaxTransceiveLength()));
                                return;
                            }
                            break;
                        case 2424854:
                            if (strE.equals("NfcA")) {
                                callback.invoke(null, Integer.valueOf(((NfcA) tagTechnologyD).getMaxTransceiveLength()));
                                return;
                            }
                            break;
                        case 2424855:
                            if (strE.equals("NfcB")) {
                                callback.invoke(null, Integer.valueOf(((NfcB) tagTechnologyD).getMaxTransceiveLength()));
                                return;
                            }
                            break;
                        case 2424859:
                            if (strE.equals("NfcF")) {
                                callback.invoke(null, Integer.valueOf(((NfcF) tagTechnologyD).getMaxTransceiveLength()));
                                return;
                            }
                            break;
                        case 2424875:
                            if (strE.equals("NfcV")) {
                                callback.invoke(null, Integer.valueOf(((NfcV) tagTechnologyD).getMaxTransceiveLength()));
                                return;
                            }
                            break;
                        case 850504820:
                            if (strE.equals("MifareUltralight")) {
                                callback.invoke(null, Integer.valueOf(((MifareUltralight) tagTechnologyD).getMaxTransceiveLength()));
                                return;
                            }
                            break;
                    }
                    Log.d(LOG_TAG, "getMaxTransceiveLength not supported");
                    callback.invoke(ERR_API_NOT_SUPPORT);
                } catch (Exception e11) {
                    Log.d(LOG_TAG, "getMaxTransceiveLength fail");
                    callback.invoke(e11.toString());
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "NfcManager";
    }

    @ReactMethod
    public void getNdefMessage(Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    callback.invoke(null, ndef2React(null, new NdefMessage[]{Ndef.get(dVar.c()).getNdefMessage()}));
                } catch (Exception e11) {
                    Log.d(LOG_TAG, e11.toString());
                    callback.invoke(e11.toString());
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void getNdefStatus(Callback callback) {
        synchronized (this) {
            if (this.techRequest != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                try {
                    Ndef ndef = Ndef.get(this.techRequest.c());
                    int maxSize = ndef.getMaxSize();
                    boolean zIsWritable = ndef.isWritable();
                    boolean zCanMakeReadOnly = ndef.canMakeReadOnly();
                    writableMapCreateMap.putInt("maxSize", maxSize);
                    writableMapCreateMap.putBoolean("isWritable", zIsWritable);
                    writableMapCreateMap.putBoolean("canMakeReadOnly", zCanMakeReadOnly);
                    callback.invoke(null, writableMapCreateMap);
                } catch (Exception e11) {
                    Log.d(LOG_TAG, e11.toString());
                    callback.invoke(e11.toString());
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void getTag(Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                Tag tagC = dVar.c();
                if (tagC != null) {
                    WritableMap writableMapTag2React = tag2React(tagC);
                    if (Arrays.asList(tagC.getTechList()).contains(Ndef.class.getName())) {
                        try {
                            Ndef ndef = Ndef.get(tagC);
                            writableMapTag2React = ndef2React(ndef, new NdefMessage[]{ndef.getCachedNdefMessage()});
                        } catch (Exception e11) {
                            Log.d(LOG_TAG, e11.toString());
                        }
                    }
                    callback.invoke(null, writableMapTag2React);
                } else {
                    callback.invoke(ERR_NO_REFERENCE);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void goToNfcSetting(Callback callback) {
        Log.d(LOG_TAG, "goToNfcSetting");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(ERR_GET_ACTIVITY_FAIL);
            return;
        }
        try {
            currentActivity.startActivity(new Intent("android.settings.NFC_SETTINGS"));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception unused) {
            callback.invoke(null, Boolean.FALSE);
        }
    }

    @ReactMethod
    public void isEnabled(Callback callback) {
        Log.d(LOG_TAG, "isEnabled");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.context);
        if (defaultAdapter != null) {
            callback.invoke(null, Boolean.valueOf(defaultAdapter.isEnabled()));
        } else {
            callback.invoke(null, Boolean.FALSE);
        }
    }

    @ReactMethod
    public void isSupported(String str, Callback callback) {
        Log.d(LOG_TAG, "isSupported");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(ERR_GET_ACTIVITY_FAIL);
            return;
        }
        if (!currentActivity.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
            callback.invoke(null, Boolean.FALSE);
        } else if (!str.equals("MifareClassic") || community.revteltech.nfc.b.a(currentActivity)) {
            callback.invoke(null, Boolean.TRUE);
        } else {
            callback.invoke(null, Boolean.FALSE);
        }
    }

    @ReactMethod
    public void makeReadOnly(Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    callback.invoke(null, Boolean.valueOf(((Ndef) dVar.d()).makeReadOnly()));
                } catch (Exception e11) {
                    Log.d(LOG_TAG, e11.toString());
                    callback.invoke(e11.toString());
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareClassicAuthenticateA(int i11, ReadableArray readableArray, Callback callback) {
        synchronized (this) {
            mifareClassicAuthenticate('A', i11, readableArray, callback);
        }
    }

    @ReactMethod
    public void mifareClassicAuthenticateB(int i11, ReadableArray readableArray, Callback callback) {
        synchronized (this) {
            mifareClassicAuthenticate('B', i11, readableArray, callback);
        }
    }

    @ReactMethod
    public void mifareClassicDecrementBlock(int i11, int i12, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    MifareClassic mifareClassic = (MifareClassic) dVar.d();
                    if (mifareClassic != null && mifareClassic.getType() != -1) {
                        if (i11 >= mifareClassic.getBlockCount()) {
                            callback.invoke(String.format("mifareClassicDecrementBlock fail: invalid block %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getBlockCount())));
                            return;
                        } else {
                            mifareClassic.decrement(i11, i12);
                            callback.invoke(null, Boolean.TRUE);
                        }
                    }
                    callback.invoke("mifareClassicDecrementBlock fail: TYPE_UNKNOWN");
                } catch (TagLostException unused) {
                    callback.invoke("mifareClassicDecrementBlock fail: TAG_LOST");
                } catch (Exception e11) {
                    callback.invoke("mifareClassicDecrementBlock fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareClassicGetBlockCountInSector(int i11, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    MifareClassic mifareClassic = (MifareClassic) dVar.d();
                    if (mifareClassic != null && mifareClassic.getType() != -1) {
                        if (i11 >= mifareClassic.getSectorCount()) {
                            callback.invoke(String.format("mifareClassicGetBlockCountInSector fail: invalid sector %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getSectorCount())));
                            return;
                        }
                        callback.invoke(null, Integer.valueOf(mifareClassic.getBlockCountInSector(i11)));
                    }
                    callback.invoke("mifareClassicGetBlockCountInSector fail: TYPE_UNKNOWN");
                } catch (Exception e11) {
                    callback.invoke("mifareClassicGetBlockCountInSector fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareClassicGetSectorCount(Callback callback) {
        synchronized (this) {
            try {
                d dVar = this.techRequest;
                if (dVar != null) {
                    try {
                        MifareClassic mifareClassic = (MifareClassic) dVar.d();
                        if (mifareClassic != null && mifareClassic.getType() != -1) {
                            callback.invoke(null, Integer.valueOf(mifareClassic.getSectorCount()));
                        }
                        callback.invoke("mifareClassicGetSectorCount fail: TYPE_UNKNOWN");
                    } catch (Exception e11) {
                        callback.invoke("mifareClassicGetSectorCount fail: " + e11);
                    }
                } else {
                    callback.invoke(ERR_NO_TECH_REQ);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ReactMethod
    public void mifareClassicIncrementBlock(int i11, int i12, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    MifareClassic mifareClassic = (MifareClassic) dVar.d();
                    if (mifareClassic != null && mifareClassic.getType() != -1) {
                        if (i11 >= mifareClassic.getBlockCount()) {
                            callback.invoke(String.format("mifareClassicIncrementBlock fail: invalid block %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getBlockCount())));
                            return;
                        } else {
                            mifareClassic.increment(i11, i12);
                            callback.invoke(null, Boolean.TRUE);
                        }
                    }
                    callback.invoke("mifareClassicIncrementBlock fail: TYPE_UNKNOWN");
                } catch (TagLostException unused) {
                    callback.invoke("mifareClassicIncrementBlock fail: TAG_LOST");
                } catch (Exception e11) {
                    callback.invoke("mifareClassicIncrementBlock fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareClassicReadBlock(int i11, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    MifareClassic mifareClassic = (MifareClassic) dVar.d();
                    if (mifareClassic != null && mifareClassic.getType() != -1) {
                        if (i11 >= mifareClassic.getBlockCount()) {
                            callback.invoke(String.format("mifareClassicReadBlock fail: invalid block %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getBlockCount())));
                            return;
                        }
                        callback.invoke(null, bytesToRnArray(mifareClassic.readBlock(i11)));
                    }
                    callback.invoke("mifareClassicReadBlock fail: TYPE_UNKNOWN");
                } catch (TagLostException unused) {
                    callback.invoke("mifareClassicReadBlock fail: TAG_LOST");
                } catch (Exception e11) {
                    callback.invoke("mifareClassicReadBlock fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareClassicReadSector(int i11, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    MifareClassic mifareClassic = (MifareClassic) dVar.d();
                    if (mifareClassic != null && mifareClassic.getType() != -1) {
                        if (i11 >= mifareClassic.getSectorCount()) {
                            callback.invoke(String.format("mifareClassicReadSector fail: invalid sector %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getSectorCount())));
                            return;
                        }
                        WritableArray writableArrayCreateArray = Arguments.createArray();
                        int blockCountInSector = mifareClassic.getBlockCountInSector(i11);
                        for (int i12 = 0; i12 < blockCountInSector; i12++) {
                            appendBytesToRnArray(writableArrayCreateArray, mifareClassic.readBlock(mifareClassic.sectorToBlock(i11) + i12));
                        }
                        callback.invoke(null, writableArrayCreateArray);
                    }
                    callback.invoke("mifareClassicReadSector fail: TYPE_UNKNOWN");
                } catch (TagLostException unused) {
                    callback.invoke("mifareClassicReadSector fail: TAG_LOST");
                } catch (Exception e11) {
                    callback.invoke("mifareClassicReadSector fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareClassicSectorToBlock(int i11, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    MifareClassic mifareClassic = (MifareClassic) dVar.d();
                    if (mifareClassic != null && mifareClassic.getType() != -1) {
                        if (i11 >= mifareClassic.getSectorCount()) {
                            callback.invoke(String.format("mifareClassicSectorToBlock fail: invalid sector %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getSectorCount())));
                            return;
                        }
                        callback.invoke(null, Integer.valueOf(mifareClassic.sectorToBlock(i11)));
                    }
                    callback.invoke("mifareClassicSectorToBlock fail: TYPE_UNKNOWN");
                } catch (Exception e11) {
                    callback.invoke("mifareClassicSectorToBlock fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareClassicTransferBlock(int i11, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    MifareClassic mifareClassic = (MifareClassic) dVar.d();
                    if (mifareClassic != null && mifareClassic.getType() != -1) {
                        if (i11 >= mifareClassic.getBlockCount()) {
                            callback.invoke(String.format("mifareClassicTransferBlock fail: invalid block %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getBlockCount())));
                            return;
                        } else {
                            mifareClassic.transfer(i11);
                            callback.invoke(null, Boolean.TRUE);
                        }
                    }
                    callback.invoke("mifareClassicTransferBlock fail: TYPE_UNKNOWN");
                } catch (TagLostException unused) {
                    callback.invoke("mifareClassicTransferBlock fail: TAG_LOST");
                } catch (Exception e11) {
                    callback.invoke("mifareClassicTransferBlock fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareClassicWriteBlock(int i11, ReadableArray readableArray, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    MifareClassic mifareClassic = (MifareClassic) dVar.d();
                    if (mifareClassic != null && mifareClassic.getType() != -1) {
                        if (i11 >= mifareClassic.getBlockCount()) {
                            callback.invoke(String.format("mifareClassicWriteBlock fail: invalid block %d (max %d)", Integer.valueOf(i11), Integer.valueOf(mifareClassic.getBlockCount())));
                            return;
                        } else if (readableArray.size() != 16) {
                            callback.invoke(String.format("mifareClassicWriteBlock fail: invalid block size %d (should be %d)", Integer.valueOf(readableArray.size()), 16));
                            return;
                        } else {
                            mifareClassic.writeBlock(i11, rnArrayToBytes(readableArray));
                            callback.invoke(null, Boolean.TRUE);
                        }
                    }
                    callback.invoke("mifareClassicWriteBlock fail: TYPE_UNKNOWN");
                } catch (TagLostException unused) {
                    callback.invoke("mifareClassicWriteBlock fail: TAG_LOST");
                } catch (Exception e11) {
                    callback.invoke("mifareClassicWriteBlock fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareUltralightReadPages(int i11, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    callback.invoke(null, bytesToRnArray(((MifareUltralight) dVar.d()).readPages(i11)));
                } catch (TagLostException unused) {
                    callback.invoke("mifareUltralight fail: TAG_LOST");
                } catch (Exception e11) {
                    callback.invoke("mifareUltralight fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void mifareUltralightWritePage(int i11, ReadableArray readableArray, Callback callback) {
        synchronized (this) {
            if (this.techRequest != null) {
                try {
                    ((MifareUltralight) this.techRequest.d()).writePage(i11, rnArrayToBytes(readableArray));
                    callback.invoke(new Object[0]);
                } catch (TagLostException unused) {
                    callback.invoke("mifareUltralight fail: TAG_LOST");
                } catch (Exception e11) {
                    callback.invoke("mifareUltralight fail: " + e11);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        Log.d(LOG_TAG, "onActivityResult");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Log.d(LOG_TAG, "onPause");
        this.isResumed = Boolean.FALSE;
        enableDisableForegroundDispatch(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Log.d(LOG_TAG, "onResume");
        this.isResumed = Boolean.TRUE;
        if (this.isForegroundEnabled.booleanValue()) {
            enableDisableForegroundDispatch(true);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        Log.d(LOG_TAG, "onNewIntent " + intent);
        WritableMap nfcIntent = parseNfcIntent(intent);
        if (nfcIntent != null) {
            if (this.isForegroundEnabled.booleanValue()) {
                sendEvent("NfcManagerDiscoverTag", nfcIntent);
            } else {
                sendEvent("NfcManagerDiscoverBackgroundTag", nfcIntent);
                this.bgTag = nfcIntent;
            }
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void requestNdefWrite(ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
        NdefMessage ndefMessage;
        synchronized (this) {
            try {
                if (!this.isForegroundEnabled.booleanValue()) {
                    callback.invoke(ERR_NOT_REGISTERED);
                    return;
                }
                if (hasPendingRequest()) {
                    callback.invoke(ERR_MULTI_REQ);
                } else {
                    boolean z11 = readableMap.getBoolean("format");
                    boolean z12 = readableMap.getBoolean("formatReadOnly");
                    if (z11 && readableArray == null) {
                        ndefMessage = null;
                    } else {
                        try {
                            ndefMessage = new NdefMessage(rnArrayToBytes(readableArray));
                        } catch (FormatException e11) {
                            callback.invoke(e11.toString());
                        }
                    }
                    this.writeNdefRequest = new c(ndefMessage, callback, z11, z12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ReactMethod
    public void requestTechnology(ReadableArray readableArray, Callback callback) {
        synchronized (this) {
            try {
                if (!this.isForegroundEnabled.booleanValue()) {
                    callback.invoke(ERR_NOT_REGISTERED);
                    return;
                }
                if (hasPendingRequest()) {
                    callback.invoke(ERR_MULTI_REQ);
                } else {
                    this.techRequest = new d(readableArray.toArrayList(), callback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactMethod
    public void setTimeout(int i11, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    String strE = dVar.e();
                    TagTechnology tagTechnologyD = this.techRequest.d();
                    switch (strE.hashCode()) {
                        case -2095458966:
                            if (strE.equals("IsoDep")) {
                                ((IsoDep) tagTechnologyD).setTimeout(i11);
                                callback.invoke(new Object[0]);
                                return;
                            }
                            break;
                        case 2424854:
                            if (strE.equals("NfcA")) {
                                ((NfcA) tagTechnologyD).setTimeout(i11);
                                callback.invoke(new Object[0]);
                                return;
                            }
                            break;
                        case 2424859:
                            if (strE.equals("NfcF")) {
                                ((NfcF) tagTechnologyD).setTimeout(i11);
                                callback.invoke(new Object[0]);
                                return;
                            }
                            break;
                        case 850504820:
                            if (strE.equals("MifareUltralight")) {
                                ((MifareUltralight) tagTechnologyD).setTimeout(i11);
                                callback.invoke(new Object[0]);
                                return;
                            }
                            break;
                        case 1621283144:
                            if (strE.equals("MifareClassic")) {
                                ((MifareClassic) tagTechnologyD).setTimeout(i11);
                                callback.invoke(new Object[0]);
                                return;
                            }
                            break;
                    }
                    Log.d(LOG_TAG, "setTimeout not supported");
                    callback.invoke(ERR_API_NOT_SUPPORT);
                } catch (Exception e11) {
                    Log.d(LOG_TAG, e11.toString());
                    callback.invoke(e11.toString());
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void start(Callback callback) {
        if (NfcAdapter.getDefaultAdapter(this.context) == null) {
            Log.d(LOG_TAG, "not support in this device");
            callback.invoke(ERR_NO_NFC_SUPPORT);
            return;
        }
        Log.d(LOG_TAG, "start");
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(ERR_GET_ACTIVITY_FAIL);
            return;
        }
        currentActivity.registerReceiver(this.mReceiver, intentFilter);
        this.bgTag = parseNfcIntent(currentActivity.getIntent());
        callback.invoke(new Object[0]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactMethod
    public void transceive(ReadableArray readableArray, Callback callback) {
        synchronized (this) {
            d dVar = this.techRequest;
            if (dVar != null) {
                try {
                    String strE = dVar.e();
                    byte[] bArrRnArrayToBytes = rnArrayToBytes(readableArray);
                    TagTechnology tagTechnologyD = this.techRequest.d();
                    switch (strE.hashCode()) {
                        case -2095458966:
                            if (strE.equals("IsoDep")) {
                                callback.invoke(null, bytesToRnArray(((IsoDep) tagTechnologyD).transceive(bArrRnArrayToBytes)));
                                return;
                            }
                            break;
                        case 2424854:
                            if (strE.equals("NfcA")) {
                                callback.invoke(null, bytesToRnArray(((NfcA) tagTechnologyD).transceive(bArrRnArrayToBytes)));
                                return;
                            }
                            break;
                        case 2424855:
                            if (strE.equals("NfcB")) {
                                callback.invoke(null, bytesToRnArray(((NfcB) tagTechnologyD).transceive(bArrRnArrayToBytes)));
                                return;
                            }
                            break;
                        case 2424859:
                            if (strE.equals("NfcF")) {
                                callback.invoke(null, bytesToRnArray(((NfcF) tagTechnologyD).transceive(bArrRnArrayToBytes)));
                                return;
                            }
                            break;
                        case 2424875:
                            if (strE.equals("NfcV")) {
                                callback.invoke(null, bytesToRnArray(((NfcV) tagTechnologyD).transceive(bArrRnArrayToBytes)));
                                return;
                            }
                            break;
                        case 850504820:
                            if (strE.equals("MifareUltralight")) {
                                callback.invoke(null, bytesToRnArray(((MifareUltralight) tagTechnologyD).transceive(bArrRnArrayToBytes)));
                                return;
                            }
                            break;
                        case 1621283144:
                            if (strE.equals("MifareClassic")) {
                                callback.invoke(null, bytesToRnArray(((MifareClassic) tagTechnologyD).transceive(bArrRnArrayToBytes)));
                                return;
                            }
                            break;
                    }
                    Log.d(LOG_TAG, "transceive not supported");
                    callback.invoke(ERR_API_NOT_SUPPORT);
                } catch (Exception e11) {
                    Log.d(LOG_TAG, "transceive fail: " + e11);
                    callback.invoke(ERR_TRANSCEIVE_FAIL);
                }
            } else {
                callback.invoke(ERR_NO_TECH_REQ);
            }
        }
    }

    @ReactMethod
    public void writeNdefMessage(ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
        synchronized (this) {
            try {
                boolean z11 = readableMap.getBoolean("reconnectAfterWrite");
                d dVar = this.techRequest;
                if (dVar != null) {
                    try {
                        Ndef ndef = (Ndef) dVar.d();
                        if (ndef == null) {
                            callback.invoke(ERR_API_NOT_SUPPORT);
                        } else {
                            ndef.writeNdefMessage(new NdefMessage(rnArrayToBytes(readableArray)));
                            if (z11) {
                                ndef.close();
                                ndef.connect();
                            }
                            callback.invoke(new Object[0]);
                        }
                    } catch (Exception e11) {
                        Log.d(LOG_TAG, e11.toString());
                        callback.invoke(e11.toString());
                    }
                } else {
                    callback.invoke(ERR_NO_TECH_REQ);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
