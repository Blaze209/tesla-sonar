package xo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lxo0/y;", "", "Lto0/f;", "descriptor", "<init>", "(Lto0/f;)V", "", "index", "", "e", "(Lto0/f;I)Z", "Ljn0/h0;", "c", "(I)V", DateTokenConverter.CONVERTER_KEY, "()I", "Lvo0/v;", "a", "Lvo0/v;", "origin", "value", "b", "Z", "()Z", "isUnmarkedNull", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vo0.v origin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isUnmarkedNull;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.p<to0.f, Integer, Boolean> {
        a(Object obj) {
            super(2, obj, y.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean a(to0.f p11, int i11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return Boolean.valueOf(((y) this.receiver).e(p11, i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Boolean invoke(to0.f fVar, Integer num) {
            return a(fVar, num.intValue());
        }
    }

    public y(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        this.origin = new vo0.v(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(to0.f descriptor, int index) {
        boolean z11 = !descriptor.i(index) && descriptor.d(index).b();
        this.isUnmarkedNull = z11;
        return z11;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsUnmarkedNull() {
        return this.isUnmarkedNull;
    }

    public final void c(int index) {
        this.origin.a(index);
    }

    public final int d() {
        return this.origin.d();
    }
}
