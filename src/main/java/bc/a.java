package bc;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import cc.h;
import cc.i;
import cc.j;
import cc.k;
import cc.l;
import cc.m;
import cc.n;
import cc.p;
import cc.q;
import cc.r;
import cc.s;
import cc.t;
import cc.u;
import cc.v;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a implements ActivityEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static ReactApplicationContext f16951a;

    /* JADX INFO: renamed from: bc.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0340a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16952a;

        static {
            int[] iArr = new int[b.values().length];
            f16952a = iArr;
            try {
                iArr[b.generic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16952a[b.facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16952a[b.facebookstories.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16952a[b.pagesmanager.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16952a[b.twitter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16952a[b.whatsapp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16952a[b.whatsappbusiness.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16952a[b.instagram.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16952a[b.instagramstories.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16952a[b.googleplus.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16952a[b.email.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16952a[b.pinterest.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16952a[b.sms.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16952a[b.snapchat.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16952a[b.messenger.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16952a[b.linkedin.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16952a[b.telegram.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16952a[b.viber.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f16952a[b.discord.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    private enum b {
        facebook,
        facebookstories,
        generic,
        pagesmanager,
        twitter,
        whatsapp,
        whatsappbusiness,
        instagram,
        instagramstories,
        googleplus,
        email,
        pinterest,
        messenger,
        snapchat,
        sms,
        linkedin,
        telegram,
        viber,
        discord;

        public static n getShareClass(String str, ReactApplicationContext reactApplicationContext) {
            switch (C0340a.f16952a[valueOf(str).ordinal()]) {
                case 1:
                    return new cc.f(reactApplicationContext);
                case 2:
                    return new cc.d(reactApplicationContext);
                case 3:
                    return new cc.e(reactApplicationContext);
                case 4:
                    return new cc.c(reactApplicationContext);
                case 5:
                    return new s(reactApplicationContext);
                case 6:
                    return new v(reactApplicationContext);
                case 7:
                    return new u(reactApplicationContext);
                case 8:
                    return new h(reactApplicationContext);
                case 9:
                    return new i(reactApplicationContext);
                case 10:
                    return new cc.g(reactApplicationContext);
                case 11:
                    return new cc.b(reactApplicationContext);
                case 12:
                    return new l(reactApplicationContext);
                case 13:
                    return new m(reactApplicationContext);
                case 14:
                    return new p(reactApplicationContext);
                case 15:
                    return new k(reactApplicationContext);
                case 16:
                    return new j(reactApplicationContext);
                case 17:
                    return new r(reactApplicationContext);
                case 18:
                    return new t(reactApplicationContext);
                case 19:
                    return new cc.a(reactApplicationContext);
                default:
                    return null;
            }
        }
    }

    public a(ReactApplicationContext reactApplicationContext) {
        f16951a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public Map<String, Object> a() {
        HashMap map = new HashMap();
        for (b bVar : b.values()) {
            map.put(bVar.toString().toUpperCase(Locale.ROOT), bVar.toString());
        }
        return map;
    }

    public void b(String str, Promise promise) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme == null || !scheme.equals("data")) {
                promise.resolve(Boolean.FALSE);
            } else {
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e11) {
            Log.e("RNShare", e11.getMessage());
            e11.printStackTrace(System.out);
            promise.reject(e11.getMessage());
        }
    }

    public void c(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(n.k(str, f16951a)));
        } catch (Exception e11) {
            Log.e("RNShare", e11.getMessage());
            promise.reject(e11.getMessage());
        }
    }

    public void d(int i11, int i12, Intent intent) {
        if (i11 == 16845) {
            if (i12 == 0) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("success", false);
                writableMapCreateMap.putString("message", "CANCELED");
                q.b(writableMapCreateMap);
                return;
            }
            if (i12 == -1) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putBoolean("success", true);
                q.b(writableMapCreateMap2);
            }
        }
    }

    public void e(ReadableMap readableMap, Promise promise) {
        q.e(promise);
        try {
            new cc.f(f16951a).l(readableMap);
        } catch (ActivityNotFoundException e11) {
            Log.e("RNShare", e11.getMessage());
            e11.printStackTrace(System.out);
            q.a("not_available");
        } catch (Exception e12) {
            Log.e("RNShare", e12.getMessage());
            e12.printStackTrace(System.out);
            q.a(e12.getMessage());
        }
    }

    public void f(ReadableMap readableMap, Promise promise) {
        q.e(promise);
        if (!n.j("social", readableMap)) {
            q.a("key 'social' missing in options");
            return;
        }
        try {
            n shareClass = b.getShareClass(readableMap.getString("social"), f16951a);
            if (shareClass == null) {
                throw new ActivityNotFoundException("Invalid share activity");
            }
            shareClass.l(readableMap);
        } catch (ActivityNotFoundException e11) {
            Log.e("RNShare", e11.getMessage());
            e11.printStackTrace(System.out);
            q.a(e11.getMessage());
        } catch (Exception e12) {
            Log.e("RNShare", e12.getMessage());
            e12.printStackTrace(System.out);
            q.a(e12.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        d(i11, i12, intent);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
