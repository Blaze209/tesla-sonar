package androidx.media3.session;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class te {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final te f12414b = new b().e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12415c = s7.q0.N0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.collect.b0<se> f12416a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<se> f12417a;

        private void d(List<Integer> list) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                a(new se(list.get(i11).intValue()));
            }
        }

        public b a(se seVar) {
            this.f12417a.add((se) s7.a.f(seVar));
            return this;
        }

        b b() {
            d(se.f12343e);
            return this;
        }

        b c() {
            d(se.f12342d);
            return this;
        }

        public te e() {
            return new te(this.f12417a);
        }

        public b f(int i11) {
            s7.a.a(i11 != 0);
            for (se seVar : this.f12417a) {
                if (seVar.f12347a == i11) {
                    this.f12417a.remove(seVar);
                    break;
                }
            }
            return this;
        }

        public b() {
            this.f12417a = new HashSet();
        }

        private b(te teVar) {
            this.f12417a = new HashSet(((te) s7.a.f(teVar)).f12416a);
        }
    }

    private static boolean d(Collection<se> collection, int i11) {
        Iterator<se> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().f12347a == i11) {
                return true;
            }
        }
        return false;
    }

    public static te e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f12415c);
        if (parcelableArrayList == null) {
            s7.t.i("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return f12414b;
        }
        b bVar = new b();
        for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
            bVar.a(se.a((Bundle) parcelableArrayList.get(i11)));
        }
        return bVar.e();
    }

    public b a() {
        return new b();
    }

    public boolean b(int i11) {
        s7.a.b(i11 != 0, "Use contains(Command) for custom command");
        return d(this.f12416a, i11);
    }

    public boolean c(se seVar) {
        return this.f12416a.contains(s7.a.f(seVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof te) {
            return this.f12416a.equals(((te) obj).f12416a);
        }
        return false;
    }

    public Bundle f() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.common.collect.d1<se> it = this.f12416a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        bundle.putParcelableArrayList(f12415c, arrayList);
        return bundle;
    }

    public int hashCode() {
        return u5.c.b(this.f12416a);
    }

    private te(Collection<se> collection) {
        this.f12416a = com.google.common.collect.b0.m(collection);
    }
}
