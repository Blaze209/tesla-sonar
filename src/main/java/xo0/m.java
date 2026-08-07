package xo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lxo0/m;", "", "<init>", "()V", "Ljn0/h0;", "f", "e", "", "c", "", "esc", "b", "(IC)V", "a", "(CC)V", "", "cl", DateTokenConverter.CONVERTER_KEY, "(IB)V", "(CB)V", "", "[C", "ESCAPE_2_CHAR", "", "[B", "CHAR_TO_TOKEN", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f123857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final char[] ESCAPE_2_CHAR;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final byte[] CHAR_TO_TOKEN;

    static {
        m mVar = new m();
        f123857a = mVar;
        ESCAPE_2_CHAR = new char[117];
        CHAR_TO_TOKEN = new byte[126];
        mVar.f();
        mVar.e();
    }

    private m() {
    }

    private final void a(char c11, char esc) {
        b(c11, esc);
    }

    private final void b(int c11, char esc) {
        if (esc != 'u') {
            ESCAPE_2_CHAR[esc] = (char) c11;
        }
    }

    private final void c(char c11, byte cl2) {
        d(c11, cl2);
    }

    private final void d(int c11, byte cl2) {
        CHAR_TO_TOKEN[c11] = cl2;
    }

    private final void e() {
        for (int i11 = 0; i11 < 33; i11++) {
            d(i11, (byte) 127);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(CoreConstants.COMMA_CHAR, (byte) 4);
        c(CoreConstants.COLON_CHAR, (byte) 5);
        c(CoreConstants.CURLY_LEFT, (byte) 6);
        c(CoreConstants.CURLY_RIGHT, (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c(CoreConstants.DOUBLE_QUOTE_CHAR, (byte) 1);
        c(CoreConstants.ESCAPE_CHAR, (byte) 2);
    }

    private final void f() {
        for (int i11 = 0; i11 < 32; i11++) {
            b(i11, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a(CoreConstants.DOUBLE_QUOTE_CHAR, CoreConstants.DOUBLE_QUOTE_CHAR);
        a(CoreConstants.ESCAPE_CHAR, CoreConstants.ESCAPE_CHAR);
    }
}
