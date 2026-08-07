package wu;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.firebase.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class b implements wu.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile wu.a f122364c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AppMeasurementSdk f122365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f122366b;

    class a implements wu.a.InterfaceC2629a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f122367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f122368b;

        a(b bVar, String str) {
            this.f122367a = str;
            Objects.requireNonNull(bVar);
            this.f122368b = bVar;
        }
    }

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f122365a = appMeasurementSdk;
        this.f122366b = new ConcurrentHashMap();
    }

    @NonNull
    @KeepForSdk
    public static wu.a h(@NonNull f fVar, @NonNull Context context, @NonNull vv.d dVar) {
        Preconditions.checkNotNull(fVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f122364c == null) {
            synchronized (b.class) {
                try {
                    if (f122364c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.b(com.google.firebase.b.class, d.f122370a, c.f122369a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f122364c = new b(zzfb.zza(context, bundle).zzb());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f122364c;
    }

    static /* synthetic */ void i(vv.a aVar) {
        boolean z11 = ((com.google.firebase.b) aVar.a()).f43867a;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f122364c)).f122365a.zza(z11);
        }
    }

    private final boolean j(@NonNull String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f122366b;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // wu.a
    @KeepForSdk
    public void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f122365a.logEvent(str, str2, bundle);
        }
    }

    @Override // wu.a
    @KeepForSdk
    public void b(@NonNull wu.a.c cVar) {
        String str;
        int i11 = com.google.firebase.analytics.connector.internal.b.f43857g;
        if (cVar == null || (str = cVar.f122349a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f122351c;
        if ((obj == null || zzlt.zzb(obj) != null) && com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, cVar.f122350b)) {
            String str2 = cVar.f122359k;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.b.b(str2, cVar.f122360l) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f122359k, cVar.f122360l))) {
                String str3 = cVar.f122356h;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.b.b(str3, cVar.f122357i) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f122356h, cVar.f122357i))) {
                    String str4 = cVar.f122354f;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.b.b(str4, cVar.f122355g) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f122354f, cVar.f122355g))) {
                        AppMeasurementSdk appMeasurementSdk = this.f122365a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f122349a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f122350b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.f122351c;
                        if (obj2 != null) {
                            zzjh.zza(bundle, obj2);
                        }
                        String str7 = cVar.f122352d;
                        if (str7 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f122353e);
                        String str8 = cVar.f122354f;
                        if (str8 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
                        }
                        Bundle bundle2 = cVar.f122355g;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str9 = cVar.f122356h;
                        if (str9 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
                        }
                        Bundle bundle3 = cVar.f122357i;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f122358j);
                        String str10 = cVar.f122359k;
                        if (str10 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
                        }
                        Bundle bundle4 = cVar.f122360l;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f122361m);
                        bundle.putBoolean("active", cVar.f122362n);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.f122363o);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // wu.a
    @KeepForSdk
    public void c(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, str2)) {
            this.f122365a.setUserProperty(str, str2, obj);
        }
    }

    @Override // wu.a
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.b(str2, bundle)) {
            this.f122365a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // wu.a
    @KeepForSdk
    public int d(@NonNull String str) {
        return this.f122365a.getMaxUserProperties(str);
    }

    @Override // wu.a
    @NonNull
    @KeepForSdk
    public List<wu.a.c> e(@NonNull String str, @NonNull String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f122365a.getConditionalUserProperties(str, str2)) {
            int i11 = com.google.firebase.analytics.connector.internal.b.f43857g;
            Preconditions.checkNotNull(bundle);
            wu.a.c cVar = new wu.a.c();
            cVar.f122349a = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, null));
            cVar.f122350b = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "name", String.class, null));
            cVar.f122351c = zzjh.zzb(bundle, "value", Object.class, null);
            cVar.f122352d = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            cVar.f122353e = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            cVar.f122354f = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            cVar.f122355g = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            cVar.f122356h = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            cVar.f122357i = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            cVar.f122358j = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            cVar.f122359k = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            cVar.f122360l = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            cVar.f122362n = ((Boolean) zzjh.zzb(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f122361m = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            cVar.f122363o = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // wu.a
    @NonNull
    @KeepForSdk
    public Map<String, Object> f(boolean z11) {
        return this.f122365a.getUserProperties(null, null, z11);
    }

    @Override // wu.a
    @NonNull
    @KeepForSdk
    public wu.a.InterfaceC2629a g(@NonNull String str, @NonNull wu.a.b bVar) {
        Object fVar;
        Preconditions.checkNotNull(bVar);
        if (com.google.firebase.analytics.connector.internal.b.a(str) && !j(str)) {
            AppMeasurementSdk appMeasurementSdk = this.f122365a;
            if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.d(appMeasurementSdk, bVar);
            } else {
                fVar = "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.f(appMeasurementSdk, bVar) : null;
            }
            if (fVar != null) {
                this.f122366b.put(str, fVar);
                return new a(this, str);
            }
        }
        return null;
    }
}
