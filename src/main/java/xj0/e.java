package xj0;

import ezvcard.property.VCardProperty;
import ezvcard.util.g;
import ezvcard.util.h;
import java.text.NumberFormat;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class e implements Iterable<Map.Entry<VCardProperty, List<d>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<VCardProperty, d> f123624a = new g<>(new IdentityHashMap());

    public void a(VCardProperty vCardProperty, List<d> list) {
        this.f123624a.g(vCardProperty, list);
    }

    public void b(VCardProperty vCardProperty, d dVar) {
        this.f123624a.f(vCardProperty, dVar);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<VCardProperty, List<d>>> iterator() {
        return this.f123624a.iterator();
    }

    public String toString() {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setMinimumIntegerDigits(2);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<VCardProperty, List<d>> entry : this.f123624a) {
            VCardProperty key = entry.getKey();
            for (d dVar : entry.getValue()) {
                if (key != null) {
                    sb2.append('[');
                    sb2.append(key.getClass().getSimpleName());
                    sb2.append("] | ");
                }
                Integer numA = dVar.a();
                if (numA != null) {
                    sb2.append('W');
                    sb2.append(integerInstance.format(numA));
                    sb2.append(": ");
                }
                sb2.append(dVar.b());
                sb2.append(h.f63685a);
            }
        }
        return sb2.toString();
    }
}
