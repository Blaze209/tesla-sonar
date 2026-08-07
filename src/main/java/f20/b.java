package f20;

import android.content.Context;
import android.os.Handler;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ProcessLifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import h20.g;
import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lf20/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "a", "b", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63849b = b.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static EnumC1306b f63850c = EnumC1306b.NONE;

    /* JADX INFO: renamed from: f20.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf20/b$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "b", "(Landroid/content/Context;)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Lf20/b$b;", "initializationState", "Lf20/b$b;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            try {
                ProcessLifecycleOwner.l().getLifecycle().a(new b(null));
                b.f63850c = EnumC1306b.COMPLETE;
            } catch (NoClassDefFoundError unused) {
                Companion companion = b.INSTANCE;
                b.f63850c = EnumC1306b.NONE;
                String TAG = b.f63849b;
                s.j(TAG, "TAG");
                g.b(TAG, "Class 'ProcessLifecycleOwner' not found. The tracker can't track lifecycle events.", new Object[0]);
            }
        }

        public final synchronized void b(Context context) {
            s.k(context, "context");
            if (b.f63850c == EnumC1306b.NONE) {
                b.f63850c = EnumC1306b.IN_PROGRESS;
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: f20.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.Companion.c();
                    }
                });
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: f20.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lf20/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "IN_PROGRESS", "COMPLETE", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum EnumC1306b {
        NONE,
        IN_PROGRESS,
        COMPLETE
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onStart(owner);
        String TAG = f63849b;
        s.j(TAG, "TAG");
        g.a(TAG, "App enter foreground", new Object[0]);
        try {
            HashMap map = new HashMap();
            map.put("isForeground", Boolean.TRUE);
            i20.b.b("SnowplowLifecycleTracking", map);
        } catch (Exception e11) {
            String TAG2 = f63849b;
            s.j(TAG2, "TAG");
            g.b(TAG2, "Method onEnterForeground raised an exception: %s", e11);
        }
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onStop(owner);
        String TAG = f63849b;
        s.j(TAG, "TAG");
        g.a(TAG, "App enter background", new Object[0]);
        try {
            HashMap map = new HashMap();
            map.put("isForeground", Boolean.FALSE);
            i20.b.b("SnowplowLifecycleTracking", map);
        } catch (Exception e11) {
            String TAG2 = f63849b;
            s.j(TAG2, "TAG");
            g.b(TAG2, "Method onEnterBackground raised an exception: %s", e11);
        }
    }

    private b() {
    }
}
