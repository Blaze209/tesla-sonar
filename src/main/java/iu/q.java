package iu;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q extends m implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient p f81912b;

    q() {
    }

    public static q h() {
        return s.f81917f;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            ((q) obj).i();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final p f() {
        p pVar = this.f81912b;
        if (pVar != null) {
            return pVar;
        }
        p pVarG = g();
        this.f81912b = pVarG;
        return pVarG;
    }

    abstract p g();

    abstract boolean i();
}
