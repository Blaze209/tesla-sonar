package zi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"Lzi/a;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lzi/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", "(Lzi/b;)V", "a", "()V", "Lzi/b;", "Landroid/content/Context;", "appContext", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b listener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    public a(Context context) {
        s.k(context, "context");
        this.listener = b.INSTANCE.a();
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
    }

    public final void a() {
        this.listener = b.INSTANCE.a();
        try {
            this.appContext.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    public final void b(b listener) {
        s.k(listener, "listener");
        this.listener = listener;
        androidx.core.content.b.registerReceiver(this.appContext, this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 4);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !s.f("android.media.AUDIO_BECOMING_NOISY", intent.getAction())) {
            return;
        }
        this.listener.n();
    }
}
