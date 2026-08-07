package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvo0/i0;", "Lro0/d;", "", "Lvo0/r1;", "", "Lvo0/h0;", "<init>", "()V", "v", "([I)I", "y", "([I)Lvo0/h0;", "w", "()[I", "Luo0/c;", "decoder", "index", "builder", "", "checkIndex", "Ljn0/h0;", "x", "(Luo0/c;ILvo0/h0;Z)V", "Luo0/d;", "encoder", "content", "size", "z", "(Luo0/d;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 extends r1<Integer, int[], h0> implements ro0.d<int[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f119628c = new i0();

    private i0() {
        super(so0.a.C(p013kotlin.jvm.internal.r.f86532a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.r1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.p, vo0.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(uo0.c decoder, int index, h0 builder, boolean checkIndex) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        builder.e(decoder.e(getDescriptor(), index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public h0 k(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        return new h0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.r1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(uo0.d encoder, int[] content, int size) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.x(getDescriptor(), i11, content[i11]);
        }
    }
}
