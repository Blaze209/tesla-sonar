package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Li4/k0;", "", "Lj3/i;", "textBounds", "rect", "", "a", "(Lj3/i;Lj3/i;)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f75747a;

    /* JADX INFO: renamed from: i4.k0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Li4/k0$a;", "", "<init>", "()V", "Li4/k0;", "b", "Li4/k0;", "g", "()Li4/k0;", "AnyOverlap", "c", "getContainsAll", "ContainsAll", DateTokenConverter.CONVERTER_KEY, "h", "ContainsCenter", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f75747a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final k0 AnyOverlap = new k0() { // from class: i4.h0
            @Override // i4.k0
            public final boolean a(j3.i iVar, j3.i iVar2) {
                return k0.Companion.d(iVar, iVar2);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final k0 ContainsAll = new k0() { // from class: i4.i0
            @Override // i4.k0
            public final boolean a(j3.i iVar, j3.i iVar2) {
                return k0.Companion.e(iVar, iVar2);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final k0 ContainsCenter = new k0() { // from class: i4.j0
            @Override // i4.k0
            public final boolean a(j3.i iVar, j3.i iVar2) {
                return k0.Companion.f(iVar, iVar2);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(j3.i iVar, j3.i iVar2) {
            return iVar.s(iVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(j3.i iVar, j3.i iVar2) {
            return !iVar2.r() && iVar.getLeft() >= iVar2.getLeft() && iVar.getRight() <= iVar2.getRight() && iVar.getTop() >= iVar2.getTop() && iVar.getBottom() <= iVar2.getBottom();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(j3.i iVar, j3.i iVar2) {
            return iVar2.b(iVar.g());
        }

        public final k0 g() {
            return AnyOverlap;
        }

        public final k0 h() {
            return ContainsCenter;
        }
    }

    boolean a(j3.i textBounds, j3.i rect);
}
