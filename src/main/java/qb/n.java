package qb;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ob.NetworkState;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lqb/n;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lub/b;", "taskExecutor", "Lqb/h;", "", "batteryChargingTracker", "Lqb/c;", "batteryNotLowTracker", "Lob/h;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Lub/b;Lqb/h;Lqb/c;Lqb/h;Lqb/h;)V", "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Lqb/h;", "()Lqb/h;", "Lqb/c;", "()Lqb/c;", DateTokenConverter.CONVERTER_KEY, "e", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> batteryChargingTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c batteryNotLowTracker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h<NetworkState> networkStateTracker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> storageNotLowTracker;

    public n(Context context, ub.b taskExecutor, h<Boolean> batteryChargingTracker, c batteryNotLowTracker, h<NetworkState> networkStateTracker, h<Boolean> storageNotLowTracker) {
        s.k(context, "context");
        s.k(taskExecutor, "taskExecutor");
        s.k(batteryChargingTracker, "batteryChargingTracker");
        s.k(batteryNotLowTracker, "batteryNotLowTracker");
        s.k(networkStateTracker, "networkStateTracker");
        s.k(storageNotLowTracker, "storageNotLowTracker");
        this.context = context;
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = networkStateTracker;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    public final h<Boolean> a() {
        return this.batteryChargingTracker;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final h<NetworkState> d() {
        return this.networkStateTracker;
    }

    public final h<Boolean> e() {
        return this.storageNotLowTracker;
    }

    public /* synthetic */ n(Context context, ub.b bVar, h hVar, c cVar, h hVar2, h hVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        h aVar;
        c cVar2;
        h hVarA;
        h lVar;
        if ((i11 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            aVar = new a(applicationContext, bVar);
        } else {
            aVar = hVar;
        }
        if ((i11 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            s.j(applicationContext2, "getApplicationContext(...)");
            cVar2 = new c(applicationContext2, bVar);
        } else {
            cVar2 = cVar;
        }
        if ((i11 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            s.j(applicationContext3, "getApplicationContext(...)");
            hVarA = k.a(applicationContext3, bVar);
        } else {
            hVarA = hVar2;
        }
        if ((i11 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            s.j(applicationContext4, "getApplicationContext(...)");
            lVar = new l(applicationContext4, bVar);
        } else {
            lVar = hVar3;
        }
        this(context, bVar, aVar, cVar2, hVarA, lVar);
    }
}
