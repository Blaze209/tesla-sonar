package com.withpersona.sdk2.reactnative;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.withpersona.sdk2.inquiry.BuildConfig;
import com.withpersona.sdk2.inquiry.ClientThemeSource;
import com.withpersona.sdk2.inquiry.Environment;
import com.withpersona.sdk2.inquiry.Fields;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryBuilder;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.InquiryResponse;
import com.withpersona.sdk2.inquiry.InquiryTemplateBuilder;
import com.withpersona.sdk2.inquiry.OnInquiryEventListener;
import com.withpersona.sdk2.inquiry.ServerThemeSource;
import expo.modules.interfaces.permissions.PermissionsResponse;
import fj0.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import zg0.c;
import zi0.CollectedData;
import zi0.DocumentFile;
import zi0.GovernmentIdCapture;
import zi0.SelfieCapture;
import zi0.g;

/* JADX INFO: loaded from: classes8.dex */
public class PersonaInquiryModule2 extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final String ACCESS_TOKEN = "sessionToken";
    private static final String ACCOUNT_ID = "accountId";
    private static final String ENVIRONMENT = "environment";
    private static final String ENVIRONMENT_ID = "environmentId";
    private static final String FIELDS = "fields";
    private static final String FIELD_ADDITIONAL_FIELDS = "additionalFields";
    private static final String INQUIRY_ID = "inquiryId";
    private static final String LOCALE = "locale";
    private static final int PERSONA_INQUIRY_REQUEST_CODE = 31416;
    private static final String REFERENCE_ID = "referenceId";
    private static final String RETURN_COLLECTED_DATA = "returnCollectedData";
    private static final String TEMPLATE_ID = "templateId";
    private static final String TEMPLATE_VERSION = "templateVersion";
    private static final String THEME_SET_ID = "themeSetId";
    private static final String THEME_SOURCE = "themeSource";
    private final ReactApplicationContext reactContext;

    class a implements OnInquiryEventListener {
        a() {
        }

        @Override // com.withpersona.sdk2.inquiry.OnInquiryEventListener
        public void onEvent(@NonNull c cVar) {
            ReadableMap readableMapInquiryEventToMap;
            DeviceEventManagerModule.RCTDeviceEventEmitter jsModule = PersonaInquiryModule2.this.getJsModule();
            if (jsModule == null || (readableMapInquiryEventToMap = PersonaInquiryModule2.this.inquiryEventToMap(cVar)) == null) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap("event", readableMapInquiryEventToMap);
            jsModule.emit("onEvent", writableMapCreateMap);
        }
    }

    public PersonaInquiryModule2(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
        registerOnInquiryEventListener();
    }

    private ReadableMap collectedDataToMap(CollectedData collectedData) {
        if (collectedData == null) {
            return null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (g gVar : collectedData.c()) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("stepName", gVar.getStepName());
            if (gVar instanceof g.DocumentStepData) {
                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                for (DocumentFile documentFile : ((g.DocumentStepData) gVar).T()) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putString("absoluteFilePath", documentFile.getData().getAbsolutePath());
                    writableArrayCreateArray2.pushMap(writableMapCreateMap3);
                }
                writableMapCreateMap2.putArray("documents", writableArrayCreateArray2);
                writableMapCreateMap2.putString("type", "DocumentStepData");
            } else if (gVar instanceof g.GovernmentIdStepData) {
                WritableArray writableArrayCreateArray3 = Arguments.createArray();
                for (GovernmentIdCapture governmentIdCapture : ((g.GovernmentIdStepData) gVar).T()) {
                    WritableMap writableMapCreateMap4 = Arguments.createMap();
                    writableMapCreateMap4.putString("idClass", governmentIdCapture.getIdClass());
                    writableMapCreateMap4.putString("captureMethod", governmentIdCapture.getCaptureMethod().name());
                    writableMapCreateMap4.putString("side", governmentIdCapture.getSide().name());
                    WritableArray writableArrayCreateArray4 = Arguments.createArray();
                    for (GovernmentIdCapture.Frame frame : governmentIdCapture.G3()) {
                        WritableMap writableMapCreateMap5 = Arguments.createMap();
                        writableMapCreateMap5.putString("absoluteFilePath", frame.getData().getAbsolutePath());
                        writableArrayCreateArray4.pushMap(writableMapCreateMap5);
                    }
                    writableMapCreateMap4.putArray("frames", writableArrayCreateArray4);
                    writableArrayCreateArray3.pushMap(writableMapCreateMap4);
                }
                writableMapCreateMap2.putArray("captures", writableArrayCreateArray3);
                writableMapCreateMap2.putString("type", "GovernmentIdStepData");
            } else if (gVar instanceof g.SelfieStepData) {
                g.SelfieStepData selfieStepData = (g.SelfieStepData) gVar;
                ReadableMap readableMapSelfieCaptureToMap = selfieCaptureToMap(selfieStepData.getCenterCapture());
                ReadableMap readableMapSelfieCaptureToMap2 = selfieCaptureToMap(selfieStepData.getLeftCapture());
                ReadableMap readableMapSelfieCaptureToMap3 = selfieCaptureToMap(selfieStepData.getRightCapture());
                writableMapCreateMap2.putMap("centerCapture", readableMapSelfieCaptureToMap);
                writableMapCreateMap2.putMap("leftCapture", readableMapSelfieCaptureToMap2);
                writableMapCreateMap2.putMap("rightCapture", readableMapSelfieCaptureToMap3);
                writableMapCreateMap2.putString("type", "SelfieStepData");
            } else if (gVar instanceof g.UiStepData) {
                writableMapCreateMap2.putMap("componentParams", uiStepParamsMapToMap(((g.UiStepData) gVar).T()));
                writableMapCreateMap2.putString("type", "UiStepData");
            }
            writableArrayCreateArray.pushMap(writableMapCreateMap2);
        }
        writableMapCreateMap.putArray("stepData", writableArrayCreateArray);
        return writableMapCreateMap;
    }

    private Environment environmentFromString(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("production")) {
            return Environment.PRODUCTION;
        }
        if (str.equals("sandbox")) {
            return Environment.SANDBOX;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceEventManagerModule.RCTDeviceEventEmitter getJsModule() {
        try {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReadableMap inquiryEventToMap(@NonNull c cVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (cVar instanceof c.StartEvent) {
            c.StartEvent startEvent = (c.StartEvent) cVar;
            writableMapCreateMap.putString("type", "start");
            writableMapCreateMap.putString(INQUIRY_ID, startEvent.getInquiryId());
            writableMapCreateMap.putString(ACCESS_TOKEN, startEvent.getSessionToken());
            return writableMapCreateMap;
        }
        if (!(cVar instanceof c.PageChange)) {
            return null;
        }
        c.PageChange pageChange = (c.PageChange) cVar;
        writableMapCreateMap.putString("type", "page_change");
        writableMapCreateMap.putString("name", pageChange.getName());
        writableMapCreateMap.putString("path", pageChange.getPath());
        return writableMapCreateMap;
    }

    private void registerOnInquiryEventListener() {
        Inquiry.INSTANCE.setOnEventListener(new a());
    }

    private ReadableMap selfieCaptureToMap(SelfieCapture selfieCapture) {
        if (selfieCapture == null) {
            return null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("captureMethod", selfieCapture.getCaptureMethod().name());
        writableMapCreateMap.putString("absoluteFilePath", selfieCapture.getData().getAbsolutePath());
        return writableMapCreateMap;
    }

    private ReadableArray uiStepParamsArrToArr(List<?> list) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (Object obj : list) {
            if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Number) {
                writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
            }
        }
        return writableArrayCreateArray;
    }

    private ReadableMap uiStepParamsMapToMap(Map<?, ?> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                String str = (String) key;
                if (value instanceof Map) {
                    writableMapCreateMap.putMap(str, uiStepParamsMapToMap((Map) value));
                } else if (value instanceof List) {
                    writableMapCreateMap.putArray(str, uiStepParamsArrToArr((List) value));
                } else if (value instanceof String) {
                    writableMapCreateMap.putString(str, (String) value);
                } else if (value instanceof Boolean) {
                    writableMapCreateMap.putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Number) {
                    writableMapCreateMap.putDouble(str, ((Double) value).doubleValue());
                }
            }
        }
        return writableMapCreateMap;
    }

    private static ReadableMap wrapField(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", str);
        writableMapCreateMap.putString("value", str2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("INQUIRY_SDK_VERSION", BuildConfig.INQUIRY_SDK_VERSION);
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "PersonaInquiry2";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        if (i11 == PERSONA_INQUIRY_REQUEST_CODE) {
            InquiryResponse inquiryResponseOnActivityResult = Inquiry.onActivityResult(intent);
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
            if (!(inquiryResponseOnActivityResult instanceof InquiryResponse.Complete)) {
                if (inquiryResponseOnActivityResult instanceof InquiryResponse.Cancel) {
                    InquiryResponse.Cancel cancel = (InquiryResponse.Cancel) inquiryResponseOnActivityResult;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString(INQUIRY_ID, cancel.getInquiryId());
                    writableMapCreateMap.putString(ACCESS_TOKEN, cancel.getSessionToken());
                    rCTDeviceEventEmitter.emit("onCanceled", writableMapCreateMap);
                    return;
                }
                if (inquiryResponseOnActivityResult instanceof InquiryResponse.Error) {
                    InquiryResponse.Error error = (InquiryResponse.Error) inquiryResponseOnActivityResult;
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putString("debugMessage", error.getDebugMessage());
                    writableMapCreateMap2.putString("errorCode", error.getErrorCode().name());
                    rCTDeviceEventEmitter.emit("onError", writableMapCreateMap2);
                    return;
                }
                return;
            }
            InquiryResponse.Complete complete = (InquiryResponse.Complete) inquiryResponseOnActivityResult;
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            writableMapCreateMap3.putString(INQUIRY_ID, complete.getInquiryId());
            writableMapCreateMap3.putString(PermissionsResponse.STATUS_KEY, complete.getStatus());
            WritableMap writableMapCreateMap4 = Arguments.createMap();
            Map<String, InquiryField> fields = complete.getFields();
            for (String str : fields.keySet()) {
                InquiryField inquiryField = fields.get(str);
                if (inquiryField instanceof InquiryField.StringField) {
                    writableMapCreateMap4.putMap(str, wrapField(com.withpersona.sdk2.inquiry.network.dto.InquiryField.StringField.TYPE, ((InquiryField.StringField) inquiryField).getValue()));
                } else if (inquiryField instanceof InquiryField.IntegerField) {
                    Integer value = ((InquiryField.IntegerField) inquiryField).getValue();
                    writableMapCreateMap4.putMap(str, wrapField(com.withpersona.sdk2.inquiry.network.dto.InquiryField.IntegerField.TYPE, value != null ? value.toString() : null));
                } else if (inquiryField instanceof InquiryField.BooleanField) {
                    Boolean value2 = ((InquiryField.BooleanField) inquiryField).getValue();
                    writableMapCreateMap4.putMap(str, wrapField(com.withpersona.sdk2.inquiry.network.dto.InquiryField.BooleanField.TYPE, value2 != null ? value2.toString() : null));
                } else if (inquiryField instanceof InquiryField.UnknownField) {
                    writableMapCreateMap4.putMap(str, wrapField("unknown", ((InquiryField.UnknownField) inquiryField).getType()));
                } else {
                    writableMapCreateMap4.putMap(str, wrapField("unknown", null));
                }
            }
            writableMapCreateMap3.putMap(FIELDS, writableMapCreateMap4);
            writableMapCreateMap3.putMap("collectedData", collectedDataToMap(complete.getCollectedData()));
            rCTDeviceEventEmitter.emit("onComplete", writableMapCreateMap3);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void startInquiry(ReadableMap readableMap) {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        String string = readableMap.hasKey(INQUIRY_ID) ? readableMap.getString(INQUIRY_ID) : null;
        String string2 = readableMap.hasKey(TEMPLATE_ID) ? readableMap.getString(TEMPLATE_ID) : null;
        String string3 = readableMap.hasKey(TEMPLATE_VERSION) ? readableMap.getString(TEMPLATE_VERSION) : null;
        if (string != null) {
            InquiryBuilder inquiryBuilderFromInquiry = Inquiry.fromInquiry(string);
            String string4 = readableMap.hasKey(THEME_SOURCE) ? readableMap.getString(THEME_SOURCE) : null;
            InquiryBuilder inquiryBuilderTheme = inquiryBuilderFromInquiry.theme((string4 == null || !string4.equals("server")) ? new ClientThemeSource(Integer.valueOf(b.f66017a)) : new ServerThemeSource(Integer.valueOf(b.f66017a)));
            String string5 = readableMap.hasKey(ACCESS_TOKEN) ? readableMap.getString(ACCESS_TOKEN) : null;
            if (string5 != null) {
                inquiryBuilderTheme = inquiryBuilderTheme.sessionToken(string5);
            }
            String string6 = readableMap.hasKey(LOCALE) ? readableMap.getString(LOCALE) : null;
            if (string6 != null) {
                inquiryBuilderTheme = inquiryBuilderTheme.locale(string6);
            }
            if (currentActivity != null) {
                inquiryBuilderTheme.build().start(currentActivity, PERSONA_INQUIRY_REQUEST_CODE);
            }
        }
        if (string2 == null && string3 == null) {
            return;
        }
        InquiryTemplateBuilder inquiryTemplateBuilderFromTemplate = string2 != null ? Inquiry.fromTemplate(string2) : Inquiry.fromTemplateVersion(string3);
        String string7 = readableMap.hasKey(THEME_SOURCE) ? readableMap.getString(THEME_SOURCE) : null;
        InquiryTemplateBuilder inquiryTemplateBuilderTheme = inquiryTemplateBuilderFromTemplate.theme((string7 == null || !string7.equals("server")) ? new ClientThemeSource(Integer.valueOf(b.f66017a)) : new ServerThemeSource(Integer.valueOf(b.f66017a)));
        String string8 = readableMap.hasKey(REFERENCE_ID) ? readableMap.getString(REFERENCE_ID) : null;
        if (string8 != null) {
            inquiryTemplateBuilderTheme = inquiryTemplateBuilderTheme.referenceId(string8);
        }
        String string9 = readableMap.hasKey(ACCOUNT_ID) ? readableMap.getString(ACCOUNT_ID) : null;
        if (string9 != null) {
            inquiryTemplateBuilderTheme = inquiryTemplateBuilderTheme.accountId(string9);
        }
        Environment environmentEnvironmentFromString = environmentFromString(readableMap.hasKey("environment") ? readableMap.getString("environment") : null);
        if (environmentEnvironmentFromString != null) {
            inquiryTemplateBuilderTheme = inquiryTemplateBuilderTheme.environment(environmentEnvironmentFromString);
        }
        String string10 = readableMap.hasKey(ENVIRONMENT_ID) ? readableMap.getString(ENVIRONMENT_ID) : null;
        if (string10 != null) {
            inquiryTemplateBuilderTheme = inquiryTemplateBuilderTheme.environmentId(string10);
        }
        String string11 = readableMap.hasKey(THEME_SET_ID) ? readableMap.getString(THEME_SET_ID) : null;
        if (string11 != null) {
            inquiryTemplateBuilderTheme = inquiryTemplateBuilderTheme.themeSetId(string11);
        }
        String string12 = readableMap.hasKey(LOCALE) ? readableMap.getString(LOCALE) : null;
        if (string12 != null) {
            inquiryTemplateBuilderTheme = inquiryTemplateBuilderTheme.locale(string12);
        }
        ReadableMap map = readableMap.hasKey(FIELDS) ? readableMap.getMap(FIELDS) : null;
        if (map != null) {
            Fields.Builder builder = new Fields.Builder();
            for (Map.Entry<String, Object> entry : map.toHashMap().entrySet()) {
                String key = entry.getKey();
                Map map2 = (Map) entry.getValue();
                String str = (String) map2.get("type");
                Object obj = map2.get("value");
                if (obj != null) {
                    if (Objects.equals(str, com.withpersona.sdk2.inquiry.network.dto.InquiryField.StringField.TYPE)) {
                        builder.field(key, (String) obj);
                    } else if (Objects.equals(str, com.withpersona.sdk2.inquiry.network.dto.InquiryField.IntegerField.TYPE)) {
                        builder.field(key, ((Double) obj).intValue());
                    } else if (Objects.equals(str, com.withpersona.sdk2.inquiry.network.dto.InquiryField.BooleanField.TYPE)) {
                        builder.field(key, ((Boolean) obj).booleanValue());
                    }
                }
            }
            inquiryTemplateBuilderTheme = inquiryTemplateBuilderTheme.fields(builder.build());
        }
        Boolean boolValueOf = readableMap.hasKey(RETURN_COLLECTED_DATA) ? Boolean.valueOf(readableMap.getBoolean(RETURN_COLLECTED_DATA)) : null;
        if (boolValueOf != null) {
            inquiryTemplateBuilderTheme = inquiryTemplateBuilderTheme.returnCollectedData(boolValueOf.booleanValue());
        }
        if (currentActivity != null) {
            inquiryTemplateBuilderTheme.build().start(currentActivity, PERSONA_INQUIRY_REQUEST_CODE);
        }
    }
}
