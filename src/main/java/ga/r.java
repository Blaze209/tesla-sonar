package ga;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.session.t7;

/* JADX INFO: loaded from: classes3.dex */
public class r extends androidx.core.app.o.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final t7 f67698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f67699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    CharSequence f67700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f67701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    PendingIntent f67702i;

    public r(t7 t7Var) {
        this.f67698e = t7Var;
    }

    @Override // androidx.core.app.o.h
    public void b(androidx.core.app.n nVar) {
        CharSequence charSequence;
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession(this.f67698e.j());
        int[] iArr = this.f67699f;
        if (iArr != null) {
            mediaSession.setShowActionsInCompactView(iArr);
        }
        if (Build.VERSION.SDK_INT >= 34 && (charSequence = this.f67700g) != null) {
            q.a(mediaSession, charSequence, this.f67701h, this.f67702i);
            nVar.a().setStyle(mediaSession);
        } else {
            nVar.a().setStyle(mediaSession);
            Bundle bundle = new Bundle();
            bundle.putBundle("androidx.media3.session", this.f67698e.o().k());
            nVar.a().addExtras(bundle);
        }
    }

    public r h(int... iArr) {
        this.f67699f = iArr;
        return this;
    }
}
