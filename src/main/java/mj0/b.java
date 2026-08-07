package mj0;

import android.app.Activity;
import android.content.Intent;
import android.icu.number.NumberFormatter;
import android.icu.util.MeasureUnit;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.core.os.LocaleListCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010 J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u001dJ\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u001aJ\u0015\u0010(\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b+\u0010)J\u0015\u0010,\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b,\u0010)J\u001d\u00100\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102¨\u00065"}, d2 = {"Lmj0/b;", "", "<init>", "()V", "", "languageCode", "scriptCode", "countryCode", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Locale;)Ljava/lang/String;", "f", "kotlin.jvm.PlatformType", "g", "k", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "l", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Locale;", "", "m", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "c", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableArray;", "e", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/WritableArray;", "h", "Lcom/facebook/react/bridge/WritableMap;", "j", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/WritableMap;", "n", "o", "", "q", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z", "t", "r", "s", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "p", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/bridge/Promise;)V", "Ljava/util/List;", "USES_FAHRENHEIT", "USES_IMPERIAL", "react-native-localize_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f92268a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> USES_FAHRENHEIT = v.p("BS", "BZ", "KY", "PR", "PW", "US");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final List<String> USES_IMPERIAL = v.p("LR", "MM", "US");

    private b() {
    }

    private final String a(String languageCode, String scriptCode, String countryCode) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(languageCode);
        if (scriptCode.length() > 0) {
            sb2.append("-" + scriptCode);
        }
        sb2.append("-" + countryCode);
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    private final String d(Locale locale) {
        try {
            String country = locale.getCountry();
            if (s.f(country, "419")) {
                return "UN";
            }
            s.h(country);
            if (country.length() > 0) {
                Locale locale2 = Locale.getDefault();
                s.j(locale2, "getDefault(...)");
                String upperCase = country.toUpperCase(locale2);
                s.j(upperCase, "toUpperCase(...)");
                return upperCase;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final String f(Locale locale) {
        String currencyCode;
        try {
            Currency currency = Currency.getInstance(locale);
            return (currency == null || (currencyCode = currency.getCurrencyCode()) == null) ? "" : currencyCode;
        } catch (Exception unused) {
        }
    }

    private final String g(Locale locale) {
        String language = locale.getLanguage();
        if (language == null) {
            return language;
        }
        int iHashCode = language.hashCode();
        if (iHashCode == 3365) {
            return !language.equals("in") ? language : "id";
        }
        if (iHashCode != 3374) {
            return (iHashCode == 3391 && language.equals("ji")) ? "yi" : language;
        }
        return !language.equals("iw") ? language : "he";
    }

    private final String i() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, "ro.miui.region");
            Objects.requireNonNull(objInvoke);
            s.i(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Exception unused) {
            return "";
        }
    }

    private final String k(Locale locale) {
        String script = locale.getScript();
        return script.length() == 0 ? "" : script;
    }

    private final Locale l(ReactApplicationContext reactContext) {
        Locale locale = reactContext.getResources().getConfiguration().getLocales().get(0);
        s.j(locale, "get(...)");
        return locale;
    }

    private final List<Locale> m(ReactApplicationContext reactContext) {
        reactContext.getResources().getConfiguration();
        LocaleListCompat localeListCompatE = LocaleListCompat.e();
        s.j(localeListCompatE, "getDefault(...)");
        int iH = localeListCompatE.h();
        ArrayList arrayList = new ArrayList(iH);
        for (int i11 = 0; i11 < iH; i11++) {
            Locale localeC = localeListCompatE.c(i11);
            s.h(localeC);
            arrayList.add(localeC);
        }
        return arrayList;
    }

    public final String b() {
        return "gregorian";
    }

    public final String c(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        String strI = i();
        String strD = d(l(reactContext));
        if (strI.length() > 0) {
            return strI;
        }
        return strD.length() == 0 ? "US" : strD;
    }

    public final WritableArray e(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        List<Locale> listM = m(reactContext);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            String strF = f92268a.f((Locale) it.next());
            if (strF.length() > 0 && linkedHashSet.add(strF)) {
                writableArrayCreateArray.pushString(strF);
            }
        }
        if (writableArrayCreateArray.size() == 0) {
            writableArrayCreateArray.pushString("USD");
        }
        s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    public final WritableArray h(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        List<Locale> listM = m(reactContext);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        String strC = c(reactContext);
        for (Locale locale : listM) {
            String strG = g(locale);
            String strK = k(locale);
            String strD = d(locale);
            if (strD.length() == 0) {
                strD = strC;
            }
            s.h(strG);
            s.h(strK);
            String strA = a(strG, strK, strD);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("languageCode", strG);
            writableMapCreateMap.putString("countryCode", strD);
            writableMapCreateMap.putString("languageTag", strA);
            writableMapCreateMap.putBoolean("isRTL", TextUtils.getLayoutDirectionFromLocale(locale) == 1);
            if (strK.length() > 0) {
                writableMapCreateMap.putString("scriptCode", strK);
            }
            if (linkedHashSet.add(strA)) {
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
        }
        s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    public final WritableMap j(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(l(reactContext));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
        writableMapCreateMap.putString("groupingSeparator", String.valueOf(decimalFormatSymbols.getGroupingSeparator()));
        s.j(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    public final String n(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        if (Build.VERSION.SDK_INT < 33) {
            return USES_FAHRENHEIT.contains(c(reactContext)) ? "fahrenheit" : "celsius";
        }
        String identifier = a.a(a.a(NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(l(reactContext)).format(1L).getOutputUnit().getIdentifier();
        s.h(identifier);
        return t.b0(identifier, "fahrenhe", false, 2, null) ? "fahrenheit" : "celsius";
    }

    public final String o() {
        String id2 = TimeZone.getDefault().getID();
        s.j(id2, "getID(...)");
        return id2;
    }

    public final void p(ReactApplicationContext reactContext, Promise promise) {
        s.k(reactContext, "reactContext");
        s.k(promise, "promise");
        if (Build.VERSION.SDK_INT < 33) {
            promise.reject("unsupported", "openAppLanguageSettings is supported only on Android 13+");
            return;
        }
        try {
            String packageName = reactContext.getPackageName();
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_LOCALE_SETTINGS");
            intent.setData(Uri.fromParts("package", packageName, null));
            Activity currentActivity = reactContext.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e11) {
            promise.reject("E_INVALID_ACTIVITY", e11);
        }
    }

    public final boolean q(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        return DateFormat.is24HourFormat(reactContext);
    }

    public final boolean r(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        return Settings.Global.getInt(reactContext.getContentResolver(), "auto_time", 0) != 0;
    }

    public final boolean s(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        return Settings.Global.getInt(reactContext.getContentResolver(), "auto_time_zone", 0) != 0;
    }

    public final boolean t(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        return !USES_IMPERIAL.contains(c(reactContext));
    }
}
