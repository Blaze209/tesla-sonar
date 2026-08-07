package j$.time.format;

import java.text.ParsePosition;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f82117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f82118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f82119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f82120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f82121e;

    public boolean b(char c11, char c12) {
        return c11 == c12;
    }

    public m(String str, String str2, m mVar) {
        this.f82117a = str;
        this.f82118b = str2;
        this.f82120d = mVar;
        if (str.isEmpty()) {
            this.f82119c = (char) 65535;
        } else {
            this.f82119c = this.f82117a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f82117a.length() + index;
        m mVar = this.f82120d;
        if (mVar != null && length2 != length) {
            while (!b(mVar.f82119c, charSequence.charAt(length2))) {
                mVar = mVar.f82121e;
                if (mVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = mVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.f82118b;
    }

    public m d(String str, String str2, m mVar) {
        return new m(str, str2, mVar);
    }

    public boolean e(CharSequence charSequence, int i11, int i12) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f82117a, i11);
        }
        int length = this.f82117a.length();
        if (length > i12 - i11) {
            return false;
        }
        int i13 = 0;
        while (true) {
            int i14 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i15 = i13 + 1;
            int i16 = i11 + 1;
            if (!b(this.f82117a.charAt(i13), charSequence.charAt(i11))) {
                return false;
            }
            i11 = i16;
            length = i14;
            i13 = i15;
        }
    }

    public final boolean a(String str, String str2) {
        int i11 = 0;
        while (i11 < str.length() && i11 < this.f82117a.length() && b(str.charAt(i11), this.f82117a.charAt(i11))) {
            i11++;
        }
        if (i11 == this.f82117a.length()) {
            if (i11 < str.length()) {
                String strSubstring = str.substring(i11);
                for (m mVar = this.f82120d; mVar != null; mVar = mVar.f82121e) {
                    if (b(mVar.f82119c, strSubstring.charAt(0))) {
                        return mVar.a(strSubstring, str2);
                    }
                }
                m mVarD = d(strSubstring, str2, null);
                mVarD.f82121e = this.f82120d;
                this.f82120d = mVarD;
                return true;
            }
            this.f82118b = str2;
            return true;
        }
        m mVarD2 = d(this.f82117a.substring(i11), this.f82118b, this.f82120d);
        this.f82117a = str.substring(0, i11);
        this.f82120d = mVarD2;
        if (i11 < str.length()) {
            this.f82120d.f82121e = d(str.substring(i11), str2, null);
            this.f82118b = null;
            return true;
        }
        this.f82118b = str2;
        return true;
    }
}
