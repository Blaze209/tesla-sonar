package z3;

import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\"\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u001e8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010)\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"Lz3/v;", "", "Lj3/g;", "relativeToScreen", "n", "(J)J", "relativeToWindow", "d0", "relativeToLocal", "K", "P", "sourceCoordinates", "relativeToSource", "D", "(Lz3/v;J)J", "", "includeMotionFrameOfReference", "f0", "(Lz3/v;JZ)J", "clipBounds", "Lj3/i;", Gender.FEMALE, "(Lz3/v;Z)Lj3/i;", "Lk3/n3;", "matrix", "Ljn0/h0;", "G", "(Lz3/v;[F)V", "q0", "([F)V", "Lw4/r;", "e", "()J", "size", Gender.MALE, "()Lz3/v;", "parentLayoutCoordinates", "X", "parentCoordinates", "b0", "()Z", "isAttached", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface v {
    static /* synthetic */ j3.i A0(v vVar, v vVar2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return vVar.F(vVar2, z11);
    }

    long D(v sourceCoordinates, long relativeToSource);

    j3.i F(v sourceCoordinates, boolean clipBounds);

    default void G(v sourceCoordinates, float[] matrix) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    long K(long relativeToLocal);

    v M();

    long P(long relativeToLocal);

    v X();

    boolean b0();

    long d0(long relativeToWindow);

    long e();

    default long f0(v sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    default long n(long relativeToScreen) {
        return j3.g.INSTANCE.b();
    }

    default void q0(float[] matrix) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }
}
