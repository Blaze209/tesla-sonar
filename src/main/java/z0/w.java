package z0;

import android.content.Context;
import androidx.core.util.Consumer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0018\u0010!\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0016\u0010.\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010-R\u0016\u0010/\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0016\u00100\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010-¨\u00061"}, d2 = {"Lz0/w;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lz0/t0;", "recorder", "Lz0/u;", "outputOptions", "<init>", "(Landroid/content/Context;Lz0/t0;Lz0/u;)V", "b", "()Landroid/content/Context;", "f", "()Lz0/t0;", "e", "()Lz0/u;", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/concurrent/Executor;", "Landroidx/core/util/Consumer;", "Lz0/d2;", "c", "()Landroidx/core/util/Consumer;", "", "g", "()Z", "h", IntegerTokenConverter.CONVERTER_KEY, "initialMuted", "k", "(Z)Lz0/w;", "a", "()Lz0/w;", "listenerExecutor", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lz0/g1;", "j", "(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)Lz0/g1;", "Lz0/t0;", "Lz0/u;", "Landroid/content/Context;", "applicationContext", "Landroidx/core/util/Consumer;", "eventListener", "Ljava/util/concurrent/Executor;", "Z", "isAudioEnabled", "isAudioInitialMuted", "isPersistent", "camera-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0 recorder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u outputOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Consumer<d2> eventListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Executor listenerExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isAudioEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isAudioInitialMuted;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isPersistent;

    public w(Context context, t0 recorder, u outputOptions) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(recorder, "recorder");
        p013kotlin.jvm.internal.s.k(outputOptions, "outputOptions");
        this.recorder = recorder;
        this.outputOptions = outputOptions;
        Context contextA = h0.f.a(context);
        p013kotlin.jvm.internal.s.j(contextA, "getApplicationContext(context)");
        this.applicationContext = contextA;
    }

    public static /* synthetic */ w l(w wVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return wVar.k(z11);
    }

    public final w a() {
        this.isPersistent = true;
        return this;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final Consumer<d2> c() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Executor getListenerExecutor() {
        return this.listenerExecutor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u getOutputOptions() {
        return this.outputOptions;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t0 getRecorder() {
        return this.recorder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsAudioEnabled() {
        return this.isAudioEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsAudioInitialMuted() {
        return this.isAudioInitialMuted;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsPersistent() {
        return this.isPersistent;
    }

    public final g1 j(Executor listenerExecutor, Consumer<d2> listener) {
        p013kotlin.jvm.internal.s.k(listenerExecutor, "listenerExecutor");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        u5.h.h(listenerExecutor, "Listener Executor can't be null.");
        u5.h.h(listener, "Event listener can't be null");
        this.listenerExecutor = listenerExecutor;
        this.eventListener = listener;
        g1 g1VarX0 = this.recorder.x0(this);
        p013kotlin.jvm.internal.s.j(g1VarX0, "recorder.start(this)");
        return g1VarX0;
    }

    public final w k(boolean initialMuted) {
        if (androidx.core.content.f.b(this.applicationContext, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        u5.h.j(this.recorder.P(), "The Recorder this recording is associated to doesn't support audio.");
        this.isAudioEnabled = true;
        this.isAudioInitialMuted = initialMuted;
        return this;
    }
}
