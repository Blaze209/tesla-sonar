package com.teslamotors.plugins.ble;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/teslamotors/plugins/ble/h1;", "Lcom/teslamotors/plugins/ble/Peripheral$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "vin", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "onDisconnected", "Landroid/content/Context;", "", "b", "Ljava/util/Set;", "connected", "Lwm0/e;", "", "c", "Lwm0/e;", "_hasConnections", "Lwm0/a;", "", DateTokenConverter.CONVERTER_KEY, "Lwm0/a;", "_connectedVins", "Lio/reactivex/rxjava3/core/o;", "()Lio/reactivex/rxjava3/core/o;", "hasConnections", "e", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h1 implements Peripheral.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.tesla.logging.g f56880f = com.tesla.logging.g.INSTANCE.a("VehicleConnectedListener");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<String> connected;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wm0.e<Boolean> _hasConnections;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wm0.a<Set<String>> _connectedVins;

    public h1(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        this.connected = new LinkedHashSet();
        wm0.e eVarB0 = wm0.a.d0().b0();
        p013kotlin.jvm.internal.s.j(eVarB0, "toSerialized(...)");
        this._hasConnections = eVarB0;
        wm0.a<Set<String>> aVarD0 = wm0.a.d0();
        p013kotlin.jvm.internal.s.j(aVarD0, "create(...)");
        this._connectedVins = aVarD0;
    }

    @Override // com.teslamotors.plugins.ble.Peripheral.b
    public void a(String vin) {
        if (vin == null) {
            return;
        }
        synchronized (this) {
            this.connected.add(vin);
            this._connectedVins.onNext(this.connected);
            f56880f.j(vin + " connected. connected: " + this.connected);
            this._hasConnections.onNext(Boolean.TRUE);
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }

    public final io.reactivex.rxjava3.core.o<Boolean> b() {
        return this._hasConnections;
    }

    @Override // com.teslamotors.plugins.ble.Peripheral.b
    public void onDisconnected(String vin) {
        if (vin == null) {
            return;
        }
        synchronized (this) {
            try {
                this.connected.remove(vin);
                this._connectedVins.onNext(this.connected);
                f56880f.j(vin + " disconnected. peripherals connected: " + this.connected);
                if (this.connected.isEmpty()) {
                    this._hasConnections.onNext(Boolean.FALSE);
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
