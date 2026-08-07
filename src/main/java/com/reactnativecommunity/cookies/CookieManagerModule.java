package com.reactnativecommunity.cookies;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import expo.modules.interfaces.permissions.PermissionsResponse;
import j$.util.DesugarTimeZone;
import java.net.HttpCookie;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class CookieManagerModule extends ReactContextBaseJavaModule {
    private static final String CLEAR_BY_NAME_NOT_SUPPORTED = "Cannot remove a single cookie by name on Android";
    private static final String GET_ALL_NOT_SUPPORTED = "Get all cookies not supported for Android (iOS only)";
    private static final String INVALID_COOKIE_VALUES = "Unable to add cookie - invalid values";
    private static final String INVALID_DOMAINS = "Cookie URL host %s and domain %s mismatched. The cookie won't set correctly.";
    private static final String INVALID_URL_MISSING_HTTP = "Invalid URL: It may be missing a protocol (ex. http:// or https://).";
    private CookieSyncManager mCookieSyncManager;
    private static final boolean USES_LEGACY_STORE = false;
    private static final boolean HTTP_ONLY_SUPPORTED = true;

    class a implements ValueCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48480a;

        a(Promise promise) {
            this.f48480a = promise;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            this.f48480a.resolve(bool);
        }
    }

    class b implements ValueCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48482a;

        b(Promise promise) {
            this.f48482a = promise;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            this.f48482a.resolve(bool);
        }
    }

    class c implements ValueCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48484a;

        c(Promise promise) {
            this.f48484a = promise;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            this.f48484a.resolve(bool);
        }
    }

    CookieManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCookieSyncManager = CookieSyncManager.createInstance(reactApplicationContext);
    }

    private DateFormat RFC1123dateFormatter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private void addCookies(String str, String str2, Promise promise) {
        try {
            CookieManager cookieManager = getCookieManager();
            if (!USES_LEGACY_STORE) {
                cookieManager.setCookie(str, str2, new c(promise));
                cookieManager.flush();
            } else {
                cookieManager.setCookie(str, str2);
                this.mCookieSyncManager.sync();
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    private WritableMap createCookieData(HttpCookie httpCookie) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", httpCookie.getName());
        writableMapCreateMap.putString("value", httpCookie.getValue());
        writableMapCreateMap.putString("domain", httpCookie.getDomain());
        writableMapCreateMap.putString("path", httpCookie.getPath());
        writableMapCreateMap.putBoolean("secure", httpCookie.getSecure());
        if (HTTP_ONLY_SUPPORTED) {
            writableMapCreateMap.putBoolean("httpOnly", httpCookie.isHttpOnly());
        }
        long maxAge = httpCookie.getMaxAge();
        if (maxAge > 0) {
            String date = formatDate(new Date(maxAge));
            if (!isEmpty(date)) {
                writableMapCreateMap.putString(PermissionsResponse.EXPIRES_KEY, date);
            }
        }
        return writableMapCreateMap;
    }

    private WritableMap createCookieList(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (!isEmpty(str)) {
            for (String str2 : str.split(";")) {
                for (HttpCookie httpCookie : HttpCookie.parse(str2)) {
                    if (httpCookie != null) {
                        String name = httpCookie.getName();
                        String value = httpCookie.getValue();
                        if (!isEmpty(name) && !isEmpty(value)) {
                            writableMapCreateMap.putMap(name, createCookieData(httpCookie));
                        }
                    }
                }
            }
        }
        return writableMapCreateMap;
    }

    private DateFormat dateFormatter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private String formatDate(Date date) {
        return formatDate(date, false);
    }

    private CookieManager getCookieManager() throws Exception {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            return cookieManager;
        } catch (Exception e11) {
            throw new Exception(e11);
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private HttpCookie makeHTTPCookieObject(String str, ReadableMap readableMap) throws Exception {
        Date date;
        try {
            String host = new URL(str).getHost();
            if (isEmpty(host)) {
                throw new Exception(INVALID_URL_MISSING_HTTP);
            }
            HttpCookie httpCookie = new HttpCookie(readableMap.getString("name"), readableMap.getString("value"));
            if (!readableMap.hasKey("domain") || isEmpty(readableMap.getString("domain"))) {
                httpCookie.setDomain(host);
            } else {
                String string = readableMap.getString("domain");
                if (string.startsWith(".")) {
                    string = string.substring(1);
                }
                if (!host.contains(string) && !host.equals(string)) {
                    throw new Exception(String.format(INVALID_DOMAINS, host, string));
                }
                httpCookie.setDomain(string);
            }
            if (readableMap.hasKey("path") && !isEmpty(readableMap.getString("path"))) {
                httpCookie.setPath(readableMap.getString("path"));
            }
            if (readableMap.hasKey(PermissionsResponse.EXPIRES_KEY) && !isEmpty(readableMap.getString(PermissionsResponse.EXPIRES_KEY)) && (date = parseDate(readableMap.getString(PermissionsResponse.EXPIRES_KEY))) != null) {
                httpCookie.setMaxAge(date.getTime());
            }
            if (readableMap.hasKey("secure") && readableMap.getBoolean("secure")) {
                httpCookie.setSecure(true);
            }
            if (HTTP_ONLY_SUPPORTED && readableMap.hasKey("httpOnly") && readableMap.getBoolean("httpOnly")) {
                httpCookie.setHttpOnly(true);
            }
            return httpCookie;
        } catch (Exception unused) {
            throw new Exception(INVALID_URL_MISSING_HTTP);
        }
    }

    private Date parseDate(String str) {
        return parseDate(str, false);
    }

    private String toRFC6265string(HttpCookie httpCookie) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(httpCookie.getName());
        sb2.append('=');
        sb2.append(httpCookie.getValue());
        if (!httpCookie.hasExpired()) {
            long maxAge = httpCookie.getMaxAge();
            if (maxAge > 0) {
                String date = formatDate(new Date(maxAge), true);
                if (!isEmpty(date)) {
                    sb2.append("; expires=");
                    sb2.append(date);
                }
            }
        }
        if (!isEmpty(httpCookie.getDomain())) {
            sb2.append("; domain=");
            sb2.append(httpCookie.getDomain());
        }
        if (!isEmpty(httpCookie.getPath())) {
            sb2.append("; path=");
            sb2.append(httpCookie.getPath());
        }
        if (httpCookie.getSecure()) {
            sb2.append("; secure");
        }
        if (HTTP_ONLY_SUPPORTED && httpCookie.isHttpOnly()) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    @ReactMethod
    public void clearAll(Boolean bool, Promise promise) {
        try {
            CookieManager cookieManager = getCookieManager();
            if (!USES_LEGACY_STORE) {
                cookieManager.removeAllCookies(new b(promise));
                cookieManager.flush();
            } else {
                cookieManager.removeAllCookie();
                cookieManager.removeSessionCookie();
                this.mCookieSyncManager.sync();
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod
    public void clearByName(String str, String str2, Boolean bool, Promise promise) {
        promise.reject(new Exception(CLEAR_BY_NAME_NOT_SUPPORTED));
    }

    @ReactMethod
    public void flush(Promise promise) {
        try {
            getCookieManager().flush();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod
    public void get(String str, Boolean bool, Promise promise) {
        if (isEmpty(str)) {
            promise.reject(new Exception(INVALID_URL_MISSING_HTTP));
            return;
        }
        try {
            promise.resolve(createCookieList(getCookieManager().getCookie(str)));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod
    public void getAll(Boolean bool, Promise promise) {
        promise.reject(new Exception(GET_ALL_NOT_SUPPORTED));
    }

    @ReactMethod
    public void getFromResponse(String str, Promise promise) {
        promise.resolve(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCookieManagerAndroid";
    }

    @ReactMethod
    public void removeSessionCookies(Promise promise) {
        try {
            getCookieManager().removeSessionCookies(new a(promise));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod
    public void set(String str, ReadableMap readableMap, Boolean bool, Promise promise) {
        try {
            String rFC6265string = toRFC6265string(makeHTTPCookieObject(str, readableMap));
            if (rFC6265string == null) {
                promise.reject(new Exception(INVALID_COOKIE_VALUES));
            } else {
                addCookies(str, rFC6265string, promise);
            }
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod
    public void setFromResponse(String str, String str2, Promise promise) {
        if (str2 == null) {
            promise.reject(new Exception(INVALID_COOKIE_VALUES));
        } else {
            addCookies(str, str2, promise);
        }
    }

    private String formatDate(Date date, boolean z11) {
        try {
            return (z11 ? RFC1123dateFormatter() : dateFormatter()).format(date);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "Unable to format date";
            }
            Log.i("Cookies", message);
            return null;
        }
    }

    private Date parseDate(String str, boolean z11) {
        try {
            return (z11 ? RFC1123dateFormatter() : dateFormatter()).parse(str);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "Unable to parse date";
            }
            Log.i("Cookies", message);
            return null;
        }
    }
}
