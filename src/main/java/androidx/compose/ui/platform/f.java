package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/f;", "Landroidx/compose/ui/platform/b;", "<init>", "()V", "", "index", "", "j", "(I)Z", IntegerTokenConverter.CONVERTER_KEY, "current", "", "a", "(I)[I", "b", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static f f5699d;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/f;", "a", "()Landroidx/compose/ui/platform/f;", "instance", "Landroidx/compose/ui/platform/f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            if (f.f5699d == null) {
                f.f5699d = new f(null);
            }
            f fVar = f.f5699d;
            p013kotlin.jvm.internal.s.i(fVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return fVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean i(int index) {
        if (index <= 0 || d().charAt(index - 1) == '\n') {
            return false;
        }
        return index == d().length() || d().charAt(index) == '\n';
    }

    private final boolean j(int index) {
        if (d().charAt(index) != '\n') {
            return index == 0 || d().charAt(index - 1) == '\n';
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int current) {
        int length = d().length();
        if (length <= 0 || current >= length) {
            return null;
        }
        if (current < 0) {
            current = 0;
        }
        while (current < length && d().charAt(current) == '\n' && !j(current)) {
            current++;
        }
        if (current >= length) {
            return null;
        }
        int i11 = current + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return c(current, i11);
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int current) {
        int length = d().length();
        if (length <= 0 || current <= 0) {
            return null;
        }
        if (current > length) {
            current = length;
        }
        while (current > 0 && d().charAt(current - 1) == '\n' && !i(current)) {
            current--;
        }
        if (current <= 0) {
            return null;
        }
        int i11 = current - 1;
        while (i11 > 0 && !j(i11)) {
            i11--;
        }
        return c(i11, current);
    }

    private f() {
    }
}
