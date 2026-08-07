package ap0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Deque<C0257a> f14823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14826d;

    /* JADX INFO: renamed from: ap0.a$a, reason: collision with other inner class name */
    private class C0257a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14829c;

        public C0257a(a aVar, int i11) {
            this(i11, Integer.MAX_VALUE, 0);
        }

        public int a() {
            return this.f14828b;
        }

        public int b() {
            return this.f14827a;
        }

        public int c() {
            return this.f14829c;
        }

        public void d(int i11) {
            this.f14828b = i11;
        }

        public void e(int i11) {
            this.f14829c += i11;
        }

        public String toString() {
            return "[TLStruct " + Integer.toHexString(this.f14827a) + ", " + this.f14828b + ", " + this.f14829c + "]";
        }

        public C0257a(a aVar, C0257a c0257a) {
            this(c0257a.f14827a, c0257a.f14828b, c0257a.f14829c);
        }

        public C0257a(int i11, int i12, int i13) {
            this.f14827a = i11;
            this.f14828b = i12;
            this.f14829c = i13;
        }
    }

    public a() {
        this(new ArrayDeque(), true, false, false);
    }

    private Deque<C0257a> a() {
        ArrayDeque arrayDeque = new ArrayDeque(this.f14823a.size());
        Iterator<C0257a> it = this.f14823a.iterator();
        while (it.hasNext()) {
            arrayDeque.addLast(new C0257a(this, it.next()));
        }
        return arrayDeque;
    }

    public int b() {
        if (this.f14823a.isEmpty()) {
            throw new IllegalStateException("Length not yet known.");
        }
        return this.f14823a.peek().a();
    }

    public int c() {
        if (this.f14823a.isEmpty()) {
            throw new IllegalStateException("Tag not yet read.");
        }
        return this.f14823a.peek().b();
    }

    public int d() {
        if (this.f14823a.isEmpty()) {
            throw new IllegalStateException("Length of value is unknown.");
        }
        C0257a c0257aPeek = this.f14823a.peek();
        return c0257aPeek.a() - c0257aPeek.c();
    }

    public boolean e() {
        return this.f14825c;
    }

    public boolean f() {
        return this.f14824b;
    }

    public boolean g() {
        return this.f14826d;
    }

    public void h(int i11, int i12) {
        if (i11 >= 0) {
            C0257a c0257aPop = this.f14823a.pop();
            if (!this.f14823a.isEmpty()) {
                this.f14823a.peek().e(i12);
            }
            c0257aPop.d(i11);
            this.f14823a.push(c0257aPop);
            this.f14824b = false;
            this.f14825c = false;
            this.f14826d = true;
            return;
        }
        throw new IllegalArgumentException("Cannot set negative length (length = " + i11 + ", 0x" + Integer.toHexString(i11) + " for tag " + Integer.toHexString(c()) + ").");
    }

    public void i(int i11, int i12) {
        C0257a c0257a = new C0257a(this, i11);
        if (!this.f14823a.isEmpty()) {
            this.f14823a.peek().e(i12);
        }
        this.f14823a.push(c0257a);
        this.f14824b = false;
        this.f14825c = true;
        this.f14826d = false;
    }

    public void j(int i11) {
        if (this.f14823a.isEmpty()) {
            return;
        }
        C0257a c0257aPeek = this.f14823a.peek();
        int iA = c0257aPeek.a() - c0257aPeek.c();
        if (i11 > iA) {
            throw new IllegalArgumentException("Cannot process " + i11 + " bytes! Only " + iA + " bytes left in this TLV object " + c0257aPeek);
        }
        c0257aPeek.e(i11);
        int iA2 = c0257aPeek.a();
        if (c0257aPeek.c() != iA2) {
            this.f14824b = false;
            this.f14825c = false;
            this.f14826d = true;
        } else {
            this.f14823a.pop();
            j(iA2);
            this.f14824b = true;
            this.f14825c = false;
            this.f14826d = false;
        }
    }

    public String toString() {
        return this.f14823a.toString();
    }

    public a(a aVar) {
        this(aVar.a(), aVar.f14824b, aVar.f14825c, aVar.f14826d);
    }

    private a(Deque<C0257a> deque, boolean z11, boolean z12, boolean z13) {
        this.f14823a = deque;
        this.f14824b = z11;
        this.f14825c = z12;
        this.f14826d = z13;
    }
}
