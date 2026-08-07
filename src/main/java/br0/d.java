package br0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d<R extends Serializable> extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f17953c = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<R> f17954b;

    protected void b(R r11) {
        if (this.f17954b == null) {
            this.f17954b = new ArrayList();
        }
        this.f17954b.add(r11);
    }

    protected List<R> c() {
        if (this.f17954b == null) {
            this.f17954b = new ArrayList();
        }
        return new ArrayList(this.f17954b);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            List<R> listC = c();
            List<R> listC2 = ((d) obj).c();
            int size = listC.size();
            if (size != listC2.size()) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                R r11 = listC.get(i11);
                R r12 = listC2.get(i11);
                if (r11 == null) {
                    if (r12 != null) {
                        return false;
                    }
                } else if (!r11.equals(r12)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException e11) {
            f17953c.log(Level.WARNING, "Wrong class", (Throwable) e11);
            return false;
        }
    }

    public int hashCode() {
        Iterator<R> it = c().iterator();
        int iHashCode = 1234567891;
        while (it.hasNext()) {
            R next = it.next();
            iHashCode = next == null ? (iHashCode * 3) + 5 : ((iHashCode + next.hashCode()) * 5) + 7;
        }
        return (iHashCode * 7) + 11;
    }
}
