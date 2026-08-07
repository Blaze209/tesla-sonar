package sw;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f111911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f111912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f111913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<uw.f> f111914d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(@NonNull f fVar, @NonNull a aVar, @NonNull Executor executor) {
        this.f111911a = fVar;
        this.f111912b = aVar;
        this.f111913c = executor;
    }

    public static /* synthetic */ void a(e eVar, Task task, final uw.f fVar, g gVar) {
        eVar.getClass();
        try {
            g gVar2 = (g) task.getResult();
            if (gVar2 != null) {
                final uw.e eVarB = eVar.f111912b.b(gVar2);
                eVar.f111913c.execute(new Runnable() { // from class: sw.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e11) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e11);
        }
    }

    public void d(@NonNull g gVar) {
        try {
            final uw.e eVarB = this.f111912b.b(gVar);
            for (final uw.f fVar : this.f111914d) {
                this.f111913c.execute(new Runnable() { // from class: sw.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e11) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
        }
    }

    public void e(@NonNull final uw.f fVar) {
        this.f111914d.add(fVar);
        final Task<g> taskE = this.f111911a.e();
        taskE.addOnSuccessListener(this.f111913c, new OnSuccessListener() { // from class: sw.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                e.a(this.f111904a, taskE, fVar, (g) obj);
            }
        });
    }
}
