package androidx.compose.foundation.layout;

import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lb4/s0;", "Landroidx/compose/foundation/layout/b0;", "Lv1/m;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lw4/r;", "Lw4/t;", "Lw4/n;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Lv1/m;ZLwn0/p;Ljava/lang/Object;Ljava/lang/String;)V", "o", "()Landroidx/compose/foundation/layout/b0;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/foundation/layout/b0;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lv1/m;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "e", "Ljava/lang/Object;", "f", "Ljava/lang/String;", "g", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WrapContentElement extends s0<b0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v1.m direction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<w4.r, w4.t, w4.n> alignmentCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object align;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$a;", "", "<init>", "()V", "Ld3/c$b;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/WrapContentElement;", "c", "(Ld3/c$b;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Ld3/c$c;", "a", "(Ld3/c$c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Ld3/c;", "b", "(Ld3/c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw4/r;", "size", "Lw4/t;", "<anonymous parameter 1>", "Lw4/n;", "a", "(JLw4/t;)J"}, k = 3, mv = {1, 8, 0})
        static final class C0098a extends p013kotlin.jvm.internal.u implements wn0.p<w4.r, w4.t, w4.n> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d3.c.InterfaceC1212c f4529c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0098a(d3.c.InterfaceC1212c interfaceC1212c) {
                super(2);
                this.f4529c = interfaceC1212c;
            }

            public final long a(long j11, w4.t tVar) {
                return w4.o.a(0, this.f4529c.a(0, w4.r.f(j11)));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ w4.n invoke(w4.r rVar, w4.t tVar) {
                return w4.n.b(a(rVar.getPackedValue(), tVar));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$b */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw4/r;", "size", "Lw4/t;", "layoutDirection", "Lw4/n;", "a", "(JLw4/t;)J"}, k = 3, mv = {1, 8, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.p<w4.r, w4.t, w4.n> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d3.c f4530c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d3.c cVar) {
                super(2);
                this.f4530c = cVar;
            }

            public final long a(long j11, w4.t tVar) {
                return this.f4530c.a(w4.r.INSTANCE.a(), j11, tVar);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ w4.n invoke(w4.r rVar, w4.t tVar) {
                return w4.n.b(a(rVar.getPackedValue(), tVar));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$c */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw4/r;", "size", "Lw4/t;", "layoutDirection", "Lw4/n;", "a", "(JLw4/t;)J"}, k = 3, mv = {1, 8, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.p<w4.r, w4.t, w4.n> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d3.c.b f4531c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d3.c.b bVar) {
                super(2);
                this.f4531c = bVar;
            }

            public final long a(long j11, w4.t tVar) {
                return w4.o.a(this.f4531c.a(0, w4.r.g(j11), tVar), 0);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ w4.n invoke(w4.r rVar, w4.t tVar) {
                return w4.n.b(a(rVar.getPackedValue(), tVar));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WrapContentElement a(d3.c.InterfaceC1212c align, boolean unbounded) {
            return new WrapContentElement(v1.m.Vertical, unbounded, new C0098a(align), align, "wrapContentHeight");
        }

        public final WrapContentElement b(d3.c align, boolean unbounded) {
            return new WrapContentElement(v1.m.Both, unbounded, new b(align), align, "wrapContentSize");
        }

        public final WrapContentElement c(d3.c.b align, boolean unbounded) {
            return new WrapContentElement(v1.m.Horizontal, unbounded, new c(align), align, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(v1.m mVar, boolean z11, wn0.p<? super w4.r, ? super w4.t, w4.n> pVar, Object obj, String str) {
        this.direction = mVar;
        this.unbounded = z11;
        this.alignmentCallback = pVar;
        this.align = obj;
        this.inspectorName = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WrapContentElement.class != other.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && p013kotlin.jvm.internal.s.f(this.align, wrapContentElement.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b0 i() {
        return new b0(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(b0 node) {
        node.z2(this.direction);
        node.A2(this.unbounded);
        node.y2(this.alignmentCallback);
    }
}
