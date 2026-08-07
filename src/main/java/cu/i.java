package cu;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class i extends du.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f59181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f59182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f59181b = taskCompletionSource2;
        this.f59182c = lVar;
    }

    @Override // du.j
    protected final void a() {
        try {
            du.f fVar = (du.f) this.f59182c.f59187a.e();
            String str = this.f59182c.f59188b;
            Bundle bundle = new Bundle();
            Map mapA = m.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            l lVar = this.f59182c;
            fVar.F2(str, bundle, new k(lVar, this.f59181b, lVar.f59188b));
        } catch (RemoteException e11) {
            l.f59186c.b(e11, "error requesting in-app review for %s", this.f59182c.f59188b);
            this.f59181b.trySetException(new RuntimeException(e11));
        }
    }
}
