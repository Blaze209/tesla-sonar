package xo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Arrays;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006'"}, d2 = {"Lxo0/g0;", "Lxo0/w;", "<init>", "()V", "", "firstEscapedChar", "currentSize", "", InquiryField.StringField.TYPE, "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(IILjava/lang/String;)V", "expected", "e", "(I)V", "oldSize", "additional", "f", "(II)I", "", "value", "writeLong", "(J)V", "", "char", "a", "(C)V", "text", "c", "(Ljava/lang/String;)V", "b", "g", "toString", "()Ljava/lang/String;", "", "[C", "array", "I", "size", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private char[] array = k.f123849c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    private final void d(int firstEscapedChar, int currentSize, String string) {
        byte b11;
        int length = string.length();
        while (firstEscapedChar < length) {
            int iF = f(currentSize, 2);
            char cCharAt = string.charAt(firstEscapedChar);
            if (cCharAt >= w0.a().length || (b11 = w0.a()[cCharAt]) == 0) {
                int i11 = iF + 1;
                this.array[iF] = cCharAt;
                currentSize = i11;
            } else if (b11 == 1) {
                String str = w0.b()[cCharAt];
                p013kotlin.jvm.internal.s.h(str);
                int iF2 = f(iF, str.length());
                str.getChars(0, str.length(), this.array, iF2);
                currentSize = iF2 + str.length();
                this.size = currentSize;
            } else {
                char[] cArr = this.array;
                cArr[iF] = CoreConstants.ESCAPE_CHAR;
                cArr[iF + 1] = (char) b11;
                currentSize = iF + 2;
                this.size = currentSize;
            }
            firstEscapedChar++;
        }
        int iF3 = f(currentSize, 1);
        this.array[iF3] = CoreConstants.DOUBLE_QUOTE_CHAR;
        this.size = iF3 + 1;
    }

    private final void e(int expected) {
        f(this.size, expected);
    }

    private final int f(int oldSize, int additional) {
        int i11 = additional + oldSize;
        char[] cArr = this.array;
        if (cArr.length <= i11) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, bo0.n.f(i11, oldSize * 2));
            p013kotlin.jvm.internal.s.j(cArrCopyOf, "copyOf(...)");
            this.array = cArrCopyOf;
        }
        return oldSize;
    }

    @Override // xo0.w
    public void a(char c11) {
        e(1);
        char[] cArr = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        cArr[i11] = c11;
    }

    @Override // xo0.w
    public void b(String text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        e(text.length() + 2);
        char[] cArr = this.array;
        int i11 = this.size;
        int i12 = i11 + 1;
        cArr[i11] = CoreConstants.DOUBLE_QUOTE_CHAR;
        int length = text.length();
        text.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        for (int i14 = i12; i14 < i13; i14++) {
            char c11 = cArr[i14];
            if (c11 < w0.a().length && w0.a()[c11] != 0) {
                d(i14 - i12, i14, text);
                return;
            }
        }
        cArr[i13] = CoreConstants.DOUBLE_QUOTE_CHAR;
        this.size = i13 + 1;
    }

    @Override // xo0.w
    public void c(String text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    public void g() {
        k.f123849c.c(this.array);
    }

    public String toString() {
        return new String(this.array, 0, this.size);
    }

    @Override // xo0.w
    public void writeLong(long value) {
        c(String.valueOf(value));
    }
}
