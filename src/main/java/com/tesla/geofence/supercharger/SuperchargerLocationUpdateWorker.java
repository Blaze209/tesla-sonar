package com.tesla.geofence.supercharger;

import android.content.Context;
import android.location.Location;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c0;
import androidx.work.i0;
import androidx.work.l;
import androidx.work.s0;
import androidx.work.y;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tesla.logging.g;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tesla/geofence/supercharger/SuperchargerLocationUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperchargerLocationUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f56278d = g.INSTANCE.a("SuperchargerLocWorker");

    /* JADX INFO: renamed from: com.tesla.geofence.supercharger.SuperchargerLocationUpdateWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/tesla/geofence/supercharger/SuperchargerLocationUpdateWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/location/Location;", "location", "Ljn0/h0;", "a", "(Landroid/content/Context;Landroid/location/Location;)V", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "WORK_NAME", "KEY_LATITUDE", "KEY_LONGITUDE", "KEY_ACCURACY", "KEY_TIME", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, Location location) {
            s.k(context, "context");
            SuperchargerLocationUpdateWorker.f56278d.j("Enqueueing expedited location update work (location: " + (location != null) + ")");
            androidx.work.g.a aVar = new androidx.work.g.a();
            if (location != null) {
                aVar.g(OrcaKeys.LATITUDE, location.getLatitude());
                aVar.g(OrcaKeys.LONGITUDE, location.getLongitude());
                aVar.h("accuracy", location.getAccuracy());
                aVar.j("time", location.getTime());
            }
            s0.INSTANCE.a(context).c("SuperchargerLocationUpdateWorker", l.REPLACE, new c0.a(SuperchargerLocationUpdateWorker.class).k(i0.RUN_AS_NON_EXPEDITED_WORK_REQUEST).n(aVar.a()).b());
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerLocationUpdateWorker", f = "SuperchargerLocationUpdateWorker.kt", i = {}, l = {97}, m = "doWork", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f56279n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f56281p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56279n = obj;
            this.f56281p |= Integer.MIN_VALUE;
            return SuperchargerLocationUpdateWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperchargerLocationUpdateWorker(Context context, WorkerParameters params) {
        super(context, params);
        s.k(context, "context");
        s.k(params, "params");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super y.a> continuation) {
        b bVar;
        Location location;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f56281p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f56281p = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f56279n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f56281p;
        try {
            if (i12 == 0) {
                t.b(obj);
                g gVar = f56278d;
                gVar.j("SuperchargerLocationUpdateWorker executing (expedited)");
                if (getInputData().g().containsKey(OrcaKeys.LATITUDE)) {
                    location = new Location("fused");
                    location.setLatitude(getInputData().d(OrcaKeys.LATITUDE, 0.0d));
                    location.setLongitude(getInputData().d(OrcaKeys.LONGITUDE, 0.0d));
                    location.setAccuracy(getInputData().e("accuracy", BitmapDescriptorFactory.HUE_RED));
                    location.setTime(getInputData().h("time", System.currentTimeMillis()));
                } else {
                    location = null;
                }
                if (location != null) {
                    gVar.j("Using provided location: lat=" + location.getLatitude() + ", lng=" + location.getLongitude() + ", age=" + (System.currentTimeMillis() - location.getTime()) + "ms");
                } else {
                    gVar.j("No location provided, will request fresh location");
                }
                d.Companion companion = d.INSTANCE;
                Context applicationContext = getApplicationContext();
                s.j(applicationContext, "getApplicationContext(...)");
                d dVarA = companion.a(applicationContext);
                bVar.f56281p = 1;
                if (dVarA.D(location, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            f56278d.j("SuperchargerLocationUpdateWorker completed successfully");
            return y.a.e();
        } catch (SecurityException e11) {
            f56278d.d("Location permissions revoked, failing permanently", e11);
            return y.a.a();
        } catch (Exception e12) {
            f56278d.d("SuperchargerLocationUpdateWorker failed, will retry", e12);
            return y.a.d();
        }
    }
}
