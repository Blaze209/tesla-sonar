package androidx.compose.foundation.layout;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u000b2\u00020\u0001:\u0007\u000b\r\u0010\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H ¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/j;", "", "<init>", "()V", "", "size", "Lw4/t;", "layoutDirection", "Lz3/w0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILw4/t;Lz3/w0;I)I", "b", "(Lz3/w0;)Ljava/lang/Integer;", "", "c", "()Z", "isRelative", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Landroidx/compose/foundation/layout/j$a;", "Landroidx/compose/foundation/layout/j$b;", "Landroidx/compose/foundation/layout/j$d;", "Landroidx/compose/foundation/layout/j$e;", "Landroidx/compose/foundation/layout/j$f;", "Landroidx/compose/foundation/layout/j$g;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j f4588b = b.f4592e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f4589c = f.f4595e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f4590d = d.f4593e;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/j$a;", "Landroidx/compose/foundation/layout/j;", "Landroidx/compose/foundation/layout/c;", "alignmentLineProvider", "<init>", "(Landroidx/compose/foundation/layout/c;)V", "Lz3/w0;", "placeable", "", "b", "(Lz3/w0;)Ljava/lang/Integer;", "size", "Lw4/t;", "layoutDirection", "beforeCrossAxisAlignmentLine", "a", "(ILw4/t;Lz3/w0;I)I", "e", "Landroidx/compose/foundation/layout/c;", "getAlignmentLineProvider", "()Landroidx/compose/foundation/layout/c;", "", "c", "()Z", "isRelative", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final c alignmentLineProvider;

        public a(c cVar) {
            super(null);
            this.alignmentLineProvider = cVar;
        }

        @Override // androidx.compose.foundation.layout.j
        public int a(int size, w4.t layoutDirection, w0 placeable, int beforeCrossAxisAlignmentLine) {
            int iA = this.alignmentLineProvider.a(placeable);
            if (iA == Integer.MIN_VALUE) {
                return 0;
            }
            int i11 = beforeCrossAxisAlignmentLine - iA;
            return layoutDirection == w4.t.Rtl ? size - i11 : i11;
        }

        @Override // androidx.compose.foundation.layout.j
        public Integer b(w0 placeable) {
            return Integer.valueOf(this.alignmentLineProvider.a(placeable));
        }

        @Override // androidx.compose.foundation.layout.j
        public boolean c() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/j$b;", "Landroidx/compose/foundation/layout/j;", "<init>", "()V", "", "size", "Lw4/t;", "layoutDirection", "Lz3/w0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILw4/t;Lz3/w0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f4592e = new b();

        private b() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.j
        public int a(int size, w4.t layoutDirection, w0 placeable, int beforeCrossAxisAlignmentLine) {
            return size / 2;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.j$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/j$c;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/c;", "alignmentLineProvider", "Landroidx/compose/foundation/layout/j;", "a", "(Landroidx/compose/foundation/layout/c;)Landroidx/compose/foundation/layout/j;", "Ld3/c$c;", "vertical", "c", "(Ld3/c$c;)Landroidx/compose/foundation/layout/j;", "Ld3/c$b;", "horizontal", "b", "(Ld3/c$b;)Landroidx/compose/foundation/layout/j;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(c alignmentLineProvider) {
            return new a(alignmentLineProvider);
        }

        public final j b(d3.c.b horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public final j c(d3.c.InterfaceC1212c vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/j$d;", "Landroidx/compose/foundation/layout/j;", "<init>", "()V", "", "size", "Lw4/t;", "layoutDirection", "Lz3/w0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILw4/t;Lz3/w0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f4593e = new d();

        private d() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.j
        public int a(int size, w4.t layoutDirection, w0 placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == w4.t.Ltr) {
                return size;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.j$e, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/j$e;", "Landroidx/compose/foundation/layout/j;", "Ld3/c$b;", "horizontal", "<init>", "(Ld3/c$b;)V", "", "size", "Lw4/t;", "layoutDirection", "Lz3/w0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILw4/t;Lz3/w0;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ld3/c$b;", "getHorizontal", "()Ld3/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class HorizontalCrossAxisAlignment extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final d3.c.b horizontal;

        public HorizontalCrossAxisAlignment(d3.c.b bVar) {
            super(null);
            this.horizontal = bVar;
        }

        @Override // androidx.compose.foundation.layout.j
        public int a(int size, w4.t layoutDirection, w0 placeable, int beforeCrossAxisAlignmentLine) {
            return this.horizontal.a(0, size, layoutDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalCrossAxisAlignment) && p013kotlin.jvm.internal.s.f(this.horizontal, ((HorizontalCrossAxisAlignment) other).horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/j$f;", "Landroidx/compose/foundation/layout/j;", "<init>", "()V", "", "size", "Lw4/t;", "layoutDirection", "Lz3/w0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILw4/t;Lz3/w0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class f extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f4595e = new f();

        private f() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.j
        public int a(int size, w4.t layoutDirection, w0 placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == w4.t.Ltr) {
                return 0;
            }
            return size;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.j$g, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/j$g;", "Landroidx/compose/foundation/layout/j;", "Ld3/c$c;", "vertical", "<init>", "(Ld3/c$c;)V", "", "size", "Lw4/t;", "layoutDirection", "Lz3/w0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILw4/t;Lz3/w0;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ld3/c$c;", "getVertical", "()Ld3/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class VerticalCrossAxisAlignment extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final d3.c.InterfaceC1212c vertical;

        public VerticalCrossAxisAlignment(d3.c.InterfaceC1212c interfaceC1212c) {
            super(null);
            this.vertical = interfaceC1212c;
        }

        @Override // androidx.compose.foundation.layout.j
        public int a(int size, w4.t layoutDirection, w0 placeable, int beforeCrossAxisAlignmentLine) {
            return this.vertical.a(0, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalCrossAxisAlignment) && p013kotlin.jvm.internal.s.f(this.vertical, ((VerticalCrossAxisAlignment) other).vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int size, w4.t layoutDirection, w0 placeable, int beforeCrossAxisAlignmentLine);

    public Integer b(w0 placeable) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private j() {
    }
}
