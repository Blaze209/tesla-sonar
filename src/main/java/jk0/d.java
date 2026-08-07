package jk0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class d extends AbstractMap implements Map, Cloneable, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static a f83932i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient b[] f83933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f83934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f83935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f83936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f83937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient Set f83938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f83939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Collection f83940h;

    private static class a implements Iterator {
        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f83941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f83942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f83943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        b f83944d;

        b(int i11, Object obj, Object obj2, b bVar) {
            this.f83941a = i11;
            this.f83942b = obj;
            this.f83943c = obj2;
            this.f83944d = bVar;
        }

        protected Object clone() {
            int i11 = this.f83941a;
            Object obj = this.f83942b;
            Object obj2 = this.f83943c;
            b bVar = this.f83944d;
            return new b(i11, obj, obj2, bVar == null ? null : (b) bVar.clone());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.f83942b == entry.getKey()) {
                Object obj2 = this.f83943c;
                if (obj2 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj2.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f83942b;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f83943c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i11 = this.f83941a;
            Object obj = this.f83943c;
            return i11 ^ (obj == null ? 0 : obj.hashCode());
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f83943c;
            this.f83943c = obj;
            return obj2;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f83942b);
            stringBuffer.append("=");
            stringBuffer.append(this.f83943c);
            return stringBuffer.toString();
        }
    }

    private class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b[] f83945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f83946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        b f83947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        b f83948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f83950f;

        c(int i11) {
            b[] bVarArr = d.this.f83933a;
            this.f83945a = bVarArr;
            this.f83946b = bVarArr.length;
            this.f83947c = null;
            this.f83948d = null;
            this.f83950f = d.this.f83937e;
            this.f83949e = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b bVar = this.f83947c;
            int i11 = this.f83946b;
            b[] bVarArr = this.f83945a;
            while (bVar == null && i11 > 0) {
                i11--;
                bVar = bVarArr[i11];
            }
            this.f83947c = bVar;
            this.f83946b = i11;
            return bVar != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (d.this.f83937e != this.f83950f) {
                throw new ConcurrentModificationException();
            }
            b bVar = this.f83947c;
            int i11 = this.f83946b;
            b[] bVarArr = this.f83945a;
            while (bVar == null && i11 > 0) {
                i11--;
                bVar = bVarArr[i11];
            }
            this.f83947c = bVar;
            this.f83946b = i11;
            if (bVar == null) {
                throw new NoSuchElementException();
            }
            this.f83948d = bVar;
            this.f83947c = bVar.f83944d;
            int i12 = this.f83949e;
            if (i12 == 0) {
                return bVar.f83942b;
            }
            return i12 == 1 ? bVar.f83943c : bVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f83948d == null) {
                throw new IllegalStateException();
            }
            if (d.this.f83937e != this.f83950f) {
                throw new ConcurrentModificationException();
            }
            b[] bVarArr = d.this.f83933a;
            int length = (this.f83948d.f83941a & Integer.MAX_VALUE) % bVarArr.length;
            b bVar = null;
            for (b bVar2 = bVarArr[length]; bVar2 != null; bVar2 = bVar2.f83944d) {
                if (bVar2 == this.f83948d) {
                    d.i(d.this);
                    this.f83950f++;
                    if (bVar == null) {
                        bVarArr[length] = bVar2.f83944d;
                    } else {
                        bVar.f83944d = bVar2.f83944d;
                    }
                    d.d(d.this);
                    this.f83948d = null;
                    return;
                }
                bVar = bVar2;
            }
            throw new ConcurrentModificationException();
        }
    }

    public d(int i11, float f11) {
        this.f83937e = 0;
        this.f83938f = null;
        this.f83939g = null;
        this.f83940h = null;
        if (i11 < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Illegal Initial Capacity: ");
            stringBuffer.append(i11);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        if (f11 <= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f11)) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Illegal Load factor: ");
            stringBuffer2.append(f11);
            throw new IllegalArgumentException(stringBuffer2.toString());
        }
        i11 = i11 == 0 ? 1 : i11;
        this.f83936d = f11;
        this.f83933a = new b[i11];
        this.f83935c = (int) (i11 * f11);
    }

    static /* synthetic */ int d(d dVar) {
        int i11 = dVar.f83934b;
        dVar.f83934b = i11 - 1;
        return i11;
    }

    static /* synthetic */ int i(d dVar) {
        int i11 = dVar.f83937e;
        dVar.f83937e = i11 + 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator j(int i11) {
        return this.f83934b == 0 ? f83932i : new c(i11);
    }

    private void k() {
        b[] bVarArr = this.f83933a;
        int length = bVarArr.length;
        int i11 = (length * 2) + 1;
        b[] bVarArr2 = new b[i11];
        this.f83937e++;
        this.f83935c = (int) (i11 * this.f83936d);
        this.f83933a = bVarArr2;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return;
            }
            b bVar = bVarArr[i12];
            while (bVar != null) {
                b bVar2 = bVar.f83944d;
                int i13 = (bVar.f83941a & Integer.MAX_VALUE) % i11;
                bVar.f83944d = bVarArr2[i13];
                bVarArr2[i13] = bVar;
                bVar = bVar2;
            }
            length = i12;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b[] bVarArr = this.f83933a;
        this.f83937e++;
        int length = bVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                this.f83934b = 0;
                return;
            }
            bVarArr[length] = null;
        }
    }

    @Override // java.util.AbstractMap
    public Object clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f83933a = new b[this.f83933a.length];
            int length = this.f83933a.length;
            while (true) {
                int i11 = length - 1;
                b bVar = null;
                if (length <= 0) {
                    dVar.f83938f = null;
                    dVar.f83939g = null;
                    dVar.f83940h = null;
                    dVar.f83937e = 0;
                    return dVar;
                }
                b[] bVarArr = dVar.f83933a;
                b bVar2 = this.f83933a[i11];
                if (bVar2 != null) {
                    bVar = (b) bVar2.clone();
                }
                bVarArr[i11] = bVar;
                length = i11;
            }
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        b[] bVarArr = this.f83933a;
        if (obj != null) {
            int iIdentityHashCode = System.identityHashCode(obj);
            for (b bVar = bVarArr[(Integer.MAX_VALUE & iIdentityHashCode) % bVarArr.length]; bVar != null; bVar = bVar.f83944d) {
                if (bVar.f83941a == iIdentityHashCode && obj == bVar.f83942b) {
                    return true;
                }
            }
        } else {
            for (b bVar2 = bVarArr[0]; bVar2 != null; bVar2 = bVar2.f83944d) {
                if (bVar2.f83942b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        b[] bVarArr = this.f83933a;
        if (obj == null) {
            int length = bVarArr.length;
            while (true) {
                int i11 = length - 1;
                if (length <= 0) {
                    return false;
                }
                for (b bVar = bVarArr[i11]; bVar != null; bVar = bVar.f83944d) {
                    if (bVar.f83943c == null) {
                        return true;
                    }
                }
                length = i11;
            }
        } else {
            int length2 = bVarArr.length;
            while (true) {
                int i12 = length2 - 1;
                if (length2 <= 0) {
                    return false;
                }
                for (b bVar2 = bVarArr[i12]; bVar2 != null; bVar2 = bVar2.f83944d) {
                    if (obj.equals(bVar2.f83943c)) {
                        return true;
                    }
                }
                length2 = i12;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f83939g == null) {
            this.f83939g = new jk0.c(this);
        }
        return this.f83939g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        b[] bVarArr = this.f83933a;
        if (obj == null) {
            for (b bVar = bVarArr[0]; bVar != null; bVar = bVar.f83944d) {
                if (bVar.f83942b == null) {
                    return bVar.f83943c;
                }
            }
            return null;
        }
        int iIdentityHashCode = System.identityHashCode(obj);
        for (b bVar2 = bVarArr[(Integer.MAX_VALUE & iIdentityHashCode) % bVarArr.length]; bVar2 != null; bVar2 = bVar2.f83944d) {
            if (bVar2.f83941a == iIdentityHashCode && obj == bVar2.f83942b) {
                return bVar2.f83943c;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f83934b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        if (this.f83938f == null) {
            this.f83938f = new jk0.a(this);
        }
        return this.f83938f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int iIdentityHashCode;
        int length;
        b[] bVarArr = this.f83933a;
        if (obj != null) {
            iIdentityHashCode = System.identityHashCode(obj);
            length = (iIdentityHashCode & Integer.MAX_VALUE) % bVarArr.length;
            for (b bVar = bVarArr[length]; bVar != null; bVar = bVar.f83944d) {
                if (bVar.f83941a == iIdentityHashCode && obj == bVar.f83942b) {
                    Object obj3 = bVar.f83943c;
                    bVar.f83943c = obj2;
                    return obj3;
                }
            }
        } else {
            iIdentityHashCode = 0;
            for (b bVar2 = bVarArr[0]; bVar2 != null; bVar2 = bVar2.f83944d) {
                if (bVar2.f83942b == null) {
                    Object obj4 = bVar2.f83943c;
                    bVar2.f83943c = obj2;
                    return obj4;
                }
            }
            length = 0;
        }
        this.f83937e++;
        if (this.f83934b >= this.f83935c) {
            k();
            bVarArr = this.f83933a;
            length = (Integer.MAX_VALUE & iIdentityHashCode) % bVarArr.length;
        }
        bVarArr[length] = new b(iIdentityHashCode, obj, obj2, bVarArr[length]);
        this.f83934b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        b[] bVarArr = this.f83933a;
        if (obj != null) {
            int iIdentityHashCode = System.identityHashCode(obj);
            int length = (Integer.MAX_VALUE & iIdentityHashCode) % bVarArr.length;
            b bVar = null;
            for (b bVar2 = bVarArr[length]; bVar2 != null; bVar2 = bVar2.f83944d) {
                if (bVar2.f83941a == iIdentityHashCode && obj == bVar2.f83942b) {
                    this.f83937e++;
                    if (bVar != null) {
                        bVar.f83944d = bVar2.f83944d;
                    } else {
                        bVarArr[length] = bVar2.f83944d;
                    }
                    this.f83934b--;
                    Object obj2 = bVar2.f83943c;
                    bVar2.f83943c = null;
                    return obj2;
                }
                bVar = bVar2;
            }
        } else {
            b bVar3 = null;
            for (b bVar4 = bVarArr[0]; bVar4 != null; bVar4 = bVar4.f83944d) {
                if (bVar4.f83942b == null) {
                    this.f83937e++;
                    if (bVar3 != null) {
                        bVar3.f83944d = bVar4.f83944d;
                    } else {
                        bVarArr[0] = bVar4.f83944d;
                    }
                    this.f83934b--;
                    Object obj3 = bVar4.f83943c;
                    bVar4.f83943c = null;
                    return obj3;
                }
                bVar3 = bVar4;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f83934b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        if (this.f83940h == null) {
            this.f83940h = new jk0.b(this);
        }
        return this.f83940h;
    }

    public d() {
        this(11, 0.75f);
    }
}
