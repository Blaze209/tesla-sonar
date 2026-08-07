package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvo0/n;", "Lro0/d;", "", "Lvo0/r1;", "", "Lvo0/m;", "<init>", "()V", "", "v", "([C)I", "y", "([C)Lvo0/m;", "w", "()[C", "Luo0/c;", "decoder", "index", "builder", "", "checkIndex", "Ljn0/h0;", "x", "(Luo0/c;ILvo0/m;Z)V", "Luo0/d;", "encoder", "content", "size", "z", "(Luo0/d;[CI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends r1<Character, char[], m> implements ro0.d<char[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f119661c = new n();

    private n() {
        super(so0.a.z(p013kotlin.jvm.internal.g.f86514a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.r1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.p, vo0.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(uo0.c decoder, int index, m builder, boolean checkIndex) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        builder.e(decoder.G(getDescriptor(), index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public m k(char[] cArr) {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        return new m(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.r1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(uo0.d encoder, char[] content, int size) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.h(getDescriptor(), i11, content[i11]);
        }
    }
}
