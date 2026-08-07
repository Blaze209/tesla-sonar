package k4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk4/i;", "Lk4/e;", "", "text", "Lk4/h;", "wordIterator", "<init>", "(Ljava/lang/CharSequence;Lk4/h;)V", "", "offset", "c", "(I)I", "a", "b", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/CharSequence;", "Lk4/h;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h wordIterator;

    public i(CharSequence charSequence, h hVar) {
        this.text = charSequence;
        this.wordIterator = hVar;
    }

    @Override // k4.e
    public int a(int offset) {
        do {
            offset = this.wordIterator.o(offset);
            if (offset == -1 || offset == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset - 1)));
        return offset;
    }

    @Override // k4.e
    public int b(int offset) {
        do {
            offset = this.wordIterator.n(offset);
            if (offset == -1 || offset == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset)));
        return offset;
    }

    @Override // k4.e
    public int c(int offset) {
        do {
            offset = this.wordIterator.o(offset);
            if (offset == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset)));
        return offset;
    }

    @Override // k4.e
    public int d(int offset) {
        do {
            offset = this.wordIterator.n(offset);
            if (offset == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset - 1)));
        return offset;
    }
}
