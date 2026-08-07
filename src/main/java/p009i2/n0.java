package p009i2;

import a3.j;
import a3.k;
import a3.l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import w4.d;
import wn0.a;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Li2/n0;", "", "Li2/o0;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Li2/o0;Lwn0/l;)V", "Lw4/d;", "f", "()Lw4/d;", "Ljn0/h0;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()F", "Li2/c;", "a", "Li2/c;", "c", "()Li2/c;", "anchoredDraggableState", "Lw4/d;", "getDensity$material_release", "h", "(Lw4/d;)V", "density", "e", "()Z", "isOpen", DateTokenConverter.CONVERTER_KEY, "()Li2/o0;", "currentValue", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p009i2.c<o0> anchoredDraggableState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d density;

    /* JADX INFO: renamed from: i2.n0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li2/n0$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Li2/o0;", "", "confirmStateChange", "La3/j;", "Li2/n0;", "a", "(Lwn0/l;)La3/j;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: i2.n0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li2/n0;", "it", "Li2/o0;", "a", "(La3/l;Li2/n0;)Li2/o0;"}, k = 3, mv = {1, 8, 0})
        static final class C1567a extends u implements p<l, n0, o0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1567a f74766c = new C1567a();

            C1567a() {
                super(2);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o0 invoke(l lVar, n0 n0Var) {
                return n0Var.d();
            }
        }

        /* JADX INFO: renamed from: i2.n0$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li2/o0;", "it", "Li2/n0;", "a", "(Li2/o0;)Li2/n0;"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements wn0.l<o0, n0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.l<o0, Boolean> f74767c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(wn0.l<? super o0, Boolean> lVar) {
                super(1);
                this.f74767c = lVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n0 invoke(o0 o0Var) {
                return new n0(o0Var, this.f74767c);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j<n0, o0> a(wn0.l<? super o0, Boolean> confirmStateChange) {
            return k.a(C1567a.f74766c, new b(confirmStateChange));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<Float, Float> {
        b() {
            super(1);
        }

        public final Float a(float f11) {
            return Float.valueOf(n0.this.f().O1(m0.f74633b));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements a<Float> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n0.this.f().O1(m0.f74634c));
        }
    }

    public n0(o0 o0Var, wn0.l<? super o0, Boolean> lVar) {
        this.anchoredDraggableState = new p009i2.c<>(o0Var, new b(), new c(), m0.f74635d, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d f() {
        d dVar = this.density;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final Object b(Continuation<? super h0> continuation) {
        Object objG = androidx.compose.material.a.g(this.anchoredDraggableState, o0.Closed, BitmapDescriptorFactory.HUE_RED, continuation, 2, null);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : h0.f84049a;
    }

    public final p009i2.c<o0> c() {
        return this.anchoredDraggableState;
    }

    public final o0 d() {
        return this.anchoredDraggableState.s();
    }

    public final boolean e() {
        return d() == o0.Open;
    }

    public final float g() {
        return this.anchoredDraggableState.A();
    }

    public final void h(d dVar) {
        this.density = dVar;
    }
}
