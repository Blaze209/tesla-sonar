package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f82085a;

    public c(char c11) {
        this.f82085a = c11;
    }

    @Override // j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        sb2.append(this.f82085a);
        return true;
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        if (i11 == charSequence.length()) {
            return ~i11;
        }
        char cCharAt = charSequence.charAt(i11);
        char c11 = this.f82085a;
        return (cCharAt == c11 || (!uVar.f82146b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c11) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c11)))) ? i11 + 1 : ~i11;
    }

    public final String toString() {
        char c11 = this.f82085a;
        if (c11 == '\'') {
            return "''";
        }
        return "'" + c11 + "'";
    }
}
