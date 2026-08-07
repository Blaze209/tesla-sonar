package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.text.BreakIterator;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/c;", "Landroidx/compose/ui/platform/b;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "", "text", "e", "(Ljava/lang/String;)V", "", "current", "", "a", "(I)[I", "b", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f5662e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static c f5663f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BreakIterator impl;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/c$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/c;", "a", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/c;", "instance", "Landroidx/compose/ui/platform/c;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Locale locale) {
            if (c.f5663f == null) {
                c.f5663f = new c(locale, null);
            }
            c cVar = c.f5663f;
            p013kotlin.jvm.internal.s.i(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return cVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.impl = BreakIterator.getCharacterInstance(locale);
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
        do {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                p013kotlin.jvm.internal.s.B("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(current)) {
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    p013kotlin.jvm.internal.s.B("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(current);
                if (iFollowing == -1) {
                    return null;
                }
                return c(current, iFollowing);
            }
            BreakIterator breakIterator3 = this.impl;
            if (breakIterator3 == null) {
                p013kotlin.jvm.internal.s.B("impl");
                breakIterator3 = null;
            }
            current = breakIterator3.following(current);
        } while (current != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                p013kotlin.jvm.internal.s.B("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(current)) {
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    p013kotlin.jvm.internal.s.B("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(current);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, current);
            }
            BreakIterator breakIterator3 = this.impl;
            if (breakIterator3 == null) {
                p013kotlin.jvm.internal.s.B("impl");
                breakIterator3 = null;
            }
            current = breakIterator3.preceding(current);
        } while (current != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String text) {
        super.e(text);
        BreakIterator breakIterator = this.impl;
        if (breakIterator == null) {
            p013kotlin.jvm.internal.s.B("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }

    private c(Locale locale) {
        i(locale);
    }
}
