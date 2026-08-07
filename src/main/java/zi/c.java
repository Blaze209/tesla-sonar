package zi;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import com.brentvatne.exoplayer.p0;
import com.facebook.react.uimanager.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzi/c;", "Landroid/content/BroadcastReceiver;", "Lcom/brentvatne/exoplayer/p0;", "view", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/brentvatne/exoplayer/p0;Lcom/facebook/react/uimanager/v0;)V", "Landroid/content/Context;", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "c", "()V", "b", "", "isPaused", "Landroid/app/PendingIntent;", "a", "(Z)Landroid/app/PendingIntent;", "Lcom/brentvatne/exoplayer/p0;", "Lcom/facebook/react/uimanager/v0;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    public c(p0 view, v0 context) {
        s.k(view, "view");
        s.k(context, "context");
        this.view = view;
        this.context = context;
    }

    public final PendingIntent a(boolean isPaused) {
        int i11 = isPaused ? 1 : 2;
        Intent intentPutExtra = new Intent("rnv_media_control").putExtra("rnv_control_type", isPaused ? 1 : 2);
        s.j(intentPutExtra, "putExtra(...)");
        intentPutExtra.setPackage(this.context.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, i11, intentPutExtra, 201326592);
        s.j(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public final void b() {
        try {
            this.context.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    public final void c() {
        androidx.core.content.b.registerReceiver(this.context, this, new IntentFilter("rnv_media_control"), 4);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && s.f(intent.getAction(), "rnv_media_control")) {
            int intExtra = intent.getIntExtra("rnv_control_type", 0);
            if (intExtra == 1) {
                this.view.setPausedModifier(false);
            } else {
                if (intExtra != 2) {
                    return;
                }
                this.view.setPausedModifier(true);
            }
        }
    }
}
