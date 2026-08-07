package com.RNRSA;

import android.os.AsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class RNRSAModule extends ReactContextBaseJavaModule {
    private static final String SHA256withRSA = "SHA256withRSA";
    private static final String SHA512withRSA = "SHA512withRSA";
    private final ReactApplicationContext reactContext;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19552d;

        a(String str, String str2, String str3, Promise promise) {
            this.f19549a = str;
            this.f19550b = str2;
            this.f19551c = str3;
            this.f19552d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.w(this.f19549a);
                this.f19552d.resolve(Boolean.valueOf(cVar.B(this.f19550b, this.f19551c, RNRSAModule.SHA512withRSA)));
            } catch (Exception e11) {
                this.f19552d.reject("Error", e11.getMessage());
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f19557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f19558e;

        b(String str, String str2, String str3, String str4, Promise promise) {
            this.f19554a = str;
            this.f19555b = str2;
            this.f19556c = str3;
            this.f19557d = str4;
            this.f19558e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.w(this.f19554a);
                this.f19558e.resolve(Boolean.valueOf(cVar.B(this.f19555b, this.f19556c, this.f19557d)));
            } catch (Exception e11) {
                this.f19558e.reject("Error", e11.getMessage());
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19563d;

        c(String str, String str2, String str3, Promise promise) {
            this.f19560a = str;
            this.f19561b = str2;
            this.f19562c = str3;
            this.f19563d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.w(this.f19560a);
                this.f19563d.resolve(Boolean.valueOf(cVar.D(this.f19561b, this.f19562c, RNRSAModule.SHA512withRSA)));
            } catch (Exception e11) {
                this.f19563d.reject("Error", e11.getMessage());
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f19568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f19569e;

        d(String str, String str2, String str3, String str4, Promise promise) {
            this.f19565a = str;
            this.f19566b = str2;
            this.f19567c = str3;
            this.f19568d = str4;
            this.f19569e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.w(this.f19565a);
                this.f19569e.resolve(Boolean.valueOf(cVar.D(this.f19566b, this.f19567c, this.f19568d)));
            } catch (Exception e11) {
                this.f19569e.reject("Error", e11.getMessage());
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f19572b;

        e(int i11, Promise promise) {
            this.f19571a = i11;
            this.f19572b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                zc.c cVar = new zc.c();
                cVar.i(this.f19571a);
                writableNativeMap.putString("public", cVar.o());
                writableNativeMap.putString("private", cVar.n());
                this.f19572b.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e11) {
                this.f19572b.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f19572b.reject("Error", e12.getMessage());
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19576c;

        f(String str, String str2, Promise promise) {
            this.f19574a = str;
            this.f19575b = str2;
            this.f19576c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.w(this.f19574a);
                this.f19576c.resolve(cVar.f(this.f19575b));
            } catch (Exception e11) {
                this.f19576c.reject("Error", e11.getMessage());
            }
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19580c;

        g(String str, String str2, Promise promise) {
            this.f19578a = str;
            this.f19579b = str2;
            this.f19580c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.w(this.f19578a);
                this.f19580c.resolve(cVar.h(this.f19579b));
            } catch (Exception e11) {
                this.f19580c.reject("Error", e11.getMessage());
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19584c;

        h(String str, String str2, Promise promise) {
            this.f19582a = str;
            this.f19583b = str2;
            this.f19584c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.v(this.f19582a);
                this.f19584c.resolve(cVar.b(this.f19583b));
            } catch (Exception e11) {
                this.f19584c.reject("Error", e11.getMessage());
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19588c;

        i(String str, String str2, Promise promise) {
            this.f19586a = str;
            this.f19587b = str2;
            this.f19588c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.v(this.f19586a);
                this.f19588c.resolve(cVar.d(this.f19587b));
            } catch (Exception e11) {
                this.f19588c.reject("Error", e11.getMessage());
            }
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19592c;

        j(String str, String str2, Promise promise) {
            this.f19590a = str;
            this.f19591b = str2;
            this.f19592c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.v(this.f19590a);
                this.f19592c.resolve(cVar.y(this.f19591b, RNRSAModule.SHA512withRSA));
            } catch (Exception e11) {
                this.f19592c.reject("Error", e11.getMessage());
            }
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19597d;

        k(String str, String str2, String str3, Promise promise) {
            this.f19594a = str;
            this.f19595b = str2;
            this.f19596c = str3;
            this.f19597d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.v(this.f19594a);
                this.f19597d.resolve(cVar.y(this.f19595b, this.f19596c));
            } catch (Exception e11) {
                this.f19597d.reject("Error", e11.getMessage());
            }
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19601c;

        l(String str, String str2, Promise promise) {
            this.f19599a = str;
            this.f19600b = str2;
            this.f19601c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.v(this.f19599a);
                this.f19601c.resolve(cVar.A(this.f19600b, RNRSAModule.SHA512withRSA));
            } catch (Exception e11) {
                this.f19601c.reject("Error", e11.getMessage());
            }
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19606d;

        m(String str, String str2, String str3, Promise promise) {
            this.f19603a = str;
            this.f19604b = str2;
            this.f19605c = str3;
            this.f19606d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zc.c cVar = new zc.c();
                cVar.v(this.f19603a);
                this.f19606d.resolve(cVar.A(this.f19604b, this.f19605c));
            } catch (Exception e11) {
                this.f19606d.reject("Error", e11.getMessage());
            }
        }
    }

    public RNRSAModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void decrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new h(str2, str, promise));
    }

    @ReactMethod
    public void decrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new i(str2, str, promise));
    }

    @ReactMethod
    public void encrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new f(str2, str, promise));
    }

    @ReactMethod
    public void encrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new g(str2, str, promise));
    }

    @ReactMethod
    public void generate(Promise promise) {
        generateKeys(2048, promise);
    }

    @ReactMethod
    public void generateKeys(int i11, Promise promise) {
        AsyncTask.execute(new e(i11, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put(SHA256withRSA, SHA256withRSA);
        map.put(SHA512withRSA, SHA512withRSA);
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRSA";
    }

    @ReactMethod
    public void sign(String str, String str2, Promise promise) {
        AsyncTask.execute(new j(str2, str, promise));
    }

    @ReactMethod
    public void sign64(String str, String str2, Promise promise) {
        AsyncTask.execute(new l(str2, str, promise));
    }

    @ReactMethod
    public void sign64WithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new m(str2, str, str3, promise));
    }

    @ReactMethod
    public void signWithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new k(str2, str, str3, promise));
    }

    @ReactMethod
    public void verify(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new a(str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new c(str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64WithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new d(str3, str, str2, str4, promise));
    }

    @ReactMethod
    public void verifyWithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new b(str3, str, str2, str4, promise));
    }
}
