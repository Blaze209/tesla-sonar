package p3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import k3.i3;
import k3.j3;
import k3.q1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.p1;
import p020r2.s3;
import w4.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R/\u00106\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00107R1\u0010>\u001a\u0002092\u0006\u0010/\u001a\u0002098@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u0002098\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010BR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u001a\u0010J\u001a\u00020H8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b?\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lp3/m;", "Lp3/l;", "Lp3/c;", "root", "<init>", "(Lp3/c;)V", "Ljn0/h0;", "h", "()V", "Lm3/f;", "", "alpha", "Lk3/q1;", "colorFilter", IntegerTokenConverter.CONVERTER_KEY, "(Lm3/f;FLk3/q1;)V", "a", "(Lm3/f;)V", "", "toString", "()Ljava/lang/String;", "b", "Lp3/c;", "l", "()Lp3/c;", "c", "Ljava/lang/String;", "getName", "p", "(Ljava/lang/String;)V", "name", "", DateTokenConverter.CONVERTER_KEY, "Z", "isDirty", "Lp3/a;", "e", "Lp3/a;", "cacheDrawScope", "Lkotlin/Function0;", "f", "Lwn0/a;", "getInvalidateCallback$ui_release", "()Lwn0/a;", "o", "(Lwn0/a;)V", "invalidateCallback", "<set-?>", "g", "Lr2/p1;", "k", "()Lk3/q1;", "n", "(Lk3/q1;)V", "intrinsicColorFilter", "Lk3/q1;", "tintFilter", "Lj3/m;", "m", "()J", "q", "(J)V", "viewportSize", "j", "J", "previousDrawSize", Gender.FEMALE, "rootScaleX", "rootScaleY", "Lkotlin/Function1;", "Lwn0/l;", "drawVectorBlock", "Lk3/j3;", "()I", "cacheBitmapConfig", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p3.c root;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p3.a cacheDrawScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> invalidateCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p1 intrinsicColorFilter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private q1 tintFilter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p1 viewportSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long previousDrawSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rootScaleX;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rootScaleY;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<m3.f, h0> drawVectorBlock;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/l;", "it", "Ljn0/h0;", "a", "(Lp3/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<l, h0> {
        a() {
            super(1);
        }

        public final void a(l lVar) {
            m.this.h();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(l lVar) {
            a(lVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<m3.f, h0> {
        b() {
            super(1);
        }

        public final void a(m3.f fVar) {
            p3.c root = m.this.getRoot();
            m mVar = m.this;
            float f11 = mVar.rootScaleX;
            float f12 = mVar.rootScaleY;
            long jC = j3.g.INSTANCE.c();
            m3.d drawContext = fVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.a().u();
            try {
                drawContext.getTransform().f(f11, f12, jC);
                root.a(fVar);
            } finally {
                drawContext.a().o();
                drawContext.f(jB);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    public m(p3.c cVar) {
        super(null);
        this.root = cVar;
        cVar.d(new a());
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new p3.a();
        this.invalidateCallback = c.f101026c;
        this.intrinsicColorFilter = s3.d(null, null, 2, null);
        j3.m.Companion companion = j3.m.INSTANCE;
        this.viewportSize = s3.d(j3.m.c(companion.b()), null, 2, null);
        this.previousDrawSize = companion.a();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    @Override // p3.l
    public void a(m3.f fVar) {
        i(fVar, 1.0f, null);
    }

    public final void i(m3.f fVar, float f11, q1 q1Var) {
        m3.f fVar2;
        int iA = (this.root.getIsTintable() && this.root.getTintColor() != 16 && o.f(k()) && o.f(q1Var)) ? j3.INSTANCE.a() : j3.INSTANCE.b();
        if (!this.isDirty && j3.m.h(this.previousDrawSize, fVar.b()) && j3.i(iA, j())) {
            fVar2 = fVar;
        } else {
            this.tintFilter = j3.i(iA, j3.INSTANCE.a()) ? q1.Companion.b(q1.INSTANCE, this.root.getTintColor(), 0, 2, null) : null;
            this.rootScaleX = j3.m.k(fVar.b()) / j3.m.k(m());
            this.rootScaleY = j3.m.i(fVar.b()) / j3.m.i(m());
            fVar2 = fVar;
            this.cacheDrawScope.b(iA, s.a((int) Math.ceil(j3.m.k(fVar.b())), (int) Math.ceil(j3.m.i(fVar.b()))), fVar2, fVar.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = fVar2.b();
        }
        if (q1Var == null) {
            q1Var = k() != null ? k() : this.tintFilter;
        }
        this.cacheDrawScope.c(fVar2, f11, q1Var);
    }

    public final int j() {
        i3 mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.b() : j3.INSTANCE.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q1 k() {
        return (q1) this.intrinsicColorFilter.getValue();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final p3.c getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long m() {
        return ((j3.m) this.viewportSize.getValue()).getPackedValue();
    }

    public final void n(q1 q1Var) {
        this.intrinsicColorFilter.setValue(q1Var);
    }

    public final void o(wn0.a<h0> aVar) {
        this.invalidateCallback = aVar;
    }

    public final void p(String str) {
        this.name = str;
    }

    public final void q(long j11) {
        this.viewportSize.setValue(j3.m.c(j11));
    }

    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + j3.m.k(m()) + "\n\tviewportHeight: " + j3.m.i(m()) + "\n";
        p013kotlin.jvm.internal.s.j(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f101026c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }

        public final void b() {
        }
    }
}
