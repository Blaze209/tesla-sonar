package xo0;

import ezvcard.property.Gender;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lxo0/v0;", "Lxo0/t0;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "j", "()B", "", "e", "()Z", "", "expected", "Ljn0/h0;", "l", "(C)V", Gender.FEMALE, "", "J", "()I", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 extends t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(String source) {
        super(source);
        p013kotlin.jvm.internal.s.k(source, "source");
    }

    @Override // xo0.JsonReader
    public byte F() {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            return (byte) 10;
        }
        this.currentPosition = iJ;
        return b.a(strC.charAt(iJ));
    }

    @Override // xo0.t0, xo0.JsonReader
    public int J() {
        int i11;
        int iU0 = this.currentPosition;
        if (iU0 == -1) {
            return iU0;
        }
        String strC = C();
        while (iU0 < strC.length()) {
            char cCharAt = strC.charAt(iU0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i11 = iU0 + 1) >= strC.length()) {
                    break;
                }
                char cCharAt2 = strC.charAt(i11);
                if (cCharAt2 == '*') {
                    int iV0 = p013kotlin.text.t.v0(strC, "*/", iU0 + 2, false, 4, null);
                    if (iV0 == -1) {
                        this.currentPosition = strC.length();
                        JsonReader.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iU0 = iV0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iU0 = p013kotlin.text.t.u0(strC, '\n', iU0 + 2, false, 4, null);
                    iU0 = iU0 == -1 ? strC.length() : iU0 + 1;
                }
            }
        }
        this.currentPosition = iU0;
        return iU0;
    }

    @Override // xo0.t0, xo0.JsonReader
    public boolean e() {
        int iJ = J();
        if (iJ >= C().length() || iJ == -1) {
            return false;
        }
        return D(C().charAt(iJ));
    }

    @Override // xo0.t0, xo0.JsonReader
    public byte j() {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            return (byte) 10;
        }
        this.currentPosition = iJ + 1;
        return b.a(strC.charAt(iJ));
    }

    @Override // xo0.t0, xo0.JsonReader
    public void l(char expected) {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            this.currentPosition = -1;
            P(expected);
        }
        char cCharAt = strC.charAt(iJ);
        this.currentPosition = iJ + 1;
        if (cCharAt == expected) {
            return;
        }
        P(expected);
    }
}
