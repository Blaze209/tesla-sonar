package hq;

import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BitSet f73267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73268b;

    public a(BitSet bitSet, boolean z11) {
        this.f73267a = bitSet;
        this.f73268b = z11;
    }

    public boolean c(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 128) {
                if (!this.f73268b) {
                    return false;
                }
            } else if (!this.f73267a.get(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public a d() {
        BitSet bitSet = (BitSet) this.f73267a.clone();
        bitSet.flip(0, 128);
        return new a(bitSet, !this.f73268b);
    }

    public String e(boolean z11) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i11 = 0; i11 < 128; i11++) {
            if (this.f73267a.get(i11)) {
                char c11 = (char) i11;
                if (c11 == '\t') {
                    str = "\\t";
                } else if (c11 == '\n') {
                    str = "\\n";
                } else if (c11 == '\r') {
                    str = "\\r";
                } else if (c11 == ' ') {
                    str = "<space>";
                } else if (i11 >= 32 && i11 != 127) {
                    str = null;
                } else if (!z11) {
                    str = "(" + i11 + ")";
                }
                sb2.append(' ');
                if (str == null) {
                    sb2.append(c11);
                } else {
                    sb2.append(str);
                }
            }
        }
        sb2.append(" ]");
        return sb2.toString();
    }

    public String toString() {
        return e(false);
    }

    /* JADX INFO: renamed from: hq.a$a, reason: collision with other inner class name */
    public static class C1540a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BitSet f73269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f73270b;

        public C1540a() {
            this.f73269a = new BitSet(128);
            this.f73270b = false;
        }

        private void j(String str, boolean z11) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                this.f73269a.set(str.charAt(i11), z11);
            }
        }

        public C1540a a(char c11) {
            this.f73269a.set(c11);
            return this;
        }

        public C1540a b(int i11, int i12) {
            this.f73269a.set(i11, i12 + 1);
            return this;
        }

        public C1540a c(String str) {
            j(str, true);
            return this;
        }

        public C1540a d() {
            this.f73269a.set(0, 128);
            this.f73270b = true;
            return this;
        }

        public C1540a e() {
            this.f73270b = true;
            return this;
        }

        public C1540a f() {
            return b(32, 126);
        }

        public a g() {
            return new a(this.f73269a, this.f73270b);
        }

        public C1540a h(char c11) {
            this.f73269a.set((int) c11, false);
            return this;
        }

        public C1540a i(String str) {
            j(str, false);
            return this;
        }

        public C1540a(a aVar) {
            this.f73269a = (BitSet) aVar.f73267a.clone();
            this.f73270b = aVar.f73268b;
        }
    }
}
