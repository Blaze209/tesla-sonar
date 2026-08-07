package androidx.compose.foundation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p020r2.e3;
import p020r2.m1;
import p020r2.n3;
import p020r2.y3;
import p021s1.C4788y;
import p021s1.t;
import p021s1.x;
import q1.h0;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R+\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b\"\u0004\b\u001e\u0010\u0005R\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b!\u00101R\u001b\u00104\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b(\u00101R$\u00108\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u0005R\u0014\u00109\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u00101¨\u0006;"}, d2 = {"Landroidx/compose/foundation/o;", "Ls1/x;", "", "initial", "<init>", "(I)V", "Lq1/h0;", "scrollPriority", "Lkotlin/Function2;", "Ls1/u;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "b", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", DateTokenConverter.CONVERTER_KEY, "(F)F", "value", "n", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "a", "Lr2/m1;", "m", "()I", "p", "getViewportSize", "q", "viewportSize", "Lu1/l;", "c", "Lu1/l;", "k", "()Lu1/l;", "internalInteractionSource", "Lr2/m1;", "_maxValueState", "e", Gender.FEMALE, "accumulator", "f", "Ls1/x;", "scrollableState", "", "g", "Lr2/y3;", "()Z", "canScrollForward", "h", "canScrollBackward", "newMax", "l", "o", "maxValue", "isScrollInProgress", IntegerTokenConverter.CONVERTER_KEY, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o implements x {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a3.j<o, ?> f4843j = a3.k.a(a.f4852c, b.f4853c);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m1 value;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m1 viewportSize = e3.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u1.l internalInteractionSource = u1.k.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private m1 _maxValueState = e3.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final x scrollableState = C4788y.a(new f());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final y3 canScrollForward = n3.e(new e());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y3 canScrollBackward = n3.e(new d());

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Landroidx/compose/foundation/o;", "it", "", "a", "(La3/l;Landroidx/compose/foundation/o;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<a3.l, o, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4852c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(a3.l lVar, o oVar) {
            return Integer.valueOf(oVar.m());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/o;", "a", "(I)Landroidx/compose/foundation/o;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<Integer, o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f4853c = new b();

        b() {
            super(1);
        }

        public final o a(int i11) {
            return new o(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ o invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.o$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/o$c;", "", "<init>", "()V", "La3/j;", "Landroidx/compose/foundation/o;", "Saver", "La3/j;", "a", "()La3/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a3.j<o, ?> a() {
            return o.f4843j;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<Boolean> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.m() > 0);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<Boolean> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.m() < o.this.l());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<Float, Float> {
        f() {
            super(1);
        }

        public final Float a(float f11) {
            float fM = o.this.m() + f11 + o.this.accumulator;
            float fM2 = bo0.n.m(fM, BitmapDescriptorFactory.HUE_RED, o.this.l());
            boolean z11 = fM == fM2;
            float fM3 = fM2 - o.this.m();
            int iRound = Math.round(fM3);
            o oVar = o.this;
            oVar.p(oVar.m() + iRound);
            o.this.accumulator = fM3 - iRound;
            if (!z11) {
                f11 = fM3;
            }
            return Float.valueOf(f11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    public o(int i11) {
        this.value = e3.a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(int i11) {
        this.value.a(i11);
    }

    @Override // p021s1.x
    public boolean a() {
        return this.scrollableState.a();
    }

    @Override // p021s1.x
    public Object b(h0 h0Var, p<? super p021s1.u, ? super Continuation<? super jn0.h0>, ? extends Object> pVar, Continuation<? super jn0.h0> continuation) {
        Object objB = this.scrollableState.b(h0Var, pVar, continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.h0.f84049a;
    }

    @Override // p021s1.x
    public boolean c() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // p021s1.x
    public float d(float delta) {
        return this.scrollableState.d(delta);
    }

    @Override // p021s1.x
    public boolean e() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final u1.l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int l() {
        return this._maxValueState.b();
    }

    public final int m() {
        return this.value.b();
    }

    public final Object n(int i11, Continuation<? super Float> continuation) {
        return t.b(this, i11 - m(), continuation);
    }

    public final void o(int i11) {
        this._maxValueState.a(i11);
        androidx.compose.runtime.snapshots.g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        wn0.l<Object, jn0.h0> lVarH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
        try {
            if (m() > i11) {
                p(i11);
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
        } finally {
            companion.m(gVarD, gVarF, lVarH);
        }
    }

    public final void q(int i11) {
        this.viewportSize.a(i11);
    }
}
