package no0;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: no0.j, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lno0/j;", "T", "Lno0/s;", "", InquiryField.StringField.TYPE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lpo0/p;", "b", "()Lpo0/p;", "Loo0/e;", "a", "()Loo0/e;", "Ljava/lang/String;", "getString", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConstantFormatStructure<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String string;

    public ConstantFormatStructure(String string) {
        p013kotlin.jvm.internal.s.k(string, "string");
        this.string = string;
    }

    @Override // no0.o
    public oo0.e<T> a() {
        return new oo0.c(this.string);
    }

    @Override // no0.o
    public po0.p<T> b() {
        String strSubstring;
        List listA;
        if (this.string.length() == 0) {
            listA = p013kotlin.collections.v.m();
        } else {
            List listC = p013kotlin.collections.v.c();
            String strSubstring2 = "";
            if (mo0.d.b(this.string.charAt(0))) {
                String strSubstring3 = this.string;
                int length = strSubstring3.length();
                for (int i11 = 0; i11 < length; i11++) {
                    if (!mo0.d.b(strSubstring3.charAt(i11))) {
                        strSubstring3 = strSubstring3.substring(0, i11);
                        p013kotlin.jvm.internal.s.j(strSubstring3, "substring(...)");
                        break;
                    }
                }
                listC.add(new po0.h(p013kotlin.collections.v.e(new po0.b(strSubstring3))));
                String str = this.string;
                int length2 = str.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        strSubstring = "";
                        break;
                    }
                    if (!mo0.d.b(str.charAt(i12))) {
                        strSubstring = str.substring(i12);
                        p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                        break;
                    }
                    i12++;
                }
            } else {
                strSubstring = this.string;
            }
            if (strSubstring.length() > 0) {
                if (mo0.d.b(strSubstring.charAt(strSubstring.length() - 1))) {
                    for (int iP0 = p013kotlin.text.t.p0(strSubstring); -1 < iP0; iP0--) {
                        if (!mo0.d.b(strSubstring.charAt(iP0))) {
                            strSubstring2 = strSubstring.substring(0, iP0 + 1);
                            p013kotlin.jvm.internal.s.j(strSubstring2, "substring(...)");
                            break;
                        }
                    }
                    listC.add(new po0.q(strSubstring2));
                    for (int iP1 = p013kotlin.text.t.p0(strSubstring); -1 < iP1; iP1--) {
                        if (!mo0.d.b(strSubstring.charAt(iP1))) {
                            strSubstring = strSubstring.substring(iP1 + 1);
                            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                            break;
                        }
                    }
                    listC.add(new po0.h(p013kotlin.collections.v.e(new po0.b(strSubstring))));
                } else {
                    listC.add(new po0.q(strSubstring));
                }
            }
            listA = p013kotlin.collections.v.a(listC);
        }
        return new po0.p<>(listA, p013kotlin.collections.v.m());
    }

    public boolean equals(Object other) {
        return (other instanceof ConstantFormatStructure) && p013kotlin.jvm.internal.s.f(this.string, ((ConstantFormatStructure) other).string);
    }

    public int hashCode() {
        return this.string.hashCode();
    }

    public String toString() {
        return "ConstantFormatStructure(" + this.string + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
