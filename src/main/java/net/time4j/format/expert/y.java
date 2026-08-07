package net.time4j.format.expert;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class y implements h<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f94432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.n<Character> f94433b;

    y(net.time4j.engine.n<Character> nVar, int i11) {
        if (nVar == null) {
            throw new NullPointerException("Missing condition for unparseable chars.");
        }
        if (i11 >= 1) {
            this.f94433b = nVar;
            this.f94432a = i11;
        } else {
            throw new IllegalArgumentException("Must be positive: " + i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f94432a == yVar.f94432a) {
                net.time4j.engine.n<Character> nVar = this.f94433b;
                net.time4j.engine.n<Character> nVar2 = yVar.f94433b;
                if (nVar != null ? nVar.equals(nVar2) : nVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<Void> getElement() {
        return null;
    }

    public int hashCode() {
        net.time4j.engine.n<Character> nVar = this.f94433b;
        if (nVar == null) {
            return this.f94432a;
        }
        return nVar.hashCode() ^ (~this.f94432a);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int i11;
        int i12;
        int iF = sVar.f();
        int length = charSequence.length();
        if (this.f94433b == null) {
            i11 = length - this.f94432a;
        } else {
            int i13 = iF;
            for (int i14 = 0; i14 < this.f94432a && (i12 = i14 + iF) < length && this.f94433b.test(Character.valueOf(charSequence.charAt(i12))); i14++) {
                i13++;
            }
            i11 = i13;
        }
        int iMin = Math.min(Math.max(i11, 0), length);
        if (iMin > iF) {
            sVar.l(iMin);
        }
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        return 0;
    }

    @Override // net.time4j.format.expert.h
    public h<Void> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(y.class.getName());
        if (this.f94433b == null) {
            sb2.append("[keepRemainingChars=");
            sb2.append(this.f94432a);
        } else {
            sb2.append("[condition=");
            sb2.append(this.f94433b);
            sb2.append(", maxIterations=");
            sb2.append(this.f94432a);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<Void> withElement(net.time4j.engine.p<Void> pVar) {
        return this;
    }
}
