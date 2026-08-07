package c0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final p f18376c = new a().d(0).b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final p f18377d = new a().d(1).b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<m> f18378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18379b;

    p(@NonNull LinkedHashSet<m> linkedHashSet, String str) {
        this.f18378a = linkedHashSet;
        this.f18379b = str;
    }

    @NonNull
    public LinkedHashSet<androidx.camera.core.impl.j0> a(@NonNull LinkedHashSet<androidx.camera.core.impl.j0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.j0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        List<n> listB = b(arrayList);
        LinkedHashSet<androidx.camera.core.impl.j0> linkedHashSet2 = new LinkedHashSet<>();
        for (androidx.camera.core.impl.j0 j0Var : linkedHashSet) {
            if (listB.contains(j0Var.c())) {
                linkedHashSet2.add(j0Var);
            }
        }
        return linkedHashSet2;
    }

    @NonNull
    public List<n> b(@NonNull List<n> list) {
        List<n> arrayList = new ArrayList<>(list);
        Iterator<m> it = this.f18378a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    @NonNull
    public LinkedHashSet<m> c() {
        return this.f18378a;
    }

    public Integer d() {
        Integer num = null;
        for (m mVar : this.f18378a) {
            if (mVar instanceof androidx.camera.core.impl.u1) {
                Integer numValueOf = Integer.valueOf(((androidx.camera.core.impl.u1) mVar).c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    @NonNull
    public androidx.camera.core.impl.j0 e(@NonNull LinkedHashSet<androidx.camera.core.impl.j0> linkedHashSet) {
        Iterator<androidx.camera.core.impl.j0> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final LinkedHashSet<m> f18380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18381b;

        public a() {
            this.f18380a = new LinkedHashSet<>();
        }

        @NonNull
        public static a c(@NonNull p pVar) {
            return new a(pVar.c());
        }

        @NonNull
        public a a(@NonNull m mVar) {
            this.f18380a.add(mVar);
            return this;
        }

        @NonNull
        public p b() {
            return new p(this.f18380a, this.f18381b);
        }

        @NonNull
        public a d(int i11) {
            u5.h.j(i11 != -1, "The specified lens facing is invalid.");
            this.f18380a.add(new androidx.camera.core.impl.u1(i11));
            return this;
        }

        private a(@NonNull LinkedHashSet<m> linkedHashSet) {
            this.f18380a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
