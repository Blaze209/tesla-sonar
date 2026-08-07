package ka;

import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.s0;
import java.lang.ref.WeakReference;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lka/a;", "Landroidx/lifecycle/c1;", "Landroidx/lifecycle/s0;", "handle", "<init>", "(Landroidx/lifecycle/s0;)V", "Ljn0/h0;", "onCleared", "()V", "", "s", "Ljava/lang/String;", "IdKey", "Ljava/util/UUID;", "t", "Ljava/util/UUID;", "f", "()Ljava/util/UUID;", "id", "Ljava/lang/ref/WeakReference;", "La3/d;", "u", "Ljava/lang/ref/WeakReference;", "g", "()Ljava/lang/ref/WeakReference;", "h", "(Ljava/lang/ref/WeakReference;)V", "saveableStateHolderRef", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final UUID id;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public WeakReference<a3.d> saveableStateHolderRef;

    public a(s0 s0Var) {
        UUID uuidRandomUUID = (UUID) s0Var.f("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            s0Var.n("SaveableStateHolder_BackStackEntryKey", uuidRandomUUID);
        }
        this.id = uuidRandomUUID;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WeakReference<a3.d> g() {
        WeakReference<a3.d> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        s.B("saveableStateHolderRef");
        return null;
    }

    public final void h(WeakReference<a3.d> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }

    @Override // androidx.p003lifecycle.c1
    protected void onCleared() {
        super.onCleared();
        a3.d dVar = g().get();
        if (dVar != null) {
            dVar.d(this.id);
        }
        g().clear();
    }
}
