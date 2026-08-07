package tf;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f113316a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<b> f113317b = new androidx.collection.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, hg.i> f113318c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator<u5.d<String, Float>> f113319d = new a();

    class a implements Comparator<u5.d<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(u5.d<String, Float> dVar, u5.d<String, Float> dVar2) {
            float fFloatValue = dVar.f115408b.floatValue();
            float fFloatValue2 = dVar2.f115408b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f11);
    }

    public void a(String str, float f11) {
        if (this.f113316a) {
            hg.i iVar = this.f113318c.get(str);
            if (iVar == null) {
                iVar = new hg.i();
                this.f113318c.put(str, iVar);
            }
            iVar.a(f11);
            if (str.equals("__container")) {
                Iterator<b> it = this.f113317b.iterator();
                while (it.hasNext()) {
                    it.next().a(f11);
                }
            }
        }
    }

    void b(boolean z11) {
        this.f113316a = z11;
    }
}
