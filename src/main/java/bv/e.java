package bv;

import fv.p;
import java.util.ArrayList;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lbv/e;", "Luw/f;", "Lfv/p;", "userMetadata", "<init>", "(Lfv/p;)V", "Luw/e;", "rolloutsState", "Ljn0/h0;", "a", "(Luw/e;)V", "Lfv/p;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements uw.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p userMetadata;

    public e(p userMetadata) {
        s.k(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    @Override // uw.f
    public void a(uw.e rolloutsState) {
        s.k(rolloutsState, "rolloutsState");
        p pVar = this.userMetadata;
        Set<uw.d> setB = rolloutsState.b();
        s.j(setB, "getRolloutAssignments(...)");
        Set<uw.d> set = setB;
        ArrayList arrayList = new ArrayList(v.y(set, 10));
        for (uw.d dVar : set) {
            arrayList.add(fv.j.b(dVar.d(), dVar.b(), dVar.c(), dVar.f(), dVar.e()));
        }
        pVar.r(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
