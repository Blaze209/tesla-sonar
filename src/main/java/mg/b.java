package mg;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    public class a implements mg.a.InterfaceC1966a<Object, Boolean> {
        @Override // mg.a.InterfaceC1966a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* JADX INFO: renamed from: mg.b$b, reason: collision with other inner class name */
    public class CallableC1967b implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f92089a;

        public CallableC1967b(Context context) {
            this.f92089a = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return pg.b.a(this.f92089a);
        }
    }

    public class c implements mg.a.InterfaceC1966a<Object, Boolean> {
        @Override // mg.a.InterfaceC1966a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    public class d implements Callable<NetworkInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f92090a;

        public d(Context context) {
            this.f92090a = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkInfo call() {
            return ((ConnectivityManager) this.f92090a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }

    public class e implements mg.a.InterfaceC1966a<Object, Boolean> {
        @Override // mg.a.InterfaceC1966a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public class f implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f92091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ai.a f92092b;

        public f(Context context, ai.a aVar) {
            this.f92091a = context;
            this.f92092b = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            try {
                return uh.a.b(this.f92091a);
            } catch (Throwable th2) {
                hh.a.g(this.f92092b, "third", "GetUtdidEx", th2.getClass().getName());
                return "";
            }
        }
    }

    public class g implements mg.a.InterfaceC1966a<Object, Boolean> {
        @Override // mg.a.InterfaceC1966a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public class h implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f92093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f92094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f92095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ai.a f92096d;

        public class a implements APSecuritySdk.InitResultListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f92097a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConditionVariable f92098b;

            public a(String[] strArr, ConditionVariable conditionVariable) {
                this.f92097a = strArr;
                this.f92098b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f92097a[0] = tokenResult.apdidToken;
                }
                this.f92098b.open();
            }
        }

        public h(String str, String str2, Context context, ai.a aVar) {
            this.f92093a = str;
            this.f92094b = str2;
            this.f92095c = context;
            this.f92096d = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            HashMap map = new HashMap();
            map.put("tid", this.f92093a);
            map.put("utdid", this.f92094b);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f92095c);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, map, new a(strArr, conditionVariable));
                conditionVariable.block(3000L);
            } catch (Throwable th2) {
                di.g.d(th2);
                hh.a.g(this.f92096d, "third", "GetApdidEx", th2.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                hh.a.g(this.f92096d, "third", "GetApdidNull", "missing token");
            }
            return strArr[0];
        }
    }

    public static NetworkInfo a(ai.a aVar, Context context) {
        Context contextA = mg.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) mg.a.c(2, 10L, timeUnit, new c(), new d(contextA), false, 10L, timeUnit, aVar, false);
    }

    public static String b(ai.a aVar, Context context, String str, String str2) {
        Context contextA = mg.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) mg.a.c(4, 10L, timeUnit, new g(), new h(str, str2, contextA, aVar), true, 3L, timeUnit, aVar, true);
    }

    public static String c(ai.a aVar, Context context) {
        if (!lh.b.E().b()) {
            return "";
        }
        return (String) mg.a.c(1, 1L, TimeUnit.DAYS, new a(), new CallableC1967b(mg.a.a(context)), true, 200L, TimeUnit.MILLISECONDS, aVar, true);
    }

    public static String d(ai.a aVar, Context context) {
        return (String) mg.a.c(3, 1L, TimeUnit.DAYS, new e(), new f(mg.a.a(context), aVar), true, 3L, TimeUnit.SECONDS, aVar, false);
    }
}
