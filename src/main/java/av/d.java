package av;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yv.a<wu.a> f15140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile cv.a f15141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile dv.b f15142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<dv.a> f15143d;

    public d(yv.a<wu.a> aVar) {
        this(aVar, new dv.c(), new cv.f());
    }

    public static /* synthetic */ void a(d dVar, yv.b bVar) {
        dVar.getClass();
        bv.g.f().b("AnalyticsConnector now available.");
        wu.a aVar = (wu.a) bVar.get();
        cv.e eVar = new cv.e(aVar);
        e eVar2 = new e();
        if (g(aVar, eVar2) == null) {
            bv.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        bv.g.f().b("Registered Firebase Analytics listener.");
        cv.d dVar2 = new cv.d();
        cv.c cVar = new cv.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (dVar) {
            try {
                Iterator<dv.a> it = dVar.f15143d.iterator();
                while (it.hasNext()) {
                    dVar2.a(it.next());
                }
                eVar2.d(dVar2);
                eVar2.e(cVar);
                dVar.f15142c = dVar2;
                dVar.f15141b = cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void c(d dVar, dv.a aVar) {
        synchronized (dVar) {
            try {
                if (dVar.f15142c instanceof dv.c) {
                    dVar.f15143d.add(aVar);
                }
                dVar.f15142c.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void f() {
        this.f15140a.a(new yv.a.InterfaceC2735a() { // from class: av.c
            @Override // yv.a.InterfaceC2735a
            public final void a(yv.b bVar) {
                d.a(this.f15139a, bVar);
            }
        });
    }

    private static wu.a.InterfaceC2629a g(@NonNull wu.a aVar, @NonNull e eVar) {
        wu.a.InterfaceC2629a interfaceC2629aG = aVar.g("clx", eVar);
        if (interfaceC2629aG != null) {
            return interfaceC2629aG;
        }
        bv.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        wu.a.InterfaceC2629a interfaceC2629aG2 = aVar.g(AppMeasurement.CRASH_ORIGIN, eVar);
        if (interfaceC2629aG2 != null) {
            bv.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC2629aG2;
    }

    public cv.a d() {
        return new cv.a() { // from class: av.b
            @Override // cv.a
            public final void a(String str, Bundle bundle) {
                this.f15138a.f15141b.a(str, bundle);
            }
        };
    }

    public dv.b e() {
        return new dv.b() { // from class: av.a
            @Override // dv.b
            public final void a(dv.a aVar) {
                d.c(this.f15137a, aVar);
            }
        };
    }

    public d(yv.a<wu.a> aVar, @NonNull dv.b bVar, @NonNull cv.a aVar2) {
        this.f15140a = aVar;
        this.f15142c = bVar;
        this.f15143d = new ArrayList();
        this.f15141b = aVar2;
        f();
    }
}
