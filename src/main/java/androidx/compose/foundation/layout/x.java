package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a&\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\n\u001a*\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a>\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001e\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u001e\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0004\u001a>\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001a\u001d\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u0004\u001a\u001d\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010\u0004\u001a\u001d\u0010 \u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b \u0010\u0004\u001a'\u0010%\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&\u001a'\u0010(\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020'2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b(\u0010)\u001a'\u0010+\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020*2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b+\u0010,\u001a*\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010\n\"\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/\"\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010/\"\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00108\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106\"\u0014\u0010:\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106\"\u0014\u0010;\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106\"\u0014\u0010=\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00106\"\u0014\u0010>\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/ui/d;", "Lw4/h;", Snapshot.WIDTH, "v", "(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;", Snapshot.HEIGHT, IntegerTokenConverter.CONVERTER_KEY, "size", "q", "s", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "Lw4/k;", "r", "(Landroidx/compose/ui/d;J)Landroidx/compose/ui/d;", "min", "max", "w", "j", "minWidth", "minHeight", "maxWidth", "maxHeight", "t", "(Landroidx/compose/ui/d;FFFF)Landroidx/compose/ui/d;", "p", "l", "m", "n", "", "fraction", "g", "c", "e", "Ld3/c$b;", "align", "", "unbounded", "C", "(Landroidx/compose/ui/d;Ld3/c$b;Z)Landroidx/compose/ui/d;", "Ld3/c$c;", "y", "(Landroidx/compose/ui/d;Ld3/c$c;Z)Landroidx/compose/ui/d;", "Ld3/c;", "A", "(Landroidx/compose/ui/d;Ld3/c;Z)Landroidx/compose/ui/d;", "a", "Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "b", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "WrapContentWidthStart", "f", "WrapContentHeightCenter", "WrapContentHeightTop", "h", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FillElement f4643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FillElement f4644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FillElement f4645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WrapContentElement f4646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final WrapContentElement f4647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final WrapContentElement f4648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final WrapContentElement f4649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final WrapContentElement f4650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final WrapContentElement f4651i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f11) {
            super(1);
            this.f4652c = f11;
        }

        public final void a(q1 q1Var) {
            q1Var.b(Snapshot.HEIGHT);
            q1Var.c(w4.h.d(this.f4652c));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4654d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f11, float f12) {
            super(1);
            this.f4653c = f11;
            this.f4654d = f12;
        }

        public final void a(q1 q1Var) {
            q1Var.b("heightIn");
            q1Var.getProperties().a("min", w4.h.d(this.f4653c));
            q1Var.getProperties().a("max", w4.h.d(this.f4654d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4655c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f11) {
            super(1);
            this.f4655c = f11;
        }

        public final void a(q1 q1Var) {
            q1Var.b("requiredHeight");
            q1Var.c(w4.h.d(this.f4655c));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4656c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f11) {
            super(1);
            this.f4656c = f11;
        }

        public final void a(q1 q1Var) {
            q1Var.b("requiredSize");
            q1Var.c(w4.h.d(this.f4656c));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f4660f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f11, float f12, float f13, float f14) {
            super(1);
            this.f4657c = f11;
            this.f4658d = f12;
            this.f4659e = f13;
            this.f4660f = f14;
        }

        public final void a(q1 q1Var) {
            q1Var.b("requiredSizeIn");
            q1Var.getProperties().a("minWidth", w4.h.d(this.f4657c));
            q1Var.getProperties().a("minHeight", w4.h.d(this.f4658d));
            q1Var.getProperties().a("maxWidth", w4.h.d(this.f4659e));
            q1Var.getProperties().a("maxHeight", w4.h.d(this.f4660f));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class f extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f11) {
            super(1);
            this.f4661c = f11;
        }

        public final void a(q1 q1Var) {
            q1Var.b("requiredWidth");
            q1Var.c(w4.h.d(this.f4661c));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class g extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f11) {
            super(1);
            this.f4662c = f11;
        }

        public final void a(q1 q1Var) {
            q1Var.b("size");
            q1Var.c(w4.h.d(this.f4662c));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class h extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4664d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f11, float f12) {
            super(1);
            this.f4663c = f11;
            this.f4664d = f12;
        }

        public final void a(q1 q1Var) {
            q1Var.b("size");
            q1Var.getProperties().a(Snapshot.WIDTH, w4.h.d(this.f4663c));
            q1Var.getProperties().a(Snapshot.HEIGHT, w4.h.d(this.f4664d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class i extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f4668f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f11, float f12, float f13, float f14) {
            super(1);
            this.f4665c = f11;
            this.f4666d = f12;
            this.f4667e = f13;
            this.f4668f = f14;
        }

        public final void a(q1 q1Var) {
            q1Var.b("sizeIn");
            q1Var.getProperties().a("minWidth", w4.h.d(this.f4665c));
            q1Var.getProperties().a("minHeight", w4.h.d(this.f4666d));
            q1Var.getProperties().a("maxWidth", w4.h.d(this.f4667e));
            q1Var.getProperties().a("maxHeight", w4.h.d(this.f4668f));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class j extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f11) {
            super(1);
            this.f4669c = f11;
        }

        public final void a(q1 q1Var) {
            q1Var.b(Snapshot.WIDTH);
            q1Var.c(w4.h.d(this.f4669c));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class k extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4671d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f11, float f12) {
            super(1);
            this.f4670c = f11;
            this.f4671d = f12;
        }

        public final void a(q1 q1Var) {
            q1Var.b("widthIn");
            q1Var.getProperties().a("min", w4.h.d(this.f4670c));
            q1Var.getProperties().a("max", w4.h.d(this.f4671d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    static {
        FillElement.Companion aVar = FillElement.INSTANCE;
        f4643a = aVar.c(1.0f);
        f4644b = aVar.a(1.0f);
        f4645c = aVar.b(1.0f);
        WrapContentElement.Companion aVar2 = WrapContentElement.INSTANCE;
        d3.c.Companion companion = d3.c.INSTANCE;
        f4646d = aVar2.c(companion.g(), false);
        f4647e = aVar2.c(companion.k(), false);
        f4648f = aVar2.a(companion.i(), false);
        f4649g = aVar2.a(companion.l(), false);
        f4650h = aVar2.b(companion.e(), false);
        f4651i = aVar2.b(companion.o(), false);
    }

    public static final androidx.compose.ui.d A(androidx.compose.ui.d dVar, d3.c cVar, boolean z11) {
        WrapContentElement wrapContentElementB;
        d3.c.Companion companion = d3.c.INSTANCE;
        if (!p013kotlin.jvm.internal.s.f(cVar, companion.e()) || z11) {
            wrapContentElementB = (!p013kotlin.jvm.internal.s.f(cVar, companion.o()) || z11) ? WrapContentElement.INSTANCE.b(cVar, z11) : f4651i;
        } else {
            wrapContentElementB = f4650h;
        }
        return dVar.g(wrapContentElementB);
    }

    public static /* synthetic */ androidx.compose.ui.d B(androidx.compose.ui.d dVar, d3.c cVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = d3.c.INSTANCE.e();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return A(dVar, cVar, z11);
    }

    public static final androidx.compose.ui.d C(androidx.compose.ui.d dVar, d3.c.b bVar, boolean z11) {
        WrapContentElement wrapContentElementC;
        d3.c.Companion companion = d3.c.INSTANCE;
        if (!p013kotlin.jvm.internal.s.f(bVar, companion.g()) || z11) {
            wrapContentElementC = (!p013kotlin.jvm.internal.s.f(bVar, companion.k()) || z11) ? WrapContentElement.INSTANCE.c(bVar, z11) : f4647e;
        } else {
            wrapContentElementC = f4646d;
        }
        return dVar.g(wrapContentElementC);
    }

    public static /* synthetic */ androidx.compose.ui.d D(androidx.compose.ui.d dVar, d3.c.b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = d3.c.INSTANCE.g();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return C(dVar, bVar, z11);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f11, float f12) {
        return dVar.g(new UnspecifiedConstraintsElement(f11, f12, null));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.INSTANCE.c();
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.INSTANCE.c();
        }
        return a(dVar, f11, f12);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(f11 == 1.0f ? f4644b : FillElement.INSTANCE.a(f11));
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return c(dVar, f11);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(f11 == 1.0f ? f4645c : FillElement.INSTANCE.b(f11));
    }

    public static /* synthetic */ androidx.compose.ui.d f(androidx.compose.ui.d dVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return e(dVar, f11);
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(f11 == 1.0f ? f4643a : FillElement.INSTANCE.c(f11));
    }

    public static /* synthetic */ androidx.compose.ui.d h(androidx.compose.ui.d dVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return g(dVar, f11);
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(new SizeElement(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f11, true, o1.b() ? new a(f11) : o1.a(), 5, null));
    }

    public static final androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f11, float f12) {
        return dVar.g(new SizeElement(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f12, true, o1.b() ? new b(f11, f12) : o1.a(), 5, null));
    }

    public static /* synthetic */ androidx.compose.ui.d k(androidx.compose.ui.d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.INSTANCE.c();
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.INSTANCE.c();
        }
        return j(dVar, f11, f12);
    }

    public static final androidx.compose.ui.d l(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(new SizeElement(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f11, false, o1.b() ? new c(f11) : o1.a(), 5, null));
    }

    public static final androidx.compose.ui.d m(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(new SizeElement(f11, f11, f11, f11, false, o1.b() ? new d(f11) : o1.a(), null));
    }

    public static final androidx.compose.ui.d n(androidx.compose.ui.d dVar, float f11, float f12, float f13, float f14) {
        return dVar.g(new SizeElement(f11, f12, f13, f14, false, o1.b() ? new e(f11, f12, f13, f14) : o1.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.d o(androidx.compose.ui.d dVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.INSTANCE.c();
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.INSTANCE.c();
        }
        if ((i11 & 4) != 0) {
            f13 = w4.h.INSTANCE.c();
        }
        if ((i11 & 8) != 0) {
            f14 = w4.h.INSTANCE.c();
        }
        return n(dVar, f11, f12, f13, f14);
    }

    public static final androidx.compose.ui.d p(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(new SizeElement(f11, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, false, o1.b() ? new f(f11) : o1.a(), 10, null));
    }

    public static final androidx.compose.ui.d q(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(new SizeElement(f11, f11, f11, f11, true, o1.b() ? new g(f11) : o1.a(), null));
    }

    public static final androidx.compose.ui.d r(androidx.compose.ui.d dVar, long j11) {
        return s(dVar, w4.k.h(j11), w4.k.g(j11));
    }

    public static final androidx.compose.ui.d s(androidx.compose.ui.d dVar, float f11, float f12) {
        return dVar.g(new SizeElement(f11, f12, f11, f12, true, o1.b() ? new h(f11, f12) : o1.a(), null));
    }

    public static final androidx.compose.ui.d t(androidx.compose.ui.d dVar, float f11, float f12, float f13, float f14) {
        return dVar.g(new SizeElement(f11, f12, f13, f14, true, o1.b() ? new i(f11, f12, f13, f14) : o1.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.d u(androidx.compose.ui.d dVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.INSTANCE.c();
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.INSTANCE.c();
        }
        if ((i11 & 4) != 0) {
            f13 = w4.h.INSTANCE.c();
        }
        if ((i11 & 8) != 0) {
            f14 = w4.h.INSTANCE.c();
        }
        return t(dVar, f11, f12, f13, f14);
    }

    public static final androidx.compose.ui.d v(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(new SizeElement(f11, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, true, o1.b() ? new j(f11) : o1.a(), 10, null));
    }

    public static final androidx.compose.ui.d w(androidx.compose.ui.d dVar, float f11, float f12) {
        return dVar.g(new SizeElement(f11, BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, true, o1.b() ? new k(f11, f12) : o1.a(), 10, null));
    }

    public static /* synthetic */ androidx.compose.ui.d x(androidx.compose.ui.d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.INSTANCE.c();
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.INSTANCE.c();
        }
        return w(dVar, f11, f12);
    }

    public static final androidx.compose.ui.d y(androidx.compose.ui.d dVar, d3.c.InterfaceC1212c interfaceC1212c, boolean z11) {
        WrapContentElement wrapContentElementA;
        d3.c.Companion companion = d3.c.INSTANCE;
        if (!p013kotlin.jvm.internal.s.f(interfaceC1212c, companion.i()) || z11) {
            wrapContentElementA = (!p013kotlin.jvm.internal.s.f(interfaceC1212c, companion.l()) || z11) ? WrapContentElement.INSTANCE.a(interfaceC1212c, z11) : f4649g;
        } else {
            wrapContentElementA = f4648f;
        }
        return dVar.g(wrapContentElementA);
    }

    public static /* synthetic */ androidx.compose.ui.d z(androidx.compose.ui.d dVar, d3.c.InterfaceC1212c interfaceC1212c, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC1212c = d3.c.INSTANCE.i();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return y(dVar, interfaceC1212c, z11);
    }
}
