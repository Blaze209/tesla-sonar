package com.tesla.remotelog_core;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.c0;
import androidx.work.l;
import androidx.work.rxjava3.RxWorker;
import androidx.work.y;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cm0.h;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.oapi.HttpMethodType;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import com.tesla.remotelog_core.RemoteLogWorker;
import ie0.v;
import io.reactivex.rxjava3.core.u;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jn0.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import tb0.d;
import tb0.e;
import td0.m;
import wb.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014 \u000b*\t\u0018\u00010\t¢\u0006\u0002\b\n0\t¢\u0006\u0002\b\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/tesla/remotelog_core/RemoteLogWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lio/reactivex/rxjava3/core/u;", "Landroidx/work/y$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "l", "()Lio/reactivex/rxjava3/core/u;", DateTokenConverter.CONVERTER_KEY, "a", "remotelog-core_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteLogWorker extends RxWorker {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f56510e = g.INSTANCE.a("RemoteLogWorker");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final SimpleDateFormat f56511f = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);

    /* JADX INFO: renamed from: com.tesla.remotelog_core.RemoteLogWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/tesla/remotelog_core/RemoteLogWorker$a;", "", "<init>", "()V", "Lorg/json/JSONArray;", "logs", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Lorg/json/JSONArray;Landroid/content/Context;)Ljava/lang/String;", "Ljn0/h0;", "c", "(Landroid/content/Context;Lorg/json/JSONArray;)V", "appVersion", "a", "(Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "KEY_KEY_LOOKUP", "KEY_ONE_TIME_CLEAR_LOGS", "", "MAX_RETRIES", "I", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "remotelog-core_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(JSONArray logs, Context context) throws JSONException {
            JSONObject jSONObjectD = v.f77621a.d(v0.f(x.a("details", v0.f(x.a("batched", logs)))));
            String str = RemoteLogWorker.f56511f.format(new Date());
            String str2 = "RemoteLogWorker-lookup-key-" + logs.hashCode() + "-" + str;
            e eVarA = d.f113112a.a(context);
            String string = jSONObjectD.toString();
            s.j(string, "toString(...)");
            eVarA.a(str2, string);
            return str2;
        }

        public final void a(String appVersion) {
            s.k(appVersion, "appVersion");
            e eVarB = d.f113112a.b();
            if (eVarB.getString("RemoteLogWorker-clear-legacy-logs") != null) {
                return;
            }
            m.j().s(p013kotlin.collections.v.m(), p013kotlin.collections.v.e("RemoteLogWorker-lookup-key"));
            eVarB.a("RemoteLogWorker-clear-legacy-logs", appVersion);
        }

        public final void c(Context context, JSONArray logs) {
            s.k(context, "context");
            s.k(logs, "logs");
            try {
                String strB = b(logs, context);
                TeslaLog.INSTANCE.i("RemoteLogWorker", "Persisted remote logs under key " + strB);
                Pair[] pairArr = {x.a("RemoteLogWorker-lookup-key", strB)};
                androidx.work.g.a aVar = new androidx.work.g.a();
                Pair pair = pairArr[0];
                aVar.b((String) pair.e(), pair.f());
                f.h(context).f(strB, l.KEEP, new c0.a(RemoteLogWorker.class).j(new androidx.work.e.a().d(a0.CONNECTED).b()).i(androidx.work.a.EXPONENTIAL, 30L, TimeUnit.SECONDS).n(aVar.a()).b());
            } catch (Exception e11) {
                RemoteLogWorker.f56510e.d("Failed to schedule remote log worker", e11);
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T, R> implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f56513b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T, R> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f56514a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f56515b;

            a(e eVar, String str) {
                this.f56514a = eVar;
                this.f56515b = str;
            }

            @Override // cm0.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y.a apply(OwnerResponse it) {
                s.k(it, "it");
                if (!it.isSuccessful()) {
                    RemoteLogWorker.f56510e.j("Failed to upload remote OAPI logs");
                    return y.a.d();
                }
                RemoteLogWorker.f56510e.j("Successfully uploaded remote OAPI logs");
                b.d(this.f56514a, this.f56515b);
                return y.a.e();
            }
        }

        b(String str) {
            this.f56513b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(e eVar, String str) {
            eVar.b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y.a e(Throwable it) {
            s.k(it, "it");
            RemoteLogWorker.f56510e.d("Error uploading remote logs", it);
            return y.a.d();
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final io.reactivex.rxjava3.core.y<? extends y.a> apply(Pair<String, ? extends e> pair) {
            String strA = pair.a();
            e eVarB = pair.b();
            if (strA == null) {
                RemoteLogWorker.f56510e.d("Cannot remotely log, data is null, nothing to upload.", new Throwable("Cannot remotely log, data is null, nothing to upload."));
                return RemoteLogWorker.this.l();
            }
            if (t.y0(strA)) {
                d(eVarB, this.f56513b);
                RemoteLogWorker.f56510e.d("Cannot remotely log, data is blank, nothing to upload.", new Throwable("Cannot remotely log, data is blank, nothing to upload."));
                return RemoteLogWorker.this.l();
            }
            if (RemoteLogWorker.this.getRunAttemptCount() > 3) {
                RemoteLogWorker.f56510e.j("Max retries reached for remote OAPI logs");
                d(eVarB, this.f56513b);
                return RemoteLogWorker.this.l();
            }
            SendOwnerRequest.Companion companion = SendOwnerRequest.INSTANCE;
            Context applicationContext = RemoteLogWorker.this.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            SendOwnerRequest sendOwnerRequestNewInstance = companion.newInstance(applicationContext);
            HttpMethodType httpMethodType = HttpMethodType.POST;
            c.Companion aVar = c.INSTANCE;
            Context applicationContext2 = RemoteLogWorker.this.getApplicationContext();
            s.j(applicationContext2, "getApplicationContext(...)");
            return SendOwnerRequest.DefaultImpls.execute$default(sendOwnerRequestNewInstance, httpMethodType, aVar.c(applicationContext2).getUri(), (Map) null, strA, (Map) null, (Map) null, (Integer) null, false, false, 500, (Object) null).n(new a(eVarB, this.f56513b)).q(new h() { // from class: com.tesla.remotelog_core.b
                @Override // cm0.h
                public final Object apply(Object obj) {
                    return RemoteLogWorker.b.e((Throwable) obj);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLogWorker(Context context, WorkerParameters workerParams) {
        super(context.getApplicationContext(), workerParams);
        s.k(context, "context");
        s.k(workerParams, "workerParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair k(RemoteLogWorker remoteLogWorker, String str) {
        d dVar = d.f113112a;
        Context applicationContext = remoteLogWorker.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        e eVarA = dVar.a(applicationContext);
        return new Pair(eVarA.getString(str), eVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u<y.a> l() {
        u<y.a> uVarM = u.m(y.a.a());
        s.j(uVarM, "just(...)");
        return uVarM;
    }

    @Override // androidx.work.rxjava3.RxWorker
    public u<y.a> d() {
        final String strI = getInputData().i("RemoteLogWorker-lookup-key");
        if (strI == null) {
            f56510e.d("Cannot remotely log, key not found.", new Throwable("Cannot remotely log, key not found."));
            return l();
        }
        u<y.a> uVarJ = u.k(new Callable() { // from class: vd0.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RemoteLogWorker.k(this.f119032a, strI);
            }
        }).v(vm0.a.c()).j(new b(strI));
        s.j(uVarJ, "flatMap(...)");
        return uVarJ;
    }
}
