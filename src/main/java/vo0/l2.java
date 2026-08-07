package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvo0/l2;", "Lro0/d;", "Ljn0/d0;", "Lvo0/r1;", "Ljn0/c0;", "Lvo0/k2;", "<init>", "()V", "", "v", "([J)I", "y", "([J)Lvo0/k2;", "w", "()[J", "Luo0/c;", "decoder", "index", "builder", "", "checkIndex", "Ljn0/h0;", "x", "(Luo0/c;ILvo0/k2;Z)V", "Luo0/d;", "encoder", "content", "size", "z", "(Luo0/d;[JI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l2 extends r1<jn0.c0, jn0.d0, k2> implements ro0.d<jn0.d0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2 f119643c = new l2();

    private l2() {
        super(so0.a.t(jn0.c0.INSTANCE));
    }

    @Override // vo0.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((jn0.d0) obj).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String());
    }

    @Override // vo0.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((jn0.d0) obj).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String());
    }

    @Override // vo0.r1
    public /* bridge */ /* synthetic */ jn0.d0 r() {
        return jn0.d0.b(w());
    }

    @Override // vo0.r1
    public /* bridge */ /* synthetic */ void u(uo0.d dVar, jn0.d0 d0Var, int i11) {
        z(dVar, d0Var.getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), i11);
    }

    protected int v(long[] collectionSize) {
        p013kotlin.jvm.internal.s.k(collectionSize, "$this$collectionSize");
        return jn0.d0.n(collectionSize);
    }

    protected long[] w() {
        return jn0.d0.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.p, vo0.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(uo0.c decoder, int index, k2 builder, boolean checkIndex) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        builder.e(jn0.c0.b(decoder.g(getDescriptor(), index).h()));
    }

    protected k2 y(long[] toBuilder) {
        p013kotlin.jvm.internal.s.k(toBuilder, "$this$toBuilder");
        return new k2(toBuilder, null);
    }

    protected void z(uo0.d encoder, long[] content, int size) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.p(getDescriptor(), i11).v(jn0.d0.l(content, i11));
        }
    }
}
