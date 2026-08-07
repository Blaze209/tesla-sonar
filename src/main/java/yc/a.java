package yc;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tR=\u0010\u0004\u001a\"\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00030\u00030\u0014j\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00030\u0003`\u00168\u0006¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u0012\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010\n\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010\t\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lyc/a;", "Lyc/b0;", "Landroid/content/ComponentCallbacks2;", "Lec/v;", "imageLoader", "<init>", "(Lec/v;)V", "Ljn0/h0;", "a", "()V", "shutdown", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "onLowMemory", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Lcoil3/util/WeakReference;", "Ljava/lang/ref/WeakReference;", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "Landroid/content/Context;", "b", "Landroid/content/Context;", Kind.APPLICATION, "", "c", "Z", "getShutdown", "()Z", "setShutdown", "(Z)V", "getShutdown$annotations", DateTokenConverter.CONVERTER_KEY, "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b0, ComponentCallbacks2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2725a f125331d = new C2725a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<ec.v> imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Context application;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean shutdown;

    /* JADX INFO: renamed from: yc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C2725a {
        public /* synthetic */ C2725a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2725a() {
        }
    }

    public a(ec.v vVar) {
        this.imageLoader = new WeakReference<>(vVar);
    }

    @Override // yc.b0
    public synchronized void a() {
        try {
            ec.v vVar = this.imageLoader.get();
            if (vVar == null) {
                shutdown();
            } else if (this.application == null) {
                Context application = vVar.getOptions().getApplication();
                this.application = application;
                application.registerComponentCallbacks(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(Configuration newConfig) {
        if (this.imageLoader.get() == null) {
            shutdown();
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int level) {
        mc.d dVarD;
        try {
            ec.v vVar = this.imageLoader.get();
            if (vVar != null) {
                vVar.getOptions().f();
                if (level >= 40) {
                    mc.d dVarD2 = vVar.d();
                    if (dVarD2 != null) {
                        dVarD2.clear();
                    }
                } else if (level >= 10 && (dVarD = vVar.d()) != null) {
                    dVarD.d(dVarD.getSize() / ((long) 2));
                }
            } else {
                shutdown();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // yc.b0
    public synchronized void shutdown() {
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Context context = this.application;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.imageLoader.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
