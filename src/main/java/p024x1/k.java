package p024x1;

import a4.j;
import a4.l;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.n0;
import p021s1.p;
import w4.t;
import z3.h;
import z3.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 12\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001 B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0007*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011J8\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0014\u001a\u00020\u000f2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Lx1/k;", "La4/j;", "Lz3/h;", "Lx1/m;", "state", "Lx1/j;", "beyondBoundsInfo", "", "reverseLayout", "Lw4/t;", "layoutDirection", "Ls1/p;", "orientation", "<init>", "(Lx1/m;Lx1/j;ZLw4/t;Ls1/p;)V", "Lz3/h$b;", "s", "(I)Z", "Lx1/j$a;", "currentInterval", "direction", "o", "(Lx1/j$a;I)Lx1/j$a;", "r", "(Lx1/j$a;I)Z", "t", "T", "Lkotlin/Function1;", "Lz3/h$a;", "block", IntegerTokenConverter.CONVERTER_KEY, "(ILwn0/l;)Ljava/lang/Object;", "b", "Lx1/m;", "c", "Lx1/j;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lw4/t;", "f", "Ls1/p;", "La4/l;", "getKey", "()La4/l;", Action.KEY_ATTRIBUTE, "p", "()Lz3/h;", "value", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k implements j<h>, h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f122621h = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j beyondBoundsInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p orientation;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"x1/k$a", "Lz3/h$a;", "", "a", "Z", "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMoreContent;

        a() {
        }

        @Override // z3.h.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122628a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122628a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"x1/k$d", "Lz3/h$a;", "", "a", "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements h.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0<j.Interval> f122630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f122631c;

        d(n0<j.Interval> n0Var, int i11) {
            this.f122630b = n0Var;
            this.f122631c = i11;
        }

        @Override // z3.h.a
        /* JADX INFO: renamed from: a */
        public boolean getHasMoreContent() {
            return k.this.r(this.f122630b.f86529a, this.f122631c);
        }
    }

    public k(m mVar, j jVar, boolean z11, t tVar, p pVar) {
        this.state = mVar;
        this.beyondBoundsInfo = jVar;
        this.reverseLayout = z11;
        this.layoutDirection = tVar;
        this.orientation = pVar;
    }

    private final j.Interval o(j.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        if (s(direction)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.a(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(j.Interval interval, int i11) {
        if (t(i11)) {
            return false;
        }
        if (s(i11)) {
            return interval.getEnd() < this.state.a() - 1;
        }
        return interval.getStart() > 0;
    }

    private final boolean s(int i11) {
        h.b.Companion companion = h.b.INSTANCE;
        if (h.b.h(i11, companion.c())) {
            return false;
        }
        if (h.b.h(i11, companion.b())) {
            return true;
        }
        if (h.b.h(i11, companion.a())) {
            return this.reverseLayout;
        }
        if (h.b.h(i11, companion.d())) {
            return !this.reverseLayout;
        }
        if (h.b.h(i11, companion.e())) {
            int i12 = c.f122628a[this.layoutDirection.ordinal()];
            if (i12 == 1) {
                return this.reverseLayout;
            }
            if (i12 == 2) {
                return !this.reverseLayout;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!h.b.h(i11, companion.f())) {
            l.c();
            throw new KotlinNothingValueException();
        }
        int i13 = c.f122628a[this.layoutDirection.ordinal()];
        if (i13 == 1) {
            return !this.reverseLayout;
        }
        if (i13 == 2) {
            return this.reverseLayout;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean t(int i11) {
        h.b.Companion companion = h.b.INSTANCE;
        if (h.b.h(i11, companion.a()) ? true : h.b.h(i11, companion.d())) {
            return this.orientation == p.Horizontal;
        }
        if (h.b.h(i11, companion.e()) ? true : h.b.h(i11, companion.f())) {
            return this.orientation == p.Vertical;
        }
        if (h.b.h(i11, companion.c()) ? true : h.b.h(i11, companion.b())) {
            return false;
        }
        l.c();
        throw new KotlinNothingValueException();
    }

    @Override // a4.j
    public l<h> getKey() {
        return i.a();
    }

    @Override // z3.h
    public <T> T i(int direction, wn0.l<? super h.a, ? extends T> block) {
        if (this.state.a() <= 0 || !this.state.d()) {
            return block.invoke(f122621h);
        }
        int iE = s(direction) ? this.state.e() : this.state.c();
        n0 n0Var = new n0();
        n0Var.f86529a = (T) this.beyondBoundsInfo.a(iE, iE);
        T tInvoke = null;
        while (tInvoke == null && r((j.Interval) n0Var.f86529a, direction)) {
            T t11 = (T) o((j.Interval) n0Var.f86529a, direction);
            this.beyondBoundsInfo.e((j.Interval) n0Var.f86529a);
            n0Var.f86529a = t11;
            this.state.b();
            tInvoke = block.invoke(new d(n0Var, direction));
        }
        this.beyondBoundsInfo.e((j.Interval) n0Var.f86529a);
        this.state.b();
        return tInvoke;
    }

    @Override // a4.j
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public h getValue() {
        return this;
    }
}
