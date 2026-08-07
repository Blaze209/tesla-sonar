package kk;

/* JADX INFO: loaded from: classes3.dex */
public class c implements j {

    class a implements i {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f.a aVar, f.a aVar2) {
            long jA = aVar.a();
            long jA2 = aVar2.a();
            if (jA < jA2) {
                return -1;
            }
            return jA2 == jA ? 0 : 1;
        }
    }

    @Override // kk.j
    public i get() {
        return new a();
    }
}
