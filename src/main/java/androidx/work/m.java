package androidx.work;

import android.app.Notification;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f14650c;

    public m(int i11, Notification notification) {
        this(i11, notification, 0);
    }

    public int a() {
        return this.f14649b;
    }

    public Notification b() {
        return this.f14650c;
    }

    public int c() {
        return this.f14648a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f14648a == mVar.f14648a && this.f14649b == mVar.f14649b) {
            return this.f14650c.equals(mVar.f14650c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14648a * 31) + this.f14649b) * 31) + this.f14650c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f14648a + ", mForegroundServiceType=" + this.f14649b + ", mNotification=" + this.f14650c + CoreConstants.CURLY_RIGHT;
    }

    public m(int i11, Notification notification, int i12) {
        this.f14648a = i11;
        this.f14650c = notification;
        this.f14649b = i12;
    }
}
