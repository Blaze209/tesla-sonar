package com.tesla.remotelog_core;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cm0.f;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ9\u0010\t\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/tesla/remotelog_core/a;", "", "", "", "data", "", "batchLog", "vin", "Ljn0/h0;", "c", "(Ljava/util/Map;ZLjava/lang/String;)V", "a", "()V", "b", "remotelog-core_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f56517a;

    /* JADX INFO: renamed from: com.tesla.remotelog_core.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/tesla/remotelog_core/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/remotelog_core/a;", "c", "(Landroid/content/Context;)Lcom/tesla/remotelog_core/a;", "", "appVersion", "Ljn0/h0;", "b", "(Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)V", "Lcom/tesla/remotelog_core/a;", "remoteLog", "remotelog-core_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f56517a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static a remoteLog;

        /* JADX INFO: renamed from: com.tesla.remotelog_core.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C1142a<T> implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1142a<T> f56519a = new C1142a<>();

            C1142a() {
            }

            @Override // cm0.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(ud0.a.LogPayload logPayload) {
                s.k(logPayload, "<destruct>");
                Map<String, Object> mapA = logPayload.a();
                boolean batchLog = logPayload.getBatchLog();
                a aVar = Companion.remoteLog;
                if (aVar == null) {
                    s.B("remoteLog");
                    aVar = null;
                }
                b.a(aVar, mapA, batchLog, null, 4, null);
            }
        }

        private Companion() {
        }

        public final void b(String appVersion) {
            s.k(appVersion, "appVersion");
            RemoteLogWorker.INSTANCE.a(appVersion);
        }

        public final a c(Context context) {
            s.k(context, "context");
            return c.INSTANCE.b(context);
        }

        @SuppressLint({"CheckResult"})
        public final void d(Context context) {
            s.k(context, "context");
            remoteLog = c(context);
            ud0.a.f116153a.c().R(vm0.a.c()).N(C1142a.f56519a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(a aVar, Map map, boolean z11, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            if ((i11 & 4) != 0) {
                str = null;
            }
            aVar.c(map, z11, str);
        }
    }

    void a();

    void b();

    void c(Map<String, ? extends Object> data, boolean batchLog, String vin);
}
