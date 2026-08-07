package net.time4j.history;

import ch.qos.logback.core.CoreConstants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final o f94610d = new o(n.BEGIN_OF_JANUARY, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator<o> f94611e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<o> f94612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f94613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94614c;

    private static class b implements Comparator<o> {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(o oVar, o oVar2) {
            if (oVar.f94614c < oVar2.f94614c) {
                return -1;
            }
            return oVar.f94614c > oVar2.f94614c ? 1 : 0;
        }
    }

    o(n nVar, int i11) {
        this.f94612a = Collections.EMPTY_LIST;
        this.f94613b = nVar;
        this.f94614c = i11;
    }

    static o e(DataInput dataInput) throws IOException {
        int i11 = dataInput.readInt();
        if (i11 == 0) {
            n nVarValueOf = n.valueOf(dataInput.readUTF());
            int i12 = dataInput.readInt();
            return (i12 == Integer.MAX_VALUE && nVarValueOf == n.BEGIN_OF_JANUARY) ? f94610d : new o(nVarValueOf, i12);
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new o(n.valueOf(dataInput.readUTF()), dataInput.readInt()));
        }
        return new o(arrayList);
    }

    public o b(o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f94612a);
        if (arrayList.isEmpty()) {
            arrayList.add(this);
        }
        if (oVar.f94612a.isEmpty()) {
            arrayList.add(oVar);
        } else {
            arrayList.addAll(oVar.f94612a);
        }
        return new o(arrayList);
    }

    int c(h hVar) {
        int iAnnoDomini = hVar.c().annoDomini(hVar.e());
        int size = this.f94612a.size();
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = this.f94612a.get(i12);
            if (iAnnoDomini >= i11 && iAnnoDomini < oVar.f94614c) {
                return oVar.f94613b.displayedYear(this, hVar);
            }
            i11 = oVar.f94614c;
        }
        return this.f94613b.displayedYear(this, hVar);
    }

    h d(j jVar, int i11) {
        return f(jVar, i11).newYear(jVar, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f94612a.equals(oVar.f94612a) && this.f94613b == oVar.f94613b && this.f94614c == oVar.f94614c) {
                return true;
            }
        }
        return false;
    }

    n f(j jVar, int i11) {
        int iAnnoDomini = jVar.annoDomini(i11);
        int size = this.f94612a.size();
        int i12 = Integer.MIN_VALUE;
        n nVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            o oVar = this.f94612a.get(i13);
            if (iAnnoDomini >= i12 && iAnnoDomini < oVar.f94614c) {
                return oVar.f94613b;
            }
            i12 = oVar.f94614c;
            nVar = oVar.f94613b;
        }
        return (iAnnoDomini == i12 && jVar == j.BYZANTINE && nVar == n.BEGIN_OF_SEPTEMBER) ? nVar : this.f94613b;
    }

    void g(DataOutput dataOutput) throws IOException {
        int size = this.f94612a.size();
        dataOutput.writeInt(size);
        if (size == 0) {
            dataOutput.writeUTF(this.f94613b.name());
            dataOutput.writeInt(this.f94614c);
            return;
        }
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = this.f94612a.get(i11);
            dataOutput.writeUTF(oVar.f94613b.name());
            dataOutput.writeInt(oVar.f94614c);
        }
    }

    public int hashCode() {
        return (this.f94612a.hashCode() * 17) + (this.f94613b.hashCode() * 37) + this.f94614c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f94612a.isEmpty()) {
            sb2.append('[');
            sb2.append(this.f94613b);
            if (this.f94614c != Integer.MAX_VALUE) {
                sb2.append("->");
                sb2.append(this.f94614c);
            }
        } else {
            boolean z11 = true;
            for (o oVar : this.f94612a) {
                if (z11) {
                    sb2.append('[');
                    z11 = false;
                } else {
                    sb2.append(CoreConstants.COMMA_CHAR);
                }
                sb2.append(oVar.f94613b);
                sb2.append("->");
                sb2.append(oVar.f94614c);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    o(List<o> list) {
        Collections.sort(list, f94611e);
        Iterator<o> it = list.iterator();
        o oVar = null;
        while (it.hasNext()) {
            o next = it.next();
            if (oVar == null || next.f94614c != oVar.f94614c) {
                oVar = next;
            } else if (next.f94613b == oVar.f94613b) {
                it.remove();
            } else {
                throw new IllegalArgumentException("Multiple strategies with overlapping validity range: " + list);
            }
        }
        this.f94612a = Collections.unmodifiableList(list);
        this.f94613b = n.BEGIN_OF_JANUARY;
        this.f94614c = Integer.MAX_VALUE;
    }
}
