package ib0;

import android.app.PendingIntent;
import android.content.Context;
import nd0.NotificationContent;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lib0/i;", "Lhb0/b;", "<init>", "()V", "", "vin", "Lic0/e;", "a", "(Ljava/lang/String;)Lic0/e;", "", "useShortContent", "Lnd0/c;", "b", "(Z)Lnd0/c;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements hb0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f77418a = new i();

    private i() {
    }

    @Override // hb0.b
    public ic0.e a(String vin) {
        s.k(vin, "vin");
        return ob0.e.m0(ob0.e.f97095a, vin, false, null, "push_notification_close_sunroof", 4, null);
    }

    @Override // nd0.a
    public NotificationContent b(boolean useShortContent) {
        return new NotificationContent(bc0.a.f17014u0, 0, 2, null);
    }

    @Override // nd0.a
    public PendingIntent c(Context context, int i11, String str) {
        return hb0.b.a.a(this, context, i11, str);
    }
}
