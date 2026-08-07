package br0;

import com.adyen.checkout.components.core.Address;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import zq0.a;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g<R extends zq0.a> extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final Logger f17962g = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Random f17963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<R> f17964f;

    protected g(int i11, InputStream inputStream) {
        super(i11, inputStream);
        this.f17963e = new Random();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        try {
            List<R> listI = i();
            List<R> listI2 = ((g) obj).i();
            int size = listI.size();
            if (size != listI2.size()) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                R r11 = listI.get(i11);
                R r12 = listI2.get(i11);
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
            f17962g.log(Level.WARNING, "Wrong class", (Throwable) e11);
            return false;
        }
    }

    public void h(R r11) {
        if (this.f17964f == null) {
            this.f17964f = new ArrayList();
        }
        this.f17964f.add(r11);
    }

    public int hashCode() {
        Iterator<R> it = i().iterator();
        int iHashCode = 1234567891;
        while (it.hasNext()) {
            R next = it.next();
            iHashCode = next == null ? (iHashCode * 3) + 5 : ((iHashCode + next.hashCode()) * 5) + 7;
        }
        return (iHashCode * 7) + 11;
    }

    public List<R> i() {
        if (this.f17964f == null) {
            this.f17964f = new ArrayList();
        }
        return new ArrayList(this.f17964f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CBEFFDataGroup [");
        List<R> list = this.f17964f;
        if (list == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            Iterator<R> it = list.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                R next = it.next();
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(next == null ? Address.ADDRESS_NULL_PLACEHOLDER : next.toString());
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
