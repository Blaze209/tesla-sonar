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
public class RNRSAKeychainModule extends ReactContextBaseJavaModule {
    private static final String SHA1withRSA = "SHA1withRSA";
    private static final String SHA256withRSA = "SHA256withRSA";
    private static final String SHA512withRSA = "SHA512withRSA";
    private final ReactApplicationContext reactContext;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19473d;

        a(String str, String str2, String str3, Promise promise) {
            this.f19470a = str;
            this.f19471b = str2;
            this.f19472c = str3;
            this.f19473d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19473d.resolve(new zc.c(this.f19470a).y(this.f19471b, this.f19472c));
            } catch (Exception e11) {
                this.f19473d.reject("Error", e11.getMessage());
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19477c;

        b(String str, String str2, Promise promise) {
            this.f19475a = str;
            this.f19476b = str2;
            this.f19477c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19477c.resolve(new zc.c(this.f19475a).A(this.f19476b, RNRSAKeychainModule.SHA512withRSA));
            } catch (Exception e11) {
                this.f19477c.reject("Error", e11.getMessage());
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19482d;

        c(String str, String str2, String str3, Promise promise) {
            this.f19479a = str;
            this.f19480b = str2;
            this.f19481c = str3;
            this.f19482d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19482d.resolve(new zc.c(this.f19479a).A(this.f19480b, this.f19481c));
            } catch (Exception e11) {
                this.f19482d.reject("Error", e11.getMessage());
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19487d;

        d(String str, String str2, String str3, Promise promise) {
            this.f19484a = str;
            this.f19485b = str2;
            this.f19486c = str3;
            this.f19487d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19487d.resolve(Boolean.valueOf(new zc.c(this.f19484a).B(this.f19485b, this.f19486c, RNRSAKeychainModule.SHA512withRSA)));
            } catch (Exception e11) {
                this.f19487d.reject("Error", e11.getMessage());
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f19492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f19493e;

        e(String str, String str2, String str3, String str4, Promise promise) {
            this.f19489a = str;
            this.f19490b = str2;
            this.f19491c = str3;
            this.f19492d = str4;
            this.f19493e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19493e.resolve(Boolean.valueOf(new zc.c(this.f19489a).B(this.f19490b, this.f19491c, this.f19492d)));
            } catch (Exception e11) {
                this.f19493e.reject("Error", e11.getMessage());
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19498d;

        f(String str, String str2, String str3, Promise promise) {
            this.f19495a = str;
            this.f19496b = str2;
            this.f19497c = str3;
            this.f19498d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19498d.resolve(Boolean.valueOf(new zc.c(this.f19495a).D(this.f19496b, this.f19497c, RNRSAKeychainModule.SHA512withRSA)));
            } catch (Exception e11) {
                this.f19498d.reject("Error", e11.getMessage());
            }
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f19503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f19504e;

        g(String str, String str2, String str3, String str4, Promise promise) {
            this.f19500a = str;
            this.f19501b = str2;
            this.f19502c = str3;
            this.f19503d = str4;
            this.f19504e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19504e.resolve(Boolean.valueOf(new zc.c(this.f19500a).D(this.f19501b, this.f19502c, this.f19503d)));
            } catch (Exception e11) {
                this.f19504e.reject("Error", e11.getMessage());
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f19507b;

        h(String str, Promise promise) {
            this.f19506a = str;
            this.f19507b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            new WritableNativeMap();
            try {
                String strO = new zc.c(this.f19506a).o();
                if (strO != null) {
                    this.f19507b.resolve(strO);
                } else {
                    this.f19507b.reject("Error", "Missing public key for that keyTag");
                }
            } catch (Exception e11) {
                this.f19507b.reject("Error", e11.getMessage());
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f19510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f19511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19512d;

        i(String str, int i11, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f19509a = str;
            this.f19510b = i11;
            this.f19511c = reactApplicationContext;
            this.f19512d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                zc.c cVar = new zc.c();
                cVar.j(this.f19509a, this.f19510b, this.f19511c);
                writableNativeMap.putString("public", cVar.o());
                this.f19512d.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e11) {
                this.f19512d.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f19512d.reject("Error", e12.getMessage());
            }
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f19517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f19518e;

        j(String str, String str2, String str3, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f19514a = str;
            this.f19515b = str2;
            this.f19516c = str3;
            this.f19517d = reactApplicationContext;
            this.f19518e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                zc.c cVar = new zc.c(this.f19514a);
                cVar.k(this.f19515b, this.f19516c, this.f19517d);
                writableNativeMap.putString("csr", cVar.m());
                this.f19518e.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e11) {
                this.f19518e.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f19518e.reject("Error", e12.getMessage());
            }
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f19523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f19524e;

        k(String str, String str2, int i11, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f19520a = str;
            this.f19521b = str2;
            this.f19522c = i11;
            this.f19523d = reactApplicationContext;
            this.f19524e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                zc.c cVar = new zc.c();
                cVar.l(this.f19520a, this.f19521b, this.f19522c, this.f19523d);
                writableNativeMap.putString("csr", cVar.m());
                this.f19524e.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e11) {
                this.f19524e.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f19524e.reject("Error", e12.getMessage());
            }
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f19527b;

        l(String str, Promise promise) {
            this.f19526a = str;
            this.f19527b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new zc.c(this.f19526a).e();
                this.f19527b.resolve(1);
            } catch (NoSuchAlgorithmException e11) {
                this.f19527b.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f19527b.reject("Error", e12.getMessage());
            }
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19531c;

        m(String str, String str2, Promise promise) {
            this.f19529a = str;
            this.f19530b = str2;
            this.f19531c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19531c.resolve(new zc.c(this.f19529a).f(this.f19530b));
            } catch (Exception e11) {
                this.f19531c.reject("Error", e11.getMessage());
            }
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19535c;

        n(String str, String str2, Promise promise) {
            this.f19533a = str;
            this.f19534b = str2;
            this.f19535c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19535c.resolve(new zc.c(this.f19533a).h(this.f19534b));
            } catch (Exception e11) {
                this.f19535c.reject("Error", e11.getMessage());
            }
        }
    }

    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19539c;

        o(String str, String str2, Promise promise) {
            this.f19537a = str;
            this.f19538b = str2;
            this.f19539c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19539c.resolve(new zc.c(this.f19537a).b(this.f19538b));
            } catch (Exception e11) {
                this.f19539c.reject("Error", e11.getMessage());
            }
        }
    }

    class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19543c;

        p(String str, String str2, Promise promise) {
            this.f19541a = str;
            this.f19542b = str2;
            this.f19543c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19543c.resolve(new zc.c(this.f19541a).d(this.f19542b));
            } catch (Exception e11) {
                this.f19543c.reject("Error", e11.getMessage());
            }
        }
    }

    class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19547c;

        q(String str, String str2, Promise promise) {
            this.f19545a = str;
            this.f19546b = str2;
            this.f19547c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19547c.resolve(new zc.c(this.f19545a).y(this.f19546b, RNRSAKeychainModule.SHA512withRSA));
            } catch (Exception e11) {
                this.f19547c.reject("Error", e11.getMessage());
            }
        }
    }

    public RNRSAKeychainModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void decrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new o(str2, str, promise));
    }

    @ReactMethod
    public void decrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new p(str2, str, promise));
    }

    @ReactMethod
    public void deletePrivateKey(String str, Promise promise) {
        AsyncTask.execute(new l(str, promise));
    }

    @ReactMethod
    public void encrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new m(str2, str, promise));
    }

    @ReactMethod
    public void encrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new n(str2, str, promise));
    }

    @ReactMethod
    public void generate(String str, Promise promise) {
        generateKeys(str, 2048, promise);
    }

    @ReactMethod
    public void generateCSR(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new j(str, str2, str3, this.reactContext, promise));
    }

    @ReactMethod
    public void generateCSRWithEC(String str, String str2, int i11, Promise promise) {
        AsyncTask.execute(new k(str, str2, i11, this.reactContext, promise));
    }

    @ReactMethod
    public void generateKeys(String str, int i11, Promise promise) {
        AsyncTask.execute(new i(str, i11, this.reactContext, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put(SHA256withRSA, SHA256withRSA);
        map.put(SHA512withRSA, SHA512withRSA);
        map.put(SHA1withRSA, SHA1withRSA);
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRSAKeychain";
    }

    @ReactMethod
    public void getPublicKey(String str, Promise promise) {
        AsyncTask.execute(new h(str, promise));
    }

    @ReactMethod
    public void sign(String str, String str2, Promise promise) {
        AsyncTask.execute(new q(str2, str, promise));
    }

    @ReactMethod
    public void sign64(String str, String str2, Promise promise) {
        AsyncTask.execute(new b(str2, str, promise));
    }

    @ReactMethod
    public void sign64WithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new c(str2, str, str3, promise));
    }

    @ReactMethod
    public void signWithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new a(str2, str, str3, promise));
    }

    @ReactMethod
    public void verify(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new d(str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new f(str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64WithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new g(str3, str, str2, str4, promise));
    }

    @ReactMethod
    public void verifyWithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new e(str3, str, str2, str4, promise));
    }
}
