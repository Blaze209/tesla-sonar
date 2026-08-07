package com.tesla.geofence.supercharger;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.tesla.logging.g;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/tesla/geofence/supercharger/SuperchargerGeofenceBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperchargerGeofenceBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f56270b = g.INSTANCE.a("SuperchargerGeofenceRx");

    /* JADX INFO: renamed from: com.tesla.geofence.supercharger.SuperchargerGeofenceBroadcastReceiver$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tesla/geofence/supercharger/SuperchargerGeofenceBroadcastReceiver$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/PendingIntent;", "a", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PendingIntent a(Context context) {
            s.k(context, "context");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SuperchargerGeofenceBroadcastReceiver.class), 167772160);
            s.j(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceBroadcastReceiver$onReceive$1$1", f = "SuperchargerGeofenceBroadcastReceiver.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56271n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f56272o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Geofence f56273p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Location f56274q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Geofence geofence, Location location, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f56272o = context;
            this.f56273p = geofence;
            this.f56274q = location;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f56272o, this.f56273p, this.f56274q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56271n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    d dVarA = d.INSTANCE.a(this.f56272o);
                    String requestId = this.f56273p.getRequestId();
                    s.j(requestId, "getRequestId(...)");
                    Location location = this.f56274q;
                    this.f56271n = 1;
                    if (dVarA.v(requestId, 1, location, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
            } catch (Exception e11) {
                SuperchargerGeofenceBroadcastReceiver.f56270b.d("Failed to process geofence event: " + this.f56273p.getRequestId(), e11);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s.k(context, "context");
        s.k(intent, "intent");
        g gVar = f56270b;
        gVar.j("Geofence broadcast received");
        GeofencingEvent geofencingEventFromIntent = GeofencingEvent.fromIntent(intent);
        if (geofencingEventFromIntent == null) {
            gVar.j("GeofencingEvent is null");
            return;
        }
        if (geofencingEventFromIntent.hasError()) {
            gVar.j("Geofence error: " + geofencingEventFromIntent.getErrorCode());
            return;
        }
        int geofenceTransition = geofencingEventFromIntent.getGeofenceTransition();
        Location triggeringLocation = geofencingEventFromIntent.getTriggeringLocation();
        if (geofenceTransition != 1) {
            gVar.n("Unexpected geofence transition: " + geofenceTransition);
            return;
        }
        List<Geofence> triggeringGeofences = geofencingEventFromIntent.getTriggeringGeofences();
        if (triggeringGeofences == null || triggeringGeofences.isEmpty()) {
            gVar.n("No triggering geofences");
            return;
        }
        gVar.j("Geofence ENTER event for " + triggeringGeofences.size() + " geofences");
        Iterator<T> it = triggeringGeofences.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(context, (Geofence) it.next(), triggeringLocation, null), 3, null);
        }
    }
}
