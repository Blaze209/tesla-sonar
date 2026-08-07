package ib0;

import android.app.PendingIntent;
import android.content.Context;
import nd0.NotificationContent;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lib0/e;", "Lhb0/b;", "", "manualOverride", "<init>", "(Z)V", "", "vin", "Lic0/e;", "a", "(Ljava/lang/String;)Lic0/e;", "useShortContent", "Lnd0/c;", "b", "(Z)Lnd0/c;", "Z", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements hb0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean manualOverride;

    public e(boolean z11) {
        this.manualOverride = z11;
    }

    @Override // hb0.b
    public ic0.e a(String vin) {
        s.k(vin, "vin");
        return ob0.e.q(ob0.e.f97095a, vin, this.manualOverride, null, "push_notification_climate_on", 4, null);
    }

    @Override // nd0.a
    public NotificationContent b(boolean useShortContent) {
        return new NotificationContent(useShortContent ? bc0.a.D0 : bc0.a.C0, 0, 2, null);
    }

    @Override // nd0.a
    public PendingIntent c(Context context, int i11, String str) {
        return hb0.b.a.a(this, context, i11, str);
    }

    public /* synthetic */ e(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
