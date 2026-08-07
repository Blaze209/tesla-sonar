package f20;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.core.util.Consumer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import h20.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import s20.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001.B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010 \u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\r¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\r¢\u0006\u0004\b,\u0010*R$\u00102\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010:\u001a\u0002032\u0006\u0010-\u001a\u0002038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u00109R$\u0010=\u001a\u0002032\u0006\u0010-\u001a\u0002038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u00109R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010-\u001a\u0004\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010CR\u0016\u0010G\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010CR\u0016\u0010J\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010IR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010F\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010F\u001a\u0004\bO\u0010L\"\u0004\bP\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010QR*\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\bX\u0010\\R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010_R\u0011\u0010(\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bS\u0010\u000f¨\u0006a"}, d2 = {"Lf20/d;", "", "", "foregroundTimeout", "backgroundTimeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "", "namespace", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(JJLjava/util/concurrent/TimeUnit;Ljava/lang/String;Landroid/content/Context;)V", "", "q", "()Z", "eventId", "eventTimestamp", "Ljn0/h0;", "t", "(Ljava/lang/String;J)V", "Ls20/f;", "state", "s", "(Ls20/f;)V", "f", "Ljava/lang/Runnable;", "callback", "h", "(Ljava/lang/Runnable;)V", "sessionVarsName", "", "l", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;", "userAnonymisation", "Lr20/b;", "k", "(Ljava/lang/String;JZ)Lr20/b;", "r", "()V", "isBackground", "n", "(Z)V", "isSuspended", "o", "<set-?>", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "", "b", "I", "eventIndex", "c", IntegerTokenConverter.CONVERTER_KEY, "()I", "backgroundIndex", DateTokenConverter.CONVERTER_KEY, "j", "foregroundIndex", "e", "Ls20/f;", "getState", "()Ls20/f;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isBackground", "g", "J", "lastSessionCheck", "isNewSession", "Z", "isSessionCheckerEnabled", "getForegroundTimeout", "()J", "setForegroundTimeout", "(J)V", "getBackgroundTimeout", "setBackgroundTimeout", "Ljava/lang/Runnable;", "foregroundTransitionCallback", "m", "backgroundTransitionCallback", "foregroundTimeoutCallback", "backgroundTimeoutCallback", "Landroidx/core/util/Consumer;", "p", "Landroidx/core/util/Consumer;", "getOnSessionUpdate", "()Landroidx/core/util/Consumer;", "(Landroidx/core/util/Consumer;)V", "onSessionUpdate", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f63854s = d.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int eventIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile int backgroundIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile int foregroundIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private f state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _isBackground;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long lastSessionCheck;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isNewSession;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isSessionCheckerEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long foregroundTimeout;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long backgroundTimeout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Runnable foregroundTransitionCallback;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Runnable backgroundTransitionCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Runnable foregroundTimeoutCallback;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Runnable backgroundTimeoutCallback;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Consumer<f> onSessionUpdate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: f20.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJK\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lf20/d$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ls20/f;", "state", "", "c", "(Landroid/content/Context;Ls20/f;)Ljava/lang/String;", "", "foregroundTimeout", "backgroundTimeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "namespace", "", "Ljava/lang/Runnable;", "sessionCallbacks", "Lf20/d;", "b", "(Landroid/content/Context;JJLjava/util/concurrent/TimeUnit;Ljava/lang/String;[Ljava/lang/Runnable;)Lf20/d;", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized String c(Context context, f state) {
            String userId;
            if (state != null) {
                try {
                    userId = state.getUserId();
                    if (userId == null) {
                        userId = i20.c.r();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                userId = i20.c.r();
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("snowplow_general_vars", 0);
            String string = sharedPreferences.getString("SPInstallationUserId", null);
            if (string != null) {
                userId = string;
            } else {
                sharedPreferences.edit().putString("SPInstallationUserId", userId).commit();
            }
            return userId;
        }

        public final synchronized d b(Context context, long foregroundTimeout, long backgroundTimeout, TimeUnit timeUnit, String namespace, Runnable[] sessionCallbacks) {
            d dVar;
            try {
                s.k(context, "context");
                s.k(timeUnit, "timeUnit");
                dVar = new d(foregroundTimeout, backgroundTimeout, timeUnit, namespace, context);
                Runnable[] runnableArr = {null, null, null, null};
                if (sessionCallbacks != null && sessionCallbacks.length == 4) {
                    runnableArr = sessionCallbacks;
                }
                dVar.foregroundTransitionCallback = runnableArr[0];
                dVar.backgroundTransitionCallback = runnableArr[1];
                dVar.foregroundTimeoutCallback = runnableArr[2];
                dVar.backgroundTimeoutCallback = runnableArr[3];
            } catch (Throwable th2) {
                throw th2;
            }
            return dVar;
        }

        private Companion() {
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public d(long j11, long j12, TimeUnit timeUnit, String str, Context context) {
        String str2;
        s.k(timeUnit, "timeUnit");
        s.k(context, "context");
        this._isBackground = new AtomicBoolean(false);
        this.isNewSession = new AtomicBoolean(true);
        this.foregroundTimeout = timeUnit.toMillis(j11);
        this.backgroundTimeout = timeUnit.toMillis(j12);
        this.isSessionCheckerEnabled = true;
        if (str == null || str.length() <= 0) {
            str2 = "snowplow_session_vars";
        } else {
            str2 = "snowplow_session_vars_" + new q("[^a-zA-Z0-9_]+").j(str, "-");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, ? extends Object> mapL = l(context, str2);
            if (mapL == null) {
                String TAG = f63854s;
                s.j(TAG, "TAG");
                g.h(TAG, "No previous session info available", new Object[0]);
            } else {
                this.state = f.INSTANCE.a(mapL);
            }
            this.userId = INSTANCE.c(context, this.state);
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            s.j(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            this.sharedPreferences = sharedPreferences;
            this.lastSessionCheck = System.currentTimeMillis();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            String TAG2 = f63854s;
            s.j(TAG2, "TAG");
            g.j(TAG2, "Tracker Session Object created.", new Object[0]);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    private final void f(final f state) {
        final Consumer<f> consumer = this.onSessionUpdate;
        if (consumer == null) {
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: f20.c
            @Override // java.lang.Runnable
            public final void run() {
                d.g(consumer, state);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Consumer onSessionUpdate, f state) {
        s.k(onSessionUpdate, "$onSessionUpdate");
        s.k(state, "$state");
        onSessionUpdate.accept(state);
    }

    private final void h(Runnable callback) {
        if (callback == null) {
            return;
        }
        try {
            callback.run();
        } catch (Exception unused) {
            String TAG = f63854s;
            s.j(TAG, "TAG");
            g.b(TAG, "Session event callback failed", new Object[0]);
        }
    }

    private final Map<String, Object> l(Context context, String sessionVarsName) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(sessionVarsName, 0);
            if (!sharedPreferences.contains("session_state")) {
                return null;
            }
            HashMap map = new HashMap();
            String string = sharedPreferences.getString("session_state", null);
            JSONObject jSONObject = string != null ? new JSONObject(string) : null;
            Iterator<String> itKeys = jSONObject != null ? jSONObject.keys() : null;
            while (itKeys != null && itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
            return map;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private final boolean q() {
        if (this.isNewSession.get()) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = m() ? this.backgroundTimeout : this.foregroundTimeout;
        long j12 = this.lastSessionCheck;
        return jCurrentTimeMillis < j12 || jCurrentTimeMillis - j12 > j11;
    }

    private final void s(f state) {
        String string = new JSONObject(state.c()).toString();
        s.j(string, "jsonObject.toString()");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("session_state", string);
        editorEdit.apply();
    }

    private final synchronized void t(String eventId, long eventTimestamp) {
        String str;
        String sessionId;
        try {
            this.isNewSession.set(false);
            String strR = i20.c.r();
            String strF = i20.c.f(eventTimestamp);
            this.eventIndex = 0;
            f fVar = this.state;
            int sessionIndex = 1;
            if (fVar != null) {
                sessionIndex = 1 + fVar.getSessionIndex();
                sessionId = fVar.getSessionId();
                str = fVar.getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String();
            } else {
                str = "LOCAL_STORAGE";
                sessionId = null;
            }
            f fVar2 = new f(eventId, strF, strR, sessionId, sessionIndex, this.userId, str);
            this.state = fVar2;
            s(fVar2);
            f(fVar2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getBackgroundIndex() {
        return this.backgroundIndex;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getForegroundIndex() {
        return this.foregroundIndex;
    }

    public final synchronized r20.b k(String eventId, long eventTimestamp, boolean userAnonymisation) {
        try {
            s.k(eventId, "eventId");
            String TAG = f63854s;
            s.j(TAG, "TAG");
            g.j(TAG, "Getting session context...", new Object[0]);
            if (this.isSessionCheckerEnabled) {
                if (q()) {
                    s.j(TAG, "TAG");
                    g.a(TAG, "Update session information.", new Object[0]);
                    t(eventId, eventTimestamp);
                    if (m()) {
                        h(this.backgroundTimeoutCallback);
                    } else {
                        h(this.foregroundTimeoutCallback);
                    }
                }
                this.lastSessionCheck = System.currentTimeMillis();
            }
            this.eventIndex++;
            f fVar = this.state;
            if (fVar == null) {
                s.j(TAG, "TAG");
                g.j(TAG, "Session state not present", new Object[0]);
                return null;
            }
            HashMap map = new HashMap(fVar.c());
            map.put("eventIndex", Integer.valueOf(this.eventIndex));
            if (userAnonymisation) {
                map.put("userId", "00000000-0000-0000-0000-000000000000");
                map.put("previousSessionId", null);
            }
            return new n20.a(map);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean m() {
        return this._isBackground.get();
    }

    public final void n(boolean isBackground) {
        if (this._isBackground.compareAndSet(!isBackground, isBackground)) {
            if (isBackground) {
                String TAG = f63854s;
                s.j(TAG, "TAG");
                g.a(TAG, "Application moved to background", new Object[0]);
                h(this.backgroundTransitionCallback);
                this.backgroundIndex++;
                return;
            }
            String TAG2 = f63854s;
            s.j(TAG2, "TAG");
            g.a(TAG2, "Application moved to foreground", new Object[0]);
            h(this.foregroundTransitionCallback);
            try {
                o(false);
            } catch (Exception e11) {
                String TAG3 = f63854s;
                s.j(TAG3, "TAG");
                g.b(TAG3, "Could not resume checking as tracker not setup. Exception: %s", e11);
            }
            this.foregroundIndex++;
        }
    }

    public final void o(boolean isSuspended) {
        String TAG = f63854s;
        s.j(TAG, "TAG");
        g.a(TAG, "Session is suspended: %s", Boolean.valueOf(isSuspended));
        this.isSessionCheckerEnabled = !isSuspended;
    }

    public final void p(Consumer<f> consumer) {
        this.onSessionUpdate = consumer;
    }

    public final void r() {
        this.isNewSession.set(true);
    }
}
