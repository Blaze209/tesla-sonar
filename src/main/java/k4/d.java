package k4;

import java.text.BreakIterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lk4/d;", "Lk4/b;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", "offset", "f", "(I)I", "e", "a", "Ljava/lang/CharSequence;", "Ljava/text/BreakIterator;", "kotlin.jvm.PlatformType", "b", "Ljava/text/BreakIterator;", "breakIterator", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BreakIterator breakIterator;

    public d(CharSequence charSequence) {
        this.text = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.breakIterator = characterInstance;
    }

    @Override // k4.b
    public int e(int offset) {
        return this.breakIterator.following(offset);
    }

    @Override // k4.b
    public int f(int offset) {
        return this.breakIterator.preceding(offset);
    }
}
