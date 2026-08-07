package v;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.s0 f117279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final androidx.p003lifecycle.i0<c0.q> f117280b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f117281a;

        static {
            int[] iArr = new int[androidx.camera.core.impl.j0.a.values().length];
            f117281a = iArr;
            try {
                iArr[androidx.camera.core.impl.j0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117281a[androidx.camera.core.impl.j0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f117281a[androidx.camera.core.impl.j0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f117281a[androidx.camera.core.impl.j0.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f117281a[androidx.camera.core.impl.j0.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f117281a[androidx.camera.core.impl.j0.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f117281a[androidx.camera.core.impl.j0.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f117281a[androidx.camera.core.impl.j0.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    t2(@NonNull androidx.camera.core.impl.s0 s0Var) {
        this.f117279a = s0Var;
        androidx.p003lifecycle.i0<c0.q> i0Var = new androidx.p003lifecycle.i0<>();
        this.f117280b = i0Var;
        i0Var.postValue(c0.q.a(c0.q.b.CLOSED));
    }

    private c0.q b() {
        return this.f117279a.c() ? c0.q.a(c0.q.b.OPENING) : c0.q.a(c0.q.b.PENDING_OPEN);
    }

    @NonNull
    public androidx.p003lifecycle.d0<c0.q> a() {
        return this.f117280b;
    }

    public void c(@NonNull androidx.camera.core.impl.j0.a aVar, c0.q.a aVar2) {
        c0.q qVarB;
        switch (a.f117281a[aVar.ordinal()]) {
            case 1:
                qVarB = b();
                break;
            case 2:
                qVarB = c0.q.b(c0.q.b.OPENING, aVar2);
                break;
            case 3:
            case 4:
                qVarB = c0.q.b(c0.q.b.OPEN, aVar2);
                break;
            case 5:
            case 6:
                qVarB = c0.q.b(c0.q.b.CLOSING, aVar2);
                break;
            case 7:
            case 8:
                qVarB = c0.q.b(c0.q.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        c0.y0.a("CameraStateMachine", "New public camera state " + qVarB + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.f117280b.getValue(), qVarB)) {
            return;
        }
        c0.y0.a("CameraStateMachine", "Publishing new public camera state " + qVarB);
        this.f117280b.postValue(qVarB);
    }
}
