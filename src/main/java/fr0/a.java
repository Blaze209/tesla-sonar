package fr0;

import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b> f66407a = new ArrayList();

    public void n(b bVar) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(o());
            this.f66407a = arrayList;
            arrayList.add(bVar);
        }
    }

    public List<b> o() {
        return this.f66407a;
    }

    protected long p() {
        long size = 0;
        for (int i11 = 0; i11 < o().size(); i11++) {
            size += this.f66407a.get(i11).getSize();
        }
        return size;
    }

    public final void t(WritableByteChannel writableByteChannel) {
        Iterator<b> it = o().iterator();
        while (it.hasNext()) {
            it.next().c(writableByteChannel);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i11 = 0; i11 < this.f66407a.size(); i11++) {
            if (i11 > 0) {
                sb2.append(";");
            }
            sb2.append(this.f66407a.get(i11));
        }
        sb2.append("]");
        return sb2.toString();
    }
}
