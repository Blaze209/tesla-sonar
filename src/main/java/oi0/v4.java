package oi0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Loi0/v4;", "Landroid/text/method/PasswordTransformationMethod;", "", "mask", "<init>", "(Ljava/lang/String;)V", "", "source", "Landroid/view/View;", "view", "getTransformation", "(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;", "a", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class v4 extends PasswordTransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String mask;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0019"}, d2 = {"Loi0/v4$a;", "", "", "mask", "source", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "", "index", "", "a", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "b", "Ljava/lang/CharSequence;", "getSource", "()Ljava/lang/CharSequence;", "()I", "length", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a implements CharSequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String mask;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final CharSequence source;

        public a(String mask, CharSequence source) {
            p013kotlin.jvm.internal.s.k(mask, "mask");
            p013kotlin.jvm.internal.s.k(source, "source");
            this.mask = mask;
            this.source = source;
        }

        public char a(int index) {
            if (index < this.mask.length()) {
                x3 x3VarA = x3.INSTANCE.a(this.mask.charAt(index));
                if (x3VarA instanceof x3.Literal) {
                    return ((x3.Literal) x3VarA).getChar();
                }
            }
            return (char) 8226;
        }

        public int b() {
            return this.source.length();
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i11) {
            return a(i11);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return b();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int startIndex, int endIndex) {
            return this.source.subSequence(startIndex, endIndex);
        }
    }

    public v4(String mask) {
        p013kotlin.jvm.internal.s.k(mask, "mask");
        this.mask = mask;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence source, View view) {
        return source == null ? "" : new a(this.mask, source);
    }
}
