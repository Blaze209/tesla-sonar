package v3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lv3/b0;", "", "Lb4/g0;", "root", "<init>", "(Lb4/g0;)V", "Lv3/z;", "pointerEvent", "Lv3/l0;", "positionCalculator", "", "isInBounds", "Lv3/m0;", "b", "(Lv3/z;Lv3/l0;Z)I", "Ljn0/h0;", "c", "()V", "a", "Lb4/g0;", "getRoot", "()Lb4/g0;", "Lv3/f;", "Lv3/f;", "hitPathTracker", "Lv3/y;", "Lv3/y;", "pointerInputChangeEventProducer", "Lb4/u;", DateTokenConverter.CONVERTER_KEY, "Lb4/u;", "hitResult", "e", "Z", "isProcessing", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b4.g0 root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f hitPathTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y pointerInputChangeEventProducer = new y();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b4.u hitResult = new b4.u();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    public b0(b4.g0 g0Var) {
        this.root = g0Var;
        this.hitPathTracker = new f(g0Var.getCoordinates());
    }

    public final void a() {
        this.hitPathTracker.b();
    }

    public final int b(z pointerEvent, l0 positionCalculator, boolean isInBounds) {
        int i11;
        boolean z11;
        if (this.isProcessing) {
            return c0.a(false, false);
        }
        boolean z12 = true;
        try {
            this.isProcessing = true;
            g gVarB = this.pointerInputChangeEventProducer.b(pointerEvent, positionCalculator);
            int iK = gVarB.b().k();
            while (true) {
                if (i11 >= iK) {
                    z11 = true;
                    break;
                }
                PointerInputChange pointerInputChangeL = gVarB.b().l(i11);
                i11 = (pointerInputChangeL.getPressed() || pointerInputChangeL.getPreviousPressed()) ? 0 : i11 + 1;
                z11 = false;
                break;
            }
            int iK2 = gVarB.b().k();
            for (int i12 = 0; i12 < iK2; i12++) {
                PointerInputChange pointerInputChangeL2 = gVarB.b().l(i12);
                if (z11 || n.b(pointerInputChangeL2)) {
                    b4.g0.y0(this.root, pointerInputChangeL2.getPosition(), this.hitResult, k0.g(pointerInputChangeL2.getType(), k0.INSTANCE.d()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.a(pointerInputChangeL2.getId(), this.hitResult, n.b(pointerInputChangeL2));
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.e();
            boolean zC = this.hitPathTracker.c(gVarB, isInBounds);
            if (gVarB.getSuppressMovementConsumption()) {
                z12 = false;
                break;
            }
            int iK3 = gVarB.b().k();
            int i13 = 0;
            while (true) {
                if (i13 >= iK3) {
                    z12 = false;
                    break;
                }
                PointerInputChange pointerInputChangeL3 = gVarB.b().l(i13);
                if (n.k(pointerInputChangeL3) && pointerInputChangeL3.p()) {
                    break;
                }
                i13++;
            }
            return c0.a(zC, z12);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void c() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.a();
        this.hitPathTracker.d();
    }
}
