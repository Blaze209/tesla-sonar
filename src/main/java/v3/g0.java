package v3;

import android.os.SystemClock;
import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lv3/g0;", "Lv3/e0;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "b", "Lwn0/l;", "m", "()Lwn0/l;", "p", "(Lwn0/l;)V", "onTouchEvent", "Lv3/n0;", "value", "c", "Lv3/n0;", "getRequestDisallowInterceptTouchEvent", "()Lv3/n0;", "r", "(Lv3/n0;)V", "requestDisallowInterceptTouchEvent", DateTokenConverter.CONVERTER_KEY, "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "o", "(Z)V", "disallowIntercept", "Lv3/d0;", "e", "Lv3/d0;", "j", "()Lv3/d0;", "pointerInputFilter", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g0 implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super MotionEvent, Boolean> onTouchEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private n0 requestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disallowIntercept;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d0 pointerInputFilter = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lv3/g0$a;", "", "<init>", "(Ljava/lang/String;I)V", "Unknown", "Dispatching", "NotDispatching", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"v3/g0$b", "Lv3/d0;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()V", "Lv3/m;", "pointerEvent", "h", "(Lv3/m;)V", "Lv3/o;", "pass", "Lw4/r;", "bounds", "e", "(Lv3/m;Lv3/o;J)V", DateTokenConverter.CONVERTER_KEY, "Lv3/g0$a;", "b", "Lv3/g0$a;", "state", "", "c", "()Z", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends d0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a state = a.Unknown;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Ljn0/h0;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<MotionEvent, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0 f117687c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var) {
                super(1);
                this.f117687c = g0Var;
            }

            public final void a(MotionEvent motionEvent) {
                this.f117687c.m().invoke(motionEvent);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: v3.g0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Ljn0/h0;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        static final class C2528b extends p013kotlin.jvm.internal.u implements wn0.l<MotionEvent, jn0.h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ g0 f117689d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2528b(g0 g0Var) {
                super(1);
                this.f117689d = g0Var;
            }

            public final void a(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f117689d.m().invoke(motionEvent);
                } else {
                    b.this.state = this.f117689d.m().invoke(motionEvent).booleanValue() ? a.Dispatching : a.NotDispatching;
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Ljn0/h0;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.l<MotionEvent, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0 f117690c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(g0 g0Var) {
                super(1);
                this.f117690c = g0Var;
            }

            public final void a(MotionEvent motionEvent) {
                this.f117690c.m().invoke(motionEvent);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return jn0.h0.f84049a;
            }
        }

        b() {
        }

        private final void h(m pointerEvent) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (listC.get(i11).p()) {
                    if (this.state == a.Dispatching) {
                        z3.v layoutCoordinates = getLayoutCoordinates();
                        if (layoutCoordinates == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        i0.b(pointerEvent, layoutCoordinates.P(j3.g.INSTANCE.c()), new a(g0.this));
                    }
                    this.state = a.NotDispatching;
                    return;
                }
            }
            z3.v layoutCoordinates2 = getLayoutCoordinates();
            if (layoutCoordinates2 == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            i0.c(pointerEvent, layoutCoordinates2.P(j3.g.INSTANCE.c()), new C2528b(g0.this));
            if (this.state == a.Dispatching) {
                int size2 = listC.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    listC.get(i12).a();
                }
                g internalPointerEvent = pointerEvent.getInternalPointerEvent();
                if (internalPointerEvent == null) {
                    return;
                }
                internalPointerEvent.e(!g0.this.getDisallowIntercept());
            }
        }

        private final void i() {
            this.state = a.Unknown;
            g0.this.o(false);
        }

        @Override // v3.d0
        public boolean c() {
            return true;
        }

        @Override // v3.d0
        public void d() {
            if (this.state == a.Dispatching) {
                i0.a(SystemClock.uptimeMillis(), new c(g0.this));
                i();
            }
        }

        @Override // v3.d0
        public void e(m pointerEvent, o pass, long bounds) {
            boolean z11;
            List<PointerInputChange> listC = pointerEvent.c();
            if (g0.this.getDisallowIntercept()) {
                z11 = true;
                break;
            }
            int size = listC.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = false;
                    break;
                }
                PointerInputChange pointerInputChange = listC.get(i11);
                if (n.b(pointerInputChange) || n.d(pointerInputChange)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (this.state != a.NotDispatching) {
                if (pass == o.Initial && z11) {
                    h(pointerEvent);
                }
                if (pass == o.Final && !z11) {
                    h(pointerEvent);
                }
            }
            if (pass == o.Final) {
                int size2 = listC.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (!n.d(listC.get(i12))) {
                        return;
                    }
                }
                i();
            }
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    @Override // v3.e0
    /* JADX INFO: renamed from: j, reason: from getter */
    public d0 getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final wn0.l<MotionEvent, Boolean> m() {
        wn0.l lVar = this.onTouchEvent;
        if (lVar != null) {
            return lVar;
        }
        p013kotlin.jvm.internal.s.B("onTouchEvent");
        return null;
    }

    public final void o(boolean z11) {
        this.disallowIntercept = z11;
    }

    public final void p(wn0.l<? super MotionEvent, Boolean> lVar) {
        this.onTouchEvent = lVar;
    }

    public final void r(n0 n0Var) {
        n0 n0Var2 = this.requestDisallowInterceptTouchEvent;
        if (n0Var2 != null) {
            n0Var2.b(null);
        }
        this.requestDisallowInterceptTouchEvent = n0Var;
        if (n0Var == null) {
            return;
        }
        n0Var.b(this);
    }
}
