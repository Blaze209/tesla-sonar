package ng0;

import android.content.Context;
import java.util.Set;
import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements qj0.e<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<Set<a>> f95001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i<Context> f95002b;

    public c(i<Set<a>> iVar, i<Context> iVar2) {
        this.f95001a = iVar;
        this.f95002b = iVar2;
    }

    public static c a(i<Set<a>> iVar, i<Context> iVar2) {
        return new c(iVar, iVar2);
    }

    public static b c(Set<a> set, Context context) {
        return new b(set, context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f95001a.get(), this.f95002b.get());
    }
}
