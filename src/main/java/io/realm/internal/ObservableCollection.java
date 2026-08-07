package io.realm.internal;

import io.realm.h0;
import io.realm.v;
import io.realm.w;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface ObservableCollection {

    public static class a implements j.a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OsCollectionChangeSet f78980a;

        a(OsCollectionChangeSet osCollectionChangeSet) {
            this.f78980a = osCollectionChangeSet;
        }

        @Override // io.realm.internal.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b bVar, Object obj) {
            bVar.a(obj, this.f78980a);
        }
    }

    public static class b<T> extends j.b<T, Object> {
        b(T t11, Object obj) {
            super(t11, obj);
        }

        public void a(T t11, OsCollectionChangeSet osCollectionChangeSet) {
            S s11 = this.f79088b;
            if (s11 instanceof w) {
                ((w) s11).a(t11, new r(osCollectionChangeSet));
            } else {
                if (s11 instanceof h0) {
                    ((h0) s11).a(t11);
                    return;
                }
                throw new RuntimeException("Unsupported listener type: " + this.f79088b);
            }
        }
    }

    public static class c<T> implements w<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h0<T> f78981a;

        public c(h0<T> h0Var) {
            this.f78981a = h0Var;
        }

        @Override // io.realm.w
        public void a(T t11, v vVar) {
            this.f78981a.a(t11);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && this.f78981a == ((c) obj).f78981a;
        }

        public int hashCode() {
            return this.f78981a.hashCode();
        }
    }

    void notifyChangeListeners(long j11);
}
