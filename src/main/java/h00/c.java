package h00;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;
import com.proyecto26.inappbrowser.ChromeTabsManagerActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import wq0.l;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f70149e = Pattern.compile("^.+:.+/");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static c f70150f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Promise f70151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f70152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f70153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.browser.customtabs.c f70154d;

    class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f70155a;

        a(Context context) {
            this.f70155a = context;
        }

        @Override // androidx.browser.customtabs.e
        public void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull androidx.browser.customtabs.c cVar) {
            c.this.f70154d = cVar;
            if (!c.this.f70154d.g(0L)) {
                System.err.println("Couldn't warmup custom tabs client");
            }
            this.f70155a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c.this.f70154d = null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70157a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f70157a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private String e(Context context) {
        List<ResolveInfo> listG = g(context);
        String strC = androidx.browser.customtabs.c.c(context, Arrays.asList("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome"));
        return (strC != null || listG == null || listG.size() <= 0) ? strC : listG.get(0).serviceInfo.packageName;
    }

    public static c f() {
        if (f70150f == null) {
            f70150f = new c();
        }
        return f70150f;
    }

    private List<ResolveInfo> g(Context context) {
        return context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
    }

    private void l() {
        if (wq0.c.c().j(this)) {
            return;
        }
        wq0.c.c().p(this);
    }

    private int m(Context context, String str) {
        return f70149e.matcher(str).find() ? context.getResources().getIdentifier(str, null, null) : context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    private Boolean o(int i11) {
        return Boolean.valueOf(k5.d.e(i11) > 0.5d);
    }

    private void p() {
        if (wq0.c.c().j(this)) {
            wq0.c.c().r(this);
        }
    }

    void c(Context context, androidx.browser.customtabs.d.C0067d c0067d, ReadableMap readableMap) {
        int iM = readableMap.hasKey("startEnter") ? m(context, readableMap.getString("startEnter")) : -1;
        int iM2 = readableMap.hasKey("startExit") ? m(context, readableMap.getString("startExit")) : -1;
        int iM3 = readableMap.hasKey("endEnter") ? m(context, readableMap.getString("endEnter")) : -1;
        int iM4 = readableMap.hasKey("endExit") ? m(context, readableMap.getString("endExit")) : -1;
        if (iM != -1 && iM2 != -1) {
            c0067d.l(context, iM, iM2);
        }
        if (iM3 == -1 || iM4 == -1) {
            return;
        }
        c0067d.f(context, iM3, iM4);
    }

    public void d() {
        Promise promise = this.f70151a;
        if (promise == null) {
            return;
        }
        if (this.f70153c == null) {
            promise.reject("InAppBrowser", "No activity");
            this.f70151a = null;
            return;
        }
        p();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", "dismiss");
        this.f70151a.resolve(writableMapCreateMap);
        this.f70151a = null;
        Activity activity = this.f70153c;
        activity.startActivity(ChromeTabsManagerActivity.b(activity));
    }

    public void h(Context context, Promise promise) {
        List<ResolveInfo> listG = g(context);
        promise.resolve(Boolean.valueOf((listG == null || listG.isEmpty()) ? false : true));
    }

    public void i(String str, ReadableArray readableArray) {
        f fVarE;
        androidx.browser.customtabs.c cVar = this.f70154d;
        if (cVar == null || (fVarE = cVar.e(new androidx.browser.customtabs.b())) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            if (string != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(string));
                arrayList.add(bundle);
            }
        }
        fVarE.c(Uri.parse(str), null, arrayList);
    }

    public void j(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        a aVar = new a(applicationContext);
        String strE = e(applicationContext);
        if (strE != null) {
            androidx.browser.customtabs.c.a(applicationContext, strE, aVar);
        } else {
            System.err.println("No browser supported to bind custom tab service");
        }
    }

    public void k(Context context, ReadableMap readableMap, Promise promise, Activity activity) {
        ReadableMap map;
        String string = readableMap.getString(ImagesContract.URL);
        this.f70153c = activity;
        if (this.f70151a != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("type", "cancel");
            this.f70151a.resolve(writableMapCreateMap);
            this.f70151a = null;
            return;
        }
        this.f70151a = promise;
        if (activity == null) {
            promise.reject("InAppBrowser", "No activity");
            this.f70151a = null;
            return;
        }
        androidx.browser.customtabs.d.C0067d c0067d = new androidx.browser.customtabs.d.C0067d();
        this.f70152b = Boolean.FALSE;
        Integer numN = n(c0067d, readableMap, "toolbarColor", "setToolbarColor", "toolbar");
        if (numN != null) {
            this.f70152b = o(numN.intValue());
        }
        n(c0067d, readableMap, "secondaryToolbarColor", "setSecondaryToolbarColor", "secondary toolbar");
        n(c0067d, readableMap, "navigationBarColor", "setNavigationBarColor", "navigation bar");
        n(c0067d, readableMap, "navigationBarDividerColor", "setNavigationBarDividerColor", "navigation bar divider");
        if (readableMap.hasKey("enableDefaultShare") && readableMap.getBoolean("enableDefaultShare")) {
            c0067d.a();
        }
        if (readableMap.hasKey("animations")) {
            c(context, c0067d, readableMap.getMap("animations"));
        }
        if (readableMap.hasKey("hasBackButton") && readableMap.getBoolean("hasBackButton")) {
            c0067d.c(BitmapFactory.decodeResource(context.getResources(), this.f70152b.booleanValue() ? h00.b.f70147a : h00.b.f70148b));
        }
        androidx.browser.customtabs.d dVarB = c0067d.b();
        Intent intent = dVarB.f2960a;
        if (readableMap.hasKey("headers") && (map = readableMap.getMap("headers")) != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            if (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                Bundle bundle = new Bundle();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    if (b.f70157a[map.getType(strNextKey).ordinal()] == 1) {
                        bundle.putString(strNextKey, map.getString(strNextKey));
                    }
                }
                intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        if (readableMap.hasKey("forceCloseOnRedirection") && readableMap.getBoolean("forceCloseOnRedirection")) {
            intent.addFlags(268435456);
        }
        if (!readableMap.hasKey("showInRecents") || !readableMap.getBoolean("showInRecents")) {
            intent.addFlags(8388608);
            intent.addFlags(1073741824);
        }
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", readableMap.hasKey("enableUrlBarHiding") && readableMap.getBoolean("enableUrlBarHiding"));
        try {
            if (readableMap.hasKey("browserPackage")) {
                String string2 = readableMap.getString("browserPackage");
                if (!TextUtils.isEmpty(string2)) {
                    intent.setPackage(string2);
                }
            } else {
                intent.setPackage(e(this.f70153c));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        l();
        intent.setData(Uri.parse(string));
        if (readableMap.hasKey("showTitle")) {
            c0067d.k(readableMap.getBoolean("showTitle"));
        } else {
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        }
        if (readableMap.hasKey("includeReferrer") && readableMap.getBoolean("includeReferrer")) {
            intent.putExtra("android.intent.extra.REFERRER", Uri.parse("android-app://" + context.getApplicationContext().getPackageName()));
        }
        Activity activity2 = this.f70153c;
        activity2.startActivity(ChromeTabsManagerActivity.c(activity2, intent), dVarB.f2961b);
    }

    public Integer n(androidx.browser.customtabs.d.C0067d c0067d, ReadableMap readableMap, String str, String str2, String str3) {
        String string;
        Integer numValueOf = null;
        try {
            try {
                if (!readableMap.hasKey(str)) {
                    return null;
                }
                string = readableMap.getString(str);
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(string));
                    c0067d.getClass().getDeclaredMethod(str2, Integer.TYPE).invoke(c0067d, numValueOf);
                    return numValueOf;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                string = null;
            }
        } catch (Throwable unused) {
            return numValueOf;
        }
        if (!(e instanceof IllegalArgumentException)) {
            return numValueOf;
        }
        throw new JSApplicationIllegalArgumentException("Invalid " + str3 + " color '" + string + "': " + e.getMessage());
    }

    @l
    public void onEvent(h00.a aVar) {
        p();
        if (this.f70151a == null) {
            return;
        }
        if (aVar.f70146c.booleanValue()) {
            this.f70151a.reject("InAppBrowser", aVar.f70144a);
        } else {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("type", aVar.f70145b);
            writableMapCreateMap.putString("message", aVar.f70144a);
            this.f70151a.resolve(writableMapCreateMap);
        }
        this.f70151a = null;
    }

    public void q(Promise promise) {
        androidx.browser.customtabs.c cVar = this.f70154d;
        if (cVar != null) {
            promise.resolve(Boolean.valueOf(cVar.g(0L)));
        }
        promise.resolve(Boolean.FALSE);
    }
}
