package com.tesla.TeslaV4.reactnative.module;

import android.content.SharedPreferences;
import android.util.Pair;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceStorageModule extends ReactContextBaseJavaModule {
    private static final String ERROR_NO_VALUE = "ERROR_NO_VALUE";
    private static final String ERROR_UNABLE_TO_CREATE = "ERROR_UNABLE_TO_CREATE";
    private static final String ERROR_UNABLE_TO_DELETE = "ERROR_UNABLE_TO_DELETE";
    private static final String IDENTIFIER = "identifier";
    private static final String NO_ERROR = "NO_ERROR";
    private static final String REACT_CLASS = "TMDeviceStorageAccess";
    private static final String RESULT = "result";
    private static final String TAG = "DeviceStorageModule";
    private static final String VALUE = "value";
    private final com.tesla.logging.g logger;
    private final SharedPreferences mLegacyNonSecurePrefs;
    private final SharedPreferences mLegacySecurePrefs;

    public DeviceStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.logger = com.tesla.logging.g.h(TAG);
        this.mLegacySecurePrefs = qb0.c.g(reactApplicationContext);
        this.mLegacyNonSecurePrefs = qb0.c.b(reactApplicationContext);
    }

    private WritableMap genResult(boolean z11, String str, String str2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (!z11) {
            str = str2;
        }
        writableNativeMap.putString(RESULT, str);
        return writableNativeMap;
    }

    private static List<String> getStrFromArray(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray != null) {
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                arrayList.add(readableArray.getString(i11));
            }
        }
        return arrayList;
    }

    private void incrementRealmSet() {
        kd0.e.f().a(nc0.h.REALM_SET, 1L);
    }

    @ReactMethod
    public void clearValuesExcept(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        incrementRealmSet();
        promise.resolve(genResult(td0.m.j().e(getStrFromArray(readableArray), getStrFromArray(readableArray2)), NO_ERROR, ERROR_UNABLE_TO_DELETE));
    }

    @ReactMethod
    public void deleteValues(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        incrementRealmSet();
        promise.resolve(genResult(td0.m.j().s(getStrFromArray(readableArray), getStrFromArray(readableArray2)), NO_ERROR, ERROR_UNABLE_TO_DELETE));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void retrieveValues(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) throws Throwable {
        kd0.e.f().a(nc0.h.REALM_GET, 1L);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        List<String> strFromArray = getStrFromArray(readableArray);
        List<Pair<String, String>> listI = td0.m.j().i(strFromArray, getStrFromArray(readableArray2));
        HashSet hashSet = new HashSet();
        for (Pair<String, String> pair : listI) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(IDENTIFIER, (String) pair.first);
            writableNativeMap.putString("value", (String) pair.second);
            writableNativeMap.putString(RESULT, NO_ERROR);
            hashSet.add((String) pair.first);
            writableArrayCreateArray.pushMap(writableNativeMap);
        }
        for (String str : strFromArray) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            if (!hashSet.contains(str)) {
                writableNativeMap2.putString(IDENTIFIER, str);
                writableNativeMap2.putString(RESULT, ERROR_NO_VALUE);
            }
            writableArrayCreateArray.pushMap(writableNativeMap2);
        }
        promise.resolve(writableArrayCreateArray);
    }

    @ReactMethod
    public void storeValues(ReadableMap readableMap, Promise promise) {
        incrementRealmSet();
        promise.resolve(genResult(readableMap == null || td0.m.j().t(Arguments.toBundle(readableMap)), NO_ERROR, ERROR_UNABLE_TO_CREATE));
    }
}
