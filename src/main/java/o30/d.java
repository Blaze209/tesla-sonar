package o30;

import android.util.Log;
import com.content.StripeSdkModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo30/d;", "", "", "msg", "Ljn0/h0;", "debug", "(Ljava/lang/String;)V", "info", "a", "", "t", AnalyticsAttribute.Error, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f96360a;

    /* JADX INFO: renamed from: o30.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\f\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lo30/d$a;", "", "<init>", "()V", "", "enableLogging", "Lo30/d;", "a", "(Z)Lo30/d;", "c", "()Lo30/d;", "b", "o30/d$a$b", "Lo30/d$a$b;", "REAL_LOGGER", "o30/d$a$a", "Lo30/d$a$a;", "NOOP_LOGGER", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f96360a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final b REAL_LOGGER = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final C2049a NOOP_LOGGER = new C2049a();

        /* JADX INFO: renamed from: o30.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"o30/d$a$a", "Lo30/d;", "", "msg", "Ljn0/h0;", "debug", "(Ljava/lang/String;)V", "info", "a", "", "t", AnalyticsAttribute.Error, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C2049a implements d {
            C2049a() {
            }

            @Override // o30.d
            public void a(String msg) {
                s.k(msg, "msg");
            }

            @Override // o30.d
            public void debug(String msg) {
                s.k(msg, "msg");
            }

            @Override // o30.d
            public void error(String msg, Throwable t11) {
                s.k(msg, "msg");
            }

            @Override // o30.d
            public void info(String msg) {
                s.k(msg, "msg");
            }
        }

        /* JADX INFO: renamed from: o30.d$a$b */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"o30/d$a$b", "Lo30/d;", "", "msg", "Ljn0/h0;", "debug", "(Ljava/lang/String;)V", "info", "a", "", "t", AnalyticsAttribute.Error, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements d {
            b() {
            }

            @Override // o30.d
            public void a(String msg) {
                s.k(msg, "msg");
                Log.w(StripeSdkModule.NAME, msg);
            }

            @Override // o30.d
            public void debug(String msg) {
                s.k(msg, "msg");
                Log.d(StripeSdkModule.NAME, msg);
            }

            @Override // o30.d
            public void error(String msg, Throwable t11) {
                s.k(msg, "msg");
                Log.e(StripeSdkModule.NAME, msg, t11);
            }

            @Override // o30.d
            public void info(String msg) {
                s.k(msg, "msg");
                Log.i(StripeSdkModule.NAME, msg);
            }
        }

        private Companion() {
        }

        public final d a(boolean enableLogging) {
            return enableLogging ? c() : b();
        }

        public final d b() {
            return NOOP_LOGGER;
        }

        public final d c() {
            return REAL_LOGGER;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(d dVar, String str, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            dVar.error(str, th2);
        }
    }

    void a(String msg);

    void debug(String msg);

    void error(String msg, Throwable t11);

    void info(String msg);
}
