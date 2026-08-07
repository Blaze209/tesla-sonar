package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvo0/c0;", "Lro0/d;", "", "Lvo0/r1;", "", "Lvo0/b0;", "<init>", "()V", "", "v", "([F)I", "y", "([F)Lvo0/b0;", "w", "()[F", "Luo0/c;", "decoder", "index", "builder", "", "checkIndex", "Ljn0/h0;", "x", "(Luo0/c;ILvo0/b0;Z)V", "Luo0/d;", "encoder", "content", "size", "z", "(Luo0/d;[FI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 extends r1<Float, float[], b0> implements ro0.d<float[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f119596c = new c0();

    private c0() {
        super(so0.a.B(p013kotlin.jvm.internal.l.f86526a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.r1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.p, vo0.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(uo0.c decoder, int index, b0 builder, boolean checkIndex) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        builder.e(decoder.D(getDescriptor(), index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public b0 k(float[] fArr) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        return new b0(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.r1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(uo0.d encoder, float[] content, int size) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.i(getDescriptor(), i11, content[i11]);
        }
    }
}
