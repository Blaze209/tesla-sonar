package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvo0/f2;", "Lro0/d;", "Ljn0/z;", "Lvo0/r1;", "Ljn0/y;", "Lvo0/e2;", "<init>", "()V", "", "v", "([B)I", "y", "([B)Lvo0/e2;", "w", "()[B", "Luo0/c;", "decoder", "index", "builder", "", "checkIndex", "Ljn0/h0;", "x", "(Luo0/c;ILvo0/e2;Z)V", "Luo0/d;", "encoder", "content", "size", "z", "(Luo0/d;[BI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f2 extends r1<jn0.y, jn0.z, e2> implements ro0.d<jn0.z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f2 f119614c = new f2();

    private f2() {
        super(so0.a.r(jn0.y.INSTANCE));
    }

    @Override // vo0.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((jn0.z) obj).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String());
    }

    @Override // vo0.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((jn0.z) obj).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String());
    }

    @Override // vo0.r1
    public /* bridge */ /* synthetic */ jn0.z r() {
        return jn0.z.b(w());
    }

    @Override // vo0.r1
    public /* bridge */ /* synthetic */ void u(uo0.d dVar, jn0.z zVar, int i11) {
        z(dVar, zVar.getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), i11);
    }

    protected int v(byte[] collectionSize) {
        p013kotlin.jvm.internal.s.k(collectionSize, "$this$collectionSize");
        return jn0.z.n(collectionSize);
    }

    protected byte[] w() {
        return jn0.z.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.p, vo0.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(uo0.c decoder, int index, e2 builder, boolean checkIndex) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        builder.e(jn0.y.b(decoder.g(getDescriptor(), index).H()));
    }

    protected e2 y(byte[] toBuilder) {
        p013kotlin.jvm.internal.s.k(toBuilder, "$this$toBuilder");
        return new e2(toBuilder, null);
    }

    protected void z(uo0.d encoder, byte[] content, int size) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.p(getDescriptor(), i11).f(jn0.z.l(content, i11));
        }
    }
}
