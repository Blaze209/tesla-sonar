package net.time4j.format;

import ch.qos.logback.core.CoreConstants;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f94450a;

    s(String[] strArr) {
        this.f94450a = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    private boolean a(char c11, char c12) {
        if (c11 >= 'a' && c11 <= 'z') {
            if (c12 >= 'A' && c12 <= 'Z') {
                c12 = (char) (c12 + ' ');
            }
            return c11 == c12;
        }
        if (c11 < 'A' || c11 > 'Z') {
            return Character.toUpperCase(c11) == Character.toUpperCase(c12) || Character.toLowerCase(c11) == Character.toLowerCase(c12);
        }
        char c13 = (char) (c11 + ' ');
        if (c12 >= 'A' && c12 <= 'Z') {
            c12 = (char) (c12 + ' ');
        }
        return c13 == c12;
    }

    private <V extends Enum<V>> V f(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, boolean z11, boolean z12, boolean z13) {
        int i11;
        String str;
        V[] enumConstants = cls.getEnumConstants();
        int size = this.f94450a.size();
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        String str2 = "";
        String strName = "";
        int i12 = 0;
        V v11 = null;
        int i13 = 0;
        while (i12 < enumConstants.length) {
            boolean zIsEmpty = strName.isEmpty();
            if (zIsEmpty) {
                strName = i12 >= size ? enumConstants[i12].name() : this.f94450a.get(i12);
            }
            int length2 = strName.length();
            int i14 = index;
            int i15 = 0;
            boolean z14 = true;
            while (z14 && i15 < length2) {
                V[] vArr = enumConstants;
                int i16 = index + i15;
                if (i16 >= length) {
                    str = str2;
                    z14 = false;
                } else {
                    char cCharAt = charSequence.charAt(i16);
                    char cCharAt2 = strName.charAt(i15);
                    if (z13) {
                        str = str2;
                        if (cCharAt == 160) {
                            cCharAt = ' ';
                        }
                        if (cCharAt2 == 160) {
                            cCharAt2 = ' ';
                        }
                    } else {
                        str = str2;
                    }
                    boolean z15 = !z11 ? cCharAt != cCharAt2 : !(cCharAt == cCharAt2 || a(cCharAt, cCharAt2));
                    if (z15) {
                        i14++;
                    }
                    z14 = z15;
                }
                i15++;
                enumConstants = vArr;
                size = size;
                str2 = str;
            }
            V[] vArr2 = enumConstants;
            int i17 = size;
            String str3 = str2;
            if (z13 && zIsEmpty && length2 == 5 && strName.charAt(4) == '.' && i14 == (i11 = index + 3) && i11 < length && charSequence.charAt(i11) == '.') {
                i12--;
                strName = ((Object) strName.subSequence(index, i11)) + ".";
            } else {
                if (z12 || length2 == 1) {
                    int i18 = i14 - index;
                    if (i13 < i18) {
                        v11 = vArr2[i12];
                        i13 = i18;
                    } else if (i13 == i18) {
                        strName = str3;
                        v11 = null;
                    }
                } else if (z14) {
                    parsePosition.setIndex(i14);
                    return vArr2[i12];
                }
                strName = str3;
            }
            i12++;
            enumConstants = vArr2;
            size = i17;
            str2 = str3;
        }
        if (v11 == null) {
            parsePosition.setErrorIndex(index);
            return v11;
        }
        parsePosition.setIndex(index + i13);
        return v11;
    }

    public List<String> b() {
        return this.f94450a;
    }

    public <V extends Enum<V>> V c(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls) {
        return (V) f(charSequence, parsePosition, cls, true, false, true);
    }

    public <V extends Enum<V>> V d(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, net.time4j.engine.d dVar) {
        net.time4j.engine.c<Boolean> cVar = a.f94178i;
        Boolean bool = Boolean.TRUE;
        return (V) f(charSequence, parsePosition, cls, ((Boolean) dVar.b(cVar, bool)).booleanValue(), ((Boolean) dVar.b(a.f94179j, Boolean.FALSE)).booleanValue(), ((Boolean) dVar.b(a.f94180k, bool)).booleanValue());
    }

    public <V extends Enum<V>> V e(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, g gVar) {
        s sVar;
        CharSequence charSequence2;
        ParsePosition parsePosition2;
        Class<V> cls2;
        boolean z11;
        boolean z12;
        boolean z13;
        if (gVar != g.STRICT) {
            sVar = this;
            charSequence2 = charSequence;
            parsePosition2 = parsePosition;
            cls2 = cls;
            if (gVar == g.LAX) {
                z12 = true;
            } else {
                z11 = false;
                z12 = true;
                z13 = true;
            }
            return (V) sVar.f(charSequence2, parsePosition2, cls2, z12, z11, z13);
        }
        sVar = this;
        charSequence2 = charSequence;
        parsePosition2 = parsePosition;
        cls2 = cls;
        z12 = false;
        z11 = z12;
        z13 = z11;
        return (V) sVar.f(charSequence2, parsePosition2, cls2, z12, z11, z13);
    }

    public String g(Enum<?> r11) {
        int iOrdinal = r11.ordinal();
        return this.f94450a.size() <= iOrdinal ? r11.name() : this.f94450a.get(iOrdinal);
    }

    public String toString() {
        int size = this.f94450a.size();
        StringBuilder sb2 = new StringBuilder((size * 16) + 2);
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append(this.f94450a.get(i11));
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}
