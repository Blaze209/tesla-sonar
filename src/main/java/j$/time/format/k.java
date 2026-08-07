package j$.time.format;

import j$.time.DateTimeException;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f82114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f82116c;

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        boolean z11 = uVar.f82147c;
        if (i11 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == charSequence.length()) {
            return ~i11;
        }
        int length = this.f82115b + i11;
        if (length > charSequence.length()) {
            if (z11) {
                return ~i11;
            }
            length = charSequence.length();
        }
        int i12 = i11;
        while (i12 < length && uVar.a(charSequence.charAt(i12), this.f82116c)) {
            i12++;
        }
        int iW = this.f82114a.w(uVar, charSequence.subSequence(0, length), i12);
        return (iW == length || !z11) ? iW : ~(i11 + i12);
    }

    public k(e eVar, int i11, char c11) {
        this.f82114a = eVar;
        this.f82115b = i11;
        this.f82116c = c11;
    }

    @Override // j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f82114a.s(wVar, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i11 = this.f82115b;
        if (length2 <= i11) {
            for (int i12 = 0; i12 < i11 - length2; i12++) {
                sb2.insert(length, this.f82116c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i11);
    }

    public final String toString() {
        String str;
        char c11 = this.f82116c;
        if (c11 == ' ') {
            str = ")";
        } else {
            str = ",'" + c11 + "')";
        }
        return "Pad(" + this.f82114a + "," + this.f82115b + str;
    }
}
