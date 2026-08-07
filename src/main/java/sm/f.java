package sm;

import java.util.Collections;
import java.util.List;
import pk.k;
import um.o;
import um.p;

/* JADX INFO: loaded from: classes3.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f111443a;

    private static class a implements b {
        @Override // sm.f.b
        public List<Integer> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // sm.f.b
        public int b() {
            return 0;
        }

        private a() {
        }
    }

    public interface b {
        List<Integer> a();

        int b();
    }

    public f() {
        this(new a());
    }

    @Override // sm.d
    public int a(int i11) {
        List<Integer> listA = this.f111443a.a();
        if (listA == null || listA.isEmpty()) {
            return i11 + 1;
        }
        for (int i12 = 0; i12 < listA.size(); i12++) {
            if (listA.get(i12).intValue() > i11) {
                return listA.get(i12).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // sm.d
    public p b(int i11) {
        return o.d(i11, i11 >= this.f111443a.b(), false);
    }

    @Override // sm.d
    public boolean c() {
        return true;
    }

    public f(b bVar) {
        this.f111443a = (b) k.g(bVar);
    }
}
