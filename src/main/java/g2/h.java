package g2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.n0;
import p007h2.c0;
import p007h2.d0;
import p007h2.s;
import p007h2.u;
import p013kotlin.Metadata;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh2/c0;", "", "selectableId", "Lkotlin/Function0;", "Lz3/v;", "layoutCoordinates", "Landroidx/compose/ui/d;", "b", "(Lh2/c0;JLwn0/a;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"g2/h$b", "Lh2/h;", "Lj3/g;", "downPosition", "", "e", "(J)Z", "dragPosition", "c", "Lh2/s;", "adjustment", "a", "(JLh2/s;)Z", DateTokenConverter.CONVERTER_KEY, "Ljn0/h0;", "b", "()V", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements p007h2.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition = j3.g.INSTANCE.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.a<v> f67088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f67089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f67090d;

        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.a<? extends v> aVar, c0 c0Var, long j11) {
            this.f67088b = aVar;
            this.f67089c = c0Var;
            this.f67090d = j11;
        }

        @Override // p007h2.h
        public boolean a(long downPosition, s adjustment) {
            v vVarInvoke = this.f67088b.invoke();
            if (vVarInvoke == null) {
                return false;
            }
            c0 c0Var = this.f67089c;
            long j11 = this.f67090d;
            if (!vVarInvoke.b0()) {
                return false;
            }
            c0Var.a(vVarInvoke, downPosition, adjustment, false);
            this.lastPosition = downPosition;
            return d0.b(c0Var, j11);
        }

        @Override // p007h2.h
        public void b() {
            this.f67089c.d();
        }

        @Override // p007h2.h
        public boolean c(long dragPosition) {
            v vVarInvoke = this.f67088b.invoke();
            if (vVarInvoke == null) {
                return true;
            }
            c0 c0Var = this.f67089c;
            long j11 = this.f67090d;
            if (!vVarInvoke.b0() || !d0.b(c0Var, j11)) {
                return false;
            }
            if (!c0Var.c(vVarInvoke, dragPosition, this.lastPosition, false, s.INSTANCE.l(), false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // p007h2.h
        public boolean d(long dragPosition, s adjustment) {
            v vVarInvoke = this.f67088b.invoke();
            if (vVarInvoke == null) {
                return true;
            }
            c0 c0Var = this.f67089c;
            long j11 = this.f67090d;
            if (!vVarInvoke.b0() || !d0.b(c0Var, j11)) {
                return false;
            }
            if (!c0Var.c(vVarInvoke, dragPosition, this.lastPosition, false, adjustment, false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // p007h2.h
        public boolean e(long downPosition) {
            v vVarInvoke = this.f67088b.invoke();
            if (vVarInvoke == null) {
                return false;
            }
            c0 c0Var = this.f67089c;
            long j11 = this.f67090d;
            if (!vVarInvoke.b0()) {
                return false;
            }
            if (c0Var.c(vVarInvoke, downPosition, this.lastPosition, false, s.INSTANCE.l(), false)) {
                this.lastPosition = downPosition;
            }
            return d0.b(c0Var, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d b(c0 c0Var, long j11, wn0.a<? extends v> aVar) {
        a aVar2 = new a(aVar, c0Var, j11);
        return u.i(androidx.compose.ui.d.INSTANCE, new b(aVar, c0Var, j11), aVar2);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bR(\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"g2/h$a", "Lb2/n0;", "Lj3/g;", "point", "Ljn0/h0;", "a", "(J)V", DateTokenConverter.CONVERTER_KEY, "()V", "startPoint", "c", "delta", "b", "onStop", "onCancel", "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long dragTotalDistance;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<v> f67084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f67085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f67086e;

        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.a<? extends v> aVar, c0 c0Var, long j11) {
            this.f67084c = aVar;
            this.f67085d = c0Var;
            this.f67086e = j11;
            j3.g.Companion companion = j3.g.INSTANCE;
            this.lastPosition = companion.c();
            this.dragTotalDistance = companion.c();
        }

        @Override // kotlin.n0
        public void b(long delta) {
            v vVarInvoke = this.f67084c.invoke();
            if (vVarInvoke != null) {
                c0 c0Var = this.f67085d;
                long j11 = this.f67086e;
                if (vVarInvoke.b0() && d0.b(c0Var, j11)) {
                    long jR = j3.g.r(this.dragTotalDistance, delta);
                    this.dragTotalDistance = jR;
                    long jR2 = j3.g.r(this.lastPosition, jR);
                    if (c0Var.c(vVarInvoke, jR2, this.lastPosition, false, s.INSTANCE.n(), true)) {
                        this.lastPosition = jR2;
                        this.dragTotalDistance = j3.g.INSTANCE.c();
                    }
                }
            }
        }

        @Override // kotlin.n0
        public void c(long startPoint) {
            v vVarInvoke = this.f67084c.invoke();
            if (vVarInvoke != null) {
                c0 c0Var = this.f67085d;
                if (!vVarInvoke.b0()) {
                    return;
                }
                c0Var.a(vVarInvoke, startPoint, s.INSTANCE.n(), true);
                this.lastPosition = startPoint;
            }
            if (d0.b(this.f67085d, this.f67086e)) {
                this.dragTotalDistance = j3.g.INSTANCE.c();
            }
        }

        @Override // kotlin.n0
        public void onCancel() {
            if (d0.b(this.f67085d, this.f67086e)) {
                this.f67085d.d();
            }
        }

        @Override // kotlin.n0
        public void onStop() {
            if (d0.b(this.f67085d, this.f67086e)) {
                this.f67085d.d();
            }
        }

        @Override // kotlin.n0
        public void d() {
        }

        @Override // kotlin.n0
        public void a(long point) {
        }
    }
}
